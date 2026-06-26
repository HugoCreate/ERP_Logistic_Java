import {carregarPagina} from "./navegacao"

async function login() {

    const email = document.querySelector(
        '[name="email_in"]'
    ).value;

    const senha = document.querySelector(
        '[name="senha_in"]'
    ).value;

    const login_dto = {
        email: email,
        senha: senha
    }

    try{
        const request = await fetch('/api/login', {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(login_dto)
        });
        
        if (!resposta.ok) {
            throw new Error(
                `Erro ${resposta.status}: ${resposta.statusText}`
            );
        }else{
            carregarPagina('Dashboard');
        }

    }catch(erro){
        console.error(erro);
        alert("Erro ao cadastrar usuário.");
    }
}

async function navegarCadastro() {
    
    try {

        const resposta = await fetch(
            `/api/cadastro`,
            {
                method: "GET",
                credentials: "include",
                headers: {
                    "Content-Type": "text/html"
                }
            }
        );

        if (!resposta.ok) {
            throw new Error(
                `Erro ${resposta.status}: ${resposta.statusText}`
            );
        }

        const html = await resposta.text();

        const conteudo = document.getElementById("content-area");

        conteudo.innerHTML = html;

    }
    catch(erro) {

        console.error(erro);

        document.getElementById("content-area").innerHTML = `
            <div class="erro-container">
                <h2>Erro ao carregar página</h2>
                <p>${erro.message}</p>
            </div>
        `;
    }
}