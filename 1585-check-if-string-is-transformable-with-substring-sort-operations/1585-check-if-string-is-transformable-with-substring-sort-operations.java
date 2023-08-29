class Solution {
      public boolean isTransformable(String s, String t) {
        // Step 1: Create an empty queue for each digit from 0 to 9.
        List<Queue<Integer>> idx = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            idx.add(new LinkedList<Integer>());
        }
        
        // Step 2: Traverse the string `s` and for each character, push its index into its corresponding queue.
        for (int i = 0; i < s.length(); ++i) {
            idx.get(s.charAt(i) - '0').offer(i);
        }
        
        // Step 3: Traverse the string `t` and for each character, check if its corresponding queue is empty or not.
        for (int i = 0; i < t.length(); ++i) {
            int digit = t.charAt(i) - '0';
            if (idx.get(digit).isEmpty()) {
                return false;
            }
            
            // Step 4: For all digits smaller than the current digit, check if there is any index in their queue such that the index is smaller than `idx`.
            for (int j = 0; j < digit; ++j) {
                if (!idx.get(j).isEmpty() && idx.get(j).peek() < idx.get(digit).peek()) {
                    return false;
                }
            }
            
            // Step 5: If none of the above conditions are met, continue to the next character of string `t`.
            idx.get(digit).poll();
        }
        
        // Step 6: If we have traversed the entire string `t` without returning false, return true.
        return true;
    }
}