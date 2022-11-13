package zajecia;

import java.util.Scanner;

public class Uczen {

    public String imie;
    public String nazwisko;
    private int[] matematyka  = new int[4];
    private int[] jpolski = new int[4];
    private int[] jangielski  = new int[4];
    private int[] informatyka = new int[4];

    public Uczen(int[] matematyka, int[] jpolski, int[] jangielski, int[] informatyka) {
        this.matematyka = new int[4];
        this.jpolski = new int[4];
        this.jangielski = new int[4];
        this.informatyka = new int[4];
    }

    public Uczen(String imie){
        this.imie=imie;
    }

     public void jakieImie() {
        System.out.println(this.imie);
    }

    public void dodajOceneMatematyka() {

        Scanner scanner = new Scanner(System.in);

        for (int i=0; matematyka[i]!=0; i++) {
            if (i>=matematyka.length) {
                System.out.println("Brak miejsca");break;
            }
            else matematyka[i] = scanner.nextInt();break;
        }
    }

    public void dodajOceneJpolski() {
        Scanner scanner = new Scanner(System.in);
        for (int i=0; jpolski[i]!=0; i++) {
            if (i>=jpolski.length) {
                System.out.println("Brak miejsca");break;
            }
            else jpolski[i] = scanner.nextInt();break;
        }
    }

    public void dodajOceneJangielski() {
        Scanner scanner = new Scanner(System.in);
        for (int i=0; jangielski[i]!=0; i++) {
            if (i>=jangielski.length) {
                System.out.println("Brak miejsca");break;
            }
            else jangielski[i] = scanner.nextInt();break;
        }
    }

    public void dodajOceneInformatyka() {
        Scanner scanner = new Scanner(System.in);
        for (int i=0; informatyka[i]!=0; i++) {
            if (i>=informatyka.length) {
                System.out.println("Brak miejsca");break;
            }
           else informatyka[i] = scanner.nextInt();break;
        }
    }

    public void wyswietlOceny() {

        String ocenyMat = "";

        for (int i=0; i<4; i++){
            if (matematyka[i]!=0) {
                ocenyMat += matematyka[i];
            }
        }
        System.out.print(ocenyMat);
    }

    public void sredniaUczniaMat() {
        float sumaMat = 0;
        for (int i=0; i<matematyka.length; i++)     {
            if (matematyka[i]!=0) {
            sumaMat+=matematyka[i];
            }
            float sredniaMat = (sumaMat/(matematyka.length));
        }
    }

    public void sredniaUczniaPol() {
    float sumaPol = 0;
    for (int i=0; i<jpolski.length; i++) {
        if (jpolski[i]!=0) {
            sumaPol+=jpolski[i];
        }
        float sredniaPol = (sumaPol/(jpolski.length))  ;
    }
 }

 public void sredniaUczniaAng() {
        float sumaAng = 0;
        for (int i=0; i< jangielski.length; i++)  {
            if (jangielski[i]!=0)  {
                sumaAng+=jangielski[i];
            }
            float sredniaAng = sumaAng/jangielski.length;)
        }
 }

 public void sredniaUczniaInf() {
        float sumaInf = 0;
        for (int i=0; i< informatyka.length; i++) {
            if (informatyka[i]!=0)  {
                sumaInf+=informatyka[i];
            }
            float sredniaInf = (sumaInf/ informatyka.length));

public void sredniaUcznia() {
    float srednia;
            }
        }
 }

}