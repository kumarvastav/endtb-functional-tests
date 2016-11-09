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
* Select following "Radiology" orders under section "chest"
    |orders|
    |chest, 1 view (x-ray)|
    |chest oblique - bilateral (x-ray)|
    |chest lateral|
* Unselect following "Radiology" orders under section "chest"
    |orders|
    |chest lateral|
* Enter notes to following "Radiology" orders
    |order|notes|
    |chest, 1 view (x-ray)|Notes 1|
* Save the consultation
* Verify order details on orders page
* Verify notes are not editable for "Radiology" orders
* Navigate to patient dashboard
* Verify display control with Caption "Radiology Orders" on dashboard, has the following details
    |details|
    |Chest, 1 view (x-ray)|
    |Chest oblique - bilateral (x-ray)|
* Open the current visit
* Verify display control with Caption "Observations" on visit page, has the following details
    |details|
    |Chest, 1 view (x-ray)|
    |Chest oblique - bilateral (x-ray)|
* Verify display control with Caption "Observations" on "Orders" tab on visit page, has the following details
    |details|
    |Chest, 1 view (x-ray)|
    |Chest oblique - bilateral (x-ray)|
* Navigate to dashboard
* Logout the user