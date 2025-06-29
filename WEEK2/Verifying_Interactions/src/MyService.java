package WEEK2.Verifying_Interactions.src;
public class MyService {
        private final ExternalApi2 api;
        public MyService(ExternalApi2 api) {
            this.api = api;
        }
        public void fetchData() {
            api.getData();
        }
}


