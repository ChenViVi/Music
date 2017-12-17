package com.vivi.music.repository;


import com.vivi.music.model.MsgEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/7/27.
 */
@Repository
public interface MsgRepository extends JpaRepository<MsgEntity, Integer> {

}