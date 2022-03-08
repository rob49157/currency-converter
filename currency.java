import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class currency{
    public static void  converter(){
        // creating a new frame using Jframe
        JFrame f = new JFrame("Converter");
        
        // creating two text labels
        JLabel l1,l2;

        // create two text fields
        //one for rupee and one for dollar
        
        JTextField t1, t2;

        // create three buttons 

        JButton b1, b2 , b3;

        // name the labels and settings
        // set bounds for labels

        l1= new JLabel("Ruppes:");
        l1.setBounds(20,40,60,30);
        l2= new JLabel("Dollars");
        l2.setBounds(170,40,60,30);


        // initialized text fields with 0 by default and setting bound to text field

        t1= new JTextField("0");
        t1.setBounds(80,40,50,30);
        t2= new JTextField("0");
        t2.setBounds(240,40,50,30);

        //create a button for INR
        //create button for dollar
        //create button to close
        // and setting the bound

        b1= new JButton("INR");
        b1.setBounds(50,80,60,15);
        b2= new JButton("$");
        b2.setBounds(190,80,60,30);
        b3= new JButton("Close");
        b3.setBounds(150,150,60,30);
        

        // adding action listeners
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                // converting to double
                double d= Double.parseDouble(t1.getText());
                
                // converting ruppes to dollars
                double d1 =(d / 65.25);

                // getting the string value of the calculated value
                String str1= String.valueOf(d1);

                //placing it in the text box
                t2.setText(str1);

            }
        });

        // adding action listeners
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                // converting to double
                double d2= Double.parseDouble(t2.getText());

                // converting Dollars to rupees

            double d3= (d2 * 65.25);

            // getting the string value of the calculated value
            
            String str2 = String.valueOf(d3);

            // placing it in the text box

            t1.setText(str2);
            }
        });

        // Default method for closing the frame

        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });

        String[] morecurrencies= {"Australia Dollar", "British Pound","Japanese Yen"};

        JFrame jFrame= new JFrame();

        JComboBox<String> jComboBox = new JComboBox<>(morecurrencies);
        jComboBox.setBounds(80,50,140,20);

        JButton jButton= new JButton("Done");
        jButton.setBounds(100,100,90,20);

        JLabel JLabel= new JLabel();
        JLabel.setBounds(90,100,400,100);

        JFrame.add(JButton);
        JFrame.add(JComboBox);
        JFrame.add(JLabel);


        JFrame.setLayout(null);
        JFrame.setVisible(true);
        JFrame.setSize(350,250);


        jButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                String selectecurrency= "Currency selected"+ JComboBox.getItemAt(JComboBox.getSelectedIndex());
            }
        });
        
        //adding the created objects ot the form

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setLayout(null);
        f.setSize(400,300);
        f.setVisible(true);
    }


    // add drop down menu
    


        //drive code 
        public static void main(String args[])
        {
            converter();
        }
    
    
}