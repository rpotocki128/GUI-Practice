package mockme;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.*;

public class UI {
    
    JFrame window;
    JPanel titlePanel, startPanel, loadPanel, mainTextPanel, choicePanel, statusPanel, dependentPanel, pageChangePanel, profilePanel;
    JLabel titleLabel, currentLabel, currentValueLabel, todayLabel, todayValueLabel;
    JButton startButton, loadButton, refresh, back, addFunds, exit, buy, sell, profileConfirm, addfundsConfirm;
    JTextArea mainTextArea;
    JTextField name, increaseCOH;
    Font titleFont = new Font("Arial",Font.PLAIN,36);
    Font baseFont = new Font("Arial",Font.PLAIN,20);

    public void createUI(ChoiceHandler ch){
    //Creates Base Window For Program
        window = new JFrame("");
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);

    //Creates Launch Screen
        titlePanel = new JPanel();
        titlePanel.setBounds(100,100,600,500);
        titlePanel.setBackground(Color.black);
        titleLabel = new JLabel("Mock Stock");
        titleLabel.setForeground(Color.white);
        titleLabel.setFont(titleFont);
        titlePanel.add(titleLabel);

        startPanel = new JPanel();
        startPanel.setBounds(300, 400, 200, 100);
        startPanel.setBackground(Color.black);
        startPanel.setLayout(new GridLayout(2,1));
        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(baseFont);
        startButton.setFocusPainted(false);
        startButton.addActionListener(ch);
        startPanel.add(startButton);

        loadPanel = new JPanel();
        loadPanel.setBounds(300, 100, 200, 100);
        loadPanel.setBackground(Color.black);
        loadButton = new JButton("LOAD");
        loadButton.setBackground(Color.black);
        loadButton.setForeground(Color.white);
        loadButton.setFont(baseFont);
        loadButton.setFocusPainted(false);
        startPanel.add(loadButton);

        window.add(titlePanel);
        window.add(startPanel);
        window.add(loadPanel);

        //Main Screen
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(175,65,600,500);
        mainTextPanel.setBackground(Color.black);
        window.add(mainTextPanel);

        mainTextArea = new JTextArea("NOTIFICATIONS: WELOME TO MOCK STOCK\nTO BEGIN TRADING (ADD FUNDS) TO YOUR ACCOUNT");
        mainTextArea.setBounds(75,75,600,600);
        mainTextArea.setBackground(Color.gray);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(baseFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        statusPanel = new JPanel();
        statusPanel.setBounds(15,15,800,50);
        statusPanel.setBackground(Color.black);
        statusPanel.setLayout(new GridLayout(1,5));
        window.add(statusPanel);

        currentLabel = new JLabel("Total Value");
        currentLabel.setFont(baseFont);
        currentLabel.setForeground(Color.white);
        statusPanel.add(currentLabel);
        currentValueLabel = new JLabel("VALUE HERE");
        currentValueLabel.setForeground(Color.white);
        currentValueLabel.setFont(baseFont);
        statusPanel.add(currentValueLabel);

        //Creates midleft persistent button panel for back movement between pages and refresh for stock data
        dependentPanel = new JPanel();
        dependentPanel.setBounds(15, 70, 150, 50);
        dependentPanel.setBackground(Color.black);
        dependentPanel.setLayout(new GridLayout (2,1));
        window.add(dependentPanel);

        back = new JButton("<");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setFont(baseFont);
        back.setFocusPainted(false);
        back.addActionListener(ch);
        dependentPanel.add(back);
        refresh = new JButton("REFRESH");
        refresh.setBackground(Color.black);
        refresh.setForeground(Color.white);
        refresh.setFont(baseFont);
        refresh.setFocusPainted(false);
        dependentPanel.add(refresh);

        todayLabel = new JLabel("Today");
        todayLabel.setFont(baseFont);
        todayLabel.setForeground(Color.white);
        statusPanel.add(todayLabel);
        todayValueLabel = new JLabel("VALUE HERE");
        todayValueLabel.setForeground(Color.white);
        todayValueLabel.setFont(baseFont);
        statusPanel.add(todayValueLabel);

        //Creates leftmost collection of buttons that move between pages from the main menu
        pageChangePanel = new JPanel();
        pageChangePanel.setBounds(15,130,150,500);
        pageChangePanel.setBackground(Color.black);
        pageChangePanel.setLayout(new GridLayout (6,1));
        window.add(pageChangePanel);

        addFunds = new JButton("PROFILE");
        addFunds.setBackground(Color.black);
        addFunds.setForeground(Color.white);
        addFunds.setFont(baseFont);
        addFunds.setFocusPainted(false);
        addFunds.addActionListener(ch);
        pageChangePanel.add(addFunds);
        buy = new JButton("BUY");
        buy.setBackground(Color.black);
        buy.setForeground(Color.white);
        buy.setFont(baseFont);
        buy.setFocusPainted(false);
        pageChangePanel.add(buy);
        sell = new JButton("SELL");
        sell.setBackground(Color.black);
        sell.setForeground(Color.white);
        sell.setFont(baseFont);
        sell.setFocusPainted(false);
        pageChangePanel.add(sell);
        exit = new JButton("EXIT");
        exit.setBackground(Color.black);
        exit.setForeground(Color.white);
        exit.setFont(baseFont);
        exit.setFocusPainted(false);
        pageChangePanel.add(exit);

        //Creates UI in Profile Tab
        profilePanel = new JPanel();
        profilePanel.setBounds(300, 100, 300, 50);
        profilePanel.setBackground(Color.black);
        profilePanel.setLayout(new GridLayout(2,2));
        window.add(profilePanel);

        name = new JTextField(20);
        name.setFont(baseFont);
        String tempName = name.getText();
        profilePanel.add(name);

        profileConfirm = new JButton("CONFIRM");
        profileConfirm.setBackground(Color.gray);
        profileConfirm.setForeground(Color.white);
        profileConfirm.setFont(baseFont);
        profileConfirm.setFocusPainted(false);
        profilePanel.add(profileConfirm);

        increaseCOH = new JTextField(20);
        increaseCOH.setFont(baseFont);
        String coh = increaseCOH.getText();
        profilePanel.add(increaseCOH);

        addfundsConfirm = new JButton("CONFIRM");
        addfundsConfirm.setBackground(Color.gray);
        addfundsConfirm.setForeground(Color.white);
        addfundsConfirm.setFont(baseFont);
        addfundsConfirm.setFocusPainted(false);
        profilePanel.add(addfundsConfirm);










        window.setVisible(true);

    }

}