Automation Test Suite using Gauge Framework
============================================

Installation instructions
--------------------------
* Download Gauge from this [link](http://getgauge.io/get-started/).

* Install core plugins using the following commands

    * gauge --install java
    * gauge --install html-report

* For running the tests, run the command

    * export bahmni_gauge_env_url=\<environment_url\>
    * export bahmni_gauge_env_username=<username>
    * export bahmni_gauge_env_password=<password>
    
    * mvn clean install
    * For endtb project, cd bahmni-gauge-endtb
    * mvn gauge:execute
