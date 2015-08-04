package jpabook.jpashop.domain.item;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QMovie is a Querydsl query type for Movie
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMovie extends EntityPathBase<Movie> {

    private static final long serialVersionUID = 532297816L;

    public static final QMovie movie = new QMovie("movie");

    public final QItem _super = new QItem(this);

    public final StringPath actor = createString("actor");

    //inherited
    public final ListPath<jpabook.jpashop.domain.Category, jpabook.jpashop.domain.QCategory> categories = _super.categories;

    public final StringPath director = createString("director");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    //inherited
    public final NumberPath<Integer> price = _super.price;

    //inherited
    public final NumberPath<Integer> stockQuantity = _super.stockQuantity;

    public QMovie(String variable) {
        super(Movie.class, forVariable(variable));
    }

    public QMovie(Path<? extends Movie> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMovie(PathMetadata<?> metadata) {
        super(Movie.class, metadata);
    }

}

