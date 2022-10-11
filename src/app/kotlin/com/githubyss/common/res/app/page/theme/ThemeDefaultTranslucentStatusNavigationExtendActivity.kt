package com.githubyss.common.res.app.page.theme

import com.githubyss.common.base.activity_fragment.binding_reflect_view_model.BaseReflectBindingViewModelToolbarActivity
import com.githubyss.common.res.databinding.ComresActivityThemeSampleToolbarBinding


/**
 * ThemeDefaultTranslucentStatusNavigationExtendActivity
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/10/09 16:17:22
 */
class ThemeDefaultTranslucentStatusNavigationExtendActivity : BaseReflectBindingViewModelToolbarActivity<ComresActivityThemeSampleToolbarBinding>() {

    /** ****************************** Companion ****************************** */

    /**  */
    companion object {
        private val TAG: String = ThemeDefaultTranslucentStatusNavigationExtendActivity::class.java.simpleName
    }


    /** ****************************** Override ****************************** */

    /**  */
    override fun setToolbarTitle() {
        binding.layoutToolbar.toolbarBase.title = "半透明状态栏、导航栏 ＋ 界面延伸到状态栏、导航栏"
    }
}