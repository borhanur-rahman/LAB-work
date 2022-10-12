import java.lang.Math;
public class ArrayManipulation {
        public static void main(String[] args) {
            final int LENGTH=10;

            int nums[]=new int[LENGTH];
            for(int i=0;i< nums.length;i=i+1){
                nums[i]= (int)(Math.random()*100);
            }

            for(int i=0;i< nums.length;i=i+2){
                System.out.print(nums[i]+" ");
            }
            System.out.println();
            for(int i=0;i< nums.length;i=i+1){
                if(nums[i]%2==0)
                    System.out.print(nums[i]+" ");
            }
            System.out.println();
            for(int i=nums.length-1;i>=0 ;i=i-1){
                System.out.print(nums[i]+" ");
            }
            System.out.println("\n"+nums[0]+" "+nums[nums.length-1]);
        }
    

}
