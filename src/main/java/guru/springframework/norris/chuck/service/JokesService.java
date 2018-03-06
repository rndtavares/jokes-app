package guru.springframework.norris.chuck.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by R112873 on 06/03/2018.
 */
@Service
public class JokesService {

    public String getJoke(){
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

        return chuckNorrisQuotes.getRandomQuote();
    }

}
