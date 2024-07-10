package org.example.footballshirt.pojo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GlobalApiResponse<T> {
    private Integer status;
    private String message;
    private T data;
}
