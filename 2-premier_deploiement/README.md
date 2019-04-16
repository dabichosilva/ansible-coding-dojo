# TP2 instructions

## The goal is to make a first deployment with Ansible.

1- Edit playbook.yml to complete the tasks using the official Ansible modules.

http://docs.ansible.com/ansible/latest/modules_by_category.html

The deployment structure is as follows:

     / Custom /
     | - app
     | | - myapp
     | | `- myapp.jar
     | `- myapp-conf
     | `- application.properties
     `- log
         `- myapp
             `- myapp.log

We will deploy our demo service on 'slave1'.

     ansible-playbook -i inventory playbook.yml

Once the application is deployed, it can be verified that it is running.

     curl http://192.168.61.11:8080/

the call returns a message "Welcome from default-server"

NB: for the installation of the application as service systemd a file is present in `files / myapp.service`
it will need to be deployed in `/ etc / systemd / system / myapp.service`