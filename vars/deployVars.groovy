def CLUSTER_HOST_IP = sh(
        script: './kubectl get pod -n kube-system $(./kubectl get po -n kube-system | grep dns \
                            | awk \'{print $1}\') -o=jsonpath=\'{.status.hostIP}\' ', returnStdout: true
).trim()


