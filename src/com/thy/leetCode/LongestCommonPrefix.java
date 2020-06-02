package com.thy.leetCode;

/**
 * @Author 皓宇QAQ
 * @Date 2020/6/2 16:39
 * @Description:最长公共前缀 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * <p>
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * <p>
 * 说明:
 * 所有输入只包含小写字母 a-z 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String reg = strs[0];
        for (String str:strs){
            while (!str.startsWith(reg)){
                if (reg.length()==1){
                    return "";
                }
                reg = reg.substring(0,reg.length()-1);
            }
        }
        return reg;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String str[] = {"flower", "flow", "flight"};
        String x = longestCommonPrefix.longestCommonPrefix(str);
        System.out.println(x);
    }
}
