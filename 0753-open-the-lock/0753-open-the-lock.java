import java.util.*;

class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        
        if (dead.contains("0000")) return -1;

        queue.offer("0000");
        visited.add("0000");
        int moves = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (int k = 0; k < size; k++) {
                String curr = queue.poll();
                if (curr.equals(target)) return moves;

                for (String next : getNextStates(curr)) {
                    if (!visited.contains(next) && !dead.contains(next)) {
                        visited.add(next);
                        queue.offer(next);
                    }
                }
            }
            moves++;
        }

        return -1;
    }

    private List<String> getNextStates(String s) {
        List<String> res = new ArrayList<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < 4; i++) {
            char c = chars[i];

            // Turn wheel one step up
            chars[i] = c == '9' ? '0' : (char)(c + 1);
        

            res.add(new String(chars));
            
            

            // Turn wheel one step down
            chars[i] = c == '0' ? '9' : (char)(c - 1);
          
            

            res.add(new String(chars));

            // Restore original char
            chars[i] = c;
        }
        return res;
    }
}