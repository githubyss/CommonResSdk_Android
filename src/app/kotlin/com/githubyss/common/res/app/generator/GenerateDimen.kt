package com.githubyss.common.res.app.generator

import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import java.io.PrintWriter
import java.lang.Exception
import java.lang.StringBuilder
import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.jvm.JvmStatic

object GenerateDimen {
    // 需要创建的目录
    private val SMALL_WIDTH_SIZE_ARRAY = arrayOf(
        // "320", "360", "370", "375", "390", "392",
        // "410", "420", "430", "440", "450", "460", "470", "480", "490",
        // "500", "533", "592",
        // "600", "640", "662",
        // "720", "768",
        // "800", "811", "820",
        // "960",
        // "1024", "1080", "1280", "1600",
        "2000"
    )

    // UI图的最小宽度尺寸，一般手机是360，大屏幕有1080、1600
    private const val UI_DESIGN_WIDTH_SIZE = 2000

    // 最大生成多少dp，默认从0.5dp-500.5dp
    private const val DP_MAX = 2000

    // 最大生成多少sp，默认从0sp-100sp
    private const val SP_MAX = 100

    // dimen命名前后缀
    private const val DP_PREFIX = "d"
    private const val DP_SUFFIX = ""
    private const val SP_PREFIX = "s"
    private const val SP_SUFFIX = ""

    // 项目根目录
    private val ROOT_PATH = File("..").absolutePath + "/CommonResSdk_Android/src/app/java/com/githubyss/common/res/app/generator"

    @JvmStatic
    fun main(args: Array<String>) {
        generateDimen()
    }

    private fun generateDimen() {
        try {
            for (swSize in SMALL_WIDTH_SIZE_ARRAY) {
                val file = File("${ROOT_PATH}/values-sw${swSize}dp")
                file.mkdirs()

                val isDirExist = file.exists()
                if (isDirExist) {
                    genDimen(swSize.toInt())
                }
            }
        }
        catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /**
     * 生成dimens.xml文件
     *
     * @param swSize 当前屏幕尺寸，单位dp
     */
    private fun genDimen(swSize: Int) {
        // swSize是资源目录values-sw?dp中的?
        println("生成dimens.xml文件，当前屏幕最小宽度尺寸:${swSize}")

        try {
            // 基准尺寸，设置成UI图的最小宽度尺寸
            val benchMarkSize = UI_DESIGN_WIDTH_SIZE
            // 目标尺寸与基准尺寸的比值
            val sizeScale = swSize.toDouble() / benchMarkSize

            // dimens.xml文件内容
            val dimenSb = StringBuilder()

            // dimens.xml文件头
            dimenSb.append("""<?xml version="1.0" encoding="utf-8"?>""").append("\r\n").append("""<resources>""").append("\r\n")

            // 生成dp标签
            for (i in 0..DP_MAX) {
                // 这里控制对应转换的值，如果是基准尺寸就一对一转换，否则就按目前尺寸/基准尺寸比例转换
                // 例如目标尺寸为360，设计用的基准尺寸为360，则转换比例为360/360=1.0
                // 例如目标尺寸为720，设计用的基准尺寸为360，则转换比例为720/360=2.0
                val format = DecimalFormat("#.#").apply { roundingMode = RoundingMode.UP }
                val sw1multiDp = format.format((i + 0.0) * sizeScale)
                // val sw0dot5multiDp = format.format((i + 0.5) * sizeScale)
                // 写入基准尺寸1倍数dp对应的目标尺寸dimen
                dimenSb.append("""	<dimen name="${DP_PREFIX}${i}${DP_SUFFIX}">${sw1multiDp}dp</dimen>""").append("\r\n")
                // 写入基准尺寸0.5倍数dp对应的目标尺寸dimen
                // dimenSb.append("""	<dimen name="${DP_PREFIX}${i}_5${DP_SUFFIX}">${sw0dot5multiDp}dp</dimen>""").append("\r\n")
            }

            // dimens.xml中间换行
            dimenSb.append("\r\n")

            // 生成sp标签
            for (i in 0..SP_MAX) {
                val format = DecimalFormat("#").apply { roundingMode = RoundingMode.UP }
                val sw1multiSp = format.format((i + 0.0) * sizeScale)
                dimenSb.append("""	<dimen name="${SP_PREFIX}${i}${SP_SUFFIX}">${sw1multiSp}sp</dimen>""").append("\r\n")
            }

            // dimens.xml文件尾
            dimenSb.append("</resources>")

            // 这里是文件名，1 注意修改 sw 后面的值，和转换值一一对应
            val swDimenFile = "${ROOT_PATH}/values-sw${swSize}dp/dimens.xml"

            // 文件写入流
            val out = PrintWriter(BufferedWriter(FileWriter(swDimenFile)))

            // 写入文件
            out.println(dimenSb.toString())

            // 关闭io流
            out.close()
        }
        catch (e: Exception) {
            println("Exception e.message:${e.message}")
        }
    }
}