public class Main {
    public static void main(String[] args) {

// Вроде бы как здесь должны были сохраниться мои изменения в stash, но кажется они потерялись
// в прошлый раз писала, что должен приехать паша, но это куда-то пропало... сегодня должна приехать Наташа


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
        System.out.println("Типо поменяла цвет заголовка на зеленый");
    }
}
