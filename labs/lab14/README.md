# Lab 14 - Helm

Use https://github.com/KernelGamut32/kiamol/tree/master/ch10. Forked from https://github.com/sixeyed/kiamol that accompanies a great book called "Learn Kubernetes in a Month of Lunches" by Elton Stoneman.

* Use provided manifests in lab/todo-list folder and create a Helm chart structure (add templating where appropriate)
* Use templating as a way to support multiple releases with different values applied at time of deployment
* Use parameters to accommodate environment-specific config settings
* Configure the chart to run as Test when installed using default values and run as Dev when installed with lab/dev-values.yaml information
