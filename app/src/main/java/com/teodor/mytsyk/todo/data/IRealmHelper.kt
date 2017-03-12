package com.teodor.mytsyk.todo.data

import com.teodor.mytsyk.todo.data.model.TaskModel

/**
 * Created by Monstr on 12.03.2017.
 */
interface IRealmHelper {
    fun storeTaskToDataBase(task: TaskModel)
    fun getTaskFromDataBase(taskId: String) : TaskModel?
    fun updateTask(task: TaskModel)
    fun removeTaskFromDataBase(taskId: String)
}