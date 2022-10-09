package com.githubyss.common.res.app.application

import com.githubyss.common.base.application.BaseApplication


/**
 * ComresApplication
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/10/08 09:42:41
 */
class ComresApplication : BaseApplication() {

    /** ****************************** Object ****************************** */

    /**  */
    companion object {
        private val TAG: String = ComresApplication::class.java.simpleName
        fun getApp() = instance
    }


    /** ****************************** Override ****************************** */

    /**  */
    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}
