package code;

import javax.swing.*;
import java.applet.AppletContext;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Hello extends JApplet {
    private Image image;
    private AppletContext context;

    public void init() {
        context = this.getAppletContext();
        String imgageUrl = this.getParameter("image");
        if (imgageUrl == null) {
            imgageUrl = "java.jpg";
        }
        try {
            URL url = new URL(this.getDocumentBase(),imgageUrl);
            image = context.getImage(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            context.showStatus("Could not load image");
        }
    }


    public void paintComponent(final Graphics g) {
        context.showStatus("Displaying image");
        g.drawImage(image, 0, 0, 500, 200, null);
        g.drawString("www.xiaojuzi.com", 35, 100);
        JLabel label = new JLabel("hello ,java !", SwingConstants.CENTER);
        add(label);
    }


}
