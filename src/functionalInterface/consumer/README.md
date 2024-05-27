# EstadosPorRegiao.java

O programa imprime uma **tabela** com as informações dos estados brasileiros, dividida em sub-tabelas para cada região geográfica.

A tabela contém as colunas: `sigla`, `nome`, `capital`, `código do IBGE` e `região geográfica`.

## Implementação

1. Criar o **enum** EstadoBrasileiro
2. Criar a **classe** EstadosPorRegiao
3. Criar um **stream** para coletar os valores de estados
4. Filtrar os elementos do stream de acordo com a região geográfica
5. Converter o stream em uma lista
6. Usar o método **forEach**, passando um **Consumer** como argumento para imprimir os elementos da lista

## Output
```
=========================================================================================================
     SIGLA                           NOME              CAPITAL            COD. IBGE               REGIÃO
=========================================================================================================
CENTRO-OESTE
=========================================================================================================
        DF               Distrito Federal             Brasília                   53         Centro-Oeste
        GO                          Goiás              Goiânia                   52         Centro-Oeste
        MT                    Mato Grosso               Cuiabá                   51         Centro-Oeste
        MS             Mato Grosso do Sul         Campo Grande                   50         Centro-Oeste
=========================================================================================================
NORTE
=========================================================================================================
        AC                           Acre           Rio Branco                   12                Norte
        AP                          Amapá               Macapá                   16                Norte
        AM                       Amazonas               Manaus                   13                Norte
        PA                           Pará                Belém                   15                Norte
        RO                       Rondônia          Porto Velho                   11                Norte
        RR                        Roraima            Boa Vista                   14                Norte
        TO                      Tocantins               Palmas                   17                Norte
=========================================================================================================
NORDESTE
=========================================================================================================
        AL                        Alagoas               Maceió                   27             Nordeste
        BA                          Bahia             Salvador                   29             Nordeste
        CE                          Ceará            Fortaleza                   23             Nordeste
        MA                       Maranhão             São Luís                   21             Nordeste
        PB                        Paraíba          João Pessoa                   25             Nordeste
        PE                     Pernambuco               Recife                   26             Nordeste
        PI                          Piauí             Teresina                   22             Nordeste
        RN            Rio Grande do Norte                Natal                   24             Nordeste
        SE                        Sergipe              Aracaju                   28             Nordeste
=========================================================================================================
SUDESTE
=========================================================================================================
        ES                 Espírito Santo              Vitória                   32              Sudeste
        MG                   Minas Gerais       Belo Horizonte                   31              Sudeste
        RJ                 Rio de Janeiro       Rio de Janeiro                   33              Sudeste
        SP                      São Paulo            São Paulo                   35              Sudeste
=========================================================================================================
SUL
=========================================================================================================
        RS              Rio Grande do Sul         Porto Alegre                   43                  Sul
        SC                 Santa Catarina        Florianópolis                   42                  Sul
```
