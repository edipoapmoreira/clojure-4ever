(ns clojure-4ever.problem-8-set)

(println (= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d))))

(println (= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d})))