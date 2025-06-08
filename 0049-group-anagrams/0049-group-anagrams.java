class Solution {
   /* public List<List<String>> groupAnagrams(String[] strs) {
      //  Time	O(m × n log n)
      //   Space	O(m × n)
        
       Map<String,List<String>> res  = new HashMap<>();

       for(String s : strs)
       {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            res.putIfAbsent(sortedStr, new ArrayList<>());
            res.get(sortedStr).add(s);
       }

       return new ArrayList<>(res.values());

    }
   */ 

    public List<List<String>> groupAnagrams(String strs[])
    {
        Map <String, List<String>> res = new HashMap<>();
        
        // ✅ Time Complexity: O(m × n) – correct.
        // ✅ Space Complexity:
        // O(m) extra space for keys and HashMap
        // O(m × n) space for output

        for(String s : strs)
        {
            char[] charArray = s.toCharArray();
            int count[] = new int[26];

            for(char c: charArray)
            {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count); //  key eg: "[1, 2, 0, 0, 0]"
            res.putIfAbsent(key,new ArrayList<>());
            res.get(key).add(s);
        }

        return new ArrayList<>(res.values());
    }
}