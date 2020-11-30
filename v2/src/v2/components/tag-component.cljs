(ns web.component.tag)

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

(defn subsection-component [subtitle]
  [:div
    [:h1 subtitle]
    [:div {:class "subsection-image"}]])

(defn section-component [title subtitle]
  [:section {:class "section-wrapper"}
    [:h1 title]
    [subsection-component subtitle]])
