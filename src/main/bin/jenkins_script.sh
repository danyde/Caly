#!/bin/sh

echo "Start Deploying!"

cd /home/caly/caly

run ./stop_egr_data_integration.sh

rm -r   /home/caly/caly/lib
rm -r   /home/caly/caly/caly-*.jar
rm -r   /home/caly/caly/Caly*.sh

-- copy  files form Jenkins to NFS folder

-- Copy file from NFS folder to /home/caly/caly (application server)

rsync -avzh /mnt/nfs/var/nfsshare1 root@locahost:/var/lib/jenkins/jobs/CALY_JOB/workspace/applications/caly/target/lib/

--  copy file form mount to weblogic

cp   /mnt/nfs/var/nfsshare1  /home/caly/caly/


--  start caly batch application

run ./CalyLauncher.sh

--  rm all  files from mount

rm   /mnt/nfs/var/nfsshare1

ldconfig

echo "Done!"
