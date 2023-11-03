package com.kh.demo.mapper;

import com.kh.demo.domain.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMyPageMapper {
//    Report
    List<ReportDTO> getReportList(Criteria cri);

    List<ReportDTO> getReportListByUser(Criteria cri);

    List<ReportDTO> getReportListByTrainer(Criteria cri);

    Long getReportTotal(Criteria cri);

    Long getReportTotalByUser(Criteria cri);

    Long getReportTotalByTrainer(Criteria cri);

    boolean getUserByIdBoolean(String userId);

    boolean getTrainerByIdBoolean(String userId);

    UserDTO getUserById(String userId);

    TrainerDTO getTrainerById(String userId);

//    SignUp
    List<TrainerSignUpDTO> getSignUpList(Criteria cri);

    Long getSignUpTotal(Criteria cri);

//    AdminBoard
    List<BoardDTO> getBoardList(Criteria cri);

    List<BoardDTO> getAdminExerBoardList(Criteria cri);

    List<BoardDTO> getAdminNewsBoardList(Criteria cri);

    List<BoardDTO> getAdminTipBoardList(Criteria cri);

    List<BoardDTO> getAdminRecipeBoardList(Criteria cri);

    Long getBoardTotal(Criteria cri);

    Long getExerBoardTotal(Criteria cri);

    Long getNewsBoardTotal(Criteria cri);

    Long getTipBoardTotal(Criteria cri);

    Long getRecipeBoardTotal(Criteria cri);

//    UserSearch
    TrainerDTO getTrainer(String keyword);

    UserDTO getUser(String keyword);

    List<UserDTO> getUserList(Criteria cri);

    List<TrainerDTO> getTrainerList(Criteria cri);

    Long getUserTotal(Criteria cri);

    Long getTrainerTotal(Criteria cri);

}