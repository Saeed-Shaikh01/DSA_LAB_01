public class Task04 {
    
    public static void main(String[]args){
      int []arr=new int[6]  ;
      arr[0]=100;
      arr[1]=200;
      arr[2]=300;
      arr[3]=400;
      arr[4]=500;
     System.out.println("Elements before the insertion:");
     for(int i=0;i<arr.length;i++){
         System.out.println("Elements at the index:" +i+ ":" +arr[i]);

     }
        int newElement=250;
        for(int i=arr.length-1;i>2;i--){
            arr[i]=arr[i-1];
        }
        arr[2]=newElement;
        System.out.println("Elements After the insertion:");
     for(int i=0;i<arr.length;i++){
         System.out.println("Elements at the index:" +i+ ":" +arr[i]);
        
    }
    }
}
