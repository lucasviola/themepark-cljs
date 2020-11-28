(ns v2.core
    (:require
      [reagent.core :as r]
      [reagent.dom :as d]))

;; -------------------------
;; Views

(defn header-component []
  [:header
      [:div {:id "site-header__wrap"}
        [:h1 "World Water Resort"]
        [:a {:class "water-world__logo" :href "https://sprec.com/"}]
        [:nav {:class "Website_Header_Navigation" :role "navigation"}
          [:ul
            [:li [:a {:href "#"} "Home"]]
            [:li [:a {:href "#"} "Rides"]]
            [:li [:a {:href "#"} "Entertainment"]
            [:li [:a {:href "#"} "Book Tickets"]]
            [:li [:a {:href "#"} "Shopping"]]
            [:li [:a {:href "#"} "Dining"]]
            [:li [:a {:href "#"} "Help and About"]]]]]]])

(defn home-page []
  [header-component])

;; -------------------------
;; Initialize app

(defn mount-root []
  (d/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
