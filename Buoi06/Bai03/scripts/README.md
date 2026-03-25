Seed scripts

PowerShell:

.\scripts\seed.ps1

Bash (requires curl and jq):

./scripts/seed.sh

After running, check MongoDB:

docker exec -it bai03-mongo-1 mongosh

> use fooddb
> show collections
