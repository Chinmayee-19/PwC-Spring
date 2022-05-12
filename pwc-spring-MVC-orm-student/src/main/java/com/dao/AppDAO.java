package com.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Registration;
public interface AppDAO extends CrudRepository<Registration,Integer>{

}
