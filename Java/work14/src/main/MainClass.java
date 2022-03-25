package main;

import java.util.Arrays;

import cls.Dropship;
import cls.Marine;
import cls.Tank;
import cls.Unit;

public class MainClass{
	public static void main(String[] args) {
		Unit unitArr[] = new Unit[10];
		unitArr[0] = new Marine();
		unitArr[1] = new Tank();
		unitArr[2] = new Dropship();
		
		((Marine) unitArr[0]).stimPack();
		
		
	}
}
