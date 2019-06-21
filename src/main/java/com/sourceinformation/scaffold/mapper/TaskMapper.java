package com.sourceinformation.scaffold.mapper;

import com.sourceinformation.scaffold.dto.TaskDTO;
import com.sourceinformation.scaffold.entities.Task;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper/*(componentModel="spring")*/
public interface TaskMapper {

//    TaskMapper MAPPER = Mappers.getMapper(TaskMapper.class);

    Task dtoToDomain(final TaskDTO task);

    TaskDTO domainToDto(final  Task task);

    List<TaskDTO> toTaskDTOs(List<Task> tasks);




}
