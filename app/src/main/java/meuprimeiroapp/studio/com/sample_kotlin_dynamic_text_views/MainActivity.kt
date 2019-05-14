package meuprimeiroapp.studio.com.sample_kotlin_dynamic_text_views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import meuprimeiroapp.studio.com.entidades.Pessoa

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // recuperar o objeto dos componentes pelo id
        var txt_nome = findViewById<TextView>(R.id.txt_nome);
        var txt_idade = findViewById<TextView>(R.id.txt_idade);
        var txt_sexo = findViewById<TextView>(R.id.txt_sexo);
        var txt_tamanho_da_bunda = findViewById<TextView>(R.id.txt_tamanho_de_bunda);

        // monta classe com as informações de Pessoa
        var pessoa = Pessoa()
        pessoa.apply {
            nome = "Barbara"
            idade = 24
            sexo = "Feminino"
            tamanhoDaBunda = "Gigante"
        }

        //Insere informações de pessoa nos TextViews
        txt_nome.text = pessoa.nome
        txt_idade.text = pessoa.idade.toString()
        txt_sexo.text = pessoa.sexo
        txt_tamanho_da_bunda.text = pessoa.tamanhoDaBunda
    }
}