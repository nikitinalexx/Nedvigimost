package com.nedvigimost.services.interfaces;

import com.nedvigimost.vo.Photo;

/**
 * Created by Алексей on 14.02.2016.
 */
public interface PhotoServiceInterface {
    public Photo getById(int id);
    public Photo addPhoto(Photo photo);
    public void editPhoto(Photo photo);
    public void removePhoto(Photo photo);
}
