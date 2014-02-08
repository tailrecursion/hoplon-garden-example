#!/usr/bin/env boot

#tailrecursion.boot.core/version "2.0.0"

(set-env!
 :dependencies '[[tailrecursion/boot.task "2.0.0"]
                 [tailrecursion/hoplon "5.1.1"]
                 [tailrecursion/boot.notify "2.0.0-SNAPSHOT"]
                 [org.clojure/clojurescript "0.0-2138"]]
 :src-paths    #{"src"}
 :out-path     "resources/public"
 :lein         {:plugins '[[lein-garden "0.1.5"]]
                :garden  '{:builds [{:stylesheet garden.css/screen
                                     :compiler {:output-to "resources/public/screen.css"
                                                :pretty-print? false}}]}})

(require '[tailrecursion.hoplon.boot      :refer :all]
         '[tailrecursion.boot.task.notify :refer [hear]])
