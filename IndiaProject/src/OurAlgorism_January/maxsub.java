package OurAlgorism_January;

import java.util.Scanner;

/**
 * �ִ�����,�ּҰ����
 * 
 * @Package : OurAlgorism_January
 * @FileName : maxsub.java
 * @Author : KIM DONGJIN
 * @date : 2018. 1. 25. 
 *
 */
public class maxsub {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�μ��� �Է��Ͻÿ�.");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k,a=n,b=m;
		if(n>m) {
			k=n;
			n=m;
			m=k;
		}
		while(true) {
			if(n%m==0) 
				break;
			else {
				k=n%m;
				n=m;
				m=k;
			}
		}
		System.out.println("�ִ� �������"+m);
		System.out.println("�ּ� �������"+(a/m)*(b/m)*m);
	}
}
