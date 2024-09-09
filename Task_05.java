
public class Task_05 {

    
    public static void main(String[]args){
      int []arr=new int[6]  ;
      arr[0]=3;
      arr[1]=6;
      arr[2]=9;
      arr[3]=12;
      arr[4]=15;
     System.out.println("Elements before the insertion:");
     for(int i=0;i<arr.length;i++){
         System.out.println("Elements at the index:" +i+ ":" +arr[i]); }
        int newElement=18;
        arr[arr.length-1]=newElement;     
        System.out.println("Elements After the insertion:");
     for(int i=0;i<arr.length;i++){
         System.out.println("Elements at the index:" +i+ ":" +arr[i]);
        
    }
    }}


    

