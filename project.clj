(defproject cljsbuild-example-simple "1.1.5"
  :description "A simple example of how to use lein-cljsbuild"
  :source-paths ["src"]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-3211"
                  :exclusions [org.apache.ant/ant]]
                 [compojure "1.1.6"]
                 [hiccup "1.0.4"]]
  :plugins [[lein-cljsbuild "1.1.5"]
            [lein-ring "0.8.7"]]
  :cljsbuild {
    :builds [{:source-paths ["src"]
              :compiler {:output-to "dist/main.js"
                         :optimizations :whitespace
                         :pretty-print true}}]}
  :ring {:handler example.routes/app})
