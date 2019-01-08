package com.itheima.springmvc.customeenum;
/**
 * @ClassName: Test2
 * @author 蔡迪
 * @date 2018年12月4日下午11:04:39
 * @Description: TODO(这里用一句话描述这个类的作用)
 */

public enum Test2 {
    
   
    Mondy("星期一",0),
    Tuesday("星期二",1),
    Wednesday{},
    Thursday{},
    Friday,
    Saturday,
    Sunday;
    
    private  int code;
    private String weekday;
    //显示赋值的枚举 对应的实例构造方法
    Test2(String weekday,int code){
        this.code = code;
        this.weekday = weekday;
    };
    
   
    //没有显示赋值的枚举 的构造方法
    Test2(){}
    
    public static void main(String args[]) { 
        // 静态方法 
        for (ErrorCodeEn s : ErrorCodeEn.values()) { 
            System.out.println("code: " + s.getCode() + ", description: " + s.getDescription()); 
        } 
    }
    
}
