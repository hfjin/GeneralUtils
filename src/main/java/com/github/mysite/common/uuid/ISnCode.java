package com.github.mysite.common.uuid;

import com.github.mysite.common.uuid.arithmatic.IArithmatic;

/**
 * description:根据规则生成最终的订单号
 *
 * @author :    jy.chen
 *  @version  :  1.0
 * @since  : 2015/8/11 - 10:57
 */
public interface ISnCode {
    /**
     * 根据规则生成最终的订单号
     *
     * @param businessType   业务类型
     * @param needFormat     是否需要格式
     * @param formatStr      格式的字符串
     * @param padStr         填充的字符串
     * @param len            填充的长度
     * @param needArithmatic 是否需要运算
     * @param ia             运算的接口
     * @param cacheNum       缓存的数量
     * @return 最终的订单号
     */
    public String genSnCode(String businessType, boolean needFormat, String formatStr, String padStr, int len,
                            boolean needArithmatic, IArithmatic ia, int cacheNum);

}
