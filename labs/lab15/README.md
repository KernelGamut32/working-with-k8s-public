# Lab 15 - Blue/Green Deployments

Use https://github.com/KernelGamut32/kiamol/tree/master/ch09. Forked from https://github.com/sixeyed/kiamol that accompanies a great book called "Learn Kubernetes in a Month of Lunches" by Elton Stoneman.

* Deploy the starting point for the web app from the lab/v1 folder.
* Create a blue-green deployment for a version 2 of the app (:v2).
* Verify that you're able to switch between v1 and v2 changing only the Service (no updates to pod specs).