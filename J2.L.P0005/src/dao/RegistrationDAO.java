/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Registration;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author By Van Lung, IDStudent: SE140193
 */
public class RegistrationDAO implements RegistrationServer {

    List<Registration> list = new ArrayList<Registration>();

    public RegistrationDAO() {
    }

    public List<Registration> getAllRegistration() {
        return list;
    }

    public void saveToFile() {
        try {
            File f = new File("RegistrationData.txt");
            FileWriter fr = new FileWriter(f);
            PrintWriter pr = new PrintWriter(f);
            for (Registration dto : list) {
                pr.println(dto.getRegistrationID() + "-" + dto.getFullName()
                        + "-" + dto.getAge() + "-" + (dto.isGender() ? "1" : "0") + "-"
                        + dto.getEmail() + "-" + dto.getPhone() + "-" + dto.getAddress() + "-"
                        + dto.getNumberOfMember() + "-" + dto.getNumberOfChildren() + "-" + dto.getNumberOfAdults());
            }
            fr.close();
            pr.close();
        } catch (Exception e) {
        }
    }

    public Registration getInfoById(String id) {
        Registration res = null;

        return res;
    }

    public int findIndex(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getRegistrationID().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }

    public List<Registration> searchByName(String name) {
        List<Registration> listSearchByName = new ArrayList<Registration>();
        for (Registration dto : list) {
            if (dto.getFullName().toLowerCase().indexOf(name.toLowerCase()) >= 0) {
                listSearchByName.add(dto);
            }
        }
        return listSearchByName;
    }

    public List<Registration> sortAcsending() {
        Collections.sort(list);
        return list;
    }

    public List<Registration> sortDescending() {
        Collections.reverse(sortAcsending());
        return list;
    }

    @Override
    public boolean createRegistration(Registration dto) {
        boolean status = false;
        if (findIndex(dto.getRegistrationID()) < 0) {
            list.add(dto);
            saveToFile();
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    @Override
    public Registration findByRegistrationID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Registration> findAllRegistrations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeRegistration(String id) {
        boolean status = true;
        list.remove(list.get(findIndex(id)));
        saveToFile();
        return status;
    }

    @Override
    public boolean updateRegistration(Registration dto) {
        boolean status = false;
        try {
            Registration newDto = list.get(findIndex(dto.getRegistrationID()));
            newDto.setFullName(dto.getFullName());
            newDto.setEmail(dto.getEmail());
            newDto.setPhone(dto.getPhone());

            newDto.setAge(dto.getAge());
            newDto.setGender(dto.isGender());
            newDto.setAddress(dto.getAddress());
            newDto.setNumberOfMember(dto.getNumberOfMember());
            newDto.setNumberOfChildren(dto.getNumberOfChildren());
            newDto.setNumberOfAdults(dto.getNumberOfAdults());
            saveToFile();
            status = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

}
