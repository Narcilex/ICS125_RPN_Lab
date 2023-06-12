package calcrpn;

import java.util.Stack;

public class CalcBrain implements CalcRPNOperations {
    Stack<Float> Results;
    String operand;

    public CalcBrain() {
        Results = new Stack<Float>();
        operand = "";
    }

    /**
     * A single digit from the UI.
     *
     * @param digit an integer
     * @return The result to display.
     */
    @Override
    public String digit(String digit) {
        return null;
    }

    /**
     * An arithmetic operator from the UI.
     *
     * @param op
     * @return The result to display.
     */
    @Override
    public String operator(String op) {
        return null;
    }

    /**
     * The ClearEntry button on the UI has been pressed
     * so remove any digits typed so far.
     *
     * @return A calculated value to display.
     */
    @Override
    public String clearEntry() {
        return null;
    }

    /**
     * The Clear button on the UI has been pressed
     * so all memory in the calculator is cleared.
     *
     * @return A message to display.
     */
    @Override
    public String clear() {
        return null;
    }

    /**
     * The Enter button on the UI has been pressed.
     *
     * @return A message to display.
     */
    @Override
    public String enterPressed() {
        return null;
    }

    /**
     * A decimal point on the UI has been pressed.
     *
     * @return A message to display.
     */
    @Override
    public String addDecimal() {
        return null;
    }
}