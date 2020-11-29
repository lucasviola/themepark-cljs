(ns v2.core
    (:require
      [reagent.core :as r]
      [reagent.dom :as d]
      [web.component.tag :as tag]
      [web.component.slider :as slider]))

;; -------------------------
;; Views

(defn home-page []
  [:<>
    [tag/header-component]
    [slider/slider-component]])

;; -------------------------
;; Initialize app

(defn mount-root []
  (d/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
