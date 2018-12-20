package com.lq.design.pattern.behavier.memento;

/**
 * @Auther: LQ
 * @Date: 2018/12/20 21:13
 * @Description:
 */
public class Article {

    private String title;
    private String content;

    public Article() {
    }

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
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

    public ArticleMemento doSave() {
        return new ArticleMemento(this.title, this.content);
    }

    public void undoSave(ArticleMemento articleMemento) {
        this.content = articleMemento.getContent();
        this.title = articleMemento.getTitle();
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
