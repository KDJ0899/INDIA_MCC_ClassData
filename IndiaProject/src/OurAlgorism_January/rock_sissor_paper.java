package OurAlgorism_January;
import java.util.Scanner;

/**
 * ����������
 * 
 * @Package : OurAlgorism_January
 * @FileName : rock_sissor_paper.java
 * @Author : KIM DONGJIN
 * @date : 2018. 1. 26. 
 *
 */
public class rock_sissor_paper {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int stair=sc.nextInt();
		int x=0,y=0,win=0,a,b,who=2;
		
		while(true) {
			a=(int) (Math.random()*3+1);
			b=(int) (Math.random()*3+1);//1= ����,2= ��,3= ��
			
			if(a==b) {
				who=2;
			}
			else if(a>b){
				if(a==3&&b==1) {//y�� ������ �̱���
					who=1;
					win=2;
					y+=win;
				}
				else if(a==3) {//x�� ���ڱ�� �̱���
					who=0;
					win=5;
					x+=win;
				}
				else {//x�� ������ �̱���
					who=0;
					win=1;
					x+=win;
				}
			}
			else {	
				if(b==3&&a==1) {//x�� ������ �̱���
					who=0;
					win=2;
					x+=win;
				}
				else if(b==3) {//y�� ���ڱ�� �̱���
					who=1;
					win=5;
					y+=win;
				}
				else {//x�� ������ �̱���
					who=1;
					win=1;
					y+=win;
				}
				
			}
			switch(who) {
			case 0:
				if(win==1) 
					System.out.println("x�� ������ �̰���ϴ�.+1ĭ");
				else if(win==2) 
					System.out.println("x�� ������ �̰���ϴ�.+2ĭ");
				else
					System.out.println("x�� ���ڱ�� �̰���ϴ�.+5ĭ");
				break;
			case 1:
				if(win==1) 
					System.out.println("y�� ������ �̰���ϴ�.+1ĭ");
				else if(win==2) 
					System.out.println("y�� ������ �̰���ϴ�.+2ĭ");
				else
					System.out.println("y�� ���ڱ�� �̰���ϴ�.+5ĭ");
				break;
			default:
				System.out.println("�����ϴ�.");
			}
			if(x>=stair) {
				System.out.println("x�� ����� �� �ö����ϴ�. ���!!!~~!!");
				break;
			}
			else if(y>=stair) {
				System.out.println("Y�� ����� �� �ö����ϴ�. ���!!~~!!~~!!~~");
				break;
			}
			System.out.println(">>>���� ��� x�� "+x+"ĭ y�� "+y+"ĭ");
		}
	}

}
