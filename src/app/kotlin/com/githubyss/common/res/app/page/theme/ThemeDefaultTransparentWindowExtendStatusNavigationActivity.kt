package com.githubyss.common.res.app.page.theme

import android.view.View
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import com.githubyss.common.base.activity_fragment.binding_reflect.BaseReflectBindingActivity
import com.githubyss.common.base.activity_fragment.binding_reflect.BaseReflectBindingToolbarActivity
import com.githubyss.common.base.activity_fragment.binding_reflect_view_model.BaseReflectBindingViewModelToolbarActivity
import com.githubyss.common.base.activity_fragment.classical.BaseActivity.Companion.FRAGMENT_BASE_CONTAINER_ID
import com.githubyss.common.base.activity_fragment.compose.BaseComposeToolbarActivity
import com.githubyss.common.base.databinding.CombaseActivityBaseBinding
import com.githubyss.common.base.databinding.CombaseActivityBaseToolbarBinding
import com.githubyss.mobile.common.res.R
import com.githubyss.mobile.common.res.common.dimen.SpaceNormal
import com.githubyss.mobile.common.res.databinding.ComresActivityHomepageBinding
import com.githubyss.mobile.common.res.databinding.ComresActivityThemeBinding
import com.githubyss.mobile.common.res.databinding.ComresActivityThemeSampleToolbarBinding


/**
 * ThemeActivity
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/10/08 21:01:26
 */
class ThemeDefaultTransparentWindowExtendStatusNavigationActivity : BaseReflectBindingViewModelToolbarActivity<ComresActivityThemeSampleToolbarBinding>() {

    /** ****************************** Companion ****************************** */

    /**  */
    companion object {
        private val TAG: String = ThemeDefaultTransparentWindowExtendStatusNavigationActivity::class.java.simpleName
    }


    /** ****************************** Override ****************************** */

    /**  */
    override fun setToolbarTitle() {
        setToolbarTitle("全透明窗口 ＋ 界面延伸到状态栏、导航栏")
    }
}