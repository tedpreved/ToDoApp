package com.teodor.mytsyk.todo

import android.app.Application
import io.realm.Realm

/**
 * Created by Monstr on 12.03.2017.
 */
class ToDoApp : Application(){

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}