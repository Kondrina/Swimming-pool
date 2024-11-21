public class Main {
    public static void main(String[] args) {

// Вроде бы как здесь должны были сохраниться мои изменения в stash, но кажется они потерялись
// в прошлый раз писала, что должен приехать паша, но это куда-то пропало... сегодня должна приехать Наташа.
// Сегодня очень много флэш беков в прошлое... хочется с кем-то поделиться и рассказать как мне плохо и больно от того,
// что у меня встает на свои места... Это ужасно, когда какие-то вспышки из прошлого обретают осознание.


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
        System.out.println("Хочу пойти кататься на скейте");
        System.out.println("Добавили еще коммент для объединения веток");
<<<<<<< HEAD

        System.out.println("Написали по проекту Ухожу красиво");
        System.out.println("Будет сбор 27-ого числа");
=======
>>>>>>> parent of 38bb9c3 (commi o sobranii)
    }
}
