public class Main {
    public static void main(String[] args) {
//    Задание 3
//    Цель задания
//    Познакомиться с принципами работы цикла while и закрепить их на практике.
//
//    Что нужно сделать
//    + Создайте новый проект и назовите его SwimmingPool.
//    + Создайте переменную int volume, в которой будет храниться объём бассейна, и установите её равной 1200.
//    Представьте, что система наполняет бассейн со скоростью 30 литров в минуту, но у бассейна не отключён слив, и
//    через него каждую минуту выливается 10 литров.
//    + Создайте ещё две переменные, в которых будут храниться эти значения:
//    + int fillingSpeed = 30; //30 litres per minute
//    + int devastationSpeed = 10; //10 litres per minute
//    Напишите программу с использованием цикла while, которая рассчитает и выведет в консоль время наполнения бассейна
//    с учётом скоростей наполнения и опустошения.

//    Рекомендации по выполнению
//
//    Создайте переменную, в которой будет храниться текущий объём бассейна, и каждую итерацию цикла добавляйте к нему
//    fillingSpeed и вычитайте из него devastationSpeed. Как только текущий объём бассейна станет равен значению
//    переменной volume, выполните команду break. В процессе выполнения цикла считайте количество итераций — это и будет
//    время наполнения бассейна.

        int volume = 1200; // litres
        int fillingSpeed = 30; // 30 litres per minute
        int devastationSpeed = 10; // 10 litres per minute
        int currentPoolVolume = 0; // 0 litres

        while (true) {
            if (currentPoolVolume < volume) {
                currentPoolVolume = currentPoolVolume + (fillingSpeed - devastationSpeed);
                System.out.println("Бассейн наполнен на: " + currentPoolVolume);

            } else {
                System.out.println("Бассейн наполнен полностью");
                System.out.println("В бассейне можно купаться");

                break;
            }
        }

    }
}
