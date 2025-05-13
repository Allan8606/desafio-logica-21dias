//Desafio 01
function calculaIMC(peso, altura) {
    const imc = peso / Math.pow(altura, 2);
    return imc.toFixed(2);
}

console.log(calculaIMC(84, 1.78));

//Desafio 02
function obterDiaDasemana(diaDaSemana) {
    switch (diaDaSemana) {
        case 1:
            return "Domingo";
        case 2:
            return "Segunda-Feira";

        case 3:
            return "Terça-Feira";

        case 4:
            return "Quarta-Feira";

        case 5:
            return "Quinta-Feira";

        case 6:
            return "Sexta-Feira";

        case 7:
            return "Sábado";

        default:
            return "Numero invalio";
    }
}

console.log(obterDiaDasemana(3));

//Desafio 03
function obterDobroDoinvestimento(valor, taxaJuros) {
    let anoDeInvestimento = 1;
    const dobroDoValorInvestido = valor * 2;

    while (valor < dobroDoValorInvestido) {
        valor = valor + valor * taxaJuros;
        anoDeInvestimento++;
    }
    return (
        "Você atingiu o dobro do valor investido em " +
        anoDeInvestimento +
        " anos"
    );
}

console.log(obterDobroDoinvestimento(1000, 0.05));
