package com.phone.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.phone.entity.Phone;

public interface PhoneRepository extends JpaRepository<Phone,Integer> {

	@Query(value="SELECT color,count(color) FROM phone_details group by(color)",nativeQuery = true)
	public List<Object>getAll();
	
	@Query(value="select *from phone_details where price >? and price <?",nativeQuery = true)
	public List<Phone>getPrices(int a,int b);
	
	@Query("select a from Phone a")
	public List<Phone>getAlll();
	
	
	@Query(value=("SELECT * FROM phone_details where brand like ?%"),nativeQuery = true)
	public List<Phone>getBrand(String a);
	
	@Query(value="select a from Phone a where a.price> :x")
	public List<Phone> getPrice(@Param("x")int a);
	
	@Query(value="select * from phone_deatails where price like ?",nativeQuery = true)
	public List<Phone> getRate(int a);
	
	@Query(value=("select * from phone_details where brand = ?"),nativeQuery = true)
	public Phone getName(String ph);

	@Query(value=("SELECT * FROM phone_details.phone_details where brand like ?%"),nativeQuery = true)
	public Phone getFirst(String a);

}
