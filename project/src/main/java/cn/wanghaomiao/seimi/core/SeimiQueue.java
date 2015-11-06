package cn.wanghaomiao.seimi.core;

import cn.wanghaomiao.seimi.struct.Request;

/**
 * 定义系统队列的基本接口，可自由选择实现，只要符合规范就行。
 * @author 汪浩淼 et.tw@163.com
 * @since 2015/6/2.
 */
public interface SeimiQueue {
    /**
     * 出队一个请求
     * @return
     */
    Request bPop(String crawlerName);

    /**
     * 入队一个请求
     * @param req
     * @return
     */
    boolean push(Request req);

    /**
     * 任务队列剩余长度
     * @return
     */
    int len(String crawlerName);

}
