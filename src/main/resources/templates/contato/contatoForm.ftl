<@layout>
<h2><@spring.message 'novoContato' /></h2>
<form action="/contato/new" method="post">
	<div class="form-group">
		<input type="text" id="nome" name="nome" placeholder="<@spring.message 'nome' />" value="${(contato.nome)!}"> 
	</div>
	<div class="form-group">
		<input type="text" id="nome" name="email" placeholder="<@spring.message 'contatos' />" value="${(contato.email)!}">
	</div>
	<button type="submit" class="btn btn-default btn-primary"><@spring.message 'gravar' /></button>
	<a type="submit" class="btn" href="/contato"><@spring.message 'cancelar' /></a>
</form>
</@layout>
