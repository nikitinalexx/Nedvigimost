package com.nedvigimost.services.impl;

import com.nedvigimost.dao.interfaces.IPhotoDAO;
import com.nedvigimost.services.interfaces.IPhotoService;
import com.nedvigimost.vo.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Alexis on 20.03.2016.
 */
@Transactional
public class PhotoService implements IPhotoService {
    @Autowired
    private IPhotoDAO photoDAO;

    public Photo getById(int id) {
        return photoDAO.getPhotoById(id);
    }

    public void addPhoto(Photo photo) {
        photoDAO.addPhoto(photo);
    }

    public void editPhoto(Photo photo) {
        photoDAO.savePhoto(photo);
    }

    public void removePhoto(Photo photo) {
        photoDAO.removePhoto(photo);
    }
}
