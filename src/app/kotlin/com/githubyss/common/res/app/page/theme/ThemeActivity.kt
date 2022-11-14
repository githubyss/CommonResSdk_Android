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
            R.id.button_default_transparentWindow -> {
                startActivity(Intent(this, ThemeDefaultTransparentWindowActivity::class.java))
            }
            R.id.button_default_fullscreenStatus -> {
                startActivity(Intent(this, ThemeDefaultFullscreenActivity::class.java))
            }
            R.id.button_default_fullscreenNavigation -> {}
            R.id.button_default_fullscreenStatusNavigation -> {}
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

            /**
             * 能够造成 SystemUI Flag 被系统自动清除的交互分类
             * - 触摸屏幕的任何位置；
             * - 顶部下拉状态栏；
             * - 底部上拉导航栏；
             * - Window 的变化（如：跳转到其他页面、软键盘的弹出）。
             */
            R.id.button_default_code -> {
                /**
                 * WindowManager.LayoutParams.FLAG_FULLSCREEN
                 * - 设置此属性，隐藏 StatusBar，并使整个布局上移 StatusBar 的高度。不会因为用户操作而清除。
                 * - 设置此属性，会导致软键盘的 SOFT_INPUT_ADJUST_RESIZE 的特性失效。暂时没遇到此问题。
                 * - 清除此属性，会恢复非全屏状态，重新显示 StatusBar，布局恢复正常位置。
                 */
                window.clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)

                /**
                 * WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                 * - 设置此属性，设置半透明的 StatusBar，并使整个布局上移 StatusBar 的高度。不会因为用户操作而清除。
                 * - 设置此属性，系统会自动同时设置 View.SYSTEM_UI_FLAG_LAYOUT_STABLE 和 View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN 这两个属性。
                 * - 清除此属性，会恢复不透明的 StatusBar，布局恢复正常位置。
                 */
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

                /**
                 * WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION
                 * - 设置半透明 NavigationBar，并使整个布局下移 NavigationBar 的高度。不会因用户交互而被清除。
                 * - 设置此属性，系统会自动设置 View.SYSTEM_UI_FLAG_LAYOUT_STABLE 和 View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION 这两个属性。
                 * - 清除此属性，会恢复不透明的 NavigationBar，布局恢复正常位置。
                 */
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)

                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE or
                        /**
                         * View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                         * - 稳定布局。
                         * - 当使用 View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN 或 View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION 时，此时如果给 View 添加 fitSystemWindows=true，系统会自动为 View 添加 StatusBar 高度的 paddingTop 和 NavigationBar 高度的 paddingBottom，如果 StatusBar 或 NavigationBar 隐藏，则 View 的 padding 会变成 0，视觉上会看到闪烁。如果配合 View.SYSTEM_UI_FLAG_LAYOUT_STABLE 使用，即使 StatusBar 或 NavigationBar 隐藏，View 的 padding 依然不变，这就是稳定布局的意思
                         * - 当使用 View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE 时，会隐藏 StatusBar，但 StatusBar 所占的控件不会隐藏，只会变成白色。同时 Activity 页面不会延伸到 StatusBar 下。若是加上 View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN，View 所在 Window 的显示范围则会伸展到 StatusBar 所在的空间。
                         */
                        View.SYSTEM_UI_FLAG_LAYOUT_STABLE

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    /**
                     * WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS
                     * - 设置此属性，为 StatusBar 和 NavigationBar 设置背景颜色。配合 setStatusBarColor(ColorInt) 和 setNavigationBarColor(ColorInt) 使用。
                     * - 原理：将 StatusBar 和 NavigationBar 设置为透明背景，并且将 StatusBar 和 NavigationBar 所在空间设置为 Window.getStatusBarColor() 和 Window.getNavigationBarColor() 方法获得的颜色。
                     * - 清除此属性，会导致给 StatusBar 和 NavigationBar 着色失效。
                     */
                    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                    window.statusBarColor = resources.getColor(R.color.comres_statusBarColor_default)
                    window.navigationBarColor = resources.getColor(R.color.comres_navigationBarColor_default)
                }
            }
            R.id.button_default_transparentWindow_code -> {
                // 暂时没有找到动态设置透明窗口的方案
            }
            R.id.button_default_fullscreenStatus_code -> {
                // window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)

                /**
                 * View.SYSTEM_UI_FLAG_FULLSCREEN
                 * - 隐藏系统的 StatusBar，和 WindowManager.LayoutParams.FLAG_FULLSCREEN 有相同的展示效果。不同的在于，此 FLAG 一般用于暂时全屏的情形（如：阅读应用、全屏视频），如果需要一直停留在全屏状态，（如：游戏应用），使用 WindowManager.LayoutParams.FLAG_FULLSCREEN 则是更好的选择。此 FLAG 会因为各种的交互（如：跳转到其他应用，下拉 StatusBar，弹出键盘）的发送而被系统清除。但是可以配合 View.SYSTEM_UI_FLAG_IMMERSIVE 和 View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY 避免某些用户交互造成系统自动清除全屏状态。
                 */
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN or
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
            }
            R.id.button_default_fullscreenNavigation_code -> {
                /**
                 * View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                 * - 隐藏系统的 NavigationBar
                 * - 但是用户的任何操作都会清除这个 FLAG，进而 NavigationBar 自动重新显示起来。同时 View.SYSTEM_UI_FLAG_FULLSCREEN 也会被自动清除，因此 StatusBar 也会同时显示出来。
                 */
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                        /**
                         * View.SYSTEM_UI_FLAG_IMMERSIVE
                         * - 避免某些用户交互造成系统自动清除全屏状态。
                         * - View.SYSTEM_UI_FLAG_IMMERSIVE 和 View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY 的使用主要是为了当设置全屏模式时，避免某些用户交互造成系统自动清除全屏状态。
                         * - 当使用 View.SYSTEM_UI_FLAG_HIDE_NAVIGATION 隐藏 NavigationBar 时，配合此特性，只有第三、四种操作会导致 NavigationBar 的隐藏状态被系统自动清除；否则，任何交互都不会导致导航栏的隐藏状态被系统自动清除。
                         * - 此标识只有配合 View.SYSTEM_UI_FLAG_HIDE_NAVIGATION 才有作用。
                         */
                        View.SYSTEM_UI_FLAG_IMMERSIVE or
                        /**
                         * View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                         * - 避免某些用户交互造成系统自动清除全屏状态。同时 Activity 的部分内容也因此被 StatusBar 覆盖遮挡。
                         * - 用 View.SYSTEM_UI_FLAG_HIDE_NAVIGATION 隐藏 NavigationBar，配合使用此 FLAG，只有用户的第四种操作会导致 StatusBar 或（和） NavigationBar 的隐藏状态被系统自动清除。否则任何交互都不会导致相应状态的清除。
                         * - 此 FLAG 只有配合 View.SYSTEM_UI_FLAG_FULLSCREEN 和 View.SYSTEM_UI_FLAG_HIDE_NAVIGATION 使用时才会起作用。
                         */
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
            }
            R.id.button_default_fullscreenStatusNavigation_code -> {
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN or
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                        View.SYSTEM_UI_FLAG_IMMERSIVE or
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
            }
            R.id.button_default_colorfulStatus_code -> {
                /** 一定要清除，不然 Window 会上移 */
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                    window.statusBarColor = Color.RED
                }
            }
            R.id.button_default_colorfulNavigation_code -> {
                /** 一定要清除，不然 Window 会下移 */
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                    window.navigationBarColor = Color.BLUE
                }
            }
            R.id.button_default_colorfulStatusNavigation_code -> {
                /** 一定要清除，不然 Window 会上移 */
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
                /** 一定要清除，不然 Window 会下移 */
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
                /** 一定要清除，不然 StatusBar 只能半透明 */
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

                /**
                 * View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                 * - 不会隐藏系统的 StatusBar，但是页面布局会延伸到 StatusBar 下面，被 StatusBar 遮挡。
                 * - 设置此 FLAG 时，设置 View 的 fitSystemWindows=true，会给该 View 添加和 StatusBar 相同高度的paddingTop。
                 */
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                    window.statusBarColor = Color.TRANSPARENT
                }

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    /**
                     * window.isStatusBarContrastEnforced
                     * - 禁用 StatusBar 视觉保护，即禁止半透明的 StatusBar
                     */
                    window.isStatusBarContrastEnforced = false
                }
            }
            R.id.button_default_transparentNavigationExtend_code -> {
                /** 一定要清除，不然 NavigationBar 只能半透明 */
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)

                /**
                 * View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                 * - 不会隐藏 NavigationBar，但是页面布局会延伸到 NavigationBar 下面，被 NavigationBar 遮挡。
                 * - 设置此 FLAG 时，设置 View 的 fitSystemWindows=true，会给该 View 添加和 NavigationBar 高度相同的 paddingBottom。
                 */
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                    window.navigationBarColor = Color.TRANSPARENT
                }

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    /**
                     * window.isNavigationBarContrastEnforced
                     * - 禁用 NavigationBar 视觉保护，即禁止半透明的 NavigationBar
                     */
                    window.isNavigationBarContrastEnforced = false
                }
            }
            R.id.button_default_transparentStatusNavigationExtend_code -> {
                /** 一定要清除，不然 StatusBar 只能半透明 */
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
                /** 一定要清除，不然 NavigationBar 只能半透明 */
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)

                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                // window.decorView.fitsSystemWindows = true

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                    window.statusBarColor = Color.TRANSPARENT
                    window.navigationBarColor = Color.TRANSPARENT
                }

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    window.isStatusBarContrastEnforced = false
                    window.isNavigationBarContrastEnforced = false
                }
            }
        }
    }
}