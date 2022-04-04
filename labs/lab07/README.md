# Lab 07 - PersistentVolumes

Use https://github.com/KernelGamut32/kiamol/tree/master/ch05. Forked from https://github.com/sixeyed/kiamol that accompanies a great book called "Learn Kubernetes in a Month of Lunches" by Elton Stoneman.

* Deploy the app manifests in the ch05/lab/todo-list folder - this will create the initial resources.
* Examine the manifests to get a sense of what's being created and how it relates together.
* Try hitting the URL for the LoadBalancer and try using the application - it won't respond.
* Dig into the logs to figure out what's wrong and identify the expected names for the missing mount targets.
* Configure persistent storage for the proxy cache files and for the database file in the web pod.
* Run the app and add some data.
* Delete all pods and refresh browser to confirm your added data is still present.
* Use any volume type of storage class you choose.