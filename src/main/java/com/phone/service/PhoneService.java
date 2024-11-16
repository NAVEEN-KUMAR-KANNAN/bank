package com.phone.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phone.dao.PhoneDao;
import com.phone.entity.Phone;
import com.phone.exception.PriceException;

@Service
public class PhoneService {
	@Autowired
	PhoneDao pd;

	public List<Phone> posts(List<Phone> p) {
		return pd.posts(p);
	}

	public List<Object> getAll() {
		return pd.getAll();
	}

	public List<Phone> getPrices(int a, int b) {
		return pd.getPrices(a, b);
	}

	public List<Phone> getAlll() {
		return pd.getAlll();
	}

	public List<Phone> getBrand(String a) {
		return pd.getBrand(a);
	}

	public List<Phone> getPrice(int a) {
		return pd.getPrice(a);
	}

//	public String getExcep(Phone a) throws PriceException {
//		try {
//			if (a.getPrice() < 25000) {
//				throw new PriceException("Price Exception");
//			}
//			else {
//				return pd.getExcep(a);
//			}
//		} 
//		catch (Exception e) {
//			return "price is below 25000";
//		}
//
//	}
           public String getExcep(Phone a) throws PriceException {
        		
        			if (a.getPrice() < 25000) {
        				throw new PriceException("Price Exception");
        			}
        			else {
        				return pd.getExcep(a);
        			}
        		       
           }
           
           
           
           public Phone getRate(int a) throws Exception{
        	   List<Phone>ni=pd.getAlll();
        	   Phone ph=ni.get(0);
        	   for(Phone x:ni) {
        		   if(a==x.getPrice()) {
        			   ph=x;
        		   }
        	   }
        	   if(ph.getPrice()==a) {
        		   return pd.getRate(ph);
        	   }else {
        		   throw new PriceException("No");
        	   }
        	  
           }
           
           

		public Phone getName(String a) throws PriceException {
			   List<Phone>ni=pd.getAlll();
        	   Phone ph=ni.get(0);
        	   for( int i=0;i<ni.size();i++) {
        		   if(ni.get(i).getBrand().equals(a)) {
        			   ph=ni.get(i);
        		   }
        	   }
        	   if(ph.getBrand().equals(a)) {
        		   return pd.getName(a);
        	   }else {
        		   throw new PriceException("No");
        	   }
				
		}

		public Phone getFirst(String a) throws PriceException{
			List<Phone>ni=pd.getAlll();
     	   Phone ph=ni.get(0);
     	   for( int i=0;i<ni.size();i++) {
     		   if(ni.get(i).equals(a)) {
     			   ph=ni.get(i);
     		   }
     	   }
     	   if(ph.getBrand().equals(a)) {
     		   return pd.getFirst(a);
     	   }else {
     		   throw new PriceException("No");
     	   }
		}
		
		
}
