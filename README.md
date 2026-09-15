# 🤖 Assistente Financeiro Inteligente com Spring AI

API REST desenvolvida em Spring Boot com recursos do Spring AI para gerenciamento de transações financeiras utilizando linguagem natural.

## 🎯 Objetivo
Permitir a persistência e consulta de transações financeiras via texto/áudio utilizando a funcionalidade de **Tool Calling** para invocar Beans do Spring automaticamente.

## 🛠️ Tecnologias
* Java 17
* Spring Boot 3 & Spring AI
* Spring Data JPA & Banco de Dados H2
* Gradle

## 🚀 Melhoria Implementada
* **Consulta por Período (`findTransactionsByPeriod`):** Implementação de um Use Case e registro de um `@Bean` de função no Spring AI para que a IA identifique datas em linguagem natural e realize a busca no banco de dados.

## 🧪 Como Executar
1. Exporte a chave da API OpenAI:
   ```bash
   export OPENAI_API_KEY="sua-chave-aqui"
