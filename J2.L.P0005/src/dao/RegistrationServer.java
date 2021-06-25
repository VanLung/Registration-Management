/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Registration;
import java.rmi.Remote;
import java.util.ArrayList;

/**
 *
 * @author By Van Lung, IDStudent: SE140193
 */
public interface RegistrationServer extends Remote{
  boolean createRegistration(Registration dto);

    Registration findByRegistrationID(String id);

    ArrayList<Registration> findAllRegistrations();

    boolean removeRegistration(String id);

    boolean updateRegistration(Registration dto);
   
}
