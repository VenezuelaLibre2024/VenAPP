package pl;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.core.content.C0854a;
import ck.C2028m;
import ck.C2033r;
import ck.C2037v;
import dk.C7018k0;
import dk.C7021m;
import dk.C7031r;
import dk.C7033s;
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
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p066dg.C6958s;
import p066dg.EnumC6940a;
import p163ih.C7985b;
import p163ih.C7993j;
import p163ih.InterfaceC7984a;
import p184jh.C9058i;
import p280ok.InterfaceC9987a;

/* renamed from: pl.c */
/* loaded from: classes3.dex */
public final class C10206c implements PlatformView, MethodChannel.MethodCallHandler, PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: u */
    public static final c f25219u = new c(null);

    /* renamed from: a */
    private final Context f25220a;

    /* renamed from: b */
    private final int f25221b;

    /* renamed from: c */
    private final HashMap<String, Object> f25222c;

    /* renamed from: d */
    private boolean f25223d;

    /* renamed from: e */
    private boolean f25224e;

    /* renamed from: f */
    private C10204a f25225f;

    /* renamed from: r */
    private final MethodChannel f25226r;

    /* renamed from: s */
    private C10210g f25227s;

    /* renamed from: t */
    private final int f25228t;

    /* renamed from: pl.c$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC9323o implements InterfaceC9987a<C2037v> {
        a() {
            super(0);
        }

        /* renamed from: a */
        public final void m30546a() {
            C10204a c10204a;
            if (C10206c.this.f25224e || !C10206c.this.m30533n() || (c10204a = C10206c.this.f25225f) == null) {
                return;
            }
            c10204a.mo19397u();
        }

        @Override // p280ok.InterfaceC9987a
        public /* bridge */ /* synthetic */ C2037v invoke() {
            m30546a();
            return C2037v.f8089a;
        }
    }

    /* renamed from: pl.c$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC9323o implements InterfaceC9987a<C2037v> {
        b() {
            super(0);
        }

        /* renamed from: a */
        public final void m30547a() {
            C10204a c10204a;
            if (!C10206c.this.m30533n()) {
                C10206c.this.m30527h();
            } else {
                if (C10206c.this.f25224e || !C10206c.this.m30533n() || (c10204a = C10206c.this.f25225f) == null) {
                    return;
                }
                c10204a.m19446y();
            }
        }

        @Override // p280ok.InterfaceC9987a
        public /* bridge */ /* synthetic */ C2037v invoke() {
            m30547a();
            return C2037v.f8089a;
        }
    }

    /* renamed from: pl.c$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: pl.c$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC7984a {

        /* renamed from: a */
        final /* synthetic */ List<EnumC6940a> f25231a;

        /* renamed from: b */
        final /* synthetic */ C10206c f25232b;

        /* JADX WARN: Multi-variable type inference failed */
        d(List<? extends EnumC6940a> list, C10206c c10206c) {
            this.f25231a = list;
            this.f25232b = c10206c;
        }

        @Override // p163ih.InterfaceC7984a
        /* renamed from: a */
        public void mo19410a(List<? extends C6958s> resultPoints) {
            C9322n.m27781e(resultPoints, "resultPoints");
        }

        @Override // p163ih.InterfaceC7984a
        /* renamed from: b */
        public void mo19411b(C7985b result) {
            Map m20424k;
            C9322n.m27781e(result, "result");
            if (this.f25231a.isEmpty() || this.f25231a.contains(result.m24529a())) {
                m20424k = C7018k0.m20424k(C2033r.m10353a("code", result.m24533e()), C2033r.m10353a("type", result.m24529a().name()), C2033r.m10353a("rawBytes", result.m24531c()));
                this.f25232b.f25226r.invokeMethod("onRecognizeQR", m20424k);
            }
        }
    }

    public C10206c(Context context, BinaryMessenger messenger, int i10, HashMap<String, Object> params) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(messenger, "messenger");
        C9322n.m27781e(params, "params");
        this.f25220a = context;
        this.f25221b = i10;
        this.f25222c = params;
        MethodChannel methodChannel = new MethodChannel(messenger, "net.touchcapture.qr.flutterqr/qrview_" + i10);
        this.f25226r = methodChannel;
        this.f25228t = i10 + 513469796;
        C10209f c10209f = C10209f.f25237a;
        ActivityPluginBinding m30550b = c10209f.m30550b();
        if (m30550b != null) {
            m30550b.addRequestPermissionsResultListener(this);
        }
        methodChannel.setMethodCallHandler(this);
        Activity m30549a = c10209f.m30549a();
        this.f25227s = m30549a != null ? C10208e.m30548a(m30549a, new a(), new b()) : null;
    }

    /* renamed from: A */
    private final void m30519A(MethodChannel.Result result) {
        C10204a c10204a = this.f25225f;
        if (c10204a == null) {
            m30525f(result);
            return;
        }
        if (!m30536q()) {
            result.error("404", "This device doesn't support flash", null);
            return;
        }
        c10204a.setTorch(!this.f25223d);
        boolean z10 = !this.f25223d;
        this.f25223d = z10;
        result.success(Boolean.valueOf(z10));
    }

    /* renamed from: f */
    private final void m30525f(MethodChannel.Result result) {
        result.error("404", "No barcode view found", null);
    }

    /* renamed from: g */
    private final void m30526g(double d10, double d11, double d12, MethodChannel.Result result) {
        m30543x(d10, d11, d12);
        result.success(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m30527h() {
        if (m30533n()) {
            this.f25226r.invokeMethod("onPermissionSet", Boolean.TRUE);
            return;
        }
        Activity m30549a = C10209f.f25237a.m30549a();
        if (m30549a != null) {
            m30549a.requestPermissions(new String[]{"android.permission.CAMERA"}, this.f25228t);
        }
    }

    /* renamed from: i */
    private final int m30528i(double d10) {
        return (int) (d10 * this.f25220a.getResources().getDisplayMetrics().density);
    }

    /* renamed from: j */
    private final void m30529j(MethodChannel.Result result) {
        C10204a c10204a = this.f25225f;
        if (c10204a == null) {
            m30525f(result);
            return;
        }
        c10204a.mo19397u();
        C9058i cameraSettings = c10204a.getCameraSettings();
        if (cameraSettings.m26642b() == 1) {
            cameraSettings.m26649i(0);
        } else {
            cameraSettings.m26649i(1);
        }
        c10204a.m19446y();
        result.success(Integer.valueOf(cameraSettings.m26642b()));
    }

    /* renamed from: k */
    private final List<EnumC6940a> m30530k(List<Integer> list, MethodChannel.Result result) {
        List<EnumC6940a> arrayList;
        int m20590r;
        List<EnumC6940a> m20582j;
        if (list != null) {
            try {
                List<Integer> list2 = list;
                m20590r = C7033s.m20590r(list2, 10);
                arrayList = new ArrayList<>(m20590r);
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(EnumC6940a.values()[((Number) it.next()).intValue()]);
                }
            } catch (Exception e10) {
                result.error("", e10.getMessage(), null);
                m20582j = C7031r.m20582j();
                return m20582j;
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = C7031r.m20582j();
        }
        return arrayList;
    }

    /* renamed from: l */
    private final void m30531l(MethodChannel.Result result) {
        C10204a c10204a = this.f25225f;
        if (c10204a == null) {
            m30525f(result);
        } else {
            result.success(Integer.valueOf(c10204a.getCameraSettings().m26642b()));
        }
    }

    /* renamed from: m */
    private final void m30532m(MethodChannel.Result result) {
        if (this.f25225f == null) {
            m30525f(result);
        } else {
            result.success(Boolean.valueOf(this.f25223d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final boolean m30533n() {
        return C0854a.checkSelfPermission(this.f25220a, "android.permission.CAMERA") == 0;
    }

    /* renamed from: o */
    private final void m30534o(MethodChannel.Result result) {
        Map m20424k;
        C9058i cameraSettings;
        try {
            C2028m[] c2028mArr = new C2028m[4];
            c2028mArr[0] = C2033r.m10353a("hasFrontCamera", Boolean.valueOf(m30537r()));
            c2028mArr[1] = C2033r.m10353a("hasBackCamera", Boolean.valueOf(m30535p()));
            c2028mArr[2] = C2033r.m10353a("hasFlash", Boolean.valueOf(m30536q()));
            C10204a c10204a = this.f25225f;
            c2028mArr[3] = C2033r.m10353a("activeCamera", (c10204a == null || (cameraSettings = c10204a.getCameraSettings()) == null) ? null : Integer.valueOf(cameraSettings.m26642b()));
            m20424k = C7018k0.m20424k(c2028mArr);
            result.success(m20424k);
        } catch (Exception e10) {
            result.error("", e10.getMessage(), null);
        }
    }

    /* renamed from: p */
    private final boolean m30535p() {
        return m30538s("android.hardware.camera");
    }

    /* renamed from: q */
    private final boolean m30536q() {
        return m30538s("android.hardware.camera.flash");
    }

    /* renamed from: r */
    private final boolean m30537r() {
        return m30538s("android.hardware.camera.front");
    }

    /* renamed from: s */
    private final boolean m30538s(String str) {
        return this.f25220a.getPackageManager().hasSystemFeature(str);
    }

    /* renamed from: t */
    private final C10204a m30539t() {
        C9058i cameraSettings;
        C10204a c10204a = this.f25225f;
        if (c10204a == null) {
            c10204a = new C10204a(C10209f.f25237a.m30549a());
            this.f25225f = c10204a;
            c10204a.setDecoderFactory(new C7993j(null, null, null, 2));
            Object obj = this.f25222c.get("cameraFacing");
            C9322n.m27779c(obj, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) obj).intValue() == 1 && (cameraSettings = c10204a.getCameraSettings()) != null) {
                cameraSettings.m26649i(1);
            }
        } else if (!this.f25224e) {
            c10204a.m19446y();
        }
        return c10204a;
    }

    /* renamed from: u */
    private final void m30540u(MethodChannel.Result result) {
        C10204a c10204a = this.f25225f;
        if (c10204a == null) {
            m30525f(result);
            return;
        }
        if (c10204a.m19444t()) {
            this.f25224e = true;
            c10204a.mo19397u();
        }
        result.success(Boolean.TRUE);
    }

    /* renamed from: v */
    private final void m30541v(MethodChannel.Result result) {
        C10204a c10204a = this.f25225f;
        if (c10204a == null) {
            m30525f(result);
            return;
        }
        if (!c10204a.m19444t()) {
            this.f25224e = false;
            c10204a.m19446y();
        }
        result.success(Boolean.TRUE);
    }

    /* renamed from: w */
    private final void m30542w(boolean z10) {
        C10204a c10204a = this.f25225f;
        if (c10204a == null) {
            return;
        }
        c10204a.mo19397u();
        c10204a.getCameraSettings().m26650j(z10);
        c10204a.m19446y();
    }

    /* renamed from: x */
    private final void m30543x(double d10, double d11, double d12) {
        C10204a c10204a = this.f25225f;
        if (c10204a != null) {
            c10204a.m30518O(m30528i(d10), m30528i(d11), m30528i(d12));
        }
    }

    /* renamed from: y */
    private final void m30544y(List<Integer> list, MethodChannel.Result result) {
        m30527h();
        List<EnumC6940a> m30530k = m30530k(list, result);
        C10204a c10204a = this.f25225f;
        if (c10204a != null) {
            c10204a.m19394I(new d(m30530k, this));
        }
    }

    /* renamed from: z */
    private final void m30545z() {
        C10204a c10204a = this.f25225f;
        if (c10204a != null) {
            c10204a.m19396N();
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        C10210g c10210g = this.f25227s;
        if (c10210g != null) {
            c10210g.m30553a();
        }
        ActivityPluginBinding m30550b = C10209f.f25237a.m30550b();
        if (m30550b != null) {
            m30550b.removeRequestPermissionsResultListener(this);
        }
        C10204a c10204a = this.f25225f;
        if (c10204a != null) {
            c10204a.mo19397u();
        }
        this.f25225f = null;
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public View getView() {
        return m30539t();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0114, code lost:
    
        if (r0.equals("stopCamera") == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r0.equals("pauseCamera") == false) goto L77;
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
        throw new UnsupportedOperationException("Method not decompiled: pl.C10206c.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        Integer m20494v;
        C9322n.m27781e(permissions, "permissions");
        C9322n.m27781e(grantResults, "grantResults");
        boolean z10 = false;
        if (i10 != this.f25228t) {
            return false;
        }
        m20494v = C7021m.m20494v(grantResults);
        if (m20494v != null && m20494v.intValue() == 0) {
            z10 = true;
        }
        this.f25226r.invokeMethod("onPermissionSet", Boolean.valueOf(z10));
        return z10;
    }
}
