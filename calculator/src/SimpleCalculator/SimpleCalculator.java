package SimpleCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    private Container c;
    private JTextField tf;
    private  Font f,f1;
    private JButton btn0, btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn_div,btn_multi,btn_add,btn_sub;
    private JButton btn_equ,btn_sqrt,btn_sq,btn_ac,btn_dot,btn_bs;
    public double First_NUM,Second_NUM,result;
    String operation,answer;
    SimpleCalculator(){
       c=this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.cyan);
       f=new Font("Arial",Font.BOLD,20);
       f1=new Font("Arial",Font.BOLD,17);
       tf=new JTextField();
       tf.setBounds(5,5,380,70);
       tf.setFont(f);
       c.add(tf);

       btn_bs=new JButton("⌫");
       btn_bs.setBounds(322,78,60,35);
       c.add(btn_bs);

       btn_ac=new JButton("AC");
       btn_ac.setBounds(5,78,60,35);
       c.add(btn_ac);

       btn1=new JButton("1");
       btn1.setBounds(5,130,60,35);
       btn1.setFont(f1);
       c.add(btn1);

       btn2=new JButton("2");
       btn2.setBounds(73,130,60,35);
       btn2.setFont(f1);
       c.add(btn2);

       btn3=new JButton("3");
       btn3.setBounds(143,130,60,35);
       btn3.setFont(f1);
       c.add(btn3);

       btn4=new JButton("4");
       btn4.setBounds(210,130,60,35);
       btn4.setFont(f1);
       c.add(btn4);

       btn5=new JButton("5");
       btn5.setBounds(5,170,60,35);
       btn5.setFont(f1);
       c.add(btn5);

       btn6=new JButton("6");
       btn6.setBounds(73,170,60,35);
       btn6.setFont(f1);
       c.add(btn6);

       btn7=new JButton("7");
       btn7.setBounds(143,170,60,35);
       btn7.setFont(f1);
       c.add(btn7);

       btn8=new JButton("8");
       btn8.setBounds(210,170,60,35);
       btn8.setFont(f1);
       c.add(btn8);

       btn9=new JButton("9");
       btn9.setBounds(5,210,60,35);
       btn9.setFont(f1);
       c.add(btn9);

       btn0=new JButton("0");
       btn0.setBounds(73,210,60,35);
       btn0.setFont(f1);
       c.add(btn0);

       btn_dot=new JButton(".");
       btn_dot.setBounds(143,210,60,35);
       btn_dot.setFont(f);
       c.add(btn_dot);

       btn_sqrt=new JButton("sqr");
       btn_sqrt.setBounds(210,210,60,35);
       btn_sqrt.setFont(f1);
       c.add(btn_sqrt);

        btn_add=new JButton("+");
        btn_add.setBounds(285,130,100,35);
        btn_add.setFont(f);
        btn_add.setForeground(Color.blue);
        c.add(btn_add);

        btn_sub=new JButton("-");
        btn_sub.setBounds(285,170,100,35);
        btn_sub.setFont(f);
        btn_sub.setForeground(Color.blue);
        c.add(btn_sub);


        btn_multi=new JButton("x");
        btn_multi.setBounds(285,210,100,35);
        btn_multi.setFont(f);
        btn_multi.setForeground(Color.blue);
        c.add(btn_multi);

        btn_sq=new JButton("x^2");
        btn_sq.setBounds(5,250,100,35);
        btn_sq.setFont(f1);
        c.add(btn_sq);

        btn_equ=new JButton("=");
        btn_equ.setBounds(115,250,155,35);
        btn_equ.setFont(f);
        btn_equ.setForeground(Color.orange);
        c.add(btn_equ);

        btn_div=new JButton("÷");
        btn_div.setBounds(285,250,100,35);
        btn_div.setFont(f);
        btn_div.setForeground(Color.blue);
        c.add(btn_div);


        btn_bs.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String text= tf.getText();
               if(text.isEmpty()){
                   tf.setText("");
               }
               else {
                   tf.setText(text.substring(0,text.length()-1));
               }

           }
       });

        btn_ac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String value= tf.getText();
                tf.setText("1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value= tf.getText();
                tf.setText(value+"2");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value= tf.getText();
                tf.setText(value+"3");
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value= tf.getText();
                tf.setText(value+"4");
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value= tf.getText();
                tf.setText(value+"5");
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value= tf.getText();
                tf.setText(value+"6");
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value= tf.getText();
                tf.setText(value+"7");
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value= tf.getText();
                tf.setText(value+"8");
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value= tf.getText();
                tf.setText(value+"9");
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value= tf.getText();
                tf.setText(value+"0");
            }
        });
        btn_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             First_NUM=Double.parseDouble(tf.getText());
             tf.setText("");
              operation="+";
            }
        });
        btn_sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                First_NUM=Double.parseDouble(tf.getText());
                tf.setText("");
                operation="-";
            }
        });
        btn_multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                First_NUM=Double.parseDouble(tf.getText());
                tf.setText("");
                operation="x";
            }
        });
        btn_div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                First_NUM=Double.parseDouble(tf.getText());
                tf.setText("");
                operation="/";
            }
        });
        btn_sq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                First_NUM=Double.parseDouble(tf.getText());
                tf.setText("");
                operation="^";
            }
        });
        btn_sqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                tf.setText("\u221a");
                tf.setText("");
                operation="sqr";
            }
        });
        btn_dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value= tf.getText();
                tf.setText(value+".");
            }
        });
        btn_equ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

              Second_NUM=Double.parseDouble(tf.getText());
              switch (operation){
                  case "+":
                      result=First_NUM+Second_NUM;
                      answer=String.format("Ans: "+result);
                      tf.setText(answer);
                      break;
                  case "-":
                      result=First_NUM-Second_NUM;
                      answer=String.format("Ans: "+result);
                      tf.setText(answer);
                      break;
                      case "x":
                          result=First_NUM*Second_NUM;
                          answer=String.format("Ans: "+result);
                          tf.setText(answer);
                      break;

                  case "/":
                      result=First_NUM/Second_NUM;
                      answer=String.format("Ans: "+result);
                      tf.setText(answer);
                      break;
                  case "^":
                        result=Second_NUM*Second_NUM;
                        answer=String.format("Ans: "+result);
                        tf.setText(answer);
                        break;
                        case "sqr":
                        result=Math.sqrt(Second_NUM);
                        answer=String.format("Ans: "+result);
                        tf.setText(answer);
                        break;
              }
            }
        });
    }
//    char sqrt = '\u221a';

    public static void main(String[] args) {
        SimpleCalculator frame=new SimpleCalculator();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(40,30,405,350);
        frame.setTitle("My Calculator");
    }
}
