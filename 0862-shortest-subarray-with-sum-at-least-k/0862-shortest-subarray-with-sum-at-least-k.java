class Solution {
    public int shortestSubarray(int[] A, int K) {
        int n = A.length;
        long[] B = new long[n + 1];
        for(int i = 0; i < n; i++) {
            B[i + 1] = B[i] + A[i];
        }
        int res = Integer.MAX_VALUE;
        
        Deque<Integer> dq = new LinkedList<>();
        
        for(int i = 0; i < n + 1; i++) {
            while(!dq.isEmpty() && B[i] - B[dq.peek()] >= K) {
                res = Math.min(res, i - dq.removeFirst());
            }
            while(!dq.isEmpty() && B[i] <= B[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.add(i);
        }
        return res == Integer.MAX_VALUE ? -1:res;
    }
}