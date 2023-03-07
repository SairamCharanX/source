public int bigDiff(int[] nums) {
        List<Integer> copy = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
        copy.add(nums[i]);
        }
        Collections.sort(copy);
        return (Math.abs(copy.get(0) - copy.get(copy.size()-1)));
        }
