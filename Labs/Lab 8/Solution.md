Initialization: Create a dp array/list of length amount + 1 to track the minimum coins required for amounts from 0 to amount.  Initialize it with a large value (e.g., amount + 1) to represent that a solution isn't yet found. Set dp[0] to 0, as no coins are needed for amount 0.

Iteration:

Outer loop iterates through amounts from 1 to amount.
Inner loop iterates through each coin denomination.
If the coin value is less than or equal to the current amount, update dp[i] to be the minimum between its current value and 1 (for the current coin) plus the value in dp[i - coin] (minimum coins for the remaining amount).
Result: After the loops, dp[amount] stores the minimum coins needed.  If it's still greater than the original amount, no solution exists, so return -1; otherwise, return dp[amount].
