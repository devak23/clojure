(ns getting-started.core
  (:gen-class))

(defn hello
  ([] (hello "Clojure"))
  ([name] (str "Hello " name)))

(defn -main
  "The main program"
  [& args]
  (println "I'm little teapot!")
  (println (hello "Abhay"))
  (println (hello))
  (println (first [1 3 5 7 9]))
  (do (println "no prompt here" (+ 1 3)))
  (println "args passed were: " args)
  (println (.concat "It's Panda!! He is a Panda! " "What are you going to do big guy? Sit on me? Heh heh.."))
  (println (str " ..Heh heh" "Don't tempt me " "Now, I am going to use this..." "You want it? Come and get it"))

  (println (if false
             "You have a become a problem that I have to deal with."
             "Contrary to popular belief, you are not the center of my universe. Hit him."))

  (if true
    (do (println "GOD!! What did you do to me???")
        (println "What did we do FOR you. It's lithium dioxide. It's not a cure. It's just gonna take the edge off.")))

  (println (= 1 1))
  (println (= "Gandalf The grey" "Gandalf The white"))

  (def my-fav-superheroes ["IronMan" "Wanda" "Thor"])

  (println (clojure.string/join "," (map str my-fav-superheroes)))
  )

; You held your head like a hero
; On a history book page
; It was the end of a decade
; But the start of an age
; —Taylor Swift