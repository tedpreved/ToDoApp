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
        /* RealmHelper.instance
                 .storeTaskToDataBase(TaskModel(UUID.randomUUID().toString(),"first", "fucking description",0, Date()))

         RealmHelper.instance
                 .storeTaskToDataBase(TaskModel(UUID.randomUUID().toString(),"second", "fucking description",0, Date()))

         RealmHelper.instance
                 .storeTaskToDataBase(TaskModel(UUID.randomUUID().toString(),"first", "fucking description",0, Date()))*/
    }
}