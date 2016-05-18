package myaccomplishmenttoday

class Reporter {
    String reporterName;
    String articleTitle;
    Editor editorName;
    static hasMany = [articles:Articles];
    String name

    static constraints = {
       // editor unique=true;
    }
}
