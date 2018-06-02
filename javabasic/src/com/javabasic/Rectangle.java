package com.javabasic;

public class Rectangle {
float side;
float Leangth;
float  Width;

public Rectangle( float side)
{
	this.side =side;
}
public Rectangle (float Leangth,float Width)
{
	this(Leangth);
	if(Leangth >0.0 && Leangth < 20.0 && Width > 0.0)
	{
	this.Leangth =Leangth;
	this.Width = Width;
	
}else
{
	System.out.println("leangth lessthan 0.0 and width graterthan 20.0");
}
}
public void areaofRectangle()
{
	System.out.println(Leangth*Width);
}
public void perimeterofRectangle()
{
	System.out.println(2*(Leangth*Width));
	
}
public void areaofsqr()
{
	System.out.println(side*side);
}
public static void main(String[] args)
{
	//Rectangle r1 = new Rectangle (8);
	Rectangle r2 = new Rectangle(8,17);
	r2.areaofRectangle();
	r2.perimeterofRectangle();
	r2.areaofsqr();
	
}
}
