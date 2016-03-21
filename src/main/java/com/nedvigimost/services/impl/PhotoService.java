package com.nedvigimost.services.impl;

import com.nedvigimost.dao.interfaces.IBuildingDAO;
import com.nedvigimost.dao.interfaces.IPhotoDAO;
import com.nedvigimost.services.interfaces.PhotoServiceInterface;
import com.nedvigimost.vo.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Alexis on 20.03.2016.
 */
@Transactional
public class PhotoService implements PhotoServiceInterface {
    @Autowired
    private IPhotoDAO photoDAO;

    public Photo getById(int id) {
        return null;
    }

    public Photo addPhoto(Photo photo) {
        return null;
    }

    public void editPhoto(Photo photo) {

    }

    public void removePhoto(Photo photo) {

    }
}
