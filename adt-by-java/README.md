ADTs
==========

List, Stack and Queue are three most popular ADTs. (Abstract data type)

## Simple Arrays ##

Arrays are dynamicly alloc memory.

Insert and delete will take much time for that array need to move all the elements after or before the position.

## Linked List ##

Linked List usually implemented by pointers in C/C++ or object in java.

However, for some language like BASIC and FORTRAN do not support dynamic linked list data structure, they should implement linked list by cursors. Also, in some kinds of language, the use of *NEW* is expensive, and cursor may be a better choice.

## Stack ##

pop 

push

Stack is kind of list which is LIFO (last in first out).

The implementation of stack can be list or array. And array is like the cursor in linked list which are much widely used.


### Invoke method will use Stack ###

You should avoid to use tail recursion; this kind of method invoke will lead to stack over flow exception.

## Queue ##



## Hash Table ##

Hash table is used to insert, delete and find in a constant time.

It does support *findMin*, *findMax*, and *printList* in linear time.

Separate chaining

Open addressing hashing

## Binary Search Tree ##

depth

height

*preorder traversal* :  
- Handle the logic of the node before the iteration of its children.
- Not usually used.

*postorder traversal* 

*inorder traversal*

For BST, every value in the left tree should be _less than_ the right.

## AVL tree ##

Avl tree is kind of BST with balance.

AVL tree: the height gap between left child and right child should <= 1

rotation : it is to make a not balanced tree to be AVL tree.

## Splay Tree ##

When try to find one element, make it to be the root element.

Two kind of rotation: zig-zag, zig-zig

## B Tree ##

B Tree is used when the data are not all load into memory.

## Priority Queue ##

### Binary Heap ###

Binary Heap is a complete binary tree.

It is one implementation of priority queue.



### Leftist Heap ###

Leftist Heap is not perfectly balanced.
