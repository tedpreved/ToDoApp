package com.teodor.mytsyk.todo.ui.mvp.home

import android.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.teodor.mytsyk.todo.R
import com.teodor.mytsyk.todo.data.model.TaskModel
import kotlinx.android.synthetic.main.fragment_main.*
import java.util.*

/**
 * Created by Monstr on 22.02.2017.
 */

class HomeView : Fragment(), HomeContract.View {

    var presenter: HomeContract.Presenter? = null
    var mTaskAdapter: TaskListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = HomePresenter()
        presenter?.onCreate(this, HomeModel())
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(R.layout.fragment_main, null)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentMainRecycleViewTaskList?.layoutManager = LinearLayoutManager(activity)
        presenter?.fillAdapter()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter?.onDestroy()
    }

    override fun showLoading(isShow: Boolean) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setDataForAdapter(taskList: List<TaskModel>) {
        val taskArrayList = ArrayList<TaskModel>()
        taskArrayList.addAll(taskList)
        mTaskAdapter = TaskListAdapter(taskArrayList)
        fragmentMainRecycleViewTaskList?.adapter = mTaskAdapter
    }

    override fun navigateToTaskDetail(taskId: String) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun navigateToCreatingNewTask() {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
