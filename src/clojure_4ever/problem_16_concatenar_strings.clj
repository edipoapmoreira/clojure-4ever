(ns clojure-4ever.problem-16-concatenar-strings)

(println (= ((fn [name] (str "Hello, " name "!")) "Dave") "Hello, Dave!"))
(println (= ((fn [name] (str "Hello, " name "!")) "Jenn") "Hello, Jenn!"))
(println (= ((fn [name] (str "Hello, " name "!")) "Rhea") "Hello, Rhea!"))

(println (= ((partial str "Hello, " "!" "Dave") "Hello, Dave!")))
(println (= ((partial str "Hello, " "!" "Jenn") "Hello, Jenn!")))
(println (= ((partial str "Hello, " "!" "Rhea") "Hello, Rhea!")))

