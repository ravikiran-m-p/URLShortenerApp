import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URI;
import java.util.*;

public class URLShortenerGUI
{
    private Map<String, String> shortToUrl = new HashMap<>();
    private static final String CHAR_POOL = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int CODE_LENGTH = 6; // length ur wish u can keep how much u want but as small as possiable
    private Random random = new Random();
    
}


private String generateShortCode()
{
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < CODE_LENGTH; i++)
        sb.append(CHAR_POOL.charAt(random.nextInt(CHAR_POOL.length())));
        return sb.toString();
    }

public URLShortenerGUI()
{
    JFrame frame = new JFrame("URL Shortener");
    frame.setSize(500, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JTextField urlField = new JTextField(30);
    JButton shortenBtn = new JButton("Shorten");
    JLabel resultLabel = new JLabel("");

    shortenBtn.addActionListener(e -> {
        String longURL = urlField.getText();
        if (longURL.isEmpty())
        {
            resultLabel.setText("Please enter a URL.");
            return;
        }
        String shortCode;
          do
          {
            shortCode = generateShortCode();
          }while (shortToUrl.containsKey(shortCode));
        shortToUrl.put(shortCode, longURL);
        resultLabel.setText("<html>Short URL: <a href='#'>" + shortCode + "</a></html>");
        resultLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        resultLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
              try
              {
                Desktop.getDesktop().browse(new URI(longURL));
              }
              catch (Exception ex)
                {
                  ex.printStackTrace();
                }
            }
        });
 });

        JPanel panel = new JPanel();
        panel.add(urlField);
        panel.add(shortenBtn);
        panel.add(resultLabel);
        frame.add(panel);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new URLShortenerGUI();
    }
}



        
