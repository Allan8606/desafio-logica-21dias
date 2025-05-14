const prompt = require("prompt-sync")();

const nomeConta1 = prompt("Digite o nome do usuario da primeira conta: ");
const nomeConta2 = prompt("Digite o nome do usuario da segunda conta: ");
let conta1 = Number(prompt("Digite o saldo da conta " + nomeConta1 + ": "));
let conta2 = Number(prompt("Digite o saldo da conta " + nomeConta2 + ": "));

let limiteContas = 0;
const taxaJuros = 0.1;
const fazerDeposito = true;

//Calcula o saldo das 2 contas
function calcularSaldoTotalDasContas() {
    const total = conta1 + conta2;
    return total;
}

//CalculaLimite
function calcularLimite(valorNaConta) {
    if (valorNaConta >= 1000) {
        limiteContas = valorNaConta * taxaJuros;
        return limiteContas;
    } else {
        console.log(
            "Você não possui limite, pois seu saldo é de apenas R$: " +
                valorNaConta
        );
    }
}

//Exibir alerta caso alguma das contas estejam sem saldo
function calcularSemSaldo() {
    if (conta1 <= 0) {
        console.log(`ATENÇÃO, A CONTA DE ${nomeConta1} ESTÁ SEM SALDO!`);
        return;
    } else if (conta2 <= 0) {
        console.log(`ATENÇÃO, A CONTA DE ${nomeConta2} ESTÁ SEM SALDO!`);
        return;
    }
    console.log("Sua conta está ok.");
}

//Fazer deposito
function fazDeposito() {
    console.log("Vocé deseja fazer um depósito? 1-Sim 2-Não");
    let respostaDeposito = Number(prompt());

    while (respostaDeposito) {
        while (respostaDeposito !== 1 && respostaDeposito !== 2) {
            console.log("Escolha uma opção valida");
            console.log("Vocé deseja fazer um depósito? 1-Sim 2-Não");
            respostaDeposito = Number(prompt());
        }
        while (isNaN(respostaDeposito)) {
            console.log("Escolha uma opção valida");
            console.log("Vocé deseja fazer um depósito? 1-Sim 2-Não");
            respostaDeposito = Number(prompt());
        }

        while (respostaDeposito === 1) {
            console.log("Qual conta vocé deseja depositar?");
            console.log("1-" + nomeConta1 + " 2-" + nomeConta2);
            const contaEscolhidaParaDeposito = Number(prompt());

            while (isNaN(contaEscolhidaParaDeposito)) {
                console.log("Escolha uma opção valida");
                console.log("Qual conta vocé deseja depositar?");
                console.log("1-" + nomeConta1 + " 2-" + nomeConta2);
                contaEscolhidaParaDeposito = Number(prompt());
            }

            if (contaEscolhidaParaDeposito === 1) {
                console.log("Qual valor vocé deseja depositar?");
                const valorDeposito = Number(prompt());
                conta1 = conta1 + valorDeposito;
                console.log("Deposito realizado com sucesso!");
                console.log("------------------------------");

                console.log("Você deseja fazer outro depósito? 1-Sim 2-Não ");
                respostaDeposito = Number(prompt());
            }

            if (contaEscolhidaParaDeposito === 2) {
                console.log("Qual valor vocé deseja depositar?");
                const valorDeposito = Number(prompt());
                conta2 = conta2 + valorDeposito;
                console.log("Deposito realizado com sucesso!");
                console.log("------------------------------");

                console.log("Você deseja fazer outro depósito? 1-Sim 2-Não ");
                respostaDeposito = Number(prompt());
            }
        }

        console.log("Saindo...");
        return;
    }
}

function principal() {
    console.log(
        `A conta conjunta de ${nomeConta1} e ${nomeConta2} tem um total de R$ ${calcularSaldoTotalDasContas()}`
    );

    console.log("------------------------------");

    calcularLimite(calcularSaldoTotalDasContas());

    if (limiteContas > 0) {
        console.log(
            `De arcordo com os saldos, as contas tem um limite compartilhado de 10%, que equivale R$: ${calcularLimite(
                calcularSaldoTotalDasContas()
            )}`
        );
    }

    console.log("------------------------------");

    calcularSemSaldo();

    console.log("------------------------------");

    fazDeposito();
}

principal();
