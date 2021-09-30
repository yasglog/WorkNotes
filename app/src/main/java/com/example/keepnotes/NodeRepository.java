package com.example.keepnotes;

import android.app.Application;
import android.content.Context;

import androidx.lifecycle.LiveData;

import java.util.List;

public class NodeRepository {
    private NoteDao noteDao;
    private LiveData<List<Note>> allNote;

    NodeRepository(Application application) {
        NoteDatabase database=NoteDatabase.getInstance(application);
        noteDao= database. noteDao();
        allNote=noteDao.getAllNotes();

    }

       public void insert (Note note){

            NoteDatabase.databaseWriteExecutor.execute(() -> {
                noteDao.insert(note);
            });
        }
       public void delete (Note note){

            NoteDatabase.databaseWriteExecutor.execute(() -> {
                noteDao.delete(note);
            });
        }

        public void update (Note note){

         }
         public  void  deleteAllNotes (){

          }

    public LiveData<List<Note>> getAllNote() {
        return allNote;
    }
}

