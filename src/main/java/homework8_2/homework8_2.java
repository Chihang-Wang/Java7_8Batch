package homework8_2;

public class homework8_2 {
    /*
transaction:

A transaction is a unit of work that you want to treat as "a whole." It has to either happen in full or not at all.

A classical example is transferring money from one bank account to another. To do that you have first to withdraw the amount from the source account,
and then deposit it to the destination account.
The operation has to succeed in full. If you stop halfway, the money will be lost, and that is Very Bad.

In modern databases transactions also do some other things - like ensure that you can't access data that another person has written halfway.
But the basic idea is the same - transactions are there to ensure, that no matter what happens, the data you work with will be in a sensible state.
They guarantee that there will NOT be a situation where money is withdrawn from one account, but not deposited to another.



how to solve the deadlock:

Eliminate Mutual Exclusion
It is not possible to dis-satisfy the mutual exclusion because some resources, such as the tape drive and printer, are inherently non-shareable.

Eliminate Hold and wait

Allocate all required resources to the process before the start of its execution, this way hold and wait condition is eliminated but it will lead to low device utilization.
for example, if a process requires printer at a later time and we have allocated printer before the start of its execution printer will remain blocked till it has completed its execution.

The process will make a new request for resources after releasing the current set of resources. This solution may lead to starvation.

Eliminate No Preemption
Preempt resources from the process when resources required by other high priority processes.

 Eliminate Circular Wait
Each resource will be assigned with a numerical number. A process can request the resources increasing/decreasing. order of numbering.
For Example, if P1 process is allocated R5 resources, now next time if P1 ask for R4, R3 lesser than R5 such request will not be granted, only request for resources more than R5 will be granted.

Deadlock Avoidance
Deadlock avoidance can be done with Banker’s Algorithm.

Banker’s Algorithm
Bankers’s Algorithm is resource allocation and deadlock avoidance algorithm which test all the request made by processes for resources, it checks for the safe state,
if after granting request system remains in the safe state it allows the request and if there is no safe state it doesn’t allow the request made by the process.

LiveLock:
Livelock occurs when two or more processes continually repeat the same interaction in response to changes in the other processes without doing any useful work.
These processes are not in the waiting state, and they are running concurrently.
This is different from a deadlock because in a deadlock all processes are in the waiting state.
* */
}
