(ns main)


(defn matchesButton [el]
  (some (fn [result] result) [
    (.matches el ".accept_merge_request")
  ]))

(defn listen [el]
  (.addEventListener el "click" (fn [event]
    (if (matchesButton event.target)
      (if (js/confirm "
        Zkontrolovali jste že:
        - prošly testy a celý build
        - nejsou tady žádné fixup commity
        - MR má přiřazené issue
        - všechny komentáře byly vyřešeny
        ") nil ((fn [event]
          (.preventDefault event)
          (.stopPropagation event)) event))))))


(def widget (js/document.querySelector ".mr-widget-body"))
(if widget (listen widget))
