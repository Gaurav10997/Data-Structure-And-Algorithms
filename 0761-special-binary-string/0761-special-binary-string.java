class Solution {
    public String makeLargestSpecial(String S) {

            int balance = 0, l = 0;
            List<String> subResults = new LinkedList<>();
            for (int r = 0; r < S.length(); r++) {
                if (S.charAt(r) == '0') {
                    balance--;
                }
                else {
                    balance++;
                }
                if (balance == 0) {
                    subResults.add("1" + makeLargestSpecial(S.substring(l + 1, r)) + "0");
                    l = r + 1;
                }
            }
            Collections.sort(subResults, Collections.reverseOrder());

            return String.join("", subResults);
        }
}