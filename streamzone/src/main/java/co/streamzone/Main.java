package co.streamzone;

import co.streamzone.Strategies.RecomendByEmo;
import co.streamzone.Strategies.RecomendByHis;
import co.streamzone.Strategies.RecomendByPop;
import co.streamzone.Strategies.RecomendByTime;
import co.streamzone.user.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Juan", "Podcast", new RecomendByHis());
        User user2 = new User("Maria", "Peliculas", new RecomendByPop());
        User user3 = new User("Sergio", "Musica", new RecomendByTime());

        user3.setRecomendations(new RecomendByEmo());

    }
}