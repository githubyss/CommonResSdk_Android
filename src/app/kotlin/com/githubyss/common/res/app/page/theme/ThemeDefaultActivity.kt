package com.githubyss.common.res.app.page.theme

import com.githubyss.common.base.activity_fragment.binding_reflect_view_model.BaseReflectBindingViewModelToolbarActivity
import com.githubyss.common.res.databinding.ComresActivityThemeSampleToolbarBinding


/**
 * ThemeDefaultActivity
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/10/09 16:16:43
 */
class ThemeDefaultActivity : BaseReflectBindingViewModelToolbarActivity<ComresActivityThemeSampleToolbarBinding>() {

    /** ****************************** Companion ****************************** */

    /**  */
    companion object {
        private val TAG: String = ThemeDefaultActivity::class.java.simpleName
    }


    /** ****************************** Override ****************************** */

    /**  */
    override fun setToolbarTitle() {
        binding.layoutToolbar.toolbarBase.title = "基础的主题"
    }
}