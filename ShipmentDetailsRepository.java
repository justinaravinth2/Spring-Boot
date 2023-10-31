package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.model.ShipmentDetails;

@Repository
public interface ShipmentDetailsRepository extends JpaRepository<ShipmentDetails, Integer> {
	
	@Query(value="select chwt from so_shipmentdetails s where s.so_details_id=:so_details_id",nativeQuery = true)
	float Chwt(int so_details_id);
	
	@Query(value="select grwt from so_shipmentdetails s where s.so_details_id=:so_details_id",nativeQuery = true)
	float Grwt(int so_details_id);
		
	@Query(value="update so_shipmentdetails s set s.total_vol_ch_wt = case when s.chwt >= s.grwt then s.chwt else s.grwt end where s.so_id=:so_id",nativeQuery = true)
	public void update(int so_id);
	
	
	@Query(value="select sum(pkgs) from so_shipmentdetails s where s.so_id=:so_id",nativeQuery = true)
	int sumPkgs(int so_id);
	
	@Query(value="select sum(chwt)from so_shipmentdetails s where s.so_id=:so_id",nativeQuery=true)
	float sumChwt(int so_id);
	 
	@Query(value="select sum(grwt)from so_shipmentdetails s where s.so_id=:so_id",nativeQuery=true)
	float sumGrwt(int so_id);
	

}
