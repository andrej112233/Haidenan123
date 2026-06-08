package app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {

    public static void main(String[] args) {
        
        JFrame prozor = new JFrame("Analiza teksta");
        prozor.setSize(400, 150);
        prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        prozor.setLayout(null);

        JTextField polje = new JTextField();
        polje.setBounds(50, 20, 300, 30);

        JButton dugme = new JButton("Analiziraj");
        dugme.setBounds(140, 60, 120, 30);

        dugme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tekst = polje.getText();

                int brojKaraktera = tekst.length();
                int brojRijeci = tekst.trim().isEmpty() 
                        ? 0 
                        : tekst.trim().split("\\s+").length;

                // Spajamo sve rezultate u jedan tekst sa novim redovima (\n)
                String rezultat = "Tekst: " + tekst + "\n"
                                + "Broj karaktera: " + brojKaraktera + "\n"
                                + "Broj riječi: " + brojRijeci + "\n"
                                + "Velika slova: " + tekst.toUpperCase();

                // Ova linija koda izbacuje pop-up prozor sa rezultatima
                JOptionPane.showMessageDialog(prozor, rezultat, "Rezultat analize", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        prozor.add(polje);
        prozor.add(dugme);
        
        prozor.setVisible(true); 
    }
}
