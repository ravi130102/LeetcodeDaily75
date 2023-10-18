class Solution {
    public int minimumTime(int n, int[][] relations, int[] time) {
        int[] indegrees = new int[n];
        List<List<Integer>> adjList = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
            adjList.add(new ArrayList<>());
        }
        
        for(int i=0; i< relations.length; i++) {
            int[] curr = relations[i];
            
            adjList.get(curr[0]-1).add(curr[1]-1);
            indegrees[curr[1]-1]++;
        }
        
        Queue<Integer> queue = new LinkedList<>();
        int[] maxTimes = new int[n];
        
        for(int i=0; i<n; i++) {
            if(indegrees[i]==0) queue.offer(i);
            maxTimes[i] = time[i];
        }
        
        int duration = 0;
        
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            List<Integer> nextCourses = adjList.get(curr);
            for(int nextCourse: nextCourses) {
                indegrees[nextCourse]--;
                maxTimes[nextCourse] = Math.max(maxTimes[nextCourse], maxTimes[curr]+time[nextCourse]);
                if(indegrees[nextCourse] == 0) {
                    queue.offer(nextCourse);
                }
            }
            duration = Math.max(duration, maxTimes[curr]);
        }
        
        return duration;
    }
}