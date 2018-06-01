package com.javabasic;

public class date {
 int day;
 int month;
 int year;
 public date() {
	 
 }
 public date(int day,int month,int year)
 {
	 this.day =day;
	 this.month=month;
	 this.year=year;
 }

public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public void displayDate() {
	System.out.println(day+"/"+month+"/"+year);
}
}
