package com.nedvigimost.services.interfaces;

import com.nedvigimost.vo.Photo;

/**
 * Created by ������� on 14.02.2016.
 */
public interface IPhotoService {
    public Photo getById(int id);
    public Photo addPhoto(Photo photo);
    public void editPhoto(Photo photo);
    public void removePhoto(Photo photo);
}
