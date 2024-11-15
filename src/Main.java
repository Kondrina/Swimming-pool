public class Main {
    public static void main(String[] args) {

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

                break;
            }
            System.out.println("Выберите пункт доставкиЖ ");
        }
        System.out.println("Типо добавили вторую кнопку");
        System.out.println("типо добавили третью кнопку");
    }
}
