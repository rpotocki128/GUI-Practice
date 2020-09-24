package mockme;

import java.beans.Visibility;

public class VisibilityHandler {

    UI ui;

    public VisibilityHandler(UI uInterface){
        ui= uInterface;

    }
    public void showTitleScreen(){
        //Show Title Screen
        ui.titlePanel.setVisible(true);
        ui.startButton.setVisible(true);
        ui.loadButton.setVisible(true);

        //Hide else
        ui.mainTextPanel.setVisible(false);
        ui.statusPanel.setVisible(false);
        ui.dependentPanel.setVisible(false);
        ui.pageChangePanel.setVisible(false);
        ui.profilePanel.setVisible(false);
    }
    public void showMenu(){
        //Hide Title Screen
        ui.titlePanel.setVisible(false);
        ui.startButton.setVisible(false);
        ui.loadButton.setVisible(false);
        ui.profilePanel.setVisible(false);

        //Show else
        ui.mainTextPanel.setVisible(true);
        ui.statusPanel.setVisible(true);
        ui.dependentPanel.setVisible(true);
        ui.pageChangePanel.setVisible(true);
    }
    public void showProfile(){
        //Show 
        ui.statusPanel.setVisible(true);
        ui.dependentPanel.setVisible(true);
        ui.profilePanel.setVisible(true);
        
        //Hide
        ui.titlePanel.setVisible(false);
        ui.startButton.setVisible(false);
        ui.loadButton.setVisible(false);
        ui.mainTextPanel.setVisible(false);
        ui.pageChangePanel.setVisible(false);

    }
}