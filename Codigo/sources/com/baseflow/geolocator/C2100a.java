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
import p005a3.C0027b;
import p477z2.C12780l;
import p477z2.C12782n;

/* renamed from: com.baseflow.geolocator.a */
/* loaded from: classes.dex */
public class C2100a implements FlutterPlugin, ActivityAware {

    /* renamed from: d */
    private GeolocatorLocationService f8259d;

    /* renamed from: e */
    private C2109j f8260e;

    /* renamed from: f */
    private C2112m f8261f;

    /* renamed from: s */
    private C2101b f8263s;

    /* renamed from: t */
    private ActivityPluginBinding f8264t;

    /* renamed from: r */
    private final ServiceConnection f8262r = new a();

    /* renamed from: a */
    private final C0027b f8256a = new C0027b();

    /* renamed from: b */
    private final C12780l f8257b = new C12780l();

    /* renamed from: c */
    private final C12782n f8258c = new C12782n();

    /* renamed from: com.baseflow.geolocator.a$a */
    /* loaded from: classes.dex */
    class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.m24635d("FlutterGeolocator", "Geolocator foreground service connected");
            if (iBinder instanceof GeolocatorLocationService.BinderC2099a) {
                C2100a.this.m10581g(((GeolocatorLocationService.BinderC2099a) iBinder).m10574a());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.m24635d("FlutterGeolocator", "Geolocator foreground service disconnected");
            if (C2100a.this.f8259d != null) {
                C2100a.this.f8259d.m10571m(null);
                C2100a.this.f8259d = null;
            }
        }
    }

    /* renamed from: d */
    private void m10578d(Context context) {
        context.bindService(new Intent(context, (Class<?>) GeolocatorLocationService.class), this.f8262r, 1);
    }

    /* renamed from: e */
    private void m10579e() {
        ActivityPluginBinding activityPluginBinding = this.f8264t;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this.f8257b);
            this.f8264t.removeRequestPermissionsResultListener(this.f8256a);
        }
    }

    /* renamed from: f */
    private void m10580f() {
        Log.m24635d("FlutterGeolocator", "Disposing Geolocator services");
        C2109j c2109j = this.f8260e;
        if (c2109j != null) {
            c2109j.m10613x();
            this.f8260e.m10611v(null);
            this.f8260e = null;
        }
        C2112m c2112m = this.f8261f;
        if (c2112m != null) {
            c2112m.m10622i();
            this.f8261f.m10620g(null);
            this.f8261f = null;
        }
        C2101b c2101b = this.f8263s;
        if (c2101b != null) {
            c2101b.m10585b(null);
            this.f8263s.m10587d();
            this.f8263s = null;
        }
        GeolocatorLocationService geolocatorLocationService = this.f8259d;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.m10571m(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m10581g(GeolocatorLocationService geolocatorLocationService) {
        Log.m24635d("FlutterGeolocator", "Initializing Geolocator services");
        this.f8259d = geolocatorLocationService;
        geolocatorLocationService.m10569g();
        C2112m c2112m = this.f8261f;
        if (c2112m != null) {
            c2112m.m10620g(geolocatorLocationService);
        }
    }

    /* renamed from: h */
    private void m10582h() {
        ActivityPluginBinding activityPluginBinding = this.f8264t;
        if (activityPluginBinding != null) {
            activityPluginBinding.addActivityResultListener(this.f8257b);
            this.f8264t.addRequestPermissionsResultListener(this.f8256a);
        }
    }

    /* renamed from: i */
    private void m10583i(Context context) {
        GeolocatorLocationService geolocatorLocationService = this.f8259d;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.m10570h();
        }
        context.unbindService(this.f8262r);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        Log.m24635d("FlutterGeolocator", "Attaching Geolocator to activity");
        this.f8264t = activityPluginBinding;
        m10582h();
        C2109j c2109j = this.f8260e;
        if (c2109j != null) {
            c2109j.m10611v(activityPluginBinding.getActivity());
        }
        C2112m c2112m = this.f8261f;
        if (c2112m != null) {
            c2112m.m10619f(activityPluginBinding.getActivity());
        }
        GeolocatorLocationService geolocatorLocationService = this.f8259d;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.m10571m(this.f8264t.getActivity());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C2109j c2109j = new C2109j(this.f8256a, this.f8257b, this.f8258c);
        this.f8260e = c2109j;
        c2109j.m10612w(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
        C2112m c2112m = new C2112m(this.f8256a);
        this.f8261f = c2112m;
        c2112m.m10621h(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
        C2101b c2101b = new C2101b();
        this.f8263s = c2101b;
        c2101b.m10585b(flutterPluginBinding.getApplicationContext());
        this.f8263s.m10586c(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
        m10578d(flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        Log.m24635d("FlutterGeolocator", "Detaching Geolocator from activity");
        m10579e();
        C2109j c2109j = this.f8260e;
        if (c2109j != null) {
            c2109j.m10611v(null);
        }
        C2112m c2112m = this.f8261f;
        if (c2112m != null) {
            c2112m.m10619f(null);
        }
        GeolocatorLocationService geolocatorLocationService = this.f8259d;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.m10571m(null);
        }
        if (this.f8264t != null) {
            this.f8264t = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m10583i(flutterPluginBinding.getApplicationContext());
        m10580f();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
