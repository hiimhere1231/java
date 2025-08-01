package SabaClicker;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Desktop.Action;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.ImageGraphicAttribute;
import java.awt.image.ImagingOpException;
import java.util.concurrent.TimeUnit;
import SabaClicker.AlfonsoClicker;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Window {
    public static String strSabucks = Double.toString(AlfonsoClicker.sabucks);
    public static JLabel sabucksCountLive = new JLabel("You have $"+strSabucks+" sabucks");

    static void deactivateItemShop(JFrame bonitaFrames, JFrame itemShop){
        itemShop.setVisible(false);
        bonitaFrames.setVisible(true);
    }

    static void deactivatelocationShop(JFrame frame, JFrame bonitaFrames){
        frame.setVisible(false);
        bonitaFrames.setVisible(true);
    }
    static void activateLocationInv(JFrame frame, JFrame bonitaFrames){
        frame.setVisible(false);
        JFrame locationInv = new JFrame();
        locationInv.setSize(1920, 1080);
        locationInv.getContentPane().setBackground(Color.YELLOW);
        locationInv.setTitle("You're very own location inventory!");
        ImageIcon lInvIcon = new ImageIcon("C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\Saba\\location icon.png");
        locationInv.setIconImage(lInvIcon.getImage());
        locationInv.setVisible(true);
        if(AlfonsoClicker.allTheLocationsGathered[1].getLocationOwn()){
            ImageIcon pdh = new ImageIcon("C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\Saba\\purchase dining hall.png");
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
                    AlfonsoClicker.eLocation = AlfonsoClicker.allTheLocationsGathered[0];
                }
            });
        }
        if(AlfonsoClicker.allTheLocationsGathered[2].getLocationOwn()){
            ImageIcon h = new ImageIcon("C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\Saba\\dining hub.jpg");
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
                    AlfonsoClicker.eLocation = AlfonsoClicker.allTheLocationsGathered[2];
                }
            });
        }
        if(AlfonsoClicker.allTheLocationsGathered[1].getLocationOwn()){
            ImageIcon sb = new ImageIcon("C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\Saba\\sawbucks.png");
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
                    AlfonsoClicker.eLocation = AlfonsoClicker.allTheLocationsGathered[1];
                }
            });
        }
        if(AlfonsoClicker.allTheLocationsGathered[3].getLocationOwn()){
            ImageIcon ss = new ImageIcon("C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\Saba\\snack store.jpg");
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
                    AlfonsoClicker.eLocation = AlfonsoClicker.allTheLocationsGathered[3];
                }
            });
        }
        ImageIcon bs = new ImageIcon("C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\Saba\\saba bank ad.jpg");
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

        makeIcon(locationInv, 1825, 25, 50, 50, "C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\Saba\\x.png");
        JButton xButton = new JButton();
        xButton.setBounds(1825, 25, 50, 50);
        xButton.setVisible(true);
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
        ImageIcon invIcon = new ImageIcon("C:\\\\Users\\\\SAMUEL KIM REPLACE HERE\\\\Desktop\\\\Saba\\\\inventory.png");
        invFrame.setIconImage(invIcon.getImage());
        invFrame.setSize(1920, 1080);
        invFrame.getContentPane().setBackground(Color.yellow);
        invFrame.setTitle("Saba's very own inventory opener");
        invFrame.setVisible(true);
        
        ImageIcon lIcon = new ImageIcon("C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\Saba\\location icon.png");
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

        ImageIcon sIcon = new ImageIcon("C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\Saba\\saba cookie.png");
        Image img2 = sIcon.getImage();
        Image s = img2.getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH);
        sIcon = new ImageIcon(s);
        JLabel label2 = new JLabel();
        label2.setIcon(sIcon);
        label2.setVisible(true);
        invFrame.add(label2, BorderLayout.EAST);    
         
    }
    static void activateBasicLocationShop(JFrame itemShop, JFrame bonitaFrames){
        itemShop.setVisible(false);
        JFrame locationShop = new JFrame();
        locationShop.setSize(1920, 1080);
        locationShop.getContentPane().setBackground(Color.yellow);
        locationShop.setTitle("Saba's very own basic location shop");
        locationShop.getContentPane().setBackground(Color.PINK);
        locationShop.setVisible(true);
        ImageIcon basicSubscription = new ImageIcon("C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\Saba\\basic subscription.png");
        locationShop.setIconImage(basicSubscription.getImage());
        makeIcon(locationShop, 1825, 25, 50, 50, "C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\Saba\\x.png");
        JButton xButton = new JButton();
        xButton.setBounds(1825, 25, 50, 50);
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
        makeIcon(locationShop, 250, 350, 700, 500, "C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\Saba\\purchase dining hall.png");
        JButton dHButton = new JButton();
        dHButton.setBounds(500, 500, 400, 500);
        dHButton.setVisible(true);
        dHButton.setOpaque(false);
        dHButton.setContentAreaFilled(false);
        dHButton.setBorderPainted(false);
        locationShop.add(dHButton);
        dHButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int itemPos = 0;
                for(int i = 0; i < AlfonsoClicker.allTheLocationsGathered.length; i++){
                    if(AlfonsoClicker.allTheLocationsGathered[i].getLocationName().equals("dining hall")){
                        System.out.println("Item found");
                        itemPos = i;
                    }
                }
                System.out.println("item bought");
                AlfonsoClicker.buyLocation(AlfonsoClicker.allTheLocationsGathered, itemPos);
                System.out.println(AlfonsoClicker.allTheLocationsGathered[itemPos].getLocationOwn());
                System.out.println("Button clicked!");
            }
        });
        JLabel diningHallDisplay = new JLabel();
        diningHallDisplay.setText("110 sps");
        diningHallDisplay.setBounds(500, 150, 100, 100);
        diningHallDisplay.setVisible(true);
        locationShop.add(diningHallDisplay);
        JLabel diningHallDisplayCost = new JLabel();
        diningHallDisplayCost.setText("$100000 sabucks");
        diningHallDisplayCost.setBounds(500, 175, 200, 100);
        diningHallDisplayCost.setVisible(true);
        locationShop.add(diningHallDisplayCost);
        JLabel diningHallDisplayAbility = new JLabel();
        diningHallDisplayAbility.setText("Makes everything 5% cheaper");
        diningHallDisplayAbility.setBounds(500, 200, 200, 100);
        diningHallDisplayAbility.setVisible(true);
        locationShop.add(diningHallDisplayAbility);
        JLabel din = new JLabel();
        din.setText("makes everything 5% cheaper");
        din.setBounds(500, 200, 400, 100);
        din.setVisible(false);
        locationShop.add(din);
        
        makeIcon(locationShop, 950, 350, 700, 500, "C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\Saba\\dining hub.jpg");
        JButton hButton = new JButton();
        hButton.setBounds(950, 350, 700, 500);
        hButton.setVisible(true);
        hButton.setOpaque(false);
        hButton.setContentAreaFilled(false);
        hButton.setBorderPainted(false);
        locationShop.add(hButton);
        hButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int itemPos = 0;
                for(int i = 0; i < AlfonsoClicker.allTheLocationsGathered.length; i++){
                    if(AlfonsoClicker.allTheLocationsGathered[i].getLocationName().equals("hub")){
                        System.out.println("Item found");
                        itemPos = i;
                    }
                }
                System.out.println("item bought");
                AlfonsoClicker.buyLocation(AlfonsoClicker.allTheLocationsGathered, itemPos);
                System.out.println(AlfonsoClicker.allTheLocationsGathered[itemPos].getLocationOwn());
                System.out.println("Button clicked!");
            }
        });
        JLabel hDisplay = new JLabel();
        hDisplay.setText("110 sps");
        hDisplay.setBounds(1000, 150, 100, 100);
        hDisplay.setVisible(true);
        locationShop.add(hDisplay);
        JLabel hDisplayCost = new JLabel();
        hDisplayCost.setText("$1000000 sabucks");
        hDisplayCost.setBounds(1000, 175, 200, 100);
        hDisplayCost.setVisible(true);
        locationShop.add(hDisplayCost);
        JLabel hDisplayAbility = new JLabel();
        hDisplayAbility.setText("Unlocks the premium subscription of the location shop");
        hDisplayAbility.setBounds(1000, 200, 500, 100);
        hDisplayAbility.setVisible(true);
        locationShop.add(hDisplayAbility);
        JLabel h = new JLabel();
        h.setText("sakjbdajhbs");
        h.setBounds(1000, 200, 500, 100);
        h.setVisible(false);
        locationShop.add(h);
        JLabel r = new JLabel();
        r.setText("You own this and cannot buy it again");
        r.setBounds(1000, 225, 500, 100);
        if(AlfonsoClicker.allTheLocationsGathered[2].getLocationOwn() == true){
            r.setVisible(true);
        }
        else{
            r.setVisible(false);
        }
        locationShop.add(r);
        JLabel e = new JLabel();
        e.setText("You own this and cannot buy it again");
        e.setBounds(1000, 225, 500, 100);
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
        ImageIcon basicSubscription = new ImageIcon("C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\Saba\\basic subscription.png");
        itemShop.setIconImage(basicSubscription.getImage());
        makeIcon(itemShop, 1825, 25, 50, 50, "C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\Saba\\x.png");
        JButton xButton = new JButton();
        xButton.setBounds(1825, 25, 50, 50);
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
        JLabel ssmLabel = new JLabel();
        ssmLabel.setText("This costs "+AlfonsoClicker.allTheItemsGathered[0].getItemCost()+".\n It give 0.1 sps!");
        ssmLabel.setBounds(375, 100, 500, 100);
        ssmLabel.setVisible(true);
        itemShop.add(ssmLabel);
        ImageIcon ssm = new ImageIcon("C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\Saba\\self serve machine.png");
        JLabel label = new JLabel();  
        JButton ssmButton = new JButton(ssm);
        ssmButton.setBorderPainted(false);
        ssmButton.setContentAreaFilled(false); 
        ssmButton.setFocusPainted(false); 
        ssmButton.setOpaque(false);
        ssmButton.setBounds(200, 100, 500, 700);
        label.setBounds(200, 100, 500, 700);
        itemShop.add(ssmButton);
        itemShop.add(label);
        ssmButton.setVisible(true);
        ssmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int itemPos = 0;
                for(int i = 0; i < AlfonsoClicker.allTheItemsGathered.length; i++){
                    if(AlfonsoClicker.allTheItemsGathered[i].getItemName().equals("self serve machine")){
                        System.out.println("Item found");
                        itemPos = i;
                    }
                }
                System.out.println("item bought");
                if(AlfonsoClicker.buyItem(AlfonsoClicker.allTheItemsGathered, itemPos)){
                    ssmLabel.setText("This costs "+AlfonsoClicker.allTheItemsGathered[0].getItemCost()+" It give 0.4 sps!");
                }
                else{
                    JFrame huang = new JFrame();
                    huang.setSize(500, 700);
                    huang.setVisible(true);
                    ImageIcon bs = new ImageIcon("C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\Saba\\cachedImage.png");
                    Image img3 = bs.getImage();
                    Image scaledImg3 = img3.getScaledInstance(500, 700, java.awt.Image.SCALE_SMOOTH);
                    bs = new ImageIcon(scaledImg3);
                    JLabel label5 = new JLabel();  
                    JButton bsButton = new JButton(bs);
                    bsButton.setBounds(0, 0, 500, 700);
                    label5.setBounds(0, 0, 500, 700);
                    label5.add(bsButton);
                    huang.add(bsButton);
                    huang.add(label5);
                    bsButton.setVisible(true);
                    label5.setVisible(true);
                    try {
                        TimeUnit.SECONDS.sleep(1);
                        huang.setVisible(false);
                    } catch (InterruptedException erxt) {
                        erxt.printStackTrace();
                };
                }
                System.out.println(AlfonsoClicker.allTheItemsGathered[itemPos].getItemCount());
                System.out.println("Button clicked!");
                System.out.println(AlfonsoClicker.getSPStotal());
            }
        });
        JLabel chefLabel = new JLabel();
        chefLabel.setText("This costs "+AlfonsoClicker.allTheItemsGathered[1].getItemCost()+".\n It give 0.4 sps!");
        chefLabel.setBounds(1100, 100, 500, 100);
        chefLabel.setVisible(true);
        itemShop.add(chefLabel);
        ImageIcon chef = new ImageIcon("C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\Saba\\mario.png");
        JLabel labelChef = new JLabel();  
        JButton chefButton = new JButton(chef);
        chefButton.setBorderPainted(false);
        chefButton.setContentAreaFilled(false); 
        chefButton.setFocusPainted(false); 
        chefButton.setOpaque(false);
        chefButton.setBounds(900, 100, 500, 700);
        labelChef.setBounds(900, 100, 500, 700);
        itemShop.add(chefButton);
        itemShop.add(labelChef);
        chefButton.setVisible(true);
        chefButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int itemPos = 0;
                for(int i = 0; i < AlfonsoClicker.allTheItemsGathered.length; i++){
                    if(AlfonsoClicker.allTheItemsGathered[i].getItemName().equals("chef")){
                        System.out.println("Item found");
                        itemPos = i;
                    }
                }
                System.out.println("item bought");
                if(AlfonsoClicker.buyItem(AlfonsoClicker.allTheItemsGathered, itemPos)){
                    chefLabel.setText("This costs "+AlfonsoClicker.allTheItemsGathered[1].getItemCost()+" It give 0.4 sps!");
                }
                System.out.println(AlfonsoClicker.allTheItemsGathered[itemPos].getItemCount());
                System.out.println("Button clicked!");
            }
        });
        ImageIcon sign = new ImageIcon("C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\Saba\\for sale sign.png");
        JLabel signLabel = new JLabel();  
        JButton signButton = new JButton(sign);
        signButton.setBorderPainted(false);
        signButton.setContentAreaFilled(false); 
        signButton.setFocusPainted(false); 
        signButton.setOpaque(false);
        signButton.setBounds(1700, 812, 200, 200);
        signLabel.setBounds(1700, 812, 200, 200);
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
    static void activateEliteItemShop(JFrame bonitaFrames){
        bonitaFrames.setVisible(false);
        JFrame itemShop = new JFrame();
        itemShop.setSize(1920, 1080);
        itemShop.getContentPane().setBackground(Color.yellow);
        itemShop.setTitle("Saba's very own ELITE item shop");
        itemShop.setVisible(true);
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
        ImageIcon icon = new ImageIcon(fileName);
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
    static void makePhotoButton(JFrame bonitaFrames, int lx, int ly, int bx, int by, int lw, int ll, int bw, int bl, String buttonText, String fileName){
        ImageIcon sabaImage = new ImageIcon(fileName);
        JLabel label = new JLabel();  
        System.out.println(Window.class.getResource(fileName));
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
            AlfonsoClicker.sabucks += 1;
            System.out.println(AlfonsoClicker.sabucks);
        }
    });
    }
    public static void displaySabuckCount(JFrame bonitaFrames, JLabel label){
        label.setVisible(false);
        strSabucks = Double.toString(AlfonsoClicker.sabucks);
        label.setText("You have $"+strSabucks+" sabucks");
        label.setVisible(true);
        label.validate();
        label.setBounds(1000, 250, 250, 100);
        bonitaFrames.add(label);
    }
    public static void createStartUI(JFrame bonitaFrames){
        makeIcon(bonitaFrames, 0, 300, 600, 400, "C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\AlfonsoClicker\\java\\src\\SabaClicker\\saba item shop.jpg");
        makeIcon(bonitaFrames, 1400, 300, 400, 150, "C:\\\\Users\\\\SAMUEL KIM REPLACE HERE\\\\Desktop\\\\AlfonsoClicker\\\\java\\\\src\\\\SabaClicker\\\\purchase dining logo.png");
        makeIcon(bonitaFrames, 0, 700 , 1910, 312, "C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\AlfonsoClicker\\java\\src\\SabaClicker\\adOfElestrals.jpg");
        makeIcon(bonitaFrames, 450, -45, 1000, 400, "C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\AlfonsoClicker\\java\\src\\SabaClicker\\the nether.png");
        makeIcon(bonitaFrames, 100, 100, 100, 100, "C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\AlfonsoClicker\\java\\src\\SabaClicker\\inventory.png");
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
            if(AlfonsoClicker.allTheSabasGathered[5].getOwn() == false){
                activateBasicItemShop(bonitaFrames);
            }
            else{
                activateEliteItemShop(bonitaFrames);
            }
        }
    });
    }
    public static JLabel spsDisplay = new JLabel();
    public static void displaySPScountLive(JFrame bonitaFrames){
        spsDisplay.setText(AlfonsoClicker.sps+" sps");
        spsDisplay.setBounds(1000, 275, 250, 100);
        bonitaFrames.add(spsDisplay);
    }
    public static void main(String[] args) {

        //create lists of stuff
        AlfonsoClicker.fillSabaList();
        AlfonsoClicker.fillItemList();
        AlfonsoClicker.fillLocationList();
        
        //sps thread
        Runnable idling = ()->{
            while(true){
                AlfonsoClicker.sabucks += AlfonsoClicker.getSPStotal();
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
        bonitaFrames.setSize(1920, 1080);
        bonitaFrames.setTitle("Saba Clicker. The super awesome game featuring the celebrity, ALFONSO SABA!!!!!! YOU CANT SEE HIM!!! AND HIS NAME IS ALFONSO SABA");
        Color lightBlue = new Color(0, 209, 255);
        bonitaFrames.getContentPane().setBackground(lightBlue);
        bonitaFrames.setVisible(true);
        ImageIcon sabaIconCookie = new ImageIcon("C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\Saba\\balatro saba.jpg");
        bonitaFrames.setIconImage(sabaIconCookie.getImage());
        makePhotoButton(bonitaFrames, 1000, 350, 1000, 350, 300, 300, 250, 350, "", "C:\\Users\\SAMUEL KIM REPLACE HERE\\Desktop\\Saba\\saba cookie.png");
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