package com.publiccms.views.directive.cms;

// Generated 2021-09-23 16:55:08 by com.publiccms.common.generator.SourceGenerator

import java.io.IOException;
import java.util.List;
import java.util.Map;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import com.publiccms.common.base.AbstractTemplateDirective;
import com.publiccms.common.handler.RenderHandler;
import com.publiccms.common.tools.CommonUtils;
import com.publiccms.entities.cms.CmsUserSurveyQuestion;
import com.publiccms.entities.cms.CmsUserSurveyQuestionId;
import com.publiccms.entities.sys.SysSite;
import com.publiccms.logic.service.cms.CmsUserSurveyQuestionService;

/**
 *
 * CmsUserSurveyQuestionDirective
 * 
 */
@Component
public class CmsUserSurveyQuestionDirective extends AbstractTemplateDirective {

    @Override
    public void execute(RenderHandler handler) throws IOException, Exception {
        Long userId = handler.getLong("userId");
        Long questionId = handler.getLong("questionId");
        SysSite site = getSite(handler);
        if (null != userId) {
            if (null != questionId) {
                CmsUserSurveyQuestion entity = service.getEntity(new CmsUserSurveyQuestionId(userId, questionId));
                if (null != entity && site.getId() == entity.getSiteId()) {
                    handler.put("object", entity).render();
                }
            } else {
                Long[] questionIds = handler.getLongArray("questionIds");
                if (CommonUtils.notEmpty(questionIds)) {
                    CmsUserSurveyQuestionId[] entityIds = new CmsUserSurveyQuestionId[questionIds.length];
                    for (int i = 0; i < questionIds.length; i++) {
                        entityIds[i] = new CmsUserSurveyQuestionId(userId, questionIds[i]);
                    }
                    List<CmsUserSurveyQuestion> entityList = service.getEntitys(entityIds);
                    Map<String, CmsUserSurveyQuestion> map = CommonUtils.listToMap(entityList,
                            k -> String.valueOf(k.getId().getQuestionId()), null, entity -> site.getId() == entity.getSiteId());
                    handler.put("map", map).render();
                }
            }
        } else if (null != questionId) {
            Long[] userIds = handler.getLongArray("userIds");
            if (CommonUtils.notEmpty(userIds)) {
                CmsUserSurveyQuestionId[] entityIds = new CmsUserSurveyQuestionId[userIds.length];
                for (int i = 0; i < userIds.length; i++) {
                    entityIds[i] = new CmsUserSurveyQuestionId(userIds[i], questionId);
                }
                List<CmsUserSurveyQuestion> entityList = service.getEntitys(entityIds);
                Map<String, CmsUserSurveyQuestion> map = CommonUtils.listToMap(entityList,
                        k -> String.valueOf(k.getId().getUserId()), null, entity -> site.getId() == entity.getSiteId());
                handler.put("map", map).render();
            }
        }
    }

    @Override
    public boolean needAppToken() {
        return true;
    }

    @Resource
    private CmsUserSurveyQuestionService service;

}
