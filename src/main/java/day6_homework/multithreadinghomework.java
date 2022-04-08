package day6_homework;

public class multithreadinghomework {
    /*
    * synchronized: The process of allowing only a single thread to access the shared data or resource at a particular point of time is known as Synchronization.
    * Lock vs Synchronized Block:
    * A synchronized block is fully contained within a method – we can have Lock API's lock() and unlock() operation in separate methods
A synchronized block doesn't support the fairness, any thread can acquire the lock once released, no preference can be specified. We can achieve fairness within the Lock APIs by specifying the fairness property. It makes sure that longest waiting thread is given access to the lock
A thread gets blocked if it can't get an access to the synchronized block. The Lock API provides tryLock() method. The thread acquires lock only if it's available and not held by any other thread. This reduces blocking time of thread waiting for the lock
A thread which is in “waiting” state to acquire the access to synchronized block, can't be interrupted. The Lock API provides a method lockInterruptibly() which can be used to interrupt the thread when it's waiting for the lock
     *
     * Lock Interface:
     * public void lock()

        Acquires the lock.
     *
     * public void unlock()

        Releases the lock.
     *
     * public Condition newCondition()

        Returns a new Condition instance that is bound to this Lock instance.
     *
     * public boolean tryLock()

        Acquires the lock only if it is free at the time of invocation.
     *
     * public void lockInterruptibly()

        Acquires the lock unless the current thread is interrupted.
     *
     * ReentrantLock:
     * The ReentrantLock class implements the Lock interface and provides synchronization to methods while accessing shared resources.
     * The code which manipulates the shared resource is surrounded by calls to lock and unlock method.
     * This gives a lock to the current working thread and blocks all other threads which are trying to take a lock on the shared resource.
     *
     * ReadWriteLock:
     *
     *  Read lock: If there is no thread that has requested the write lock and the lock for writing, then multiple threads can lock the lock for reading.
     *  It means multiple threads can read the data at the very moment, as long as there’s no thread to write the data or to update the data.
     *  Write Lock: If no threads are writing or reading, only one thread at a moment can lock the lock for writing. Other threads have to wait until the lock gets released.
     *  It means, only one thread can write the data at the very moment, and other threads have to wait.
     *
     * ReentrantReadWriteLock:
     *
        ReentrantReadWriteLock class of Java is an implementation of ReadWriteLock, that also supports ReentrantLock functionality.
     *  The ReadWriteLock is a pair of associated locks, one for read-only operations and one for writing.
     *
     * CompletableFuture is an extension to Java’s Future API which was introduced in Java 5.

     * Future vs CompletableFuture
        A Future is used as a reference to the result of an asynchronous computation.
     *  It provides an isDone() method to check whether the computation is done or not, and a get() method to retrieve the result of the computation when it is done.
     *
     *
     *
     *
     * */


}
