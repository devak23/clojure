(ns getting-started.core
  (:gen-class))

(defn hello
  ([] (hello "Clojure"))
  ([name] (str "Hello " name)))

(defn -main
  "The main program"
  [& args]
  ; typical hello world
  (println "I'm little teapot!")

  ; Invoking a function which is defined above
  (println (hello "Abhay"))

  ; Invoking the same function without any parameters
  (println (hello))

  ; the syntax is to first specify the operator or function and then pass a list of arguments.
  (println (first [1 3 5 7 9]))

  (do (println "no prompt here" (+ 1 3)))
  (println "args passed were: " args)
  (println (.concat "It's Panda!! He is a Panda! " "What are you going to do big guy? Sit on me? Heh heh.."))
  (println (str " ..Heh heh" "Don't tempt me " "Now, I am going to use this..." "You want it? Come and get it"))

  ; This is a classic case of if-else loop. The true will evaluate to the first line and false will evaluate to second
  ; line.
  (println (if false
             "You have a become a problem that I have to deal with."
             "Contrary to popular belief, you are not the center of my universe. Hit him."))

  ; if you want to execute a bulk of statements, you need to use the do syntax combined with if like so
  (if true
    (do (println "GOD!! What did you do to me???")
        (println "What did we do FOR you. It's lithium dioxide. It's not a cure. It's just gonna take the edge off.")))

  ; evaluating booleans
  (println (= 1 1))

  ; comparing the strings
  (println (= "Gandalf The grey" "Gandalf The white"))

  ; Declaration of variable and binding them with values. It is important to note that variable name can have a hyphen.
  ; This is quite idiomatic and the compiler will change the hyphens to underscore
  (def my-fav-superheroes ["IronMan" "Wanda" "Thor"])

  ; you can overwrite the values, although this isn't something that's encouraged. In clojure you rarely need to alter
  ; the name value pair.
  (def my-fav-superheroes ["Batman", "Superman", "Aquaman"])

  ; For instance consider this code: All this code does is to combine the original 'error-message' with some additional
  ; messages depending on the severity of the :mild variable provided


  (def severity :mild)
  (def error-message "OH GOD! IT'S A DISASTER! WE'RE ")
  (if (= severity :mild)
    (def error-message (str error-message "MILDLY INCOVENIENCED"))
    (def error-message (str error-message "DOOOOOMED!")))

  ; changing the value associated with a name like this can make it harder to understand your program’s behavior
  ; because it’s more difficult to know which value is associated with a name or why that value might have changed
  ; Same code can be written in idiomatic way such as:
  (defn error-message
    [severity]
    (str "OH GOD! IT'S A DISASTER! WE'RE "
         (if (= severity :mild)
           "MILDLY INCONVENIENCED!"
           "DOOOOMED!!!!")))

  (println (error-message 2))

  ; Here we are trying to use a join function of closure.string and that function is passed a list of parameters
  ; which is provided by the map function.
    (println (clojure.string/join "," (map str my-fav-superheroes)))

  ; lets define a hash-map
  (def name-map {:roll-num 1
                 :name "Abhay Kulkarni" })

  (println (get name-map :name))

  ; lets define a vector
  (def directions [3 2 1])
  (println (get directions 0))

  ; vector element could be of any type. You can mix them for instance:
  (def mix ["a" {:name "William Wordsworth"} "c" ])

  (println (get mix 1))

  ; Lists are similar to vectors in that they’re linear collections of values. But there are some differences.
  ; For example, you can’t retrieve list elements with get.
  (def movies (list "3 idiots" "Dil Chahata hai" "Jolly LLB"))
  (println movies)

  (def fruits #{"Apple", "Mango", "Pineapple", "Guava", "Berries", "mango"})
  (println fruits)

  (println (contains? fruits "apple"))
  (println (contains? fruits "mango"))
)
; You held your head like a hero
; On a history book page
; It was the end of a decade
; But the start of an age
; —Taylor Swift