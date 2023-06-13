package calcrpn;

import java.util.Stack;

public class CalcBrain implements CalcRPNOperations {
    Stack<Float> results;
    String operand;

    public CalcBrain() {
        results = new Stack<Float>();
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
        operand +=digit;
        return digit;
    }

    /**
     * An arithmetic operator from the UI.
     *
     * @param op
     * @return The result to display.
     */
    @Override
    public String operator(String op) {
        float a, b, c;

        if (!operand.isEmpty()) {
            results.push(Float.parseFloat(operand));
            operand = "";
        }
        if (results.size() < 2) {
            return "";
        }
        a = results.pop();
        b = results.pop();

        switch (op) {
            case "+":
                c = b + a;
                break;
            case "-":
                c = b - a;
                break;
            case "*":
                c = b * a;
                break;
            case "/":
                c = b / a;
                break;
            case "^":
                c = (float) Math.pow(b, a);
                break;
            default:
                return "";
        }

        results.push(c);
        return Float.toString(c);
    }

//    public String operator(String op) {
//        float a, b, c;
//
//        if (!operand.isEmpty()) {
//            results.push(Float.parseFloat(operand));
//            operand = "";
//        }
//        if (results.size() < 2) {
//            return "";
//        }
//        a = results.pop();
//        b = results.pop();
//
//        switch (op) {
//            case "+":
//                if (results.size() >= 1) {
//                    float previousResult = results.pop();
//                    c = previousResult + a + b;
//                    results.push(previousResult);
//                } else {
//                    c = b + a;
//                }
//                break;
//            case "-":
//                if (results.size() > 1) {
//                    float previousResult = results.pop();
//                    c = previousResult - b - a;
//                    results.push(previousResult);
//                } else {
//                    c = b - a;
//                }
//                break;
//            case "*":
//                c = b * a;
//                break;
//            case "/":
//                c = b / a;
//                break;
//            case "^":
//                c = (float) Math.pow(b, a);
//                break;
//            default:
//                return "";
//        }
//
//        results.push(c);
//        return Float.toString(c);
//    }


    /**
     * The ClearEntry button on the UI has been pressed
     * so remove any digits typed so far.
     *
     * @return A calculated value to display.
     */
    @Override
    public String clearEntry() {
        operand = "";
        return "";
    }

    /**
     * The Clear button on the UI has been pressed
     * so all memory in the calculator is cleared.
     *
     * @return A message to display.
     */
    @Override
    public String clear() {
        results.clear();
        operand = "";
        return "Clear All";
    }

    /**
     * The Enter button on the UI has been pressed.
     *
     * @return A message to display.
     */
    @Override
    public String enterPressed() {
        if (operand.isEmpty()) {
            return "";
        }
        results.push(Float.parseFloat((operand)));
        operand = "";
        return "";
    }

    /**
     * A decimal point on the UI has been pressed.
     *
     * @return A message to display.
     */
    @Override
    public String addDecimal() {
        if (operand.contains(".")) {
            return "Error";
        }
        operand += ".";
        return "";
    }
}