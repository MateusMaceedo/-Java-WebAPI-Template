package br.com.mali.mapper;

import org.mapstruct.Mapper;
import br.com.mali.domains.dto.CharacterRequestDTO;
import br.com.mali.domains.dto.CharacterResponseDTO;

  @Mapper(componentModel = "spring")
public interface MapStructCharacterMapper {
  	/**
	 * This method is responsible to map a character object to a character response dto object.
	 *
	 * @param character is an object.
	 * @return a character response dto object.
	 */
	CharacterResponseDTO characterToCharacterResponseDTO(Character character);

  	/**
	 * This method is responsible to map a character request dto to a character object.
	 *
	 * @param dto character response dto object.
	 * @return a character object.
	 */
	Character characterRequestToCharacter(CharacterRequestDTO dto);
}
