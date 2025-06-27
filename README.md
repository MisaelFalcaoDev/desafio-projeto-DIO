# Desafio de Projeto DIO em JAVA-SpringBoot

Explore o conceito de Padrões de Projeto na prática, implementando soluções que utilizem os padrões clássicos do GoF e as abstrações fornecidas pelo Spring Framework.

<h2>Padrões Criacionais Implementados</h1> 
<h3>1. Singleton</h3>

Problema resolvido: Garantir que uma classe tenha apenas uma instância e fornecer um ponto de acesso global a ela.

Implementação: Utilizamos a abordagem natural do Spring, onde beans são singletons por padrão (@Service).

Caso de uso: Serviço de configuração da aplicação que precisa manter estado consistente.

<h3>2. Factory Method</h3>

Problema resolvido: Criar objetos sem especificar suas classes concretas.

Implementação: DocumentoFactory que produz diferentes tipos de documentos (PDF, Word) baseado em um parâmetro.

Vantagem: Flexibilidade para adicionar novos tipos de documentos sem modificar o código cliente.

<h2>Padrões Estruturais Implementados</h2>
<h3>1. Decorator</h3>

Problema resolvido: Adicionar responsabilidades a objetos dinamicamente.

Implementação: NotificadorComCriptografia que decora o NotificadorEmail básico.

Benefício: Pode-se combinar comportamentos (como criptografia + log) sem criar subclasses explosivas.

<h3>2. Proxy</h3>

Problema resolvido: Controlar acesso a um objeto, adicionando funcionalidades indiretas.

Implementação: ServicoDemoradoProxy que adiciona cache a operações demoradas.

Aplicação: Melhora performance sem modificar o serviço real.

