package top.apricityoba.forum.mapper;

import top.apricityoba.forum.dto.NewsQueryDTO;
import top.apricityoba.forum.model.News;

import java.util.List;

public interface NewsExtMapper {
    int incView(News record);
    Integer countBySearch(NewsQueryDTO newsQueryDTO);
    List<News> selectBySearch(NewsQueryDTO newsQueryDTO);

}
