# Demo - Scheduling & Scaling

Use https://github.com/KernelGamut32/kiamol/tree/master/ch19. Forked from https://github.com/sixeyed/kiamol that accompanies a great book called "Learn Kubernetes in a Month of Lunches" by Elton Stoneman.

* Deploy the Pi app with the following scheduling/scaling config:
    - App run in EU region only
    - Autoscaling based on target CPU utilization of 50%
    - Keep between 2 and 5 replicas running
    - Where possible, spread the load across nodes in the traget region
