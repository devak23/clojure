(ns ns-playground.hello
  (:import (java.util Date)))

(def addition +)

(defn current-date []
  "Returns the current date"
  (new Date)

  ;The operator & in the argumets of <3 and sum-something functions allows those functions to receive any number of
  ;arguments. So they can be invoked as: (sum-something 1 2 3 4 5 6) or (sum-something). These are called variadic
  ; functions. In Java we call them varargs.

  (defn <3 [love & loved-ones])
  "Creates a sequence of all the {loved-ones} {loved} loves"
  (for [loved-one loved-ones]
    (str love " love " loved-one)))

(defn sum-something [something & nums]
  "Adds something to all the remaining parameters"
  (apply addition something nums))

(def sum-one (partial sum-something 1))
