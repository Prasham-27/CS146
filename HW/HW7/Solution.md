1. First, sort all the jobs according to their start times.

2. Initialize a min-heap data structure. This heap will store the end time of the jobs. The job that ends soonest (smallest end time) will be on the top of the heap.

3. Start iterating over the sorted jobs, for each job, check if the top job on the heap can be removed (i.e., if the end time of the top job is less than or equal to the start time of the current job).

4. If the top job can be removed, it means a server has finished the job and it can be reassigned to a new job. So we remove (poll()) it from the heap. 

5. Whether we removed the top job or not, we need to assign a server to the current job. So, we add the current job to the heap (pushing the end time of the current job to the heap).

6. At last, the number of jobs in the heap is equal to the number of servers needed to finish all the jobs.
