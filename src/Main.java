import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Questao> questoes = new ArrayList<Questao>();

        adicionarQuestao(questoes, "1. Qual é a capital do estado de Minas Gerais?", "A) Goiânia", "B) Belo Horizonte", "C) Curitiba", "D) Vitória", "E) Campo Grande", "B");
        adicionarQuestao(questoes, "2. Qual estado brasileiro tem a maior extensão territorial?", "A) Amazonas", "B) Bahia", "C) Mato Grosso", "D) Pará", "E) Minas Gerais", "A");
        adicionarQuestao(questoes, "3. Em qual região brasileira está localizado o estado do Paraná?", "A) Norte", "B) Nordeste", "C) Centro-Oeste", "D) Sudeste", "E) Sul", "E");
        adicionarQuestao(questoes, "4. A Floresta Amazônica é o bioma predominante em qual região do Brasil?", "A) Sul", "B) Sudeste", "C) Norte", "D) Nordeste", "E) Centro-Oeste", "C");
        adicionarQuestao(questoes, "5. O Cerrado é conhecido principalmente por sua vegetação de árvores baixas e retorcidas. Em qual área ele é predominante?", "A) Planalto Central", "B) Litoral do Sudeste", "C) Serra Gaúcha", "D) Zona da Mata Nordestina", "E) Pampa", "A");
        adicionarQuestao(questoes, "6. O Pantanal, uma das maiores planícies alagáveis do mundo, localiza-se principalmente em quais estados?", "A) Goiás e Tocantins", "B) Mato Grosso e Mato Grosso do Sul", "C) Pará e Amazonas", "D) Bahia e Sergipe", "E) Paraná e Santa Catarina", "B");
        adicionarQuestao(questoes, "7. Qual rio brasileiro possui a maior vazão de água do mundo?", "A) Rio São Francisco", "B) Rio Paraná", "C) Rio Tocantins", "D) Rio Amazonas", "E) Rio Paraguai", "D");
        adicionarQuestao(questoes, "8. Qual tipo de clima predomina em grande parte da Região Norte do Brasil?", "A) Subtropical", "B) Semiárido", "C) Tropical Atlântico", "D) Tropical de altitude", "E) Equatorial", "E");
        adicionarQuestao(questoes, "9. O Cristo Redentor, importante ponto turístico brasileiro, está localizado em qual cidade?", "A) Rio de Janeiro", "B) Salvador", "C) Brasília", "D) Recife", "E) Florianópolis", "A");
        adicionarQuestao(questoes, "10. Qual manifestação cultural nordestina é marcada por literatura em folhetos, geralmente com versos e xilogravuras?", "A) Frevo", "B) Bumba meu boi", "C) Literatura de cordel", "D) Samba de roda", "E) Congada", "C");
        adicionarQuestao(questoes, "11. A festa popular de Parintins, no Amazonas, é marcada pela disputa entre quais bois?", "A) Garantido e Caprichoso", "B) Azulão e Vermelhão", "C) Boi-Bumbá e Maracatu", "D) Frevo e Caboclinho", "E) Rei Momo e Pierrô", "A");
        adicionarQuestao(questoes, "12. Qual prato é tradicional da culinária baiana e preparado com massa de feijão-fradinho frita em azeite de dendê?", "A) Barreado", "B) Tacacá", "C) Arroz carreteiro", "D) Acarajé", "E) Pão de queijo", "D");
        adicionarQuestao(questoes, "13. O Tratado de Tordesilhas, assinado em 1494, tinha como objetivo principal: ", "A) criar os estados brasileiros", "B) dividir terras descobertas entre Portugal e Espanha", "C) encerrar a Guerra do Paraguai", "D) transferir a capital para Brasília", "E) abolir a escravidão", "B");
        adicionarQuestao(questoes, "14. Qual formação natural brasileira é caracterizada por grandes quedas-d'água na fronteira entre Brasil e Argentina?", "A) Chapada dos Veadeiros", "B) Lençóis Maranhenses", "C) Serra do Mar", "D) Cataratas do Iguaçu", "E) Jalapão", "D");
        adicionarQuestao(questoes, "15. Ouro Preto, em Minas Gerais, é reconhecida principalmente por qual patrimônio histórico-cultural?", "A) Arquitetura barroca do período colonial", "B) Ruínas incas", "C) Pirâmides indígenas", "D) Construções futuristas", "E) Palácios imperiais franceses", "A");

        Cabecalho.exibir();
        int acertos = 0;

        for (int i = 0; i < questoes.size(); i++) {
            Questao questao = questoes.get(i);
            questao.escrevaQuestao();
            String resposta = questao.leiaResposta();

            if (questao.isCorreta(resposta)) {
                acertos++;
            }
        }

        double porcentagem = (acertos * 100.0) / questoes.size();
        System.out.println("Total de acertos: " + acertos + " de " + questoes.size());
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagem);
        System.out.println("Obrigado pela participação no Quiz!");
    }

    private static void adicionarQuestao(ArrayList<Questao> questoes, String pergunta,
                                        String opcaoA, String opcaoB, String opcaoC,
                                        String opcaoD, String opcaoE, String correta) {
        Questao questao = new Questao();
        questao.pergunta = pergunta;
        questao.opcaoA = opcaoA;
        questao.opcaoB = opcaoB;
        questao.opcaoC = opcaoC;
        questao.opcaoD = opcaoD;
        questao.opcaoE = opcaoE;
        questao.correta = correta;
        questoes.add(questao);
    }
}
