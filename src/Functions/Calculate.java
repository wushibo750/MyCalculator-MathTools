package Functions;

import javax.swing.JOptionPane;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


public class Calculate {
    //计算得出结果，调用科学计算包
    public String getResult(String expressioon) {
        Expression calc = null;
        try {
            //调用exp4j这个科学计算包，计算一个计算公式
            ExpressionBuilder builder = new ExpressionBuilder(expressioon);
            //builder.build();
            calc = builder.build();
            System.out.println("输出getResult运算结果："+calc.evaluate());
            return "" + calc.evaluate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "吴世博提醒你，公式输入格式有误!");
            return "error";
        }
    }
}
