package com.githubyss.common.res.app.page.homepage

import android.content.Intent
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
import com.githubyss.common.res.app.page.theme.ThemeActivity
import com.githubyss.mobile.common.res.R
import com.githubyss.mobile.common.res.common.dimen.SpaceNormal
import com.githubyss.mobile.common.res.databinding.ComresActivityHomepageBinding


/**
 * HomepageActivity
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/10/08 16:19:19
 */
class HomepageActivity : BaseReflectBindingViewModelToolbarActivity<ComresActivityHomepageBinding>() {

    /** ****************************** Companion ****************************** */

    /**  */
    companion object {
        private val TAG: String = HomepageActivity::class.java.simpleName
    }


    /** ****************************** Override ****************************** */

    /**  */
    override fun setToolbarTitle() {
        setToolbarTitle("Res调试首页")
    }

    /**  */
    override fun bindXmlData() {
        binding.page = this
    }


    /** ****************************** Functions ****************************** */

    /** ******************** Event Handling ******************** */

    /**  */
    fun onAnyButtonClick(view: View) {
        when (view.id) {
            R.id.button_color -> {
            }
            R.id.button_dimen -> {}
            R.id.button_theme -> {
                startActivity(Intent(this, ThemeActivity::class.java))
            }
        }
    }
}