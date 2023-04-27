package com.UST.InterviewFeedback.service;

import com.UST.InterviewFeedback.entity.InterviewFeedback;

public interface InterviewFeedbackService extends GenericService<InterviewFeedback, Long> {
    InterviewFeedback update(InterviewFeedback entity, Long id);

    InterviewFeedback update(InterviewFeedback entity, long id);
}