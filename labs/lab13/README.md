# Lab 13 - StatefulSets and Jobs

Use https://github.com/KernelGamut32/kiamol/tree/master/ch08. Forked from https://github.com/sixeyed/kiamol that accompanies a great book called "Learn Kubernetes in a Month of Lunches" by Elton Stoneman.

* Start by running the nginx spec in ch08/lab/nginx - runs a single pod writing logs to an EmptyDir.
* Migrate the pod spec to use a StatefulSet - configure it to run with 3 pods and use separate storage for each.
* Each pod will be writing log files to its own PersistentVolumeClaim.
* With StatefulSet running, make calls to the Service and confirm that log data is being written in the pods.
* Complete the Job spec in the file disk-calc-job.yaml - add volume mounts so it can read log files from the nginx pods.
* Execute the Job and confirm receipt of each pod's log file size.