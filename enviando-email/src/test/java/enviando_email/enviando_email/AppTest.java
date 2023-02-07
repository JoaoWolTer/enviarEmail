package enviando_email.enviando_email;

public class AppTest {
@org.junit.Test
	public void testeEmail() throws Exception{
		
		StringBuilder stringBuilderTextoEmail = new StringBuilder();
		
	stringBuilderTextoEmail.append("Boa noite! <br/><br/>");
	stringBuilderTextoEmail.append("Tudo bem?! Espero que sim! <br/><br/>");
	stringBuilderTextoEmail.append("Clique no link!<br/><br/>");
	stringBuilderTextoEmail.append("<a target=\"_blank\" href=\"https://www.netflix.com/browse\" style=\" color:#0D9240; padding: 14px 25px; text-align:center; text-decoration: none; display:inline-block; border-radius:30px; fonte-size:20px; font-family:courier; border: 3px solid green; background-color:#9BEDBA; \"><b> Clique aqui!<b/></a>");
	
	
		ObjetoEnviaEmail enviaEmail = 
						new ObjetoEnviaEmail(
						"joaowoltermail@gmail.com",
						"WolTer", 
						"Assunto email",
						stringBuilderTextoEmail.toString());
		
		enviaEmail.enviarEmail(true);
		
	}

}
