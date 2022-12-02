package com.capgemini.javademo;

class Test2<T>
{
 
 
 private T obj;

public Test2(T obj) {
   this.obj = obj;
}

public T getObj() {
 return obj;
}

@Override
public String toString() {
 return "Test [obj=" + obj + "]";
}
 
} 
 
 


public class GenericClassDemo {

public static void main(String[] args) {

  Test2<Integer> t=new Test2<Integer>(1);
  Integer out= t.getObj();
 System.out.println(out);

}

}