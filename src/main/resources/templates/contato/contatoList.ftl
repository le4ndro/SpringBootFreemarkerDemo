<@layout>
	<h2> <@spring.message "contatos" /> </h2>
	<table class="table table-hover">
		<thead>
			<tr>
				<th><@spring.message "nome" /></th>
				<th><@spring.message "email" /></th>
			</tr>
		</thead>
		<tbody>			
		<#list contatos as contato>
			<tr>
				<td>${(contato.nome)!}</td>   
				<td>${(contato.email)!}</td> 
			</tr>  
		</#list>
		</tbody>
	</table>
	<br>
	<a href="/contato/new" class="btn btn-default btn-primary"><@spring.message "novoContato" /></a> 
</@layout>