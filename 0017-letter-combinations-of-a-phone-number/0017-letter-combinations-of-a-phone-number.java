class Solution {
    public List<String> letterCombinations(String digits) {
        String [] arr = {"" , "", "abc" ,"def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> list = new ArrayList<>();
        if(digits.equals(""))return list;
        recursion(arr,list,digits,"");
        System.out.println(digits);
        return list;
    }
    public void  recursion(String [] arr,List<String> list , String up,String p){
        if(up.equals("")){
            list.add(p);
            return;
        }
        int firstchar = up.charAt(0)-'0';
        int len = arr[firstchar].length();
        up= up.substring(1);
        for(int i = 0 ; i<len ; i++){
            recursion(arr,list,up,p+arr[firstchar].charAt(i));
        }
    }
}