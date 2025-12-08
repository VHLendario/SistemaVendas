# PROJETO DE PROGRAMAÇÃO ORIENTADA A OBJETOS
## Professor Wellington Menezes

# 1 Objetivo do Projeto
O objetivo deste trabalho é implementar um sistema em Java para gerenciamento básico de vendas. O
foco principal não é a persistência de dados (banco de dados), mas sim a aplicação correta dos pilares da
Orientação a Objetos, com ênfase no uso de Interfaces para padronização e Generics para a criação de com-
ponentes reutilizáveis.

# 2 Requisitos Técnicos
O projeto deve obedecer estritamente às seguintes regras:
• Linguagem: Java
• Encapsulamento: Todos os atributos de classe devem ter visibilidade private, acessíveis apenas via
métodos Getters e Setters (ou construtores).
• Tipagem forte: Uso correto de tipos primitivos (podem utilizar classes wrappers) e objetos.
• Polimorfismo: Uso obrigatório de Interface.

# 3 - IMG

# 4 Especificação das Classes
4.1 Classe Produto
Representa os itens disponíveis para venda
• Atributos:
– codigo (String): Identificador único do produto.
– nome (String): Descrição do produto.
– precoUnitario (Double): Valor unitário.
• Comportamento: Deve implementar a interface Imprimivel.
4.2 Classe Cliente
Representa o comprador.
• Atributos:
– cpf (String): Identificador do client.
– nome (String): Nome completo.
– email (Double): Contato eletrônico.
• Comportamento: Deve implementar a interface Imprimivel.
4.3 Classe Item
Classe associativa que liga um produto a um pedido, definindo a quantidade.
• Atributos:
– quantidade (String): Quantidade do produto vendido.
– produto (Produto): Referência ao objeto Produto.
• Métodos:
– subTotal(): Retorna o valor total do pedido.
4.4 Classe Pedido
Agrega itens e associa a um cliente.
• Atributos:
– numero (Integer): Número do pedido.
– data (Date): Data da emissão.
– client (Cliente): O cliente que realiazou a compra.
– listaItens (List<Item>): Lista contendo os itens do pedido.
• Métodos:
– adicionarItem(Item item): Adiciona um item à lista.
– valorTotal(): Percorre a lista somando os subtotais.
• Comportamento: Deve implementar a interface Imprimivel.

# 5 Especificação de Recursos Avançados
5.1 Interface
Define um contrato para qualquer objeto que possa ser exibido em relatório.
• Assinatura: public interface Imprimivel
• Métodos Obrigatórios:
– String getCabecalho(): Retorna o nome das colunas (ex: “Nome | CPF").
– String getDadosFormatados(): Retorna os valores dos atributos formatados em uma única String.
5.2 Classe Genérica Relatorio<T>
Uma classe utilitária capaz de imprimir listas de qualquer objeto que siga o contrato Imprimivel.
• Declaração: public class Relatorio<T extends Imprimivel>
• Método: public void imprimirLog(List<T> lista)
– Deve percorrer a lista recebida.
– Imprimir o cabeçalho (apenas uma vez ou a cada item, conforme design).
– Imprimir os dados formatados de cada item chamando getDadosFormatados().
# 6 Cenário de teste (Método Main)
Na classe principal, implementar o seguinte fluxo:
1. Instanciar dois objetos Produto e adiocioná-los a uma lista.
2. Gerar um relatório de produtos usando Relatorio<Produto>.
3. Instanciar um Cliente e um Pedido.
4. Adicionar os produtos ao pedido (criando os objetos Item).
5. Adicionar o pedido a uma lista de pedidos.
6. Gerar um relatório de pedidos (que mostre o total) usando o Relatorio<Pedido>.
