public class sumWithoutSmallest {
    public sumWithoutSmallest() {
    }

    public int addtionOfNums(int array[] ) {
        int smallest=array[0];
        int sum=0;
        int difference;
        for(int i=1;i< array.length;i++){
            if(smallest>array[i])
            {
                sum=sum+smallest;
                smallest=array[i];
            }
            else
                sum=sum+array[i];

        }
        difference=sum-smallest;

        return difference;
    }
}
