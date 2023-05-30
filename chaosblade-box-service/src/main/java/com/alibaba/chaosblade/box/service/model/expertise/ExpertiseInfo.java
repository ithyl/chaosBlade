package com.alibaba.chaosblade.box.service.model.expertise;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author haibin
 *
 *
 */
@Data
public class ExpertiseInfo {

    /**
     * 经验ID
     */
    @JSONField(name = "expertise_id")
    private String expertiseId;

    /**
     * 基本信息
     */
    @JSONField(name = "basic_info")
    private ExpertiseBasicInfo basicInfo;

    /**
     * 执行信息
     */
    @JSONField(name = "executable_info")
    private ExpertiseExecutableInfo executableInfo;

    /**
     * 评测信息
     */
    @JSONField(name = "evaluation_info")
    private ExpertiseEvaluationInfo evaluationInfo;

    /**
     * 扩展信息
     */
    private ExpertiseExtInfo extInfo;

}
