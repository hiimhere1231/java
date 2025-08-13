package SabaClicker;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.concurrent.TimeUnit;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;
import javax.swing.Timer;


public class Window extends AlfonsoClicker{
    public static String strSabucks = Double.toString(sabucks);
    public static JLabel sabucksCountLive = new JLabel("You have $"+strSabucks+" sabucks");


    public static int clickPower = 1;
    public static double doubleClickChance = 1;
    public static Random rand = new Random();

    public static boolean overdrive = false;
    public static double critCost = 10000;
    public static double powerCost = 10000;
    public static double twoXPowerCost = 100000;
    public static double overdriveCost = 100000;

    public static JLabel critLabelCost = new JLabel("This costs $"+critCost+" sabucks");
    public static JLabel powerLabelCost = new JLabel("This costs $"+powerCost+" sabucks");
    public static JLabel twoXPowerLabelCost = new JLabel("This costs $"+twoXPowerCost+" sabucks");
    public static JLabel overdriveLabelCost = new JLabel("This costs $"+overdriveCost+" sabucks");



    static void deactivateItemShop(JFrame bonitaFrames, JFrame itemShop){
        itemShop.setVisible(false);
        bonitaFrames.setVisible(true);
    }

    static void deactivatelocationShop(JFrame frame, JFrame bonitaFrames){
        frame.setVisible(false);
        bonitaFrames.setVisible(true);
    }

    static void activateElestralsShop(JFrame bonitaFrames){
        bonitaFrames.setVisible(false);
        JFrame elsS = new JFrame();
        elsS.setLayout(null);
        elsS.setSize(1920, 1080);
        elsS.getContentPane().setBackground(Color.yellow);
        elsS.setVisible(true);
        elsS.setTitle("Saba's very own unique Elestrals power up store!");
        ImageIcon eIcon = new ImageIcon("C:\\Users\\setha\\Saba\\elestrals logo.png");
        elsS.setIconImage(eIcon.getImage());
        
        makeIcon(elsS, 1462, 25, 50, 50, "C:\\Users\\setha\\Saba\\x.png");
        JButton xButton = new JButton();
        xButton.setBounds(1462, 25, 50, 50);
        xButton.setVisible(true);
        xButton.setOpaque(false);
        xButton.setContentAreaFilled(false);
        xButton.setBorderPainted(false);
        elsS.add(xButton);
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
                deactivateItemShop(bonitaFrames, elsS);
            }
        });
        
        // +1 click power
        // 2x click power
        // double click chance
        // overdrive


        makeIcon(elsS, 200, 350, 200, 200, "C:\\Users\\setha\\Saba\\elestrals 1.png");
        powerLabelCost.setBounds(225, 200, 200, 200);
        powerLabelCost.setVisible(true);
        elsS.add(powerLabelCost);
        JLabel pwrAb = new JLabel("This Elestral gives +1 click power.");
        pwrAb.setBounds(225, 175, 200, 200);
        pwrAb.setVisible(true);
        elsS.add(pwrAb);
        // add button
        JButton el1 = new JButton();
        el1.setBounds(200, 350, 200, 200);
        el1.setVisible(true);
        el1.setOpaque(false);
        el1.setContentAreaFilled(false);
        el1.setBorderPainted(false);
        el1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
                if(sabucks > powerCost){
                    sabucks -= powerCost;
                    powerCost = powerCost * 1.1;
                    clickPower += 1;
                    powerLabelCost.setText("This costs $"+Math.ceil(powerCost / 10) * 10 +" sabucks");
                }
                else {
                    SwingUtilities.invokeLater(() -> {
                        // Create splash screen
                        JWindow splash = new JWindow();

                        String path = "C:/Users/setha/Saba/cachedImage.png"; // <-- update path
                        ImageIcon icon = new ImageIcon(path);

                        JLabel label = new JLabel(icon);
                        splash.getContentPane().add(label);

                        splash.pack(); // size window to fit image
                        splash.setLocationRelativeTo(null); // center on screen

                        splash.setVisible(true);

                        // Timer to hide after 1 seconds
                        new Timer(1000, erxtx -> {
                            splash.setVisible(false);
                            splash.dispose();
                        }).start();
                    });
                }
            }
        });
        elsS.add(el1);

        makeIcon(elsS, 500, 350, 200, 200, "C:\\Users\\setha\\Saba\\elestrals 2.png");
        twoXPowerLabelCost.setBounds(525, 200, 200, 200);
        twoXPowerLabelCost.setVisible(true);
        elsS.add(twoXPowerLabelCost);
        JLabel twoXAb = new JLabel("This Elestral gives 2x click power.");
        twoXAb.setBounds(525, 175, 200, 200);
        twoXAb.setVisible(true);
        elsS.add(twoXAb);
        // add button
        JButton el2 = new JButton();
        el2.setBounds(500, 350, 200, 200);
        el2.setVisible(true);
        el2.setOpaque(false);
        el2.setContentAreaFilled(false);
        el2.setBorderPainted(false);
        el2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
                if(sabucks > twoXPowerCost){
                    sabucks -= twoXPowerCost;
                    twoXPowerCost = twoXPowerCost * 1.1;
                    clickPower *= 2;
                    twoXPowerLabelCost.setText("This costs $"+Math.ceil(twoXPowerCost / 10) * 10+" sabucks");
                }
                else{
                    SwingUtilities.invokeLater(() -> {
                        // Create splash screen
                        JWindow splash = new JWindow();

                        String path = "C:/Users/setha/Saba/cachedImage.png"; // <-- update path
                        ImageIcon icon = new ImageIcon(path);

                        JLabel label = new JLabel(icon);
                        splash.getContentPane().add(label);

                        splash.pack(); // size window to fit image
                        splash.setLocationRelativeTo(null); // center on screen

                        splash.setVisible(true);

                        // Timer to hide after 1 seconds
                        new Timer(1000, erxtx -> {
                            splash.setVisible(false);
                            splash.dispose();
                        }).start();
                    });
                }
            }
        });
        elsS.add(el2);

        makeIcon(elsS, 800, 350, 200, 200, "C:\\Users\\setha\\Saba\\elestrals 3.png");
        critLabelCost.setBounds(825, 200, 200, 200);
        critLabelCost.setVisible(true);
        elsS.add(critLabelCost);
        JLabel critAb = new JLabel("This Elestral gives +5% crit chance.");
        critAb.setBounds(825, 175, 300, 200);
        critAb.setVisible(true);
        elsS.add(critAb);
        // add button
        JButton el3 = new JButton();
        el3.setBounds(800, 350, 200, 200);
        el3.setVisible(true);
        el3.setOpaque(false);
        el3.setContentAreaFilled(false);
        el3.setBorderPainted(false);
        el3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
                if(sabucks > critCost){
                    sabucks -= critCost;
                    critCost = critCost * 1.1;
                    doubleClickChance += 5;
                    critLabelCost.setText("This costs $"+Math.ceil(critCost / 10) * 10+" sabucks");
                }
                else{
                    SwingUtilities.invokeLater(() -> {
                        // Create splash screen
                        JWindow splash = new JWindow();

                        String path = "C:/Users/setha/Saba/cachedImage.png"; // <-- update path
                        ImageIcon icon = new ImageIcon(path);

                        JLabel label = new JLabel(icon);
                        splash.getContentPane().add(label);

                        splash.pack(); // size window to fit image
                        splash.setLocationRelativeTo(null); // center on screen

                        splash.setVisible(true);

                        // Timer to hide after 1 seconds
                        new Timer(1000, erxtx -> {
                            splash.setVisible(false);
                            splash.dispose();
                        }).start();
                    });
                }
            }
        });
        elsS.add(el3);

        makeIcon(elsS, 1100, 350, 200, 200, "C:\\Users\\setha\\Saba\\overdrive.png");
        overdriveLabelCost.setBounds(1125, 200, 200, 200);
        overdriveLabelCost.setVisible(true);
        elsS.add(overdriveLabelCost);
        JLabel odAb = new JLabel("This Elestral gives +50% sps for 30 seconds.");
        odAb.setBounds(1125, 175, 300, 200);
        odAb.setVisible(true);
        elsS.add(odAb);
        // add button
        JButton el4 = new JButton();
        el4.setBounds(1100, 350, 200, 200);
        el4.setVisible(true);
        el4.setOpaque(false);
        el4.setContentAreaFilled(false);
        el4.setBorderPainted(false);
        el4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
                if (sabucks > overdriveCost && !overdrive) {
                    sabucks -= overdriveCost;
                    overdriveCost *= 1.1;
                    overdrive = true;
                    overdriveLabelCost.setText("This costs $"+Math.ceil(overdriveCost / 10) * 10+" sabucks");

                    new Thread(() -> {
                        overDrive();
                        System.out.println(sps);
                        try {
                            TimeUnit.SECONDS.sleep(30);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        overdrive = false;
                    }).start();
                }
                else{
                    SwingUtilities.invokeLater(() -> {
                        // Create splash screen
                        JWindow splash = new JWindow();

                        String path = "C:/Users/setha/Saba/cachedImage.png"; // <-- update path
                        ImageIcon icon = new ImageIcon(path);

                        JLabel label = new JLabel(icon);
                        splash.getContentPane().add(label);

                        splash.pack(); // size window to fit image
                        splash.setLocationRelativeTo(null); // center on screen

                        splash.setVisible(true);

                        // Timer to hide after 1 seconds
                        new Timer(1000, erxtx -> {
                            splash.setVisible(false);
                            splash.dispose();
                        }).start();
                    });
                }
            }
        });
        elsS.add(el4);

    }
    static void activateEliteLocationShop(JFrame itemShopClose, JFrame bonitaFrames){
        itemShopClose.setVisible(false);
        JFrame els = new JFrame();
        els.setLayout(null);
        els.setSize(1920, 1080);
        els.getContentPane().setBackground(Color.yellow);
        els.setVisible(true);
        els.setTitle("Saba's very own ELITE location shop!");
        ImageIcon EliteIcon = new ImageIcon("C:\\Users\\setha\\Saba\\elite subscription.png");
        els.setIconImage(EliteIcon.getImage());
        
        makeIcon(els, 1462, 25, 50, 50, "C:\\Users\\setha\\Saba\\x.png");
        JButton xButton = new JButton();
        xButton.setBounds(1462, 25, 50, 50);
        xButton.setVisible(true);
        xButton.setOpaque(false);
        xButton.setContentAreaFilled(false);
        xButton.setBorderPainted(false);
        els.add(xButton);
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
                deactivateItemShop(bonitaFrames, els);
            }
        });

        if(allTheLocationsGathered[1].getLocationOwn() == false){
            JButton sawButton = new JButton();
            sawButton.setLayout(null);
            makeIcon(els, 300, 300, 200, 200, "C:\\Users\\setha\\Saba\\sawbucks.png");
            sawButton.setBounds(300, 300, 200, 200);
            sawButton.setVisible(true);
            sawButton.setBorderPainted(false);
            sawButton.setOpaque(false);
            sawButton.setContentAreaFilled(false);
            els.add(sawButton);
            sawButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    System.out.println("Button clicked!");
                    if(!buyLocation(allTheLocationsGathered, 1)){
                        SwingUtilities.invokeLater(() -> {
                        // Create splash screen
                        JWindow splash = new JWindow();

                        String path = "C:/Users/setha/Saba/cachedImage.png"; // <-- update path
                        ImageIcon icon = new ImageIcon(path);

                        JLabel label = new JLabel(icon);
                        splash.getContentPane().add(label);

                        splash.pack(); // size window to fit image
                        splash.setLocationRelativeTo(null); // center on screen

                        splash.setVisible(true);

                        // Timer to hide after 1 seconds
                        new Timer(1000, erxtx -> {
                            splash.setVisible(false);
                            splash.dispose();
                        }).start();
                        });
                    }
                    else{
                        System.out.println("ararararar");
                    }
                }
            });
        }
        if(allTheLocationsGathered[3].getLocationOwn() == false){
            JButton snaButton = new JButton();
            snaButton.setLayout(null);
            makeIcon(els, 650, 300, 200, 200, "C:\\Users\\setha\\Saba\\snack store.jpg");
            snaButton.setBounds(650, 300, 200, 200);
            snaButton.setVisible(true);
            snaButton.setBorderPainted(false);
            snaButton.setContentAreaFilled(false);
            snaButton.setOpaque(false);
            els.add(snaButton);
            snaButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    System.out.println("Button clicked!");
                    if(!buyLocation(allTheLocationsGathered, 3)){
                        SwingUtilities.invokeLater(() -> {
                        // Create splash screen
                        JWindow splash = new JWindow();

                        String path = "C:/Users/setha/Saba/cachedImage.png"; // <-- update path
                        ImageIcon icon = new ImageIcon(path);

                        JLabel label = new JLabel(icon);
                        splash.getContentPane().add(label);

                        splash.pack(); // size window to fit image
                        splash.setLocationRelativeTo(null); // center on screen

                        splash.setVisible(true);

                        // Timer to hide after 1 seconds
                        new Timer(1000, erxtx -> {
                            splash.setVisible(false);
                            splash.dispose();
                        }).start();
                        });
                    }
                    else{
                        for(int i = 0; i < allTheLocationsGathered.length; i++){
                            System.out.println(allTheLocationsGathered[i].getLocationOwn());
                        }
                    }
                }
            });
        }
        if(!allTheLocationsGathered[4].getLocationOwn()){
            JButton bankButton = new JButton();
            bankButton.setLayout(null);
            makeIcon(els, 950, 300, 200, 200, "C:\\Users\\setha\\Saba\\sabaBank.jpg");
            bankButton.setBounds(950, 300, 200, 200);
            bankButton.setVisible(true);
            bankButton.setBorderPainted(false);
            bankButton.setContentAreaFilled(false);
            bankButton.setOpaque(false);
            els.add(bankButton);
            bankButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    System.out.println("Button clicked!");
                    if(!buyLocation(allTheLocationsGathered, 4)){
                        SwingUtilities.invokeLater(() -> {
                        // Create splash screen
                        JWindow splash = new JWindow();

                        String path = "C:/Users/setha/Saba/cachedImage.png"; // <-- update path
                        ImageIcon icon = new ImageIcon(path);

                        JLabel label = new JLabel(icon);
                        splash.getContentPane().add(label);

                        splash.pack(); // size window to fit image
                        splash.setLocationRelativeTo(null); // center on screen

                        splash.setVisible(true);

                        // Timer to hide after 1 seconds
                        new Timer(1000, erxtx -> {
                            splash.setVisible(false);
                            splash.dispose();
                        }).start();
                        });
                    }
                }
            });
        }
    }
    static void activateSabaShop(JFrame bonitaFrames){
        bonitaFrames.setVisible(false);
        JFrame sash = new JFrame();
        sash.setLayout(null);
        sash.setSize(1920, 1080);
        sash.getContentPane().setBackground(Color.yellow);
        ImageIcon sashIcon = new ImageIcon("C:\\Users\\setha\\Saba\\inventory.png");
        sash.setIconImage(sashIcon.getImage());
        sash.setVisible(true);
        sash.setTitle("Saba's very own Saba shop");

        makeIcon(sash, 1462, 25, 50, 50, "C:\\Users\\setha\\Saba\\x.png");
        JButton xButton = new JButton();
        xButton.setBounds(1462, 25, 50, 50);
        xButton.setVisible(true);
        xButton.setOpaque(false);
        xButton.setContentAreaFilled(false);
        xButton.setBorderPainted(false);
        sash.add(xButton);
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
                deactivateItemShop(bonitaFrames, sash);
            }
        });
        // saba
        for (int iindex = 0; iindex < allTheSabasGathered.length; iindex++) {
            final int i = iindex;
            String sabaFilePath;

            // pick correct file path
            if (i == 0) sabaFilePath = "C:\\Users\\setha\\Saba\\IMG_3360.PNG";
            else if (i == 1) sabaFilePath = "C:\\Users\\setha\\Saba\\green saba.jpg";
            else if (i == 2) sabaFilePath = "C:\\Users\\setha\\Saba\\real incredibly demure saba.jpg";
            else if (i == 3) sabaFilePath = "C:\\Users\\setha\\Saba\\real evil saba.jpg";
            else if (i == 4) sabaFilePath = "C:\\Users\\setha\\Saba\\business saba.jpg";
            else if (i == 5) sabaFilePath = "C:\\Users\\setha\\Saba\\saba item shop.jpg";
            else if (i == 6) sabaFilePath = "C:\\Users\\setha\\Saba\\rich saba.jpg";
            else if (i == 7) sabaFilePath = "C:\\Users\\setha\\Saba\\bank saba.jpg";
            else if (i == 8) sabaFilePath = "C:\\Users\\setha\\Saba\\pokemon trainer saba.jpg";
            else if (i == 9) sabaFilePath = "C:\\Users\\setha\\Saba\\alien saba.jpg";
            else if (i == 10) sabaFilePath = "C:\\Users\\setha\\Saba\\oompa loompa saba.jpg";
            else if (i == 11) sabaFilePath = "C:\\Users\\setha\\Saba\\mark cuban saba.jpg";
            else if (i == 12) sabaFilePath = "C:\\Users\\setha\\Saba\\idk how to spell it saba.jpg";
            else if (i == 13) sabaFilePath = "C:\\Users\\setha\\Saba\\non political presidential saba.jpg";
            else if (i == 14) sabaFilePath = "C:\\Users\\setha\\Saba\\old saba.jpg";
            else if (i == 15) sabaFilePath = "C:\\Users\\setha\\Saba\\balatro saba.jpg";
            else sabaFilePath = "C:\\Users\\setha\\Saba\\high contrast saba.jpg";

            // only display if player owns this Saba
            if (allTheSabasGathered[i].getOwn() == false) {
                if(allTheSabasGathered[0].getOwn() == true){

                    // scale image
                    ImageIcon icon = new ImageIcon(sabaFilePath);
                    Image img = icon.getImage();
                    Image scaledImg = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                    icon = new ImageIcon(scaledImg);

                    // make the button with the image
                    JButton sabaButton = new JButton(icon);
                    sabaButton.setOpaque(false);
                    sabaButton.setContentAreaFilled(false);
                    sabaButton.setBorderPainted(false);

                    int xPos, yPos;
                    if (i < 7) {
                        xPos = 75 + (200 * i);
                        yPos = 100;
                    } else if (i < 14) {
                        xPos = 75 + (200 * (i - 7));
                        yPos = 450;
                    } else {
                        xPos = 75 + (200 * (i - 14));
                        yPos = 750;
                    }

                    sabaButton.setBounds(xPos, yPos, 200, 200);

                    // add labels for name + SPS
                    JLabel sabaName = new JLabel(allTheSabasGathered[i].getName());
                    sabaName.setBounds(xPos, yPos - 50, 200, 30);
                    sash.add(sabaName);

                    JLabel sabaSPS = new JLabel(allTheSabasGathered[i].getSPS() + " sps");
                    sabaSPS.setBounds(xPos, yPos - 25, 200, 30);
                    sash.add(sabaSPS);

                    JLabel sabaCost = new JLabel("$"+allTheSabasGathered[i].getCost());
                    sabaCost.setBounds(xPos, yPos - 75, 200, 30);
                    sash.add(sabaCost);

                    sash.add(sabaButton);

                    sabaButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e){
                            if(buySaba(allTheSabasGathered, i)){
                                allTheSabasGathered[i].setOwn(true);
                            }
                            else{
                                SwingUtilities.invokeLater(() -> {
                                // Create splash screen
                                JWindow splash = new JWindow();

                                String path = "C:/Users/setha/Saba/cachedImage.png"; // <-- update path
                                ImageIcon icon = new ImageIcon(path);

                                JLabel label = new JLabel(icon);
                                splash.getContentPane().add(label);

                                splash.pack(); // size window to fit image
                                splash.setLocationRelativeTo(null); // center on screen

                                splash.setVisible(true);

                                // Timer to hide after 1 seconds
                                new Timer(1000, erxtx -> {
                                    splash.setVisible(false);
                                    splash.dispose();
                                }).start();
                                });
                            }
                        }
                    });
                }
                else{
                    // scale image
                    ImageIcon icon = new ImageIcon(sabaFilePath);
                    Image img = icon.getImage();
                    Image scaledImg = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                    icon = new ImageIcon(scaledImg);

                    // make the button with the image
                    JButton sabaButton = new JButton(icon);
                    sabaButton.setOpaque(false);
                    sabaButton.setContentAreaFilled(false);
                    sabaButton.setBorderPainted(false);

                    int xPos, yPos;
                    if (0 < 7) {
                        xPos = 75 + (200 * 0);
                        yPos = 100;
                    }

                    sabaButton.setBounds(xPos, yPos, 200, 200);

                    // add labels for name + SPS
                    JLabel sabaName = new JLabel(allTheSabasGathered[0].getName());
                    sabaName.setBounds(xPos, yPos - 50, 200, 30);
                    sash.add(sabaName);

                    JLabel sabaSPS = new JLabel(allTheSabasGathered[0].getSPS() + " sps");
                    sabaSPS.setBounds(xPos, yPos - 25, 200, 30);
                    sash.add(sabaSPS);

                    JLabel sabaCost = new JLabel("$"+allTheSabasGathered[0].getCost());
                    sabaCost.setBounds(xPos, yPos - 75, 200, 30);
                    sash.add(sabaCost);

                    sash.add(sabaButton);

                    sabaButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e){
                            if(buySaba(allTheSabasGathered, 0)){
                                allTheSabasGathered[0].setOwn(true);
                            }
                            else{
                                SwingUtilities.invokeLater(() -> {
                                // Create splash screen
                                JWindow splash = new JWindow();

                                String path = "C:/Users/setha/Saba/cachedImage.png"; // <-- update path
                                ImageIcon icon = new ImageIcon(path);

                                JLabel label = new JLabel(icon);
                                splash.getContentPane().add(label);

                                splash.pack(); // size window to fit image
                                splash.setLocationRelativeTo(null); // center on screen

                                splash.setVisible(true);

                                // Timer to hide after 1 seconds
                                new Timer(1000, erxtx -> {
                                    splash.setVisible(false);
                                    splash.dispose();
                                }).start();
                                });
                            }
                        }
                    });
                }
            }
        }

    }
    static void activateSabaInv(JFrame frame, JFrame bonitaFrames){
        frame.setVisible(false);
        JFrame sabaInv = new JFrame();
        sabaInv.setLayout(null);
        sabaInv.setSize(1920, 1080);
        sabaInv.getContentPane().setBackground(Color.YELLOW);
        sabaInv.setTitle("You're very own Saba inventory!");
        ImageIcon sabaInvIcon = new ImageIcon("C:\\Users\\setha\\Saba\\saba cookie.png");
        sabaInv.setIconImage(sabaInvIcon.getImage());
        sabaInv.setVisible(true);

        // x button
        makeIcon(sabaInv, 1462, 25, 50, 50, "C:\\Users\\setha\\Saba\\x.png");
        JButton xButton = new JButton();
        xButton.setBounds(1462, 25, 50, 50);
        xButton.setVisible(true);
        xButton.setOpaque(false);
        xButton.setContentAreaFilled(false);
        xButton.setBorderPainted(false);
        sabaInv.add(xButton);
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
                deactivateItemShop(bonitaFrames, sabaInv);
                
                // the hand
                bonitaFrames.getContentPane().removeAll();
                createStartUI(bonitaFrames);
                int xPos = 375;
                String sabaPath;
                for(int i = 0; i < hand.length; i++){
                    if(hand[i] != null){
                        sabaPath = hand[i].getPath();
                    }
                    else{
                        sabaPath = null;
                    }
                    xPos = 525 + (250*i);
                    System.out.println("Drawing Saba at x=" + xPos + " path=" + sabaPath);
                    makeIcon(bonitaFrames, xPos, 87, 125, 125, sabaPath);
                    bonitaFrames.repaint();
                }
                    }
                });

        // saba
        String sabaFilePath;
        boolean hasSaba = false;
        //static String[] nameOfSaba = new String[]{"saba", "green saba", "incredibly demure saba", "evil saba", "business saba", "saba item shop", "rich saba", "bank saba", "pokemon trainer saba", "alien saba", "oompa loompa saba", "investor saba", "lucky saba", "non-political presidential saba", "old saba", "balatro saba",  "high contrast saba"}; // hc saba kills all sabas + new sabas with him in hand are negative but perm 10% cheaper while in hand plus 10% sps increase | balatro saba gives mult | shop keeper saba unlocks items beyond self serve machine and chefs
        for(int iindex = 0; iindex < allTheSabasGathered.length; iindex++){
            final int i = iindex;
            if(i == 0){
                sabaFilePath = "C:/Users/setha/Saba/IMG_3360.PNG";
                if(allTheSabasGathered[0].getOwn()){
                    hasSaba = true;
                }
            }
            else if(i == 1){
                sabaFilePath = "C:\\Users\\setha\\Saba\\green saba.jpg";
                if(allTheSabasGathered[1].getOwn()){
                    hasSaba = true;
                }
            }
            else if(i == 2){
                sabaFilePath = "C:\\Users\\setha\\Saba\\real incredibly demure saba.jpg";
                if(allTheSabasGathered[2].getOwn()){
                    hasSaba = true;
                }
            }
            else if(i == 3){
                sabaFilePath = "C:\\Users\\setha\\Saba\\real evil saba.jpg";
                if(allTheSabasGathered[3].getOwn()){
                    hasSaba = true;
                }
            }
            else if(i == 4){
                sabaFilePath = "C:\\Users\\setha\\Saba\\business saba.jpg";
                if(allTheSabasGathered[4].getOwn()){
                    hasSaba = true;
                }
            }
            else if(i == 5){
                sabaFilePath = "C:\\Users\\setha\\Saba\\saba item shop.jpg";
                if(allTheSabasGathered[5].getOwn()){
                    hasSaba = true;
                }
            }
            else if(i == 6){
                sabaFilePath = "C:\\Users\\setha\\Saba\\rich saba.jpg";
                if(allTheSabasGathered[6].getOwn()){
                    hasSaba = true;
                }
            }
            else if(i == 7){
                sabaFilePath = "C:\\Users\\setha\\Saba\\bank saba.jpg";
                if(allTheSabasGathered[7].getOwn()){
                    hasSaba = true;
                }
            }
            else if(i == 8){
                sabaFilePath = "C:\\Users\\setha\\Saba\\pokemon trainer saba.jpg";
                if(allTheSabasGathered[8].getOwn()){
                    hasSaba = true;
                }
            }
            else if(i == 9){
                sabaFilePath = "C:\\Users\\setha\\Saba\\alien saba.jpg";
                if(allTheSabasGathered[9].getOwn()){
                    hasSaba = true;
                }
            }
            else if(i == 10){
                sabaFilePath = "C:\\Users\\setha\\Saba\\oompa loompa saba.jpg";
                if(allTheSabasGathered[10].getOwn()){
                    hasSaba = true;
                }
            }
            else if(i == 11){
                sabaFilePath = "C:\\Users\\setha\\Saba\\mark cuban saba.jpg";
                if(allTheSabasGathered[11].getOwn()){
                    hasSaba = true;
                }
            }
            else if(i == 12){
                sabaFilePath = "C:\\Users\\setha\\Saba\\idk how to spell it saba.jpg";
                if(allTheSabasGathered[12].getOwn()){
                    hasSaba = true;
                }
            }
            else if(i == 13){
                sabaFilePath = "C:\\Users\\setha\\Saba\\non political presidential saba.jpg";
                if(allTheSabasGathered[13].getOwn()){
                    hasSaba = true;
                }
            }
            else if(i == 14){
                sabaFilePath = "C:\\Users\\setha\\Saba\\old saba.jpg";
                if(allTheSabasGathered[14].getOwn()){
                    hasSaba = true;
                }
            }
            else if(i == 15){
                sabaFilePath = "C:\\Users\\setha\\Saba\\balatro saba.jpg";
                if(allTheSabasGathered[15].getOwn()){
                    hasSaba = true;
                }
            }
            else{
                sabaFilePath = "C:\\Users\\setha\\Saba\\high contrast saba.jpg";
                if(allTheSabasGathered[16].getOwn()){
                    hasSaba = true;
                }
            }
            int sabaInvXPos;
            JButton sabaButton = new JButton();
            if(i < 7){
                if(allTheSabasGathered[i].getOwn()){
                    sabaInvXPos = 75 + (200 * i);
                    makeIcon(sabaInv, sabaInvXPos, 100, 200, 200, sabaFilePath);
                    sabaButton.setBounds(sabaInvXPos, 100, 200, 200);
                    JLabel sabaName = new JLabel();
                    sabaName.setText(allTheSabasGathered[i].getName());
                    sabaName.setBounds(sabaInvXPos, 50, 200, 30);
                    sabaName.setVisible(true);
                    sabaInv.add(sabaName);
                    JLabel sabaSPS = new JLabel();
                    double spspsps = allTheSabasGathered[i].getSPS();
                    String textSPS = Double.toString(spspsps);
                    sabaSPS.setText(textSPS+" sps");
                    sabaSPS.setBounds(sabaInvXPos, 75, 200, 30);
                    sabaSPS.setVisible(true);
                    sabaInv.add(sabaSPS);
                }
            }
            else if(i < 14){
                if(allTheSabasGathered[i].getOwn()){
                    int xTempPos = 75 + (200 * (i-7));
                    makeIcon(sabaInv, xTempPos, 450, 200, 200, sabaFilePath);
                    sabaButton.setBounds(xTempPos, 450, 200, 200);
                    JLabel sabaName = new JLabel();
                    sabaName.setText(allTheSabasGathered[i].getName());
                    sabaName.setBounds(xTempPos, 400, 200, 30);
                    sabaName.setVisible(true);
                    sabaInv.add(sabaName);
                    JLabel sabaSPS = new JLabel();
                    double spspsps = allTheSabasGathered[i].getSPS();
                    String textSPS = Double.toString(spspsps);
                    sabaSPS.setText(textSPS+" sps");
                    sabaSPS.setBounds(xTempPos, 425, 200, 30);
                    sabaSPS.setVisible(true);
                    sabaInv.add(sabaSPS);
                }
            }
            else{
                if(allTheSabasGathered[i].getOwn()){
                    int xTempPos = 75 + (200 * (i-14));
                    makeIcon(sabaInv, xTempPos, 750, 200, 200, sabaFilePath);
                    sabaButton.setBounds(xTempPos, 750, 200, 200); 
                    JLabel sabaName = new JLabel();
                    sabaName.setText(allTheSabasGathered[i].getName());
                    sabaName.setBounds(xTempPos, 700, 200, 30);
                    sabaName.setVisible(true);
                    sabaInv.add(sabaName);
                    JLabel sabaSPS = new JLabel();
                    double spspsps = allTheSabasGathered[i].getSPS();
                    String textSPS = Double.toString(spspsps);
                    sabaSPS.setText(textSPS+" sps");
                    sabaSPS.setBounds(xTempPos, 725, 200, 30);
                    sabaSPS.setVisible(true);
                    sabaInv.add(sabaSPS);
                }
            }
            sabaButton.setVisible(true);
            sabaButton.setOpaque(false);
            sabaButton.setContentAreaFilled(false);
            sabaButton.setBorderPainted(false);
            sabaInv.add(sabaButton);
            sabaButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Button clicked!");
                    boolean added = false;
                    // saba cant be in hand
                    // saba must be placed in null
                    // clicking a saba in hand results in removing that saba from hand
                    for(int j = 0; j < 3; j++){
                         if (hand[j] == allTheSabasGathered[i]) {
                        // Shift everything left
                        for (int k = j; k < hand.length - 1; k++) {
                            hand[k] = hand[k + 1];
                        }
                        // Null out the last slot
                        hand[hand.length - 1] = null;
                        break; // stop after removing once
    }
                        else if(hand[j] == null && added == false){
                            hand[j] = allTheSabasGathered[i];
                            added = true;
                            break;
                        }
                        else{
                            System.out.println("Hand is full");
                        }
                    }
                    for(int i = 0; i < hand.length; i++){
                        if(hand[i] == null){
                            System.out.println(hand[i]);
                            continue;
                        }
                        System.out.println(hand[i].getName());
                    }
                }
            });
        }
    }
    static void activateLocationInv(JFrame frame, JFrame bonitaFrames){
        frame.setVisible(false);
        JFrame locationInv = new JFrame();
        locationInv.setLayout(null);
        locationInv.setSize(1920, 1080);
        locationInv.getContentPane().setBackground(Color.YELLOW);
        locationInv.setTitle("You're very own location inventory!");
        ImageIcon lInvIcon = new ImageIcon("C:\\Users\\setha\\Saba\\location icon.png");
        locationInv.setIconImage(lInvIcon.getImage());
        locationInv.setVisible(true);
        if(allTheLocationsGathered[0].getLocationOwn()){
            ImageIcon pdh = new ImageIcon("C:\\Users\\setha\\Saba\\purchase dining hall.png");
            JLabel label = new JLabel();  
            JButton pdhButton = new JButton(pdh);
            pdhButton.setBorderPainted(false);
            pdhButton.setContentAreaFilled(false); 
            pdhButton.setFocusPainted(false); 
            pdhButton.setOpaque(false);
            pdhButton.setBounds(200, 100, 200, 200);
            label.setBounds(200, 100, 200, 200);
            locationInv.add(pdhButton);
            locationInv.add(label);
            pdhButton.setVisible(true);
            pdhButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Button clicked!");
                    eLocation = allTheLocationsGathered[0];
                }
            });
        }
        if(allTheLocationsGathered[2].getLocationOwn()){
            ImageIcon h = new ImageIcon("C:\\Users\\setha\\Saba\\dining hub.jpg");
            JLabel label2 = new JLabel();  
            JButton hButton = new JButton(h);
            hButton.setBorderPainted(false);
            hButton.setContentAreaFilled(false); 
            hButton.setFocusPainted(false); 
            hButton.setOpaque(false);
            hButton.setBounds(415, 100, 200, 200);
            label2.setBounds(415, 100, 200, 200);
            locationInv.add(hButton);
            locationInv.add(label2);
            hButton.setVisible(true);
            hButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Button clicked!");
                    eLocation = allTheLocationsGathered[2];
                }
            });
        }
        if(allTheLocationsGathered[1].getLocationOwn()){
            ImageIcon sb = new ImageIcon("C:\\Users\\setha\\Saba\\sawbucks.png");
            Image img = sb.getImage();
            Image scaledImg = img.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
            sb = new ImageIcon(scaledImg);
            JLabel label3 = new JLabel();  
            JButton sButton = new JButton(sb);
            sButton.setBorderPainted(false);
            sButton.setContentAreaFilled(false); 
            sButton.setFocusPainted(false); 
            sButton.setOpaque(false);
            sButton.setBounds(630, 100, 200, 200);
            label3.setBounds(630, 100, 200, 200);
            locationInv.add(sButton);
            locationInv.add(label3);
            sButton.setVisible(true);
            sButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Button clicked!");
                    eLocation = allTheLocationsGathered[1];
                }
            });
        }
        if(allTheLocationsGathered[3].getLocationOwn()){
            ImageIcon ss = new ImageIcon("C:\\Users\\setha\\Saba\\snack store.jpg");
            Image img2 = ss.getImage();
            Image scaledImg2 = img2.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
            ss = new ImageIcon(scaledImg2);
            JLabel label4 = new JLabel();  
            JButton ssButton = new JButton(ss);
            ssButton.setBorderPainted(false);
            ssButton.setContentAreaFilled(false); 
            ssButton.setFocusPainted(false); 
            ssButton.setOpaque(false);
            ssButton.setBounds(845, 100, 200, 200);
            label4.setBounds(845, 100, 200, 200);
            locationInv.add(ssButton);
            locationInv.add(label4);
            ssButton.setVisible(true);
            ssButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Button clicked!");
                    eLocation = allTheLocationsGathered[3];
                }
            });
        }
        ImageIcon bs = new ImageIcon("C:\\Users\\setha\\Saba\\saba bank ad.jpg");
        Image img3 = bs.getImage();
        Image scaledImg3 = img3.getScaledInstance(500, 315, java.awt.Image.SCALE_SMOOTH);
        bs = new ImageIcon(scaledImg3);
        JLabel label5 = new JLabel();  
        JButton bsButton = new JButton(bs);
        bsButton.setBorderPainted(false);
        bsButton.setContentAreaFilled(false); 
        bsButton.setFocusPainted(false); 
        bsButton.setOpaque(false);
        bsButton.setBounds(600, 550, 500, 315);
        label5.setBounds(600, 550, 500, 315);
        locationInv.add(bsButton);
        locationInv.add(label5);
        bsButton.setVisible(true);
        bsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        makeIcon(locationInv, 1462, 25, 50, 50, "C:\\Users\\setha\\Saba\\x.png");
        JButton xButton = new JButton();
        xButton.setBounds(1462, 25, 50, 50);
        xButton.setVisible(true);
        xButton.setLayout(null);
        xButton.setOpaque(false);
        xButton.setContentAreaFilled(false);
        xButton.setBorderPainted(false);
        locationInv.add(xButton);
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
                deactivatelocationShop(locationInv, bonitaFrames);
            }
        });
    }
    static void activateInventory(JFrame bonitaFrames){
        bonitaFrames.setVisible(false);
        JFrame invFrame = new JFrame();
        ImageIcon invIcon = new ImageIcon("C:\\\\Users\\\\User\\\\Desktop\\\\Saba\\\\inventory.png");
        invFrame.setIconImage(invIcon.getImage());
        invFrame.setSize(1920, 1080);
        invFrame.getContentPane().setBackground(Color.yellow);
        invFrame.setTitle("Saba's very own inventory opener");
        invFrame.setVisible(true);
        
        ImageIcon lIcon = new ImageIcon("C:\\Users\\setha\\Saba\\location icon.png");
        Image img = lIcon.getImage();
        Image l = img.getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH);
        lIcon = new ImageIcon(l);
        JLabel label = new JLabel();
        label.setIcon(lIcon);
        label.setVisible(true);
        invFrame.add(label, BorderLayout.WEST);
        JButton lButton = new JButton();
        lButton.setBounds(0, 300, 500, 500);
        lButton.setVisible(true);
        lButton.setOpaque(false);
        lButton.setContentAreaFilled(false);
        lButton.setBorderPainted(false);
        lButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Button clicked!");
                activateLocationInv(invFrame, bonitaFrames);
            }
        });
        label.add(lButton);

        ImageIcon sIcon = new ImageIcon("C:\\Users\\setha\\Saba\\saba cookie.png");
        Image img2 = sIcon.getImage();
        Image s = img2.getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH);
        sIcon = new ImageIcon(s);
        JLabel label2 = new JLabel();
        label2.setIcon(sIcon);
        label2.setVisible(true);
        invFrame.add(label2, BorderLayout.EAST);    
        JButton sButton = new JButton();
        sButton.setBounds(0, 215, 500, 500);
        label2.add(sButton);
        sButton.setVisible(true);
        sButton.setOpaque(false);
        sButton.setContentAreaFilled(false);
        sButton.setBorderPainted(false);
        sButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Button clicked!");
                activateSabaInv(invFrame, bonitaFrames);
            }
        });

    }
    static void activateBasicLocationShop(JFrame itemShop, JFrame bonitaFrames){
        itemShop.setVisible(false);
        JFrame locationShop = new JFrame();
        locationShop.setSize(1920, 1080);
        locationShop.getContentPane().setBackground(Color.yellow);
        locationShop.setTitle("Saba's very own basic location shop");
        locationShop.getContentPane().setBackground(Color.PINK);
        locationShop.setVisible(true);
        ImageIcon basicSubscription = new ImageIcon("C:\\Users\\setha\\Saba\\basic subscription.png");
        locationShop.setIconImage(basicSubscription.getImage());
        makeIcon(locationShop, 1462, 25, 50, 50, "C:\\Users\\setha\\Saba\\x.png");
        JButton xButton = new JButton();
        xButton.setBounds(1462, 25, 50, 50);
        xButton.setVisible(true);
        xButton.setOpaque(false);
        xButton.setContentAreaFilled(false);
        xButton.setBorderPainted(false);
        locationShop.add(xButton);
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
                deactivatelocationShop(locationShop, bonitaFrames);
            }
        });
        if(allTheLocationsGathered[2].getLocationOwn()){
            makeIcon(locationShop, 0, 725, 200, 200, "C:\\Users\\setha\\Saba\\come here saba.png");
            JButton elsButton = new JButton();
            elsButton.setBounds(0, 725, 200, 200);
            elsButton.setVisible(true);
            elsButton.setOpaque(false);
            elsButton.setContentAreaFilled(false);
            elsButton.setBorderPainted(false);
            locationShop.add(elsButton);
            elsButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) { 
                    System.out.println("Button clicked!");
                    activateEliteLocationShop(locationShop, bonitaFrames);
                }
            });
        }
        makeIcon(locationShop, 150, 300, 500, 300, "C:\\Users\\setha\\Saba\\purchase dining hall.png");
        JButton dHButton = new JButton();
        dHButton.setBounds(150, 300, 500, 300);
        dHButton.setVisible(true);
        dHButton.setOpaque(false);
        dHButton.setContentAreaFilled(false);
        dHButton.setBorderPainted(false);
        locationShop.add(dHButton);
        dHButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int itemPos = 0;
                for(int i = 0; i < allTheLocationsGathered.length; i++){
                    if(allTheLocationsGathered[i].getLocationName().equals("dining hall")){
                        System.out.println("Item found");
                        itemPos = i;
                    }
                }
                System.out.println("item bought");
                if(buyLocation(allTheLocationsGathered, itemPos) == false){
                    SwingUtilities.invokeLater(() -> {
                    // Create splash screen
                    JWindow splash = new JWindow();

                    String path = "C:/Users/setha/Saba/cachedImage.png"; // <-- update path
                    ImageIcon icon = new ImageIcon(path);

                    JLabel label = new JLabel(icon);
                    splash.getContentPane().add(label);

                    splash.pack(); // size window to fit image
                    splash.setLocationRelativeTo(null); // center on screen

                    splash.setVisible(true);

                    // Timer to hide after 1 seconds
                    new Timer(1000, erxtx -> {
                        splash.setVisible(false);
                        splash.dispose();
                    }).start();
                    });
                }
                System.out.println(allTheLocationsGathered[itemPos].getLocationOwn());
                System.out.println("Button clicked!");
            }
        });
        JLabel diningHallDisplay = new JLabel();
        diningHallDisplay.setText("110 sps");
        diningHallDisplay.setBounds(350, 150, 100, 100);
        diningHallDisplay.setVisible(true);
        locationShop.add(diningHallDisplay);
        JLabel diningHallDisplayCost = new JLabel();
        diningHallDisplayCost.setText("$100000 sabucks");
        diningHallDisplayCost.setBounds(350, 175, 200, 100);
        diningHallDisplayCost.setVisible(true);
        locationShop.add(diningHallDisplayCost);
        JLabel diningHallDisplayAbility = new JLabel();
        diningHallDisplayAbility.setText("Makes everything 5% cheaper");
        diningHallDisplayAbility.setBounds(350, 200, 200, 100);
        diningHallDisplayAbility.setVisible(true);
        locationShop.add(diningHallDisplayAbility);
        JLabel din = new JLabel();
        din.setText("makes everything 5% cheaper");
        din.setBounds(350, 200, 400, 100);
        din.setVisible(false);
        locationShop.add(din);
        
        makeIcon(locationShop, 700, 300, 500, 300, "C:\\Users\\setha\\Saba\\dining hub.jpg");
        JButton hButton = new JButton();
        hButton.setBounds(700, 300, 500, 300);
        hButton.setVisible(true);
        hButton.setOpaque(false);
        hButton.setContentAreaFilled(false);
        hButton.setBorderPainted(false);
        locationShop.add(hButton);
        hButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int itemPos = 0;
                for(int i = 0; i < allTheLocationsGathered.length; i++){
                    if(allTheLocationsGathered[i].getLocationName().equals("hub")){
                        System.out.println("Item found");
                        itemPos = i;
                    }
                }
                System.out.println("item bought");
                if(buyLocation(allTheLocationsGathered, itemPos) == false){
                    SwingUtilities.invokeLater(() -> {
                    // Create splash screen
                    JWindow splash = new JWindow();

                    String path = "C:/Users/setha/Saba/cachedImage.png"; // <-- update path
                    ImageIcon icon = new ImageIcon(path);

                    JLabel label = new JLabel(icon);
                    splash.getContentPane().add(label);

                    splash.pack(); // size window to fit image
                    splash.setLocationRelativeTo(null); // center on screen

                    splash.setVisible(true);

                    // Timer to hide after 1 seconds
                    new Timer(1000, erxtx -> {
                        splash.setVisible(false);
                        splash.dispose();
                    }).start();
                    });
                }
                System.out.println(allTheLocationsGathered[itemPos].getLocationOwn());
                System.out.println("Button clicked!");
            }
        });
        JLabel hDisplay = new JLabel();
        hDisplay.setText("130 sps");
        hDisplay.setBounds(750, 150, 100, 100);
        hDisplay.setVisible(true);
        locationShop.add(hDisplay);
        JLabel hDisplayCost = new JLabel();
        hDisplayCost.setText("$1000000 sabucks");
        hDisplayCost.setBounds(750, 175, 200, 100);
        hDisplayCost.setVisible(true);
        locationShop.add(hDisplayCost);
        JLabel hDisplayAbility = new JLabel();
        hDisplayAbility.setText("Unlocks the premium subscription of the location shop");
        hDisplayAbility.setBounds(750, 200, 500, 100);
        hDisplayAbility.setVisible(true);
        locationShop.add(hDisplayAbility);
        JLabel h = new JLabel();
        h.setText("sakjbdajhbs");
        h.setBounds(750, 200, 500, 100);
        h.setVisible(false);
        locationShop.add(h);
        JLabel r = new JLabel();
        r.setText("You own this and cannot buy it again");
        r.setBounds(750, 225, 500, 100);
        if(allTheLocationsGathered[2].getLocationOwn() == true){
            r.setVisible(true);
        }
        else{
            r.setVisible(false);
        }
        locationShop.add(r);
        JLabel e = new JLabel();
        e.setText("You own this and cannot buy it again");
        e.setBounds(750, 225, 500, 100);
        e.setVisible(false);
        locationShop.add(e);
    }
    static void activateBasicItemShop(JFrame bonitaFrames){
        bonitaFrames.setVisible(false);
        JFrame itemShop = new JFrame();
        itemShop.setSize(1920, 1080);
        itemShop.getContentPane().setBackground(Color.yellow);
        itemShop.setTitle("Saba's very own basic item shop");
        itemShop.setVisible(true);
        ImageIcon basicSubscription = new ImageIcon("C:\\Users\\setha\\Saba\\basic subscription.png");
        itemShop.setIconImage(basicSubscription.getImage());
        makeIcon(itemShop, 1462, 25, 50, 50, "C:\\Users\\setha\\Saba\\x.png");
        JButton xButton = new JButton();
        xButton.setBounds(1462, 25, 50, 50);
        xButton.setVisible(true);
        xButton.setOpaque(false);
        xButton.setContentAreaFilled(false);
        xButton.setBorderPainted(false);
        itemShop.add(xButton);
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                System.out.println("Button clicked!");
                deactivateItemShop(bonitaFrames, itemShop);
            }
        });
        if(allTheSabasGathered[5].getOwn()){
            makeIcon(itemShop, 0, 725, 200, 200, "C:\\Users\\setha\\Saba\\come here saba.png");
            JButton chsButton = new JButton();
            chsButton.setBounds(0, 725, 200, 200);
            chsButton.setVisible(true);
            chsButton.setOpaque(false);
            chsButton.setContentAreaFilled(false);
            chsButton.setBorderPainted(false);
            itemShop.add(chsButton);
            chsButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) { 
                    System.out.println("Button clicked!");
                    activateEliteItemShop(bonitaFrames, itemShop);
                }
            });
        }
        JLabel ssmLabel = new JLabel();
        ssmLabel.setText("This costs "+allTheItemsGathered[0].getItemCost()+". It give 0.1 sps!");
        ssmLabel.setBounds(275, 100, 500, 100);
        ssmLabel.setVisible(true);
        itemShop.add(ssmLabel);
        ImageIcon ssm = new ImageIcon("C:\\Users\\setha\\Saba\\self serve machine.png");
        JLabel label = new JLabel();  
        JButton ssmButton = new JButton(ssm);
        ssmButton.setBorderPainted(false);
        ssmButton.setContentAreaFilled(false); 
        ssmButton.setFocusPainted(false); 
        ssmButton.setOpaque(false);
        ssmButton.setBounds(100, 100, 500, 700);
        label.setBounds(100, 100, 500, 700);
        itemShop.add(ssmButton);
        itemShop.add(label);
        ssmButton.setVisible(true);
        ssmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int itemPos = 0;
                for(int i = 0; i < allTheItemsGathered.length; i++){
                    if(allTheItemsGathered[i].getItemName().equals("self serve machine")){
                        System.out.println("Item found");
                        itemPos = i;
                    }
                }
                System.out.println("item bought");
                if(buyItem(allTheItemsGathered, itemPos)){
                    ssmLabel.setText("This costs "+allTheItemsGathered[0].getItemCost()+" It give 0.1 sps!");
                }
                else{
                    SwingUtilities.invokeLater(() -> {
                    // Create splash screen
                    JWindow splash = new JWindow();

                    String path = "C:/Users/setha/Saba/cachedImage.png"; // <-- update path
                    ImageIcon icon = new ImageIcon(path);

                    JLabel label = new JLabel(icon);
                    splash.getContentPane().add(label);

                    splash.pack(); // size window to fit image
                    splash.setLocationRelativeTo(null); // center on screen

                    splash.setVisible(true);

                    // Timer to hide after 1 seconds
                    new Timer(1000, erxtx -> {
                        splash.setVisible(false);
                        splash.dispose();
                    }).start();
                });

                }
                System.out.println(allTheItemsGathered[itemPos].getItemCount());
                System.out.println("Button clicked!");
                System.out.println(getSPStotal());
            }
        });
        JLabel chefLabel = new JLabel();
        chefLabel.setText("This costs "+allTheItemsGathered[1].getItemCost()+". It give 0.4 sps!");
        chefLabel.setBounds(900, 100, 500, 100);
        chefLabel.setVisible(true);
        itemShop.add(chefLabel);
        ImageIcon chef = new ImageIcon("C:\\Users\\setha\\Saba\\mario.png");
        JLabel labelChef = new JLabel();  
        JButton chefButton = new JButton(chef);
        chefButton.setBorderPainted(false);
        chefButton.setContentAreaFilled(false); 
        chefButton.setFocusPainted(false); 
        chefButton.setOpaque(false);
        chefButton.setBounds(700, 100, 500, 700);
        labelChef.setBounds(700, 100, 500, 700);
        itemShop.add(chefButton);
        itemShop.add(labelChef);
        chefButton.setVisible(true);
        chefButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int itemPos = 0;
                for(int i = 0; i < allTheItemsGathered.length; i++){
                    if(allTheItemsGathered[i].getItemName().equals("chef")){
                        System.out.println("Item found");
                        itemPos = i;
                    }
                }
                System.out.println("item bought");
                if(buyItem(allTheItemsGathered, itemPos)){
                    chefLabel.setText("This costs "+allTheItemsGathered[1].getItemCost()+" It give 0.4 sps!");
                }
                else{
                    SwingUtilities.invokeLater(() -> {
                    // Create splash screen
                    JWindow splash = new JWindow();

                    String path = "C:/Users/setha/Saba/cachedImage.png"; // <-- update path
                    ImageIcon icon = new ImageIcon(path);

                    JLabel label = new JLabel(icon);
                    splash.getContentPane().add(label);

                    splash.pack(); // size window to fit image
                    splash.setLocationRelativeTo(null); // center on screen

                    splash.setVisible(true);

                    // Timer to hide after 1 seconds
                    new Timer(1000, erxtx -> {
                        splash.setVisible(false);
                        splash.dispose();
                    }).start();
                });
                }
                System.out.println(allTheItemsGathered[itemPos].getItemCount());
                System.out.println("Button clicked!");
            }
        });
        ImageIcon sign = new ImageIcon("C:\\Users\\setha\\Saba\\for sale sign.png");
        JLabel signLabel = new JLabel();  
        JButton signButton = new JButton(sign);
        signButton.setBorderPainted(false);
        signButton.setContentAreaFilled(false); 
        signButton.setFocusPainted(false); 
        signButton.setOpaque(false);
        signButton.setBounds(1325, 750, 200, 200);
        signLabel.setBounds(1325, 750, 200, 200);
        itemShop.add(signButton);
        itemShop.add(signLabel);
        signButton.setVisible(true);
        signButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent erx) {
                activateBasicLocationShop(itemShop, bonitaFrames); 
            }
        });
    }
    static void activateEliteItemShop(JFrame bonitaFrames, JFrame preFrame){
        preFrame.setVisible(false);
        JFrame itemShop = new JFrame();
        itemShop.setLayout(null);
        itemShop.setSize(1920, 1080);
        itemShop.getContentPane().setBackground(Color.yellow);
        itemShop.setTitle("Saba's very own ELITE item shop");
        itemShop.setVisible(true);
        ImageIcon eisIcon = new ImageIcon("C:\\Users\\setha\\Saba\\elite subscription.png");
        itemShop.setIconImage(eisIcon.getImage());

        //x button
        makeIcon(itemShop, 1462, 25, 50, 50, "C:\\Users\\setha\\Saba\\x.png");
        JButton xButton = new JButton();
        xButton.setBounds(1462, 25, 50, 50);
        xButton.setVisible(true);
        xButton.setOpaque(false);
        xButton.setContentAreaFilled(false);
        xButton.setBorderPainted(false);
        itemShop.add(xButton);
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                System.out.println("Button clicked!");
                deactivateItemShop(bonitaFrames, itemShop);
            }
        });
        
        for (int iindex = 2; iindex < allTheItemsGathered.length; iindex++) {
            final int i = iindex;
            String itemFilePath;

            // pick correct file path
            if (i == 2){ itemFilePath = "C:\\Users\\setha\\Saba\\rizzman.PNG";}
            else if (i == 3){ itemFilePath = "C:\\Users\\setha\\Saba\\dominic.png";}
            else if (i == 4){ itemFilePath = "C:\\Users\\setha\\Saba\\osbourne.png";}
            else if (i == 5){ itemFilePath = "C:\\Users\\setha\\Saba\\martin.png";}
            else if (i == 6){ itemFilePath = "C:\\Users\\setha\\Saba\\shawn.png";}
            else if (i == 7){ itemFilePath = "C:\\Users\\setha\\Saba\\cesar replacement.jpg";}
            else{ itemFilePath = "C:\\Users\\setha\\Saba\\normal saba2.jpg";}

                // scale image
                ImageIcon icon = new ImageIcon(itemFilePath);
                Image img = icon.getImage();
                Image scaledImg = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                icon = new ImageIcon(scaledImg);

                // make the button with the image
                JButton itemButton = new JButton(icon);
                itemButton.setOpaque(false);
                itemButton.setContentAreaFilled(false);
                itemButton.setBorderPainted(false);

                int xPos = 75 + (200 * (i-2));
                int yPos = 400;

                itemButton.setBounds(xPos, yPos, 200, 200);

                // add labels for name + SPS
                JLabel itemName = new JLabel(allTheItemsGathered[i].getItemName());
                itemName.setBounds(xPos, yPos - 50, 200, 30);
                itemShop.add(itemName);

                if(i != 8){
                    JLabel itemSPS = new JLabel(allTheItemsGathered[i].getItemSPS() + " sps");
                    itemSPS.setBounds(xPos, yPos - 25, 200, 30);
                    itemShop.add(itemSPS);
                }
                else{
                    JLabel itemSPS = new JLabel("sps = # of self serve machines owned");
                    itemSPS.setBounds(xPos, yPos - 25, 400, 30);
                    itemShop.add(itemSPS);
                }

                JLabel itemCost = new JLabel("$"+allTheItemsGathered[i].getItemCost());
                itemCost.setBounds(xPos, yPos - 75, 200, 30);
                itemShop.add(itemCost);

                itemShop.add(itemButton);

                itemButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e){
                        if(buyItem(allTheItemsGathered, i)){
                            allTheItemsGathered[i].setItemCount(allTheItemsGathered[i].getItemCount() + 1);
                        }
                        else{
                            SwingUtilities.invokeLater(() -> {
                            // Create splash screen
                            JWindow splash = new JWindow();

                            String path = "C:/Users/setha/Saba/cachedImage.png"; // <-- update path
                            ImageIcon icon = new ImageIcon(path);

                            JLabel label = new JLabel(icon);
                            splash.getContentPane().add(label);

                            splash.pack(); // size window to fit image
                            splash.setLocationRelativeTo(null); // center on screen

                            splash.setVisible(true);

                            // Timer to hide after 1 seconds
                            new Timer(1000, erxtx -> {
                                splash.setVisible(false);
                                splash.dispose();
                            }).start();
                            });
                        }
                    }
                });
            }
    }


    static void makeButton(JFrame bonitaFrames, int x, int y, int lw, int ll, int bw, int bl, String buttonText){
        JLabel label = new JLabel();
        label.setBounds(x, y, lw, ll);
        JButton button = new JButton("ssm");
        button.setBounds(x, y, bw, bl);
        bonitaFrames.add(button);
        bonitaFrames.add(label);
        button.setVisible(true);
        button.validate();
        button.setText(buttonText);
        button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button clicked!");
        }
    });
    }

    static void makeIcon(JFrame frame, int x, int y, int l, int w, String fileName){
        ImageIcon sabaPhotoIcon = new ImageIcon(fileName);
        Image img = sabaPhotoIcon.getImage();
        Image scaledImg = img.getScaledInstance(l, w, java.awt.Image.SCALE_SMOOTH);
        sabaPhotoIcon = new ImageIcon(scaledImg);
        JLabel label = new JLabel();
        label.setIcon(sabaPhotoIcon);
        label.setBounds(x, y, l, w);
        label.setVisible(true);
        frame.add(label);
    }



    static void makingPhotoButton(JFrame frame, int lx, int ly, int bx, int by, int lw, int ll, int bw, int bl, String fileName, ActionListener ActionListener){
        JLabel label = new JLabel();
        JButton button = new JButton();
        button.setBorderPainted(false);
        button.setContentAreaFilled(false); 
        button.setFocusPainted(false); 
        button.setOpaque(false);
        button.setBounds(bx, by, bw, bl);
        label.setBounds(lx, ly, lw, ll);
        button.addActionListener(ActionListener);
        label.add(button);
        frame.add(label);
        label.setVisible(true);
        button.setVisible(true);
    }

    static Runnable sleep500 = ()->{
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException erxtt) {
            erxtt.printStackTrace();
        }
    };


    static void makePhotoButton(JFrame bonitaFrames, int lx, int ly, int bx, int by, int lw, int ll, int bw, int bl, String buttonText, String fileName){
        ImageIcon sabaImage = new ImageIcon(fileName);
        JLabel label = new JLabel();  
        JButton button = new JButton(sabaImage);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false); 
        button.setFocusPainted(false); 
        button.setOpaque(false);
        button.setBounds(bx, by, bw, bl);
        label.setBounds(lx, ly, lw, ll);
        bonitaFrames.add(button);
        bonitaFrames.add(label);
        button.setVisible(true);
        button.validate();
        button.setText(buttonText);
        button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button clicked!");
            if ((rand.nextDouble() * 100) < doubleClickChance) {
                sabucks += 2 * clickPower;

                // Declare variable with the correct type so alpha is accessible
                var critLabel = new JLabel("Crit!") {
                    float alpha = 1.0f;

                    @Override
                    protected void paintComponent(Graphics g) {
                        Graphics2D g2 = (Graphics2D) g.create();
                        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
                        super.paintComponent(g2);
                        g2.dispose();
                    }
                };

                Font currentFont = critLabel.getFont();
                Font newFont = new Font(currentFont.getName(), Font.ITALIC, currentFont.getSize());
                critLabel.setFont(newFont);
                critLabel.setBounds(700, 325, 100, 100);
                critLabel.setVisible(true);
                bonitaFrames.add(critLabel);
                bonitaFrames.repaint();

                final int duration = 500; // ms
                final int steps = 25;     // frames
                final int delay = duration / steps;
                final int floatDistance = 40;

                final int[] count = {0};

                Timer timer = new Timer(delay, ev -> {
                    count[0]++;
                    float progress = (float) count[0] / steps;

                    // Move up
                    int newY = 325 - (int) (progress * floatDistance);
                    critLabel.setLocation(700, newY);

                    // Fade out
                    critLabel.alpha = 1.0f - progress; // Now works
                    critLabel.repaint();

                    if (progress >= 1.0f) {
                        ((Timer) ev.getSource()).stop();
                        bonitaFrames.remove(critLabel);
                        bonitaFrames.repaint();
                    }
                });
                timer.start();
            }
            else {
                sabucks += clickPower;
            }
            System.out.println(clickPower);
            System.out.println(doubleClickChance);


        }

        });
    }
    public static void displaySabuckCount(JFrame bonitaFrames, JLabel label){
        label.setVisible(false);
        strSabucks = Double.toString(Math.ceil(sabucks * 10) / 10);
        label.setText("You have $"+strSabucks+" sabucks");
        label.setVisible(true);
        label.validate();
        label.setBounds(700, 250, 250, 100);
        bonitaFrames.add(label);
    }
    public static void createStartUI(JFrame bonitaFrames){
        makeIcon(bonitaFrames, 0, 300, 600, 400, "C:\\Users\\setha\\Saba\\saba item shop.jpg");
        makeIcon(bonitaFrames, 1000, 300, 400, 150, "C:\\Users\\setha\\Saba\\purchase dining logo.png");
        makeIcon(bonitaFrames, 0, 700 , 1530, 312, "C:\\Users\\setha\\Saba\\real elestrals ad.jpg");
        makeIcon(bonitaFrames, 350, -45, 1000, 400, "C:\\Users\\setha\\Saba\\the nether.png");
        makeIcon(bonitaFrames, 100, 100, 100, 100, "C:\\Users\\setha\\Saba\\inventory.png");
        makePhotoButton(bonitaFrames, 700, 350, 700, 350, 300, 300, 250, 350, "", "C:\\Users\\setha\\Saba\\saba cookie.png");

        JButton ELESTRALS = new JButton();
        ELESTRALS.setBounds(0, 700, 1530, 312);
        ELESTRALS.setVisible(true);
        ELESTRALS.setOpaque(false);
        ELESTRALS.setContentAreaFilled(false);
        ELESTRALS.setBorderPainted(false);
        bonitaFrames.add(ELESTRALS);
        ELESTRALS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Button clicked!");
                activateElestralsShop(bonitaFrames);
            }
        });

        JButton inv = new JButton();
        inv.setBounds(100, 100, 100, 100);
        inv.setVisible(true);
        inv.setOpaque(false);
        inv.setContentAreaFilled(false);
        inv.setBorderPainted(false);
        bonitaFrames.add(inv);
        inv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent erxt){
                activateInventory(bonitaFrames);
            }
        });
        JButton sashButton = new JButton();
        sashButton.setBounds(1000, 300, 400, 150);
        sashButton.setVisible(true);
        sashButton.setOpaque(false);
        sashButton.setContentAreaFilled(false);
        sashButton.setBorderPainted(false);
        bonitaFrames.add(sashButton);
        sashButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent erxtr){
                activateSabaShop(bonitaFrames);
            }
        });
        JButton itemShopButton = new JButton();
        itemShopButton.setBounds(0, 300, 600, 400);
        itemShopButton.setVisible(true);
        itemShopButton.setOpaque(false);
        itemShopButton.setContentAreaFilled(false);
        itemShopButton.setBorderPainted(false);
        bonitaFrames.add(itemShopButton);
        itemShopButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button clicked!");
                activateBasicItemShop(bonitaFrames);
            }
        });
        bonitaFrames.revalidate();
        bonitaFrames.repaint();
    }
    public static JLabel spsDisplay = new JLabel();
    public static void displaySPScountLive(JFrame bonitaFrames){
        spsDisplay.setText(Math.ceil(sps * 10) / 10+" sps");
        spsDisplay.setBounds(700, 275, 250, 100);
        bonitaFrames.add(spsDisplay);
    }

    public static void overDrive(){
        if(overdrive){
            System.out.println("DEBUG");
            System.err.println(new Throwable().getStackTrace()[0].getLineNumber());
            sps = getSPStotal() * 1.5;
        }
    }
    public static void main(String[] args) {

        //create lists of stuff
        fillSabaList();
        fillItemList();
        fillLocationList();
        
        //sps thread
        Runnable idling = ()->{
            while(true){
                sabucks += getSPStotal();
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                };
            }
        };
        
        Thread t1 = new Thread(idling);
        t1.start();
        JFrame bonitaFrames = new JFrame();
        bonitaFrames.setLayout(null);
        bonitaFrames.setSize(1550, 1080);
        bonitaFrames.setTitle("Saba Clicker. The super awesome game featuring the celebrity, ALFONSO SABA!!!!!! YOU CANT SEE HIM!!! AND HIS NAME IS ALFONSO SABA");
        Color lightBlue = new Color(0, 209, 255);
        bonitaFrames.getContentPane().setBackground(lightBlue);
        bonitaFrames.setVisible(true);
        ImageIcon sabaIconCookie = new ImageIcon("C:\\Users\\setha\\Saba\\balatro saba.jpg");
        bonitaFrames.setIconImage(sabaIconCookie.getImage());
        createStartUI(bonitaFrames);
        
        Runnable spsing = ()->{
            while(true){
                displaySPScountLive(bonitaFrames);
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException er) {
                    er.printStackTrace();
                }
            }
        };
        
        Runnable chilling = ()->{
            while(true){
                displaySabuckCount(bonitaFrames, sabucksCountLive);
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                };
            }
        };
        Thread t2 = new Thread(chilling);
        t2.start();
        Thread t3 = new Thread(spsing);
        t3.start();


    }
}