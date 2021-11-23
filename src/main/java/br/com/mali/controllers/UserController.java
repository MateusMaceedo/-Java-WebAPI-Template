package br.com.mali.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.mali.model.User;
import br.com.mali.service.CharacterService;
import io.swagger.v3.oas.annotations.Operation;
import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

@Validated
@RestController
@RequestMapping(path = "/users")
public class UserController {

  private List<User> users = new ArrayList<>();
  private CharacterService service;

  @Autowired
  public UserController(CharacterService service){
    this.service = service;
  }

  	/** @Cadastro
	 * Cria um novo objeto de usuarios, de acordo com os dados fornecidos.
	 *
	 * Retorna um dos seguintes códigos de status:
	 * 200: criado com sucesso um novo usuario
   * 404: impossivel criar um novo usuario, somente usuarios acima de 18 anos serão cadatrados
   * 400: não é permitido usuarios como o email e CPF duplicados
	 *
	 * @param house house past by request param para filtrar os resultados por este parâmetro.
	 * @return uma lista de usuarios.
	 */
  @PostMapping("/")
  @Operation(summary = "Save a Character on BD", description = "Saves a character if the house id is right.")
  public User user(@RequestBody User user){
    users.add(user);
    return user;
  }

  @GetMapping("/list")
  public List<User> list(){
    return users;
  }

  	/** @Atualização
	 * Replace the informations about one character in the database.
	 *
	 * Returns one of the following status code:
	 * 200: sucessfully update the informations of the character.
	 * 404: unable to update the character, because didn't found any register with this id.
	 *
	 * @param dto a JSON representation of a character object.
	 * @param id past by path variable.
	 * @return an updated character object.
	 */

  	/** @Busca de um unico recurso
	 * Pegue todos os usuarios salvos no banco de dados e retorne todos os personagens com banse no ID.
	 *
	 * Retorna um dos seguintes códigos de status:
	 * 200: retorna com sucesso uma lista de caracteres.
   * 201: Quando buscar por varios usuarios, deve permitir realizar um filtro pelo nome;
	 *
	 * @param house house past by request param para filtrar os resultados por este parâmetro.
	 * @return uma lista de usuarios.
	 */

  @GetMapping("/{id}")
  @Operation(summary = "Get All Characters", description = "By default returns all saved characters.")
  public User user(@PathVariable("id") Long id) {

    Optional<User> userFind = users.stream().filter(user -> user.getId() == id).findFirst();

    if (userFind.isPresent()) {
      return userFind.get();
    }

    return null;
  }

  	/** @Busca de varios recursos
	 * Replace the informations about one character in the database.
	 *
	 * Returns one of the following status code:
	 * 200: sucessfully update the informations of the character.
	 * 404: unable to update the character, because didn't found any register with this id.
	 *
	 * @param dto a JSON representation of a character object.
	 * @param id past by path variable.
	 * @return an updated character object.
	 */
}
