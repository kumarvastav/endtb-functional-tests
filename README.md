Automation Test Suite using the Gauge Framework
============================================

Installation instructions
--------------------------
* Download Gauge from [here](http://getgauge.io/get-started/).

* Install core plugins using the following commands
    * `gauge --install java`
    * `gauge --install html-report`

Running functional tests
------------------------
* Run the following commands with proper values to setup the required environment variables.
    * `export BAHMNI_GAUGE_APP_URL=<bahmni application url>`
    * `export BAHMNI_GAUGE_APP_USER=<bahmni username>`
    * `export BAHMNI_GAUGE_APP_PASSWORD=<bahmni password>`
    * `export BAHMNI_GAUGE_APP_IMPL_NAME=<bahmni implementation name>`

* Running functional tests
    * Run `mvn clean install` at the root project level.
    * To run functional tests for a specific project, for example the endtb project
        * `cd bahmni-gauge-endtb`
        * `mvn gauge:execute`
