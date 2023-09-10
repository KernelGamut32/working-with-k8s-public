# Lab 10 - Services

Use https://github.com/KernelGamut32/kiamol/tree/master/ch03. Forked from https://github.com/sixeyed/kiamol that accompanies a great book called "Learn Kubernetes in a Month of Lunches" by Elton Stoneman.

* Deploy the resources defined in the deployments.yaml file in the lab folder using Kubernetes. 
* This will provide you with a web app and an API for requesting a random number.
* Examine the pods created by the previous manifest - you should see 2 versions of the web app running.
* Write a service to expose the API to other pods (internal only) using the service name numbers-api.
* Write a service that will make version 2 of the website available outside of the cluster on port 8088.