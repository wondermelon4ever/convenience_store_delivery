<template>

    <v-data-table
        :headers="headers"
        :items="myParcel"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'MyParcelView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "myparcelId", value: "myparcelId" },
                { text: "reservationId", value: "reservationId" },
                { text: "invoiceId", value: "invoiceId" },
                { text: "customerId", value: "customerId" },
                { text: "deliveryId", value: "deliveryId" },
                { text: "parcelId", value: "parcelId" },
                { text: "status", value: "status" },
                { text: "updateTimeStamp", value: "updateTimeStamp" },
                { text: "receiverAddress", value: "receiverAddress" },
                { text: "senderAddress", value: "senderAddress" },
                { text: "dueDate", value: "dueDate" },
            ],
            myParcel : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/myParcels'))

            temp.data._embedded.myParcels.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.myParcel = temp.data._embedded.myParcels;
        },
        methods: {
        }
    }
</script>

