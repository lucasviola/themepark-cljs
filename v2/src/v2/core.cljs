(ns v2.core
    (:require
      [reagent.core :as r]
      [reagent.dom :as d]
      [navigation :as navigation]))

;; -------------------------
;; Views

(defn home-page []
  [navigation/header-component])
  ; [slider/slider-component])

;; -------------------------
;; Initialize app

(defn mount-root []
  (d/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
