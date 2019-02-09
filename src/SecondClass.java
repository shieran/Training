public class SecondClass {
    public static double getNum(double[] num, int ind){
        double someNumber = 0;
       try {
           if (ind >= 0){
               someNumber = num[ind];
           }else{
               someNumber = num.length + ind;
           }
       }catch (IndexOutOfBoundsException e){
           System.out.println(e.getMessage());
       }
       return someNumber;
    }
}
