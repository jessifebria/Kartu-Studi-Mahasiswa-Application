/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exerciseSpringBoot.crudBootstrap.repositories;

import com.exerciseSpringBoot.crudBootstrap.entities.Datamhs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JESSI
 */
@Repository
public interface DatamhsRepository extends JpaRepository< Datamhs ,String> {
    
}
