Orders Tab related tests
=====================
Created by atmaramn on 09/11/2016

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
     
Add Radiology Order
----------------
* Create a new patient and open visit through API
* On the login page
* Login to the application
* Click on clinical app
* Select existing patient from patient listing page under tab "Active"
* Navigate to consultation
* Go to "Orders" tab
* Select following orders
    |type|orderType|orderName|
    |Radiology|chest|chest, 1 view (x-ray)|
    |Radiology|chest|chest oblique - bilateral (x-ray)|
    |Radiology|chest|chest lateral|
* Unselect following orders
    |type|orderType|orderName|
    |Radiology|chest|chest lateral|
* Enter notes to following "Radiology" orders
    |order|note|
    |chest, 1 view (x-ray)|Notes 1|
* Save the consultation
* Verify order details on orders page
* Verify notes are not editable for "Radiology" orders
* Navigate to patient dashboard
* Verify display control with Caption "Radiology Orders" on dashboard, has the following details
    |details|
    |Chest, 1 view (X-ray)|
    |Chest oblique - Bilateral (X-ray)|
* Open the current visit
* Verify display control with Caption "Pacs Orders Visit Page" on visit page, has the following details
    |details|
    |Chest, 1 view (X-ray)|
    |Chest oblique - Bilateral (X-ray)|
* Open "Orders" tab on visit page
* Verify display control with Caption "Radiology Orders" on visit page, has the following details
    |details|
    |Chest, 1 view (X-ray)|
    |Chest oblique - Bilateral (X-ray)|
* Navigate to dashboard
* Logout the user