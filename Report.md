# Homework Aloha World Report

The following report contains questions you need to answer as part of your submission for the homework assignment. 


## Design Doc
Please link your UML design file here. [![UML Diagram](hw01&02%20UML%20Diagram.png)] See resources in the assignment on how to
link an image in markdown. You may also use [mermaid] class diagrams if you prefer, if so, include the mermaid code here.  You DO NOT have to include Greeting.java as part of the diagram, just the AlohaWorld application that includes: [AlohaWorld.java], [Greeter.java], and [ConsoleView.java].



### Program Flow
Write a short paragraph detailing the flow of the program in your own words. This is to help you understand / trace the code (and give you practice of something called a code walk that will be required in this course). 

This program begins with the main method in AlohaWorld class, which prompts the user to get the name and ask the user to select a locality from a list using ConsoleView class. After that, it instantiates a Greeter class using the name and locality. Then it gets the greeting message using greet method of the greeter object and calls the printGreeting function in ConsoleView class to print the greeting message. After the initial greeting, the program would prompt the user to ask if the user want to be greeted again. If the user chooses yes, it would prompt the user to change the locality and update the greeting message. If the user chooses no, the program would end.

## Assignment Questions

1. List three additional java syntax items you didn't know when reading the code.  (make sure to use * for the list items, see example below, the backtick marks are used to write code inline with markdown)
   
   * (example) `final class`
   * `static class`
   * `String.format() method`
   * `SCANNER.nextLine() method`

2. For each syntax additional item listed above, explain what it does in your own words and then link a resource where you figured out what it does in the references section. 

    * (example) The `final` keyword when used on a class prevents the class from being subclassed. This means that the class cannot be extended by another class. This is useful when you want to prevent a class from being modified or extended[^1] . It is often the standard to do this when a class only contains static methods such as driver or utility classes. Math in Java is an example of a final class[^2] .
    * The `static` keyword is used to indicate that a particular member (variable, method, block and nested classes) belongs to the class itself rather than to instances of that class.[^3]
    * The `String.format()` method is a static method in String class that returns a formatted string based on a specified format string and provided arguments, where placeholders within the format string (like %s for strings, %d for integers...) are replaced by the corresponding arguments.[^4]
    * The `SCANNER.nextLine()` method is a method for reading an entire line from input. It's useful when the input may contain spaces or when you need the whole line as a single string.[^5]

3. What does `main` do in Java? 

   * `main` method serves as the entry point for the java application, from where the JVM starts the execution of a Java program.[^6]


4. What does `toString()` do in Java? Why should any object class you create have a `toString()` method?

   * `toString()` is a method defined in Obeject class, which returns a String combined by the class name and hash code of the object by default. We usually override toString() method to print some information of property of the object, which would be useful for debugging process.[^7] 

5. What is javadoc style commenting? What is it used for? 

   * `javadoc style commenting` is a standardized way of writing documentation comments in Java code. These comments are commonly made up of two sections:1)the description of what we’re commenting on 2)the standalone block tags (marked with the “@” symbol), which describe specific meta-data. These comments are used to be processed by the Javadoc tool, which generates HTML-based API documentation.[^8]


6. Describe Test Driving Development (TDD) in your own words. 

   * `Test Driven Development(TDD)` is a software development approach where you write tests for your code before writing the actual code itself. It ensures that code is always tested and functional, reducing bugs and improving code quality.[^9] 

7. Go to the [Markdown Playground](MarkdownPlayground.md) and add at least 3 different markdown elements you learned about by reading the markdown resources listed in the document. Additionally you need to add a mermaid class diagram (of your choice does not have to follow the assignment. However, if you did use mermaid for the assignment, you can just copy that there). Add the elements into the markdown file, so that the formatting changes are reserved to that file. 


## Deeper Thinking Questions

These questions require deeper thinking of the topic. We don't expect 100% correct answers, but we encourage you to think deeply and come up with a reasonable answer. 


1. Why would we want to keep interaction with the client contained to ConsoleView?
   
   Because we want to store the name and locality of the user into the ConsoleView class and fetch them occasionally. We also want to use it to check if the user want to end the program.

2. Right now, the application isn't very dynamic in that it can be difficult to add new languages and greetings without modifying the code every time. Just thinking programmatically,  how could you make the application more dynamic? You are free to reference Geeting.java and how that could be used in your design.

   We should modify AlohaWorld class, by instantiating Greeting object rather than Greeter to get the name, locality, and even asciiGreeting, unicodeGreeting and formatStr to customize the greeting sentence. The getFormatStr() within Greeting class could pass the customized greeting sentence into main program dynamically.

> [!IMPORTANT]
>  After you upload the files to your github (ideally you have been committing throughout this progress / after you answer every question) - make sure to look at your completed assignment on github/in the browser! You can make sure images are showing up/formatting is correct, etc. The TAs will actually look at your assignment on github, so it is important that it is formatted correctly.


## References

[^1]: Final keyword in Java: 2024. https://www.geeksforgeeks.org/final-keyword-in-java/. Accessed: 2024-03-30. 

[^2]: Math (Java Platform SE 17). https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html. Accessed: 2024-03-30.

[^3]: static Keyword in Java. https://www.geeksforgeeks.org/static-keyword-java/ Accessed: 2025-01-19

[^4]: Java String format() Method With Examples https://www.geeksforgeeks.org/java-string-format-method-with-examples/ Accessed: 2025-01-19

[^5]: Scanner nextLine() method in Java with Examples https://www.geeksforgeeks.org/scanner-nextline-method-in-java-with-examples/ Accessed: 2025-01-19

[^6]: Java main() Method – public static void main(String[] args) https://www.geeksforgeeks.org/java-main-method-public-static-void-main-string-args/ Accessed: 2025-01-19

[^7]: Object toString() Method in Java https://www.geeksforgeeks.org/object-tostring-method-in-java/ Accessed: 2025-01-19

[^8]: Introduction to Javadoc https://www.baeldung.com/javadoc Accessed: 2025-01-19

[^9]: What is Test Driven Development (TDD)? https://www.geeksforgeeks.org/test-driven-development-tdd/ Accessed: 2025-01-19

<!-- This is a comment, below this link the links in the document are placed here to make ti easier to read. This is an optional style for markdown, and often as a student you will include the links inline. for example [mermaid](https://mermaid.js.org/intro/syntax-reference.html) -->
[mermaid]: https://mermaid.js.org/intro/syntax-reference.html
[AlohaWorld.java]: src/main/java/student/AlohaWorld.java
[Greeter.java]: src/main/java/student/Greeter.java
[ConsoleView.java]: src/main/java/student/ConsoleView.java