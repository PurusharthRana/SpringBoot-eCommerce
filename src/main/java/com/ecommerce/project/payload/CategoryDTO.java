package com.ecommerce.project.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {

    private Long categoryId;
    private String categoryName;

}

/* Category model represents data at the database level while CategoryDTO represents data
   at the presentation layer and to do a transition from reliance over Category model for
   response to the CategoryDTO model for getting custom response on Postman, we require
   something known as MODEL MAPPER which will map the objects of these two models so that
   we don't need to write custom logic for the same.
   Hence, the goal of Model mapper is to make object mapping easy so that two models remain
   segregated. */
