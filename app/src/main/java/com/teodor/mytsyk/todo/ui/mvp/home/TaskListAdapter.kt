package com.teodor.mytsyk.todo.ui.mvp.home

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.teodor.mytsyk.todo.R
import com.teodor.mytsyk.todo.data.model.TaskModel
import java.util.*

/**
 * Created by Monstr on 22.02.2017.
 */

class TaskListAdapter(var mTaskList: ArrayList<TaskModel>) : RecyclerView.Adapter<TaskListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.item_task_list, parent, false)
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentTask = mTaskList[position]
        currentTask.apply {
            title?.apply { holder.tvTitle.text = title }
            description?.apply { holder.tvContent.text = description }
            createdTime?.apply { holder.tvDate.text = createdTime.toString() }
        }

    }

    override fun getItemCount(): Int {
        return mTaskList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView
        var tvContent: TextView
        var tvDate: TextView

        init {
            tvTitle = itemView.findViewById(R.id.itemTaskListTvTitle) as TextView
            tvContent = itemView.findViewById(R.id.itemTaskListPreview) as TextView
            tvDate = itemView.findViewById(R.id.itemTaskListCreatedDate) as TextView
        }
    }
}
