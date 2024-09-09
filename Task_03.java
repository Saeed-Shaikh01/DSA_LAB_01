
public class Task_03 {
    public static void main(String[]args){
    int [] arr=new int[6];
    arr [1]= 12;
    arr [2]= 24;
    arr [3]= 36;
    arr [4]= 48;
    arr [5]= 60;
    System.out.println("Array before the insertation:");
     for(int i=0;i<arr.length;i++){
      System.out.println("Elements at Index:"+i+ ":"+arr[i]);
     }  
      int newElement=6;
      for(int i=arr.length-1;i>0;i--){
          
     }
      arr[0]=newElement;
       System.out.println("Array after the insertation :");
     for(int i=0;i<arr.length;i++){
      System.out.println("Elements at Index:"+i+ ":"+arr[i]);
     }  
   
}
}
