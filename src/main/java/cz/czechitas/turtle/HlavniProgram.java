
package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    Turtle zofka = new Turtle();
    public void start() {
        /*Color zelenaBarva;
        zelenaBarva=new Color(69,139,0);

        zofka.setLocation(100.0,100.0);
        nakresliBarevnyRovnostrannyTrojuhelnik(50.0,zelenaBarva);

        zofka.setLocation(200.0,100.0);
        nakresliBarevnyCtverec(50, new Color(0,127,255));

        zofka.setLocation(350,100);
        nakresliBarevnyObdelnik(50,100, new Color(123,24,133));

        zofka.setLocation(425,100);
        nakresliBarevneKolecko(new Color(150,0,0));*/

        //BORUVKOVA ZMRZLINA
        zofka.setLocation(200,100);
        nakresliBarevneKolecko(0.45, new Color(138,43,226));
        zofka.setLocation(199,107);
        nakresliBarevnyRovnostrannyTrojuhelnik(50,new Color(210,105,30));

        //SNEHULAK
        zofka.setLocation(330,100);
        nakresliBarevneKolecko(0.7,new Color(1,0,0));
        zofka.setLocation(350,203);
        nakresliBarevneKolecko(1, Color.black);
        zofka.setLocation(375,332);
        nakresliBarevneKolecko(1.3, Color.black);
        zofka.setLocation(390,230);
        nakresliBarevneKolecko(0.5, Color.black);
        zofka.setLocation(250,230);
        nakresliBarevneKolecko(0.5,Color.black);

        //NAKLADAK
        zofka.setLocation(660,400);
        nakresliBarevnyObdelnik(100,200,Color.black);
    }

    public void nakresliBarevnyRovnostrannyTrojuhelnik(double velikostStrany,Color color) {
        zofka.setPenColor(color);
        zofka.setPenWidth(3);
        zofka.setSpeed(90);
        zofka.turnLeft(90.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velikostStrany);
    }
    public void nakresliBarevnyCtverec(double velikost, Color color) {
        zofka.setPenColor(color);
        zofka.setPenWidth(3);
        zofka.setSpeed(90);
        zofka.penDown();
        for (int i = 0; i < 4; i++) {
            zofka.move(50);
            zofka.turnLeft(90);
        }
        zofka.penUp();
    }
    private void nakresliBarevnyObdelnik(double i, double i1, Color color) {
        zofka.setPenColor(color);
        zofka.setPenWidth(3);
        zofka.setSpeed(90);
        zofka.penDown();
        zofka.move(i);
        zofka.turnLeft(90);
        zofka.move(i1);
        zofka.turnLeft(90);
        zofka.move(i);
        zofka.turnLeft(90);
        zofka.move(i1);
        zofka.penUp();
    }

    private void nakresliBarevneKolecko(double u,Color color){
        zofka.setPenColor(color);
        zofka.setPenWidth(3);
        zofka.setSpeed(90);
        zofka.penDown();
        for (var o = 0; o < 360; o++) {
            zofka.move(u);
            zofka.turnLeft(1); }
    }
    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}