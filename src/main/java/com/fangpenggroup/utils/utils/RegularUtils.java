package com.fangpenggroup.utils.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式工具类
 *
 * @author 刘鹏飞
 * @version 1.00
 * 2018年6月1日 17点26分
 */
public class RegularUtils {
    /**
     * 获取规则文字全部内容
     *
     * @param regex 正则表达式
     * @param str   文字内容
     * @return 文字内容
     */
    public static String getContent(String regex, String str) {
        return RegularUtils.getContent(regex, str, 0);
    }

    /**
     * 根据type 内容 获取规则文字全部内容
     *
     * @param regex 正则表达式
     * @param str   文字内容
     * @param type  0--获取全部内容 1-获取正则表达式()内中的文字
     * @return 文字内容
     */
    public static String getContent(String regex, String str, int type) {
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(str);
        if (matcher.find()) {
            return matcher.group(type);
        }
        return null;
    }
}
