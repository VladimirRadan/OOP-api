package main;

import vw.Automobil;

public class Main {


    public static void main(String[] args) {




//
//        vw.Automobil buba = new vw.Automobil("Buba", "Bela", 90, 1500);
//        System.out.println(buba);
//        new vw.Automobil("Buba", "Bela", 90, 1500).ispisAutomobila();
//
//
//        vw.Automobil buba2 = new vw.Automobil("Buba", "Bela", 90, 1500);
//        buba2.kubikaza = 3000;
//        vw.Automobil buba3 = new vw.Automobil("Buba", "Bela", 90, 1500);
//        new vw.Automobil("Buba", "Bela", 90, 1500);
//        buba.ispisAutomobila();
//
//        buba.kubikaza = 2000;
//        System.out.println("Buba nakon friziranja: " + buba);
//        System.out.println("Buba2 nakon friziranja: " + buba2);

        //Automobil automobil = new Automobil();
        //automobil.setHp(20);

        //System.out.println(automobil.saberiDvaBroja(5,5) + 50);

//        System.out.println(automobil.ispisAutomobila());
//        automobil.frizirajMotor();
//        System.out.println(automobil.frizirajMotor());
//        System.out.println(automobil);


        Automobil fica = new Automobil("Fica", "Crvena", 50, 750);
        System.out.println(fica);

        Automobil traktor = new Automobil("IMT", 35, 1000);
        traktor.setBoja("Crvena");
        System.out.println("Boja traktora: " + traktor.getBoja());

        Automobil golf = null;
        golf.automobil();
        golf.setModel("Golf");
        golf.setBoja("Zuta");
        golf.setKubikaza(1000);
        golf.setHp(75);
        System.out.println("Boja golfa je: " + golf.getBoja());
        System.out.println("Snaga golfa je: " + golf.getHp());

        System.out.println(golf);


    }


}
