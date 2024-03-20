
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class window extends JFrame implements ActionListener{

    JTextField nama;
    JTextField sandi;
    JButton login;
    window(){
        this.setSize(500,350);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nama = new JTextField();
        nama.addActionListener(this);
        sandi = new JTextField();
        sandi.addActionListener(this);

       
        login = new JButton();
        login.setText("Login");
        login.addActionListener(this);
        login.setBounds(90,80,75,30);

        this.add(login);    

        JLabel username = new JLabel();
        username.setText("Nama");
        
        JLabel password = new JLabel();
        password.setText("Password");
        
        this.add(username);
        this.add(password);
        this.add(nama);
        this.add(sandi);
        
        username.setBounds(10,10,70,30);
        password.setBounds(10,40,70,30);
        nama.setBounds(75,10,125,30);
        sandi.setBounds(75,40,125,30);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login){
            String input_nama = nama.getText();
            String input_sandi = sandi.getText();

            if (input_nama.compareTo(input_sandi) == 0) {
                perhitungan baru = new perhitungan();
            }
            else{
                
            }

        }
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
