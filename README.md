Automation Test Suite using Gauge Framework
============================================

Installation instructions
--------------------------
* Download Gauge from this [link](http://getgauge.io/get-started/).

* Install core plugins using the following commands

    * gauge --install java
    * gauge --install html-report

* For running the tests, run the command

    * export BAHMNI_GAUGE_APP_URL=\<environment_url\>
    * export BAHMNI_GAUGE_APP_USER=\<username\>
    * export BAHMNI_GAUGE_APP_PASSWORD=\<password\>
    * export BAHMNI_GAUGE_APP_IMPL_NAME=\<implementation_name\>
    
    * mvn clean install
    * For endtb project, cd bahmni-gauge-endtb
    * mvn gauge:execute
