package com.nedvigimost.services.impl;

import com.nedvigimost.services.interfaces.PhotoServiceInterface;
import com.nedvigimost.vo.Photo;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Alexis on 20.03.2016.
 */
@Transactional
public class PhotoService implements PhotoServiceInterface {
    @Override
    public Photo getById(int id) {
        return null;
    }

    @Override
    public Photo addPhoto(Photo photo) {
        return null;
    }

    @Override
    public void editPhoto(Photo photo) {

    }

    @Override
    public void removePhoto(Photo photo) {

    }
}
