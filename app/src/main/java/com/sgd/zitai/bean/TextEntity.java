package com.sgd.zitai.bean;

import java.io.Serializable;
import java.util.List;

public class TextEntity implements Serializable{


    public TextEntity() {
    }

    private int code;
    private String msg;
    private List<Text> data;

    private class Text implements Serializable{

        /**
         * id : 1
         * userId : 1
         * title : asfa
         * content : 的啊发生的
         * likeNum : 222
         * shareNum : 444
         * comments : 阿德
         * readNum : 555
         * uploadTime : 萨达
         */

        private int id;
        private int userId;
        private String title;
        private String content;
        private int likeNum;
        private int shareNum;
        private String comments;
        private int readNum;
        private String uploadTime;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getLikeNum() {
            return likeNum;
        }

        public void setLikeNum(int likeNum) {
            this.likeNum = likeNum;
        }

        public int getShareNum() {
            return shareNum;
        }

        public void setShareNum(int shareNum) {
            this.shareNum = shareNum;
        }

        public String getComments() {
            return comments;
        }

        public void setComments(String comments) {
            this.comments = comments;
        }

        public int getReadNum() {
            return readNum;
        }

        public void setReadNum(int readNum) {
            this.readNum = readNum;
        }

        public String getUploadTime() {
            return uploadTime;
        }

        public void setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
        }
    }

}
