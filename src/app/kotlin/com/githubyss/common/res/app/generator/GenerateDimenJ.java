package com.githubyss.common.res.app.generator;

import java.io.BufferedWriter;

import java.io.File;

import java.io.FileWriter;

import java.io.PrintWriter;

/**

 * author : Louis

 * time : 2021-5-19

 * desc : 一键生成主流的屏幕适配dimens.xml文件

 */

public class GenerateDimenJ {

//需要创建的目录

    private static final String[] mDirs = {

            "320", "360", "370", "375", "390", "392", "410", "420",

            "430", "440", "450", "460", "470", "480", "490", "500",

            "533", "592", "600", "640", "662", "720", "768", "800",

            "811", "820", "960", "1024", "1280", "1365"

    };

//最大生成多少dp 默认从0.5dp-500.5dp

    private static final int MAX_DP=500;

    public static void main(String[] args) {

//创建目录

        createdDirs();

    }

    /**

     * 创建对应目录

     */

    public static void createdDirs() {

        try {

            for (String mDir : mDirs) {

                File file = new File("./comp_resource/src/main/res/values-w" + mDir + "dp");

                boolean flag=file.mkdir();

//创建目录后生成dimens.xml文件

                if(flag)

                    genDimen(Integer.parseInt(mDir));

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }



    /**

     * 生成dimens.xml文件

     *

     * @param currentSize 当前屏幕尺寸 单位dp

     */

    public static void genDimen(int currentSize) {

        StringBuilder stringBuilder = new StringBuilder();

        PrintWriter out;

        double benchMarkSize = 375;//标准尺寸，改为设计图的尺寸，一般是360dp

//当前设备尺寸dp

        String screenStr = "" + currentSize;//values-wXXXdp中的XXX 设置生成dimens.xml的目录名

        try {

            stringBuilder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +

                                 "<resources>\n");

            double value;

//生成dp标签

            value = 0.5d * currentSize / benchMarkSize;

            stringBuilder.append("\t<dimen name=\"dp0_5" + "\">").append(value).append("dp</dimen>\r\n");

            for (int i = 0; i < MAX_DP; i++) {

//这里控制对应转换的值，如果是标准尺寸就一对一转换 目前尺寸/标准尺寸 例如目前设备屏幕为420dp 设计用的标准尺寸为360

                value = currentSize / benchMarkSize;

                stringBuilder.append("\t<dimen name=\"dp").append(i + 1).append("\">").append(value).append("dp</dimen>\r\n");

                if (i == 0) {

                    if(currentSize / benchMarkSize==1){

                        stringBuilder.append("\t<dimen name=\"dp1_5" + "\">1.5dp</dimen>\r\n");

                    }else{

                        stringBuilder.append("\t<dimen name=\"dp1_5" + "\">").append(value * (1.5d)).append("dp</dimen>\r\n");

                    }

                } else {

                    if(currentSize / benchMarkSize==1){

                        stringBuilder.append("\t<dimen name=\"dp").append(i + 1).append("_5").append("\">").append(i + 1.5).append("dp</dimen>\r\n");

                    }else{

                        stringBuilder.append("\t<dimen name=\"dp").append(i + 1).append("_5").append("\">").append(value * ( i + 1.5) ).append("dp</dimen>\r\n");

                    }

                }

            }

//生成sp标签

            for (int i = 6; i <= 50; i++) {

//这里控制对应转换的值，如果是标准尺寸就一对一转换 目前尺寸/标准尺寸 例如目前设备屏幕为420dp 设计用的标准尺寸为360

                value = ((double) (i)) * currentSize / benchMarkSize;

                stringBuilder.append("\t<dimen name=\"sp").append(i).append("\">").append(value).append("sp</dimen>\r\n");

            }

            stringBuilder.append("</resources>");

//这里是文件名，1 注意修改 sw 后面的值，和转换值一一对应

            String fileDef = "./comp_resource/src/main/res/values-w" + screenStr + "dp/dimens.xml";

//文件写入流

            out = new PrintWriter(new BufferedWriter(new FileWriter(fileDef)));

//写入文件

            out.println(stringBuilder.toString());

//关闭io流

            out.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}