package com.nedvigimost;

/**
 * Created by ������� on 07.02.2016.
 */
public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}

