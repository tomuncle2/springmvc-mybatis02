package com.itheima.springmvc.customeenum;
/**
 * @ClassName: A
 * @author 蔡迪
 * @date 2018年11月29日下午2:16:08
 * @Description: TODO(这里用一句话描述这个类的作用)
 */

public enum A implements INumberEnum{
    
  BLUEE,YELLOW,RED,BLACK;
  
  //静态方法 
  public static void main(String args[]) { 
      // 静态方法 
      for (A a : A.values()) { 
          System.out.println("name: " + a.name() + ", getDeclaringClass: " + a.getDeclaringClass()+"  ordinal: "+a.ordinal()); 
          switch(a){
          case BLUEE: System.out.println("绿灯"); break;
          case YELLOW: System.out.println("黄灯"); break;
          case RED: System.out.println("红灯"); break;
          case BLACK: System.out.println("黑灯"); break;
          default:break;
          }
      }
  }

    public int getCode() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    public String getDescription() {
        // TODO Auto-generated method stub
        return null;
    }
}


