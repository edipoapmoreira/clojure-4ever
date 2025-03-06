(ns clojure-4ever.problem-14-functions)

(println (= 8 ((fn add-five [x] (+ x 5)) 3)))
(println (= 8 ((fn [x] (+ x 5)) 3)))
(println (= 8 (#(+ % 5) 3))) ;função anonima
(println (= 8 ((partial + 5) 3)))