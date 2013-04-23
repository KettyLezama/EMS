/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EMS_Database;

import EMS_Database.impl.DB_UserData;
import EMS_Database.impl.Dummy_UserData;

/**
 *
 * @author mike
 */
public class UserDataFactory {

    public static Interface_UserData create(String name) {
        if ("db".equals(name)) {
            return new DB_UserData();
        } else {
            return new Dummy_UserData();
        }

    }
}
