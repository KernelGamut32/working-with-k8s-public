# Lab 08 - Scaling and DaemonSets

Use https://github.com/KernelGamut32/kiamol/tree/master/ch06. Forked from https://github.com/sixeyed/kiamol that accompanies a great book called "Learn Kubernetes in a Month of Lunches" by Elton Stoneman.

* Deploy the app in ch06/lab/numbers - this deploys the random number app but it's currently broken.
* Update the website (numbers-web) to use a Deployment instead of a ReplicationController.
* Create a DaemonSet for the API (numbers-api).
* Use information in https://www.golinuxcloud.com/kubectl-label-node/ to learn how to label your Kubernetes node.
* Use a node selector in the DaemonSet definition to target the node with that label.
