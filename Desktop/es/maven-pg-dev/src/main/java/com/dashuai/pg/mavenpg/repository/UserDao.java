package com.dashuai.pg.mavenpg.repository;

import com.dashuai.pg.mavenpg.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;
@Repository
public interface UserDao extends JpaRepository<User,String> {
}
