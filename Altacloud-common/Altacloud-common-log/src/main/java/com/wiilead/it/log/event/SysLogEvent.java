package com.wiilead.it.log.event;

import com.wiilead.it.sysmanager.api.model.vo.SysLogVO;
import org.springframework.context.ApplicationEvent;

/**
 * @ClassName: SysLogEvent
 * @Description: 系统日志事件 监听SysLogVO所发送的事件
 *
 * 1.先自定义事件：你的事件需要继承 ApplicationEvent
 *
 * 2.定义事件监听器: 需要实现 ApplicationListener
 *
 * 3.使用容器对事件进行发布
 *
 * @Author mushishi
 * @Date 2019/4/20-9:14
 */
public class SysLogEvent extends ApplicationEvent {

    public SysLogEvent(SysLogVO source) {
        super(source);
    }
}
