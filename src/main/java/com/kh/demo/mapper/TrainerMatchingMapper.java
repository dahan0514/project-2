package com.kh.demo.mapper;

import com.kh.demo.domain.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TrainerMatchingMapper {
    int insertBoard(TrainerMatchingBoardDTO board);

    List<TrainerMatchingBoardDTO> getList(Criteria cri);


    Long getLastNum(String trainerId);

   void updateViewCount(Long boardNum);

    List<TrainerMatchingBoardDTO> boardView(Long boardNum);

    boolean getUserByIdBoolean(String trainerNickname);

    boolean getTrainerByIdBoolean(String trainerNickname);

    UserDTO getUserById(String trainerNickname);

    TrainerDTO getTrainerById(String trainerNickname);

    TrainerMatchingBoardDTO getBoardBytrainerId(String trainerId);

    void saveMatching(UTMatchingDTO newMatching);

    UTMatchingDTO getutBytrainerId(String trainerId);

    List<TrainerMatchingBoardDTO> getMachingSearchList(String keyword);

    void saveMessage(MessageDTO newMessage);


    SubscribeDTO getcheckSubs(SubscribeDTO newSubscribe);

    SubscribeDTO getinsertSubs(SubscribeDTO newSubscribe);

    SubscribeDTO getdeleteSubs(SubscribeDTO newSubscribe);

    List<TrainerMatchingBoardDTO> get12matchingSearchList(Criteria cri);

    Long getmatchingTotal(Criteria cri);

    TrainerMatchingBoardDTO findByNum(Long boardNum);

    int deleteBoard(Long boardNum);

 int updateBoard(TrainerMatchingBoardDTO board);

 Long getTotal(Criteria cri);
}
