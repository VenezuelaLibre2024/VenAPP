package p278oi;

import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import ck.C2033r;
import ck.C2037v;
import dk.C7018k0;
import dk.C7042z;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.view.TextureRegistry;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import p278oi.C9973u;
import p278oi.C9976x;
import p280ok.InterfaceC10004r;
import p280ok.InterfaceC9998l;
import p296pi.C10174c;
import p296pi.EnumC10172a;
import p296pi.EnumC10173b;
import p402vf.C11886b;
import p407w.C12030p;

/* renamed from: oi.u */
/* loaded from: classes3.dex */
public final class C9973u implements MethodChannel.MethodCallHandler {

    /* renamed from: a */
    private final Activity f24558a;

    /* renamed from: b */
    private final C9955d f24559b;

    /* renamed from: c */
    private final C9976x f24560c;

    /* renamed from: d */
    private final InterfaceC9998l<PluginRegistry.RequestPermissionsResultListener, C2037v> f24561d;

    /* renamed from: e */
    private final InterfaceC9998l<List<? extends Map<String, ? extends Object>>, C2037v> f24562e;

    /* renamed from: f */
    private MethodChannel.Result f24563f;

    /* renamed from: r */
    private final InterfaceC10004r<List<? extends Map<String, ? extends Object>>, byte[], Integer, Integer, C2037v> f24564r;

    /* renamed from: s */
    private final InterfaceC9998l<String, C2037v> f24565s;

    /* renamed from: t */
    private MethodChannel f24566t;

    /* renamed from: u */
    private C9971s f24567u;

    /* renamed from: v */
    private final InterfaceC9998l<Integer, C2037v> f24568v;

    /* renamed from: w */
    private final InterfaceC9998l<Double, C2037v> f24569w;

    /* renamed from: oi.u$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC9323o implements InterfaceC9998l<List<? extends Map<String, ? extends Object>>, C2037v> {
        a() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m29815d(C9973u this$0, List list) {
            C9322n.m27781e(this$0, "this$0");
            MethodChannel.Result result = this$0.f24563f;
            if (result != null) {
                result.success(Boolean.valueOf(list != null));
            }
            this$0.f24563f = null;
        }

        /* renamed from: c */
        public final void m29816c(final List<? extends Map<String, ? extends Object>> list) {
            Map<String, ? extends Object> m20424k;
            if (list != null) {
                C9955d c9955d = C9973u.this.f24559b;
                m20424k = C7018k0.m20424k(C2033r.m10353a("name", "barcode"), C2033r.m10353a("data", list));
                c9955d.m29751b(m20424k);
            }
            Handler handler = new Handler(Looper.getMainLooper());
            final C9973u c9973u = C9973u.this;
            handler.post(new Runnable() { // from class: oi.t
                @Override // java.lang.Runnable
                public final void run() {
                    C9973u.a.m29815d(C9973u.this, list);
                }
            });
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ C2037v invoke(List<? extends Map<String, ? extends Object>> list) {
            m29816c(list);
            return C2037v.f8089a;
        }
    }

    /* renamed from: oi.u$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC9323o implements InterfaceC10004r<List<? extends Map<String, ? extends Object>>, byte[], Integer, Integer, C2037v> {
        b() {
            super(4);
        }

        /* renamed from: a */
        public final void m29817a(List<? extends Map<String, ? extends Object>> barcodes, byte[] bArr, Integer num, Integer num2) {
            Map<String, ? extends Object> m20424k;
            Map<String, ? extends Object> m20424k2;
            C9322n.m27781e(barcodes, "barcodes");
            if (bArr == null) {
                C9955d c9955d = C9973u.this.f24559b;
                m20424k = C7018k0.m20424k(C2033r.m10353a("name", "barcode"), C2033r.m10353a("data", barcodes));
                c9955d.m29751b(m20424k);
            } else {
                C9955d c9955d2 = C9973u.this.f24559b;
                C9322n.m27778b(num);
                C9322n.m27778b(num2);
                m20424k2 = C7018k0.m20424k(C2033r.m10353a("name", "barcode"), C2033r.m10353a("data", barcodes), C2033r.m10353a("image", bArr), C2033r.m10353a("width", Double.valueOf(num.intValue())), C2033r.m10353a("height", Double.valueOf(num2.intValue())));
                c9955d2.m29751b(m20424k2);
            }
        }

        @Override // p280ok.InterfaceC10004r
        /* renamed from: e */
        public /* bridge */ /* synthetic */ C2037v mo29818e(List<? extends Map<String, ? extends Object>> list, byte[] bArr, Integer num, Integer num2) {
            m29817a(list, bArr, num, num2);
            return C2037v.f8089a;
        }
    }

    /* renamed from: oi.u$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC9323o implements InterfaceC9998l<String, C2037v> {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m29819a(String error) {
            Map<String, ? extends Object> m20424k;
            C9322n.m27781e(error, "error");
            C9955d c9955d = C9973u.this.f24559b;
            m20424k = C7018k0.m20424k(C2033r.m10353a("name", "error"), C2033r.m10353a("data", error));
            c9955d.m29751b(m20424k);
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ C2037v invoke(String str) {
            m29819a(str);
            return C2037v.f8089a;
        }
    }

    /* renamed from: oi.u$d */
    /* loaded from: classes3.dex */
    public static final class d implements C9976x.b {

        /* renamed from: a */
        final /* synthetic */ MethodChannel.Result f24573a;

        d(MethodChannel.Result result) {
            this.f24573a = result;
        }

        @Override // p278oi.C9976x.b
        public void onResult(String str, String str2) {
            MethodChannel.Result result;
            Boolean bool;
            if (str == null) {
                result = this.f24573a;
                bool = Boolean.TRUE;
            } else if (!C9322n.m27777a(str, "CameraAccessDenied")) {
                this.f24573a.error(str, str2, null);
                return;
            } else {
                result = this.f24573a;
                bool = Boolean.FALSE;
            }
            result.success(bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oi.u$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC9323o implements InterfaceC9998l<C10174c, C2037v> {

        /* renamed from: a */
        final /* synthetic */ MethodChannel.Result f24574a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(MethodChannel.Result result) {
            super(1);
            this.f24574a = result;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m29821d(MethodChannel.Result result, C10174c it) {
            Map m20424k;
            Map m20424k2;
            C9322n.m27781e(result, "$result");
            C9322n.m27781e(it, "$it");
            m20424k = C7018k0.m20424k(C2033r.m10353a("width", Double.valueOf(it.m30455e())), C2033r.m10353a("height", Double.valueOf(it.m30452b())));
            m20424k2 = C7018k0.m20424k(C2033r.m10353a("textureId", Long.valueOf(it.m30453c())), C2033r.m10353a("size", m20424k), C2033r.m10353a("torchable", Boolean.valueOf(it.m30451a())), C2033r.m10353a("numberOfCameras", Integer.valueOf(it.m30454d())));
            result.success(m20424k2);
        }

        /* renamed from: c */
        public final void m29822c(final C10174c it) {
            C9322n.m27781e(it, "it");
            Handler handler = new Handler(Looper.getMainLooper());
            final MethodChannel.Result result = this.f24574a;
            handler.post(new Runnable() { // from class: oi.v
                @Override // java.lang.Runnable
                public final void run() {
                    C9973u.e.m29821d(MethodChannel.Result.this, it);
                }
            });
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ C2037v invoke(C10174c c10174c) {
            m29822c(c10174c);
            return C2037v.f8089a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oi.u$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC9323o implements InterfaceC9998l<Exception, C2037v> {

        /* renamed from: a */
        final /* synthetic */ MethodChannel.Result f24575a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(MethodChannel.Result result) {
            super(1);
            this.f24575a = result;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m29824d(Exception it, MethodChannel.Result result) {
            C9322n.m27781e(it, "$it");
            C9322n.m27781e(result, "$result");
            result.error("MobileScanner", it instanceof C9949a ? "Called start() while already started" : it instanceof C9957e ? "Error occurred when setting up camera!" : it instanceof C9952b0 ? "No camera found or failed to open camera!" : "Unknown error occurred.", null);
        }

        /* renamed from: c */
        public final void m29825c(final Exception it) {
            C9322n.m27781e(it, "it");
            Handler handler = new Handler(Looper.getMainLooper());
            final MethodChannel.Result result = this.f24575a;
            handler.post(new Runnable() { // from class: oi.w
                @Override // java.lang.Runnable
                public final void run() {
                    C9973u.f.m29824d(it, result);
                }
            });
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ C2037v invoke(Exception exc) {
            m29825c(exc);
            return C2037v.f8089a;
        }
    }

    /* renamed from: oi.u$g */
    /* loaded from: classes3.dex */
    static final class g extends AbstractC9323o implements InterfaceC9998l<Integer, C2037v> {
        g() {
            super(1);
        }

        /* renamed from: a */
        public final void m29826a(int i10) {
            Map<String, ? extends Object> m20424k;
            C9955d c9955d = C9973u.this.f24559b;
            m20424k = C7018k0.m20424k(C2033r.m10353a("name", "torchState"), C2033r.m10353a("data", Integer.valueOf(i10)));
            c9955d.m29751b(m20424k);
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ C2037v invoke(Integer num) {
            m29826a(num.intValue());
            return C2037v.f8089a;
        }
    }

    /* renamed from: oi.u$h */
    /* loaded from: classes3.dex */
    static final class h extends AbstractC9323o implements InterfaceC9998l<Double, C2037v> {
        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m29827a(double d10) {
            Map<String, ? extends Object> m20424k;
            C9955d c9955d = C9973u.this.f24559b;
            m20424k = C7018k0.m20424k(C2033r.m10353a("name", "zoomScaleState"), C2033r.m10353a("data", Double.valueOf(d10)));
            c9955d.m29751b(m20424k);
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ C2037v invoke(Double d10) {
            m29827a(d10.doubleValue());
            return C2037v.f8089a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9973u(Activity activity, C9955d barcodeHandler, BinaryMessenger binaryMessenger, C9976x permissions, InterfaceC9998l<? super PluginRegistry.RequestPermissionsResultListener, C2037v> addPermissionListener, TextureRegistry textureRegistry) {
        C9322n.m27781e(activity, "activity");
        C9322n.m27781e(barcodeHandler, "barcodeHandler");
        C9322n.m27781e(binaryMessenger, "binaryMessenger");
        C9322n.m27781e(permissions, "permissions");
        C9322n.m27781e(addPermissionListener, "addPermissionListener");
        C9322n.m27781e(textureRegistry, "textureRegistry");
        this.f24558a = activity;
        this.f24559b = barcodeHandler;
        this.f24560c = permissions;
        this.f24561d = addPermissionListener;
        this.f24562e = new a();
        b bVar = new b();
        this.f24564r = bVar;
        c cVar = new c();
        this.f24565s = cVar;
        this.f24568v = new g();
        this.f24569w = new h();
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "dev.steenbakker.mobile_scanner/scanner/method");
        this.f24566t = methodChannel;
        C9322n.m27778b(methodChannel);
        methodChannel.setMethodCallHandler(this);
        this.f24567u = new C9971s(activity, textureRegistry, bVar, cVar);
    }

    /* renamed from: d */
    private final void m29806d(MethodCall methodCall, MethodChannel.Result result) {
        this.f24563f = result;
        Uri fromFile = Uri.fromFile(new File(methodCall.arguments.toString()));
        C9971s c9971s = this.f24567u;
        C9322n.m27778b(c9971s);
        C9322n.m27778b(fromFile);
        c9971s.m29798w(fromFile, this.f24562e);
    }

    /* renamed from: f */
    private final void m29807f(MethodChannel.Result result) {
        try {
            C9971s c9971s = this.f24567u;
            C9322n.m27778b(c9971s);
            c9971s.m29792I();
            result.success(null);
        } catch (C9956d0 unused) {
            result.error("MobileScanner", "Called resetScale() while stopped!", null);
        }
    }

    /* renamed from: g */
    private final void m29808g(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        try {
            C9971s c9971s = this.f24567u;
            C9322n.m27778b(c9971s);
            Object obj = methodCall.arguments;
            C9322n.m27779c(obj, "null cannot be cast to non-null type kotlin.Double");
            c9971s.m29793K(((Double) obj).doubleValue());
            result.success(null);
        } catch (C9954c0 unused) {
            str = "Scale should be within 0 and 1";
            result.error("MobileScanner", str, null);
        } catch (C9956d0 unused2) {
            str = "Called setScale() while stopped!";
            result.error("MobileScanner", str, null);
        }
    }

    /* renamed from: h */
    private final void m29809h(MethodCall methodCall, MethodChannel.Result result) {
        Object m20605G;
        int[] m20629e0;
        C11886b.a m38017b;
        Object m20605G2;
        Boolean bool = (Boolean) methodCall.argument("torch");
        boolean booleanValue = bool == null ? false : bool.booleanValue();
        Integer num = (Integer) methodCall.argument("facing");
        int intValue = num == null ? 0 : num.intValue();
        List list = (List) methodCall.argument("formats");
        Boolean bool2 = (Boolean) methodCall.argument("returnImage");
        boolean booleanValue2 = bool2 == null ? false : bool2.booleanValue();
        Integer num2 = (Integer) methodCall.argument("speed");
        int intValue2 = num2 == null ? 1 : num2.intValue();
        Integer num3 = (Integer) methodCall.argument("timeout");
        int intValue3 = num3 == null ? 250 : num3.intValue();
        List list2 = (List) methodCall.argument("cameraResolution");
        Boolean bool3 = (Boolean) methodCall.argument("useNewCameraSelector");
        boolean booleanValue3 = bool3 == null ? false : bool3.booleanValue();
        C11886b c11886b = null;
        Size size = list2 != null ? new Size(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue()) : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(EnumC10172a.Companion.m30448a(((Number) it.next()).intValue()).m30447h()));
            }
            if (arrayList.size() == 1) {
                C11886b.a aVar = new C11886b.a();
                m20605G2 = C7042z.m20605G(arrayList);
                m38017b = aVar.m38017b(((Number) m20605G2).intValue(), new int[0]);
            } else {
                C11886b.a aVar2 = new C11886b.a();
                m20605G = C7042z.m20605G(arrayList);
                int intValue4 = ((Number) m20605G).intValue();
                m20629e0 = C7042z.m20629e0(arrayList.subList(1, arrayList.size()));
                m38017b = aVar2.m38017b(intValue4, Arrays.copyOf(m20629e0, m20629e0.length));
            }
            c11886b = m38017b.m38016a();
        }
        C12030p c12030p = intValue == 0 ? C12030p.f31981b : C12030p.f31982c;
        C9322n.m27778b(c12030p);
        for (EnumC10173b enumC10173b : EnumC10173b.values()) {
            if (enumC10173b.m30450h() == intValue2) {
                C9971s c9971s = this.f24567u;
                C9322n.m27778b(c9971s);
                c9971s.m29795M(c11886b, booleanValue2, c12030p, booleanValue, enumC10173b, this.f24568v, this.f24569w, new e(result), new f(result), intValue3, size, booleanValue3);
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* renamed from: i */
    private final void m29810i(MethodChannel.Result result) {
        try {
            C9971s c9971s = this.f24567u;
            C9322n.m27778b(c9971s);
            c9971s.m29796S();
            result.success(null);
        } catch (C9951b unused) {
            result.success(null);
        }
    }

    /* renamed from: j */
    private final void m29811j(MethodCall methodCall, MethodChannel.Result result) {
        C9971s c9971s = this.f24567u;
        C9322n.m27778b(c9971s);
        c9971s.m29797T(C9322n.m27777a(methodCall.arguments, 1));
        result.success(null);
    }

    /* renamed from: k */
    private final void m29812k(MethodCall methodCall, MethodChannel.Result result) {
        C9971s c9971s = this.f24567u;
        C9322n.m27778b(c9971s);
        c9971s.m29794L((List) methodCall.argument("rect"));
        result.success(null);
    }

    /* renamed from: e */
    public final void m29813e(ActivityPluginBinding activityPluginBinding) {
        C9322n.m27781e(activityPluginBinding, "activityPluginBinding");
        MethodChannel methodChannel = this.f24566t;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f24566t = null;
        this.f24567u = null;
        PluginRegistry.RequestPermissionsResultListener m29830c = this.f24560c.m29830c();
        if (m29830c != null) {
            activityPluginBinding.removeRequestPermissionsResultListener(m29830c);
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        C9322n.m27781e(call, "call");
        C9322n.m27781e(result, "result");
        if (this.f24567u == null) {
            result.error("MobileScanner", "Called " + call.method + " before initializing.", null);
            return;
        }
        String str = call.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1688013509:
                    if (str.equals("resetScale")) {
                        m29807f(result);
                        return;
                    }
                    break;
                case 3540994:
                    if (str.equals("stop")) {
                        m29810i(result);
                        return;
                    }
                    break;
                case 16698223:
                    if (str.equals("analyzeImage")) {
                        m29806d(call, result);
                        return;
                    }
                    break;
                case 109757538:
                    if (str.equals("start")) {
                        m29809h(call, result);
                        return;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        result.success(Integer.valueOf(this.f24560c.m29831d(this.f24558a)));
                        return;
                    }
                    break;
                case 110547964:
                    if (str.equals("torch")) {
                        m29811j(call, result);
                        return;
                    }
                    break;
                case 1095692943:
                    if (str.equals("request")) {
                        this.f24560c.m29832e(this.f24558a, this.f24561d, new d(result));
                        return;
                    }
                    break;
                case 1403963912:
                    if (str.equals("setScale")) {
                        m29808g(call, result);
                        return;
                    }
                    break;
                case 2023844470:
                    if (str.equals("updateScanWindow")) {
                        m29812k(call, result);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }
}
