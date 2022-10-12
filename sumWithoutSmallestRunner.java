public class sumWithoutSmallestRunner {
    public static void main(String[] args) {


        final int LENGTH=10;

        int nums[]=new int[LENGTH];
        for(int i=0;i< nums.length;i=i+1){
            nums[i]= (int)(Math.random()*100);
        }

        sumWithoutSmallest ob=new sumWithoutSmallest();
        System.out.println("Numbers");
        for(int num:nums)
            System.out.print(num+" ");
        System.out.println("\nDifference between total number and smallest num");
        System.out.println(ob.addtionOfNums(nums));
    }
}
