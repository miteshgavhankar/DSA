class Solution {
    public void reverseString(List<Character> s) {
        //your code goes here
        int n = s.size();
        List<Character> temp = new ArrayList<>(n);
        
        for(int i=n-1;i>=0;i--){
            temp.add(s.get(i));
        }

        for(int i=0;i<n;i++){
            s.set(i, temp.get(i));
        }
    }
}
