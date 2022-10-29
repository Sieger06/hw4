public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание 1");
        System.out.println("Задача 1");

        int age = 3;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил");
        }
        System.out.println();

        System.out.println("Задача 2");
        int ChildrenAge = 25;
        if (ChildrenAge <= 7) {
            System.out.println("Ребёнок ходит в школу.");
        }
        if (ChildrenAge >= 18 && ChildrenAge < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (ChildrenAge > 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        System.out.println();

        System.out.println("Задача 3");
        int passenger = 105;
        int places = 102;
        int SeatPlaces = 60;
        int StayPlaces = places - SeatPlaces;
        if (passenger <= 60) {
            System.out.println("Ваше место сидячее.");
        }
        if (passenger > 60 && passenger <= 102) {
            System.out.println("Ваше место стоячее");
        }
        if (passenger > 102) {
            System.out.println("Мест нет.");
        }

        System.out.println();
        System.out.println("Домашнее задание 2");
        System.out.println("Задача 1");
        int PersonAge = 5;
        if (PersonAge > 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннослетия ещё не наступил");
        }
        System.out.println();
        System.out.println("Задача 2");
        int ChilAge = 30;
        if (ChilAge < 18 && ChilAge >= 7) {
            System.out.println("Ребёнок ходит в школу.");
        } else {
            if (ChilAge >= 18 && ChilAge < 24) {
                System.out.println("Человек уже закончил школу, и может отправляться университет");
            } else {
                System.out.println("Человек закончил университет, пора на работу.");
            }
        }
        System.out.println();

        System.out.println("Задача 3");
        int passengers = 20;
        int TotalSeatPlaces = 60;
        int TotalStayPlasec = 42;
        if (passengers <= 60) {
            System.out.println("Ваше место сидячее");
        }
        if (passengers > 60 && passengers <= 102) {
            System.out.println("Ваше место стоячее");
        } else {
            if (passengers > 60 && passengers <= 102) {
                System.out.println("Ваше место стоячее");
            } else {
                if (passengers > 102) {
                    System.out.println("Мест нет.");
                }
            }
        }
        System.out.println();
        System.out.println("Домашнее задание 3");
        System.out.println("Задача 1");
        int years = 4;
        if (years >= 2 && years < 7) {
            System.out.println("Если возраст человека равен " + years + " лет, то ему нужно ходить в детский сад");
        } else {
            if (years > 7 && years < 18) {
                System.out.println("Если возраст человека равен " + years + " лет, то ему нужно ходить в школу");
            } else {
                if (years > 18 && years < 24) {
                    System.out.println("Если возраст человека равен " + years + " лет, то ему нужно ходить в университет");
                } else {
                    if (years > 24) {
                        System.out.println("Если возраст человека равен " + years + " лет, то ему пора ходить на работу");
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Задача 2");
        int ChildYears = 13;
        if (ChildYears <= 5) {
            System.out.println("Ребёнок не может кататься на аттракционе");
        } else {
            if (ChildYears > 5 && ChildYears < 14) {
                System.out.println("Ребёнок может кататься только в сопровождении взрослого");
            } else {
                System.out.println("Ребёнок может кататься один");
            }
        }

        System.out.println();
        System.out.println("Задача 3");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two) {
            if (one > three) {
                System.out.println("Максимальное чилсо - " + one);
            } else if (three > one){
                System.out.println("Максимальное число - " + three);
            } else {
                System.out.println("Числа " + one + " и " + three + " равны");
            }
        } else {
            if (one >three) {
                System.out.println("Максимальное число - " + one);
            } else if (three > one) {
                System.out.println("Максимальоне число - " + three);
            } else {
                System.out.println("Все числа равны");
            }
        }
    }
}