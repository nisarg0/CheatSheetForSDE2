package JavaCheatSheet;

import java.util.*;

class Graph {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> G = new HashMap<>();
        int[] inDegree = new int[numCourses];
    
        for (int[] pair : prerequisites) {
            int from = pair[0], to = pair[1];
            G.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
            inDegree[to]++;
        }
    
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                q.offer(i);
            }
        }
    
        while (!q.isEmpty()) {
            int currentCourse = q.poll();
            numCourses--;
    
            if (numCourses == 0) {
                return true;
            }
    
            for (int nextCourse : G.getOrDefault(currentCourse, Collections.emptyList())) {
                inDegree[nextCourse]--;
                if (inDegree[nextCourse] == 0) {
                    q.offer(nextCourse);
                }
            }
        }
    
        return numCourses == 0;
    }
}

public class DSA {
    
}
