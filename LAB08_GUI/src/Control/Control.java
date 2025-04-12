package Control;

import View.Calculadora;
import javax.swing.JTextField;
import Model.Operacoes;
import Model.Soma;
import Model.Subtracao;
import Model.Multiplicacao;
import Model.Divisao;

/**
 *
 * @author unifvnobre
 */
public class Control {
    private Calculadora view;
    String num1 = "";
    Operacoes op;
    double x, y;
    
    
    public Control(Calculadora view){ 
        this.view = view;
    }
    
    public void concatenarNumeros(String numero) {
        num1 += numero;
        view.getTxt_resultado().setText(num1);
    }
    
    public void controlClear(){
        view.getTxt_resultado().setText("");
        num1 = "";
    }
    
    public void Soma() {
        x = Double.parseDouble(view.getTxt_resultado().getText());
        op = new Soma();
    }
    
    public void Subtracao() {
        x = Double.parseDouble(view.getTxt_resultado().getText());
        op = new Subtracao();
    }
    
    public void Mult() {
        x = Double.parseDouble(view.getTxt_resultado().getText());
        op = new Multiplicacao();
    }
    
    public void Div() {
        x = Double.parseDouble(view.getTxt_resultado().getText());
        op = new Divisao();
    }
    
    public void controlEquals() {
        y = Double.parseDouble(view.getTxt_resultado().getText());
        double result = op.calculo(x, y);
        view.getTxt_resultado().setText(String.valueOf(result));
    }
    
}