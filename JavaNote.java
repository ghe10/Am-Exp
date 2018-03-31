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
 */

