(ns clojure-4ever.problem-22-count-a-sequence)

; map aplica uma função sobre cada elemento de uma sequência.
; A função (constantly 1) cria uma função que sempre retorna o valor 1, independentemente do argumento que ela recebe.
; Então, map aplica essa função a cada elemento da lista (1 2 3 3 1).
; O resultado será uma lista de 1s do mesmo tamanho da original, ou seja: (1 1 1 1 1)
; O apply soma todos os valores de uma sequencia
(println (= (apply + (map (constantly 1) '(1 2 3 3 1))) 5))
(println (= (apply + (map (constantly 1) "Hello World")) 11))
(println (= (apply + (map (constantly 1) [[1 2] [3 4] [5 6]]) )3))
(println (= (apply + (map (constantly 1) '(13)) )1))
(println (= (apply + (map (constantly 1) '(:a :b :c))) 3))