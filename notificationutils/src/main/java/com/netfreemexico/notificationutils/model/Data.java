/*
 * Created by OCristian Gonzalez on 02/12/23 17:40
 *  Copyright (c) NetFreeMexico 2023 . All rights reserved.
 */

package com.netfreemexico.notificationutils.model;

public class Data {
    private String title;
    private String message;
    private String color;
    private boolean isPressed;
    private boolean showActionOne;
    private boolean showActionTwo;
    private String actionOneName;
    private String actionOneUrl;
    private String actionTwoName;
    private String actionTwoUrl;
    private String imageMUrl;
    private String imageLUrl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPressed() {
        return isPressed;
    }

    public void setPressed(boolean pressed) {
        isPressed = pressed;
    }

    public boolean isShowActionOne() {
        return showActionOne;
    }

    public void setShowActionOne(boolean showActionOne) {
        this.showActionOne = showActionOne;
    }

    public boolean isShowActionTwo() {
        return showActionTwo;
    }

    public void setShowActionTwo(boolean showActionTwo) {
        this.showActionTwo = showActionTwo;
    }

    public String getActionOneName() {
        return actionOneName;
    }

    public void setActionOneName(String actionOneName) {
        this.actionOneName = actionOneName;
    }

    public String getActionOneUrl() {
        return actionOneUrl;
    }

    public void setActionOneUrl(String actionOneUrl) {
        this.actionOneUrl = actionOneUrl;
    }

    public String getActionTwoName() {
        return actionTwoName;
    }

    public void setActionTwoName(String actionTwoName) {
        this.actionTwoName = actionTwoName;
    }

    public String getActionTwoUrl() {
        return actionTwoUrl;
    }

    public void setActionTwoUrl(String actionTwoUrl) {
        this.actionTwoUrl = actionTwoUrl;
    }

    public String getImageMUrl() {
        return imageMUrl;
    }

    public void setImageMUrl(String imageMUrl) {
        this.imageMUrl = imageMUrl;
    }

    public String getImageLUrl() {
        return imageLUrl;
    }

    public void setImageLUrl(String imageLUrl) {
        this.imageLUrl = imageLUrl;
    }
}
