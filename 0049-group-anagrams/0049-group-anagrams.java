class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
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
}