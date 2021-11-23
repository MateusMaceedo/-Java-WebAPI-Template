package br.com.mali.domains.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CharacterRequestDTO {

  @NotBlank(message = "Must not be blank")
	@Schema(description = "This is the character's name", example = "Mateus")
	@JsonProperty("name")
	private String name;

  @NotBlank(message = "Must not be blank")
	@Schema(description = "This is the character's username", example = "mateusmacedo")
	@JsonProperty("username")
	private String username;

  @Pattern(regexp = "\\w{8}-\\w{4}-\\w{4}-\\w{4}-\\w{12}", message = "Invalid house")
	@NotBlank(message = "Must not be blank")
	@Schema(description = "This is the character's house ID", example = "1760529f-6d51-4cb1-bcb1-25087fce5bde")
	@JsonProperty("house")
	private String house;
}
