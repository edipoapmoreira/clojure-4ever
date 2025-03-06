(ns clojure-4ever.problem-15-dobrar-valor)

(println (= ((fn [x] (* 2 x)) 2) 4))
(println (= ((fn [x] (* 2 x)) 3) 6))
(println (= ((fn [x] (* 2 x)) 11) 22))
(println (= ((fn [x] (* 2 x)) 7) 14))