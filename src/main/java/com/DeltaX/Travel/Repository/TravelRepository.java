package com.DeltaX.Travel.Repository;

import com.DeltaX.Travel.Entity.Travel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelRepository extends JpaRepository<Travel,Long> {
}
