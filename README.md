# 

## Model
www.msaez.io/#/storming/XwDdVbgGkCXgISmBTpLG1QNpNlv2/35748e7c63937ffe7e015ab32d9cae42

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic 
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- reservation
- warehouse
- delivery
- myParcel


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- reservation
```
 http :8088/reservations reservationId="reservationId" customerId="customerId" reservedTimestamp="reservedTimestamp" receiverAddress="receiverAddress" receiverPhoneNumber="receiverPhoneNumber" dueDate="dueDate" 
 http :8088/invoices invoiceId="invoiceId" reversationId="reversationId" customerId="customerId" parcelId="parcelId" senderAddress="senderAddress" senderPhoneNumber="senderPhoneNumber" receiverAddress="receiverAddress" receiverPhoneNumber="receiverPhoneNumber" dueDate="dueDate" timestamp="timestamp" 
```
- warehouse
```
 http :8088/parcels parcelId="parcelId" invoiceId="invoiceId" customerId="customerId" status="status" inboundTimeStamp="inboundTimeStamp" outboundTimeStamp="outboundTimeStamp" 
```
- delivery
```
 http :8088/deliveries deliveryId="deliveryId" receiverAddress="receiverAddress" dueDate="dueDate" status="status" paecelId="paecelId" receiverPhoneNumber="receiverPhoneNumber" senderAddress="senderAddress" senderPhoneNumber="senderPhoneNumber" reservationId="reservationId" customerId="customerId" invoicedId="invoicedId" timestamp="timestamp" 
```
- myParcel
```
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

