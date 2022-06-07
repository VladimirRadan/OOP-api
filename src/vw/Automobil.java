package vw;

public class Automobil {

        //polja
    //public protected private default - modifikatori pristupa
    private String model;
    private String boja;
    private int hp;
    private int kubikaza;

    //mehanizam za kreiranje objekta -> konstruktor

    public Automobil(String model, String boja, int hp, int kubikaza) {
        this.model = model;
        this.boja = boja;
        this.hp = hp;
        this.kubikaza = kubikaza;
    }

    public Automobil(String model, int hp, int kubikaza) {
        this.model = model;
        this.hp = hp;
        this.kubikaza = kubikaza;
    }

    private Automobil(){}


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getKubikaza() {
        return kubikaza;
    }

    public void setKubikaza(int kubikaza) {
        this.kubikaza = kubikaza;
    }



    public int frizirajMotor(){
        return this.hp + 20;
    }

    public int saberiDvaBroja(int a, int b){
        return a + b;
    }



    //metode -> ono sto objekat moze da izvrsava ili ispis objekta
    public String ispisAutomobila(){
        return "Model: " + this.model + " Boja: " + boja + " Snaga: " + hp + " Kubikaza: " + kubikaza;
    }


    @Override
    public String toString() {
        return "Automobil{" +
                "model='" + model + '\'' +
                ", boja='" + boja + '\'' +
                ", hp=" + hp +
                ", kubikaza=" + kubikaza +
                '}';
    }

    public Automobil automobil(){
        return new Automobil();
    }


}
