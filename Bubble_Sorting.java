public class Bubble_Sorting{

    public static void main(String [] args){
        int [] arr={2,4,1,3,7,5,9,6,8};
        int [] arr3={2,4,1,3,7,5,9,6,8};
        BubbleSort bs=new BubbleSort();
        //BubbleSort
        bs.print(arr);
        bs.Sort(arr);
        bs.print(arr);
        //Improvement of BubbleSort
        bs.print(arr3);
        bs.Sort2(arr3);
        bs.print(arr3);
    }


}

class BubbleSort{

        //Bubble_Sorting Method
        public void Sort(int [] arr){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length-i-1;j++){
                    //switch the pisition of elements
                    if(arr[j]>arr[j+1]){
                        int tmp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=tmp;
                    }
                    //System.out.print(j+"-");
                }
              }
          }
          //Improvement of Bubble_Sorting Method
          public void Sort2(int [] arr){
              for(int i=0;i<arr.length;i++){
                  int flag=1;
                  for(int j=0;j<arr.length-i-1;j++){
                      //switch the pisition of elements
                      if(arr[j]>arr[j+1]){
                          int tmp=arr[j];
                          arr[j]=arr[j+1];
                          arr[j+1]=tmp;
                          flag=0;
                      }
                       //System.out.print(j+"-");
                  }//for j
                  if(flag==1){
                    break;
                  }
                }//for i
            }

          //PrintMethod
          public void print(int [] arr){
            for(int i=0;i<arr.length;i++){
                System.out.print(" "+arr[i]);
            }
            System.out.println();
          }
}
