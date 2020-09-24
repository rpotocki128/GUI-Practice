package mockme;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChoiceHandler implements ActionListener{
 

 MockStock mock;
 
 public ChoiceHandler(MockStock m) {// Constructor
  mock = m;
 }
 
 public void actionPerformed(ActionEvent event){
  
  String choice = event.getActionCommand();
  
  switch(choice){
  case "START": mock.vh.showMenu();  break;
  //case "LOAD": mock.vh.showLoad();break;
  //case "<" : mock.vh.refreshData(); break;
  case "<": mock.vh.showMenu();   break;
  case "PROFILE" : mock.vh.showProfile(); break;
  //case "BUY": mock.vh.showBuy();break;
  //case "SELL": mock.vh.showSell();break;
  //case "EXIT": mock.vh.showExit();break;
  }
 }
}