package com.joel.random.views

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.joel.random.data.DataStore
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*

@OptIn(FlowPreview::class)
class RandomViewModel : ViewModel() {

    private val _searchText = MutableStateFlow("")
    val searchText = _searchText.asStateFlow()

    private val _isSearching = MutableStateFlow(false)
    val isSearching = _isSearching.asStateFlow()

    private val _randoms = MutableStateFlow(DataStore.randomItemsList)

    val randoms = searchText
        .debounce(1000L)
        .onEach { _isSearching.update { true } }
        .combine(_randoms) { text, persons ->
            if(text.isBlank()) {
                persons
            } else {
                delay(2000L)
                persons.filter {
                    it.makeQuery(text)
                }
            }
        }
        .onEach { _isSearching.update { false } }
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            _randoms.value
        )

    fun onSearchTextChange(text: String) {
        _searchText.value = text
    }


}

