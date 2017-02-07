(defproject hazelcast-test "0.1.0-SNAPSHOT"
  :description "Lightscale hazelcast testing playground"
  :url "https://github.com/lightscaletech/hazelcast-testing"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :main ^:skip-aot hazelcast-test.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
