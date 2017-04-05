package com.liushu.example.tllinkage;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by skywood on 2016/1/29.
 */
public  class Resource implements Parcelable {

    /**
     * message : 成功
     * total : 10
     * resources : [{"group":"原料","id":100,"description":"矿石","name":"矿石"},{"group":"原料","id":200,"description":"煤炭","name":"煤炭"},{"group":"原料","id":310,"description":"钢坯","name":"钢坯"},{"group":"螺线","id":320,"description":"螺纹钢","name":"螺纹钢"},{"group":"螺线","id":330,"description":"线材","name":"线材"},{"group":"螺线","id":340,"description":"盘螺","name":"盘螺"},{"group":"钢板","id":350,"description":"热轧卷板","name":"热轧卷板"},{"group":"钢板","id":360,"description":"冷轧卷板","name":"冷轧卷板"},{"group":"钢板","id":370,"description":"镀锌卷板","name":"镀锌卷板"},{"group":"其他","id":1000,"description":"其他","name":"其他"}]
     * resourcegroups : [{"resources":[{"group":"原料","id":100,"description":"矿石","name":"矿石"},{"group":"原料","id":200,"description":"煤炭","name":"煤炭"},{"group":"原料","id":310,"description":"钢坯","name":"钢坯"}],"groupname":"原料"},{"resources":[{"group":"螺线","id":320,"description":"螺纹钢","name":"螺纹钢"},{"group":"螺线","id":330,"description":"线材","name":"线材"},{"group":"螺线","id":340,"description":"盘螺","name":"盘螺"}],"groupname":"螺线"},{"resources":[{"group":"钢板","id":350,"description":"热轧卷板","name":"热轧卷板"},{"group":"钢板","id":360,"description":"冷轧卷板","name":"冷轧卷板"},{"group":"钢板","id":370,"description":"镀锌卷板","name":"镀锌卷板"}],"groupname":"钢板"},{"resources":[{"group":"其他","id":1000,"description":"其他","name":"其他"}],"groupname":"其他"}]
     * status : 0
     * pageNum : 0
     * size : 10
     */

    private String message;
    private int total;
    private int status;
    private int pageNum;
    private int size;
    /**
     * group : 原料
     * id : 100
     * description : 矿石
     * name : 矿石
     */

    private List<ResourcesBean> resources;
    /**
     * resources : [{"group":"原料","id":100,"description":"矿石","name":"矿石"},{"group":"原料","id":200,"description":"煤炭","name":"煤炭"},{"group":"原料","id":310,"description":"钢坯","name":"钢坯"}]
     * groupname : 原料
     */

    private List<ResourcegroupsBean> resourcegroups;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<ResourcesBean> getResources() {
        return resources;
    }

    public void setResources(List<ResourcesBean> resources) {
        this.resources = resources;
    }

    public List<ResourcegroupsBean> getResourcegroups() {
        return resourcegroups;
    }

    public void setResourcegroups(List<ResourcegroupsBean> resourcegroups) {
        this.resourcegroups = resourcegroups;
    }

    public static class ResourcesBean implements Parcelable {
        private String group;
        private int id;
        private String description;
        private String name;

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.group);
            dest.writeInt(this.id);
            dest.writeString(this.description);
            dest.writeString(this.name);
        }

        public ResourcesBean() {
        }

        protected ResourcesBean(Parcel in) {
            this.group = in.readString();
            this.id = in.readInt();
            this.description = in.readString();
            this.name = in.readString();
        }

        public static final Parcelable.Creator<ResourcesBean> CREATOR = new Parcelable.Creator<ResourcesBean>() {
            @Override
            public ResourcesBean createFromParcel(Parcel source) {
                return new ResourcesBean(source);
            }

            @Override
            public ResourcesBean[] newArray(int size) {
                return new ResourcesBean[size];
            }
        };
    }

    public static class ResourcegroupsBean implements Parcelable {
        private String groupname;
        /**
         * group : 原料
         * id : 100
         * description : 矿石
         * name : 矿石
         */

        private List<ResourcesBean> resources;

        public String getGroupname() {
            return groupname;
        }

        public void setGroupname(String groupname) {
            this.groupname = groupname;
        }

        public List<ResourcesBean> getResources() {
            return resources;
        }

        public void setResources(List<ResourcesBean> resources) {
            this.resources = resources;
        }

        public static class ResourcesBean implements Parcelable {
            private String group;
            private int id;
            private String description;
            private String name;

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.group);
                dest.writeInt(this.id);
                dest.writeString(this.description);
                dest.writeString(this.name);
            }

            public ResourcesBean() {
            }

            protected ResourcesBean(Parcel in) {
                this.group = in.readString();
                this.id = in.readInt();
                this.description = in.readString();
                this.name = in.readString();
            }

            public static final Creator<ResourcesBean> CREATOR = new Creator<ResourcesBean>() {
                @Override
                public ResourcesBean createFromParcel(Parcel source) {
                    return new ResourcesBean(source);
                }

                @Override
                public ResourcesBean[] newArray(int size) {
                    return new ResourcesBean[size];
                }
            };
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.groupname);
            dest.writeList(this.resources);
        }

        public ResourcegroupsBean() {
        }

        protected ResourcegroupsBean(Parcel in) {
            this.groupname = in.readString();
            this.resources = new ArrayList<ResourcesBean>();
            in.readList(this.resources, ResourcesBean.class.getClassLoader());
        }

        public static final Parcelable.Creator<ResourcegroupsBean> CREATOR = new Parcelable.Creator<ResourcegroupsBean>() {
            @Override
            public ResourcegroupsBean createFromParcel(Parcel source) {
                return new ResourcegroupsBean(source);
            }

            @Override
            public ResourcegroupsBean[] newArray(int size) {
                return new ResourcegroupsBean[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.message);
        dest.writeInt(this.total);
        dest.writeInt(this.status);
        dest.writeInt(this.pageNum);
        dest.writeInt(this.size);
        dest.writeTypedList(this.resources);
        dest.writeTypedList(this.resourcegroups);
    }

    public Resource() {
    }

    protected Resource(Parcel in) {
        this.message = in.readString();
        this.total = in.readInt();
        this.status = in.readInt();
        this.pageNum = in.readInt();
        this.size = in.readInt();
        this.resources = in.createTypedArrayList(ResourcesBean.CREATOR);
        this.resourcegroups = in.createTypedArrayList(ResourcegroupsBean.CREATOR);
    }

    public static final Parcelable.Creator<Resource> CREATOR = new Parcelable.Creator<Resource>() {
        @Override
        public Resource createFromParcel(Parcel source) {
            return new Resource(source);
        }

        @Override
        public Resource[] newArray(int size) {
            return new Resource[size];
        }
    };
}