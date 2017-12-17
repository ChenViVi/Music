package com.vivi.music.repository;

import com.vivi.music.model.PlayListEntity;
import com.vivi.music.model.PlayListNetneseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/7/27.
 */
@Repository
public interface PlayListRepository extends JpaRepository<PlayListEntity, Integer> {

    public List<PlayListEntity> findByUserId(int id);
}