/**
 * when we have a new object, itself knows what class it is, it will call its overrided func even if we use
 * Base obj = new ExtendBase(); or obj = (Base)obj;
 * Casting child class to parent class is redundant!!!!!!!!
 */

/**
 * Hashtable is implemented with an array of bucket. It is like the strategy  of linked list to deal with collision.
 * It uses hashcode and % operation to find the correct bucket. Rehash factor is usually 75% (75 % bucket non-empty). Changeable in constructor.
 *
 * TreeSet and TreeMap uses red-black tree to implement, ordered.
 *
 * Usually interator sits between two objets, you need to call next() to return next object and put iterator to next "between pos". remove will
 * remove the object we just passed by and returned. If doing sth more complex and do remove, it is hard to understand.
 *
 * PriorityQueue is implenented with heap.
 *
 * HashMap/TreeMap's keySet is a special set rather than the set we usually use.
 *
 * we can use synchronizedMap to convert Map to thread safe. Need to understand how!!!!!!!!!!!! I think it is just adding sync() to put and get operations.
 * It uses lock. We need to make sure nobody uses old object to access the data inside to keep the thread safe properity.
 */

/**
 * Blocking queue may be helpful for producer-consumer ops, it will block the put, get, offer (insert and return true), we might also add
 * waiting time param when needed.
 */

/**
 * We have java.util.concurrent for concurrent ops. We can use Map ......  The size() op is slow (O(n)). ????????????????? It uses weak consistent iterator.
 * Iterator might not reveal all changes, but no duplicate and exception
 *
 * CopyOnWriteArrayList/Set is also helpful.
 */

/*Use optional to get better handling of null staff*/

/* buffer reader might help to read super large file in java https://www.cnblogs.com/duanxz/p/4874712.html */

/* Java NIO. introduced from jdk 1.4
 * Main difference: NIO is Buffer facing,  channel reading/writing to buffer. The read/write call could return without waiting for
 * the actual io operation to finish. http://tutorials.jenkov.com/java-nio/asynchronousfilechannel.html
 * Selector in NIO can help one thread to working on staff from different NIO channel and let one thread to do resonable staff rather than
 * waiting all the way.
 *
 * If you need async operations, you need latter version NIO2 which helps to provide async IO operations which returns Future obj. This is hard to use though
 * NIO2: More New IO https://www.jianshu.com/p/07d3d421a877
 */

