package EMS_Database;

import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author mike
 */
public interface Interface_EventData {

    // SPECIAL CASE FUNCTIONS
    public ArrayList<Integer> stringToList(String uidList) throws NumberFormatException;

    public String listToString(ArrayList<Integer> list);

    public int createSubEvent(InputEventData event) throws DuplicateInsertionException;

    public int nextValidUID();

    public String queryEntireTable();

    // GETTERS
    public String getDescription(int uid) throws DoesNotExistException;

    public String getLocation(int uid) throws DoesNotExistException;

    public Timestamp getStartDate(int uid) throws DoesNotExistException;

    public Timestamp getEndDate(int uid) throws DoesNotExistException;

    public int getComplete(int uid) throws DoesNotExistException;

    public ArrayList<Integer> getCommittee(int uid) throws DoesNotExistException;

    //TO BE ADDED TO TABLE
    public ArrayList<Integer> getOrganizerList(int uid) throws DoesNotExistException;

    public ArrayList<Integer> getSubEventList(int uid) throws DoesNotExistException;

    public ArrayList<Integer> getParticipantList(int uid) throws DoesNotExistException;

    public String getStreet(int uid) throws DoesNotExistException; //location info

    public String getCity(int uid) throws DoesNotExistException; //location info

    public String getState(int uid) throws DoesNotExistException; //location info

    public String getZipcode(int uid) throws DoesNotExistException; //location info

    public String getCountry(int uid) throws DoesNotExistException; //location info

    // SETTERS      
    public void setDescription(int uid, String description) throws DoesNotExistException;

    public void setLocation(int uid, String location) throws DoesNotExistException;

    public void setStartDate(int uid, Timestamp time) throws DoesNotExistException;

    public void setEndDate(int uid, Timestamp time) throws DoesNotExistException;

    public void setComplete(int uid, int complete) throws DoesNotExistException;

    public void setCommittee(int uid, ArrayList<Integer> committeeList) throws DoesNotExistException;

    //TO BE ADDED TO TABLE
    public void setOrganizerList(int uid, ArrayList<Integer> organizerList) throws DoesNotExistException;

    public void setSubEventList(int uid, ArrayList<Integer> subEventList) throws DoesNotExistException;

    public void setParticipantList(int uid, ArrayList<Integer> participantList) throws DoesNotExistException;

    public void setStreet(int uid, String street) throws DoesNotExistException; //location info

    public void setCity(int uid, String city) throws DoesNotExistException; //location info

    public void setState(int uid, String state) throws DoesNotExistException; //location info

    public void setZipcode(int uid, String zipcode) throws DoesNotExistException; //location info

    public void setCountry(int uid, String country) throws DoesNotExistException; //location info
}