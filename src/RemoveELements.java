import java.util.Arrays;

public class RemoveELements {
    public static  int[] removeElementWIthIndex(int[] a,int i,int n1){
        /*steps:
        we create an new Array with length -1 by array 1.  Because we  have to coping all elements from the A
        into new and after removing we get the size will be decreases by 1.
        1.create an new array. and iterate on first array.
        2.check all elements excluding index will be copied as it is in new .
        3.if we found an index then we skip this using "Continue"
        4.after that remaining element after those index will be copied as it is again.
        */
        int[] newArr=new int[a.length-1];
        for (int j = 0; j < a.length; j++) {
            //1 current index in lesser than our index then
            if(j<i){
                newArr[j]=a[j];
            }
            //2 we got index
            else if (j==i) {
                //skipping the element
                continue;
            }
            //3 remaining as it is copied
            else{
                newArr[j-1]=a[j];
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
//        WE have an array some of the elements and those element will be sorted or unsorted.
//        we have remove/delete perticular index variable with given index. and return new ARRAY as result.

     int[] A={1,5,6,-2,3,8,6,8};
     int index=A.length-1;
     int n=A.length;
        System.out.println(Arrays.toString(removeElementWIthIndex(A,index,n)));
    }
}
