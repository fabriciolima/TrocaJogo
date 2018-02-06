package com.fabricio.trocajogos;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.fabricio.trocajogos.dao.JogoDAO;

@Database(entities = {Jogo.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract JogoDAO jogoDao();

}
