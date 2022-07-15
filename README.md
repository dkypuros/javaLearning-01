# javaLearning-01

```
oc login -u developer - p developer asdfasdf.ocp.kypuros.lab

#New project
oc new project new-app

#Add New app to project
#build a new application in Ruby as an example
oc new-app centos/ruby~https://github.com/openshift/ruby-ex.git

#Example
# "-i" specifies the builder image for the docker container
# Here, we're using the NodeJS 8 ready builder image
#--name gives the app a name, -l gives it a label
oc new-app -i nodejs:8 https://github.com/sagar-jadjav/node-hello --name nodejs -l app=demo

#watch the pods build
oc get pods --watch

#see all the resourced tied to the app
oc get all -l app=demo

#create a route
oc expose service nodejs

#oc get route
#should see a URL

```