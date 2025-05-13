//Desafio 03
let valorInvestido = 1000;
let anoDeInvestimento = 1;
const taxaJuros = 0.05;
const dobroDoValorInvestido = valorInvestido * 2;

while (valorInvestido < dobroDoValorInvestido) {
    valorInvestido = valorInvestido + valorInvestido * taxaJuros;
    anoDeInvestimento++;
}
console.log(
    "Você atingiu o dobro do valor investido em " + anoDeInvestimento + " anos"
);
