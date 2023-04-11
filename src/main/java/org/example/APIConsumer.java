package org.example;

public class APIConsumer {


        static ArrayList<Doc> Documents = new ArrayList<>();

        public static Doc[] main() {
            String apiUrl = "https://api.nytimes.com/svc/search/v2/articlesearch.json?q=election&api-key=4XqVXyb5jaA52UnagaNciMtzuE8lkuAG";
            try {
                URL url = new URL(apiUrl);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setRequestProperty("Accept", "application/json");

                if (conn.getResponseCode() != 200) {
                    throw new RuntimeException("HTTP error code : " + conn.getResponseCode());
                }

                BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
                String output;
                StringBuilder json = new StringBuilder();

                while ((output = br.readLine()) != null) {
                    json.append(output);
                }

                conn.disconnect();

                Gson gson = new Gson();
         /*       Doc doc[] = gson.fromJson(json.toString(), Doc[].class);
                for (int i = 0; i < Uni.length; i++) {
                    Doc newDoc = doc[i];
                    System.out.println("Headline: " +doc[i].headline);
                    System.out.println("By Line: " + doc[i].byline);
                    System.out.println("Date: " + doc[i].pub_date);
                    System.out.println("Document Type: " + doc[i].document_type);
                    System.out.println("Section Name: " + doc[i].section_name);
                    for (int j = 0; j < Uni[i].domains.length; j++) {
                        System.out.println("Domains : " + Uni[i].domains[j]);
                    }

                    for (String x : Uni[i].web_pages) {
                        System.out.println("web pages: " + x);
                    }
                    System.out.println("-----------------------------------------------------");
                    uniList.add(newUniversity);
                    JDBC.createUniversityTable();
                }*/
                return Uni;

            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
}
