package com.company;

public class Box {
    public int height;
    public int width;
    public int length;
    public static void Calculate_area(int height,int width,int length){

        System.out.println("area"+"="+height*width*length);
    }
    public static void Calculate_area(int height,int width){

        System.out.println("area"+"="+height*width);
    }
    public void display(){
        System.out.println("height"+"="+height+" , "+"width"+"="+width+" , "+"length"+"="+length);
    }
    public static void main(String[] args){
         Box b1=new Box();
         b1.height=5;
         b1.width=6;
         b1.length=7;
         b1.Calculate_area(5,6,7);
        b1.Calculate_area(5,6);
         b1.display();
    }
}


