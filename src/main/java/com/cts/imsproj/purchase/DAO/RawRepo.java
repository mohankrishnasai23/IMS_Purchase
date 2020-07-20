package com.cts.imsproj.purchase.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.imsproj.purchase.entity.RawMaterials;

@Repository
public interface RawRepo extends JpaRepository<RawMaterials, Integer> {

}
