package myaccomplishmenttoday

class Reporter {
    String reporterName;
    String articleTitle;
    Editor editorName;
    static hasMany = [articles:Articles];

    static constraints = {
       // editor unique=true;
    }
}
