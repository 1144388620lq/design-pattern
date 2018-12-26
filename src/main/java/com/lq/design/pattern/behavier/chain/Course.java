package com.lq.design.pattern.behavier.chain;

/**
 * @Auther: LQ
 * @Date: 2018/12/26 19:51
 * @Description:
 */
public class Course {

    private String name;
    private String article;
    private String  video;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Article{");
        sb.append("name='").append(name).append('\'');
        sb.append(", article='").append(article).append('\'');
        sb.append(", video='").append(video).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
