package com.wiilead.it.log.event;

import com.wiilead.it.constant.SecurityConstants;
import com.wiilead.it.sysmanager.api.model.vo.SysLogVO;
import com.wiilead.it.sysmanager.api.service.SysLogFeginApi;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;


/**
 * @ClassName: SysLogEvent
 * @Description: 异步保存日志
 * @Author mushishi
 * @Date 2019/4/20-9:14
 */
@Slf4j
@AllArgsConstructor
public class SysLogListener {

	// 远程日志保存
	private final SysLogFeginApi sysLogFeginApi;

	@Async
	@Order
	@EventListener(SysLogEvent.class)
	public void saveSysLog(SysLogEvent event) {
		SysLogVO sysLog = (SysLogVO) event.getSource();
		sysLogFeginApi.saveLog(sysLog, SecurityConstants.FROM_IN);
	}
}
