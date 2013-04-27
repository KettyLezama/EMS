package EMS_Database;

import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author mike
 */
public interface Interface_TaskData {
    
    // SPECIAL CASE FUNCTIONS
    public ArrayList<Integer> stringToList(String uidList) throws NumberFormatException;

    public String listToString(ArrayList<Integer> list);

    public int createSubEvent(InputEventData event) throws DuplicateInsertionException;

    public int nextValidUID();

    public String queryEntireTable();

    // GETTERS
    public String getDescription() throws DoesNotExistException;    

    public Timestamp getStartDate() throws DoesNotExistException;

    public Timestamp getEndDate() throws DoesNotExistException;

    public int getComplete() throws DoesNotExistException;

    public ArrayList<Integer> getAuthority() throws DoesNotExistException;
    
    public String getStreet(int uid) throws DoesNotExistException; //location info

    public String getCity(int uid) throws DoesNotExistException; //location info

    public String getState(int uid) throws DoesNotExistException; //location info

    public String getZipcode(int uid) throws DoesNotExistException; //location info

    public String getCountry(int uid) throws DoesNotExistException; //location info

    // SETTERS      
    public void setDescription(int uid, String description) throws DoesNotExistException;    

    public void setStartDate(int uid, Timestamp time) throws DoesNotExistException;

    public void setEndDate(int uid, Timestamp time) throws DoesNotExistException;

    public void setComplete(int uid, int complete) throws DoesNotExistException;

    public void setAuthority(int uid, ArrayList<Integer> committeeList) throws DoesNotExistException;
    
    public void setStreet(int uid, String street) throws DoesNotExistException; //location info

    public void setCity(int uid, String city) throws DoesNotExistException; //location info

    public void setState(int uid, String state) throws DoesNotExistException; //location info

    public void setZipcode(int uid, String zipcode) throws DoesNotExistException; //location info

    public void setCountry(int uid, String country) throws DoesNotExistException; //location info
}