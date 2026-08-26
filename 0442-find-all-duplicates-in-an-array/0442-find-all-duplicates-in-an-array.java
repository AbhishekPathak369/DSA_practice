class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> li = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums){
hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(Integer key : hm.keySet()){
            if(hm.get(key) >1){
                li.add(key);
            }
        }
        return li;
    }
}