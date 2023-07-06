package lk.ijse.calculator.obj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    private JPanel buttonPanel;
    private JPanel displayPanel;
    private JPanel namePanel;
    private JPanel downPanel;
    private JPanel lblPanel;
    private JTextField txt1;
    private JTextField txt2;
    private JLabel lblName;


    private String operator;
    private String numberOne;
    private String numberTwo;
    private double num1;
    private double num2;
    private double result;

    private JButton[] buttons =  new JButton[18];

    public Calculator(){

        setSize(400, 300);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // set size

        displayPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,20,20));	//FlowLayout
        buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        downPanel=new JPanel(new FlowLayout(FlowLayout.LEADING,10,20));
        namePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        txt1 = new JTextField(30);
        txt1.setEditable(false);
        displayPanel.add(txt1);


        lblName = new JLabel();
        lblName.setFont(new Font("Serif", Font.BOLD, 11));
        lblName.setText("clear textField : ");
        namePanel.add(lblName);

        setNumbers();

        for (int i = 0; i < 15; i++) {
            buttonPanel.add(buttons[i]);
        }

        add(displayPanel, BorderLayout.PAGE_START);
        add(buttonPanel, BorderLayout.CENTER);
        add(namePanel, BorderLayout.SOUTH);
    }

    private void setNumbers() {
        for (int i = 0; i < 10; i++) {
            buttons[i]=new JButton(i+"");
        }

        buttons[10] = new JButton("/");
        buttons[11] = new JButton("-");
        buttons[12] = new JButton("+");
        buttons[13] = new JButton("*");
        buttons[14] = new JButton("=");
        buttons[15] = new JButton(".");
        buttons[16] = new JButton("Back");
        buttons[17] = new JButton("clear");

        for (JButton button : buttons) {
            button.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
