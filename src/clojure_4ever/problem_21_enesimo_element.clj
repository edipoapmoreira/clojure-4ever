(ns clojure-4ever.problem-21-enesimo-element)

(println (= (#(get-in (vec %1) [%2]) '(4 5 6 7) 2) 6))
(println (= (#(get-in (vec %1) [%2]) [:a :b :c] 0) :a))
(println (= (#(get-in (vec %1) [%2]) [1 2 3 4] 1) 2))
(println (= (#(get-in (vec %1) [%2]) '([1 2] [3 4] [5 6]) 2) [5 6]))