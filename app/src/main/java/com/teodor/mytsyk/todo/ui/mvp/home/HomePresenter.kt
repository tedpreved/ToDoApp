package com.teodor.mytsyk.todo.ui.mvp.home

/**
 * Created by Monstr on 12.03.2017.
 */
class HomePresenter : HomeContract.Presenter {
    var view: HomeContract.View? = null
    var model: HomeContract.Model? = null

    override fun onCreate(view: HomeContract.View, model: HomeContract.Model) {
        this.view = view
        this.model = model
    }

    override fun onDestroy() {
        this.view = null
        this.view = null
    }

    override fun fillAdapter() {
        view?.setDataForAdapter(model!!.getTaskList())
    }
}