package kursWalut;

public class Waluta {
        private String nazwaWaluty;
        private int przelicznik;
        private String kodWaluty;
        private float sredniKurs;

        public String getNazwaWaluty() {
            return nazwaWaluty;
        }

        public int getPrzelicznik() {
            return przelicznik;
        }

        public String getKodWaluty() {
            return kodWaluty;
        }

        public float getSredniKurs() {
            return sredniKurs;
        }

        public void setNazwaWaluty(String nazwaWaluty) {
            this.nazwaWaluty = nazwaWaluty;
        }

        public void setPrzelicznik(int przelicznik) {
            this.przelicznik = przelicznik;
        }

        public void setKodWaluty(String kodWaluty) {
            this.kodWaluty = kodWaluty;
        }

        public void setSredniKurs(float sredniKurs) {
            this.sredniKurs = sredniKurs;
        }
}
