package str64;

abstract public class ZwierzeDomowe {

        private String rasa;
        private int wiek;
        private String płeć;
        private String dźwięk;

    ZwierzeDomowe(String rasa, String płeć,String dźwięk){
        this.rasa = rasa;
        this.płeć = płeć;
        this.dźwięk=dźwięk;
        wiek =10;

    }
    ZwierzeDomowe()
    {}
        public int getWiek() {
            return wiek;
        }

        public void setWiek(int kjhkjh) {
            this.wiek = kjhkjh;
        }

        public String getRasa() {
            return rasa;
        }
        void dzwiek(){
            System.out.println(dźwięk);
        }

    }


