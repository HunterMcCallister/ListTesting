********************************
* Double-Linked and Tester
* CS 221
* 15 November 2024
* Hunter McCallister
******************************** 

# OVERVIEW:
This program implements a double-linked list in Java that can hold any type of object. It lets you add, remove, and access elements, and includes iterator functionality to traverse the list. There's also a tester file that runs various scenarios to make sure everything works correctly.

# INCLUDED FILES:
* IUDoubleLinkedList.java: The main class that implements the double-linked list.
* ListTester.java: Contains the test cases for the list.
* IndexedUnsortedList.java: Interface that defines the methods for the list.
* Node.java: The Node class used by the linked list.
* README.md: This file with instructions and details.

# COMPILING AND RUNNING:
Make sure all the files are in the same directory.
1. Compile the tester in the terminal
    $ javac ListTester.java
2. Run the tester
    java ListTester
This will run a bunch of test cases to check that the double-linked list works as expected.

# PROGRAM DESIGN AND IMPORTANT CONCEPTS:
Main Components:
* IUDoubleLinkedList: Implements the double-linked list using the Node class. It provides methods to add, remove, and access elements.
* Node: Each node holds an element and has references to the next and previous nodes, allowing traversal in both directions.
* ListTester: Runs various test scenarios to verify that all methods in IUDoubleLinkedList work properly.
Key Concepts:
* Double-Linked List: A data structure where each node points to both the next and previous nodes, allowing efficient insertion and removal from both ends and in the middle.
* Iterator and ListIterator: Implemented to traverse and modify the list during iteration. Managing the iterator's state correctly was crucial to handle modifications without errors.
I designed the classes this way to ensure that all operations are efficient. Using a double-linked list allows quick insertions and deletions anywhere in the list.

# TESTING:
I used the `ListTester` class to run extensive tests covering different operations and edge cases. It checks that all methods work correctly and that exceptions are thrown when invalid operations are attempted.
* Testing Strategy: The tester starts with an empty list and progressively adds elements, performs operations, and checks the list's state after each step.
* Error Handling: The program handles invalid inputs by throwing appropriate exceptions like `IndexOutOfBoundsException`.
* Edge Cases: Special attention was given to cases like adding or removing elements at the head or tail, and modifying the list during iteration.

# DISCUSSION:
While working on this project, I ran into challenges with the `ListIterator` itself. Ensuring that it was consistent after changes to the list. There were multiple situations when I would forget to run the Tester while implementing the test cases and they would all be failing. Trying to distinguish if it was the code itself was bad or if the testers were bad. Debuggin the `add`, `remove` and `set` methods took some time to finish.
The edge cases like adding or removing at the head or tail took a while to make sure that I was covering all cases and make the links between the nodes point correctly.
I lerarned a lot about double-linked lists and how they work. The hardest part was the iterators working properly. It was truly relieving running the test and seeing "zero" failed tests, especially after you just went from passing everything to failing a lot after "making your code better".