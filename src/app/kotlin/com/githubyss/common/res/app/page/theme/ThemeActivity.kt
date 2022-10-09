package com.githubyss.common.res.app.page.theme

import android.content.Intent
import android.view.View
import com.githubyss.common.base.activity_fragment.binding_reflect_view_model.BaseReflectBindingViewModelToolbarActivity
import com.githubyss.mobile.common.res.R
import com.githubyss.mobile.common.res.databinding.ComresActivityThemeBinding


/**
 * ThemeActivity
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/10/08 21:01:26
 */
class ThemeActivity : BaseReflectBindingViewModelToolbarActivity<ComresActivityThemeBinding>() {

    /** ****************************** Companion ****************************** */

    /**  */
    companion object {
        private val TAG: String = ThemeActivity::class.java.simpleName
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
            R.id.button_default -> {
                startActivity(Intent(this, ThemeDefaultActivity::class.java))
            }
            R.id.button_default_fullscreen -> {
                startActivity(Intent(this, ThemeDefaultFullscreenActivity::class.java))
            }
            R.id.button_default_transparentWindow -> {
                startActivity(Intent(this, ThemeDefaultTransparentWindowActivity::class.java))
            }
            R.id.button_default_transparentWindow_fullscreen -> {
                startActivity(Intent(this, ThemeDefaultTransparentWindowFullscreenActivity::class.java))
            }
            R.id.button_default_transparentWindowStatus -> {
                startActivity(Intent(this, ThemeDefaultTransparentWindowStatusActivity::class.java))
            }
            R.id.button_default_transparentWindowNavigation -> {
                startActivity(Intent(this, ThemeDefaultTransparentWindowNavigationActivity::class.java))
            }
            R.id.button_default_transparentWindowStatusNavigation -> {
                startActivity(Intent(this, ThemeDefaultTransparentWindowStatusNavigationActivity::class.java))
            }
            R.id.button_default_transparentWindowExtendStatus -> {
                startActivity(Intent(this, ThemeDefaultTransparentWindowExtendStatusActivity::class.java))
            }
            R.id.button_default_transparentWindowExtendNavigation -> {
                startActivity(Intent(this, ThemeDefaultTransparentWindowExtendNavigationActivity::class.java))
            }
            R.id.button_default_transparentWindowExtendStatusNavigation -> {
                startActivity(Intent(this, ThemeDefaultTransparentWindowExtendStatusNavigationActivity::class.java))
            }
        }
    }
}