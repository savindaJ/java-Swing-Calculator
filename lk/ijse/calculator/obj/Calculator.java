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

    private final JButton [] buttons =  new JButton[18];

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
                numberOne= String.valueOf(num1);
                txt1.setText("");
            } else if (e.getSource()==buttons[11]){
                operator="-";
                System.out.println(operator);
                num1= Double.parseDouble(txt1.getText());
                numberOne= String.valueOf(num1);
                txt1.setText("");
            }else if (e.getSource()==buttons[12]){
                operator="+";
                num1= Double.parseDouble(txt1.getText());
                numberOne= String.valueOf(num1);
                txt1.setText("");
            }else if (e.getSource()==buttons[13]){
                operator="*";
                num1= Double.parseDouble(txt1.getText());
                numberOne= String.valueOf(num1);
                txt1.setText("");
            }else if (e.getSource()==buttons[15]){
                txt1.setText(txt1.getText()+".");
            }else if (e.getSource()==buttons[16]){
                String backnum=txt1.getText();
                String newnum="";
                for (int i = 0; i < backnum.length()-1; i++)
                {
                    char x=backnum.charAt(i);
                    newnum+=x;
                }
                txt1.setText(newnum);
            }



        }catch (Exception exception){

        }
    }
}
