# Padrões de Projeto - cap. 1 (p. 37 a 40)

Exemplos curtos em Java das ideias dessas páginas do livro

- Ordenacao.java: três jeitos de decidir a ordem de dois valores. Por herança (a subclasse diz quem vem antes), por composição (passo um objeto comparador) e por tipo generico (serve pra qualquer tipo comparável, número ou texto)
- AgregacaoAssociacao.java: o carro cria o motor e é dono dele (agregação). O motorista so conhece o carro e usa ele (associação)
- ProjetandoMudancas.java: quem cria a notificação é a fábrica, então o `main` não depende de `Email` nem de `Sms`. Se aparecer um tipo novo, só a fábrica muda

