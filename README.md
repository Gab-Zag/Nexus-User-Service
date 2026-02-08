# Nexus-User-Service
## Visão Geral
Construção de um ecossistema de backend completo baseado em um roadmap de 10 semanas no final teremos:
- User Managerment API
- Auth Server (Login + JWT)
- Product & Order API
- File Upload API
- Notification Service
- API Gateway
- Microservices de Usuários e Pedidos
- Sistema de Agendamento
- Search API (ElasticSearch)
- Uniao em um Unico Sistema

## Storytelling
Começar com um CRUD $\rightarrow$ Evoluir para autenticação $\rightarrow$ Transformar em um sistema real $\rightarrow$ Adotar microsserviços $\rightarrow$ Finalizar com um sistema escalável.

## Semana 1: Fundamentos sólidos
### Projeto: User Managerment API
### Objetivo
Criar uma Api Rest
- CRUD de usuários
- DTOs
- Validação
- Exception Handler
- PostgreSQL
- JPA

## Arquitetura
    Controller → Service → Repository → Database
                    ↓
                   DTOs
                    ↓
                Validation & Exceptions

## Semana 2: Auth Server(JWT)
Objetivo:
- Refresh Token (longo)
- Regras de expiração
- Revogação
- Rotação