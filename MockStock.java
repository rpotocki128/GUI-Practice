package mockme;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class MockStock {

    //Class Initialization
    ChoiceHandler ch = new ChoiceHandler(this);
    UI ui = new UI();
    VisibilityHandler vh = new VisibilityHandler(ui);
    // StockList sl = new StockList(this, ui, vh);
    //Account account = new Account();

    public static void main(String[] args) throws Exception {
        
        System.out.println("Hello, World!");
        new MockStock();
    }

    public MockStock(){
        ui.createUI(ch);
       // sl.defaultSetup();
        vh.showTitleScreen();
    }
}
