# TP4 Roles

## Goal

Cut the playbook of the previous TP into several ansible roles.

## Role creation
1. Create the __roles__ directory
2. Go to the roles directory
3. Initialize the __standalone-webapp__ role structure
`` `
ansible-galaxy init standalone-webapp
`` `
4. List the created tree
`` `
tree -d
`` `
5. Edit ** standalone-webapp / tasks / main.yml ** with the contents of the TP 3 playbook.
6. Edit ** playbook.yml ** to call the standalone-webapp role


### Decomposition in several roles
1. Create the role __java__ and its tasks
2. Create the __prepare__ role and its tasks
3. Create the __app-conf__ role and its tasks
4. Create the __standalone-webapp__ role and its tasks