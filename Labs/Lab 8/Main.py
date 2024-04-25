def coinChange(self, coins: List[int], amount: int) -> int:
    dp = [amount + 1] * (amount + 1)  # Initialize with a large value
    dp[0] = 0  # Base case

    for i in range(1, amount + 1):
        for coin in coins:
            if coin <= i:
                dp[i] = min(dp[i], 1 + dp[i - coin])

    return dp[amount] if dp[amount] <= amount else -1
