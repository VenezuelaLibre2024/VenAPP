package com.baseflow.geolocator;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.util.Log;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import java.util.Map;
import z2.e0;
import z2.p;
import z2.y;
import z2.z;

/* loaded from: classes.dex */
class m implements EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    private final a3.b f7341a;

    /* renamed from: b, reason: collision with root package name */
    private EventChannel f7342b;

    /* renamed from: c, reason: collision with root package name */
    private Context f7343c;

    /* renamed from: d, reason: collision with root package name */
    private Activity f7344d;

    /* renamed from: e, reason: collision with root package name */
    private GeolocatorLocationService f7345e;

    /* renamed from: f, reason: collision with root package name */
    private z2.l f7346f = new z2.l();

    /* renamed from: r, reason: collision with root package name */
    private p f7347r;

    public m(a3.b bVar) {
        this.f7341a = bVar;
    }

    private void c(boolean z10) {
        z2.l lVar;
        Log.e("FlutterGeolocator", "Geolocator position updates stopped");
        GeolocatorLocationService geolocatorLocationService = this.f7345e;
        if (geolocatorLocationService == null || !geolocatorLocationService.c(z10)) {
            Log.e("FlutterGeolocator", "There is still another flutter engine connected, not stopping location service");
        } else {
            this.f7345e.o();
            this.f7345e.e();
        }
        p pVar = this.f7347r;
        if (pVar == null || (lVar = this.f7346f) == null) {
            return;
        }
        lVar.f(pVar);
        this.f7347r = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(EventChannel.EventSink eventSink, Location location) {
        eventSink.success(y.b(location));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(EventChannel.EventSink eventSink, y2.b bVar) {
        eventSink.error(bVar.toString(), bVar.h(), null);
    }

    public void f(Activity activity) {
        if (activity == null && this.f7347r != null && this.f7342b != null) {
            i();
        }
        this.f7344d = activity;
    }

    public void g(GeolocatorLocationService geolocatorLocationService) {
        this.f7345e = geolocatorLocationService;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(Context context, BinaryMessenger binaryMessenger) {
        if (this.f7342b != null) {
            Log.w("FlutterGeolocator", "Setting a event call handler before the last was disposed.");
            i();
        }
        EventChannel eventChannel = new EventChannel(binaryMessenger, "flutter.baseflow.com/geolocator_updates_android");
        this.f7342b = eventChannel;
        eventChannel.setStreamHandler(this);
        this.f7343c = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        if (this.f7342b == null) {
            Log.d("FlutterGeolocator", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        c(false);
        this.f7342b.setStreamHandler(null);
        this.f7342b = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        c(true);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, final EventChannel.EventSink eventSink) {
        try {
            if (!this.f7341a.d(this.f7343c)) {
                y2.b bVar = y2.b.permissionDenied;
                eventSink.error(bVar.toString(), bVar.h(), null);
                return;
            }
            if (this.f7345e == null) {
                Log.e("FlutterGeolocator", "Location background service has not started correctly");
                return;
            }
            Map map = (Map) obj;
            boolean booleanValue = (map == null || map.get("forceLocationManager") == null) ? false : ((Boolean) map.get("forceLocationManager")).booleanValue();
            z e10 = z.e(map);
            z2.e h10 = map != null ? z2.e.h((Map) map.get("foregroundNotificationConfig")) : null;
            if (h10 != null) {
                Log.e("FlutterGeolocator", "Geolocator position updates started using Android foreground service");
                this.f7345e.n(booleanValue, e10, eventSink);
                this.f7345e.f(h10);
            } else {
                Log.e("FlutterGeolocator", "Geolocator position updates started");
                p a10 = this.f7346f.a(this.f7343c, Boolean.TRUE.equals(Boolean.valueOf(booleanValue)), e10);
                this.f7347r = a10;
                this.f7346f.e(a10, this.f7344d, new e0() { // from class: com.baseflow.geolocator.k
                    @Override // z2.e0
                    public final void a(Location location) {
                        m.d(EventChannel.EventSink.this, location);
                    }
                }, new y2.a() { // from class: com.baseflow.geolocator.l
                    @Override // y2.a
                    public final void a(y2.b bVar2) {
                        m.e(EventChannel.EventSink.this, bVar2);
                    }
                });
            }
        } catch (y2.c unused) {
            y2.b bVar2 = y2.b.permissionDefinitionsNotFound;
            eventSink.error(bVar2.toString(), bVar2.h(), null);
        }
    }
}
