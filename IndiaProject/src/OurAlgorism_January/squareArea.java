package OurAlgorism_January;
import java.util.Scanner;

/**
 * �簢�� ���� ���ϱ�
 * 
 * @Package : OurAlgorism_January
 * @FileName : squareArea.java
 * @Author : KIM DONGJIN
 * @date : 2018. 1. 28. 
 *
 */
public class squareArea {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ù��° �簢���� ��ǥ�� �Է��Ͻÿ�.");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		System.out.println("�ι�° �簢���� ��ǥ�� �Է��Ͻÿ�.");
		int x3=sc.nextInt();
		int y3=sc.nextInt();
		int x4=sc.nextInt();
		int y4=sc.nextInt();
		
		int k=0,area=0;
		if(x1>x2) {
			k=x1;
			x1=x2;
			x2=k;
		}
		if(y1<y2) {
			k=y1;
			y1=y2;
			y2=k;
		}
		if(x3>x4) {
			k=x3;
			x3=x4;
			x4=k;
		}
		if(y3<y4) {
			k=y3;
			y3=y4;
			y4=k;
		}
		int LeX1=x1,LeX2=x2,LeY1=y1,LeY2=y2;
		if(x1<x3)
			LeX1=x3;
		if(x2>x4)
			LeX2=x4;
		if(y1>y3)
			LeY1=y3;
		if(y2<y4)
			LeY2=y4;
		if(LeX1>=LeX2)
			System.out.println("�簢���� ��ġ�� �ʽ��ϴ�.");
		else if(LeY1<=LeY2)
			System.out.println("�簢���� ��ġ�� �ʽ��ϴ�.");
		else {
			area=(LeX2-LeX1)*(LeY1-LeY2);
			System.out.println("�簢���� ���̴� "+area);
		}
	}
}