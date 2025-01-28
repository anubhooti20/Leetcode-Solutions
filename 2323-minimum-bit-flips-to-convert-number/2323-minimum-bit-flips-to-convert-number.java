class Solution {
  
    // Function to count the minimum number of bit flips required to convert 'start' to 'goal'.
    public int minBitFlips(int start, int goal) {
        // XOR of 'start' and 'goal' will give us the bits that are different.
        int diffBits = start ^ goal;
      
        // This variable will hold the count of the number of flips required.
        int flipCount = 0;
      
        // Process each bit of 'diffBits' to count the number of set bits (flips required).
        while (diffBits != 0) {
            // Increment 'flipCount' if the least significant bit of 'diffBits' is 1.
            flipCount += diffBits & 1;
          
            // Right shift 'diffBits' by 1 to process the next bit.
            diffBits >>= 1;
        }
      
        // Return the count of flips required.
        return flipCount;
    }
}
