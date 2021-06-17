/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasKelompok1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author ASUS
 */
public class Operator extends JFrame {
    JLabel JInformasi;
    JTextField JText1, JText2;
    JButton JButton1, JButton2, JButton3, JButton4, JButton5;
    JLabel JLabel1, JLabel2, JLabel3, JLabel4;
    
    public static void main(String args[]) {
        Operator apl = new Operator();
    }
    
    public Operator() {
        super("Operator Matematika");
        setSize(400, 150);
        
        JLabel1 = new JLabel ("Angka Pertama:");
        JText1 = new JTextField("", 10);
        JLabel2 = new JLabel ("Angka Kedua:");
        JText2 = new JTextField("", 10);
        JLabel3 = new JLabel ("Hasil:");
        JLabel4 = new JLabel("0");
        
        JButton1 = new JButton("Jumlah");
        JButton2 = new JButton("Kurang");
        JButton3 = new JButton("Kali");
        JButton4 = new JButton("Bagi");
        JButton5 = new JButton("Reset");
        
        JPanel JPanel1 = new JPanel();
        JPanel1.setLayout(new GridLayout(3, 2));
        JPanel1.add(JLabel1);
        JPanel1.add(JText1);
        JPanel1.add(JLabel2);
        JPanel1.add(JText2);
        JPanel1.add(JLabel3);
        JPanel1.add(JLabel4);
        
        JPanel JPanel2 = new JPanel();
        JPanel2.setLayout(new GridLayout(0, 4));
        JPanel2.add(JButton1);
        JPanel2.add(JButton2);
        JPanel2.add(JButton3);
        JPanel2.add(JButton4);
        
        JPanel JPanel3 = new JPanel();
        JPanel3.setLayout(new GridLayout(0, 1));
        JPanel3.add(JButton5);
        
        getContentPane().add("North", JPanel1);
        getContentPane().add(JPanel2);
        getContentPane().add("South", JPanel3);
            
        JButton1.addActionListener(new Operator.PenangananTombol());
        JButton2.addActionListener(new Operator.PenangananTombol());
        JButton3.addActionListener(new Operator.PenangananTombol());
        JButton4.addActionListener(new Operator.PenangananTombol());
        JButton5.addActionListener(new Operator.PenangananTombol());
            
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        show();
    }

    class PenangananTombol implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        
        if (s.equals("Jumlah")) {
            int angka1 = Integer.parseInt(JText1.getText());
            int angka2 = Integer.parseInt(JText2.getText());
            
            int hasilJumlah = angka1+angka2;
            String hasilJuml = String.valueOf(hasilJumlah);
            JLabel4.setText(hasilJuml);
        }
            if (s.equals("Kurang")) {
                int angka1 = Integer.parseInt(JText1.getText());
                int angka2 = Integer.parseInt(JText2.getText());
                
                int hasilKurang = angka1-angka2;
                String hasilKur = String.valueOf(hasilKurang);
                JLabel4.setText(hasilKur);
            } 
            if (s.equals("Kali")) {
                int angka1 = Integer.parseInt(JText1.getText());
                int angka2 = Integer.parseInt(JText2.getText());
                
                int hasilKali = angka1*angka2;
                String hasilKal = String.valueOf(hasilKali);
                JLabel4.setText(hasilKal);
            } 
            if (s.equals("Bagi")) {
                float angka1 = Integer.parseInt(JText1.getText());
                float angka2 = Integer.parseInt(JText2.getText());
                
                float hasilBagi = angka1/angka2;
                String hasilBag = String.valueOf(hasilBagi);
                JLabel4.setText(hasilBag);
            } 
            if (s.equals("Reset")) {
                JText1.setText("");
                JText2.setText("");
                JLabel4.setText("0");
            }
        }
    }
}
