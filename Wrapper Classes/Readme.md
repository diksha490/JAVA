# Wrapper Classes in Java

A Wrapper class is a class whose object wraps primitive data types.

## Need of Wrapper Classes:-

1.They convert primitive data types into objects. Objects are needed if we wish to modify the arguments passed into a method (because primitive types are passed by value).

2.Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference types) and not primitive types.

3.An object is needed to support synchronization in multithreading.

## Primitive Data types and their Corresponding Wrapper class

 
 byte->              Byte
 short->                Short
 int->	                Integer
 long->	                Long
 float->	                Float
 double->                Double
 boolean->	            Boolean
 char->	                Character


## Autoboxing

Automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing. For example – conversion of int to Integer, long to Long, double to Double etc.

Eg.
public class WrapperExample1{  
public static void main(String args[]){  
//Converting int into Integer  
int a=20;  
Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
  
System.out.println(a+" "+i+" "+j);  
}} 

Output:
20 20 20 

## Unboxing

It is just the reverse process of autoboxing. Automatically converting an object of a wrapper class to its corresponding primitive type is known as unboxing. For example – conversion of Integer to int, Long to long, Double to double etc.

Eg.
public class WrapperExample2{    
public static void main(String args[]){    
//Converting Integer to int    
Integer a=new Integer(3);    
int i=a.intValue();//converting Integer to int explicitly  
int j=a;//unboxing, now compiler will write a.intValue() internally    
    
System.out.println(a+" "+i+" "+j);    
}}

Output:
3 3 3
