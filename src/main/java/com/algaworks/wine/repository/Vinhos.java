/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.wine.repository;

import com.algaworks.wine.model.Vinho;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jose2
 */
public interface Vinhos extends JpaRepository<Vinho, Long>{
    
}
