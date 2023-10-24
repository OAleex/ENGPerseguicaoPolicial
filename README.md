# Perseguição Policial Básica em Java
![Perseguição Policial](https://usagif.com/wp-content/uploads/gifs/police-car-82.gif)

## Conteúdo do Repositório

- `CarroPolicial.java`: Este é o arquivo principal que contém o código Java do exemplo.

- `ICarroPolicial.java`: Este arquivo define a interface `ICarroPolicial` que descreve o método `follow`, que a viatura de polícia (observador) implementará para seguir a direção do carro roubado.

- `CarroPolicial.java`: Neste arquivo, a classe `CarroPolicial` implementa a interface `ICarroPolicial`. A implementação do método `follow` exibe uma mensagem quando a viatura de polícia segue a direção do carro roubado.

- `CarroRoubado.java`: A classe `CarroRoubado` representa o carro roubado (sujeito observado). Ela mantém uma lista de observadores (viaturas de polícia) e notifica esses observadores quando o carro faz uma curva.
