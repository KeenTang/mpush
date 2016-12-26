package com.mpush.api.spi.push;

public interface PushListener<T extends IPushMessage> {

    /**
     * 消息下发成功后回调
     * 如果消息需要ACK则该方法不会被调用
     *
     * @param message 要下发的消息
     */
    void onSuccess(T message);

    /**
     * 收到客户端ACK后回调
     *
     * @param message 要下发的消息
     */
    void onAckSuccess(T message);

    /**
     * 广播消息推送全部结束后回调
     *
     * @param message 要下发的消息
     */
    void onBroadcastComplete(T message);

    /**
     * 消息下发失败后回调
     *
     * @param message 要下发的消息
     */
    void onFailure(T message);

    /**
     * 推送消息发现用户不在线时回调
     *
     * @param message 要下发的消息
     */
    void onOffline(T message);

    /**
     * 推送消息发现用户不在当前机器时回调
     *
     * @param message 要下发的消息
     */
    void onRedirect(T message);

    /**
     * 等待客户端ACK超时时回调
     *
     * @param message 要下发的消息
     */
    void onAckTimeout(T message);
}