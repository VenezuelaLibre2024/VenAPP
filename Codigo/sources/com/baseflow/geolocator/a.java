package com.baseflow.geolocator;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.baseflow.geolocator.GeolocatorLocationService;
import io.flutter.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import z2.n;

/* loaded from: classes.dex */
public class a implements FlutterPlugin, ActivityAware {

    /* renamed from: d */
    private GeolocatorLocationService f7307d;

    /* renamed from: e */
    private j f7308e;

    /* renamed from: f */
    private m f7309f;

    /* renamed from: s */
    private b f7311s;

    /* renamed from: t */
    private ActivityPluginBinding f7312t;

    /* renamed from: r */
    private final ServiceConnection f7310r = new ServiceConnectionC0127a();

    /* renamed from: a */
    private final a3.b f7304a = new a3.b();

    /* renamed from: b */
    private final z2.l f7305b = new z2.l();

    /* renamed from: c */
    private final n f7306c = new n();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.baseflow.geolocator.a$a */
    /* loaded from: classes.dex */
    public class ServiceConnectionC0127a implements ServiceConnection {
        ServiceConnectionC0127a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("FlutterGeolocator", "Geolocator foreground service connected");
            if (iBinder instanceof GeolocatorLocationService.a) {
                a.this.g(((GeolocatorLocationService.a) iBinder).a());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("FlutterGeolocator", "Geolocator foreground service disconnected");
            if (a.this.f7307d != null) {
                a.this.f7307d.m(null);
                a.this.f7307d = null;
            }
        }
    }

    private void d(Context context) {
        context.bindService(new Intent(context, (Class<?>) GeolocatorLocationService.class), this.f7310r, 1);
    }

    private void e() {
        ActivityPluginBinding activityPluginBinding = this.f7312t;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this.f7305b);
            this.f7312t.removeRequestPermissionsResultListener(this.f7304a);
        }
    }

    private void f() {
        Log.d("FlutterGeolocator", "Disposing Geolocator services");
        j jVar = this.f7308e;
        if (jVar != null) {
            jVar.x();
            this.f7308e.v(null);
            this.f7308e = null;
        }
        m mVar = this.f7309f;
        if (mVar != null) {
            mVar.i();
            this.f7309f.g(null);
            this.f7309f = null;
        }
        b bVar = this.f7311s;
        if (bVar != null) {
            bVar.b(null);
            this.f7311s.d();
            this.f7311s = null;
        }
        GeolocatorLocationService geolocatorLocationService = this.f7307d;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.m(null);
        }
    }

    public void g(GeolocatorLocationService geolocatorLocationService) {
        Log.d("FlutterGeolocator", "Initializing Geolocator services");
        this.f7307d = geolocatorLocationService;
        geolocatorLocationService.g();
        m mVar = this.f7309f;
        if (mVar != null) {
            mVar.g(geolocatorLocationService);
        }
    }

    private void h() {
        ActivityPluginBinding activityPluginBinding = this.f7312t;
        if (activityPluginBinding != null) {
            activityPluginBinding.addActivityResultListener(this.f7305b);
            this.f7312t.addRequestPermissionsResultListener(this.f7304a);
        }
    }

    private void i(Context context) {
        GeolocatorLocationService geolocatorLocationService = this.f7307d;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.h();
        }
        context.unbindService(this.f7310r);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        Log.d("FlutterGeolocator", "Attaching Geolocator to activity");
        this.f7312t = activityPluginBinding;
        h();
        j jVar = this.f7308e;
        if (jVar != null) {
            jVar.v(activityPluginBinding.getActivity());
        }
        m mVar = this.f7309f;
        if (mVar != null) {
            mVar.f(activityPluginBinding.getActivity());
        }
        GeolocatorLocationService geolocatorLocationService = this.f7307d;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.m(this.f7312t.getActivity());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        j jVar = new j(this.f7304a, this.f7305b, this.f7306c);
        this.f7308e = jVar;
        jVar.w(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
        m mVar = new m(this.f7304a);
        this.f7309f = mVar;
        mVar.h(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
        b bVar = new b();
        this.f7311s = bVar;
        bVar.b(flutterPluginBinding.getApplicationContext());
        this.f7311s.c(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
        d(flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        Log.d("FlutterGeolocator", "Detaching Geolocator from activity");
        e();
        j jVar = this.f7308e;
        if (jVar != null) {
            jVar.v(null);
        }
        m mVar = this.f7309f;
        if (mVar != null) {
            mVar.f(null);
        }
        GeolocatorLocationService geolocatorLocationService = this.f7307d;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.m(null);
        }
        if (this.f7312t != null) {
            this.f7312t = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        i(flutterPluginBinding.getApplicationContext());
        f();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
