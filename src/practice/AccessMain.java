package practice;

import practice.AccessClass.InnerClass;

public class AccessMain {

	public static void main(String[] args) {
		
		AccessClass myAccess=new AccessClass();

		AccessClass.InnerClass myInner=myAccess.new InnerClass();

		System.out.println(myInner.MyInnerMethod());

	}

}
