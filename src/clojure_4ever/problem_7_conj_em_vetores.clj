(ns clojure-4ever.problem-7-conj-em-vetores)

(println (= [1 2 3 4] (conj '(2 3 4) 1)))
(println (= [1 2 3 4] (conj '(3 4) 2 1)))
