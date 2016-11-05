(defproject sparkledriver "0.1.0-SNAPSHOT"
  :description "A clojure wrapper for jBrowserDriver, which is a Selenium-compatible wrapper around JFX embedded WebKit."
  :url "https://github.com/jackrusher/sparkledriver"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.machinepublishers/jbrowserdriver "0.17.1"]]
  :profiles {:test {:dependencies [[org.slf4j/slf4j-simple "1.7.2"]]}})
