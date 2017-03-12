package com.teodor.mytsyk.todo.data

import com.teodor.mytsyk.todo.data.model.TaskModel
import io.realm.Realm

/**
 * Created by Monstr on 12.03.2017.
 */
open class RealmHelper : IRealmHelper {
    var realm: Realm? = null

    private object Holder {
        val INSTANCE = RealmHelper()
    }

    companion object {
        val instance: RealmHelper by lazy { Holder.INSTANCE }
    }

    override fun storeTaskToDataBase(task: TaskModel) {
        realm = Realm.getDefaultInstance()
        try {
            realm?.beginTransaction()
            realm?.copyToRealm(task)
            realm?.commitTransaction()
        } finally {
            realm?.close()
        }
    }

    override fun getTaskListFromDataBase(): List<TaskModel>? {
        realm = Realm.getDefaultInstance()
        try {
            return realm?.where(TaskModel::class.java)?.findAll()
        } finally {
            //realm?.close()
        }
    }

    override fun getTaskFromDataBase(taskId: String): TaskModel? {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateTask(task: TaskModel) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeTaskFromDataBase(taskId: String) {
        realm = Realm.getDefaultInstance()
        try {
            realm?.where(TaskModel::class.java)
                    ?.equalTo("id", taskId)
                    ?.findAll()
                    ?.deleteAllFromRealm()
        } finally {
            realm?.close()
        }
    }
}
