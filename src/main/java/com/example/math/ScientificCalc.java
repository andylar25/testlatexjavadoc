package com.example.math;

/**
 * A utility class for performing scientific calculations with LaTeX documentation.
 * <p>
 * This class demonstrates how to integrate LaTeX equations into Javadoc
 * using <b>MathJax</b>.
 * * <h2>Mathematical Concepts</h2>
 * The calculations here rely on standard geometric and algebraic formulas.
 * For example, the relationship between energy and mass is given by:
 * \[ E = mc^2 \]
 */
public class ScientificCalc {

    /**
     * Default constructor.
     */
    public ScientificCalc() {
      // Default constructor
    }

    /**
     * Calculates the area of a circle given its radius.
     * <p>
     * The formula for the area \( A \) of a circle with radius \( r \) is: \[ A = \pi r^2 \]
     *
     * @param radius The radius of the circle \( r \)
     * @return The area \( A \)
     * @throws IllegalArgumentException if \( r &lt; 0 \)
     */
    public double calculateCircleArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        return Math.PI * radius * radius;
    }

    /**
     * Solves a quadratic equation in the form \( ax^2 + bx + c = 0 \).
     * <p>
     * The roots are calculated using the quadratic formula:
     * \[ x = \frac{-b \pm \sqrt{b^2 - 4ac}}{2a} \]
     *
     * @param a The coefficient of \( x^2 \) (must be non-zero)
     * @param b The coefficient of \( x \)
     * @param c The constant term
     * @return An array containing the two roots. If the discriminant
     * \( \Delta = b^2 - 4ac \) is negative, returns NaN for both roots.
     */
    public double[] solveQuadratic(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("Coefficient 'a' cannot be zero");
        }
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            return new double[] { Double.NaN, Double.NaN };
        }
        double sqrtDelta = Math.sqrt(discriminant);
        double x1 = (-b + sqrtDelta) / (2 * a);
        double x2 = (-b - sqrtDelta) / (2 * a);
        return new double[] { x1, x2 };
    }

    /**
     * Calculates the standard deviation of a population.
     * <p>
     * The standard deviation \( \sigma \) is defined as:
     * \[ \sigma = \sqrt{ \frac{1}{N} \sum_{i=1}^{N} (x_i - \mu)^2 } \]
     * where:
     * <ul>
     * <li>\( N \) is the population size</li>
     * <li>\( x_i \) is each value from the population</li>
     * <li>\( \mu \) is the population mean</li>
     * </ul>
     *
     * @param population An array of numerical values representing the population
     * @return The standard deviation \( \sigma \)
     */
    public double calculateStandardDeviation(double[] population) {
        double sum = 0.0;
        for (double num : population) {
            sum += num;
        }
        double mean = sum / population.length;

        double standardDeviation = 0.0;
        for (double num : population) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation / population.length);
    }
}