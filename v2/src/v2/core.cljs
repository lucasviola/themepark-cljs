(ns v2.core
    (:require
      [reagent.core :as r]
      [reagent.dom :as d]
      [web.component.navigation :as navigation]
      [web.component.slider :as slider]
      [web.component.showcase :as section]))

;; -------------------------
;; Views

(defn home-page []
  [:div {:class "homepage-wrapper"}
    [navigation/navigation-component]
    [slider/slider-component]
    [:section {:class "section-wrapper"}
      [section/showcase-component "New Water Ride" "css/ian-taylor-Vc13aEz-7Xw-unsplash.jpg"]
      [section/showcase-component "New rollercoaster" "css/matt-bowden-GZc4fnQsaWQ-unsplash.jpg"]
      [section/showcase-component "Night attraction" "css/max-bender-QdmT9XvjgH8-unsplash.jpg"]]])

;; -------------------    ------
;; Initialize app

(defn mount-root []
  (d/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
