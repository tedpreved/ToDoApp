package com.teodor.mytsyk.todo.data.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

/**
 * Created by Monstr on 12.03.2017.
 */
 open class TaskModel(
        @PrimaryKey
        open var id: String? = null,
        open var title: String? = null,
        open var description: String? = null,
        open var priority: Int? = 0,
        open var createdTime: Date? = null,
        open var lastChangedTime: Date? = null,
        open var deadLineTime: Date? = null)  : RealmObject(){}