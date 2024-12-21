public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("дз циклы 1");
        System.out.println();
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i = i - 1){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096 ; i = i + 4) {
            if ((i % 100 != 0) || (i % 400 == 0)){
                System.out.println(i + " год является високосным");
            }
        }
        System.out.println();
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i +7){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача 8");
        int money = 29000;
        for (int i = 1; i <= 12; i++){
            System.out.println("Месяц " + i + ", сумма накоплений равна " + money + " рублей");
            money = money + 29000;
        }
        System.out.println();
        System.out.println("Задача 9");
        money = 29000;
        for (int i = 1; i <= 12; i++){
            System.out.println("Месяц " + i + ", сумма накоплений равна " + money + " рублей");
            money = money + 29000 + money/100;
        }
        System.out.println();
        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++){
            System.out.println("2*"+ i + "=" + 2 * i);
        }
        //дз циклы 2
        System.out.println();
        System.out.println("дз циклы 2");
        System.out.println();
        System.out.println("Задача 1");
        money = 0;
        int month = 0;
        while (money <= 2_459_000){
            money = money + 15000;
            money = money + money/100;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
        }
        System.out.println();
        System.out.println("Задача 2.1");
        int o = 0;
        while (o < 10){
            o++;
            System.out.print(o);
            System.out.print(" ");
        }
        System.out.println();
        for (; o >= 1; o--){
            System.out.print(o);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Задача 2.2");
        for (o = 1; o <= 10; o++){
            System.out.print(o);
            System.out.print(" ");
        }
        System.out.println();
        o = 11;
        while (o > 1){
            o--;
            System.out.print(o);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Задача 3");
        int population = 12_000_000;
        int year = 2024;
        int birthRate = 17;
        int mortalityRate= 8;

        while (year <=2034){
            year++;
            int populationGrowth = (population * birthRate / 1000) - (population * mortalityRate / 1000);
            population = population + populationGrowth;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println();
        System.out.println("Задача 4");
        int deposit = 15000;
        month = 1;
        do {
            month++;
            deposit = deposit + (deposit/100 * 7);
            System.out.println("В месяц " + month + " будет накоплено " + deposit);

        }while (deposit <= 12_000_000);
        System.out.println();
        System.out.println("Задача 5");
        deposit = 15000;
        month = 1;
        do {
            month++;
            deposit = deposit + (deposit/100 * 7);
            if (month % 6 == 0){
                System.out.println("В месяц " + month + " будет накоплено " + deposit);
            }

        }while (deposit <= 12_000_000);
        System.out.println();
        System.out.println("Задача 6");
        deposit = 15000;
        for (int i = 1;i <= 108; i++){
            deposit = deposit + (deposit/100 * 7);
            if (i % 6 == 0){
                System.out.println("В месяц " + i + " будет накоплено " + deposit);
            }
        }
        System.out.println();
        System.out.println("Задача 7");
        int firstFriday = 4;
        while (firstFriday < 32){
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
            firstFriday = firstFriday + 7;
        }
        System.out.println();
        System.out.println("Задача 8");
        int yearCometPassage = 79;
        int beginningCalculation = 1824;
        int endCalculation = 2124;
        year = 0;
        do {
            year = year + yearCometPassage;
        }while (year < beginningCalculation);
        do {
            System.out.println(year);
            year = year + yearCometPassage;
        }while (year < endCalculation);

    }
}