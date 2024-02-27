import heapq
class Main:
    def minMeetingRooms(self, intervals: list[list[int]]) -> int:
        # If there is no job, no server is needed.
        if not intervals:
            return 0

        # Initialize a min heap
        free_rooms = []

        # Sort the jobs by start time.
        intervals.sort(key=lambda x: x[0])

        # Add the first job's end time to the heap.
        heapq.heappush(free_rooms, intervals[0][1])

        # For all the remaining jobs
        for i in intervals[1:]:
            # If the job on top of the heap doesn't
            # conflict with the current job, remove it
            if free_rooms[0] <= i[0]:
                heapq.heappop(free_rooms)

            # Add the current job's end time to the heap.
            heapq.heappush(free_rooms, i[1])

        # The size of heap tells us the minimum
        # number of servers needed.
        return len(free_rooms)
   
sol = Main()

# Test the minMeetingRooms() method using two different data sets
intervals1 = [[0, 30],[5, 10],[15, 20]]
print(sol.minMeetingRooms(intervals1)) # Should print 2

intervals2 = [[0, 1],[1, 2],[2, 3]]
print(sol.minMeetingRooms(intervals2)) # Should print 1
