import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class projeto {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int score = 0;
            int total = 15;

            System.out.println("Bem-vindo ao Quiz sobre One Piece!");
            System.out.println("Responda 15 perguntas sobre o tema.");


            List<Questao> questoes = criarQuestoes();


            for (Questao questao : questoes) {
                System.out.println(questao.pergunta);
                System.out.println(questao.opcaoA);
                System.out.println(questao.opcaoB);
                System.out.println(questao.opcaoC);
                System.out.println(questao.opcaoD);

                System.out.print("Sua resposta: ");
                String resposta = scanner.nextLine().toLowerCase();

                if (questao.isCorreta(resposta)) {
                    score++;
                }
            }


            int erradas = total - score;
            double percentageCorrect = (score * 100.0) / total;
            double percentageIncorrect = (erradas * 100.0) / total;

            System.out.println("\nResultados:");
            System.out.println("Acertos: " + score + " de 15 perguntas.");
            System.out.println("Porcentagem de acertos: " + percentageCorrect + "%");
            System.out.println("Porcentagem de erros: " + percentageIncorrect + "%");
        }

        public static List<Questao> criarQuestoes() {
            List<Questao> questoes = new ArrayList<>();

            questoes.add(new Questao("Qual o nome da akuma no MI do Luffy?",
                    "a) Pika Pika no MI", "b) Nikyu Nikyu no MI",
                    "c) Hito Hito no MI", "d) Magu Magu no MI", "c"));

            questoes.add(new Questao("Quem é o comandante-chefe do Governo Mundial?",
                    "a) Kizaru", "b) Sengoku", "c) Aokiji", "d) Tsuru", "b"));

            questoes.add(new Questao("Qual o nome da terra natal do Ace?",
                    "a) South Blue", "b) North Blue", "c) East Blue",
                    "d) Vila Syrup", "a"));

            questoes.add(new Questao("Qual desses personagens faz parte de One Piece?",
                    "a) Mestre Kame", "b) Goku", "c) Nami", "d) Vegeta", "c"));

            questoes.add(new Questao("Qual o nome da família do Sanji?",
                    "a) Shimotsuki", "b) Vinsmoke", "c) Clã dos D",
                    "d) Lunares", "b"));

            questoes.add(new Questao("Qual o nome do personagem principal de One Piece?",
                    "a) Drácula", "b) Kaido", "c) Katakuri", "d) Luffy", "d"));

            questoes.add(new Questao("Quem tem a maior recompensa entre os Mugiwaras?",
                    "a) Zoro", "b) Jinbe", "c) Nico Robin", "d) Brook", "a"));

            questoes.add(new Questao("Qual o nome do avô do Luffy?",
                    "a) Kaido", "b) Zoro", "c) Katakuri", "d) Garp", "d"));

            questoes.add(new Questao("Qual foi a primeira tripulação da Nami?",
                    "a) Mugiwaras", "b) Piratas do Alonso",
                    "c) Marinha", "d) CP9", "a"));

            questoes.add(new Questao("Qual o nome do navio do Luffy?",
                    "a) Going Merry", "b) Thousand Sunny",
                    "c) Oro Jackson", "d) Red Force", "b"));

            questoes.add(new Questao("Quem é conhecido como o 'Rei dos Piratas'?",
                    "a) Barba Branca", "b) Roger",
                    "c) Shanks", "d) Kaido", "b"));

            questoes.add(new Questao("Quem é o espadachim da tripulação?",
                    "a) Sanji", "b) Zoro", "c) Usopp", "d) Jinbe", "b"));

            questoes.add(new Questao("Qual é o sonho do Luffy?",
                    "a) Ser o maior espadachim", "b) Encontrar All Blue",
                    "c) Ser o Rei dos Piratas", "d) Dominar os mares", "c"));

            questoes.add(new Questao("Qual o nome do vilão da saga Arlong?",
                    "a) Crocodile", "b) Buggy", "c) Arlong", "d) Smoker", "c"));

            questoes.add(new Questao("Quem tem o apelido de 'Nariz de Mentiroso'?",
                    "a) Usopp", "b) Brook", "c) Chopper", "d) Franky", "a"));

            return questoes;
        }
    }

    class Questao {
        String pergunta;
        String opcaoA;
        String opcaoB;
        String opcaoC;
        String opcaoD;
        String correta;

        public Questao() {}

        public Questao(String pergunta, String opcaoA, String opcaoB, String opcaoC, String opcaoD, String correta) {
            this.pergunta = pergunta;
            this.opcaoA = opcaoA;
            this.opcaoB = opcaoB;
            this.opcaoC = opcaoC;
            this.opcaoD = opcaoD;
            this.correta = correta;
        }

        public boolean isCorreta(String resposta) {
            return resposta.equalsIgnoreCase(correta);
        }
    }

