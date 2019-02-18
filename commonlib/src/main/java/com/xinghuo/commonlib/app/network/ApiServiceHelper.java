package com.xinghuo.commonlib.app.network;

import com.google.gson.Gson;
import com.jess.xinghuo.di.scope.AppScope;
import com.jess.xinghuo.integration.RepositoryManager;


import javax.inject.Inject;

import okhttp3.RequestBody;

/**
 * @author greensun
 * @date 2018/8/31
 * @desc
 */

@AppScope
public class ApiServiceHelper {

    private CommonApiService mApi;
    private boolean isUpload;

    @Inject
    public ApiServiceHelper(RepositoryManager manager) {
        mApi = manager.obtainRetrofitService(CommonApiService.class);
    }

    private RequestBody getRequestBody(Object obj) {
        String route = new Gson().toJson(obj);
        RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), route);
//        RequestBody requestFile =  RequestBody.create(MediaType.parse("image/jpg"), mFile);
        return body;
    }

    //    //获取版本升级
//    public Observable<UpVersionRespose> upVersion(String policeno, String versionName, String softwareId) {
//        return mApi.upVersion(getRequestBody(new UpVersionRequest(policeno, versionName, softwareId)));
//    }
//
//    //登录
//    public Observable<LoginResponse> login(String policeno) {
//        return mApi.login(getRequestBody(new LoginRequest(policeno)));
//    }
//
//    //获取配置
//    public Observable<ConfigResponse> getServiceConfig(String id) {
//        return mApi.getServiceConfig(getRequestBody(new ConfigRequest(id)));
//    }
//
//    /**
//     * 列表
//     */
//
//    //获取排列方式
//    public Observable<ListSortResp> getListSort(ListReq req) {
//        return mApi.getListSort(getRequestBody(req));
//    }
//
//    //获取列表数据
//    public Observable<ListResp> getListData(ListReq req) {
//        return mApi.getListData(getRequestBody(req));
//    }
//
//    //获取列表数据
//    public Observable<ListLabelResp> getLableData(ListReq req) {
//        return mApi.getLabelData(getRequestBody(req));
//    }
//
//    //获取列表搜索数据
//    public Observable<ListResp> getListSearchData(String keyword, int pageNo, String platformId, int numSort) {
//        ListReq req = new ListReq();
//        req.setKeyword(keyword);
//        req.setPageno(pageNo);
//        req.setPlatformid(platformId);
//        req.setContainGroup(0);
//        req.setNumSort(numSort);
//        return mApi.getListData(getRequestBody(req));
//    }
//
//    // 我的主题
//    public Observable<ThemeResp> getThemeList() {
//        return mApi.getThemeList(getRequestBody(new ThemeReq()));
//    }
//
//
//    /**
//     * 频道
//     */
//
//    //获取标签数据
//    public Observable<ChannelLabelRespose> getChannelLabel() {
//        return mApi.getChannelLabel(getRequestBody(new ChannelLabelRequest(UserCache.getUserId())));
//    }
//
//    //获取热门镜头
//    public Observable<ListResp> getChannelHot() {
//        return mApi.getChannelHot(getRequestBody(new ChannelHotRequest(UserCache.getUserId())));
//    }
//
//
//    //获取二级标签镜头数据
//    public Observable<ListResp> getLabelDetail(String platformid, int pageno, int pagesize, String labelids) {
//
//        int iNetType = 0;
//        if (AppConst.b_type) {
//            iNetType = 1;
//        }
//
//
//        return mApi.getLabelDetail(getRequestBody(
//                new LabelDetailRequest(UserCache.getUserId(), platformid, pageno, pagesize, labelids, 0, 0, 0, 1, iNetType)));
//    }
//
//    //获取二级标签
//    public Observable<SecondLabelRespose> getLabel(String labelids) {
//        return mApi.getLabel(getRequestBody(new SecondLabelRequest(UserCache.getUserId(), labelids)));
//    }
//
//    //获取搜索结果
//    public Observable<ListResp> getSearchDetailData(int pageno, int pagesize, String keyword, int numSort) {
//        int iNetType = 0;
//        if (AppConst.b_type) {
//            iNetType = 1;
//        }
//
//
//        return mApi.getSearchDetailData(getRequestBody(new ChannelSearchRequest
//                (pageno, pagesize, keyword, UserCache.getUserId(), "", 0, 0, 0, 1, 0, iNetType, numSort)));
//    }
//
//    //获取三级联动
//    public Observable<ChannelThirdRemoveResponse> getThirdRemoveData(String platformid, int pageno, int pagesize, String labelids) {
//
//        int iNetType = 0;
//        if (AppConst.b_type) {
//            iNetType = 1;
//        }
//
//
//        return mApi.getThirdRemoveData(getRequestBody(
//                new LabelDetailRequest(UserCache.getUserId(), platformid, pageno, pagesize, labelids, 0, 0, 0, 1, iNetType)));
//    }
//
//
//    //获取故障类型
//    public Observable<TroubleTypeRespose> getTroubleType() {
//        return mApi.getTroubleType();
//    }
//
//    //添加故障
//    public Observable<ReportRespose> getReportData(String devicename, String devicecode, String deviceid, String failaddress, String failtype, String faillevel, String description) {
//
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String mCurrentData = df.format(new Date());
//        return mApi.getReport(getRequestBody(
//                new ReportRequest(mCurrentData, UserCache.getUserId(), devicename, devicecode, deviceid, failaddress, failtype, faillevel, description, 0)));
//    }
//
//    //镜头收藏
//    public Observable<CameraCollectRespose> getCameraCollectData(String camerdid, boolean flag) {
//        return mApi.getCameraCollectData(getRequestBody(new CamerCollectRequest(UserCache.getUserId(), camerdid, flag)));
//    }
//
//
//    /**
//     * 地图
//     */
//    public Observable<MapMarkRespose> getCameraIsNullData(String camerdid) {
//        return mApi.getCameraIsNullData(getRequestBody(new MapMarkRequest(UserCache.getUserId(), camerdid)));
//    }
//
//    //核实
//    public Observable<CheckRespose> getCheckData(String applyuserid, String cameraid, String changecol, String remarks, String content) {
//        return mApi.getCheckData(getRequestBody(new CheckRequest(applyuserid, cameraid, changecol, remarks, content)));
//    }
//
//    /**
//     * 案件
//     */
//    //获取最新案件
//    public Observable<NewsCaseResponse> getNewsCase(int curPage, int pageSize) {
//        int iNetType = 0;
//        if (AppConst.b_type) {
//            iNetType = 1;
//        }
//        return mApi.getNewsCase(getRequestBody(new NewsCaseRequest("2", UserCache.getUserId(), UserCache.getUserOrgid(), curPage, pageSize, iNetType)));
//    }
//
//    //获取动态案件
//    public Observable<DynamicCaseResponse> getDynamicCase(int curPage, int pageSize) {
//        int iNetType = 0;
//        if (AppConst.b_type) {
//            iNetType = 1;
//        }
//        return mApi.getDynamicCase(getRequestBody(new DynamicCaseRequest(UserCache.getUserId(), curPage, pageSize, iNetType)));
//    }
//
//    //获取分类案件
//    public Observable<ClassifyCaseResponse> getClassifyCase(String asjfl, String ab, String ajstate, String userOrgan, String uploadTime,
//                                                            int curPage, int pageSize) {
//        int iNetType = 0;
//        if (AppConst.b_type) {
//            iNetType = 1;
//        }
//        return mApi.getClassifyCase(getRequestBody(new ClassifyCaseRequest(asjfl, ab, ajstate, userOrgan, uploadTime, curPage, pageSize, iNetType)));
//    }
//
//    //获取分类案件--筛选条件
//    public Observable<ClassifyCaseFilterConditionResponse> getClassifyCaseFilterCondition() {
//        int iNetType = 0;
//        if (AppConst.b_type) {
//            iNetType = 1;
//        }
//        return mApi.getClassifyCaseFilterCondition(getRequestBody(new ClassifyCaseFilterConditionRequest(iNetType)));
//    }
//
//    //案件--动态详情
//    public Observable<DynamicDetailResponse> getDynamicDetail(int infoid) {
//        int iNetType = 0;
//        if (AppConst.b_type) {
//            iNetType = 1;
//        }
//        return mApi.getDynamicDetail(getRequestBody(new DynamicDetailRequest(infoid, iNetType)));
//    }
//
//    //案件-- 获取视频跟图片
//
//    public Observable<CaseMediaRespose> getCaseMediaData(String caseid) {
//        int iNetType = 0;
//        if (AppConst.b_type) {
//            iNetType = 1;
//        }
//        return mApi.getMediaByCaseId(getRequestBody(new CaseMediaRequest(UserCache.getUserIdNum(), caseid, iNetType)));
//    }
//
//    //案件-- 获取视频跟图片 下的 人车物信息
//
//    public Observable<CaseMessageRespose> getCaseMessageData(String id) {
//        int iNetType = 0;
//        if (AppConst.b_type) {
//            iNetType = 1;
//        }
//        return mApi.getPCAInfoByMediaId(getRequestBody(new CaseMessageRequest(id, iNetType)));
//    }
//
//    //案件-- 获取当前案件的具体详情
//
//    public Observable<CaseAboutRespose> getCaseAboutData(String caseid) {
//        int iNetType = 0;
//        if (AppConst.b_type) {
//            iNetType = 1;
//        }
//        return mApi.getCaseInfoDetail(getRequestBody(new CaseAboutRequest(UserCache.getUserIdNum(), caseid, iNetType)));
//    }
//
//    //案件-- 收藏跟取消收藏
//
//    public Observable<CaseCollectRespose> addCaseCollectData(String type, String caseid) {
//        int iNetType = 0;
//        if (AppConst.b_type) {
//            iNetType = 1;
//        }
//        return mApi.addOrdelCollect(getRequestBody(new CaseCollectRequest(type, UserCache.getUserIdNum(), caseid, iNetType)));
//    }
//
//    /**
//     * 案件搜索
//     *
//     * @param keyword
//     * @param pageNo
//     * @param pageSize
//     * @return
//     */
//    public Observable<CaseSearchResp> getCaseSearchData(String keyword, int pageNo, int pageSize) {
//
//        return mApi.getCaseSearchData(getRequestBody(new CaseSearchReq(keyword, pageNo, pageSize)));
//    }
//
//
//    /**
//     * 我的
//     */
//
//    //获取镜头收藏
//    public Observable<MineCameraCollectRespose> getMineCameraCollect() {
//        return mApi.getMineCameraCollect(getRequestBody(new MineCameraCollectRequest(UserCache.getUserId(), 1, 1000)));
//    }
//
//
//    //获取案件收藏
//    public Observable<MineCaseCollectRespose> getMineCaseCollect() {
//
//        int iNetType = 0;
//        if (AppConst.b_type) {
//            iNetType = 1;
//        }
//
//        return mApi.getMineCaseCollect(getRequestBody(new MineCaseCollectRequest(UserCache.getUserIdNum(), 1, 1000, iNetType)));
//    }
//
//
//    //用户头像保存
//    public Observable<UserIconRespose> saveUserIconData(String icon) {
//        return mApi.saveUserIconData(getRequestBody(new UserIconRequest(UserCache.getUserId(), icon)));
//    }
//
//    public Observable<DeleteCommentResponse> deleteComment(String commentId) {
//
////        return mApi.deleteComment(UserCache.getUserId(),commentId);
//        return mApi.deleteComment(getRequestBody(new DeleteComment(UserCache.getUserId(), commentId)));
//    }
//
//    public Observable<DeleteCommentResponse> addcommentLikes(String commentId) {
//
//        return mApi.addcommentLikes(UserCache.getUserId(), commentId);
//    }
//
//    public Observable<DeleteCommentResponse> addComment(String mCameraid, String replyId, String content, String toUser, String image, String subImage) {
//        if ("".equals(image) || "".equals(subImage)) {
//
//            AddCommentBean addCommentBean = new AddCommentBean
//                    (mCameraid, UserCache.getUserId(), UserCache.getName()
//                            , replyId, content, toUser, "",
//                            "214ss4sc185etdd", "HUAWEI_MATE_10");
//            Log.e("addCommentParmes", "addComment: " + addCommentBean.toString());
//            return mApi.addComment(getRequestBody(addCommentBean));
//        }
//        return mApi.addComment(getRequestBody(new AddCommentBean
//                (mCameraid, UserCache.getUserId(), UserCache.getName()
//                        , replyId, content, toUser, "", image, subImage,
//                        "214ss4sc185etdd", "HUAWEI_MATE_10")));
////        return mApi.addComment(mCameraid,UserCache.getUserId(),UserCache.getName(),replyId,content,toUser,image,subImage,AndroidUtil.getUUID(App.getContext()),"HUAWEI_MATE_9");
//    }
//
//    public Observable<CircleItem> getComment(String mCameraid) {
//        int iNetType = 0;
//        if (AppConst.b_type) {
//            iNetType = 1;
//        }
//        return mApi.getComment(mCameraid, 0, 100, iNetType);
//    }
//
//
//    //获取上传记录
//    public Observable<UpLoadRespose> getUpLoadData() {
//
//        int iNetType = 0;
//        if (AppConst.b_type) {
//            iNetType = 1;
//        }
//        return mApi.getUpLoadData(getRequestBody(new UpLoadRequest(UserCache.getUserId(), 1, 1000, iNetType)));
//    }
//
//    // 获取联系人列表
//    public Observable<ContactResp> getContactList(String pid) {
//        return mApi.getContactList(getRequestBody(new ContactReq(pid)));
//    }
//
//    //镜头是否正常
//    public Observable<CameraIdResponse> checkCameraOk(String url, String cameraId) {
//        return mApi.checkCameraOk(url, getRequestBody(new CameraIdRequest("4", "RightRightRightRight", cameraId)));
//    }
//
//    //镜头是否可以播放
//    public Observable<String> urlStartOrStop(String url, String cameraId, boolean bStart) {
////        return mApi.checkCameraState(bStart?url+"?cmd=live&beg=0&count=0&id=" + cameraId + "&sname=" + cameraId:url+"?cmd=stop&beg=0&count=0&id=0&sname=" + cameraId);
////        return mApi.checkCameraState(url,getRequestBody(new CamStatusRequest(bStart?"live":"stop","0" , "0", bStart?cameraId:"0",cameraId )));
//        return mApi.urlStartOrStopFile(url, bStart ? "live" : "stop", "0", "0", bStart ? cameraId : "0", cameraId);
//    }
//
//    //查验PTZ权限
//    public Observable<PTZPermResponse> checkPTZPerm(String cameraId, String userid) {
//        return mApi.checkPTZPerm(getRequestBody(new PTZPermRequest(cameraId, userid)));
//    }
//
//    //查验是否已收藏
//    public Observable<CameraStarResp> checkCameraStar(String cameraId) {
//        CameraStarReq req = new CameraStarReq(UserCache.getUserId(), cameraId);
//        return mApi.checkCameraStar(getRequestBody(req));
//    }
//
//    public Observable<CameraStarResp> changeCameraStar(String cameraId, boolean flag) {
//        CameraStarReq req = new CameraStarReq(UserCache.getUserId(), cameraId, flag);
//        return mApi.changeCameraStar(getRequestBody(req));
//    }
//
//    //检测缩略图
//    public Observable<Response> checkCameraPreview(String url) {
//        return mApi.checkCameraPreview(url);
//    }
//
//    //设置缩略图
//    public Observable<CamPreviewResponse> setCameraPreview(String cameraId, String userName, String userid, String base64Img) {
//        return mApi.setCameraPreview(getRequestBody(new CamPreviewRequest(cameraId, userName, userid, base64Img)));
//    }
//
//    public Observable<CameraInfoBean> getCameraInfo(String mCameraID, String mUserID) {
//
//        return mApi.getCameraInfo(getRequestBody(new GetCameraInfoBean(mUserID, mCameraID)));
//    }
//

    /**其他*/


//    public Observable<RegisterResponse> register(String nickname, String phone, String password) {
//        return mApi.register(getRequestBody(new LoginRequest(nickname, phone, password)));
//    }
//
//    public Observable<DeviceUpdataRespose> updataDevice(int userId, double lon, double lat) {
//        return mApi.updataDecicestatus(getRequestBody(new DeviceUpdataRequest(userId, lon, lat)));
//    }
//
//    public Observable<DeviceUpdataRespose> updataDevicepushurl(int userId, String url) {
//        return mApi.updataDecicestatus(getRequestBody(new DeviceUpdataRequest(userId, url)));
//    }
//
////    public Observable<DeviceUpdataRespose> getGlassPushurl(int userId){
////        return mApi.updataDecicestatus(getRequestBody(new DeviceUpdataRequest(userId)));
////    }
//
//    public Observable<CreatLiveResponse> creatlive(String url, int userid) {
//        return mApi.creatlive(getRequestBody(new CreatliveRequest(url, userid)));
//    }
//
//
//    public Observable<CreatLiveResponse> getLiveByuserId(int userid) {
//        return mApi.creatlive(getRequestBody(new CreatliveRequest(userid)));
//    }
//
//
//    public Observable<DownLoadRespose> getAllDownLoad(int userid) {
//        return mApi.getAllDownLoad(getRequestBody(new DownLoadRequest(userid)));
//    }
//
//    public Observable<UpdataLoadRespose> updateDownLoad(String isDown, Long id, int userid, String select) {
//        return mApi.updateDownLoad(getRequestBody(new UpdataLoadRequest(isDown, id, userid, select)));
//    }
//
//
//    public Observable<PersonRespose> getPersonData(String uuid, int libraryId) {
//        return mApi.getPersonData(getRequestBody(new PersonRequest(uuid, libraryId)));
//    }
//
//    public Observable<DownStateRespose> cleanIsDown(int userId) {
//        return mApi.cleanIsDown(getRequestBody(new DownStateRequert(userId)));
//    }
//
//    public Observable<SavePersonRespose> savePresonData
//            (String deviceSerial, String facePicture, String faceUuid, int librarydId, String picture, int userId, float score, int flag) {
//        SavePersonRequest req = new SavePersonRequest(deviceSerial, facePicture, faceUuid, librarydId, picture, userId, score);
//        if (flag == 1){
//            req.setCaptrueFlag(1);
//        }else if (flag == 2){
//            req.setQueryFlag(1);
//        }
//        return mApi.savePresonData(getRequestBody(req));
//    }
//
//    public Observable<PersonHistoryRespose> getHistoryPresonData(int userId) {
//        return mApi.getHistoryPresonData(getRequestBody(new PersonHistoryRequest(userId)));
//    }
//
//
//    public Observable<SavePersonRespose> sendLocalDataForService(FeatureInfo infoItem) {
//        return mApi.sendLocalDataForService(getRequestBody(infoItem));
//    }
//
//    /*public Observable<SavePersonRespose> uploadPicture(Map<String, RequestBody> partmap) {
//        return mApi.uploadPicture(partmap);
//    }*/
//
//    public Observable<UploadCollectRsp> uploadCollect(UploadCollectReq req) {
//        return mApi.upLoadCollect(getRequestBody(req));
//    }
//


}
