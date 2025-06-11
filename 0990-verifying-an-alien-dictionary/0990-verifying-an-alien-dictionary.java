
import java.util.*;
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> alpha = new HashMap<>();

        for(int i = 0; i<order.length(); i++)
        {
            alpha.put(order.charAt(i), i);
        }

        for(int i = 1; i<words.length; i++)
        {
            String a = words[i-1];
            String b = words[i];

            for(int j = 0; j<a.length(); j++)
            {
                if(j == b.length())
                {
                    return false;

                }

                char achar = a.charAt(j);
                char bchar = b.charAt(j);

                if(alpha.get(achar) < alpha.get(bchar))
                {
                    break;
                }
                else if(alpha.get(achar) > alpha.get(bchar))
                {
                    return false;
                }
            }
            
        }
        return true;
    }
}

// As this is an Easy question, this method works, but with a time complexity of O(N * M * P) where N is the length of W, M is the average length of each word in W, and P is the length of O.

// Rather than repetitively finding the position of a character in O, however, we can create a lookup table of indexes from O (alpha) at a time complexity of O(P) and turn every position lookup into a simple O(1) operation. That changes the overall time complexity to O(N * M + P).