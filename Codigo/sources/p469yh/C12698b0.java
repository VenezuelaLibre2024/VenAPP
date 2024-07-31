package p469yh;

import ai.C0120d;
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
import p491zh.C13028a;

/* renamed from: yh.b0 */
/* loaded from: classes3.dex */
public class C12698b0 implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: s */
    static String f34421s;

    /* renamed from: w */
    private static InterfaceC12712n f34425w;

    /* renamed from: a */
    private Context f34426a;

    /* renamed from: b */
    private MethodChannel f34427b;

    /* renamed from: c */
    static final Map<String, Integer> f34416c = new HashMap();

    /* renamed from: d */
    static final Map<Integer, C12707i> f34417d = new HashMap();

    /* renamed from: e */
    private static final Object f34418e = new Object();

    /* renamed from: f */
    private static final Object f34419f = new Object();

    /* renamed from: r */
    static int f34420r = 0;

    /* renamed from: t */
    private static int f34422t = 0;

    /* renamed from: u */
    private static int f34423u = 1;

    /* renamed from: v */
    private static int f34424v = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yh.b0$a */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12707i f34428a;

        /* renamed from: b */
        final /* synthetic */ MethodChannel.Result f34429b;

        a(C12707i c12707i, MethodChannel.Result result) {
            this.f34428a = c12707i;
            this.f34429b = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C12698b0.f34419f) {
                C12698b0.this.m41858l(this.f34428a);
            }
            this.f34429b.success(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yh.b0$b */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12707i f34431a;

        /* renamed from: b */
        final /* synthetic */ String f34432b;

        /* renamed from: c */
        final /* synthetic */ MethodChannel.Result f34433c;

        b(C12707i c12707i, String str, MethodChannel.Result result) {
            this.f34431a = c12707i;
            this.f34432b = str;
            this.f34433c = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C12698b0.f34419f) {
                C12707i c12707i = this.f34431a;
                if (c12707i != null) {
                    C12698b0.this.m41858l(c12707i);
                }
                try {
                    if (C12715q.m41954c(C12698b0.f34420r)) {
                        Log.d("Sqflite", "delete database " + this.f34432b);
                    }
                    C12707i.m41905o(this.f34432b);
                } catch (Exception e10) {
                    Log.e("Sqflite", "error " + e10 + " while closing database " + C12698b0.f34424v);
                }
            }
            this.f34433c.success(null);
        }
    }

    /* renamed from: A */
    private void m41835A(MethodCall methodCall, MethodChannel.Result result) {
        int intValue = ((Integer) methodCall.argument(FacebookMediationAdapter.KEY_ID)).intValue();
        C12707i m41860n = m41860n(methodCall, result);
        if (m41860n == null) {
            return;
        }
        if (C12715q.m41953b(m41860n.f34451d)) {
            Log.d("Sqflite", m41860n.m41914A() + "closing " + intValue + " " + m41860n.f34449b);
        }
        String str = m41860n.f34449b;
        synchronized (f34418e) {
            f34417d.remove(Integer.valueOf(intValue));
            if (m41860n.f34448a) {
                f34416c.remove(str);
            }
        }
        f34425w.m41944c(m41860n, new a(m41860n, result));
    }

    /* renamed from: B */
    private void m41836B(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Boolean.valueOf(C12707i.m41912x((String) methodCall.argument("path"))));
    }

    /* renamed from: C */
    private void m41837C(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.argument("cmd");
        HashMap hashMap = new HashMap();
        if ("get".equals(str)) {
            int i10 = f34420r;
            if (i10 > 0) {
                hashMap.put("logLevel", Integer.valueOf(i10));
            }
            Map<Integer, C12707i> map = f34417d;
            if (!map.isEmpty()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry<Integer, C12707i> entry : map.entrySet()) {
                    C12707i value = entry.getValue();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("path", value.f34449b);
                    hashMap3.put("singleInstance", Boolean.valueOf(value.f34448a));
                    int i11 = value.f34451d;
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

    /* renamed from: D */
    private void m41838D(MethodCall methodCall, MethodChannel.Result result) {
        C13028a.f35367a = Boolean.TRUE.equals(methodCall.arguments());
        C13028a.f35369c = C13028a.f35368b && C13028a.f35367a;
        if (!C13028a.f35367a) {
            f34420r = 0;
        } else if (C13028a.f35369c) {
            f34420r = 2;
        } else if (C13028a.f35367a) {
            f34420r = 1;
        }
        result.success(null);
    }

    /* renamed from: E */
    private void m41839E(MethodCall methodCall, MethodChannel.Result result) {
        C12707i c12707i;
        Map<Integer, C12707i> map;
        String str = (String) methodCall.argument("path");
        synchronized (f34418e) {
            if (C12715q.m41954c(f34420r)) {
                Log.d("Sqflite", "Look for " + str + " in " + f34416c.keySet());
            }
            Map<String, Integer> map2 = f34416c;
            Integer num = map2.get(str);
            if (num == null || (c12707i = (map = f34417d).get(num)) == null || !c12707i.f34456i.isOpen()) {
                c12707i = null;
            } else {
                if (C12715q.m41954c(f34420r)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c12707i.m41914A());
                    sb2.append("found single instance ");
                    sb2.append(c12707i.m41919F() ? "(in transaction) " : "");
                    sb2.append(num);
                    sb2.append(" ");
                    sb2.append(str);
                    Log.d("Sqflite", sb2.toString());
                }
                map.remove(num);
                map2.remove(str);
            }
        }
        b bVar = new b(c12707i, str, result);
        InterfaceC12712n interfaceC12712n = f34425w;
        if (interfaceC12712n != null) {
            interfaceC12712n.m41944c(c12707i, bVar);
        } else {
            bVar.run();
        }
    }

    /* renamed from: F */
    private void m41840F(final MethodCall methodCall, final MethodChannel.Result result) {
        final C12707i m41860n = m41860n(methodCall, result);
        if (m41860n == null) {
            return;
        }
        f34425w.m41944c(m41860n, new Runnable() { // from class: yh.w
            @Override // java.lang.Runnable
            public final void run() {
                C12698b0.m41863q(MethodCall.this, result, m41860n);
            }
        });
    }

    /* renamed from: H */
    private void m41841H(final MethodCall methodCall, final MethodChannel.Result result) {
        final C12707i m41860n = m41860n(methodCall, result);
        if (m41860n == null) {
            return;
        }
        f34425w.m41944c(m41860n, new Runnable() { // from class: yh.t
            @Override // java.lang.Runnable
            public final void run() {
                C12698b0.m41864r(MethodCall.this, result, m41860n);
            }
        });
    }

    /* renamed from: I */
    private void m41842I(final MethodCall methodCall, final MethodChannel.Result result) {
        final int i10;
        C12707i c12707i;
        final String str = (String) methodCall.argument("path");
        final Boolean bool = (Boolean) methodCall.argument("readOnly");
        final boolean m41861o = m41861o(str);
        boolean z10 = (Boolean.FALSE.equals(methodCall.argument("singleInstance")) || m41861o) ? false : true;
        if (z10) {
            synchronized (f34418e) {
                if (C12715q.m41954c(f34420r)) {
                    Log.d("Sqflite", "Look for " + str + " in " + f34416c.keySet());
                }
                Integer num = f34416c.get(str);
                if (num != null && (c12707i = f34417d.get(num)) != null) {
                    if (c12707i.f34456i.isOpen()) {
                        if (C12715q.m41954c(f34420r)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(c12707i.m41914A());
                            sb2.append("re-opened single instance ");
                            sb2.append(c12707i.m41919F() ? "(in transaction) " : "");
                            sb2.append(num);
                            sb2.append(" ");
                            sb2.append(str);
                            Log.d("Sqflite", sb2.toString());
                        }
                        result.success(m41870x(num.intValue(), true, c12707i.m41919F()));
                        return;
                    }
                    if (C12715q.m41954c(f34420r)) {
                        Log.d("Sqflite", c12707i.m41914A() + "single instance database of " + str + " not opened");
                    }
                }
            }
        }
        Object obj = f34418e;
        synchronized (obj) {
            i10 = f34424v + 1;
            f34424v = i10;
        }
        final C12707i c12707i2 = new C12707i(this.f34426a, str, i10, z10, f34420r);
        synchronized (obj) {
            if (f34425w == null) {
                InterfaceC12712n m41942b = InterfaceC12712n.m41942b("Sqflite", f34423u, f34422t);
                f34425w = m41942b;
                m41942b.start();
                if (C12715q.m41953b(c12707i2.f34451d)) {
                    Log.d("Sqflite", c12707i2.m41914A() + "starting worker pool with priority " + f34422t);
                }
            }
            c12707i2.f34455h = f34425w;
            if (C12715q.m41953b(c12707i2.f34451d)) {
                Log.d("Sqflite", c12707i2.m41914A() + "opened " + i10 + " " + str);
            }
            final boolean z11 = z10;
            f34425w.m41944c(c12707i2, new Runnable() { // from class: yh.y
                @Override // java.lang.Runnable
                public final void run() {
                    C12698b0.m41865s(m41861o, str, result, bool, c12707i2, methodCall, z11, i10);
                }
            });
        }
    }

    /* renamed from: K */
    private void m41843K(final MethodCall methodCall, final MethodChannel.Result result) {
        final C12707i m41860n = m41860n(methodCall, result);
        if (m41860n == null) {
            return;
        }
        f34425w.m41944c(m41860n, new Runnable() { // from class: yh.x
            @Override // java.lang.Runnable
            public final void run() {
                C12698b0.m41866t(MethodCall.this, result, m41860n);
            }
        });
    }

    /* renamed from: L */
    private void m41844L(final MethodCall methodCall, final MethodChannel.Result result) {
        final C12707i m41860n = m41860n(methodCall, result);
        if (m41860n == null) {
            return;
        }
        f34425w.m41944c(m41860n, new Runnable() { // from class: yh.u
            @Override // java.lang.Runnable
            public final void run() {
                C12698b0.m41867u(MethodCall.this, result, m41860n);
            }
        });
    }

    /* renamed from: M */
    private void m41845M(final MethodCall methodCall, final MethodChannel.Result result) {
        final C12707i m41860n = m41860n(methodCall, result);
        if (m41860n == null) {
            return;
        }
        f34425w.m41944c(m41860n, new Runnable() { // from class: yh.z
            @Override // java.lang.Runnable
            public final void run() {
                C12698b0.m41868v(MethodCall.this, m41860n, result);
            }
        });
    }

    /* renamed from: N */
    private void m41846N(final MethodCall methodCall, final MethodChannel.Result result) {
        final C12707i m41860n = m41860n(methodCall, result);
        if (m41860n == null) {
            return;
        }
        f34425w.m41944c(m41860n, new Runnable() { // from class: yh.v
            @Override // java.lang.Runnable
            public final void run() {
                C12698b0.m41869w(MethodCall.this, result, m41860n);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m41858l(C12707i c12707i) {
        try {
            if (C12715q.m41953b(c12707i.f34451d)) {
                Log.d("Sqflite", c12707i.m41914A() + "closing database ");
            }
            c12707i.m41926k();
        } catch (Exception e10) {
            Log.e("Sqflite", "error " + e10 + " while closing database " + f34424v);
        }
        synchronized (f34418e) {
            if (f34417d.isEmpty() && f34425w != null) {
                if (C12715q.m41953b(c12707i.f34451d)) {
                    Log.d("Sqflite", c12707i.m41914A() + "stopping thread");
                }
                f34425w.mo41945d();
                f34425w = null;
            }
        }
    }

    /* renamed from: m */
    private C12707i m41859m(int i10) {
        return f34417d.get(Integer.valueOf(i10));
    }

    /* renamed from: n */
    private C12707i m41860n(MethodCall methodCall, MethodChannel.Result result) {
        int intValue = ((Integer) methodCall.argument(FacebookMediationAdapter.KEY_ID)).intValue();
        C12707i m41859m = m41859m(intValue);
        if (m41859m != null) {
            return m41859m;
        }
        result.error("sqlite_error", "database_closed " + intValue, null);
        return null;
    }

    /* renamed from: o */
    static boolean m41861o(String str) {
        return str == null || str.equals(":memory:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ void m41863q(MethodCall methodCall, MethodChannel.Result result, C12707i c12707i) {
        c12707i.m41928v(new C0120d(methodCall, result));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ void m41864r(MethodCall methodCall, MethodChannel.Result result, C12707i c12707i) {
        c12707i.m41918E(new C0120d(methodCall, result));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ void m41865s(boolean z10, String str, MethodChannel.Result result, Boolean bool, C12707i c12707i, MethodCall methodCall, boolean z11, int i10) {
        synchronized (f34419f) {
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
                    c12707i.m41921N();
                } else {
                    c12707i.m41920M();
                }
                synchronized (f34418e) {
                    if (z11) {
                        f34416c.put(str, Integer.valueOf(i10));
                    }
                    f34417d.put(Integer.valueOf(i10), c12707i);
                }
                if (C12715q.m41953b(c12707i.f34451d)) {
                    Log.d("Sqflite", c12707i.m41914A() + "opened " + i10 + " " + str);
                }
                result.success(m41870x(i10, false, false));
            } catch (Exception e10) {
                c12707i.m41917D(e10, new C0120d(methodCall, result));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static /* synthetic */ void m41866t(MethodCall methodCall, MethodChannel.Result result, C12707i c12707i) {
        c12707i.m41922O(new C0120d(methodCall, result));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static /* synthetic */ void m41867u(MethodCall methodCall, MethodChannel.Result result, C12707i c12707i) {
        c12707i.m41923P(new C0120d(methodCall, result));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ void m41868v(MethodCall methodCall, C12707i c12707i, MethodChannel.Result result) {
        try {
            c12707i.f34456i.setLocale(C12702d0.m41884d((String) methodCall.argument("locale")));
            result.success(null);
        } catch (Exception e10) {
            result.error("sqlite_error", "Error calling setLocale: " + e10.getMessage(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static /* synthetic */ void m41869w(MethodCall methodCall, MethodChannel.Result result, C12707i c12707i) {
        c12707i.m41924R(new C0120d(methodCall, result));
    }

    /* renamed from: x */
    static Map m41870x(int i10, boolean z10, boolean z11) {
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

    /* renamed from: y */
    private void m41871y(Context context, BinaryMessenger binaryMessenger) {
        this.f34426a = context;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.tekartik.sqflite", StandardMethodCodec.INSTANCE, binaryMessenger.makeBackgroundTaskQueue());
        this.f34427b = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    /* renamed from: z */
    private void m41872z(final MethodCall methodCall, final MethodChannel.Result result) {
        final C12707i m41860n = m41860n(methodCall, result);
        if (m41860n == null) {
            return;
        }
        f34425w.m41944c(m41860n, new Runnable() { // from class: yh.a0
            @Override // java.lang.Runnable
            public final void run() {
                C12707i.this.m41925h(methodCall, result);
            }
        });
    }

    /* renamed from: G */
    void m41873G(MethodCall methodCall, MethodChannel.Result result) {
        if (f34421s == null) {
            f34421s = this.f34426a.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        result.success(f34421s);
    }

    /* renamed from: J */
    void m41874J(MethodCall methodCall, MethodChannel.Result result) {
        Object argument = methodCall.argument("androidThreadPriority");
        if (argument != null) {
            f34422t = ((Integer) argument).intValue();
        }
        Object argument2 = methodCall.argument("androidThreadCount");
        if (argument2 != null && !argument2.equals(Integer.valueOf(f34423u))) {
            f34423u = ((Integer) argument2).intValue();
            InterfaceC12712n interfaceC12712n = f34425w;
            if (interfaceC12712n != null) {
                interfaceC12712n.mo41945d();
                f34425w = null;
            }
        }
        Integer m41952a = C12715q.m41952a(methodCall);
        if (m41952a != null) {
            f34420r = m41952a.intValue();
        }
        result.success(null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m41871y(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f34426a = null;
        this.f34427b.setMethodCallHandler(null);
        this.f34427b = null;
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
                m41840F(methodCall, result);
                return;
            case 1:
                m41835A(methodCall, result);
                return;
            case 2:
                m41874J(methodCall, result);
                return;
            case 3:
                m41841H(methodCall, result);
                return;
            case 4:
                m41846N(methodCall, result);
                return;
            case 5:
                m41845M(methodCall, result);
                return;
            case 6:
                m41839E(methodCall, result);
                return;
            case 7:
                m41838D(methodCall, result);
                return;
            case '\b':
                m41842I(methodCall, result);
                return;
            case '\t':
                m41872z(methodCall, result);
                return;
            case '\n':
                m41837C(methodCall, result);
                return;
            case 11:
                m41843K(methodCall, result);
                return;
            case '\f':
                m41836B(methodCall, result);
                return;
            case '\r':
                m41844L(methodCall, result);
                return;
            case 14:
                result.success("Android " + Build.VERSION.RELEASE);
                return;
            case 15:
                m41873G(methodCall, result);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
