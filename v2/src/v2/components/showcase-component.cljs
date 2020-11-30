(ns web.component.showcase)

(defn showcase-component [title imageSource]
  [:div {:class "showcase-section-holder"}
      [:img {:class "showcase-image" :src imageSource :width "400" :height "240"}]
    [:div {:class "showcase-text-holder"}
    [:h3 title]
    [:a {:href "#"} "Read more"]]])
