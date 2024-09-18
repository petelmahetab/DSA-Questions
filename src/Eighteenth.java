public class Eighteenth {
    public static void main(String[] args) {
        //Find MAXIMUM Sub-Array in given array.
        //Sub array is contiguous array is an sub part of array elements are come after one other.
        //Bruteforce approach means Worst Case Complexity.
        int[] MyArry={10,20,36,5,89,23,0};
        //1 loop start with 0
        //2 end to start
        //3 print 3 loop form start form 1 loop to end 2 loop

        //we uses 3 loops here so COMPLEXITY will be  0(n^3)

        for (int st = 0; st < MyArry.length; st++) {
            for (int end = st; end <MyArry.length ; end++) {
                for (int ls = st; ls <end ; ls++) {
                    System.out.print(" "+MyArry[ls]);
                }
                System.out.println();
            }
        }

    }
}
