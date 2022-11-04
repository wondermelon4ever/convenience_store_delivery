<template>

    <v-card outlined>
        <v-card-title>
            MyParcel # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <Number label="MyparcelId" v-model="item.myparcelId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="ReservationId" v-model="item.reservationId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="InvoiceId" v-model="item.invoiceId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="CustomerId" v-model="item.customerId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="DeliveryId" v-model="item.deliveryId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="ParcelId" v-model="item.parcelId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Status" v-model="item.status" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="UpdateTimeStamp" v-model="item.updateTimeStamp" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="ReceiverAddress" v-model="item.receiverAddress" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="SenderAddress" v-model="item.senderAddress" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="DueDate" v-model="item.dueDate" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'MyParcelViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/myParcels/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

