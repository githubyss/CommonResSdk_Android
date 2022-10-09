package com.githubyss.common.res.app.page.theme

import com.githubyss.common.base.activity_fragment.binding_reflect_view_model.BaseReflectBindingViewModelToolbarActivity
import com.githubyss.common.res.databinding.ComresActivityThemeSampleToolbarBinding


/**
 * ThemeToolbarDefaultTransparentWindowNavigationActivity
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/10/09 16:17:41
 */
class ThemeToolbarDefaultTransparentWindowNavigationActivity : BaseReflectBindingViewModelToolbarActivity<ComresActivityThemeSampleToolbarBinding>() {

    /** ****************************** Companion ****************************** */

    /**  */
    companion object {
        private val TAG: String = ThemeToolbarDefaultTransparentWindowNavigationActivity::class.java.simpleName
    }


    /** ****************************** Override ****************************** */

    /**  */
    override fun setToolbarTitle() {
        binding.layoutToolbar.toolbarBase.title = "全透明窗口 ＋ 全透明导航栏"
    }
}