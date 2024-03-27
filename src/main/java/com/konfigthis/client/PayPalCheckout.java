package com.konfigthis.client;

import com.konfigthis.client.api.OrdersApi;
import com.konfigthis.client.api.TrackersApi;

public class PayPalCheckout {
    private ApiClient apiClient;
    public final OrdersApi orders;
    public final TrackersApi trackers;

    public PayPalCheckout() {
        this(null);
    }

    public PayPalCheckout(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.orders = new OrdersApi(this.apiClient);
        this.trackers = new TrackersApi(this.apiClient);
    }

}
