(ns components.header)

(defn header-component []
  [:header
    [:div {:id "site-header__wrap"}
      [:nav {:class "website_Header_Navigation" :role "navigation"}
        [:ul
          [:li [:a {:href "#"} "Home"]]
          [:li [:a {:href "#"} "Rides"]]
          [:li [:a {:href "#"} "Entertainment"]]
          [:li [:a {:href "#"} "Book Tickets"]]
          [:li [:a {:href "#"} "Shopping"]]
          [:li [:a {:href "#"} "Dining"]]
          [:li [:a {:href "#"} "Help and About"]]]]]])
