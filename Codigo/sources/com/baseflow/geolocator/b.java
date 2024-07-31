package com.baseflow.geolocator;

import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import z2.b0;

/* loaded from: classes.dex */
public class b implements EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    private EventChannel f7314a;

    /* renamed from: b, reason: collision with root package name */
    private Context f7315b;

    /* renamed from: c, reason: collision with root package name */
    private b0 f7316c;

    private void a() {
        b0 b0Var;
        Context context = this.f7315b;
        if (context == null || (b0Var = this.f7316c) == null) {
            return;
        }
        context.unregisterReceiver(b0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Context context) {
        this.f7315b = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Context context, BinaryMessenger binaryMessenger) {
        if (this.f7314a != null) {
            Log.w("LocationServiceHandler", "Setting a event call handler before the last was disposed.");
            d();
        }
        EventChannel eventChannel = new EventChannel(binaryMessenger, "flutter.baseflow.com/geolocator_service_updates_android");
        this.f7314a = eventChannel;
        eventChannel.setStreamHandler(this);
        this.f7315b = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        if (this.f7314a == null) {
            return;
        }
        a();
        this.f7314a.setStreamHandler(null);
        this.f7314a = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        a();
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        if (this.f7315b == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.location.PROVIDERS_CHANGED");
        intentFilter.addAction("android.intent.action.PROVIDER_CHANGED");
        b0 b0Var = new b0(eventSink);
        this.f7316c = b0Var;
        androidx.core.content.a.registerReceiver(this.f7315b, b0Var, intentFilter, 2);
    }
}
