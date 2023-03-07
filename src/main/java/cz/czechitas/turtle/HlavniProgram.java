
package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    Turtle zofka = new Turtle();

    public void start() {
        zofka.setPenWidth(3);
//        zofka.setSpeed(80);

        nakresliZmrzlinu();

        //SNEHULAK
        nakresliSnehulaka();

        //MASINKA
        nakresliMasinku();
    }

    private void nakresliSnehulaka() {
        zofka.penDown();

        zofka.setLocation(350,50);
        zofka.turnLeft(90);
        nakresliBarevneKolecko(15, Color.black);
        zofka.setLocation(350,135);
        nakresliBarevneKolecko(25, Color.black);
        zofka.setLocation(350,275);
        nakresliBarevneKolecko(35,Color.black);
        zofka.turnRight(90);
        zofka.setLocation(465,205);
        nakresliBarevneKolecko(10, Color.black);
        zofka.setLocation(265,205);
        nakresliBarevneKolecko(10,Color.black);

        zofka.penUp();
    }

    private void nakresliZmrzlinu() {
        zofka.penDown();

        zofka.setLocation(200, 100);
        nakresliBarevneKolecko(10, new Color(138, 43, 226));
        zofka.setLocation(143, 105);
        zofka.turnLeft(90.0);
        nakresliBarevnyRovnostrannyTrojuhelnik(57, new Color(210, 105, 30));
        zofka.turnRight(90);

        zofka.penUp();
    }

    private void nakresliMasinku() {
        // telo masinky
        zofka.turnLeft(90);
        zofka.setLocation(720, 310);
        nakresliBarevnyObdelnik(200, 100, Color.black);
        zofka.turnRight(90);
        zofka.setLocation(zofka.getX() + 100, zofka.getY() + 100);
        nakresliBarevnyObdelnik(200, 100, Color.black);
        zofka.turnRight(90);
        //kolecka
        zofka.turnLeft(90);
        nakresliBarevneKolecko(17, Color.CYAN);
        zofka.setX(zofka.getX() - 160);
        zofka.turnLeft(90);
        nakresliBarevneKolecko(7, Color.black);
        zofka.setX(zofka.getX() - 80);
        nakresliBarevneKolecko(7, Color.black);
        zofka.setX(zofka.getX() - 60);
        zofka.turnRight(90);
        zofka.setY(zofka.getY() - 50);
        nakresliBarevnyRovnostrannyTrojuhelnik(80, Color.BLUE);
    }

    public void nakresliBarevnyRovnostrannyTrojuhelnik(double velikostStrany, Color color) {
        zofka.setPenColor(color);
        zofka.penDown();

        for (int i = 0; i < 3; i++) {
            zofka.turnLeft(120);
            zofka.move(velikostStrany);
        }

        zofka.penUp();
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

        for (int i = 0; i < 2; i++) {
            zofka.move(delkaStranyA);
            zofka.turnLeft(90);
            zofka.move(delkaStranyB);
            zofka.turnLeft(90);
        }

        zofka.penUp();
    }

    private void nakresliBarevneKolecko(double delkaStrany, Color color) {
        zofka.setPenColor(color);

        zofka.penDown();
        for (var o = 0; o < 18; o++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(20);
        }
        zofka.penUp();
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}