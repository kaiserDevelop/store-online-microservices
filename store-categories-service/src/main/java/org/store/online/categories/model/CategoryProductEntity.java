package org.store.online.categories.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "categoryProduct")
@Getter
@Setter
@NoArgsConstructor
public class CategoryProductEntity {
    @Id
    private String id;
    private String categoryName;
    private String categoryDescription;
    private String categoryImageUrl;
}
