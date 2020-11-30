(ns web.component.showcase)

(defn showcase-component [title imageSource]
  [:div {:class "showcase-section-holder"}
      [:img {:class "showcase-image" :src imageSource :width "440" :height "300"}]
    [:div {:class "showcase-text-holder"}
    [:h3 title]
    [:a {:href "#"} "Read more"]]])
