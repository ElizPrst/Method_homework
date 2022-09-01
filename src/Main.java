// Task 1
public class Main {

    public static int methodRandomYears(){

        java.util.Random random = new java.util.Random();
        int min = 1800;
        int max = 2023;
        int diff = max - min;
        int randomYears = random.nextInt(diff)+ min;
        return randomYears;
    }


    public static void main (String[] args){
        int randomYears= methodRandomYears();

        if ( (randomYears % 4 ==0) && randomYears % 100!=0)
        {
            System.out.println(randomYears+ " год является високосным");}
        else if ( (randomYears % 4 ==0) && randomYears % 100!=0&& (randomYears % 400 == 0))
        {
            System.out.println(randomYears+ " год является високосным");}
        else
            System.out.println(randomYears+" год не является високосным");}
}
