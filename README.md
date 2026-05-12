# fiap-poo-Aula-3

🧠 Entendendo o Código (Clean Code):
Notou que os nossos Setters (setNome, setSaldo) são PRIVATE? Isso é uma prática avançada! Em vez de deixar o programa alterar o saldo livremente usando um setSaldo(50), nós obrigamos o programa a usar métodos com regras de negócio claras: adicionarSaldo() e pagarViagem().

Resposta: Deixar os setters privados aumenta a segurança e o controle do sistema, porque impede alterações diretas nos dados importantes, como o saldo. Assim, o programa é obrigado a usar métodos específicos, como adicionarSaldo() e pagarViagem(), que aplicam regras de negócio e validações. Isso evita mudanças indevidas, mantém os dados consistentes e deixa o código mais organizado e confiável.
