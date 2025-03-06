(ns clojure-4ever.problem-11-conj-em-maps)

(println (= {:a 1, :b 2, :c 3} (conj {:a 1} [:b 2] [:c 3])))