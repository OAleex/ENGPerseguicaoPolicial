# Perseguição Policial Básica em Java
![Perseguição Policial](https://usagif.com/wp-content/uploads/gifs/police-car-82.gif)

Este é um exemplo de implementação do padrão de projeto "Observador" em Java. O padrão de Observador é usado para criar uma relação de um-para-muitos entre objetos, de modo que quando um objeto sofre uma alteração de estado, todos os seus observadores sejam notificados e atualizados automaticamente.

## Conteúdo do Repositório

- `CarroPolicial.java`: Este é o arquivo principal que contém o código Java do exemplo.

- `ICarroPolicial.java`: Este arquivo define a interface `ICarroPolicial` que descreve o método `follow`, que a viatura de polícia (observador) implementará para seguir a direção do carro roubado.

- `CarroPolicial.java`: Neste arquivo, a classe `CarroPolicial` implementa a interface `ICarroPolicial`. A implementação do método `follow` exibe uma mensagem quando a viatura de polícia segue a direção do carro roubado.

- `CarroRoubado.java`: A classe `CarroRoubado` representa o carro roubado (sujeito observado). Ela mantém uma lista de observadores (viaturas de polícia) e notifica esses observadores quando o carro faz uma curva.
