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
        b2= new JButton("Dollar");
        b2.setBounds(190,80,60,30);
        b3= new JButton("Close");
        b3.setBounds(150,150.60,30);

        // adding action listeners

    }
    
    
}