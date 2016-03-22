package com.nedvigimost.dao.interfaces;

import com.nedvigimost.vo.Person;
import com.nedvigimost.vo.Photo;

/**
 * Created by Alexis on 20.03.2016.
 */
public interface IPhotoDAO {
    public void addPhoto(Photo photo);
    public Photo getPhotoById(int id);
    public void savePhoto(Photo photo);
    public void removePhoto(Photo photo);
}
