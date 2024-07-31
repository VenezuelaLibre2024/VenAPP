package yh;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class b0 implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: s, reason: collision with root package name */
    static String f31885s;

    /* renamed from: w, reason: collision with root package name */
    private static n f31889w;

    /* renamed from: a, reason: collision with root package name */
    private Context f31890a;

    /* renamed from: b, reason: collision with root package name */
    private MethodChannel f31891b;

    /* renamed from: c, reason: collision with root package name */
    static final Map<String, Integer> f31880c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    static final Map<Integer, i> f31881d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final Object f31882e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f31883f = new Object();

    /* renamed from: r, reason: collision with root package name */
    static int f31884r = 0;

    /* renamed from: t, reason: collision with root package name */
    private static int f31886t = 0;

    /* renamed from: u, reason: collision with root package name */
    private static int f31887u = 1;

    /* renamed from: v, reason: collision with root package name */
    private static int f31888v = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f31892a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f31893b;

        a(i iVar, MethodChannel.Result result) {
            this.f31892a = iVar;
            this.f31893b = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b0.f31883f) {
                b0.this.l(this.f31892a);
            }
            this.f31893b.success(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f31895a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31896b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f31897c;

        b(i iVar, String str, MethodChannel.Result result) {
            this.f31895a = iVar;
            this.f31896b = str;
            this.f31897c = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b0.f31883f) {
                i iVar = this.f31895a;
                if (iVar != null) {
                    b0.this.l(iVar);
                }
                try {
                    if (q.c(b0.f31884r)) {
                        Log.d("Sqflite", "delete database " + this.f31896b);
                    }
                    i.o(this.f31896b);
                } catch (Exception e10) {
                    Log.e("Sqflite", "error " + e10 + " while closing database " + b0.f31888v);
                }
            }
            this.f31897c.success(null);
        }
    }

    private void A(MethodCall methodCall, MethodChannel.Result result) {
        int intValue = ((Integer) methodCall.argument(FacebookMediationAdapter.KEY_ID)).intValue();
        i n10 = n(methodCall, result);
        if (n10 == null) {
            return;
        }
        if (q.b(n10.f31915d)) {
            Log.d("Sqflite", n10.A() + "closing " + intValue + " " + n10.f31913b);
        }
        String str = n10.f31913b;
        synchronized (f31882e) {
            f31881d.remove(Integer.valueOf(intValue));
            if (n10.f31912a) {
                f31880c.remove(str);
            }
        }
        f31889w.c(n10, new a(n10, result));
    }

    private void B(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Boolean.valueOf(i.x((String) methodCall.argument("path"))));
    }

    private void C(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.argument("cmd");
        HashMap hashMap = new HashMap();
        if ("get".equals(str)) {
            int i10 = f31884r;
            if (i10 > 0) {
                hashMap.put("logLevel", Integer.valueOf(i10));
            }
            Map<Integer, i> map = f31881d;
            if (!map.isEmpty()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry<Integer, i> entry : map.entrySet()) {
                    i value = entry.getValue();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("path", value.f31913b);
                    hashMap3.put("singleInstance", Boolean.valueOf(value.f31912a));
                    int i11 = value.f31915d;
                    if (i11 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i11));
                    }
                    hashMap2.put(entry.getKey().toString(), hashMap3);
                }
                hashMap.put("databases", hashMap2);
            }
        }
        result.success(hashMap);
    }

    private void D(MethodCall methodCall, MethodChannel.Result result) {
        zh.a.f32816a = Boolean.TRUE.equals(methodCall.arguments());
        zh.a.f32818c = zh.a.f32817b && zh.a.f32816a;
        if (!zh.a.f32816a) {
            f31884r = 0;
        } else if (zh.a.f32818c) {
            f31884r = 2;
        } else if (zh.a.f32816a) {
            f31884r = 1;
        }
        result.success(null);
    }

    private void E(MethodCall methodCall, MethodChannel.Result result) {
        i iVar;
        Map<Integer, i> map;
        String str = (String) methodCall.argument("path");
        synchronized (f31882e) {
            if (q.c(f31884r)) {
                Log.d("Sqflite", "Look for " + str + " in " + f31880c.keySet());
            }
            Map<String, Integer> map2 = f31880c;
            Integer num = map2.get(str);
            if (num == null || (iVar = (map = f31881d).get(num)) == null || !iVar.f31920i.isOpen()) {
                iVar = null;
            } else {
                if (q.c(f31884r)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iVar.A());
                    sb2.append("found single instance ");
                    sb2.append(iVar.F() ? "(in transaction) " : "");
                    sb2.append(num);
                    sb2.append(" ");
                    sb2.append(str);
                    Log.d("Sqflite", sb2.toString());
                }
                map.remove(num);
                map2.remove(str);
            }
        }
        b bVar = new b(iVar, str, result);
        n nVar = f31889w;
        if (nVar != null) {
            nVar.c(iVar, bVar);
        } else {
            bVar.run();
        }
    }

    private void F(final MethodCall methodCall, final MethodChannel.Result result) {
        final i n10 = n(methodCall, result);
        if (n10 == null) {
            return;
        }
        f31889w.c(n10, new Runnable() { // from class: yh.w
            @Override // java.lang.Runnable
            public final void run() {
                b0.q(MethodCall.this, result, n10);
            }
        });
    }

    private void H(final MethodCall methodCall, final MethodChannel.Result result) {
        final i n10 = n(methodCall, result);
        if (n10 == null) {
            return;
        }
        f31889w.c(n10, new Runnable() { // from class: yh.t
            @Override // java.lang.Runnable
            public final void run() {
                b0.r(MethodCall.this, result, n10);
            }
        });
    }

    private void I(final MethodCall methodCall, final MethodChannel.Result result) {
        final int i10;
        i iVar;
        final String str = (String) methodCall.argument("path");
        final Boolean bool = (Boolean) methodCall.argument("readOnly");
        final boolean o10 = o(str);
        boolean z10 = (Boolean.FALSE.equals(methodCall.argument("singleInstance")) || o10) ? false : true;
        if (z10) {
            synchronized (f31882e) {
                if (q.c(f31884r)) {
                    Log.d("Sqflite", "Look for " + str + " in " + f31880c.keySet());
                }
                Integer num = f31880c.get(str);
                if (num != null && (iVar = f31881d.get(num)) != null) {
                    if (iVar.f31920i.isOpen()) {
                        if (q.c(f31884r)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(iVar.A());
                            sb2.append("re-opened single instance ");
                            sb2.append(iVar.F() ? "(in transaction) " : "");
                            sb2.append(num);
                            sb2.append(" ");
                            sb2.append(str);
                            Log.d("Sqflite", sb2.toString());
                        }
                        result.success(x(num.intValue(), true, iVar.F()));
                        return;
                    }
                    if (q.c(f31884r)) {
                        Log.d("Sqflite", iVar.A() + "single instance database of " + str + " not opened");
                    }
                }
            }
        }
        Object obj = f31882e;
        synchronized (obj) {
            i10 = f31888v + 1;
            f31888v = i10;
        }
        final i iVar2 = new i(this.f31890a, str, i10, z10, f31884r);
        synchronized (obj) {
            if (f31889w == null) {
                n b10 = n.b("Sqflite", f31887u, f31886t);
                f31889w = b10;
                b10.start();
                if (q.b(iVar2.f31915d)) {
                    Log.d("Sqflite", iVar2.A() + "starting worker pool with priority " + f31886t);
                }
            }
            iVar2.f31919h = f31889w;
            if (q.b(iVar2.f31915d)) {
                Log.d("Sqflite", iVar2.A() + "opened " + i10 + " " + str);
            }
            final boolean z11 = z10;
            f31889w.c(iVar2, new Runnable() { // from class: yh.y
                @Override // java.lang.Runnable
                public final void run() {
                    b0.s(o10, str, result, bool, iVar2, methodCall, z11, i10);
                }
            });
        }
    }

    private void K(final MethodCall methodCall, final MethodChannel.Result result) {
        final i n10 = n(methodCall, result);
        if (n10 == null) {
            return;
        }
        f31889w.c(n10, new Runnable() { // from class: yh.x
            @Override // java.lang.Runnable
            public final void run() {
                b0.t(MethodCall.this, result, n10);
            }
        });
    }

    private void L(final MethodCall methodCall, final MethodChannel.Result result) {
        final i n10 = n(methodCall, result);
        if (n10 == null) {
            return;
        }
        f31889w.c(n10, new Runnable() { // from class: yh.u
            @Override // java.lang.Runnable
            public final void run() {
                b0.u(MethodCall.this, result, n10);
            }
        });
    }

    private void M(final MethodCall methodCall, final MethodChannel.Result result) {
        final i n10 = n(methodCall, result);
        if (n10 == null) {
            return;
        }
        f31889w.c(n10, new Runnable() { // from class: yh.z
            @Override // java.lang.Runnable
            public final void run() {
                b0.v(MethodCall.this, n10, result);
            }
        });
    }

    private void N(final MethodCall methodCall, final MethodChannel.Result result) {
        final i n10 = n(methodCall, result);
        if (n10 == null) {
            return;
        }
        f31889w.c(n10, new Runnable() { // from class: yh.v
            @Override // java.lang.Runnable
            public final void run() {
                b0.w(MethodCall.this, result, n10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(i iVar) {
        try {
            if (q.b(iVar.f31915d)) {
                Log.d("Sqflite", iVar.A() + "closing database ");
            }
            iVar.k();
        } catch (Exception e10) {
            Log.e("Sqflite", "error " + e10 + " while closing database " + f31888v);
        }
        synchronized (f31882e) {
            if (f31881d.isEmpty() && f31889w != null) {
                if (q.b(iVar.f31915d)) {
                    Log.d("Sqflite", iVar.A() + "stopping thread");
                }
                f31889w.d();
                f31889w = null;
            }
        }
    }

    private i m(int i10) {
        return f31881d.get(Integer.valueOf(i10));
    }

    private i n(MethodCall methodCall, MethodChannel.Result result) {
        int intValue = ((Integer) methodCall.argument(FacebookMediationAdapter.KEY_ID)).intValue();
        i m10 = m(intValue);
        if (m10 != null) {
            return m10;
        }
        result.error("sqlite_error", "database_closed " + intValue, null);
        return null;
    }

    static boolean o(String str) {
        return str == null || str.equals(":memory:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(MethodCall methodCall, MethodChannel.Result result, i iVar) {
        iVar.v(new ai.d(methodCall, result));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(MethodCall methodCall, MethodChannel.Result result, i iVar) {
        iVar.E(new ai.d(methodCall, result));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(boolean z10, String str, MethodChannel.Result result, Boolean bool, i iVar, MethodCall methodCall, boolean z11, int i10) {
        synchronized (f31883f) {
            if (!z10) {
                try {
                    File file = new File(new File(str).getParent());
                    if (!file.exists() && !file.mkdirs() && !file.exists()) {
                        result.error("sqlite_error", "open_failed " + str, null);
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            try {
                if (Boolean.TRUE.equals(bool)) {
                    iVar.N();
                } else {
                    iVar.M();
                }
                synchronized (f31882e) {
                    if (z11) {
                        f31880c.put(str, Integer.valueOf(i10));
                    }
                    f31881d.put(Integer.valueOf(i10), iVar);
                }
                if (q.b(iVar.f31915d)) {
                    Log.d("Sqflite", iVar.A() + "opened " + i10 + " " + str);
                }
                result.success(x(i10, false, false));
            } catch (Exception e10) {
                iVar.D(e10, new ai.d(methodCall, result));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(MethodCall methodCall, MethodChannel.Result result, i iVar) {
        iVar.O(new ai.d(methodCall, result));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(MethodCall methodCall, MethodChannel.Result result, i iVar) {
        iVar.P(new ai.d(methodCall, result));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(MethodCall methodCall, i iVar, MethodChannel.Result result) {
        try {
            iVar.f31920i.setLocale(d0.d((String) methodCall.argument("locale")));
            result.success(null);
        } catch (Exception e10) {
            result.error("sqlite_error", "Error calling setLocale: " + e10.getMessage(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(MethodCall methodCall, MethodChannel.Result result, i iVar) {
        iVar.R(new ai.d(methodCall, result));
    }

    static Map x(int i10, boolean z10, boolean z11) {
        HashMap hashMap = new HashMap();
        hashMap.put(FacebookMediationAdapter.KEY_ID, Integer.valueOf(i10));
        if (z10) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z11) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    private void y(Context context, BinaryMessenger binaryMessenger) {
        this.f31890a = context;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.tekartik.sqflite", StandardMethodCodec.INSTANCE, binaryMessenger.makeBackgroundTaskQueue());
        this.f31891b = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    private void z(final MethodCall methodCall, final MethodChannel.Result result) {
        final i n10 = n(methodCall, result);
        if (n10 == null) {
            return;
        }
        f31889w.c(n10, new Runnable() { // from class: yh.a0
            @Override // java.lang.Runnable
            public final void run() {
                i.this.h(methodCall, result);
            }
        });
    }

    void G(MethodCall methodCall, MethodChannel.Result result) {
        if (f31885s == null) {
            f31885s = this.f31890a.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        result.success(f31885s);
    }

    void J(MethodCall methodCall, MethodChannel.Result result) {
        Object argument = methodCall.argument("androidThreadPriority");
        if (argument != null) {
            f31886t = ((Integer) argument).intValue();
        }
        Object argument2 = methodCall.argument("androidThreadCount");
        if (argument2 != null && !argument2.equals(Integer.valueOf(f31887u))) {
            f31887u = ((Integer) argument2).intValue();
            n nVar = f31889w;
            if (nVar != null) {
                nVar.d();
                f31889w = null;
            }
        }
        Integer a10 = q.a(methodCall);
        if (a10 != null) {
            f31884r = a10.intValue();
        }
        result.success(null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        y(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f31890a = null;
        this.f31891b.setMethodCallHandler(null);
        this.f31891b = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1319569547:
                if (str.equals("execute")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1253581933:
                if (str.equals("closeDatabase")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1249474914:
                if (str.equals("options")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1183792455:
                if (str.equals("insert")) {
                    c10 = 3;
                    break;
                }
                break;
            case -838846263:
                if (str.equals("update")) {
                    c10 = 4;
                    break;
                }
                break;
            case -396289107:
                if (str.equals("androidSetLocale")) {
                    c10 = 5;
                    break;
                }
                break;
            case -263511994:
                if (str.equals("deleteDatabase")) {
                    c10 = 6;
                    break;
                }
                break;
            case -198450538:
                if (str.equals("debugMode")) {
                    c10 = 7;
                    break;
                }
                break;
            case -17190427:
                if (str.equals("openDatabase")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 93509434:
                if (str.equals("batch")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 95458899:
                if (str.equals("debug")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 107944136:
                if (str.equals("query")) {
                    c10 = 11;
                    break;
                }
                break;
            case 956410295:
                if (str.equals("databaseExists")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 1193546321:
                if (str.equals("queryCursorNext")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 1385449135:
                if (str.equals("getPlatformVersion")) {
                    c10 = 14;
                    break;
                }
                break;
            case 1863829223:
                if (str.equals("getDatabasesPath")) {
                    c10 = 15;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                F(methodCall, result);
                return;
            case 1:
                A(methodCall, result);
                return;
            case 2:
                J(methodCall, result);
                return;
            case 3:
                H(methodCall, result);
                return;
            case 4:
                N(methodCall, result);
                return;
            case 5:
                M(methodCall, result);
                return;
            case 6:
                E(methodCall, result);
                return;
            case 7:
                D(methodCall, result);
                return;
            case '\b':
                I(methodCall, result);
                return;
            case '\t':
                z(methodCall, result);
                return;
            case '\n':
                C(methodCall, result);
                return;
            case 11:
                K(methodCall, result);
                return;
            case '\f':
                B(methodCall, result);
                return;
            case '\r':
                L(methodCall, result);
                return;
            case 14:
                result.success("Android " + Build.VERSION.RELEASE);
                return;
            case 15:
                G(methodCall, result);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
