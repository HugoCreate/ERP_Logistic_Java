

async function cadastrarUsuarioJs() {
    
    const nomeCompleto = 
        document.querySelector(
            '[name="nomeCompleto"]'
        ).value;
    
    const email = 
        document.querySelector(
            '[name="email"]'
        ).value;
    
    const cargo = 
        document.querySelector(
            '[name="cargo"]'
        ).value;
    
    const senha = 
        document.querySelector(
            '[name="senha"]'
        ).value;
    
    const confirmarSenha = 
        document.querySelector(
            '[name="confirmarSenha"]'
        ).value;

    if(senha !== confirmarSenha){

        alert(
            "As senhas não coincidem."
        );
    }

    const usuario = {
        nome : nomeCompleto,
        nivel_acesso : cargo,
        email : email,
        senha_hash : senha
    }

    try{
       
        const resposta = await fetch('/api/cadastro', {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(usuario)
        });

        if(!resposta.ok){
            throw new Error("Falha no cadastro");
        }

        alert("Usuário cadastrado com sucesso! Vá para a área de login para entrar no ERP.");

    }catch(erro){
        console.error(erro);
        alert("Erro ao cadastrar usuário.");
    }


}

async function navegarLogin() {
    
    try {

        const resposta = await fetch(
            `/api/login`,
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