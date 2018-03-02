package store.newstep.newstepstore.model

/**
 * Created by wyacheslav on 27.02.18.
 * Товар
 */
class Product(
        val name: String = "name",
        val price: Int = 100,
        val category: Category = Category(),
        val linkOnImage: String = "http://www.superheroes.ru/i/p/SNA34103_00.jpg")