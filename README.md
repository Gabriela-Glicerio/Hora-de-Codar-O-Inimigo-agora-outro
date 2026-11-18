# Hora de Codar: O Inimigo agora é outro ☕

Lista de exercícios de lógica de programação em **Java**, resolvida com `Scanner` para leitura de dados. Cada exercício está em um arquivo próprio, com o enunciado comentado no topo do código.

## Conteúdo

| Tema | Exercícios | Arquivos |
|------|-----------|----------|
| Lógica básica | 1 a 3 | `Ex01_BabySteps`, `Ex02_HelloClarice`, `Ex03_ABitOfInformation` |
| Geometria (um arquivo por fórmula) | 4 | pasta `geometria/` |
| Condicionais | 5, 6, 6.1, 7, 7.1 | `Ex05_...` a `Ex07_1_...` |
| Repetição | 8 a 15 | `Ex08_...` a `Ex15_...` |
| Problemas aplicados | 16 a 21, 24 | `Ex16_...` a `Ex21_...`, `Ex24_...` |
| Sequências | 22 e 23 | `Ex22_ContaComigo`, `Ex23_NaoContaComigo` |
| Vetores | 25 | `Ex25_InvertendoTudo` |

### Exercício 4: Geometria

Cada forma tem seu próprio arquivo em `geometria/`:

`Retangulo` · `Quadrado` · `Losango` · `Trapezio` · `Paralelogramo` · `Triangulo` · `Circulo`

## Estrutura do projeto

```
atividade/
├── README.md
├── Ex01_BabySteps.java
├── Ex02_HelloClarice.java
├── ...
├── Ex25_InvertendoTudo.java
└── geometria/
    ├── Retangulo.java
    ├── Quadrado.java
    ├── Losango.java
    ├── Trapezio.java
    ├── Paralelogramo.java
    ├── Triangulo.java
    └── Circulo.java
```

## Requisitos

- **JDK 11 ou superior** (testado com a sintaxe básica, compatível com versões mais antigas)
- Terminal ou uma IDE (IntelliJ, Eclipse, VS Code)

Verifique a instalação:

```bash
java -version
javac -version
```

## Como compilar e executar

Na pasta do projeto, compile e rode um exercício por vez:

```bash
javac -encoding UTF-8 Ex01_BabySteps.java
java Ex01_BabySteps
```

Para os exercícios de geometria:

```bash
cd geometria
javac -encoding UTF-8 Retangulo.java
java Retangulo
```

> Use `-encoding UTF-8` para os acentos aparecerem corretamente.

## Observações sobre as soluções

- **Números decimais:** o `Scanner` usa a configuração regional do sistema. Em português (pt_BR), digite com vírgula (`7,5`). Em inglês, use ponto (`7.5`).
- **Ex. 11 (bomba-relógio):** usa `Thread.sleep(1000)` para esperar 1 segundo a cada número. Remova essa linha para a contagem ser instantânea.
- **Ex. 14:** a resposta "S" (maiúscula ou minúscula) reinicia o programa; qualquer outra encerra e mostra a quantidade de aprovados.
- **Ex. 18:** o programa lê o valor de cada venda para detalhá-las e calcula o total. O salário fixo é informado pelo usuário (ex.: R$ 5.000,00).
- **Ex. 20:** o total a pagar segue o enunciado (valor da venda − desconto). O imposto de 20% é exibido na nota, mas não entra no total.
- **Ex. 21:** o ano atual é obtido do sistema com `Year.now()`.
- **Ex. 24:** considera 160 horas regulares por mês (40 h × 4 semanas). As horas excedentes são pagas com acréscimo de 50%.
- **Ex. 25:** a Saída 1 inverte todo o vetor. A Saída 2 inverte separando por tipo (números e depois letras).

## Dev

Atividade desenvolvida para as aulas do gabriel
