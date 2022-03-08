import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class dropdown {
    public static void main(String[] args){
        String[] morecurrencies= {"Australia Dollar", "British Pound","Japanese Yen"};

        JFrame JFrame= new JFrame();

        JComboBox<String> JComboBox = new JComboBox<>(morecurrencies);
        JComboBox.setBounds(80,50,140,20);

        JButton JButton= new JButton("Done");
        JButton.setBounds(100,100,90,20);

        JLabel JLabel= new JLabel();
        JLabel.setBounds(90,100,400,100);
        

        JFrame.add(JButton);
        JFrame.add(JComboBox);
        JFrame.add(JLabel);


        JFrame.setLayout(null);
        JFrame.setVisible(true);
        JFrame.setSize(350,250);


        JButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                String selectecurrency= "Currency selected"+ JComboBox.getItemAt(JComboBox.getSelectedIndex());
            }
        });


    }
    
}
