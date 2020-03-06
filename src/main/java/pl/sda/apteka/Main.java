package pl.sda.apteka;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Lekarstwa lekarstwa = new Lekarstwa();

        lekarstwa.cena("apap", true);

        lekarstwa.cena("paracetamol", true);

        lekarstwa.cena("ibuprom", true);


        lekarstwa.maksymalnaRefundacja();

        lekarstwa.kosztCalkowity();

        lekarstwa.wyswietl("Lekarstwa:");
    }
}


