;; The contents of this file are subject to the LGPL License, Version 3.0.
;;
;; Copyright (C) 2013, 2017, Phillip Lord, Newcastle University
;;
;; This program is free software: you can redistribute it and/or modify it
;; under the terms of the GNU Lesser General Public License as published by
;; the Free Software Foundation, either version 3 of the License, or (at your
;; option) any later version.
;;
;; This program is distributed in the hope that it will be useful, but WITHOUT
;; ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
;; FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
;; for more details.
;;
;; You should have received a copy of the GNU Lesser General Public License
;; along with this program. If not, see http://www.gnu.org/licenses/.

(ns ^{:doc "Shorter aliases for tawny.owl classes with an owl- disambiguation"
      :author "Phillip Lord"}
    tawny.english
  (:require [tawny.owl])
  (:refer-clojure :only []))

(def and #'tawny.owl/owl-and)
(def or #'tawny.owl/owl-or)
(def not #'tawny.owl/owl-not)
(def some #'tawny.owl/owl-some)
(def class #'tawny.owl/owl-class)
(def import #'tawny.owl/owl-import)
(def comment #'tawny.owl/owl-comment)
(def < #'tawny.owl/owl-max)
(def > #'tawny.owl/owl-min)
(def >< #'tawny.owl/min-max)
(def <= #'tawny.owl/max-inc)
(def >= #'tawny.owl/min-inc)
(def >=< #'tawny.owl/min-max-inc)
