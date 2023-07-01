package Hospitalsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


/**
 *
 * @author bryle
 */

class MainPage extends JFrame implements ActionListener{
    
    
    JComboBox cb1, cb2 , cb3;
    JLabel l1;
    
  MainPage(){
    setResizable(false);
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    
    
     l1 = new JLabel("HOSPITAL MANGEMENT SYSTEM");
     l1.setBounds(400, 20, 300, 150);
     l1.setFont(new Font("Rockwell", Font.BOLD, 15));
     add(l1);
          
  }

  
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==cb1){
        
       }
    }
}

    
public class Login extends JFrame{
    JTextField t1, t2;
    JButton b1,b2;
    JLabel l1, l2, l3, l4;
    
    Login(){
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        l1 = new JLabel("Login");
        l1.setFont(new Font("Rockwell", Font.BOLD, 30));
        l1.setForeground(Color.gray);
        l1.setBounds(90, 10, 300, 30);
        add(l1);
        
        l2 = new JLabel("");
        l2.setBounds(250, 80, 300, 30);
        add(l2);
        
        l3 = new JLabel ("Username: ");
        l3.setBounds(18, 60, 200, 30);
        l3.setFont(new Font("Rockwell", Font.BOLD, 15));
        add(l3);
        
        l4 = new JLabel ("Password: ");
        l4.setBounds(20, 100, 200, 30);
        l4.setFont(new Font("Rockwell", Font.BOLD, 15));
        add(l4);
        
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("Login");
        
        
        t1.setBounds(100, 60, 120, 30);               
        t2.setBounds(100, 100, 120, 30);
        b1.setBounds(85, 140, 80, 30);
        
        
        add(t1);
        add(t2);
        add(b1);
        
        
       
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
               if(t1.getText().toString().equals("hospital")&& t2.getText().toString().equals("admin"))
               {                  
                   dispose();
                   MainPage P = new MainPage();
                   P.setVisible(true);
                   P.setBounds(500, 200, 1080, 720);                 
               }
            
                   l2.setText("Invalid Username or Password");
            }
        });
        
        
           }           
        }
    

