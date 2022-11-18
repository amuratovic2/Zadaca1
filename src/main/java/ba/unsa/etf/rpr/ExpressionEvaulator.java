package ba.unsa.etf.rpr;

import java.util.Stack;

public class ExpressionEvaulator {
    public static double evaluate(String s){
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        for (String ss : s.split(" ")) {
            if (ss.equals("("));
            else if(ss.equals("+")) ops.push(ss);
            else if(ss.equals("-")) ops.push(ss);
            else if(ss.equals("*")) ops.push(ss);
            else if(ss.equals("/")) ops.push(ss);
            else if(ss.equals("sqrt")) ops.push(ss);
            else if(ss.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();
                if(op.equals("+")) v=vals.pop() + v;
                else if(op.equals("-")) v=vals.pop() - v;
                else if(op.equals("*")) v=vals.pop() * v;
                else if(op.equals("/")) v=vals.pop() / v;
                else if(op.equals("sqrt")) v= Math.sqrt(v);
                vals.push(v);
            }
            else {
                try{
                vals.push(Double.parseDouble(ss));
                }catch(RuntimeException e){
                    throw new RuntimeException();
                }
            }
        }
        return vals.pop();
    }

}
