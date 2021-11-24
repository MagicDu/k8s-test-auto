#!/bin/sh
cd /root/xyl/question
docker build -t docker.soulhappy.com/soulhappy/question:latest .
docker push docker.soulhappy.com/soulhappy/question:latest
echo "push success"
cd /root/
kubectl delete -f question.yml
kubectl apply -f question.yml
echo "deploy success"
exit 1