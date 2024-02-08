We use the binary search algorithm for both solutions. The basic idea 
is to repeatedly divide the search interval in half. If the value of the 
search key is less than the item in the middle of the interval, then a 
new interval is formed that is reduced to the lower half. Otherwise, 
search key is greater than the middle item, a new interval is formed that 
is reduced to the upper half. The search process continues until the search 
key is found or the search interval is empty.
