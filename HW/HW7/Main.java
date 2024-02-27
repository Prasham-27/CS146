package HW.HW7;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        // Sort the intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Use a min heap to track the earliest ending job
        PriorityQueue<int[]> heap = new PriorityQueue<>(intervals.length, (a, b) -> a[1] - b[1]);

        // Add the first job onto the heap and start
        heap.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            // If the job on top of the heap doesn't
            // conflict with the current job, remove it
            if (intervals[i][0] >= heap.peek()[1]) {
                heap.poll();
            }

            // Add the current job into heap
            heap.add(intervals[i]);
        }

        // The size of the heap tells us
        // the minimum number of servers needed.
        return heap.size();
    }
    public static void main(String[] args) {
    Main sol = new Main();
    
    int[][] intervals1 = {{0, 30},{5, 10},{15, 20}};
    System.out.println(sol.minMeetingRooms(intervals1)); // prints 2

    int[][] intervals2 = {{0, 1},{1, 2},{2, 3}};
    System.out.println(sol.minMeetingRooms(intervals2)); // prints 1
    }
}