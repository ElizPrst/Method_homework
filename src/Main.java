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
            System.out.println(randomYears+" год не является високосным");

        //Task 2
    int methodRandomOs =methodRandomOs();
    int randomYearsPhone = methodRandomYearsPhone();
        if (methodRandomOs == 1 && randomYearsPhone> 2015)
            System.out.println("Установите версию приложения для iOS по ссылке");
        if (methodRandomOs== 1 && randomYearsPhone < 2015)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        else {
            if (methodRandomOs == 0 && randomYearsPhone > 2015)
                System.out.println("Установите версию приложения для Android по ссылке");
            if (methodRandomOs == 0 && randomYearsPhone < 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int methodRandomYearsPhone(){

        java.util.Random random = new java.util.Random();
        int min = 2000;
        int max = 2023;
        int diff = max - min;
        int randomYearsPhone = random.nextInt(diff)+ min;
        return randomYearsPhone;
    }
        public static int methodRandomOs(){

            java.util.Random random = new java.util.Random();
            int min = 1;
            int max = 3;
            int diff = max - min;
            int methodRandomOs = random.nextInt(diff)+ min;
            return methodRandomOs;
    }
}
