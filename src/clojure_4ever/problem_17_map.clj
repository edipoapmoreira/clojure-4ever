(ns clojure-4ever.problem-17-map)

(println (map #(+ % 5) '(1 2 3)))

(println (= '(6 7 8) (map #(+ % 5) '(1 2 3))))
