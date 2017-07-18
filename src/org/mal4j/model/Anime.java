package org.mal4j.model;

import java.net.URL;
import java.sql.Date;

//imports

public class Anime {
    
    private int id;
    private String japanTitle;
    private String englishTitle;
    private String[] synonyms;
    private int episodes;
    private double score;
    private String type;
    private String status;
    private Date startDate;
    private Date endDate;
    private String synopsis;
    private URL image;

    public void setId (int animeId) {
        id = animeId;
    }

    public void setJapanTitle (String animeJapTitle) {
        japanTitle = animeJapTitle;
    }

    public void setEnglishTitle (String animeEngTitle) {
        englishTitle = animeEngTitle;
    }

    public void setSynonyms (String[] animeSynonyms) {
        synonyms = animeSynonyms.clone();
    }

    public void setEpisodes (int animeEpisodes) {
        episodes = animeEpisodes;
    }

    public void setScore (double animeScore) {
        score = animeScore;
    }

    public void setType (String animeType) {
        type = animeType;
    }

    public void setStatus (String animeStatus) {
        status = animeStatus;
    }
}