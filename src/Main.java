
public class Main {
    public static void main (String[] args){
        System.out.println("Task 1");
        methodLeapYear(methodRandomYears());


        System.out.println ("Task 2");
        methodDriverOs(methodRandomOs(),methodRandomYearsPhone());


        System.out.println ("Task 3");
        printDelivery(methodDeliveryDistance());
    }


    // Task 1
    public static int methodRandomYears(){

            java.util.Random random = new java.util.Random();
            int min = 1800;
            int max = 2023;
            int diff = max - min;
            int randomYears = random.nextInt(diff)+ min;
            return randomYears;
    }
    public  static void methodLeapYear(int randomYears){

            if ( (randomYears % 4 ==0) && randomYears % 100!=0 || (randomYears % 400 == 0)==true)
            { System.out.println( randomYears +" год является високосным");}
            else
            { System.out.println(randomYears +" год не является високосным");}
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
    public static void methodDriverOs( int methodRandomOs,int randomYearsPhone){

    String version =randomYearsPhone < 2015 ? "облегченную":"";
    String versionOs = methodRandomOs== 0 ? "OS":"Android";

        System.out.printf ("Установите %s версию приложения для %s по ссылке ",version,versionOs);
        System.out.println();
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
    public static void printDelivery(int deliveryDistance) {
    int deliveryDays = 1;

    if ( deliveryDistance > 60){deliveryDays =(Math.abs(deliveryDistance-60)+2);
    }
                    System.out.println("Потребуется дней: "+ deliveryDays );


}
}

