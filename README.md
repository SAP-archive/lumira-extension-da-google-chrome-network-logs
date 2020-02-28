![](https://img.shields.io/badge/STATUS-NOT%20CURRENTLY%20MAINTAINED-red.svg?longCache=true&style=flat)

# Important Notice
We have decided to stop the maintenance of this public GitHub repository.

Lumira Data Access Extension - Google Chrome Network Logs
==========================================================
Google Chrome Dev tools lets you check your network traffic when accessing a website, and you can also export this data into logs which have a .har format. This extension lets you visualize/analyze various parameters that are logged in these files. You can compare across multiple such logs as well. This Lumira extension is built with the V2 SAP Lumira Data Access Extension SDK.

Install
------------------
* Open Extension Manager, `File > Extensions`
* Click `Manual Installation`
* Download the zip file (com.sap.lumira.da.chromelogsextension_1.25.0.201511091613.zip) in this repo by clicking on this [**link**](https://github.com/SAP/lumira-extension-da-google-chrome-network-logs/blob/master/com.sap.lumira.da.chromelogsextension_1.25.0.201511091613.zip?raw=true)
* Wait for the extension to install successfully
* Restart SAP Lumira Desktop

Usage
----------
* Select `File > New Data`
* Select `SAP Lumira Chrome Netwrok Logs Extension` from the list of connectors in Lumira Desktop
* Enter the dataset name and these parameters
 + `Logs Folder`: The folder path where all the .har files are stored. You can use the [**sample data**](https://github.com/SAP/lumira-extension-da-google-chrome-network-logs/tree/master/ExtensionData/PerfLogs) that has been provided. Also, you can export your own .har files from Google Chrome dev tools as well.
 + `Metadata File`: Path of the metadata file. A sample [**metadata.txt**](https://github.com/SAP/lumira-extension-da-google-chrome-network-logs/blob/master/ExtensionData/PerfLogs/metadata.txt) is available in the sample data folder
* Select `OK` to import data into a new document
* Use the `Data > Refresh document` option to fetch the latest data and update the existing Lumira document
* Use the `Data > Edit Data source` option to change parameters in an existing Lumira document

Build and Modify
-----------------
* Please refer to the [Sample Extension project](https://github.com/SAP/lumira-extension-da-sample) for instructions to setup your dev environment, make changes, and build this extension. (Note: If you get errors about the libraries not being found, then just check your build path and point it to the lib folder of the downloaded project)
* If you want to add any new columns, you can add more fields in `EntryFieldsFilter` or create a new filter by implementing `IFieldsFilter` (You can refer to `EntryFieldsFilter` as an example).

Resources
-----------
* SCN Blog post - Coming soon
