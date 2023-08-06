package com.exams;

public class Code
{
	 public static void main(String[] args)
	 {
		 method(12);
	 }
	 public static void method(Object o)
	 {
		 System.out.println("Object method");
	 }
	 public static void method(Integer i)
	 {
		 System.out.println("Integer method");
	 }
	 public static void method(String s)
	 {
		 System.out.println("String method");
	 }
}