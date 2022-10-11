package com.githubyss.common.res.app.page.homepage

import android.content.Intent
import android.view.View
import com.githubyss.common.base.activity_fragment.binding_reflect_view_model.BaseReflectBindingViewModelToolbarActivity
import com.githubyss.common.res.app.page.theme.ThemeActivity
import com.githubyss.common.res.R
import com.githubyss.common.res.databinding.ComresActivityHomepageBinding


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
        binding.layoutToolbar.toolbarBase.title = "Res调试首页"
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
            R.id.button_theme -> startActivity(Intent(this, ThemeActivity::class.java))
        }
    }
}