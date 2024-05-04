Integrantes:
Ana Paula Nascimento - rm552513
Calina Thalya Santana Silva - rm552523
Geovana Ribeiro - rm99646
Leonardo Camargo Lucena - rm552537
Nathan Nunes Calsonari - rm552539


Um sistema foi desenvolvido usando o framework Spring Boot em Java, configurado com Maven. Seu propósito principal é gerenciar brinquedos. Para garantir o correto funcionamento das operações de criação, leitura, deleção e atualização de brinquedos, foram realizados testes dos endpoints HTTP usando o software Postman. Durante o desenvolvimento, adotamos uma abordagem baseada no padrão RESTful para criar os endpoints HTTP. Isso resultou na criação de endpoints específicos para operações de criação (POST), leitura (GET), deleção (DELETE) e atualização (PUT) de brinquedos.

O endpoint de criação de brinquedos possibilita a adição de novos itens ao sistema, fornecendo dados como nome do brinquedo, descrição, faixa etária recomendada e outras informações relevantes no corpo da requisição HTTP. Após a implementação dos endpoints, foram realizados testes usando o Postman para verificar o comportamento correto das operações. Testamos casos de criação de novos brinquedos, verificando se os dados foram corretamente armazenados no sistema. Também testamos a funcionalidade de deleção de brinquedos existentes no sistema, utilizando o método DELETE, que permite remover um brinquedo usando o ID.

Implementamos o método PUT para possibilitar a atualização de informações de brinquedos já existentes no sistema. Ao enviar uma requisição, é possível atualizar dados como descrição, faixa etária, entre outros. Os resultados detalhados desses testes foram documentados e estão disponíveis no ZIP do entregável, juntamente com os resultados dos testes de criação e leitura. Esta documentação é essencial para garantir a robustez e confiabilidade do sistema, além de facilitar futuras manutenções e atualizações.