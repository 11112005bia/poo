
pessoa p1 = new pessoa();
p1.nome = "maria";
p1.idade = 18;
p1.sexo = 'f';
p1.cpf = "123.456.789-00";



pessoa p2 = new 'pessoa ();
p2.nome = "joao";
p2.idade = 22;
p2.cpf = "234.567.890-00";   




conta cl = new conta ();
cl.numero = "1234-5";
cl.titular = p1;// a pessoa p1 eh titular desta conta!
cl.saldo = 100.0;
cl.limite = 200.0;



conta c2 = new conta ();
c2.numero ="2345-6";// esta conta pertence 'a pessoa p2
c2.titular = p2;
c2.saldo = 200.0;



system.out.println(c1.saldo);
system.out.println(c1.titular.name);
system.out.println("saldo da conta" + c2.numero + c2.saldo);