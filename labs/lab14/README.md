# Lab 14 - Capacity Planning

Use https://github.com/KernelGamut32/kiamol/tree/master/ch12. Forked from https://github.com/sixeyed/kiamol that accompanies a great book called "Learn Kubernetes in a Month of Lunches" by Elton Stoneman.

* We will be dividing our cluster into three "virtual" environments to run a provided app - dev, test, and UAT.
* Deploy the namespaces and Services in the lab folder.
* Use ResourceQuotas to limit UAT to 50% of the node's total CPU and limit dev and test to 25% each.
* Update the Deployment spec in web.yaml to include a CPU limit that allows 4 replicas to run in each namespace.
* Once running, try and scale up the UAT Deployment to eight replicas - what do you see? And why?