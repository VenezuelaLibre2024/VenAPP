package com.baseflow.geolocator;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.net.wifi.WifiManager;
import android.os.Binder;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import com.baseflow.geolocator.GeolocatorLocationService;
import io.flutter.plugin.common.EventChannel;
import z2.e0;
import z2.p;
import z2.y;
import z2.z;

/* loaded from: classes.dex */
public class GeolocatorLocationService extends Service {

    /* renamed from: t, reason: collision with root package name */
    private p f7298t;

    /* renamed from: a, reason: collision with root package name */
    private final String f7290a = "GeolocatorLocationService:Wakelock";

    /* renamed from: b, reason: collision with root package name */
    private final String f7291b = "GeolocatorLocationService:WifiLock";

    /* renamed from: c, reason: collision with root package name */
    private final a f7292c = new a(this);

    /* renamed from: d, reason: collision with root package name */
    private boolean f7293d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f7294e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f7295f = 0;

    /* renamed from: r, reason: collision with root package name */
    private Activity f7296r = null;

    /* renamed from: s, reason: collision with root package name */
    private z2.l f7297s = null;

    /* renamed from: u, reason: collision with root package name */
    private PowerManager.WakeLock f7299u = null;

    /* renamed from: v, reason: collision with root package name */
    private WifiManager.WifiLock f7300v = null;

    /* renamed from: w, reason: collision with root package name */
    private z2.c f7301w = null;

    /* loaded from: classes.dex */
    class a extends Binder {

        /* renamed from: a, reason: collision with root package name */
        private final GeolocatorLocationService f7302a;

        a(GeolocatorLocationService geolocatorLocationService) {
            this.f7302a = geolocatorLocationService;
        }

        public GeolocatorLocationService a() {
            return this.f7302a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(EventChannel.EventSink eventSink, Location location) {
        eventSink.success(y.b(location));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(EventChannel.EventSink eventSink, y2.b bVar) {
        eventSink.error(bVar.toString(), bVar.h(), null);
    }

    private void k(z2.e eVar) {
        WifiManager wifiManager;
        PowerManager powerManager;
        l();
        if (eVar.e() && (powerManager = (PowerManager) getApplicationContext().getSystemService("power")) != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "GeolocatorLocationService:Wakelock");
            this.f7299u = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            this.f7299u.acquire();
        }
        if (!eVar.f() || (wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi")) == null) {
            return;
        }
        WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "GeolocatorLocationService:WifiLock");
        this.f7300v = createWifiLock;
        createWifiLock.setReferenceCounted(false);
        this.f7300v.acquire();
    }

    private void l() {
        PowerManager.WakeLock wakeLock = this.f7299u;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.f7299u.release();
            this.f7299u = null;
        }
        WifiManager.WifiLock wifiLock = this.f7300v;
        if (wifiLock == null || !wifiLock.isHeld()) {
            return;
        }
        this.f7300v.release();
        this.f7300v = null;
    }

    public boolean c(boolean z10) {
        return z10 ? this.f7295f == 1 : this.f7294e == 0;
    }

    public void d(z2.e eVar) {
        z2.c cVar = this.f7301w;
        if (cVar != null) {
            cVar.f(eVar, this.f7293d);
            k(eVar);
        }
    }

    public void e() {
        if (this.f7293d) {
            Log.d("FlutterGeolocator", "Stop service in foreground.");
            stopForeground(1);
            l();
            this.f7293d = false;
            this.f7301w = null;
        }
    }

    public void f(z2.e eVar) {
        if (this.f7301w != null) {
            Log.d("FlutterGeolocator", "Service already in foreground mode.");
            d(eVar);
        } else {
            Log.d("FlutterGeolocator", "Start service in foreground mode.");
            z2.c cVar = new z2.c(getApplicationContext(), "geolocator_channel_01", 75415, eVar);
            this.f7301w = cVar;
            cVar.d("Background Location");
            startForeground(75415, this.f7301w.a());
            this.f7293d = true;
        }
        k(eVar);
    }

    public void g() {
        this.f7294e++;
        Log.d("FlutterGeolocator", "Flutter engine connected. Connected engine count " + this.f7294e);
    }

    public void h() {
        this.f7294e--;
        Log.d("FlutterGeolocator", "Flutter engine disconnected. Connected engine count " + this.f7294e);
    }

    public void m(Activity activity) {
        this.f7296r = activity;
    }

    public void n(boolean z10, z zVar, final EventChannel.EventSink eventSink) {
        this.f7295f++;
        z2.l lVar = this.f7297s;
        if (lVar != null) {
            p a10 = lVar.a(getApplicationContext(), Boolean.TRUE.equals(Boolean.valueOf(z10)), zVar);
            this.f7298t = a10;
            this.f7297s.e(a10, this.f7296r, new e0() { // from class: x2.a
                @Override // z2.e0
                public final void a(Location location) {
                    GeolocatorLocationService.i(EventChannel.EventSink.this, location);
                }
            }, new y2.a() { // from class: x2.b
                @Override // y2.a
                public final void a(y2.b bVar) {
                    GeolocatorLocationService.j(EventChannel.EventSink.this, bVar);
                }
            });
        }
    }

    public void o() {
        z2.l lVar;
        this.f7295f--;
        Log.d("FlutterGeolocator", "Stopping location service.");
        p pVar = this.f7298t;
        if (pVar == null || (lVar = this.f7297s) == null) {
            return;
        }
        lVar.f(pVar);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Log.d("FlutterGeolocator", "Binding to location service.");
        return this.f7292c;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Log.d("FlutterGeolocator", "Creating service.");
        this.f7297s = new z2.l();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Log.d("FlutterGeolocator", "Destroying location service.");
        o();
        e();
        this.f7297s = null;
        this.f7301w = null;
        Log.d("FlutterGeolocator", "Destroyed location service.");
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return 1;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        Log.d("FlutterGeolocator", "Unbinding from location service.");
        return super.onUnbind(intent);
    }
}
