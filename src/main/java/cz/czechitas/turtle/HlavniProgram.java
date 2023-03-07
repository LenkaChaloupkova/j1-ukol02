
package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    Turtle zofka = new Turtle();

    public void start() {
        zofka.setPenWidth(3);
//        zofka.setSpeed(90);

        nakresliZmrzlinu();

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

    public void nakresliBarevnyRovnostrannyTrojuhelnik(double velikostStrany, Color color) {
        zofka.setPenColor(color);

        zofka.turnLeft(90.0);
        zofka.move(velikostStrany);
        for (int i = 0; i < 3; i++) {
            zofka.turnLeft(120);
            zofka.move(velikostStrany);
        }
    }
    public void nakresliBarevnyCtverec(double velikost, Color color) {
        zofka.setPenColor(color);

        zofka.penDown();
        for (int i = 0; i < 4; i++) {
            zofka.move(velikost);
            zofka.turnLeft(90);
        }
        zofka.penUp();
    }

    private void nakresliBarevnyObdelnik(double delkaStranyA, double delkaStranyB, Color color) {
        zofka.setPenColor(color);

        zofka.penDown();
        zofka.move(delkaStranyA);

        zofka.turnLeft(90);
        zofka.move(delkaStranyB);
        zofka.turnLeft(90);
        zofka.move(delkaStranyA);
        zofka.turnLeft(90);
        zofka.move(delkaStranyB);
        zofka.penUp();
    }

    private void nakresliBarevneKolecko(double delkaStrany, Color color) {
        zofka.setPenColor(color);

        zofka.penDown();
        for (var o = 0; o < 360; o++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(1); }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}