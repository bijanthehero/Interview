# Java Interview
## Simple Math Function
Determines what operation of two variables will equal the value of a third variable 

> Write a function that takes three Integer numbers Number1, Number2, and Number3, and
determines if there is a mathematical operation that will make Number1 (operation) Number2
equal to Number3. If one or more of the 4 common mathematical operations (+,-,*,/) can
complete the function, return the String representation of the mathematical function. If none of
the 4 mathematical operations can make the statement true, return the String "None".
For instance:
public String mathFunction(1,2,3) returns "+",
public String mathFunction(2,2,4) returns "+*", (+ and *)
public String mathFunction(3,-3,-9) returns "*",
public String mathFunction(1,2,-1) returns "-",
public String mathFunction(3,3,1) returns "/",
public String mathFunction(7,1,11) returns "None".
