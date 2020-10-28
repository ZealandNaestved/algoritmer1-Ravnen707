import java.util.Random;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms1 {

//done   // TODO 1 - Gennemse Data klassen, og skriv gode kommentarer til det

//done    // TODO 2 - Skriv en randomBoyName() metode i Algorithms1, som returnerer et tilfældigt drengenavn fra Data klassens randomDrengeNavne property OBS: randomDrengeNavne skal forblive private!

    // TODO 3 - Skriv en test til randomBoyName() metoden HINT: Se metoden exampleOfPredictableRandomNumber() for at se, hvordan du kan lave et tilfældigt nummer som er altid det samme (til test)

//done    // TODO 4 - Skriv en randomGirlName() metode i Algorithms1, som returnerer et tilfældigt pigenavn fra Data klassen

    // TODO 5 - Skriv en randomName() metode i Algorithms1, som laver et sammenlagt array som indeholder både piger og drenge, og returnerer det

    // TODO 6 - Skriv en test til randomName() metoden

    // TODO 7 - Skriv en random bogstavs-generator metode (du kan tage udgangspunkt i randomNumbers() i Data)

    // TODO 8 - Skriv en  plet eller krone generator metode (plet er boolean true og krone er boolean false)

    public static void main(String[] args) {
        exampleOfPredictableRandomNumber();
        randomBoyName();
        randomGirlName();
        randomBothName();

    }

    private static void exampleOfPredictableRandomNumber() {
        Random random = new Random();
        random.setSeed(15015L); // Hvis vi angiver et seed som et long number, vil random klassen altid generere det samme tal, i det her tilfælde 21
        System.out.print("Hvis vi bruger seed, vil random altid returnere de samme værdier, f.eks. giver denne 21 --> ");
        System.out.println(random.nextInt(45));
    }
    public static void randomBoyName(){
        Random rand = new Random();
        int rng = rand.nextInt(44);
        String[] names = new Data().getRandomDrengeNavne();
        System.out.println(names[rng]);

    }
    public static void randomGirlName() {
        Random rand = new Random();
        int randomGenerator = rand.nextInt(44);
        String[] names = new Data().getRandomPigeNavne();
        System.out.println(names[randomGenerator]);
    }
    public static void randomBothName(){
        Random rand = new Random();
        int rngBoth = rand.nextInt(44);
        String[] names = new Data().getRandomPigeNavne();
        String[] names1 = new Data().getRandomDrengeNavne();
        System.out.println(names[rngBoth] + " + " + names1[rngBoth]);
    }
}
