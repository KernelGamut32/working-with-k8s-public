# Lab 09 - Secrets and ConfigMaps

Use https://github.com/KernelGamut32/kiamol/tree/master/ch04. Forked from https://github.com/sixeyed/kiamol that accompanies a great book called "Learn Kubernetes in a Month of Lunches" by Elton Stoneman.

* Adminer is a web UI for administering SQL databases - it can be run Kubernetes to provide a reasonably powerful UI for multiple database types.
* Deploy the YAML files in the ch04/lab/postgres folder and deploy the ch04/lab/adminer.yaml file - this will allow you to use Adminer in a basic format.
* Find the external IP for your Adminer Service, and browse to port 8082. 
* You can confirm the connection to Postgres using PostgreSQL as the system, ch04-lab-db as the server, postgres as the user name and database name, and the password defined in the Postgres secret for password.
* Set the default database server in an environment variable called ADMINER_DEFAULT_SERVER using a secret so you don't have to type it every time (we're considering this information sensitive).
* Use an environment variable called ADMINER_DESIGN stored in a ConfigMap to modify theme for the site (you can get more info about theming and the available themes at https://hub.docker.com/_/adminer and https://github.com/vrana/adminer/tree/master/designs).