package org.tguduru.guava.collections;

import java.util.List;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Lists;

/**
 * @author Guduru, Thirupathi Reddy
 * @modified 11/3/16.
 */
public class FluentIterableWithObjects {
    public static void main(String[] args) {
        List<Person> persons = Lists.newArrayList();
        persons.add(new Person(100,"Dhoni"));
        persons.add(new Person(200,"Kohli"));

        List<PersonResponse> personResponses = FluentIterable.from(persons).transform(new Function<Person, PersonResponse>() {


            /**
             * Returns the result of applying this function to {@code input}. This method is <i>generally
             * expected</i>, but not absolutely required, to have the following properties:
             * <p>
             * <ul>
             * <li>Its execution does not cause any observable side effects.
             * <li>The computation is <i>consistent with equals</i>; that is, {@link Objects#equal
             * Objects.equal}{@code (a, b)} implies that {@code Objects.equal(function.apply(a),
             * function.apply(b))}.
             * </ul>
             *
             * @param input
             * @throws NullPointerException if {@code input} is null and this function does not accept null
             *                              arguments
             */
            @Override
            public PersonResponse apply(Person input) {
                return new PersonResponse(input.getId(),input.getName());
            }
        }).toList();

        personResponses.forEach(System.out::println);
    }
}
