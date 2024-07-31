package com.baseflow.geolocator;

import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import androidx.core.content.C0854a;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import p477z2.C12766b0;

/* renamed from: com.baseflow.geolocator.b */
/* loaded from: classes.dex */
public class C2101b implements EventChannel.StreamHandler {

    /* renamed from: a */
    private EventChannel f8266a;

    /* renamed from: b */
    private Context f8267b;

    /* renamed from: c */
    private C12766b0 f8268c;

    /* renamed from: a */
    private void m10584a() {
        C12766b0 c12766b0;
        Context context = this.f8267b;
        if (context == null || (c12766b0 = this.f8268c) == null) {
            return;
        }
        context.unregisterReceiver(c12766b0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m10585b(Context context) {
        this.f8267b = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m10586c(Context context, BinaryMessenger binaryMessenger) {
        if (this.f8266a != null) {
            Log.w("LocationServiceHandler", "Setting a event call handler before the last was disposed.");
            m10587d();
        }
        EventChannel eventChannel = new EventChannel(binaryMessenger, "flutter.baseflow.com/geolocator_service_updates_android");
        this.f8266a = eventChannel;
        eventChannel.setStreamHandler(this);
        this.f8267b = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m10587d() {
        if (this.f8266a == null) {
            return;
        }
        m10584a();
        this.f8266a.setStreamHandler(null);
        this.f8266a = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        m10584a();
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        if (this.f8267b == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.location.PROVIDERS_CHANGED");
        intentFilter.addAction("android.intent.action.PROVIDER_CHANGED");
        C12766b0 c12766b0 = new C12766b0(eventSink);
        this.f8268c = c12766b0;
        C0854a.registerReceiver(this.f8267b, c12766b0, intentFilter, 2);
    }
}
