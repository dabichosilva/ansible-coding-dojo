TP3 instructions
===

This time we will introduce the use of variables.
We start from the previous exercise.
1- We fill in the following variables in `host_vars / slave1.yml` (to be completed)

    app:
    base_dir:
    base_app_dir:
    base_log_dir:
    app_dir:
    conf_dir:
    log_dir:
    deploy_user:
    deploy_group:
    app_jar:
    JAVA_OPTS:

2- Edit playbook.yml to complete the tasks using official Ansible modules.

http://docs.ansible.com/ansible/latest/modules_by_category.html

3- Add idempotence to the task "(re) Start myapp.service"

We only want to restart the application when necessary.

To do this we will capture the output of the "Copy executable jar" task in a variable.

If this task has made changes then the service is restarted.

4- At the line "Wait for the HTTP port to be listening" put a default value of 60 seconds to wait for the port 8080 to be listened and to verify that it is indeed an integer

5- Deploy an external application.properties file by adding the following JVM parameter when starting the application.

    -Dspring.config.location = {{}} conf_dir / application.properties

set the following 2 values ​​in `application.properties`

    server_name =
    logging.file =

NB: To overload server_name we can use facts ansible

6- Deploy the demo service on 'slave1' by passing it to `actuator_enabled = True`.

    ansible-playbook -i inventory playbook.yml -e "actuator_enabled = True"

Use this parameter to control the command line used when the application starts

    --endpoints.enabled = <true / false>

Check that the parameter has the expected effect.

    curl http://192.168.61.11:8080/health
    { "Status": "UP"}