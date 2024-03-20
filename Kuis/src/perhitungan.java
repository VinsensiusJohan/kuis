import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class perhitungan extends JFrame implements ActionListener{
    JTextField alas_segitiga;
    JTextField tinggi_segitiga;
    JButton hitung;
    perhitungan(){
        this.setSize(500,350);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel alas = new JLabel();
        JLabel tinggi = new JLabel();
        alas_segitiga = new JTextField();
        tinggi_segitiga = new JTextField();
        hitung = new JButton();

        this.add(alas);
        this.add(tinggi);
        this.add(alas_segitiga);
        this.add(tinggi_segitiga);
        this.add(hitung);

        alas.setText("Alas");
        alas.setBounds(10,10,70,30);
        tinggi.setText("Tinggi");
        tinggi.setBounds(10,40,70,30);
        alas.setBounds(75,10,125,30);
        tinggi.setBounds(75,40,125,30);
        hitung.setText("Hitung");
        hitung.setBounds(90,80,50,30);
        alas_segitiga.addActionListener(this);
        tinggi_segitiga.addActionListener(this);
        hitung.addActionListener(this);

    }





    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
