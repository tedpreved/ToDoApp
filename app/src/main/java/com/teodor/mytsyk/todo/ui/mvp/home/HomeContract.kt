package com.teodor.mytsyk.todo.ui.mvp.home

import io.realm.RealmObject

/**
 * Created by Monstr on 12.03.2017.
 */
interface HomeContract {
    interface Model{
        fun getTaskList() : List<RealmObject>
    }

    interface View{
        fun showLoading(isShow: Boolean)
        fun navigateToTaskDetail(taskId: String)
        fun navigateToCreatingNewTask()
    }

    interface Presenter{
        fun onCreate(view: View, model: Model)
        fun onDestroy()
    }
}