package LoginSystem;
import javax.swing.*;
import java.awt.*;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class WelcomePage implements ActionListener
{
    JFrame frame =new JFrame();
    JLabel welcomelabel=new JLabel();
    int correct=0;
        JRadioButton a=new JRadioButton("Object");
        JRadioButton b=new JRadioButton("int");
        JRadioButton c=new JRadioButton("Float");
        JRadioButton d=new JRadioButton("void");
        JRadioButton a1=new JRadioButton("Single-Level");
        JRadioButton b1=new JRadioButton("Multilevel");
        JRadioButton c1=new JRadioButton("Mutliple");
        JRadioButton d1=new JRadioButton("Hierachy");
        JRadioButton a2=new JRadioButton("Unicode escape sequence ");
        JRadioButton b2=new JRadioButton("Octal escape");
        JRadioButton c2=new JRadioButton("line feed");
        JRadioButton d2=new JRadioButton("Hexadecimal");
        JRadioButton a3=new JRadioButton("Dynamic");
        JRadioButton b3=new JRadioButton("Object Oriented");
        JRadioButton c3=new JRadioButton("Use of pointers");
        JRadioButton d3=new JRadioButton("Architecture neutral");
        JRadioButton a4=new JRadioButton("Bytecode is executed by JVM ");
        JRadioButton b4=new JRadioButton("Dynamic binding between objects ");
        JRadioButton c4=new JRadioButton("Use of exception handling");
        JRadioButton d4=new JRadioButton("The applet makes the Java code secure and portable");
        JButton submit=new JButton("SUBMIT");
        
        
    public WelcomePage(String userID)
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(40000,40000);
        frame.setLayout(null);
        frame.setVisible(true);
        
        welcomelabel.setBounds(0,0,550,35);
        welcomelabel.setFont(new Font(null,Font.PLAIN,25));
        welcomelabel.setText("ALL THE BEST "+userID);
        frame.add(welcomelabel);
        JLabel message=new JLabel();
        message.setBounds(0,50 ,500,35);
        message.setFont(new Font(null,Font.PLAIN,12));
        message.setText("What is the return type of the hashCode() method in the Object class? ");
        
        
        ButtonGroup group=new ButtonGroup();
        group.add(a);
        group.add(b);
        group.add(c);
        group.add(d);
        a.setBounds(0,75,200,35);
        a.setFont(new Font(null,Font.PLAIN,10));
        b.setBounds(0,100,200,35);
        b.setFont(new Font(null,Font.PLAIN,10));
        c.setBounds(0,125,200,35);
        c.setFont(new Font(null,Font.PLAIN,10));
        d.setBounds(0,150,200,35);
        d.setFont(new Font(null,Font.PLAIN,10));
        
        frame.add(message);
        frame.add(a);
        frame.add(b);
        frame.add(c);
        frame.add(d);
        
        JLabel message2=new JLabel();
        message2.setBounds(0,175,500,35);
        message2.setFont(new Font(null,Font.PLAIN,12));
        message2.setText("Which type of inheritance is implemented by interface ?");
        
        
        ButtonGroup group1=new ButtonGroup();
        group1.add(a1);
        group1.add(b1);
        group1.add(c1);
        group1.add(d1);
        a1.setBounds(0,200,200,35);
        a1.setFont(new Font(null,Font.PLAIN,10));
        b1.setBounds(0,225,200,35);
        b1.setFont(new Font(null,Font.PLAIN,10));
        c1.setBounds(0,250,200,35);
        c1.setFont(new Font(null,Font.PLAIN,10));
        d1.setBounds(0,275,200,35);
        d1.setFont(new Font(null,Font.PLAIN,10));
        
        frame.add(message2);
        frame.add(a1);
        frame.add(b1);
        frame.add(c1);
        frame.add(d1);
        
        JLabel message3=new JLabel();
        message3.setBounds(0,300,500,35);
        message3.setFont(new Font(null,Font.PLAIN,12));
        message3.setText("The '\u0021' article referred to as a ");
        
        
        ButtonGroup group2=new ButtonGroup();
        group2.add(a2);
        group2.add(b2);
        group2.add(c2);
        group2.add(d2);
        a2.setBounds(0,325,200,35);
        a2.setFont(new Font(null,Font.PLAIN,10));
        b2.setBounds(0,350,200,35);
        b2.setFont(new Font(null,Font.PLAIN,10));
        c2.setBounds(0,375,200,35);
        c2.setFont(new Font(null,Font.PLAIN,10));
        d2.setBounds(0,400,200,35);
        d2.setFont(new Font(null,Font.PLAIN,10));
        
        frame.add(message3);
        frame.add(a2);
        frame.add(b2);
        frame.add(c2);
        frame.add(d2);
        
        JLabel message4=new JLabel();
        message4.setBounds(0,425,500,35);
        message4.setFont(new Font(null,Font.PLAIN,12));
        message4.setText("Which of the following is not a Java features ? ");
        
        ButtonGroup group3=new ButtonGroup();
        group3.add(a3);
        group3.add(b3);
        group3.add(c3);
        group3.add(d3);
        a3.setBounds(0,450,200,35);
        a3.setFont(new Font(null,Font.PLAIN,10));
        b3.setBounds(0,475,200,35);
        b3.setFont(new Font(null,Font.PLAIN,10));
        c3.setBounds(0,500,200,35);
        c3.setFont(new Font(null,Font.PLAIN,10));
        d3.setBounds(0,525,200,35);
        d3.setFont(new Font(null,Font.PLAIN,10));
        
        frame.add(message4);
        frame.add(a3);
        frame.add(b3);
        frame.add(c3);
        frame.add(d3);
        
        JLabel message5=new JLabel();
        message5.setBounds(0,550,500,35);
        message5.setFont(new Font(null,Font.PLAIN,12));
        message5.setText("Which of the following option leads to the portability and security of Java? ");
        
        ButtonGroup group4=new ButtonGroup();
        group4.add(a4);
        group4.add(b4);
        group4.add(c4);
        group4.add(d4);
        a4.setBounds(0,575,200,35);
        a4.setFont(new Font(null,Font.PLAIN,10));
        b4.setBounds(0,600,200,35);
        b4.setFont(new Font(null,Font.PLAIN,10));
        c4.setBounds(0,625,200,35);
        c4.setFont(new Font(null,Font.PLAIN,10));
        d4.setBounds(0,650,200,35);
        d4.setFont(new Font(null,Font.PLAIN,10));
        
        frame.add(message5);
        frame.add(a4);
        frame.add(b4);
        frame.add(c4);
        frame.add(d4);
        
        
        submit.setBounds(50,675,200,35);
        submit.addActionListener(this);
        b.addActionListener(this);
        c1.addActionListener(this);
        a2.addActionListener(this);
        c3.addActionListener(this);
        a4.addActionListener(this);
        frame.add(submit);
    }
      @Override
    public void actionPerformed(ActionEvent e)
    {  
        if(e.getSource()==b)
        {
            correct++;
        }
        if(e.getSource()==c1)
        {
            correct++;
        }
        if(e.getSource()==a2)
        {
            correct++;
        }
        if(e.getSource()==c3)
        {
            correct++;
        }
        if(e.getSource()==a4)
        {
            correct++;
        }
        if(e.getSource()==submit)
        {
            Result obj=new Result(correct);
        }
    }
    }

