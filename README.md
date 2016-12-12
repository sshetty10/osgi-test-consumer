# osgi-test-consumer
A Test OSGi consumer with maven deployable in Karaf

###Maven Goal
1. mvn clean install 

This will add the project to your local repository.


###Commands to Deploy on Karaf
1. bundle:install mvn:biz.neustar.osgi/osgi-test-consumer/1.9.0 (Pulls the bundle jar and installs it on karaf and returns a bundleID)
2. bundle:list  (will show you your bundle was installed or not)
3. bundle:start ${bundleID}

###Check errors
1. log:display

###To remove a bundle
1. bundle:stop ${bundleID}
2. bundle:uninstall ${bundleID}
