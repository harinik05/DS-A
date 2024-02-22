call az group create --location westus --name "terraformstorage"

call az storage account create --name "storageaccount" --resource-group "terraformstorage" --location westus --sku Standard_LRS

call az storage container create --name terraform --account-name "storageaccount"

call az storage account keys list -g "terraformstorage" -n "storageaccount"
