package com.githubyss.common.res.app.page.theme

import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.view.View
import android.view.WindowManager
import com.githubyss.common.base.activity_fragment.binding_reflect_view_model.BaseReflectBindingViewModelActivity
import com.githubyss.common.res.R
import com.githubyss.common.res.databinding.ComresActivityThemeBinding


/**
 * ThemeActivity
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/10/08 21:01:26
 */
open class ThemeActivity : BaseReflectBindingViewModelActivity<ComresActivityThemeBinding>() {

    /** ****************************** Companion ****************************** */

    /**  */
    companion object {
        private val TAG: String = ThemeActivity::class.java.simpleName
    }


    /** ****************************** Override ****************************** */

    /**  */
    // override fun setToolbarTitle() {
    //     binding.layoutToolbar.toolbarBase.title = "主题（android:theme 属性控制）"
    // }

    /**  */
    override fun bindXmlData() {
        binding.page = this
    }


    /** ****************************** Functions ****************************** */

    /** ******************** Event Handling ******************** */

    /**  */
    open fun onAnyButtonClick(view: View) {
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
            R.id.button_default_colorfulStatus -> {
                startActivity(Intent(this, ThemeDefaultColorfulStatusActivity::class.java))
            }
            R.id.button_default_colorfulNavigation -> {
                startActivity(Intent(this, ThemeDefaultColorfulNavigationActivity::class.java))
            }
            R.id.button_default_colorfulStatusNavigation -> {
                startActivity(Intent(this, ThemeDefaultColorfulStatusNavigationActivity::class.java))
            }
            R.id.button_default_translucentStatusExtend -> {
                startActivity(Intent(this, ThemeDefaultTranslucentStatusExtendActivity::class.java))
            }
            R.id.button_default_translucentNavigationExtend -> {
                startActivity(Intent(this, ThemeDefaultTranslucentNavigationExtendActivity::class.java))
            }
            R.id.button_default_translucentStatusNavigationExtend -> {
                startActivity(Intent(this, ThemeDefaultTranslucentStatusNavigationExtendActivity::class.java))
            }
            R.id.button_default_transparentStatusExtend -> {}
            R.id.button_default_transparentNavigationExtend -> {}
            R.id.button_default_transparentStatusNavigationExtend -> {}

            R.id.button_default_code -> {
                window.clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                    window.statusBarColor = Color.GRAY
                    window.navigationBarColor = Color.GRAY
                }
            }
            R.id.button_default_fullscreen_code -> {
                /**
                 * - WindowManager.LayoutParams.FLAG_FULLSCREEN 隐藏系统的 statusBar，一直停留在全屏状态。
                 */
                window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
                // window.decorView.systemUiVisibility = window.decorView.systemUiVisibility or View.SYSTEM_UI_FLAG_FULLSCREEN
            }
            R.id.button_default_transparentWindow_code -> {
            }
            R.id.button_default_colorfulStatus_code -> {
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                    window.statusBarColor = Color.RED
                }
            }
            R.id.button_default_colorfulNavigation_code -> {
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                    window.navigationBarColor = Color.BLUE
                }
            }
            R.id.button_default_colorfulStatusNavigation_code -> {
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                    window.statusBarColor = Color.RED
                    window.navigationBarColor = Color.BLUE
                }
            }
            R.id.button_default_translucentStatusExtend_code -> {
                window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            }
            R.id.button_default_translucentNavigationExtend_code -> {
                window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
            }
            R.id.button_default_translucentStatusNavigationExtend_code -> {
                window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
                window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
            }
            R.id.button_default_transparentStatusExtend_code -> {
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                    window.statusBarColor = Color.TRANSPARENT
                }

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    window.isStatusBarContrastEnforced = false
                }
            }
            R.id.button_default_transparentNavigationExtend_code -> {
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                    window.navigationBarColor = Color.TRANSPARENT
                }

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    window.isNavigationBarContrastEnforced = false
                }
            }
            R.id.button_default_transparentStatusNavigationExtend_code -> {
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)

                /**
                 * - View.SYSTEM_UI_FLAG_FULLSCREEN 隐藏系统的 statusBar，和 WindowManager.LayoutParams.FLAG_FULLSCREEN 有相同的展示效果。不同的在于，此 FLAG 一般用于暂时全屏的情形（如：阅读应用、全屏视频），如果需要一直停留在全屏状态，（如：游戏应用），使用 WindowManager.LayoutParams.FLAG_FULLSCREEN 则是更好的选择。此 FLAG 会因为各种的交互（如：跳转到其他应用，下拉 statusBar，弹出键盘）的发送而被系统清除。
                 * - View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN 不会隐藏系统的 statusBar，但是页面布局会延伸到 statusBar 下面，被 statusBar 遮挡。
                 * - View.SYSTEM_UI_FLAG_HIDE_NAVIGATION 隐藏系统的 navigationBar
                 * - View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION 不会隐藏导航栏，但是页面布局会延伸到 navigationBar 下面，被 navigationBar 遮挡。
                 * - View.SYSTEM_UI_FLAG_LAYOUT_STABLE 稳定布局。
                 */
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                // window.decorView.fitsSystemWindows = true

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                    window.statusBarColor = Color.TRANSPARENT
                    window.navigationBarColor = Color.TRANSPARENT
                }

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    /**
                     * window.isStatusBarContrastEnforced - 禁用 statusBar 视觉保护
                     * window.isNavigationBarContrastEnforced - 禁用 navigationBar 视觉保护
                     */
                    window.isStatusBarContrastEnforced = false
                    window.isNavigationBarContrastEnforced = false
                }
            }
        }
    }
}