package br.sp.etec.sebrae.api_login.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType

@Entity
class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
    var nome: String? = null
    var email: String? = null
    var telefone: String? = null
    var senha: String? = null
    var cpf: String? = null

}