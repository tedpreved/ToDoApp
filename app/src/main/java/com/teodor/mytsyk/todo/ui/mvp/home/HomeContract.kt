package com.teodor.mytsyk.todo.ui.mvp.home

import com.teodor.mytsyk.todo.data.model.TaskModel

/**
 * Created by Monstr on 12.03.2017.
 */
interface HomeContract {
    interface Model{
        fun getTaskList(): List<TaskModel>
    }

    interface View{
        fun showLoading(isShow: Boolean)
        fun navigateToTaskDetail(taskId: String)
        fun navigateToCreatingNewTask()
        fun setDataForAdapter(taskList: List<TaskModel>)
    }

    interface Presenter{
        fun onCreate(view: View, model: Model)
        fun onDestroy()
        fun fillAdapter()
    }
}