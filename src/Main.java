
public class Main {

    // Task 1
    public static int methodRandomYears(){

            java.util.Random random = new java.util.Random();
            int min = 1800;
            int max = 2023;
            int diff = max - min;
            int randomYears = random.nextInt(diff)+ min;
            return randomYears;
    }
    public  static boolean methodLeapYear(){

        int randomYears= methodRandomYears();
        return (randomYears % 4 ==0) && randomYears % 100!=0 || (randomYears % 400 == 0);
    }
    // Task 2
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
        int max = 2;
        int diff = max - min;
        int methodRandomOs = random.nextInt(diff)+ min;
        return methodRandomOs;
    }
        public static void printOs() {

            int methodRandomOs =methodRandomOs();
            int randomYearsPhone = methodRandomYearsPhone();

            if (methodRandomOs == 1 && randomYearsPhone> 2015)
                System.out.println("Установите версию приложения для iOS по ссылке");
            if (methodRandomOs== 1 && randomYearsPhone < 2015)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else
            if (methodRandomOs == 0 && randomYearsPhone > 2015)
                System.out.println("Установите версию приложения для Android по ссылке");
            if (methodRandomOs == 0 && randomYearsPhone < 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");

        }

    // Task 3
    public static int methodDeliveryDistance(){
        java.util.Random random = new java.util.Random();
        int min = 1;
        int max = 65;
        int diff = max - min;
        int methodDeliveryDistance = random.nextInt(diff)+ min;
        return methodDeliveryDistance;
    }
    public static void printDelivery() {
    int deliveryDistance = methodDeliveryDistance();
    int deliveryDays = 1;

    if ( deliveryDistance > 20)
    deliveryDays++;

    if ( deliveryDistance > 60)
    deliveryDays++;
                    System.out.println("Потребуется дней: "+ deliveryDays );
    }

    public static void main (String[] args){
        System.out.println("Task 1");

        if ( methodLeapYear()==true)
        { System.out.println(methodRandomYears()+ " год является високосным");}
            else
        { System.out.println(methodRandomYears()+" год не является високосным");}

    System.out.println ("Task 2");

    printOs();


    System.out.println ("Task 3");

    printDelivery();


                    }
                }

