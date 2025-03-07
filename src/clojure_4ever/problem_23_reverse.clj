(ns clojure-4ever.problem-23-reverse)

(println (= ((fn[x](reduce conj () x)) [1 2 3 4 5]) [5 4 3 2 1]))
(println (= ((fn[x](reduce conj () x)) (sorted-set 5 7 2 7)) '(7 5 2)))
(println (= ((fn[x](reduce conj () x)) [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]]))