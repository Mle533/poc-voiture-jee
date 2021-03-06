package com.etech.poc.gestion_voiture.service.repository;

import com.etech.poc.gestion_voiture.donnee.domain.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author bona
 */
public interface CommentRepository extends JpaRepository<Comment, String> {

    @Query(value = "select * from comment c where vehicle_id = :idVehicle", nativeQuery = true)
    Page<Comment> findAllByIdVehicle(String idVehicle, Pageable page);

}
