package oi;

import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import dk.k0;
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
import oi.u;
import oi.x;
import vf.b;

/* loaded from: classes3.dex */
public final class u implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f22625a;

    /* renamed from: b, reason: collision with root package name */
    private final oi.d f22626b;

    /* renamed from: c, reason: collision with root package name */
    private final x f22627c;

    /* renamed from: d, reason: collision with root package name */
    private final ok.l<PluginRegistry.RequestPermissionsResultListener, ck.v> f22628d;

    /* renamed from: e, reason: collision with root package name */
    private final ok.l<List<? extends Map<String, ? extends Object>>, ck.v> f22629e;

    /* renamed from: f, reason: collision with root package name */
    private MethodChannel.Result f22630f;

    /* renamed from: r, reason: collision with root package name */
    private final ok.r<List<? extends Map<String, ? extends Object>>, byte[], Integer, Integer, ck.v> f22631r;

    /* renamed from: s, reason: collision with root package name */
    private final ok.l<String, ck.v> f22632s;

    /* renamed from: t, reason: collision with root package name */
    private MethodChannel f22633t;

    /* renamed from: u, reason: collision with root package name */
    private s f22634u;

    /* renamed from: v, reason: collision with root package name */
    private final ok.l<Integer, ck.v> f22635v;

    /* renamed from: w, reason: collision with root package name */
    private final ok.l<Double, ck.v> f22636w;

    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.o implements ok.l<List<? extends Map<String, ? extends Object>>, ck.v> {
        a() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(u this$0, List list) {
            kotlin.jvm.internal.n.e(this$0, "this$0");
            MethodChannel.Result result = this$0.f22630f;
            if (result != null) {
                result.success(Boolean.valueOf(list != null));
            }
            this$0.f22630f = null;
        }

        public final void c(final List<? extends Map<String, ? extends Object>> list) {
            Map<String, ? extends Object> k10;
            if (list != null) {
                oi.d dVar = u.this.f22626b;
                k10 = k0.k(ck.r.a("name", "barcode"), ck.r.a("data", list));
                dVar.b(k10);
            }
            Handler handler = new Handler(Looper.getMainLooper());
            final u uVar = u.this;
            handler.post(new Runnable() { // from class: oi.t
                @Override // java.lang.Runnable
                public final void run() {
                    u.a.d(u.this, list);
                }
            });
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ ck.v invoke(List<? extends Map<String, ? extends Object>> list) {
            c(list);
            return ck.v.f7137a;
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.o implements ok.r<List<? extends Map<String, ? extends Object>>, byte[], Integer, Integer, ck.v> {
        b() {
            super(4);
        }

        public final void a(List<? extends Map<String, ? extends Object>> barcodes, byte[] bArr, Integer num, Integer num2) {
            Map<String, ? extends Object> k10;
            Map<String, ? extends Object> k11;
            kotlin.jvm.internal.n.e(barcodes, "barcodes");
            if (bArr == null) {
                oi.d dVar = u.this.f22626b;
                k10 = k0.k(ck.r.a("name", "barcode"), ck.r.a("data", barcodes));
                dVar.b(k10);
            } else {
                oi.d dVar2 = u.this.f22626b;
                kotlin.jvm.internal.n.b(num);
                kotlin.jvm.internal.n.b(num2);
                k11 = k0.k(ck.r.a("name", "barcode"), ck.r.a("data", barcodes), ck.r.a("image", bArr), ck.r.a("width", Double.valueOf(num.intValue())), ck.r.a("height", Double.valueOf(num2.intValue())));
                dVar2.b(k11);
            }
        }

        @Override // ok.r
        public /* bridge */ /* synthetic */ ck.v e(List<? extends Map<String, ? extends Object>> list, byte[] bArr, Integer num, Integer num2) {
            a(list, bArr, num, num2);
            return ck.v.f7137a;
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends kotlin.jvm.internal.o implements ok.l<String, ck.v> {
        c() {
            super(1);
        }

        public final void a(String error) {
            Map<String, ? extends Object> k10;
            kotlin.jvm.internal.n.e(error, "error");
            oi.d dVar = u.this.f22626b;
            k10 = k0.k(ck.r.a("name", "error"), ck.r.a("data", error));
            dVar.b(k10);
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ ck.v invoke(String str) {
            a(str);
            return ck.v.f7137a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements x.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f22640a;

        d(MethodChannel.Result result) {
            this.f22640a = result;
        }

        @Override // oi.x.b
        public void onResult(String str, String str2) {
            MethodChannel.Result result;
            Boolean bool;
            if (str == null) {
                result = this.f22640a;
                bool = Boolean.TRUE;
            } else if (!kotlin.jvm.internal.n.a(str, "CameraAccessDenied")) {
                this.f22640a.error(str, str2, null);
                return;
            } else {
                result = this.f22640a;
                bool = Boolean.FALSE;
            }
            result.success(bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.o implements ok.l<pi.c, ck.v> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f22641a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(MethodChannel.Result result) {
            super(1);
            this.f22641a = result;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(MethodChannel.Result result, pi.c it) {
            Map k10;
            Map k11;
            kotlin.jvm.internal.n.e(result, "$result");
            kotlin.jvm.internal.n.e(it, "$it");
            k10 = k0.k(ck.r.a("width", Double.valueOf(it.e())), ck.r.a("height", Double.valueOf(it.b())));
            k11 = k0.k(ck.r.a("textureId", Long.valueOf(it.c())), ck.r.a("size", k10), ck.r.a("torchable", Boolean.valueOf(it.a())), ck.r.a("numberOfCameras", Integer.valueOf(it.d())));
            result.success(k11);
        }

        public final void c(final pi.c it) {
            kotlin.jvm.internal.n.e(it, "it");
            Handler handler = new Handler(Looper.getMainLooper());
            final MethodChannel.Result result = this.f22641a;
            handler.post(new Runnable() { // from class: oi.v
                @Override // java.lang.Runnable
                public final void run() {
                    u.e.d(MethodChannel.Result.this, it);
                }
            });
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ ck.v invoke(pi.c cVar) {
            c(cVar);
            return ck.v.f7137a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.o implements ok.l<Exception, ck.v> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f22642a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(MethodChannel.Result result) {
            super(1);
            this.f22642a = result;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(Exception it, MethodChannel.Result result) {
            kotlin.jvm.internal.n.e(it, "$it");
            kotlin.jvm.internal.n.e(result, "$result");
            result.error("MobileScanner", it instanceof oi.a ? "Called start() while already started" : it instanceof oi.e ? "Error occurred when setting up camera!" : it instanceof b0 ? "No camera found or failed to open camera!" : "Unknown error occurred.", null);
        }

        public final void c(final Exception it) {
            kotlin.jvm.internal.n.e(it, "it");
            Handler handler = new Handler(Looper.getMainLooper());
            final MethodChannel.Result result = this.f22642a;
            handler.post(new Runnable() { // from class: oi.w
                @Override // java.lang.Runnable
                public final void run() {
                    u.f.d(it, result);
                }
            });
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ ck.v invoke(Exception exc) {
            c(exc);
            return ck.v.f7137a;
        }
    }

    /* loaded from: classes3.dex */
    static final class g extends kotlin.jvm.internal.o implements ok.l<Integer, ck.v> {
        g() {
            super(1);
        }

        public final void a(int i10) {
            Map<String, ? extends Object> k10;
            oi.d dVar = u.this.f22626b;
            k10 = k0.k(ck.r.a("name", "torchState"), ck.r.a("data", Integer.valueOf(i10)));
            dVar.b(k10);
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ ck.v invoke(Integer num) {
            a(num.intValue());
            return ck.v.f7137a;
        }
    }

    /* loaded from: classes3.dex */
    static final class h extends kotlin.jvm.internal.o implements ok.l<Double, ck.v> {
        h() {
            super(1);
        }

        public final void a(double d10) {
            Map<String, ? extends Object> k10;
            oi.d dVar = u.this.f22626b;
            k10 = k0.k(ck.r.a("name", "zoomScaleState"), ck.r.a("data", Double.valueOf(d10)));
            dVar.b(k10);
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ ck.v invoke(Double d10) {
            a(d10.doubleValue());
            return ck.v.f7137a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(Activity activity, oi.d barcodeHandler, BinaryMessenger binaryMessenger, x permissions, ok.l<? super PluginRegistry.RequestPermissionsResultListener, ck.v> addPermissionListener, TextureRegistry textureRegistry) {
        kotlin.jvm.internal.n.e(activity, "activity");
        kotlin.jvm.internal.n.e(barcodeHandler, "barcodeHandler");
        kotlin.jvm.internal.n.e(binaryMessenger, "binaryMessenger");
        kotlin.jvm.internal.n.e(permissions, "permissions");
        kotlin.jvm.internal.n.e(addPermissionListener, "addPermissionListener");
        kotlin.jvm.internal.n.e(textureRegistry, "textureRegistry");
        this.f22625a = activity;
        this.f22626b = barcodeHandler;
        this.f22627c = permissions;
        this.f22628d = addPermissionListener;
        this.f22629e = new a();
        b bVar = new b();
        this.f22631r = bVar;
        c cVar = new c();
        this.f22632s = cVar;
        this.f22635v = new g();
        this.f22636w = new h();
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "dev.steenbakker.mobile_scanner/scanner/method");
        this.f22633t = methodChannel;
        kotlin.jvm.internal.n.b(methodChannel);
        methodChannel.setMethodCallHandler(this);
        this.f22634u = new s(activity, textureRegistry, bVar, cVar);
    }

    private final void d(MethodCall methodCall, MethodChannel.Result result) {
        this.f22630f = result;
        Uri fromFile = Uri.fromFile(new File(methodCall.arguments.toString()));
        s sVar = this.f22634u;
        kotlin.jvm.internal.n.b(sVar);
        kotlin.jvm.internal.n.b(fromFile);
        sVar.w(fromFile, this.f22629e);
    }

    private final void f(MethodChannel.Result result) {
        try {
            s sVar = this.f22634u;
            kotlin.jvm.internal.n.b(sVar);
            sVar.I();
            result.success(null);
        } catch (d0 unused) {
            result.error("MobileScanner", "Called resetScale() while stopped!", null);
        }
    }

    private final void g(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        try {
            s sVar = this.f22634u;
            kotlin.jvm.internal.n.b(sVar);
            Object obj = methodCall.arguments;
            kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type kotlin.Double");
            sVar.K(((Double) obj).doubleValue());
            result.success(null);
        } catch (c0 unused) {
            str = "Scale should be within 0 and 1";
            result.error("MobileScanner", str, null);
        } catch (d0 unused2) {
            str = "Called setScale() while stopped!";
            result.error("MobileScanner", str, null);
        }
    }

    private final void h(MethodCall methodCall, MethodChannel.Result result) {
        Object G;
        int[] e02;
        b.a b10;
        Object G2;
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
        vf.b bVar = null;
        Size size = list2 != null ? new Size(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue()) : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(pi.a.Companion.a(((Number) it.next()).intValue()).h()));
            }
            if (arrayList.size() == 1) {
                b.a aVar = new b.a();
                G2 = dk.z.G(arrayList);
                b10 = aVar.b(((Number) G2).intValue(), new int[0]);
            } else {
                b.a aVar2 = new b.a();
                G = dk.z.G(arrayList);
                int intValue4 = ((Number) G).intValue();
                e02 = dk.z.e0(arrayList.subList(1, arrayList.size()));
                b10 = aVar2.b(intValue4, Arrays.copyOf(e02, e02.length));
            }
            bVar = b10.a();
        }
        w.p pVar = intValue == 0 ? w.p.f29526b : w.p.f29527c;
        kotlin.jvm.internal.n.b(pVar);
        for (pi.b bVar2 : pi.b.values()) {
            if (bVar2.h() == intValue2) {
                s sVar = this.f22634u;
                kotlin.jvm.internal.n.b(sVar);
                sVar.M(bVar, booleanValue2, pVar, booleanValue, bVar2, this.f22635v, this.f22636w, new e(result), new f(result), intValue3, size, booleanValue3);
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private final void i(MethodChannel.Result result) {
        try {
            s sVar = this.f22634u;
            kotlin.jvm.internal.n.b(sVar);
            sVar.S();
            result.success(null);
        } catch (oi.b unused) {
            result.success(null);
        }
    }

    private final void j(MethodCall methodCall, MethodChannel.Result result) {
        s sVar = this.f22634u;
        kotlin.jvm.internal.n.b(sVar);
        sVar.T(kotlin.jvm.internal.n.a(methodCall.arguments, 1));
        result.success(null);
    }

    private final void k(MethodCall methodCall, MethodChannel.Result result) {
        s sVar = this.f22634u;
        kotlin.jvm.internal.n.b(sVar);
        sVar.L((List) methodCall.argument("rect"));
        result.success(null);
    }

    public final void e(ActivityPluginBinding activityPluginBinding) {
        kotlin.jvm.internal.n.e(activityPluginBinding, "activityPluginBinding");
        MethodChannel methodChannel = this.f22633t;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f22633t = null;
        this.f22634u = null;
        PluginRegistry.RequestPermissionsResultListener c10 = this.f22627c.c();
        if (c10 != null) {
            activityPluginBinding.removeRequestPermissionsResultListener(c10);
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        kotlin.jvm.internal.n.e(call, "call");
        kotlin.jvm.internal.n.e(result, "result");
        if (this.f22634u == null) {
            result.error("MobileScanner", "Called " + call.method + " before initializing.", null);
            return;
        }
        String str = call.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1688013509:
                    if (str.equals("resetScale")) {
                        f(result);
                        return;
                    }
                    break;
                case 3540994:
                    if (str.equals("stop")) {
                        i(result);
                        return;
                    }
                    break;
                case 16698223:
                    if (str.equals("analyzeImage")) {
                        d(call, result);
                        return;
                    }
                    break;
                case 109757538:
                    if (str.equals("start")) {
                        h(call, result);
                        return;
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        result.success(Integer.valueOf(this.f22627c.d(this.f22625a)));
                        return;
                    }
                    break;
                case 110547964:
                    if (str.equals("torch")) {
                        j(call, result);
                        return;
                    }
                    break;
                case 1095692943:
                    if (str.equals("request")) {
                        this.f22627c.e(this.f22625a, this.f22628d, new d(result));
                        return;
                    }
                    break;
                case 1403963912:
                    if (str.equals("setScale")) {
                        g(call, result);
                        return;
                    }
                    break;
                case 2023844470:
                    if (str.equals("updateScanWindow")) {
                        k(call, result);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }
}
