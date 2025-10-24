import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URI;
import java.util.*;

public class URLShortenerGUI
{
    private Map<String, String> shortToUrl = new HashMap<>();
    private static final String CHAR_POOL = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int CODE_LENGTH = 6; // you can take ur own length of url value
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
    

        
