package com.practicum.birdsnotes;

import androidx.cardview.widget.CardView;

import com.practicum.birdsnotes.Models.Notes;

public interface NotesClickListener {

    void onClick (Notes notes);
    void onLongClick (Notes notes, CardView cardView);



}
