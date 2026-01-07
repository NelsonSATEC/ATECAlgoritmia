package TrabalhoPraticoAlgoritmia;

import java.util.Scanner;

public class GestaoStocks {

    public static void main(String[] args) {

            //ler dados do utilizador.
            Scanner input = new Scanner(System.in);

            //declarar stock em função de loja e produto.
            int stockL01_001 = 0, stockL01_002 = 0, stockL01_003 = 0, stockL01_004 = 0, stockL02_001 = 0, stockL02_002 = 0, stockL02_003 = 0, stockL02_004 = 0;

            //declarar variável loja para login (iniciada a -1 porque 0, 1 e 2 são valores de menu).
            int loja = -1;

            //declarar variável para menu de opções de stock.
            int opcao;

            //declarar variável password para login.
            int pw1 = -1, pw2 = -2;

            //declaração de cálculo de valor total de cada uma das lojas;
            int valorLoja_01 = (stockL01_001 * 70) + (stockL01_002 * 60) + (stockL01_003 * 40) + (stockL01_004 * 40);
            int valorLoja_02 = (stockL02_001 * 70) + (stockL02_002 * 60) + (stockL02_003 * 40) + (stockL02_004 * 40);

            //ciclo exterior para voltar ao menu login depois desair do meu de gestão.
            while (true) {

                //apresentar Menu de Login.
                do {
                    System.out.println("1. Login LOJA_01:");
                    System.out.println("2. Login LOJA_02:");
                    System.out.println("0. Sair:");
                    System.out.println("Escolha o número da opção correspondente:");
                    //definição do caractér a escolher do menu.
                    loja = input.nextInt();

                    //associar os números das opções às respetivas acções.
                    switch (loja) {

                        //com a opção 0 ele vai fechar o programa.
                        case 0:
                            System.out.println("Programa terminado.");
                            input.close();
                            return;


                        // escolhe a LOJA_01 e define a condição da password associada para login falhado. Se acertar a password irá diretamente para o Menu de Gestão.
                        case 1:
                            System.out.println("Coloque a Password:");
                            pw1 = input.nextInt();
                            if (pw1 != 12341) {
                                loja = -1;
                                System.out.println("Password incorrecta, tente novamente!");
                            }
                            break;

                        // escolhe a LOJA_01 e define a condição da password associada para login falhado. Se acertar a password irá diretamente para o Menu de Gestão.
                        case 2:
                            System.out.println("Coloque a Password:");
                            pw2 = input.nextInt();
                            if (pw2 != 12342) {
                                loja = -1;
                                System.out.println("Password incorrecta, tente novamente!");
                            }
                            break;
                    }

                    //ficará neste ciclo até que acerte na password.
                } while (loja == -1);

                System.out.println(" ");

                System.out.println("LOJA_0" + loja);
                System.out.println("-----------------------------------");

                //inicio do ciclo do menu de gestão com as opções.
                do {
                    System.out.println("1. Consultar Informações");
                    System.out.println("2. Adquirir");
                    System.out.println("3. Vender");
                    System.out.println("4. Transferir Stock entre Lojas");
                    System.out.println("5. Simular Venda Total – Loja Atual");
                    System.out.println("6. Simular Venda Total – Todas Lojas");
                    System.out.println("7. Loja com Maior Valor");
                    System.out.println("8. Logout");
                    System.out.println(" ");
                    System.out.print("Escolha o número da opção desejada: ");

                    //definição da opção como o próximo caractere a ser introduzido pelo utilizador.
                    opcao = input.nextInt();

                    System.out.println(" ");

                    //associar os números das opções às respetivas acções.
                    switch (opcao) {
                        case 1:
                            //definição do resultado da esoolha de consulta de informações, especificamente para a LOJA_01.
                            if (loja == 1) {
                                System.out.println("Produtos LOJA_01: Código, Nome, Preço, Categoria, Stock:");
                                System.out.println(" ");
                                System.out.println("001, The Last of Us Part I & Part II Remastered, 70 €, Jogos, " + stockL01_001 + " unidades");
                                System.out.println("002, God of War Ragnarok, 60 €, Jogos, " + stockL01_002 + " unidades");
                                System.out.println("003, Days Gone, 40 €, Jogos, " + stockL01_003 + " unidades");
                                System.out.println("004, Hogswarts Legacy, 40 €, Jogos, " + stockL01_004 + " unidades");
                                //definição do resultado da esoolha de consluta de informações, especificamente para a LOJA_02.
                            } else {
                                System.out.println("Produtos LOJA_02: Código, Nome, Preço, Categoria, Stock:");
                                System.out.println(" ");
                                System.out.println("001, The Last of Us Part I & PartII Remastered, 70 €, Jogos, " + stockL02_001 + " unidades");
                                System.out.println("002, God of War Ragnarok, 60 €, Jogos, " + stockL02_002 + " unidades");
                                System.out.println("003, Days Gone, 40 €, Jogos, " + stockL02_003 + " unidades");
                                System.out.println("004, Hogswarts Legacy, 50 €, Jogos, " + stockL01_004 + " unidades");
                            }
                            break;

                        case 2:
                            //definição do resultado da esoolha de consulta de informações, especificamente para a LOJA_01.
                            System.out.println("Adquirir Stock:");
                            if (loja == 1) {
                                System.out.println("Selecionar o artigo a adquirir:");
                                System.out.println("001, The Last of Us Part I & Part II Remastered");
                                System.out.println("002, God of War Ragnarok");
                                System.out.println("003, Days Gone");
                                System.out.println("004, Hogswarts Legacy");


                                System.out.println("Código do Produto:");
                                //definição da variável código.
                                int codigo = input.nextInt();

                                System.out.println("Quantidade a encomendar:");
                                //definição da variável quantidade.
                                int qtd = input.nextInt();

                                //associar os números das opções aos respetivos produtos.
                                switch (codigo) {
                                    //acrescenta produtos ao stock, representando assim a compra.
                                    case 001:
                                        stockL01_001 = stockL01_001 + qtd;
                                        System.out.println("Novo stock 001 = " + stockL01_001);
                                        break;

                                    case 002:
                                        stockL01_002 = stockL01_002 + qtd;
                                        System.out.println("Novo stock 002 = " + stockL01_002);
                                        break;

                                    case 003:
                                        stockL01_003 = stockL01_003 + qtd;
                                        System.out.println("Novo stock 003 = " + stockL01_003);
                                        break;

                                    case 004:
                                        stockL01_004 = stockL01_004 + qtd;
                                        System.out.println("Novo stock 004 = " + stockL01_004);
                                        break;

                                    default:
                                        System.out.println("Código Inválido.");
                                }

                            }

                            //mudança de loja.
                            if (loja == 2) {
                                System.out.println("Selecionar o artigo a adquirir:");
                                System.out.println("001, The Last of Us Part I & Part II Remastered");
                                System.out.println("002, God of War Ragnarok");
                                System.out.println("003, Days Gone");
                                System.out.println("004, Hogswarts Legacy");

                                System.out.println("Código do Produto:");
                                int codigo = input.nextInt();

                                System.out.println("Quantidade a encomendar:");
                                int qtd = input.nextInt();

                                switch (codigo) {
                                    case 001:
                                        stockL02_001 = stockL02_001 + qtd;
                                        System.out.println("Novo stock 001 = " + stockL02_001);
                                        break;

                                    case 002:
                                        stockL02_002 = stockL02_002 + qtd;
                                        System.out.println("Novo stock 002 = " + stockL02_002);
                                        break;

                                    case 003:
                                        stockL02_003 = stockL02_003 + qtd;
                                        System.out.println("Novo stock 003 = " + stockL02_003);
                                        break;

                                    case 004:
                                        stockL02_004 = stockL02_004 + qtd;
                                        System.out.println("Novo stock 004 = " + stockL02_004);
                                        break;

                                    default:
                                        System.out.println("Código Inválido.");
                                }

                            }
                            break;

                        case 3:
                            System.out.println("Vender Stock:");
                            if (loja == 1) {
                                System.out.println("001, The Last of Us Part I & Part II Remastered (stock: " + stockL01_001 + ")");
                                System.out.println("002, God of War Ragnarok (stock: " + stockL01_002 + ")");
                                System.out.println("003, Days Gone (stock: " + stockL01_003 + ")");
                                System.out.println("004, Hogswarts Legacy (stock: " + stockL01_004 + ")");

                                System.out.print("Código do produto: ");
                                int codigo = input.nextInt();

                                System.out.println("Quantidade a vender:");
                                int qtd = input.nextInt();

                                switch (codigo) {
                                    case 001:
                                        //retira produtos ao stock, representando assim a venda.
                                        if (qtd <= stockL01_001 && qtd > 0) {
                                            stockL01_001 = stockL01_001 - qtd;
                                            System.out.println("Novo Stock 001 = " + stockL01_001);
                                        } else {
                                            System.out.println("Stock insuficiente ou número inválido!");
                                        }
                                        break;

                                    case 002:
                                        if (qtd <= stockL01_002 && qtd > 0) {
                                            stockL01_002 = stockL01_002 - qtd;
                                            System.out.println("Novo Stock 002 = " + stockL01_002);
                                        } else {
                                            System.out.println("Stock insuficiente ou número inválido!");
                                        }
                                        break;

                                    case 003:
                                        if (qtd <= stockL01_003 && qtd > 0) {
                                            stockL01_003 = stockL01_003 - qtd;
                                            System.out.println("Novo Stock 003 = " + stockL01_003);
                                        } else {
                                            System.out.println("Stock insuficiente ou número inválido!");
                                        }
                                        break;

                                    case 004:
                                        if (qtd <= stockL01_004 && qtd > 0) {
                                            stockL01_004 = stockL01_004 - qtd;
                                            System.out.println("Novo Stock 004 = " + stockL01_004);
                                        } else {
                                            System.out.println("Stock insuficiente ou número inválido!");
                                        }
                                        break;

                                    default:
                                        System.out.println("Código Inválido.");
                                }


                            } else {

                                if (loja == 2) {
                                    System.out.println("001, The Last of Us Part I & Part II Remastered (stock: " + stockL02_001 + ")");
                                    System.out.println("002, God of War Ragnarok (stock: " + stockL02_002 + ")");
                                    System.out.println("003, Days Gone (stock: " + stockL02_003 + ")");
                                    System.out.println("004, Hogswarts Legacy (stock: " + stockL02_004 + ")");

                                    System.out.print("Código do produto: ");
                                    int codigo = input.nextInt();

                                    System.out.println("Quantidade a vender:");
                                    int qtd = input.nextInt();

                                    switch (codigo) {
                                        case 001:
                                            if (qtd <= stockL02_001 && qtd > 0) {
                                                stockL02_001 = stockL02_001 - qtd;
                                                System.out.println("Novo Stock 001 = " + stockL02_001);
                                            } else {
                                                System.out.println("Stock insuficiente ou número inválido!");
                                            }
                                            break;

                                        case 002:
                                            if (qtd <= stockL02_002 && qtd > 0) {
                                                stockL02_002 = stockL02_002 - qtd;
                                                System.out.println("Novo Stock 002 = " + stockL02_002);
                                            } else {
                                                System.out.println("Stock insuficiente ou número inválido!");
                                            }
                                            break;

                                        case 003:
                                            if (qtd <= stockL02_003 && qtd > 0) {
                                                stockL02_003 = stockL02_003 - qtd;
                                                System.out.println("Novo Stock 003 = " + stockL02_003);
                                            } else {
                                                System.out.println("Stock insuficiente ou número inválido!");
                                            }
                                            break;

                                        case 004:
                                            if (qtd <= stockL02_004 && qtd > 0) {
                                                stockL02_004 = stockL02_004 - qtd;
                                                System.out.println("Novo Stock 004 = " + stockL02_004);
                                            } else {
                                                System.out.println("Stock insuficiente ou número inválido!");
                                            }
                                            break;

                                        default:
                                            System.out.println("Código Inválido.");

                                    }
                                }

                            }

                            break;

                        case 4:
                            System.out.println("Transferir Stock:");

                            if (loja == 1) {
                                System.out.println("Transferir LOJA_01 para LOJA_02");
                                System.out.println("001, The Last of Us Part I & Part II Remastered (stock: " + stockL01_001 + ")");
                                System.out.println("002, God of War Ragnarok (stock: " + stockL01_002 + ")");
                                System.out.println("003, Days Gone (stock: " + stockL01_003 + ")");
                                System.out.println("004, Hogswarts Legacy (stock: " + stockL01_004 + ")");

                                System.out.print("Código do produto: ");
                                int codigo = input.nextInt();

                                System.out.println("Quantidade a vender:");
                                int qtd = input.nextInt();

                                switch (codigo) {
                                    //retira de uma loja e acrescenta a mesma quantidade na outra.
                                    case 001:
                                        if (qtd <= stockL01_001 && qtd > 0) {
                                            stockL01_001 = stockL01_001 - qtd;
                                            stockL02_001 = stockL02_001 + qtd;
                                            System.out.println("001 Transferido. 001 LOJA_01: " + stockL01_001 + "unidades" + ", LOJA_02: " + stockL02_001 + "unidades");
                                        } else {
                                            System.out.println("Stock insuficiente na LOJA_01!");
                                        }
                                        break;

                                    case 002:
                                        if (qtd <= stockL01_002 && qtd > 0) {
                                            stockL01_002 = stockL01_002 - qtd;
                                            stockL02_002 = stockL02_002 + qtd;
                                            System.out.println("002 Transferido. 002 LOJA_01: " + stockL01_002 + "unidades" + ", LOJA_02: " + stockL02_002 + "unidades");
                                        } else {
                                            System.out.println("Stock insuficiente na LOJA_01!");
                                        }
                                        break;

                                    case 003:
                                        if (qtd <= stockL01_003 && qtd > 0) {
                                            stockL01_003 = stockL01_003 - qtd;
                                            stockL02_003 = stockL02_003 + qtd;
                                            System.out.println("003 Transferido. 003 LOJA_01: " + stockL01_003 + "unidades" + ", LOJA_02: " + stockL02_003 + "unidades");
                                        } else {
                                            System.out.println("Stock insuficiente na LOJA_01!");
                                        }
                                        break;

                                    case 004:
                                        if (qtd <= stockL01_004 && qtd > 0) {
                                            stockL01_004 = stockL01_004 - qtd;
                                            stockL02_004 = stockL02_004 + qtd;
                                            System.out.println("004 Transferido. 004 LOJA_01: " + stockL01_004 + "unidades" + ", LOJA_02: " + stockL02_004 + "unidades");
                                        } else {
                                            System.out.println("Stock insuficiente na LOJA_01!");
                                        }
                                        break;

                                    default:
                                        System.out.println("Código inválido.");
                                }
                            } else {
                                System.out.println("Transferir Loja_02 para Loja_01");
                                System.out.println("001, The Last of Us Part I & PartII Remastered (stock: " + stockL02_001 + ")");
                                System.out.println("002, God of War Ragnarok (stock: " + stockL02_002 + ")");
                                System.out.println("003, Days Gone (stock: " + stockL02_003 + ")");
                                System.out.println("004, Hogswarts Legacy (stock: " + stockL02_004 + ")");

                                System.out.print("Código do produto: ");
                                int codigo = input.nextInt();

                                System.out.println("Quantidade a vender:");
                                int qtd = input.nextInt();

                                switch (codigo) {
                                    case 001:
                                        if (qtd <= stockL02_001 && qtd > 0) {
                                            stockL02_001 = stockL02_001 - qtd;
                                            stockL01_001 = stockL01_001 + qtd;
                                            System.out.println("001 Transferido. 001 LOJA_02: " + stockL02_001 + "unidades" + ", LOJA_01: " + stockL01_001 + "unidades");
                                        } else {
                                            System.out.println("Stock insuficiente na LOJA_01!");
                                        }
                                        break;

                                    case 002:
                                        if (qtd <= stockL02_002 && qtd > 0) {
                                            stockL02_002 = stockL02_002 - qtd;
                                            stockL01_002 = stockL01_002 + qtd;
                                            System.out.println("002 Transferido. 002 LOJA_02: " + stockL02_002 + "unidades" + ", LOJA_01: " + stockL01_002 + "unidades");
                                        } else {
                                            System.out.println("Stock insuficiente na LOJA_02!");
                                        }
                                        break;

                                    case 003:
                                        if (qtd <= stockL02_003 && qtd > 0) {
                                            stockL02_003 = stockL02_003 - qtd;
                                            stockL01_003 = stockL01_003 + qtd;
                                            System.out.println("003 Transferido. 003 LOJA_02: " + stockL02_003 + "unidades" + ", LOJA_01: " + stockL01_003 + "unidades");
                                        } else {
                                            System.out.println("Stock insuficiente na LOJA_02!");
                                        }
                                        break;

                                    case 004:
                                        if (qtd <= stockL02_004 && qtd > 0) {
                                            stockL02_004 = stockL02_004 - qtd;
                                            stockL01_004 = stockL01_004 + qtd;
                                            System.out.println("004 Transferido. 004 LOJA_02: " + stockL02_004 + "unidades" + ", LOJA_01: " + stockL01_004 + "unidades");
                                        } else {
                                            System.out.println("Stock insuficiente na LOJA_02!");
                                        }
                                        break;

                                    default:
                                        System.out.println("Código inválido.");
                                }
                            }
                            break;

                        case 5:
                            System.out.println("Simular Venda Total - Loja Atual");
                            //soma do stock de uma loja multiplicado pelo preço para que seja calculado o valor total de cada loja.
                            if (loja == 1) {
                                valorLoja_01 = (stockL01_001 * 70) + (stockL01_002 * 60) + (stockL01_003 * 40) + (stockL01_004 * 40);
                                System.out.println("A simulação da venda da Loja_01 dá " + valorLoja_01 + "€");
                            } else {
                                valorLoja_02 = (stockL02_001 * 70) + (stockL02_002 * 60) + (stockL02_003 * 40) + (stockL02_004 * 40);
                                System.out.println("A simulação da venda da Loja_02 dá " + valorLoja_02 + "€");
                            }
                            break;

                        case 6:
                            //soma dos totais das 2 lojas para o valor total conjunto.
                            System.out.println("Simular Venda Total de Todas as Lojas");
                            int totalLojas = valorLoja_01 + valorLoja_02;
                            System.out.println("LOJA_01: " + valorLoja_01 + "€");
                            System.out.println("LOJA_02: " + valorLoja_02 + "€");
                            System.out.println("O total das lojas é de : " + totalLojas + " €");
                            break;

                        case 7:
                            System.out.println("Loja de maior valor");
                            System.out.println("LOJA_01: " + valorLoja_01 + "€");
                            System.out.println("LOJA_02: " + valorLoja_02 + "€");

                            //condições para definir qual a loja com o valor superior;
                            if (valorLoja_01 > valorLoja_02) {
                                System.out.println("A Loja_01 tem maior valor");
                            } else if (valorLoja_02 > valorLoja_01) {
                                System.out.println("A Loja_02 tem maior valor");
                            } else {
                                System.out.println("As Lojas têm o mesmo valor");
                            }
                            break;

                        //tecla para saida do ciclo deste menu;
                        case 8:
                            System.out.println("Logout efetuado com sucesso!");
                            break;

                        default:
                            System.out.println("Opção Inválida.");
                    }
                } while (opcao != 8);
                //saindo desde ciclo retorna ao ciclo anterior escrito acima.
            }
        }
    }
