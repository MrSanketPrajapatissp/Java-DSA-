import java.util.*;
class TimeMap {

    // space : O(m * n) time: 
    // get - TC - O(logn)
    // set - TC - O(1)

    class Pair{
        int timestamp;
        String value;

        public Pair(int timestamp, String value)
        {
            this.timestamp = timestamp;
            this.value = value;
        }
    }
    Map <String, List<Pair>> map;

    public TimeMap() {
          map = new HashMap<>();  
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
        {
            return "";
        }
        List<Pair> list = map.get(key);
        int low = 0;
        int high = list.size() - 1;
        String res = "";

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            if(list.get(mid).timestamp <= timestamp)
            {
                res = list.get(mid).value;
                low = mid + 1;        
            }else
            {
                high = mid - 1;
            }
        }

        return res;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */