/**
 * Carrega uma página do ERP através da API
 * Exemplo:
 * carregarPagina("financeiro");
 * -> GET /api/sistema/financeiro
 */


async function carregarPagina(nomePagina) {

    try {

        const resposta = await fetch(
            `/api/sistema/${nomePagina}`,
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