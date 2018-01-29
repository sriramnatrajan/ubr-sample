package com.emergency.ambulence.historyRecyclerView;

/**
 * Created by windev on 1/29/2018.
 */

public class Feedback {
    String feedbackID;
    String feedbackText;
    public Feedback() {
    }

    public Feedback(String feedbackID, String feedbackText) {
        this.feedbackID = feedbackID;
        this.feedbackText = feedbackText;
    }

    public String getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(String feedbackID) {
        this.feedbackID = feedbackID;
    }

    public String getFeedbackText() {
        return feedbackText;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }
}
