package MCC_180223;

import java.util.Arrays;
import java.util.Scanner;
/**
 * ���ڵ��� �޾Ƽ� �ߺ��� ���ְ� �����ϱ�
 * 
 * @Package : MCC_180223
 * @FileName : Sort_Two_array.java
 * @Author : KIM DONGJIN
 * @date : 2018. 2. 23. 
 *
 */
public class Sort_Two_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int n,m;
		int k=0,dupl=0;
		System.out.print("Enter the number:");
		n=sc.nextInt();
		System.out.print("Enter the number:");
		m=sc.nextInt();
		final String[] A=new String[n];
		final String[] B=new String[m];
		final String[] C=new String[n+m];
		final String[] pr;
		
		System.out.print("Enter the word:");
		for(int i=0;i<n;i++) {
			dupl=0;
			A[i]=sc.next();
			for(int j=0;j<i;j++) {
				if(A[i].equals(A[j])) {
					i--;
					break;
				}
			}
		}//ù��° ���� �Է� �޴� ����, ���߿� �ߺ��� ����.
		System.out.print("Enter the word:");
		for(int i=0;i<m;i++) {
			dupl=0;
			B[i]=sc.next();
			for(int j=0;j<n;j++) {
				if(B[i].equals(A[j])) {
					dupl=1;
					i--;
					break;
				}
			}
			if(dupl==1)
				continue;
			for(int j=0;j<i;j++) {
				if(B[i].equals(B[j])) {
					i--;
					break;
				}
			}
		}//�ι�° ���� �Է� �޴� ����, ���߿� B��ü�� A��ü�� �ߺ��� ����.
		Arrays.sort(A);
		Arrays.sort(B);
		for(int i=0;i<n;i++) {
			C[k]=A[i];
			k++;
		}
		for(int i=0;i<m;i++) {
			C[k]=B[i];
			k++;
		}
		pr=new String[k];
		for(int i=0;i<k;i++) {
			pr[i]=C[i];
		}
		Arrays.sort(pr);
		System.out.println("Sorted Merged array: "+Arrays.toString(pr));
		System.out.println("Sorted first array: "+Arrays.toString(A));
		System.out.println("Sorted second array: "+Arrays.toString(B));
		
	}

}
