/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.thogakade.reservation.impl;

import java.util.HashMap;
import lk.ijse.thogakade.reservation.Reservation;
import lk.ijse.thogakade.service.SuperService;

/**
 *
 * @author lahiru
 */
public class ReserVationImpl implements Reservation{
    private static final HashMap<String, SuperService>reserveList=new HashMap<>();
    
    @Override
    public boolean reserve(String id,SuperService service){
        if(reserveList.containsKey(id)){
            if(reserveList.get(id)==service){
                System.out.println(id+"   it s true"+"address"+reserveList.get(id));
                return true;
            }else{
                System.out.println(id+"   it is false"+"address"+reserveList.get(id));
                return false;
            }
            
        }else{
            reserveList.put(id, service);
            System.out.println("put id"+id+"   "+"address"+reserveList.get(id));
            return true;
        }
    }
    
    @Override
    public boolean release(String id){
        if(reserveList.containsKey(id)){
            reserveList.remove(id);
            System.out.println("Remove "+id+"address"+reserveList.get(id));
            
            return true;
        }else{
            return false;
        }
            
    }
    
}
