package com.teodor.mytsyk.todo.ui.mvp.home

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Monstr on 22.02.2017.
 */

class HomeView : Fragment(), HomeContract.View {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun showLoading(isShow: Boolean) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun navigateToTaskDetail(taskId: String) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun navigateToCreatingNewTask() {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
