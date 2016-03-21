package com.nedvigimost.services.impl;

import com.nedvigimost.dao.interfaces.IBuildingDAO;
import com.nedvigimost.dao.interfaces.IStatisticsDAO;
import com.nedvigimost.services.interfaces.StatisticsServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Alexis on 20.03.2016.
 */
@Transactional
public class StatisticsService implements StatisticsServiceInterface {
    @Autowired
    private IStatisticsDAO statisticsDAO;
}
