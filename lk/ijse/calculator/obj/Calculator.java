package lk.ijse.calculator.obj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    private JPanel lblPanel;
    private final JTextField txt1;
    private JTextField txt2;


    private String operator;
    private double num1;

    private final JButton [] buttons =  new JButton[18];

    public Calculator(){

        setSize(400, 300);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // set size

        JPanel displayPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));    //FlowLayout
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        JPanel downPanel = new JPanel(new FlowLayout(FlowLayout.LEADING, 10, 20));
        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        txt1 = new JTextField(30);
        txt1.setEditable(false);
        displayPanel.add(txt1);


        JLabel lblName = new JLabel();
        lblName.setFont(new Font("Serif", Font.BOLD, 9));
        lblName.setText("developed by savindaJ .");
        namePanel.add(lblName);

        setNumbers();

        for (int i = 0; i < 16; i++) {
            buttonPanel.add(buttons[i]);
        }

        namePanel.add(buttons[16]);
        namePanel.add(buttons[17]);

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
        String source = e.getActionCommand();
        try {
            String numberOne;
            if (e.getSource()==buttons[0])
                txt1.setText(txt1.getText()+"0");
            else if (e.getSource()==buttons[1])
                txt1.setText(txt1.getText()+"1");
            else if (e.getSource()==buttons[2])
                txt1.setText(txt1.getText()+"2");
            else if (e.getSource()==buttons[3])
                txt1.setText(txt1.getText()+"3");
            else if (e.getSource()==buttons[4])
                txt1.setText(txt1.getText()+"4");
            else if (e.getSource()==buttons[5])
                txt1.setText(txt1.getText()+"5");
            else if (e.getSource()==buttons[6])
                txt1.setText(txt1.getText()+"6");
            else if (e.getSource()==buttons[7])
                txt1.setText(txt1.getText()+"7");
            else if (e.getSource()==buttons[8])
                txt1.setText(txt1.getText()+"8");
            else if (e.getSource()==buttons[9])
                txt1.setText(txt1.getText()+"9");
            else if (e.getSource()==buttons[10]){
                operator="/";
                System.out.println(operator);
                num1= Double.parseDouble(txt1.getText());
                numberOne = String.valueOf(num1);
                txt1.setText("");
            } else if (e.getSource()==buttons[11]){
                operator="-";
                System.out.println(operator);
                num1= Double.parseDouble(txt1.getText());
                numberOne = String.valueOf(num1);
                txt1.setText("");
            }else if (e.getSource()==buttons[12]){
                operator="+";
                num1= Double.parseDouble(txt1.getText());
                numberOne = String.valueOf(num1);
                txt1.setText("");
            }else if (e.getSource()==buttons[13]){
                operator="*";
                num1= Double.parseDouble(txt1.getText());
                numberOne = String.valueOf(num1);
                txt1.setText("");
            }else if (e.getSource()==buttons[15]){
                txt1.setText(txt1.getText()+".");
            }else if (e.getSource()==buttons[16]){
                String backnum=txt1.getText();
                StringBuilder newnum= new StringBuilder();
                for (int i = 0; i < backnum.length()-1; i++)
                {
                    char x=backnum.charAt(i);
                    newnum.append(x);
                }
                txt1.setText(newnum.toString());

            }else if (e.getSource()==buttons[17])
                txt1.setText("");

            if (e.getSource()==buttons[14]){
                String numberTwo;
                double num2;
                double result;
                switch (operator) {
                    case "+": {
                        numberTwo = txt1.getText();
                        num2 = Double.parseDouble(numberTwo);
                        result = num1 + num2;
                        String result1 = String.valueOf(result);
                        txt1.setText(result1);
                        break;
                    }
                    case "-": {
                        numberTwo = txt1.getText();
                        num2 = Double.parseDouble(numberTwo);
                        result = num1 - num2;
                        String result1 = String.valueOf(result);
                        txt1.setText(result1);
                        break;
                    }
                    case "*": {
                        numberTwo = txt1.getText();
                        num2 = Double.parseDouble(numberTwo);
                        result = num1 * num2;
                        String result1 = String.valueOf(result);
                        txt1.setText(result1);
                        break;
                    }
                    case "/": {
                        numberTwo = txt1.getText();
                        num2 = Double.parseDouble(numberTwo);
                        result = num1 / num2;
                        String result1 = String.valueOf(result);
                        txt1.setText(result1);
                        break;
                    }
                }
            }

        }catch (Exception exception){
            txt1.setText("something went wrong !");
        }
    }
}
