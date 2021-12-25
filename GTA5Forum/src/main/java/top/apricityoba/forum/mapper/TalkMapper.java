package top.apricityoba.forum.mapper;

import top.apricityoba.forum.model.Talk;
import top.apricityoba.forum.model.TalkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TalkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talk
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    long countByExample(TalkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talk
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    int deleteByExample(TalkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talk
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talk
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    int insert(Talk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talk
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    int insertSelective(Talk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talk
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    List<Talk> selectByExampleWithRowbounds(TalkExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talk
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    List<Talk> selectByExample(TalkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talk
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    Talk selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talk
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    int updateByExampleSelective(@Param("record") Talk record, @Param("example") TalkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talk
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    int updateByExample(@Param("record") Talk record, @Param("example") TalkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talk
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    int updateByPrimaryKeySelective(Talk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talk
     *
     * @mbg.generated Wed Sep 23 18:14:48 CST 2020
     */
    int updateByPrimaryKey(Talk record);
}