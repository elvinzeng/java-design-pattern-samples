package com.gelvt.gofdp.facade;

/**
 * 计费服务
 * @author: Elvin Zeng
 * @date: 17-7-4.
 */
public class BillingService {
    public static final String BILLING_TYPE_PROCESS_IMG = "billing_type_process_img";

    /**
     * 收费
     * @param userId 用户id
     * @param billingType 收费类型
     * @return 实际收费值（单位人民币）
     */
    public Double charge(Integer userId, String billingType){
        //  在这里执行一堆业务逻辑，记录好这本次收费记录。

        Double actualCharge = 0.03;  //  返回一个模拟的值

        System.out.println("对用户[" + userId + "]收费" + actualCharge
            + "元，收费项目：" + billingType);

        return actualCharge;
    }

    //  这里还有一堆其他的函数
}
