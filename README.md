# Refatoração do Sistema Acadêmico

Este projeto apresenta a refatoração de um sistema de pedidos, aplicando princípios de projeto para melhorar a organização, manutenção e flexibilidade do código.

## Refatorações realizadas

* **SRP:** separação das responsabilidades do `PedidoService`.
* **OCP:** criação de interfaces para permitir novos tipos de desconto sem alterar o código existente.
* **LSP:** correção de comportamentos incompatíveis entre classes e interfaces.
* **ISP:** divisão da interface de pagamento em interfaces menores e específicas.
* **DIP:** utilização de abstrações, como `IPedidoRepository`, em vez de depender diretamente de classes concretas.
* **Composição sobre Herança:** substituição de heranças inadequadas por composição e interfaces.
* **Lei de Demeter:** redução de cadeias de chamadas e melhor encapsulamento dos objetos.

## Resultado

A refatoração reduziu o acoplamento, melhorou a organização do sistema e facilitou a inclusão de novas funcionalidades e futuras alterações.
