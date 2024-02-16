function classificarTriangulo(a, b, c) {
    let mensagem;

    if (a < b + c && b < a + c && c < a + b) {
        if (a === b && b === c) {
            mensagem = "Equilátero";
        } else if (a === b || b === c || a === c) {
            mensagem = "Isósceles";
        } else {
            mensagem = "Escaleno";
        }
    } else {
        mensagem = "Não é possível formar um triângulo";
    }

    console.log(mensagem);
}

classificarTriangulo(1, 2, 3)
classificarTriangulo(3, 4, 5)
classificarTriangulo(2, 2, 4)
classificarTriangulo(4, 4, 4)
classificarTriangulo(5, 3, 3)