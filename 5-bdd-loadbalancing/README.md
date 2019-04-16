# TP5 Database - loadbalancing

## Goal

* Install and configure a postgresql instance on the host master
* Install and configure Apache server on host master
* Deploy __service-person__ application on slave1 and slave2 hosts

## Prerequisites
Install the role ** geerlingguy.postgresql ** since ansible-galaxy
`` `
ansible-galaxy install -r requirements.yml
`` `

## Install and configure postgresql
1. Add the role ** geerlingguy.postgresql ** to the playbook
2. Using group variables for masters

Use the postgresql plugin documentation for

1. add the following hba entries:


`` `
    local all postgres peer
    type all all 0.0.0.0/0 trust
`` `

2. configure global options to listen on all addresses

`` `
listen_addresses *
`` `

3. create the database named `coding_dojo`

4. create the user: `postgresql / postgresql`

5. Add the ** post_task ** to the playbook

`` `
post_tasks:

- postgresql_schema:
    name: person
    database: coding_dojo
    login_user: postgres
    login_password: postgres
    login_host: 192.168.61.10
    owner: postgres
    state: present
`` `

## Install and configure Apache server in reverse proxy

1. Create the role apache2-reverse-proxy
2. Complete the pre-defined tasks
3. In the ** / templates ** directory, complete ** src.j2 **

`` `
ProxyPreserveHost On
ProxyRequests On

<Proxy swing: // mycluster>
  ...
</ Proxy>

ProxyPass / swing: // mycluster /
ProxyPassReverse / swing: // mycluster /
`` `

## Deploy __service-person__