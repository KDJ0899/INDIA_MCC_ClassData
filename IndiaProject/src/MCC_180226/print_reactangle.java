package MCC_180226;

import java.util.Scanner;
/**
 *Ȧ������ ���ڸ� �Է��ϸ� �ȿ� ���̾Ƹ�� �����
 * 
 * @Package : MCC_180226
 * @FileName : print_reactangle.java
 * @Author : KIM DONGJIN
 * @date : 2018. 2. 26. 
 *
 */
public class print_reactangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		StringBuffer sb=new StringBuffer(st);
		String blank=" ";
		String[] arr=new String[100];
		int cen=st.length()/2;
		arr[0]=sb.toString();//st:�Է±��� ����,sb=replace�� ���� ���� StringBuffer,blank�� ��ü��Ű�� ���� ����,arr�� ���� �ϳ��� �����ϴ� �迭
		System.out.println(sb);
		for(int i=0;i<cen;i++) {
			sb.replace(cen-i, cen+1+i, blank);
			blank+="  ";
			arr[i+1]=sb.toString();
			System.out.println(sb);
		}//���� ���̾� ��� ���
		for(int i=cen-1;i>=0;i--) {
			System.out.println(arr[i]);//���� ���̾Ƹ�� ���
		}
	}
}
