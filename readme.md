## Jenkins URL:
- http://emea-tun-ptds01:8080/
- admin user: admin
- pwd: password

## Jenkins initialAdminPassword:
49f13df0e9d746de8f107120f6173858

## Binding to remote origin:

   ```sh
   ## 1. Create a remote origin
   $ git remote add origin <remote_repo_URL>
   ## 2. Set a remote tracking branch for local master branch to be able to push the changes to remote repo
   $ git branch --set-upstream-to=origin/master master
   ## 3. Synchronize HEAD ref between remote and local master branches
   $ git pull --rebase origin master
   ## Push local commits to remote branch
   $ git push
  ```




If you want to set all of your branches to automatically use this remote repository when you use git pull, add --set-upstream to the push:
### ```
$ git push --all --set-upstream origin
```