package br.com.fabianafarias.businesscard

import android.app.Application
import br.com.fabianafarias.businesscard.data.AppDatabase
import br.com.fabianafarias.businesscard.data.BusinessCardRepository

class App : Application() {

    private val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}