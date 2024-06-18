# Sistema de Gerenciamento de Brinquedos

## Funcionalidades
 - **Criação de Brinquedos (POST):** Adição de novos brinquedos ao sistema fornecendo dados como nome, descrição, faixa etária recomendada e outras informações relevantes no corpo da requisição HTTP.
 - **Leitura de Brinquedos (GET):** Recuperação de informações dos brinquedos cadastrados.
 - **Deleção de Brinquedos (DELETE):** Remoção de brinquedos do sistema utilizando o ID.
 - **Atualização de Brinquedos (PUT):** Atualização das informações de brinquedos já existentes no sistema, como descrição e faixa etária recomendada

## Desenvolvimento
Durante o desenvolvimento, adotamos uma abordagem baseada no padrão RESTful para criar os endpoints HTTP necessários para cada operação.

## Endpoints
 - **Criação: `/api/brinquedos`** (POST)
 - **Leitura: `/api/brinquedos`** (GET)
 - **Deleção: `/api/brinquedos/{id}`** (DELETE)
 - **Atualização: `/api/brinquedos/{id}`** (PUT)

## Testes

Para garantir o correto funcionamento das operações, realizamos testes dos endpoints HTTP usando o software Postman. Os testes envolveram:

 - **Criação de Brinquedos:** Verificação se os dados foram corretamente armazenados no sistema.
 - **Deleção de Brinquedos:** Testes para garantir que brinquedos podem ser removidos do sistema utilizando o método DELETE.
 - **Atualização de Brinquedos:** Confirmação de que dados como descrição e faixa etária podem ser atualizados.

## Documentação

Os resultados detalhados dos testes foram documentados e estão disponíveis no ZIP do entregável, juntamente com os resultados dos testes de criação e leitura. Esta documentação é essencial para garantir a robustez e confiabilidade do sistema, além de facilitar futuras manutenções e atualizações.

## Equipe
 - Ana Paula Nascimento - RM552513
 - Calina Thalya Santana Silva - RM552523
 - Geovana Ribeiro - RM99646
 - Leonardo Camargo Lucena - RM552537
 - Nathan Nunes Calsonari - RM552539
