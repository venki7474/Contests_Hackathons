import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public void handleListActionItems(ActionEvent e) throws SQLException, ClassNotFoundException {
        adb = new ActionItemsDB();
        if (!(lockedActionItem == null)) 
            unLock(lockedActionItem);
        String sn = null;
        sn = (String) actionItemLists.getSelectionModel().getSelectedItem();
        if(isThere(sn)) {
            deleteActionItem.setDisable(true);  
            updateActionItem.setDisable(true);
        }
        else {
            lockedActionItem = sn;
            System.out.println("&&&&&&&&&&&&&&&&&&&"+lockedActionItem);
            storeActionName(sn);
        }
        ArrayList<String> details;
        details = adb.get_Action_Details(sn,check_Connection);
        if(details.size()> 0) {
            actionName.setText(details.get(0));
            actionDescription.setText(details.get(1));
            actionResolution.setText(details.get(2));
            creationDate.setText(details.get(3));
            dueDate.setText(details.get(4));
            actionStatusBox.setValue(details.get(5));
            assignedToMemberBox.setValue(details.get(6));
            assignedToTeamBox.setValue(details.get(7)); 
        }     
    }/
	
	////////////////////////
	 public void storeActionName(String aName) throws SQLException {
        DataBaseConnection dbc  = dbc = new DataBaseConnection();
        Connection con = dbc.getConnectionToDB();
        PreparedStatement pst = null;
        if (check_Connection) {
            if(con != null) {
//                if(!isThere(aName)) {
                    String query = "insert into Lock_ActionName values(?)";
                    pst = con.prepareStatement(query);
                    pst.setString(1,aName);
                    int rows = pst.executeUpdate();
                    System.out.println("No rows updated in Lock_ActionName:"+rows);
                    pst.close();
                    con.close();
                //}  
            }//End of inner if block
           // pst.close();
        }//end of outer if block
        //con.close();
    }//End of storeActionName Method
    
    public boolean isThere(String aName) throws SQLException {
        DataBaseConnection dbc  = dbc = new DataBaseConnection();
        Connection con = dbc.getConnectionToDB();
        PreparedStatement pst = null;
        ArrayList<String> ls = new ArrayList<>();
        if (check_Connection) {
            if(con != null) {
                String query = "select name from Lock_ActionName";
                pst = con.prepareStatement(query);
                ResultSet rs = pst.executeQuery(); 
                while(rs.next()) {
                    ls.add(rs.getString("name"));
                }
                 pst.close();
                  con.close();
            }//End of inner if block
            //pst.close();
        }//end of outer if block
        //con.close();
        if ((ls.contains(aName))) {
            return true;
        }
        return false;
    }
    
    public void unLock(String aName) throws SQLException {
        DataBaseConnection dbc  = dbc = new DataBaseConnection();
        Connection con = dbc.getConnectionToDB();
        PreparedStatement pst = null;
        if (check_Connection) {
            if(con != null) {
                String query = "delete from Lock_ActionName where name in (?)";
                pst = con.prepareStatement(query);
                 pst.setString(1,aName);
                 int r = pst.executeUpdate();
                  pst.close();
                  con.close();
            }//End of inner if block
           // pst.close();
        }//end of outer if block
        //con.close();
    } 
    
	
	final long timeInterval = 500;
       // InternetConnectivity netObj = new InternetConnectivity();
	   
       Runnable runnable;
       runnable = () -> {
           while (true) {
               
               if(netObj.getInternetStatus()){
                   System.out.println("Connected");
                   onlineIndicator1.setFill(Color.LIMEGREEN);
                   onlineIndicator2.setFill(Color.LIMEGREEN);
                   onlineIndicator3.setFill(Color.LIMEGREEN);
                   onlineIndicator4.setFill(Color.LIMEGREEN);
                   ActionItems.setDisable(false);
                   Teams.setDisable(false);
                   Members.setDisable(false);
               }else {
                   System.out.println("Not connected");
                   onlineIndicator1.setFill(Color.RED);
                   onlineIndicator2.setFill(Color.RED);
                   onlineIndicator3.setFill(Color.RED);
                   onlineIndicator4.setFill(Color.RED);
                   ActionItems.setDisable(true);
                   Teams.setDisable(true);
                   Members.setDisable(true);
                   try {
                       offlineAction();
                   } catch (ClassNotFoundException ex) {
                       Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }
               
               try {
                   Thread.sleep(timeInterval);
               } catch (InterruptedException e) {
                   e.printStackTrace();
//                      System.out.println(e);
               }
           }
       };

      Thread thread = new Thread(runnable);
      thread.start();