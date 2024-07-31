package pl;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import ck.m;
import ck.r;
import ck.v;
import dg.s;
import dk.k0;
import ih.j;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.platform.PlatformView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jh.i;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class c implements PlatformView, MethodChannel.MethodCallHandler, PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: u */
    public static final C0387c f23280u = new C0387c(null);

    /* renamed from: a */
    private final Context f23281a;

    /* renamed from: b */
    private final int f23282b;

    /* renamed from: c */
    private final HashMap<String, Object> f23283c;

    /* renamed from: d */
    private boolean f23284d;

    /* renamed from: e */
    private boolean f23285e;

    /* renamed from: f */
    private pl.a f23286f;

    /* renamed from: r */
    private final MethodChannel f23287r;

    /* renamed from: s */
    private g f23288s;

    /* renamed from: t */
    private final int f23289t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends o implements ok.a<v> {
        a() {
            super(0);
        }

        public final void a() {
            pl.a aVar;
            if (c.this.f23285e || !c.this.n() || (aVar = c.this.f23286f) == null) {
                return;
            }
            aVar.u();
        }

        @Override // ok.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f7137a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends o implements ok.a<v> {
        b() {
            super(0);
        }

        public final void a() {
            pl.a aVar;
            if (!c.this.n()) {
                c.this.h();
            } else {
                if (c.this.f23285e || !c.this.n() || (aVar = c.this.f23286f) == null) {
                    return;
                }
                aVar.y();
            }
        }

        @Override // ok.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f7137a;
        }
    }

    /* renamed from: pl.c$c */
    /* loaded from: classes3.dex */
    public static final class C0387c {
        private C0387c() {
        }

        public /* synthetic */ C0387c(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements ih.a {

        /* renamed from: a */
        final /* synthetic */ List<dg.a> f23292a;

        /* renamed from: b */
        final /* synthetic */ c f23293b;

        /* JADX WARN: Multi-variable type inference failed */
        d(List<? extends dg.a> list, c cVar) {
            this.f23292a = list;
            this.f23293b = cVar;
        }

        @Override // ih.a
        public void a(List<? extends s> resultPoints) {
            n.e(resultPoints, "resultPoints");
        }

        @Override // ih.a
        public void b(ih.b result) {
            Map k10;
            n.e(result, "result");
            if (this.f23292a.isEmpty() || this.f23292a.contains(result.a())) {
                k10 = k0.k(r.a("code", result.e()), r.a("type", result.a().name()), r.a("rawBytes", result.c()));
                this.f23293b.f23287r.invokeMethod("onRecognizeQR", k10);
            }
        }
    }

    public c(Context context, BinaryMessenger messenger, int i10, HashMap<String, Object> params) {
        n.e(context, "context");
        n.e(messenger, "messenger");
        n.e(params, "params");
        this.f23281a = context;
        this.f23282b = i10;
        this.f23283c = params;
        MethodChannel methodChannel = new MethodChannel(messenger, "net.touchcapture.qr.flutterqr/qrview_" + i10);
        this.f23287r = methodChannel;
        this.f23289t = i10 + 513469796;
        f fVar = f.f23298a;
        ActivityPluginBinding b10 = fVar.b();
        if (b10 != null) {
            b10.addRequestPermissionsResultListener(this);
        }
        methodChannel.setMethodCallHandler(this);
        Activity a10 = fVar.a();
        this.f23288s = a10 != null ? e.a(a10, new a(), new b()) : null;
    }

    private final void A(MethodChannel.Result result) {
        pl.a aVar = this.f23286f;
        if (aVar == null) {
            f(result);
            return;
        }
        if (!q()) {
            result.error("404", "This device doesn't support flash", null);
            return;
        }
        aVar.setTorch(!this.f23284d);
        boolean z10 = !this.f23284d;
        this.f23284d = z10;
        result.success(Boolean.valueOf(z10));
    }

    private final void f(MethodChannel.Result result) {
        result.error("404", "No barcode view found", null);
    }

    private final void g(double d10, double d11, double d12, MethodChannel.Result result) {
        x(d10, d11, d12);
        result.success(Boolean.TRUE);
    }

    public final void h() {
        if (n()) {
            this.f23287r.invokeMethod("onPermissionSet", Boolean.TRUE);
            return;
        }
        Activity a10 = f.f23298a.a();
        if (a10 != null) {
            a10.requestPermissions(new String[]{"android.permission.CAMERA"}, this.f23289t);
        }
    }

    private final int i(double d10) {
        return (int) (d10 * this.f23281a.getResources().getDisplayMetrics().density);
    }

    private final void j(MethodChannel.Result result) {
        pl.a aVar = this.f23286f;
        if (aVar == null) {
            f(result);
            return;
        }
        aVar.u();
        i cameraSettings = aVar.getCameraSettings();
        if (cameraSettings.b() == 1) {
            cameraSettings.i(0);
        } else {
            cameraSettings.i(1);
        }
        aVar.y();
        result.success(Integer.valueOf(cameraSettings.b()));
    }

    private final List<dg.a> k(List<Integer> list, MethodChannel.Result result) {
        List<dg.a> arrayList;
        int r10;
        List<dg.a> j10;
        if (list != null) {
            try {
                List<Integer> list2 = list;
                r10 = dk.s.r(list2, 10);
                arrayList = new ArrayList<>(r10);
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(dg.a.values()[((Number) it.next()).intValue()]);
                }
            } catch (Exception e10) {
                result.error("", e10.getMessage(), null);
                j10 = dk.r.j();
                return j10;
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = dk.r.j();
        }
        return arrayList;
    }

    private final void l(MethodChannel.Result result) {
        pl.a aVar = this.f23286f;
        if (aVar == null) {
            f(result);
        } else {
            result.success(Integer.valueOf(aVar.getCameraSettings().b()));
        }
    }

    private final void m(MethodChannel.Result result) {
        if (this.f23286f == null) {
            f(result);
        } else {
            result.success(Boolean.valueOf(this.f23284d));
        }
    }

    public final boolean n() {
        return androidx.core.content.a.checkSelfPermission(this.f23281a, "android.permission.CAMERA") == 0;
    }

    private final void o(MethodChannel.Result result) {
        Map k10;
        i cameraSettings;
        try {
            m[] mVarArr = new m[4];
            mVarArr[0] = r.a("hasFrontCamera", Boolean.valueOf(r()));
            mVarArr[1] = r.a("hasBackCamera", Boolean.valueOf(p()));
            mVarArr[2] = r.a("hasFlash", Boolean.valueOf(q()));
            pl.a aVar = this.f23286f;
            mVarArr[3] = r.a("activeCamera", (aVar == null || (cameraSettings = aVar.getCameraSettings()) == null) ? null : Integer.valueOf(cameraSettings.b()));
            k10 = k0.k(mVarArr);
            result.success(k10);
        } catch (Exception e10) {
            result.error("", e10.getMessage(), null);
        }
    }

    private final boolean p() {
        return s("android.hardware.camera");
    }

    private final boolean q() {
        return s("android.hardware.camera.flash");
    }

    private final boolean r() {
        return s("android.hardware.camera.front");
    }

    private final boolean s(String str) {
        return this.f23281a.getPackageManager().hasSystemFeature(str);
    }

    private final pl.a t() {
        i cameraSettings;
        pl.a aVar = this.f23286f;
        if (aVar == null) {
            aVar = new pl.a(f.f23298a.a());
            this.f23286f = aVar;
            aVar.setDecoderFactory(new j(null, null, null, 2));
            Object obj = this.f23283c.get("cameraFacing");
            n.c(obj, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) obj).intValue() == 1 && (cameraSettings = aVar.getCameraSettings()) != null) {
                cameraSettings.i(1);
            }
        } else if (!this.f23285e) {
            aVar.y();
        }
        return aVar;
    }

    private final void u(MethodChannel.Result result) {
        pl.a aVar = this.f23286f;
        if (aVar == null) {
            f(result);
            return;
        }
        if (aVar.t()) {
            this.f23285e = true;
            aVar.u();
        }
        result.success(Boolean.TRUE);
    }

    private final void v(MethodChannel.Result result) {
        pl.a aVar = this.f23286f;
        if (aVar == null) {
            f(result);
            return;
        }
        if (!aVar.t()) {
            this.f23285e = false;
            aVar.y();
        }
        result.success(Boolean.TRUE);
    }

    private final void w(boolean z10) {
        pl.a aVar = this.f23286f;
        if (aVar == null) {
            return;
        }
        aVar.u();
        aVar.getCameraSettings().j(z10);
        aVar.y();
    }

    private final void x(double d10, double d11, double d12) {
        pl.a aVar = this.f23286f;
        if (aVar != null) {
            aVar.O(i(d10), i(d11), i(d12));
        }
    }

    private final void y(List<Integer> list, MethodChannel.Result result) {
        h();
        List<dg.a> k10 = k(list, result);
        pl.a aVar = this.f23286f;
        if (aVar != null) {
            aVar.I(new d(k10, this));
        }
    }

    private final void z() {
        pl.a aVar = this.f23286f;
        if (aVar != null) {
            aVar.N();
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        g gVar = this.f23288s;
        if (gVar != null) {
            gVar.a();
        }
        ActivityPluginBinding b10 = f.f23298a.b();
        if (b10 != null) {
            b10.removeRequestPermissionsResultListener(this);
        }
        pl.a aVar = this.f23286f;
        if (aVar != null) {
            aVar.u();
        }
        this.f23286f = null;
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public View getView() {
        return t();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0114, code lost:
    
        if (r0.equals("stopCamera") == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r0.equals("pauseCamera") == false) goto L168;
     */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r12, io.flutter.plugin.common.MethodChannel.Result r13) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.c.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        Integer v10;
        n.e(permissions, "permissions");
        n.e(grantResults, "grantResults");
        boolean z10 = false;
        if (i10 != this.f23289t) {
            return false;
        }
        v10 = dk.m.v(grantResults);
        if (v10 != null && v10.intValue() == 0) {
            z10 = true;
        }
        this.f23287r.invokeMethod("onPermissionSet", Boolean.valueOf(z10));
        return z10;
    }
}
