We first create a table representing the shortest distances between all city pairs. We then use an algorithm (Floyd-Warshall) to consider every possible route (even going through other cities) to find the absolute shortest path between any two cities.

Finally, for each city, we count how many other cities are reachable within the given distance limit. The ideal city is the one with the fewest reachable cities. If multiple cities have the same minimum count, the city with the highest index (number) wins.
