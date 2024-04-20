Approach 1: Kruskal's Algorithm (like a cost-saving builder)

Make a list of all connections:
We consider building a well in each house (connecting the virtual node '0' to each house with the cost from wells).
We add all the pipe connections (costs) from the pipes array to this list.
Sort connections by cost: We want to build the cheapest connections first.
Keep track of connected houses: We use a helper tool called "Union-Find" (imagine it as a colored map where connected houses have the same color).
Go through connections (one by one):
If connecting two houses wouldn't create a loop (cycle), we build that connection (add the cost).
The "Union-Find" helps us avoid making loops (like accidentally creating a circle on the map).
In the end, the total cost is the sum of the costs of the connections we built.


Approach 2: Prim's Algorithm (like a growing web):

Create a map of connections:
We consider building a well in each house (connecting the virtual node '0' to each house with the cost from wells).
For each house, we list all the possible pipe connections (costs) from that house to other houses (like different roads from a town).
Start at a house (any house): We can pick any house as our starting point.
Use a special queue: This queue keeps track of the cheapest connections we haven't built yet, sorted by cost (like a prioritized to-do list for building connections).
Keep expanding the connections:
We pick the cheapest connection from the queue.
If the other end of that connection isn't already connected, we build it (add the cost to the total) and add all its possible connections to the queue.
We keep doing this until all houses are connected.
In the end, the total cost is the sum of the costs of the connections we built.
