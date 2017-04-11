package com.example.labdesenvolvimento.appacademia;

/**
 * Created by Lab. Desenvolvimento on 11/04/2017.
 */

public class Util {

    /**
     *Lê um arquivo da web via HTTP e converte o mesmo em String.
     *@param inputStream Stream do arquivo local no aplicativo
     *@return O arquivo convertido em String.
     */
    public static String webToString(InputStream inputStream) {
        InputStream localStream = inputStream;
        String localString = "";
        Writer writer = new StringWriter();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(localStream, "UTF-8"));
            String line = reader.readLine();
            while (line != null) {
                writer.write(line);
                line = reader.readLine();
            }
            localString = writer.toString();
            writer.close();
            reader.close();
            localStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return localString;
    }

    public static List<Exercicio> convertJSONtoExercicio(String jsonFile){
        List<Exercicio> exercicios = new ArrayList<>();
        try {
            JSONArray mainObject = new JSONArray(jsonFile);

            for(int i = 0; i < mainObject.length(); i++){
                Exercicio novoExercicio = new Exercicio();
                JSONObject localObj = mainObject.getJSONObject(i);
                long id = localObj.getLong("id_exercicios");
                String nome = localObj.getString("nome_exercicio");
                int serie = localObj.getInt("serie_exercicio");
                int repeticoes = localObj.getInt("repeticoes_exercicio");
                novoExercicio.setID(id);
                novoExercicio.setNome(nome);
                novoExercicio.setSerie(serie);
                novoExercicio.setRepeticoes(repeticoes);
                exercicios.add(novoExercicio);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return exercicios;
    }

}
