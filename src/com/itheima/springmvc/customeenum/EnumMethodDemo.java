package com.itheima.springmvc.customeenum;
/**在类中组织 enum
 * enum定义方法
 * */
public class EnumMethodDemo {
	
	enum Color {RED, GREEN, BLUE;} 
	enum Size {BIG, MIDDLE, SMALL;} 
	public static void main(String args[]) { 
		System.out.println("=========== Print all Color ===========");
		for (Color c : Color.values()) { 
		    //默认的toString方法返回的就是对应的名字
			System.out.println(c + " ordinal: " + c.ordinal());
		}
		System.out.println("=========== Print all Size ==========="); 
		for (Size s : Size.values()) { 
			System.out.println(s + " ordinal: " + s.ordinal()); 
		} 
		Color green = Color.GREEN; System.out.println("green name(): " + green.name());
		//com.itheima.springmvc.customeenum.EnumMethodDemo.Color.GREEN
		System.out.println("green getDeclaringClass(): " + green.getDeclaringClass()); 
		System.out.println("green hashCode(): " + green.hashCode());
		System.out.println("green compareTo Color.GREEN: " + green.compareTo(Color.GREEN)); 
		System.out.println("green equals Color.GREEN: " + green.equals(Color.GREEN));
		System.out.println("green equals Size.MIDDLE: " + green.equals(Size.MIDDLE)); 
		System.out.println("green equals 1: " + green.equals(1)); 
		System.out.format("green == Color.BLUE: %b\n", green == Color.BLUE); 
   }
}
/**
 * 语法：
 * 
 * 如果枚举中没有定义方法，也可以在最后一个实例后面加逗号、分号或什么都不加。

  下面三种声明方式是等价的：

  enum Color { RED, GREEN, BLUE }
  enum Color { RED, GREEN, BLUE,} 
  enum Color { RED, GREEN, BLUE;}
 */
/*如果枚举不添加任何方法，枚举值默认为从0开始的有序数值。以 Color 枚举类型举例，它的枚举常量依次为RED：0，GREEN：1，BLUE：2

枚举的好处：可以将常量组织起来，统一进行管理。

枚举的典型应用场景：错误码、状态机等。

枚举类型的本质

尽管 enum 看起来像是一种新的数据类型，事实上，enum是一种受限制的类，并且具有自己的方法。*/