package com.fabricio.trocajogos.dao;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.fabricio.trocajogos.Jogo;

import java.util.List;

@Dao
public interface JogoDAO {

    @Query("SELECT * FROM jogo")
    List<Jogo> getAll();

    @Query("SELECT * FROM jogo WHERE id IN (:userIds)")
    List<Jogo> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM jogo WHERE nome LIKE :first ")
    Jogo findByName(String first);

    @Insert
    void insertAll(Jogo... jogo);

    @Delete
    void delete(Jogo jogo);

    @Update
    public void updateUsers(Jogo... jogo);
}
