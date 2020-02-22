package com.unis.obj;

import com.unis.utils.StdDraw;

/**
 * @author: lengyhua
 * @create at: 2020/2/9 16:34
 * @description:
 */
public class Interval2D {
    private final Interval1D x;
    private final Interval1D y;

    /**
     * Initializes a two-dimensional interval.
     * @param x the one-dimensional interval of x-coordinates
     * @param y the one-dimensional interval of y-coordinates
     */
    public Interval2D(Interval1D x, Interval1D y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Does this two-dimensional interval intersect that two-dimensional interval?
     * @param that the other two-dimensional interval
     * @return true if this two-dimensional interval intersects
     *    that two-dimensional interval; false otherwise
     */
    public boolean intersects(Interval2D that) {
        if (!this.x.intersects(that.x)) return false;
        if (!this.y.intersects(that.y)) return false;
        return true;
    }

    /**
     * Does this two-dimensional interval contain the point p?
     * @param p the two-dimensional point
     * @return true if this two-dimensional interval contains the point p; false otherwise
     */
    public boolean contains(Point2D p) {
        return x.contains(p.x())  && y.contains(p.y());
    }

    /**
     * Returns the area of this two-dimensional interval.
     * @return the area of this two-dimensional interval
     */
    public double area() {
        return x.length() * y.length();
    }

    /**
     * Returns a string representation of this two-dimensional interval.
     * @return a string representation of this two-dimensional interval
     *    in the form [xmin, xmax] x [ymin, ymax]
     */
    public String toString() {
        return x + " x " + y;
    }

    /**
     * Does this interval equal the other interval?
     * @param other the other interval
     * @return true if this interval equals the other interval; false otherwise
     */
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null) return false;
        if (other.getClass() != this.getClass()) return false;
        Interval2D that = (Interval2D) other;
        return this.x.equals(that.x) && this.y.equals(that.y);
    }


    /**
     * Returns an integer hash code for this interval.
     * @return an integer hash code for this interval
     */
    public int hashCode() {
        int hash1 = x.hashCode();
        int hash2 = y.hashCode();
        return 31*hash1 + hash2;
    }

    /**
     * Draws this two-dimensional interval to standard draw.
     */
    public void draw() {
        double xc = (x.min() + x.max()) / 2.0;
        double yc = (y.min() + y.max()) / 2.0;
        StdDraw.rectangle(xc, yc, x.length() / 2.0, y.length() / 2.0);
    }
}