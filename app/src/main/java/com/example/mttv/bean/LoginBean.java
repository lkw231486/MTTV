package com.example.mttv.bean;

import java.util.List;

/**
 * @ author: lkw
 * created on:2020/4/24 16:20
 * description:
 * email:lkw@mantoo.com.cn
 */
public class LoginBean {

    /**
     * sort : null
     * pageNum : null
     * pageSize : null
     * userId : null
     * roleId : null
     * userName : admin
     * name : null
     * doUse : null
     * userType : null
     * loginTime : null
     * mobile : null
     * sex : null
     * password : null
     * email : null
     * receiveWarning : null
     * userImgUrl : null
     * openId : null
     * deleteFlag : null
     * createBy : null
     * createDate : null
     * updateBy : null
     * updateDate : null
     * remark : null
     * menuList : [{"sort":null,"pageNum":null,"pageSize":null,"menuId":"01","parentId":"50","parentIds":"0,50,","name":"用户中心","type":1,"href":"/userCenter","target":"","icon":"el-icon-user","isShow":1,"tabMenuList":[{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0101","parentId":"01","parentIds":"0,50,01,","name":"用户管理","type":2,"href":"/userControl","target":"","icon":"el-icon-user","isShow":1,"permissionList":[]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0102","parentId":"01","parentIds":"0,50,01,","name":"角色管理","type":2,"href":"/roleControl","target":"","icon":"el-icon-user","isShow":1,"permissionList":[]}]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"02","parentId":"50","parentIds":"0,50,","name":"项目管理","type":1,"href":"/project/projectControl","target":"","icon":"el-icon-s-management\r\n","isShow":1,"tabMenuList":[{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0201","parentId":"02","parentIds":"0,50,02,","name":"项目管理","type":2,"href":"/project/projectControl","target":"","icon":"el-icon-s-management\r\n","isShow":1,"permissionList":[]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0202","parentId":"02","parentIds":"0,50,02,","name":"项目监控","type":2,"href":"/project/projectMonitor","target":"","icon":"el-icon-s-management\r\n","isShow":1,"permissionList":[]}]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"03","parentId":"50","parentIds":"0,50,","name":"设备管理","type":1,"href":"","target":"","icon":"el-icon-monitor","isShow":1,"tabMenuList":[{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0301","parentId":"03","parentIds":"0,50,03,","name":"网关管理","type":2,"href":"/equipmentManagement/gatewayManagement","target":"","icon":"el-icon-monitor","isShow":1,"permissionList":[]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0302","parentId":"03","parentIds":"0,50,03,","name":"传感器管理","type":2,"href":"/equipmentManagement/sensorControl","target":"","icon":"el-icon-monitor","isShow":1,"permissionList":[]}]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"04","parentId":"50","parentIds":"0,50,","name":"参数管理","type":1,"href":"","target":"","icon":"el-icon-document","isShow":1,"tabMenuList":[{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0401","parentId":"04","parentIds":"0,50,04,","name":"协议管理","type":2,"href":"/parameterControl/protocolControl","target":"","icon":"el-icon-document","isShow":1,"permissionList":[]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0402","parentId":"04","parentIds":"0,50,04,","name":"算法管理","type":2,"href":"/parameterControl/arithmeticControl","target":null,"icon":"el-icon-document","isShow":1,"permissionList":[]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0403","parentId":"04","parentIds":"0,50,04,","name":"监测因素管理","type":2,"href":"/parameterControl/elementControl","target":null,"icon":"el-icon-document","isShow":1,"permissionList":[]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0404","parentId":"04","parentIds":"0,50,04,","name":"变量管理","type":2,"href":"/parameterControl/variableControl","target":null,"icon":"el-icon-document","isShow":1,"permissionList":[]}]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"06","parentId":"50","parentIds":"0,50,","name":"统计分析","type":1,"href":"","target":"","icon":"el-icon-pie-chart","isShow":1,"tabMenuList":[{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0601","parentId":"06","parentIds":"0,50,06,","name":"原始测值分析","type":2,"href":"/statisticAnalysis/originalAnalyze","target":null,"icon":"el-icon-pie-chart","isShow":1,"permissionList":[]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0602","parentId":"06","parentIds":"0,50,06,","name":"变量分析","type":2,"href":null,"target":null,"icon":"el-icon-pie-chart","isShow":1,"permissionList":[]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0603","parentId":"06","parentIds":"0,50,06,","name":"变量分组管理","type":2,"href":null,"target":null,"icon":"el-icon-pie-chart","isShow":1,"permissionList":[]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0604","parentId":"06","parentIds":"0,50,06,","name":"变量分组分析","type":2,"href":null,"target":null,"icon":"el-icon-pie-chart","isShow":1,"permissionList":[]}]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"07","parentId":"50","parentIds":"0,50,","name":"实时数据","type":1,"href":null,"target":null,"icon":"el-icon-s-data","isShow":1,"tabMenuList":[{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0701","parentId":"07","parentIds":"0,50,07,","name":"测值实时数据","type":2,"href":"/realTimeData/measurementValue","target":null,"icon":"el-icon-s-data","isShow":1,"permissionList":[]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0702","parentId":"07","parentIds":"0,50,07,","name":"变量实时数据","type":2,"href":"/realTimeData/measurementValue","target":null,"icon":"el-icon-s-data","isShow":1,"permissionList":[]}]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"05","parentId":"50","parentIds":"0,50,","name":"报警管理","type":1,"href":"","target":"","icon":"el-icon-bell","isShow":1,"tabMenuList":[{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0501","parentId":"05","parentIds":"0,50,05,","name":"传感器报警","type":2,"href":"/alarmControl/sensorAlarm","target":"","icon":"el-icon-bell","isShow":1,"permissionList":[]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0502","parentId":"05","parentIds":"0,50,05,","name":"网关报警","type":2,"href":"","target":"","icon":"el-icon-bell","isShow":1,"permissionList":[]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0503","parentId":"05","parentIds":"0,50,05,","name":"设备年限报警","type":2,"href":"","target":"","icon":"el-icon-bell","isShow":1,"permissionList":[]}]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"08","parentId":"50","parentIds":"0,50,","name":"视频监控","type":1,"href":null,"target":null,"icon":"el-icon-video-camera","isShow":1,"tabMenuList":[{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0801","parentId":"08","parentIds":"0,50,08,","name":"摄像头管理","type":2,"href":null,"target":null,"icon":"el-icon-video-camera","isShow":1,"permissionList":[]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0802","parentId":"08","parentIds":"0,50,08,","name":"实况直播","type":2,"href":null,"target":null,"icon":"el-icon-video-camera","isShow":1,"permissionList":[]}]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"09","parentId":"50","parentIds":"0,50,","name":"组态管理","type":1,"href":null,"target":null,"icon":"el-icon-set-up","isShow":1,"tabMenuList":[{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0901","parentId":"09","parentIds":"0,50,09,","name":"组态管理","type":2,"href":null,"target":null,"icon":"el-icon-set-up","isShow":1,"permissionList":[]}]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"10","parentId":"50","parentIds":"0,50,","name":"数据看板","type":1,"href":null,"target":null,"icon":"el-icon-data-line","isShow":1,"tabMenuList":[{"sort":null,"pageNum":null,"pageSize":null,"menuId":"1001","parentId":"10","parentIds":"0,50,10,","name":"数据看板1","type":2,"href":null,"target":null,"icon":"el-icon-data-line","isShow":1,"permissionList":[]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"1002","parentId":"10","parentIds":"0,50,10,","name":"数据看板2","type":2,"href":null,"target":null,"icon":"el-icon-data-line","isShow":1,"permissionList":[]}]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"11","parentId":"50","parentIds":"0,50,","name":"系统设置","type":1,"href":null,"target":null,"icon":"el-icon-setting","isShow":1,"tabMenuList":[{"sort":null,"pageNum":null,"pageSize":null,"menuId":"1101","parentId":"11","parentIds":"0,50,11,","name":"系统设置","type":2,"href":null,"target":null,"icon":"el-icon-setting","isShow":1,"permissionList":[]}]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"12","parentId":"50","parentIds":"0,50,","name":"漫途协议库","type":1,"href":null,"target":null,"icon":"el-icon-folder-opened","isShow":1,"tabMenuList":[{"sort":null,"pageNum":null,"pageSize":null,"menuId":"1201","parentId":"12","parentIds":"0,50,12,","name":"网关协议库","type":2,"href":null,"target":null,"icon":"el-icon-folder-opened","isShow":1,"permissionList":[]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"1202","parentId":"12","parentIds":"0,50,12,","name":"传感器协议库","type":2,"href":null,"target":null,"icon":"el-icon-folder-opened","isShow":1,"permissionList":[]}]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"13","parentId":"50","parentIds":"0,50,","name":"模板管理","type":1,"href":null,"target":null,"icon":"el-icon-document-copy","isShow":1,"tabMenuList":[{"sort":null,"pageNum":null,"pageSize":null,"menuId":"1301","parentId":"13","parentIds":"0,50,13,","name":"现场模板","type":2,"href":null,"target":null,"icon":"el-icon-document-copy","isShow":1,"permissionList":[]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"1302","parentId":"13","parentIds":"0,50,13,","name":"XX模板","type":2,"href":null,"target":null,"icon":"el-icon-document-copy","isShow":1,"permissionList":[]}]}]
     * permissionList : [{"sort":null,"pageNum":null,"pageSize":null,"permissionId":1,"menuId":"0101","permissionName":"新增用户","shiroCode":"user:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":2,"menuId":"0101","permissionName":"编辑用户","shiroCode":"user:update"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":3,"menuId":"0101","permissionName":"删除用户","shiroCode":"user:del"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":4,"menuId":"0101","permissionName":"查看用户列表","shiroCode":"user:list"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":5,"menuId":"0101","permissionName":"重置密码","shiroCode":"user:restPwd"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":6,"menuId":"0101","permissionName":"启用/停用用户","shiroCode":"user:updateDoUse"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":7,"menuId":"0102","permissionName":"查看角色列表","shiroCode":"role:list"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":8,"menuId":"0102","permissionName":"新增角色","shiroCode":"role:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":9,"menuId":"0102","permissionName":"编辑角色","shiroCode":"role:update"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":10,"menuId":"0102","permissionName":"删除角色","shiroCode":"role:del"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":11,"menuId":"0102","permissionName":"权限配置","shiroCode":"role:permissionConf"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":12,"menuId":"0201","permissionName":"查看项目","shiroCode":"project:list"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":14,"menuId":"0201","permissionName":"新增项目","shiroCode":"project:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":13,"menuId":"0202","permissionName":"项目监控","shiroCode":"project:monitor"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":15,"menuId":"0301","permissionName":"查看网关","shiroCode":"gateway:list"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":17,"menuId":"0302","permissionName":"查看传感器","shiroCode":"sensor:list"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":16,"menuId":"0401","permissionName":"查看协议","shiroCode":"agreement:list"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":21,"menuId":"0402","permissionName":"查询算法","shiroCode":"user:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":22,"menuId":"0403","permissionName":"查看监测因素","shiroCode":"user:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":23,"menuId":"0404","permissionName":"查看变量","shiroCode":"user:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":18,"menuId":"0601","permissionName":"查询测值数据","shiroCode":"measureValue:list"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":29,"menuId":"0601","permissionName":"查看原始测值分析","shiroCode":"user:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":30,"menuId":"0602","permissionName":"查看变量分析","shiroCode":"user:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":31,"menuId":"0603","permissionName":"查看变量分组管理","shiroCode":"user:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":32,"menuId":"0604","permissionName":"查看变量分组分析","shiroCode":"user:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":19,"menuId":"0701","permissionName":"查询测值实时数据","shiroCode":"measureValue:list"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":33,"menuId":"0701","permissionName":"查看测值实时数据","shiroCode":"user:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":34,"menuId":"0702","permissionName":"查看变量实时数据","shiroCode":"user:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":20,"menuId":"0501","permissionName":"查询报警","shiroCode":"warn:list"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":24,"menuId":"0501","permissionName":"查看传感器报警","shiroCode":"user:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":25,"menuId":"0502","permissionName":"查看网关报警","shiroCode":"user:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":26,"menuId":"0503","permissionName":"查看设备年限报警","shiroCode":"user:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":35,"menuId":"0801","permissionName":"查看摄像头管理","shiroCode":"user:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":36,"menuId":"0802","permissionName":"查看实况直播","shiroCode":"user:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":37,"menuId":"0901","permissionName":"查看组态管理","shiroCode":"user:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":38,"menuId":"1001","permissionName":"查看数据看板1","shiroCode":"user:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":39,"menuId":"1002","permissionName":"查看数据看板2","shiroCode":"user:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":40,"menuId":"1101","permissionName":"查看系统设置","shiroCode":"user:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":41,"menuId":"1201","permissionName":"查看网关协议库","shiroCode":"user:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":42,"menuId":"1202","permissionName":"查看传感器协议库","shiroCode":"user:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":43,"menuId":"1301","permissionName":"查看现场模板","shiroCode":"user:add"},{"sort":null,"pageNum":null,"pageSize":null,"permissionId":44,"menuId":"1302","permissionName":"查看XX模板","shiroCode":"user:add"}]
     */

    private Object sort;
    private Object pageNum;
    private Object pageSize;
    private Object userId;
    private Object roleId;
    private String userName;
    private Object name;
    private Object doUse;
    private Object userType;
    private Object loginTime;
    private Object mobile;
    private Object sex;
    private Object password;
    private Object email;
    private Object receiveWarning;
    private Object userImgUrl;
    private Object openId;
    private Object deleteFlag;
    private Object createBy;
    private Object createDate;
    private Object updateBy;
    private Object updateDate;
    private Object remark;
    private List<MenuListBean> menuList;
    private List<PermissionListBean> permissionList;

    public Object getSort() {
        return sort;
    }

    public void setSort(Object sort) {
        this.sort = sort;
    }

    public Object getPageNum() {
        return pageNum;
    }

    public void setPageNum(Object pageNum) {
        this.pageNum = pageNum;
    }

    public Object getPageSize() {
        return pageSize;
    }

    public void setPageSize(Object pageSize) {
        this.pageSize = pageSize;
    }

    public Object getUserId() {
        return userId;
    }

    public void setUserId(Object userId) {
        this.userId = userId;
    }

    public Object getRoleId() {
        return roleId;
    }

    public void setRoleId(Object roleId) {
        this.roleId = roleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getDoUse() {
        return doUse;
    }

    public void setDoUse(Object doUse) {
        this.doUse = doUse;
    }

    public Object getUserType() {
        return userType;
    }

    public void setUserType(Object userType) {
        this.userType = userType;
    }

    public Object getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Object loginTime) {
        this.loginTime = loginTime;
    }

    public Object getMobile() {
        return mobile;
    }

    public void setMobile(Object mobile) {
        this.mobile = mobile;
    }

    public Object getSex() {
        return sex;
    }

    public void setSex(Object sex) {
        this.sex = sex;
    }

    public Object getPassword() {
        return password;
    }

    public void setPassword(Object password) {
        this.password = password;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Object getReceiveWarning() {
        return receiveWarning;
    }

    public void setReceiveWarning(Object receiveWarning) {
        this.receiveWarning = receiveWarning;
    }

    public Object getUserImgUrl() {
        return userImgUrl;
    }

    public void setUserImgUrl(Object userImgUrl) {
        this.userImgUrl = userImgUrl;
    }

    public Object getOpenId() {
        return openId;
    }

    public void setOpenId(Object openId) {
        this.openId = openId;
    }

    public Object getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Object deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Object getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Object createBy) {
        this.createBy = createBy;
    }

    public Object getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Object createDate) {
        this.createDate = createDate;
    }

    public Object getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Object updateBy) {
        this.updateBy = updateBy;
    }

    public Object getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Object updateDate) {
        this.updateDate = updateDate;
    }

    public Object getRemark() {
        return remark;
    }

    public void setRemark(Object remark) {
        this.remark = remark;
    }

    public List<MenuListBean> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<MenuListBean> menuList) {
        this.menuList = menuList;
    }

    public List<PermissionListBean> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<PermissionListBean> permissionList) {
        this.permissionList = permissionList;
    }

    public static class MenuListBean {
        /**
         * sort : null
         * pageNum : null
         * pageSize : null
         * menuId : 01
         * parentId : 50
         * parentIds : 0,50,
         * name : 用户中心
         * type : 1
         * href : /userCenter
         * target :
         * icon : el-icon-user
         * isShow : 1
         * tabMenuList : [{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0101","parentId":"01","parentIds":"0,50,01,","name":"用户管理","type":2,"href":"/userControl","target":"","icon":"el-icon-user","isShow":1,"permissionList":[]},{"sort":null,"pageNum":null,"pageSize":null,"menuId":"0102","parentId":"01","parentIds":"0,50,01,","name":"角色管理","type":2,"href":"/roleControl","target":"","icon":"el-icon-user","isShow":1,"permissionList":[]}]
         */

        private Object sort;
        private Object pageNum;
        private Object pageSize;
        private String menuId;
        private String parentId;
        private String parentIds;
        private String name;
        private int type;
        private String href;
        private String target;
        private String icon;
        private int isShow;
        private List<TabMenuListBean> tabMenuList;

        public Object getSort() {
            return sort;
        }

        public void setSort(Object sort) {
            this.sort = sort;
        }

        public Object getPageNum() {
            return pageNum;
        }

        public void setPageNum(Object pageNum) {
            this.pageNum = pageNum;
        }

        public Object getPageSize() {
            return pageSize;
        }

        public void setPageSize(Object pageSize) {
            this.pageSize = pageSize;
        }

        public String getMenuId() {
            return menuId;
        }

        public void setMenuId(String menuId) {
            this.menuId = menuId;
        }

        public String getParentId() {
            return parentId;
        }

        public void setParentId(String parentId) {
            this.parentId = parentId;
        }

        public String getParentIds() {
            return parentIds;
        }

        public void setParentIds(String parentIds) {
            this.parentIds = parentIds;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public String getTarget() {
            return target;
        }

        public void setTarget(String target) {
            this.target = target;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public int getIsShow() {
            return isShow;
        }

        public void setIsShow(int isShow) {
            this.isShow = isShow;
        }

        public List<TabMenuListBean> getTabMenuList() {
            return tabMenuList;
        }

        public void setTabMenuList(List<TabMenuListBean> tabMenuList) {
            this.tabMenuList = tabMenuList;
        }

        public static class TabMenuListBean {
            /**
             * sort : null
             * pageNum : null
             * pageSize : null
             * menuId : 0101
             * parentId : 01
             * parentIds : 0,50,01,
             * name : 用户管理
             * type : 2
             * href : /userControl
             * target :
             * icon : el-icon-user
             * isShow : 1
             * permissionList : []
             */

            private Object sort;
            private Object pageNum;
            private Object pageSize;
            private String menuId;
            private String parentId;
            private String parentIds;
            private String name;
            private int type;
            private String href;
            private String target;
            private String icon;
            private int isShow;
            private List<?> permissionList;

            public Object getSort() {
                return sort;
            }

            public void setSort(Object sort) {
                this.sort = sort;
            }

            public Object getPageNum() {
                return pageNum;
            }

            public void setPageNum(Object pageNum) {
                this.pageNum = pageNum;
            }

            public Object getPageSize() {
                return pageSize;
            }

            public void setPageSize(Object pageSize) {
                this.pageSize = pageSize;
            }

            public String getMenuId() {
                return menuId;
            }

            public void setMenuId(String menuId) {
                this.menuId = menuId;
            }

            public String getParentId() {
                return parentId;
            }

            public void setParentId(String parentId) {
                this.parentId = parentId;
            }

            public String getParentIds() {
                return parentIds;
            }

            public void setParentIds(String parentIds) {
                this.parentIds = parentIds;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }

            public String getTarget() {
                return target;
            }

            public void setTarget(String target) {
                this.target = target;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public int getIsShow() {
                return isShow;
            }

            public void setIsShow(int isShow) {
                this.isShow = isShow;
            }

            public List<?> getPermissionList() {
                return permissionList;
            }

            public void setPermissionList(List<?> permissionList) {
                this.permissionList = permissionList;
            }
        }
    }

    public static class PermissionListBean {
        /**
         * sort : null
         * pageNum : null
         * pageSize : null
         * permissionId : 1
         * menuId : 0101
         * permissionName : 新增用户
         * shiroCode : user:add
         */

        private Object sort;
        private Object pageNum;
        private Object pageSize;
        private int permissionId;
        private String menuId;
        private String permissionName;
        private String shiroCode;

        public Object getSort() {
            return sort;
        }

        public void setSort(Object sort) {
            this.sort = sort;
        }

        public Object getPageNum() {
            return pageNum;
        }

        public void setPageNum(Object pageNum) {
            this.pageNum = pageNum;
        }

        public Object getPageSize() {
            return pageSize;
        }

        public void setPageSize(Object pageSize) {
            this.pageSize = pageSize;
        }

        public int getPermissionId() {
            return permissionId;
        }

        public void setPermissionId(int permissionId) {
            this.permissionId = permissionId;
        }

        public String getMenuId() {
            return menuId;
        }

        public void setMenuId(String menuId) {
            this.menuId = menuId;
        }

        public String getPermissionName() {
            return permissionName;
        }

        public void setPermissionName(String permissionName) {
            this.permissionName = permissionName;
        }

        public String getShiroCode() {
            return shiroCode;
        }

        public void setShiroCode(String shiroCode) {
            this.shiroCode = shiroCode;
        }
    }
}
