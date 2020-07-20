package com.cts.imsproj.purchase.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.imsproj.purchase.entity.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
}
