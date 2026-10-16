O **JDBC (Java Database Connectivity)** aparece em suas fontes como a API padrão para conectividade e comunicação do Java com bancos de dados relacionais[1].

Nos materiais disponíveis, o JDBC é abordado principalmente nos seguintes contextos:

**Configuração de Drivers e Conexão**: O uso de drivers específicos (como o *MySQL Connector/J*) para estabelecer conexões JDBC ajustando parâmetros de codificação de caracteres (como `utf8mb4` para suporte a caracteres especiais e emojis)[2].

**Recursos Avançados de Cliente**: Em drivers JDBC para PostgreSQL, ele é destacado pelo suporte nativo a **failover**, **balanceamento de carga** e **separação de leitura e gravação** (*read/write splitting*) em arquiteturas de banco de dados[3][4].