package OurAlgorism_January;

import java.util.Scanner;
/**
 * īī�� ���蹮�� 1�� Ǯ�� 18.01.26~
 * 
 * @Package : OurAlgorism_January
 * @FileName : kakao_exam_1.java
 * @Author : KIM DONGJIN
 * @date : 2018. 1. 26. 
 *
 */
public class kakao_exam_1 {
	
	public static int pre_area(int[][] arr,int last,int first,int k,int num,int area) {
		for(int i=first;i<=last;i++) {
			if(arr[k-1][i]==num)
				area+=1;
		}
		return area;
	}//�� ���� ���� ���ϱ�
	public static int[][] pre_arr(int[][] arr,int last,int first,int k,int num) {
		for(int i=first;i<=last;i++) {
			if(arr[k][i]==num)
				arr[k][i]=0;
		}
		return arr;
	}//���� �ʱ�ȭ ��Ű��
	/*public static int check_end(int[][] arr,int n,int m) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]!=0)
					return 0;
			}
		}
		return 1;
	}*/

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] picture=new int[m][n];
		
		int area=0,end=0,k=0,last=n-1,first=0,max=0,num=0,ing=0,prefirst=0,prelast=n;
		int go_prearea=0,all_end=0,end_check=0;/*area�� ����,end�� ������ �ƴ��� �Ǻ�,k�� picture��.
		first,last�� �� �������� ����,max�� ���� �ִ�ġ,num�� ������ ����� ���� ����,ing�� ���� ������ ã�� �ִ���
		prefirst�� ���� ������,prelast�� ���� ������*/
		
		for(int i=0; i<m; i++) {//�׸� �Է�
			for(int j=0; j<n; j++) {
				picture[i][j]=sc.nextInt();
			}
		}
	
		
		while(true) {
			if(all_end==1&&k==m-1)
				break;
			if(end==1) {
				k=0;
				end=0;
				ing=0;
			}//���� ���� ã�� �������� �ʱ�ȭ
			all_end=1;
			end_check=0;
			for(int j=0;j<=last;j++) {
				if(picture[k][j]!=0) {
					if(ing==0) {
						num=picture[k][j];
						ing=1;
						area+=1;
						first=j;
						picture[k][j]=0;
						all_end=0;
					}//ó�� ���� ��������
					  else if(ing==1&&picture[k][j]==num) {
						  if(j==n-1)
							  last=j;//������ ���ϰ�� �ڵ����� ����
						  else if(picture[k][j+1]!=num) {
							  last=j;//������ ���� �ƴϰ� ���� ���� ���� ���ڰ� �ƴҰ��
							}//���� ������ ã��
						  area+=1;
						  picture[k][j]=0;
						  end_check=1;
						  all_end=0;
						  //���� ���� ���ϸ鼭 ����ѵ� �ʱ�ȭ	
					}
				}
			}
			if(end_check==0) {
				end=1;
			}
			if(prefirst>first) {
				go_prearea=1;
			}
			if(prelast<last) {
				go_prearea=1;
			}
			if(go_prearea==1) {
				area=pre_area(picture,last,first,k,num,area);
				picture=pre_arr(picture,last,first,k,num);
			}
			if(k==m-1)
				end=0;
			else
				k++;
			prefirst=first;
			prelast=last;
			if(area>max) 
				max=area;
		}
		System.out.println("real "+max);
	}
}




