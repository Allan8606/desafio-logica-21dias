let contaAllan = 1000
let contaRoberta = 500
let limiteContas = 0
const taxaJuros = 0.10


//Calcula o saldo das 2 contas
function calcularSaldoTotalDasContas(conta1, conta2) {
    return contaAllan + contaRoberta
}

//CalculaLimite
function calcularLimite (valorNaConta){
    if (valorNaConta >= 1000 ) {
        limiteContas = valorNaConta * 0.10
        return limiteContas
    }
}

//Exibir alerta caso alguma das contas estejam sem saldo
function calcularSemSaldo(conta1, conta2) {
    if (conta1 <= 0 || conta2 <= 0 ) {
        console.log( "ATENÇÃO!!! Alguma das suas contas está com saldo zerado")
        return
    }
        console.log ("Sua conta está ok.")
}

//Fazer deposito
function fazDeposito(conta1, conta2) {
    
}

function principal() {
    console.log("Sua conta tem um total de R$: " + calcularSaldoTotalDasContas(contaAllan,contaRoberta));

    console.log("------------------------------");
    
    console.log("De arcordo com seu saldo, as contas tem um limite compartilhado de 10%, que equivale R$: " + calcularLimite(calcularSaldoTotalDasContas()));

    console.log("------------------------------");

    calcularSemSaldo(contaAllan, contaRoberta)

    console.log("------------------------------");
    
    


    
    
}

principal()





