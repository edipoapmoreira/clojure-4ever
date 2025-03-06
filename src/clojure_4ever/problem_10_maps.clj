(ns clojure-4ever.problem-10-maps)

(println (= 20 ((hash-map :a 10, :b 20, :c 30) :b)))
(println (= 20 (:b {:a 10, :b 20, :c 30})))