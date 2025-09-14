public class Report {

    private final String title;
    private final String author;
    private final String content;
    private final int year;
    private final boolean reviewed;
    private final boolean confidential;


    private Report(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.content = builder.content;
        this.year = builder.year;
        this.reviewed = builder.reviewed;
        this.confidential = builder.confidential;
    }


    public static class Builder {
        private String title;
        private String author;
        private String content;
        private int year;
        private boolean reviewed;
        private boolean confidential;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder reviewed(boolean reviewed) {
            this.reviewed = reviewed;
            return this;
        }

        public Builder confidential(boolean confidential) {
            this.confidential = confidential;
            return this;
        }


        private void validate() {
            if (title == null || title.isEmpty()) {
                throw new IllegalArgumentException("Title is required");
            }
            if (author == null || author.isEmpty()) {
                throw new IllegalArgumentException("Author is required");
            }
            if (year < 1900 || year > 2100) {
                throw new IllegalArgumentException("Invalid year");
            }
        }


        public Report build() {
            validate();
            return new Report(this);
        }
    }


    @Override
    public String toString() {
        return String.format(
                "Report: %s\nAuthor: %s\nYear: %d\nReviewed: %b\nConfidential: %b\nContent: %s",
                title, author, year, reviewed, confidential, content
        );
    }
}
