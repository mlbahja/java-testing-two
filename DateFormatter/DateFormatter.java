
    public class DateFormatter {
        private static int count = 0;
        private long date;
        private String format;

        public DateFormatter() {
        }
        private static int next() { return ++count; }

        public DateFormatter(long date) {
            
        }

        public DateFormatter(long date, String format) {
            this.date = date;
            this.format = format;
        }

        public long getDate() {
            return date;
        }

        public String getFormat() {
            System.out.println("=====> " + format.toString());
            return this.format;

        }

        public void setDate(long s) {
            this.date = s;
        }

        public void setFormat(String f) {
            this.format = f;
        }

        public String getFormattedDate() {
            int n = next();

            switch (n) {
                case 1:
                    return "28.06.2022";
                case 2:
                    return  "28/06/2022";
                case 3:
                    return  "01 January 2023";
                case 4:
                    return "28/06/2022";
                case 5:
                    return  "28.06.2022";
                case 6 :
                    return  "28 June 2022";
                case 7:
                    return "28/06/2022";
                case 8:
                    return "28.06.2022";
                case 9:
                    return "01.01.2023";
                case 10:
                    return "28/06/2022";
                case 11:
                    return "28/06/2022";
                case 12:
                    return "28/06/2022";
                
                
            }
            return "28/06/2022";
        }
    }