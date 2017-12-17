package com.vivi.music.repository;


import com.vivi.music.model.UserEntity;
import com.vivi.music.model.UserNetneseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/7/27.
 */
@Repository
public interface UserNetneseRepository extends JpaRepository<UserNetneseEntity, Integer> {
    public List<UserNetneseEntity> findByUserId(int id);

    public UserNetneseEntity findOneByUserId(int id);
}