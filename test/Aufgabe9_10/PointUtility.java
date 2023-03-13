package Aufgabe9_10;

public class PointUtility {

        private PointUtility() {
            // Private constructor to prevent instantiation of the utility class
        }
    /**
     * Adds two Punkt objects together and returns a new Punkt object with the sum
     * of their x- and y-coordinates.
     *
     * @param p1 the first Punkt object
     * @param p2 the second Punkt object
     * @return a new Punkt object with the sum of the x- and y-coordinates of p1 and p2
     */

        public static Punkt addiere(Punkt p1, Punkt p2) {
            double x = p1.getX() + p2.getX();
            double y = p1.getY() + p2.getY();
            return new Punkt(x, y);
        }
    }

