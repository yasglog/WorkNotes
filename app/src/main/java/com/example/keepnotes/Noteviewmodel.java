package com.example.keepnotes;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class Noteviewmodel extends AndroidViewModel {
    private NodeRepository repository;
    private LiveData<List<Note>> allnote;

    public Noteviewmodel(@NonNull Application application) {
        super(application);
        repository = new NodeRepository(application);
        allnote = repository.getAllNote();


    }

    /*LiveData<List<Note>> getMallnote() {
        return allnote;
    }*/

    public void insert(Note note) {
        repository.insert(note);
    }

    public void update(Note note) {
        repository.update(note);
    }

    public void delete(Note note) {
        repository.delete(note);
    }
    public void deleteAllNotes() {
        repository.deleteAllNotes();

    }

    public LiveData<List<Note>> getAllnote() {
        return allnote;
    }
}
