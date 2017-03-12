package com.teodor.mytsyk.todo.ui.mvp.home

import com.teodor.mytsyk.todo.data.RealmHelper
import com.teodor.mytsyk.todo.data.model.TaskModel
import java.util.*

/**
 * Created by Monstr on 12.03.2017.
 */
class HomeModel : HomeContract.Model {
    override fun getTaskList(): List<TaskModel> {
        return RealmHelper.instance.getTaskListFromDataBase()?: ArrayList()
    }
}