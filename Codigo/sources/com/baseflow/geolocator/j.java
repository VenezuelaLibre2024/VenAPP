package com.baseflow.geolocator;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.util.Log;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Map;
import z2.e0;
import z2.n;
import z2.o;
import z2.p;
import z2.y;
import z2.z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    private final a3.b f7332a;

    /* renamed from: b, reason: collision with root package name */
    private final z2.l f7333b;

    /* renamed from: c, reason: collision with root package name */
    private final n f7334c;

    /* renamed from: d, reason: collision with root package name */
    final Map<String, p> f7335d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private Context f7336e;

    /* renamed from: f, reason: collision with root package name */
    private Activity f7337f;

    /* renamed from: r, reason: collision with root package name */
    private MethodChannel f7338r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(a3.b bVar, z2.l lVar, n nVar) {
        this.f7332a = bVar;
        this.f7333b = lVar;
        this.f7334c = nVar;
    }

    private void h(final MethodChannel.Result result, Context context) {
        o a10 = this.f7334c.a(context, new y2.a() { // from class: com.baseflow.geolocator.e
            @Override // y2.a
            public final void a(y2.b bVar) {
                j.i(MethodChannel.Result.this, bVar);
            }
        });
        if (a10 != null) {
            result.success(Integer.valueOf(a10.ordinal()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(MethodChannel.Result result, y2.b bVar) {
        result.error(bVar.toString(), bVar.h(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(boolean[] zArr, p pVar, String str, MethodChannel.Result result, Location location) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f7333b.f(pVar);
        this.f7335d.remove(str);
        result.success(y.b(location));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(boolean[] zArr, p pVar, String str, MethodChannel.Result result, y2.b bVar) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f7333b.f(pVar);
        this.f7335d.remove(str);
        result.error(bVar.toString(), bVar.h(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(MethodChannel.Result result, Location location) {
        result.success(y.b(location));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(MethodChannel.Result result, y2.b bVar) {
        result.error(bVar.toString(), bVar.h(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(MethodChannel.Result result, a3.a aVar) {
        result.success(Integer.valueOf(aVar.h()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(MethodChannel.Result result, y2.b bVar) {
        result.error(bVar.toString(), bVar.h(), null);
    }

    private void p(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) ((Map) methodCall.arguments).get("requestId");
        p pVar = this.f7335d.get(str);
        if (pVar != null) {
            pVar.f();
        }
        this.f7335d.remove(str);
        result.success(null);
    }

    private void q(MethodChannel.Result result) {
        try {
            result.success(Integer.valueOf(this.f7332a.a(this.f7336e).h()));
        } catch (y2.c unused) {
            y2.b bVar = y2.b.permissionDefinitionsNotFound;
            result.error(bVar.toString(), bVar.h(), null);
        }
    }

    private void r(MethodCall methodCall, final MethodChannel.Result result) {
        try {
            if (!this.f7332a.d(this.f7336e)) {
                y2.b bVar = y2.b.permissionDenied;
                result.error(bVar.toString(), bVar.h(), null);
                return;
            }
            Map map = (Map) methodCall.arguments;
            boolean booleanValue = map.get("forceLocationManager") != null ? ((Boolean) map.get("forceLocationManager")).booleanValue() : false;
            z e10 = z.e(map);
            final String str = (String) map.get("requestId");
            final boolean[] zArr = {false};
            final p a10 = this.f7333b.a(this.f7336e, booleanValue, e10);
            this.f7335d.put(str, a10);
            this.f7333b.e(a10, this.f7337f, new e0() { // from class: com.baseflow.geolocator.h
                @Override // z2.e0
                public final void a(Location location) {
                    j.this.j(zArr, a10, str, result, location);
                }
            }, new y2.a() { // from class: com.baseflow.geolocator.i
                @Override // y2.a
                public final void a(y2.b bVar2) {
                    j.this.k(zArr, a10, str, result, bVar2);
                }
            });
        } catch (y2.c unused) {
            y2.b bVar2 = y2.b.permissionDefinitionsNotFound;
            result.error(bVar2.toString(), bVar2.h(), null);
        }
    }

    private void s(MethodCall methodCall, final MethodChannel.Result result) {
        try {
            if (this.f7332a.d(this.f7336e)) {
                Boolean bool = (Boolean) methodCall.argument("forceLocationManager");
                this.f7333b.b(this.f7336e, bool != null && bool.booleanValue(), new e0() { // from class: com.baseflow.geolocator.c
                    @Override // z2.e0
                    public final void a(Location location) {
                        j.l(MethodChannel.Result.this, location);
                    }
                }, new y2.a() { // from class: com.baseflow.geolocator.d
                    @Override // y2.a
                    public final void a(y2.b bVar) {
                        j.m(MethodChannel.Result.this, bVar);
                    }
                });
            } else {
                y2.b bVar = y2.b.permissionDenied;
                result.error(bVar.toString(), bVar.h(), null);
            }
        } catch (y2.c unused) {
            y2.b bVar2 = y2.b.permissionDefinitionsNotFound;
            result.error(bVar2.toString(), bVar2.h(), null);
        }
    }

    private void t(MethodChannel.Result result) {
        this.f7333b.d(this.f7336e, new z2.d(result));
    }

    private void u(final MethodChannel.Result result) {
        try {
            this.f7332a.f(this.f7337f, new a3.c() { // from class: com.baseflow.geolocator.f
                @Override // a3.c
                public final void a(a3.a aVar) {
                    j.n(MethodChannel.Result.this, aVar);
                }
            }, new y2.a() { // from class: com.baseflow.geolocator.g
                @Override // y2.a
                public final void a(y2.b bVar) {
                    j.o(MethodChannel.Result.this, bVar);
                }
            });
        } catch (y2.c unused) {
            y2.b bVar = y2.b.permissionDefinitionsNotFound;
            result.error(bVar.toString(), bVar.h(), null);
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        boolean b10;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1757019252:
                if (str.equals("getCurrentPosition")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1156770336:
                if (str.equals("getLastKnownPosition")) {
                    c10 = 1;
                    break;
                }
                break;
            case -821636766:
                if (str.equals("openLocationSettings")) {
                    c10 = 2;
                    break;
                }
                break;
            case 347240634:
                if (str.equals("openAppSettings")) {
                    c10 = 3;
                    break;
                }
                break;
            case 356040619:
                if (str.equals("isLocationServiceEnabled")) {
                    c10 = 4;
                    break;
                }
                break;
            case 686218487:
                if (str.equals("checkPermission")) {
                    c10 = 5;
                    break;
                }
                break;
            case 746581438:
                if (str.equals("requestPermission")) {
                    c10 = 6;
                    break;
                }
                break;
            case 877043524:
                if (str.equals("getLocationAccuracy")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1774650278:
                if (str.equals("cancelGetCurrentPosition")) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                r(methodCall, result);
                return;
            case 1:
                s(methodCall, result);
                return;
            case 2:
                b10 = b3.a.b(this.f7336e);
                break;
            case 3:
                b10 = b3.a.a(this.f7336e);
                break;
            case 4:
                t(result);
                return;
            case 5:
                q(result);
                return;
            case 6:
                u(result);
                return;
            case 7:
                h(result, this.f7336e);
                return;
            case '\b':
                p(methodCall, result);
                return;
            default:
                result.notImplemented();
                return;
        }
        result.success(Boolean.valueOf(b10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(Activity activity) {
        this.f7337f = activity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(Context context, BinaryMessenger binaryMessenger) {
        if (this.f7338r != null) {
            Log.w("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            x();
        }
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "flutter.baseflow.com/geolocator_android");
        this.f7338r = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f7336e = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x() {
        MethodChannel methodChannel = this.f7338r;
        if (methodChannel == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
        } else {
            methodChannel.setMethodCallHandler(null);
            this.f7338r = null;
        }
    }
}
