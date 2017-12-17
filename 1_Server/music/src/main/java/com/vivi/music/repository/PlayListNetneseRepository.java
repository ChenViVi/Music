package com.vivi.music.repository;

import com.vivi.music.model.PlayListNetneseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/7/27.
 */
@Repository
public interface PlayListNetneseRepository extends JpaRepository<PlayListNetneseEntity, Integer> {
    @Transactional
    int deleteByNetneseId(Integer id);

    public List<PlayListNetneseEntity> findByNetneseId(int id);
}