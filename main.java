package classes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.API.model.Aeroport;
import com.example.API.model.Vol;

public class Main {

    public static List<Vol> chargerVols(String cheminFichier) {
        List<Vol> vols = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM");

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        Main.class.getClassLoader().getResourceAsStream(cheminFichier)))) {

            String ligne = br.readLine(); // sauter l’entête

            while ((ligne = br.readLine()) != null) {
                String[] champs = ligne.split(";");
                String code = champs[0];
                String departVille = champs[1];
                String arriveeVille = champs[2];
                String dateStr = champs[3];
                String heure = champs[4];

                Aeroport depart = new Aeroport(departVille, departVille, departVille, "");
                Aeroport arrivee = new Aeroport(arriveeVille, arriveeVille, arriveeVille, "");

                Date date = sdf.parse(dateStr);

                Vol v = new Vol(code, date, depart, arrivee);
                v.setHeureDepart(heure);

                vols.add(v);
            }

        } catch (Exception e) {
            System.out.println("Erreur de lecture du fichier : " + e.getMessage());
        }

        return vols;
    }

    public static void main(String[] args) {
        List<Vol> vols = chargerVols("Vols.csv");
        vols.forEach(v -> System.out.println(v.getNumeroVol()));
    }
}

