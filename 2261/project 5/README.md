**CS2261 Object-Oriented Programming Spring 2019**

**Project #5 [85 points]**

---------------------------------------------------------------------------------------------------

Due date is Monday, 05/06. Submit either &#39;script&#39; files or screenshots that will show your source code, results of compilation and execution.

Please, follow the proper programming style and include necessary comments.

1. [15 points] Exercise 20.6, p. 809 (_Use iterators on linked lists_). You may measure the time like that:

**long** startTime = System.nanoTime();

methodToTime();

**long** endTime = System.nanoTime();

**long** duration = (endTime - startTime);

1. [30 points] Exercise 20.11, p. 809 (_Match grouping symbols_). Read several expressions with grouping symbols from a keyboard instead of providing a file with source code. Use a Stack class from Java Collections Framework. Your program must produce the result of the checking procedure with some diagnostics for the following strings:

1. **{a+[b-3/(x-y)]}**; (b) **{a+[b-3/{x-y)]}**; (c) **{a+[b-3/(x-y)]})**

1. [20 points] Exercise 21.1, p. 836 (_Perform set operations on hash sets_).

1. [20 points] Write a program that creates a hash map with 15 entries, where a key of each entry is a name of a state, and a value is this state capital (for example, some entry has a key Missouri and a value Jefferson City). After entering information, display all the entries. Then create a tree map from an existing hash map and display all entries again. Finally, prompt the user to enter a state and display the capital of this state. If a key is not in a map, produce an error message. In the submission file show the output for at least 5 different state names, including a state, which is not in your map.
