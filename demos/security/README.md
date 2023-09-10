# Demo - Securing Applications in Kubernetes

Use https://github.com/KernelGamut32/kiamol/tree/master/ch16. Forked from https://github.com/sixeyed/kiamol that accompanies a great book called "Learn Kubernetes in a Month of Lunches" by Elton Stoneman.

Use OPA Gatekeeper and the provided Rego code to manage security for specific Pod creation
* Deploy gatekeeper.yaml (for OPA Gatekeeper) and the constraint template in restrictedPaths-template.yaml in the lab folder
* Create and deploy a new constraint using the provide template to restrict host paths `/`, `/bin`, and `/etc`; apply the constraint only to Pods with a label of `kiamol=ch16-lab`
* Attempt to deploy `sleep.yaml` in the lab folder and observe the results