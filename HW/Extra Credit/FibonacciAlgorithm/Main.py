def fibonacci(n):
    # The first two fibonacci numbers
    a, b = 0, 1

    # Return if n is 0 or 1
    if n <= 0: return a
    if n == 1: return b

    # Compute Fibonacci numbers from 2 to n
    for i in range(2, n + 1):
        # Next fibonacci number is sum of previous two
        temp = a + b
        # Replace a with b and b with temp (next fibonacci number)
        a, b = b, temp

    # Return the nth Fibonacci number
    return b

# Test with the 10th fibonacci number 
print(fibonacci(10))