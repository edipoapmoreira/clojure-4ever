(ns clojure-4ever.problem-18-filter)

(println (= '(6 7) (filter #(> % 5) '(3 4 5 6 7))))