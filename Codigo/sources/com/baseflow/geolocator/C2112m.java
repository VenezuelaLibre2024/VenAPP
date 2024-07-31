package com.baseflow.geolocator;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.util.Log;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import java.util.Map;
import p005a3.C0027b;
import p455y2.C12585c;
import p455y2.EnumC12584b;
import p455y2.InterfaceC12583a;
import p477z2.C12771e;
import p477z2.C12780l;
import p477z2.C12793y;
import p477z2.C12794z;
import p477z2.InterfaceC12772e0;
import p477z2.InterfaceC12784p;

/* renamed from: com.baseflow.geolocator.m */
/* loaded from: classes.dex */
class C2112m implements EventChannel.StreamHandler {

    /* renamed from: a */
    private final C0027b f8293a;

    /* renamed from: b */
    private EventChannel f8294b;

    /* renamed from: c */
    private Context f8295c;

    /* renamed from: d */
    private Activity f8296d;

    /* renamed from: e */
    private GeolocatorLocationService f8297e;

    /* renamed from: f */
    private C12780l f8298f = new C12780l();

    /* renamed from: r */
    private InterfaceC12784p f8299r;

    public C2112m(C0027b c0027b) {
        this.f8293a = c0027b;
    }

    /* renamed from: c */
    private void m10616c(boolean z10) {
        C12780l c12780l;
        Log.e("FlutterGeolocator", "Geolocator position updates stopped");
        GeolocatorLocationService geolocatorLocationService = this.f8297e;
        if (geolocatorLocationService == null || !geolocatorLocationService.m10565c(z10)) {
            Log.e("FlutterGeolocator", "There is still another flutter engine connected, not stopping location service");
        } else {
            this.f8297e.m10573o();
            this.f8297e.m10567e();
        }
        InterfaceC12784p interfaceC12784p = this.f8299r;
        if (interfaceC12784p == null || (c12780l = this.f8298f) == null) {
            return;
        }
        c12780l.m42409f(interfaceC12784p);
        this.f8299r = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m10617d(EventChannel.EventSink eventSink, Location location) {
        eventSink.success(C12793y.m42425b(location));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m10618e(EventChannel.EventSink eventSink, EnumC12584b enumC12584b) {
        eventSink.error(enumC12584b.toString(), enumC12584b.m41328h(), null);
    }

    /* renamed from: f */
    public void m10619f(Activity activity) {
        if (activity == null && this.f8299r != null && this.f8294b != null) {
            m10622i();
        }
        this.f8296d = activity;
    }

    /* renamed from: g */
    public void m10620g(GeolocatorLocationService geolocatorLocationService) {
        this.f8297e = geolocatorLocationService;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m10621h(Context context, BinaryMessenger binaryMessenger) {
        if (this.f8294b != null) {
            Log.w("FlutterGeolocator", "Setting a event call handler before the last was disposed.");
            m10622i();
        }
        EventChannel eventChannel = new EventChannel(binaryMessenger, "flutter.baseflow.com/geolocator_updates_android");
        this.f8294b = eventChannel;
        eventChannel.setStreamHandler(this);
        this.f8295c = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m10622i() {
        if (this.f8294b == null) {
            Log.d("FlutterGeolocator", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        m10616c(false);
        this.f8294b.setStreamHandler(null);
        this.f8294b = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        m10616c(true);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, final EventChannel.EventSink eventSink) {
        try {
            if (!this.f8293a.m97d(this.f8295c)) {
                EnumC12584b enumC12584b = EnumC12584b.permissionDenied;
                eventSink.error(enumC12584b.toString(), enumC12584b.m41328h(), null);
                return;
            }
            if (this.f8297e == null) {
                Log.e("FlutterGeolocator", "Location background service has not started correctly");
                return;
            }
            Map map = (Map) obj;
            boolean booleanValue = (map == null || map.get("forceLocationManager") == null) ? false : ((Boolean) map.get("forceLocationManager")).booleanValue();
            C12794z m42426e = C12794z.m42426e(map);
            C12771e m42371h = map != null ? C12771e.m42371h((Map) map.get("foregroundNotificationConfig")) : null;
            if (m42371h != null) {
                Log.e("FlutterGeolocator", "Geolocator position updates started using Android foreground service");
                this.f8297e.m10572n(booleanValue, m42426e, eventSink);
                this.f8297e.m10568f(m42371h);
            } else {
                Log.e("FlutterGeolocator", "Geolocator position updates started");
                InterfaceC12784p m42405a = this.f8298f.m42405a(this.f8295c, Boolean.TRUE.equals(Boolean.valueOf(booleanValue)), m42426e);
                this.f8299r = m42405a;
                this.f8298f.m42408e(m42405a, this.f8296d, new InterfaceC12772e0() { // from class: com.baseflow.geolocator.k
                    @Override // p477z2.InterfaceC12772e0
                    /* renamed from: a */
                    public final void mo10588a(Location location) {
                        C2112m.m10617d(EventChannel.EventSink.this, location);
                    }
                }, new InterfaceC12583a() { // from class: com.baseflow.geolocator.l
                    @Override // p455y2.InterfaceC12583a
                    /* renamed from: a */
                    public final void mo10589a(EnumC12584b enumC12584b2) {
                        C2112m.m10618e(EventChannel.EventSink.this, enumC12584b2);
                    }
                });
            }
        } catch (C12585c unused) {
            EnumC12584b enumC12584b2 = EnumC12584b.permissionDefinitionsNotFound;
            eventSink.error(enumC12584b2.toString(), enumC12584b2.m41328h(), null);
        }
    }
}
