package com.mycompany.tutorial6;

import javax.swing.*;
import java.awt.*;

public class DescriptionPanel extends JPanel {

    //Label for displaying an image icon and a text 
    private JLabel lbl_ImgTitle = new JLabel();

    //Text area for displaying text
    private JTextArea txt_Description = new JTextArea();

    public DescriptionPanel() {

        // Center the icon and text and place the text under the icon
        lbl_ImgTitle.setHorizontalAlignment(JLabel.CENTER);

        lbl_ImgTitle.setHorizontalTextPosition(JLabel.CENTER);

        lbl_ImgTitle.setVerticalTextPosition(JLabel.BOTTOM);

        // Set the font in the label and the text field
        lbl_ImgTitle.setFont(new Font("SansSerif", Font.BOLD, 16));

        txt_Description.setFont(new Font("Serif", Font.PLAIN, 14));

        // Set lineWrap and wrapStyleWord true for the text area
        txt_Description.setLineWrap(true);

        txt_Description.setWrapStyleWord(true);

        txt_Description.setEditable(false);

        // Create a scroll pane to hold the text area
        JScrollPane scrollPane = new JScrollPane(txt_Description);

        // Set BorderLayout for the panel, add label and scrollpane
        setLayout(new BorderLayout(5, 5));

        add(scrollPane, BorderLayout.CENTER);

        add(lbl_ImgTitle, BorderLayout.WEST);

    }

    //Set the title
    public void setTitle(String title) {

        lbl_ImgTitle.setText(title);

    }

    //Set the image icon
    public void setImageIcon(ImageIcon icon) {

        lbl_ImgTitle.setIcon(icon);

    }

    //Set the text description
    public void setDescription(String text) {

        txt_Description.setText(text);

    }

}

