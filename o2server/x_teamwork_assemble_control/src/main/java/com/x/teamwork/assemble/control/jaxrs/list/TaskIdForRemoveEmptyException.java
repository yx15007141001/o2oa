package com.x.teamwork.assemble.control.jaxrs.list;

import com.x.base.core.project.exception.PromptException;

class TaskIdForRemoveEmptyException extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	TaskIdForRemoveEmptyException() {
		super("需要从列表中删除的工作任务信息ID为空，无法继续操作。" );
	}
}
