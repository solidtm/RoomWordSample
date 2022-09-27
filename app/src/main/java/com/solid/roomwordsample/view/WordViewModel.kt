package com.solid.roomwordsample.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import com.solid.roomwordsample.model.Word
import com.solid.roomwordsample.repository.WordRepository

class WordViewModel(private val repository: WordRepository) {

    val allWords: LiveData<List<Word>> = repository.allWords.asLiveData()

    suspend fun insert(word: Word){
        repository.insert(word)
    }
}

class WordViewModelFactory(private val repository: WordRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(WordViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return WordViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}