(ns web.component.slider)

(defn title-holder [text subtext]
  [:div {:class "title-holder"}
    [:h1 text]
    [:h2 subtext]])

(defn slider-component []
  [:div {:class "slider-wrapper"}
    (title-holder "Water World Resort" "Slider for days")])
