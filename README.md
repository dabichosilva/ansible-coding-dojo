# Dojo 1 

#### The purpose of this dojo is to validate our configuration by the good execution of __adhoc commands__ of Ansible.

- Configure the `inventory` file so no user/password are requested. 
- Declare a single group of machines named cluster in which we find all our servers.

Check that everything works (to choose):

- ansible -i inventory cluster -m ping
- ansible -i inventory all -m ping
- ansible -i inventory cluster -m shell -a 'ls -la'
- ansible -i inventory cluster -a "/bin/date"


# Dojo 2

#### In this Dojo, we will create a simple Playbook that should do some basic tasks.

- We will continue using the `inventory` of the previous dojo
- Create the `playbook.yml` file with these tasks:
	1. Ping the host to check if it's alive.
	2. Create an ansibleSandbox folder with 777 permissions.
	3. Download the brew-coffee-service artifact locally. (hint: `delegate_to`)
	4. Transfer the artifact the remote host.
	5. Start the artifact service, but don't wait for it to finish (hint: `async`)
	6. Validate that the service is up & running (hint: _wait a moment to let the service start_ && `register`)
	7. Send an e-mail notifying the results. (hint: `mail.host: smtp-gw1.wal-mart.com` && `{{ 'it worked fine!' if psResult == '0' else 'it failed miserably...' }}`)

- These are the modules that you will need to use:
	- ping
	- file
	- maven_artifact
	- copy
	- command/shell
	- pause
	- mail