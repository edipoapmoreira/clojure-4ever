(ns clojure-4ever.problem-20-penultimo-elemento)

(println (= ((fn [x] (nth x (- (count x) 2))) (list 1 2 3 4 5)) 4))
(println (= ((fn [x] (nth x (- (count x) 2))) ["a" "b" "c"]) "b"))
(println (= ((fn [x] (nth x (- (count x) 2))) [[1 2] [3 4]]) [1 2]))
