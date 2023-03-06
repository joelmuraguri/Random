package com.joel.random.data

import com.joel.random.R

object DataStore {

    val randomItemsList = listOf(
        RandomItems(
            id = 1,
            title = "White Walkers",
            description = "A White Walker is a humanoid creature from the HBO television series Game of Thrones, and the George R. R. Martin novel series A Song of Ice and Fire on which it is based. Primarily referred to as the Others in the novels, White Walkers are a supernatural threat to mankind who dwell north of The Wall in Westeros.",
            image = R.drawable.white_walkers
        ),
        RandomItems(
            id = 2,
            title = "Fire Lord Ozai",
            description = "Ozai (also known as Fire Lord Ozai or the Phoenix King) is a fictional character and the main antagonist in Nickelodeon's animated series Avatar: The Last Airbender. Though once shown behind the scenes than recurringly, he is nevertheless an important character in the series as he is the father of Azula and Zuko.",
            image = R.drawable.fire_lord_ozai
        ),
        RandomItems(
            id = 3,
            title = "Omni Man",
            description = "Omni-Man (Nolan Grayson) is a fictional character in the Image Universe, created by writer Robert Kirkman and artist Cory Walker (with Ryan Ottley) as an expansion of a character concept created by Alan Moore and Chris Sprouse. Omni-Man is the father of Invincible and a member of the Viltrumite race, a humanoid species of extraterrestrial origin who possess immense powers, working as a superhero on Earth. As is customary for males of his species, Omni-Man sports a large moustache. Omni-Man appears in Supreme, Invincible, Noble Causes, and Dynamo 5.",
            image = R.drawable.omni_man
        ),
        RandomItems(
            id = 4,
            title = "General Zod",
            description = "eneral Zod is a supervillain appearing in American comic books published by DC Comics, commonly known as an adversary of the superhero Superman. The character, who first appeared in Adventure Comics #283, was created by Robert Bernstein and initially designed by George Papp. ",
            image = R.drawable.general_zod
        ),
        RandomItems(
            id = 5,
            title = "Thanos",
            description = "Thanos is a supervillain appearing in American comic books published by Marvel Comics. Created by writer-artist Jim Starlin, the character first appeared in The Invincible Iron Man #55. An Eternal–Deviant warlord from the moon Titan, Thanos is regarded as one of the most powerful beings in the Marvel Universe.",
            image = R.drawable.thanos
        ),
        RandomItems(
            id = 6,
            title = "Dr Hugo Strange",
            description = "Hugo Strange is a supervillain appearing in comic books published by DC Comics, commonly as an adversary of the superhero Batman. The character is one of Batman's first recurring villains and is also one of the first to discover his secret identity. The character first appeared in Detective Comics #36.",
            image = R.drawable.hugo_strange
        ),
        RandomItems(
            id = 7,
            title = "Zaheer",
            description = "Zaheer is a character in Nickelodeon's animated television series The Legend of Korra. He serves as the main antagonist of Book Three: Change, and his actions have lingering effects on Avatar Korra and the series' plot in the following book.",
            image = R.drawable.zaheer
        ),
        RandomItems(
            id = 8,
            title = "Kang ",
            description = "Kang the Conqueror is a supervillain appearing in American comic books published by Marvel Comics. The character is most frequently depicted as an opponent of the Avengers and the Fantastic Four.",
            image = R.drawable.kang_the_conqueror,

            ),
        RandomItems(
            id = 9,
            title = "Kill Monger",
            description = "Erik Killmonger is a supervillain appearing in American comic books published by Marvel Comics. Created by Don McGregor and Rich Buckler, he first appeared in Jungle Action #6.",
            image = R.drawable.kill_monger
        ),
        RandomItems(
            id = 10,
            title = "Joker",
            description = "The Joker is a supervillain appearing in American comic books published by DC Comics. The character was created by Bill Finger, Bob Kane, and Jerry Robinson, and first appeared in the debut issue of the comic book Batman on April 25, 1940.",
            image = R.drawable.joker
        ),
        RandomItems(
            id = 11,
            title = "HomeLander",
            description = "Homelander is the leader of The Seven, The strongest Supe in the world, and the archenemy of Billy Butcher, the leader of The Boys. With the face of a movie star and the power of a god, Homelander is considered the greatest superhero alive. Not only can he fly, but he possesses super hearing, super strength and super durability far beyond most supes, and can see through anything except for zinc with his X-ray vision, as well as being able to burn and cut through things by shooting a red-colored beam of heat energy from out of his eyes.\n" +
                    "\n" +
                    "On the surface, he's affable, modest, and sincere; the ultimate Boy Scout, an American treasure, a God-fearing patriot, but just like mere mortals; even superheroes have secrets.",
            image = R.drawable.homelander

        ),



        RandomItems(
            id = 12,
            title = "Kotlin",
            description = "Kotlin is a cross-platform, statically typed, general-purpose high-level programming language with type inference. Kotlin is designed to interoperate fully with Java, and the JVM version of Kotlin's standard library depends on the Java Class Library, but type inference allows its syntax to be more concise",
            image = R.drawable.kotlin
        ),
        RandomItems(
            id = 13,
            title = "Gradle",
            image = R.drawable.gradle,
            description = "Gradle is a build automation tool for multi-language software development. It controls the development process in the tasks of compilation and packaging to testing, deployment, and publishing. Supported languages include Java, C/C++, and JavaScript."
        ),
        RandomItems(
            id = 14,
            title = "Jetpack Compose",
            image = R.drawable.jetpack_compose,
            description = "Jetpack Compose is Android’s recommended modern toolkit for building native UI. It simplifies and accelerates UI development on Android. Quickly bring your app to life with less code, powerful tools, and intuitive Kotlin APIs."
        ),
        RandomItems(
            id = 15,
            title = "Firebase",
            image = R.drawable.firebase,
            description = "Firebase is a set of hosting services for any type of application. It offers NoSQL and real-time hosting of databases, content, social authentication, and notifications, or services, such as a real-time communication server."
        ),
        RandomItems(
            id = 16,
            title = "Coil",
            image = R.drawable.coil,
            description = "An image loading library for Android backed by Kotlin Coroutines. Coil is:\n" +
                    "\n" +
                    "Fast: Coil performs a number of optimizations including memory and disk caching, downsampling the image in memory, automatically pausing/cancelling requests, and more.\n" +
                    "Lightweight: Coil adds ~2000 methods to your APK (for apps that already use OkHttp and Coroutines), which is comparable to Picasso and significantly less than Glide and Fresco.\n" +
                    "Easy to use: Coil's API leverages Kotlin's language features for simplicity and minimal boilerplate.\n" +
                    "Modern: Coil is Kotlin-first and uses modern libraries including Coroutines, OkHttp, Okio, and AndroidX Lifecycles.\n" +
                    "Coil is an acronym for: Coroutine Image Loader."
        ),
        RandomItems(
            id = 17,
            title = "Ktor",
            image = R.drawable.ktor,
            description = "Ktor is built from the ground up using Kotlin and Coroutines. You get to use a concise, multiplatform language, as well as the power of asynchronous programming with an intuitive imperative flow."
        ),




//        RandomItems(
//            id = 18,
//            title = "Kenya",
//            description = "",
//            image = "\uD83C\uDDF0\uD83C\uDDEA".toInt()
//        ),
//        RandomItems(
//            id = 19,
//            title = "Italy",
//            description = "",
//            image = "\uD83C\uDDEE\uD83C\uDDF9".toInt()
//        ),
//        RandomItems(
//            id = 20,
//            title = "South Africa",
//            description = "",
//            image = "\uD83C\uDDFF\uD83C\uDDE6".toInt()
//        ),
//        RandomItems(
//            id = 21,
//            title = "Germany",
//            description = "",
//            image = "\uD83C\uDDE9\uD83C\uDDEA".toInt()
//        ),
//        RandomItems(
//            id = 22,
//            title = "Brazil",
//            description = "",
//            image = "\uD83C\uDDE7\uD83C\uDDF7".toInt()
//        ),
    )
}