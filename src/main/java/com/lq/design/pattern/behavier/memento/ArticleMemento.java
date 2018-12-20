package com.lq.design.pattern.behavier.memento;

/**
 * @Auther: LQ
 * @Date: 2018/12/20 21:16
 * @Description:
 */
public class ArticleMemento {
    private String title;
    private String content;

    public ArticleMemento() {
    }

    public ArticleMemento(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Article{");
        sb.append("title='").append(title).append('\'');
        sb.append(", content='").append(content).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
