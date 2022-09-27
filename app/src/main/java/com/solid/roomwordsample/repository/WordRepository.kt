package com.solid.roomwordsample.repository

import androidx.annotation.WorkerThread
import com.solid.roomwordsample.db.WordDao
import com.solid.roomwordsample.model.Word
import kotlinx.coroutines.flow.Flow

class WordRepository (private val wordDao: WordDao){

    val allWords: Flow<List<Word>> = wordDao.getAlphabetizedWords()

    @WorkerThread
    suspend fun insert(word: Word){
        wordDao.insert(word)
    }
}