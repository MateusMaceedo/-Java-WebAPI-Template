package br.com.mali.domains.dto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CharacterResponseDTO implements Serializable {
	private static final long serialVersionUID = 1L;

  @Schema(description = "This is the character's id", example = "1")
	@JsonProperty("id")
	private Long id;

  @Schema(description = "This is the character's name", example = "Mateus Macedo")
	@JsonProperty("name")
	private String name;

  @Schema(description = "This is the character's username", example = "mateusmacedo")
	@JsonProperty("username")
	private String username;

  @Schema(description = "This is the character's house ID", example = "1760529f-6d51-4cb1-bcb1-25087fce5bde")
	@JsonProperty("house")
	private String house;

  @Schema(description = "This is the character's email", example = "mateusouza2014@live.com")
	@JsonProperty("email")
	private String email;
}
