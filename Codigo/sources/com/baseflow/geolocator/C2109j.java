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
import p005a3.C0027b;
import p005a3.EnumC0026a;
import p005a3.InterfaceC0028c;
import p021b3.C1652a;
import p455y2.C12585c;
import p455y2.EnumC12584b;
import p455y2.InterfaceC12583a;
import p477z2.C12769d;
import p477z2.C12780l;
import p477z2.C12782n;
import p477z2.C12793y;
import p477z2.C12794z;
import p477z2.EnumC12783o;
import p477z2.InterfaceC12772e0;
import p477z2.InterfaceC12784p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.baseflow.geolocator.j */
/* loaded from: classes.dex */
public class C2109j implements MethodChannel.MethodCallHandler {

    /* renamed from: a */
    private final C0027b f8284a;

    /* renamed from: b */
    private final C12780l f8285b;

    /* renamed from: c */
    private final C12782n f8286c;

    /* renamed from: d */
    final Map<String, InterfaceC12784p> f8287d = new HashMap();

    /* renamed from: e */
    private Context f8288e;

    /* renamed from: f */
    private Activity f8289f;

    /* renamed from: r */
    private MethodChannel f8290r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2109j(C0027b c0027b, C12780l c12780l, C12782n c12782n) {
        this.f8284a = c0027b;
        this.f8285b = c12780l;
        this.f8286c = c12782n;
    }

    /* renamed from: h */
    private void m10597h(final MethodChannel.Result result, Context context) {
        EnumC12783o m42411a = this.f8286c.m42411a(context, new InterfaceC12583a() { // from class: com.baseflow.geolocator.e
            @Override // p455y2.InterfaceC12583a
            /* renamed from: a */
            public final void mo10589a(EnumC12584b enumC12584b) {
                C2109j.m10598i(MethodChannel.Result.this, enumC12584b);
            }
        });
        if (m42411a != null) {
            result.success(Integer.valueOf(m42411a.ordinal()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m10598i(MethodChannel.Result result, EnumC12584b enumC12584b) {
        result.error(enumC12584b.toString(), enumC12584b.m41328h(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m10599j(boolean[] zArr, InterfaceC12784p interfaceC12784p, String str, MethodChannel.Result result, Location location) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f8285b.m42409f(interfaceC12784p);
        this.f8287d.remove(str);
        result.success(C12793y.m42425b(location));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m10600k(boolean[] zArr, InterfaceC12784p interfaceC12784p, String str, MethodChannel.Result result, EnumC12584b enumC12584b) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        this.f8285b.m42409f(interfaceC12784p);
        this.f8287d.remove(str);
        result.error(enumC12584b.toString(), enumC12584b.m41328h(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m10601l(MethodChannel.Result result, Location location) {
        result.success(C12793y.m42425b(location));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ void m10602m(MethodChannel.Result result, EnumC12584b enumC12584b) {
        result.error(enumC12584b.toString(), enumC12584b.m41328h(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ void m10603n(MethodChannel.Result result, EnumC0026a enumC0026a) {
        result.success(Integer.valueOf(enumC0026a.m92h()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ void m10604o(MethodChannel.Result result, EnumC12584b enumC12584b) {
        result.error(enumC12584b.toString(), enumC12584b.m41328h(), null);
    }

    /* renamed from: p */
    private void m10605p(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) ((Map) methodCall.arguments).get("requestId");
        InterfaceC12784p interfaceC12784p = this.f8287d.get(str);
        if (interfaceC12784p != null) {
            interfaceC12784p.mo42403f();
        }
        this.f8287d.remove(str);
        result.success(null);
    }

    /* renamed from: q */
    private void m10606q(MethodChannel.Result result) {
        try {
            result.success(Integer.valueOf(this.f8284a.m96a(this.f8288e).m92h()));
        } catch (C12585c unused) {
            EnumC12584b enumC12584b = EnumC12584b.permissionDefinitionsNotFound;
            result.error(enumC12584b.toString(), enumC12584b.m41328h(), null);
        }
    }

    /* renamed from: r */
    private void m10607r(MethodCall methodCall, final MethodChannel.Result result) {
        try {
            if (!this.f8284a.m97d(this.f8288e)) {
                EnumC12584b enumC12584b = EnumC12584b.permissionDenied;
                result.error(enumC12584b.toString(), enumC12584b.m41328h(), null);
                return;
            }
            Map map = (Map) methodCall.arguments;
            boolean booleanValue = map.get("forceLocationManager") != null ? ((Boolean) map.get("forceLocationManager")).booleanValue() : false;
            C12794z m42426e = C12794z.m42426e(map);
            final String str = (String) map.get("requestId");
            final boolean[] zArr = {false};
            final InterfaceC12784p m42405a = this.f8285b.m42405a(this.f8288e, booleanValue, m42426e);
            this.f8287d.put(str, m42405a);
            this.f8285b.m42408e(m42405a, this.f8289f, new InterfaceC12772e0() { // from class: com.baseflow.geolocator.h
                @Override // p477z2.InterfaceC12772e0
                /* renamed from: a */
                public final void mo10588a(Location location) {
                    C2109j.this.m10599j(zArr, m42405a, str, result, location);
                }
            }, new InterfaceC12583a() { // from class: com.baseflow.geolocator.i
                @Override // p455y2.InterfaceC12583a
                /* renamed from: a */
                public final void mo10589a(EnumC12584b enumC12584b2) {
                    C2109j.this.m10600k(zArr, m42405a, str, result, enumC12584b2);
                }
            });
        } catch (C12585c unused) {
            EnumC12584b enumC12584b2 = EnumC12584b.permissionDefinitionsNotFound;
            result.error(enumC12584b2.toString(), enumC12584b2.m41328h(), null);
        }
    }

    /* renamed from: s */
    private void m10608s(MethodCall methodCall, final MethodChannel.Result result) {
        try {
            if (this.f8284a.m97d(this.f8288e)) {
                Boolean bool = (Boolean) methodCall.argument("forceLocationManager");
                this.f8285b.m42406b(this.f8288e, bool != null && bool.booleanValue(), new InterfaceC12772e0() { // from class: com.baseflow.geolocator.c
                    @Override // p477z2.InterfaceC12772e0
                    /* renamed from: a */
                    public final void mo10588a(Location location) {
                        C2109j.m10601l(MethodChannel.Result.this, location);
                    }
                }, new InterfaceC12583a() { // from class: com.baseflow.geolocator.d
                    @Override // p455y2.InterfaceC12583a
                    /* renamed from: a */
                    public final void mo10589a(EnumC12584b enumC12584b) {
                        C2109j.m10602m(MethodChannel.Result.this, enumC12584b);
                    }
                });
            } else {
                EnumC12584b enumC12584b = EnumC12584b.permissionDenied;
                result.error(enumC12584b.toString(), enumC12584b.m41328h(), null);
            }
        } catch (C12585c unused) {
            EnumC12584b enumC12584b2 = EnumC12584b.permissionDefinitionsNotFound;
            result.error(enumC12584b2.toString(), enumC12584b2.m41328h(), null);
        }
    }

    /* renamed from: t */
    private void m10609t(MethodChannel.Result result) {
        this.f8285b.m42407d(this.f8288e, new C12769d(result));
    }

    /* renamed from: u */
    private void m10610u(final MethodChannel.Result result) {
        try {
            this.f8284a.m98f(this.f8289f, new InterfaceC0028c() { // from class: com.baseflow.geolocator.f
                @Override // p005a3.InterfaceC0028c
                /* renamed from: a */
                public final void mo99a(EnumC0026a enumC0026a) {
                    C2109j.m10603n(MethodChannel.Result.this, enumC0026a);
                }
            }, new InterfaceC12583a() { // from class: com.baseflow.geolocator.g
                @Override // p455y2.InterfaceC12583a
                /* renamed from: a */
                public final void mo10589a(EnumC12584b enumC12584b) {
                    C2109j.m10604o(MethodChannel.Result.this, enumC12584b);
                }
            });
        } catch (C12585c unused) {
            EnumC12584b enumC12584b = EnumC12584b.permissionDefinitionsNotFound;
            result.error(enumC12584b.toString(), enumC12584b.m41328h(), null);
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        boolean m9108b;
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
                m10607r(methodCall, result);
                return;
            case 1:
                m10608s(methodCall, result);
                return;
            case 2:
                m9108b = C1652a.m9108b(this.f8288e);
                break;
            case 3:
                m9108b = C1652a.m9107a(this.f8288e);
                break;
            case 4:
                m10609t(result);
                return;
            case 5:
                m10606q(result);
                return;
            case 6:
                m10610u(result);
                return;
            case 7:
                m10597h(result, this.f8288e);
                return;
            case '\b':
                m10605p(methodCall, result);
                return;
            default:
                result.notImplemented();
                return;
        }
        result.success(Boolean.valueOf(m9108b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m10611v(Activity activity) {
        this.f8289f = activity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m10612w(Context context, BinaryMessenger binaryMessenger) {
        if (this.f8290r != null) {
            Log.w("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            m10613x();
        }
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "flutter.baseflow.com/geolocator_android");
        this.f8290r = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f8288e = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m10613x() {
        MethodChannel methodChannel = this.f8290r;
        if (methodChannel == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
        } else {
            methodChannel.setMethodCallHandler(null);
            this.f8290r = null;
        }
    }
}
