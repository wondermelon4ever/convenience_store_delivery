
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ReservationManager from "./components/listers/ReservationCards"
import ReservationDetail from "./components/listers/ReservationDetail"
import InvoiceManager from "./components/listers/InvoiceCards"
import InvoiceDetail from "./components/listers/InvoiceDetail"

import ParcelManager from "./components/listers/ParcelCards"
import ParcelDetail from "./components/listers/ParcelDetail"

import DeliveryManager from "./components/listers/DeliveryCards"
import DeliveryDetail from "./components/listers/DeliveryDetail"


import MyParcelView from "./components/MyParcelView"
import MyParcelViewDetail from "./components/MyParcelViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/reservations',
                name: 'ReservationManager',
                component: ReservationManager
            },
            {
                path: '/reservations/:id',
                name: 'ReservationDetail',
                component: ReservationDetail
            },
            {
                path: '/invoices',
                name: 'InvoiceManager',
                component: InvoiceManager
            },
            {
                path: '/invoices/:id',
                name: 'InvoiceDetail',
                component: InvoiceDetail
            },

            {
                path: '/parcels',
                name: 'ParcelManager',
                component: ParcelManager
            },
            {
                path: '/parcels/:id',
                name: 'ParcelDetail',
                component: ParcelDetail
            },

            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryDetail',
                component: DeliveryDetail
            },


            {
                path: '/myParcels',
                name: 'MyParcelView',
                component: MyParcelView
            },
            {
                path: '/myParcels/:id',
                name: 'MyParcelViewDetail',
                component: MyParcelViewDetail
            },


    ]
})
