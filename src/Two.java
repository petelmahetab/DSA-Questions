import java.util.Scanner;

public class Two {
    public static int PresentOrNot(int[] ar,int k) {
//        if(k< 0){
//            return 0;
//        }
        for(int i=0;i<= ar.length-1;i++){
            if(ar[i] == k){
                return  i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr ={1,5,8,9,20};
        System.out.println("Give me an number u need to search..?");
        int key=scanner.nextInt();

        int result=PresentOrNot(arr,key);

        if(result == -1){
            System.out.println("Not Present In your array.");
        }else{
            System.out.println("Yeh .is Present.."+result);
        }
    }
}
