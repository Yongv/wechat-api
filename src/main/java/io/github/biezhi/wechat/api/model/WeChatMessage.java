package io.github.biezhi.wechat.api.model;

import io.github.biezhi.wechat.utils.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 微信消息，封装了原始消息
 *
 * @author biezhi
 * @date 2018/1/20
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeChatMessage {

    /**
     * 微信原始消息
     */
    private Message raw;

    /**
     * 文本内容
     */
    private String text;

    /**
     * 接收到的图片在本地的路径
     */
    private String imagePath;

    /**
     * 接收到的视频在本地的路径
     */
    private String videoPath;

    /**
     * 接收到的音频在本地的路径
     */
    private String voicePath;

    /**
     * 发送人 username
     */
    private String fromUserName;

    /**
     * 发送人昵称
     */
    private String fromNickName;

    /**
     * 发送人备注
     */
    private String fromRemarkName;

    /**
     * 获取发送人姓名如果有备注则优先显示备注，否则显示昵称
     *
     * @return
     */
    public String getName() {
        return StringUtils.isEmpty(fromRemarkName) ? this.fromNickName : this.fromRemarkName;
    }

}
