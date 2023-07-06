package lk.ijse.calculator.obj;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    private JPanel buttonPanel;
    private JPanel displayPanel;
    private JPanel namePanel;
    private JPanel downPanel;
    private JPanel lblPanel;


    private String operator;
    private String numberOne;
    private String numberTwo;
    private double num1;
    private double num2;
    private double result;
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
