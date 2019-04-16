# Your first dojo

## The purpose of this dojo is to validate our configuration by the good execution of __commands adhoc__ of Ansible.

- Configure the `inventory` file so no user/password are requested. 
- Declare a single group of machines named cluster in which we find all our servers.

Check that everything works (to choose):

- ansible -i inventory cluster -m ping
- ansible -i inventory all -m ping
- ansible -i inventory cluster -m shell -a 'ls -la'
- ansible -i inventory cluster -a "/bin/date"
