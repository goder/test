public class Insertion_Sorting 
{
	public static void main(String[] args) 
	{
		
		
		int a[]={2,1,4,7,5,3,9,6,8};
		
		InsertionSorting is=new InsertionSorting();
		is.print(a);

		is.sort(a);

		is.print(a);

		
		
		System.out.println("Sort Finish!");
	}
}


class InsertionSorting
{
	//Insertion Sorting Method

	public void sort(int[] arr){
		for(int i=1;i<arr.length;i++){
			int insertVal=arr[i];
			int index=i-1;
			while(index>=0&&insertVal<arr[index]){
				//��arr[index]����ƶ�
				arr[index+1]=arr[index];
				//��index��ǰ�ƶ�
				index--;
			}
			//��insertVal���뵽�ʵ�λ��
			arr[index+1]=insertVal;
			

		}
	};
	
	public void print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print("  "+arr[i]);
	
		}
		System.out.println();

	}


	}
