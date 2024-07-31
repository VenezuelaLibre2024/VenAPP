package s2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.arthenica.ffmpegkit.AbiDetect;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import com.arthenica.ffmpegkit.a0;
import com.arthenica.ffmpegkit.b0;
import com.arthenica.ffmpegkit.p;
import com.arthenica.ffmpegkit.q;
import com.arthenica.ffmpegkit.r;
import com.arthenica.ffmpegkit.s;
import com.arthenica.ffmpegkit.t;
import com.arthenica.ffmpegkit.v;
import com.arthenica.ffmpegkit.w;
import com.arthenica.ffmpegkit.x;
import com.arthenica.ffmpegkit.y;
import com.arthenica.ffmpegkit.z;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k implements FlutterPlugin, ActivityAware, MethodChannel.MethodCallHandler, EventChannel.StreamHandler, PluginRegistry.ActivityResultListener {

    /* renamed from: d */
    private MethodChannel f25095d;

    /* renamed from: e */
    private EventChannel f25096e;

    /* renamed from: f */
    private MethodChannel.Result f25097f;

    /* renamed from: r */
    private Context f25098r;

    /* renamed from: s */
    private Activity f25099s;

    /* renamed from: t */
    private FlutterPlugin.FlutterPluginBinding f25100t;

    /* renamed from: u */
    private ActivityPluginBinding f25101u;

    /* renamed from: v */
    private EventChannel.EventSink f25102v;

    /* renamed from: a */
    private final AtomicBoolean f25092a = new AtomicBoolean(false);

    /* renamed from: b */
    private final AtomicBoolean f25093b = new AtomicBoolean(false);

    /* renamed from: c */
    private final ExecutorService f25094c = Executors.newFixedThreadPool(10);

    /* renamed from: w */
    private final e f25103w = new e();

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25104a;

        static {
            int[] iArr = new int[p.values().length];
            f25104a = iArr;
            try {
                iArr[p.ALWAYS_PRINT_LOGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25104a[p.PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25104a[p.PRINT_LOGS_WHEN_GLOBAL_CALLBACK_NOT_DEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25104a[p.PRINT_LOGS_WHEN_SESSION_CALLBACK_NOT_DEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25104a[p.NEVER_PRINT_LOGS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public k() {
        Log.d("ffmpeg-kit-flutter", String.format("FFmpegKitFlutterPlugin created %s.", this));
    }

    protected static int A0(p pVar) {
        int i10 = a.f25104a[pVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 != 3) {
            return i10 != 4 ? 4 : 3;
        }
        return 2;
    }

    protected static List<Object> B0(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object opt = jSONArray.opt(i10);
            if (opt != null) {
                if (opt instanceof JSONArray) {
                    opt = B0((JSONArray) opt);
                } else if (opt instanceof JSONObject) {
                    opt = J0((JSONObject) opt);
                }
                arrayList.add(opt);
            }
        }
        return arrayList;
    }

    protected static List<Map<String, Object>> C0(List<com.arthenica.ffmpegkit.n> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(F0(list.get(i10)));
        }
        return arrayList;
    }

    protected static p D0(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? p.NEVER_PRINT_LOGS : p.PRINT_LOGS_WHEN_SESSION_CALLBACK_NOT_DEFINED : p.PRINT_LOGS_WHEN_GLOBAL_CALLBACK_NOT_DEFINED : p.PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED : p.ALWAYS_PRINT_LOGS;
    }

    protected static long E0(Date date) {
        if (date != null) {
            return date.getTime();
        }
        return 0L;
    }

    protected static Map<String, Object> F0(com.arthenica.ffmpegkit.n nVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("sessionId", Long.valueOf(nVar.c()));
        hashMap.put("level", Integer.valueOf(z0(nVar.a())));
        hashMap.put(Constants.MESSAGE, nVar.b());
        return hashMap;
    }

    protected static Map<String, Object> G0(q qVar) {
        JSONObject a10;
        if (qVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        return (qVar.a() == null || (a10 = qVar.a()) == null) ? hashMap : J0(a10);
    }

    protected static Map<String, Object> H0(x xVar) {
        int i10;
        if (xVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sessionId", Long.valueOf(xVar.f()));
        hashMap.put("createTime", Long.valueOf(E0(xVar.j())));
        hashMap.put("startTime", Long.valueOf(E0(xVar.h())));
        hashMap.put("command", xVar.i());
        if (xVar.g()) {
            i10 = 1;
        } else {
            if (!xVar.n()) {
                if (xVar.p()) {
                    q A = ((s) xVar).A();
                    if (A != null) {
                        hashMap.put("mediaInformation", G0(A));
                    }
                    i10 = 3;
                }
                return hashMap;
            }
            i10 = 2;
        }
        hashMap.put("type", Integer.valueOf(i10));
        return hashMap;
    }

    protected static Map<String, Object> I0(a0 a0Var) {
        HashMap hashMap = new HashMap();
        if (a0Var != null) {
            hashMap.put("sessionId", Long.valueOf(a0Var.b()));
            hashMap.put("videoFrameNumber", Integer.valueOf(a0Var.g()));
            hashMap.put("videoFps", Float.valueOf(a0Var.f()));
            hashMap.put("videoQuality", Float.valueOf(a0Var.h()));
            hashMap.put("size", Integer.valueOf((int) (a0Var.c() < 2147483647L ? a0Var.c() : a0Var.c() % 2147483647L)));
            hashMap.put("time", Double.valueOf(a0Var.e()));
            hashMap.put("bitrate", Double.valueOf(a0Var.a()));
            hashMap.put("speed", Double.valueOf(a0Var.d()));
        }
        return hashMap;
    }

    protected static Map<String, Object> J0(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt != null) {
                    if (opt instanceof JSONArray) {
                        opt = B0((JSONArray) opt);
                    } else if (opt instanceof JSONObject) {
                        opt = J0((JSONObject) opt);
                    }
                    hashMap.put(next, opt);
                }
            }
        }
        return hashMap;
    }

    protected static List<Map<String, Object>> K0(List<? extends x> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(H0(list.get(i10)));
        }
        return arrayList;
    }

    protected static y L0(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? y.COMPLETED : y.FAILED : y.RUNNING : y.CREATED;
    }

    protected static List<Map<String, Object>> M0(List<a0> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(I0(list.get(i10)));
        }
        return arrayList;
    }

    protected static boolean h0(Integer num) {
        return num != null && num.intValue() >= 0;
    }

    public /* synthetic */ void i0(com.arthenica.ffmpegkit.n nVar) {
        if (this.f25092a.get()) {
            x(nVar);
        }
    }

    public /* synthetic */ void j0(a0 a0Var) {
        if (this.f25093b.get()) {
            z(a0Var);
        }
    }

    protected static int z0(com.arthenica.ffmpegkit.m mVar) {
        if (mVar == null) {
            mVar = com.arthenica.ffmpegkit.m.AV_LOG_TRACE;
        }
        return mVar.i();
    }

    protected void A() {
        this.f25092a.compareAndSet(false, true);
    }

    protected void B(MethodChannel.Result result) {
        A();
        this.f25103w.m(result, null);
    }

    protected void C(MethodChannel.Result result) {
        A();
        D();
        FFmpegKitConfig.o();
        this.f25103w.m(result, null);
    }

    protected void D() {
        this.f25093b.compareAndSet(false, true);
    }

    protected void E(MethodChannel.Result result) {
        D();
        this.f25103w.m(result, null);
    }

    protected void F(List<String> list, MethodChannel.Result result) {
        this.f25103w.m(result, H0(com.arthenica.ffmpegkit.h.z((String[]) list.toArray(new String[0]), null, null, null, p.NEVER_PRINT_LOGS)));
    }

    protected void G(Integer num, MethodChannel.Result result) {
        e eVar;
        String str;
        String str2;
        x H = FFmpegKitConfig.H(num.longValue());
        if (H == null) {
            eVar = this.f25103w;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (H.g()) {
            this.f25094c.submit(new l((com.arthenica.ffmpegkit.h) H, this.f25103w, result));
            return;
        } else {
            eVar = this.f25103w;
            str = "NOT_FFMPEG_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        eVar.e(result, str, str2);
    }

    protected void H(Integer num, Integer num2, MethodChannel.Result result) {
        e eVar;
        String str;
        String str2;
        x H = FFmpegKitConfig.H(num.longValue());
        if (H == null) {
            eVar = this.f25103w;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (H.g()) {
            this.f25103w.m(result, M0(((com.arthenica.ffmpegkit.h) H).A(h0(num2) ? num2.intValue() : 5000)));
            return;
        } else {
            eVar = this.f25103w;
            str = "NOT_FFMPEG_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        eVar.e(result, str, str2);
    }

    protected void I(Integer num, MethodChannel.Result result) {
        e eVar;
        String str;
        String str2;
        x H = FFmpegKitConfig.H(num.longValue());
        if (H == null) {
            eVar = this.f25103w;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (H.g()) {
            this.f25103w.m(result, M0(((com.arthenica.ffmpegkit.h) H).C()));
            return;
        } else {
            eVar = this.f25103w;
            str = "NOT_FFMPEG_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        eVar.e(result, str, str2);
    }

    protected void J(List<String> list, MethodChannel.Result result) {
        this.f25103w.m(result, H0(com.arthenica.ffmpegkit.k.y((String[]) list.toArray(new String[0]), null, null, p.NEVER_PRINT_LOGS)));
    }

    protected void K(Integer num, MethodChannel.Result result) {
        e eVar;
        String str;
        String str2;
        x H = FFmpegKitConfig.H(num.longValue());
        if (H == null) {
            eVar = this.f25103w;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (H.n()) {
            this.f25094c.submit(new m((com.arthenica.ffmpegkit.k) H, this.f25103w, result));
            return;
        } else {
            eVar = this.f25103w;
            str = "NOT_FFPROBE_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        eVar.e(result, str, str2);
    }

    protected void L(MethodChannel.Result result) {
        this.f25103w.m(result, AbiDetect.a());
    }

    protected void M(MethodChannel.Result result) {
        this.f25103w.m(result, FFmpegKitConfig.t());
    }

    protected void N(MethodChannel.Result result) {
        this.f25103w.m(result, v.a());
    }

    protected void N0() {
        P0();
        O0();
        ActivityPluginBinding activityPluginBinding = this.f25101u;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this);
        }
        this.f25098r = null;
        this.f25099s = null;
        this.f25101u = null;
        Log.d("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin uninitialized.");
    }

    protected void O(MethodChannel.Result result) {
        this.f25103w.m(result, K0(com.arthenica.ffmpegkit.g.c()));
    }

    protected void O0() {
        EventChannel eventChannel = this.f25096e;
        if (eventChannel == null) {
            Log.i("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin event channel was already uninitialised.");
        } else {
            eventChannel.setStreamHandler(null);
            this.f25096e = null;
        }
    }

    protected void P(MethodChannel.Result result) {
        this.f25103w.m(result, FFmpegKitConfig.w());
    }

    protected void P0() {
        MethodChannel methodChannel = this.f25095d;
        if (methodChannel == null) {
            Log.i("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin method channel was already uninitialised.");
        } else {
            methodChannel.setMethodCallHandler(null);
            this.f25095d = null;
        }
    }

    protected void Q(MethodChannel.Result result) {
        this.f25103w.m(result, K0(com.arthenica.ffmpegkit.j.a()));
    }

    protected void Q0(String str, String str2, MethodChannel.Result result) {
        this.f25094c.submit(new o(str, str2, this.f25103w, result));
    }

    protected void R(MethodChannel.Result result) {
        this.f25103w.m(result, H0(FFmpegKitConfig.z()));
    }

    protected void S(MethodChannel.Result result) {
        this.f25103w.m(result, H0(FFmpegKitConfig.A()));
    }

    protected void T(MethodChannel.Result result) {
        this.f25103w.m(result, Integer.valueOf(z0(FFmpegKitConfig.B())));
    }

    protected void U(MethodChannel.Result result) {
        this.f25103w.m(result, Integer.valueOf(A0(FFmpegKitConfig.C())));
    }

    protected void V(Integer num, MethodChannel.Result result) {
        e eVar;
        String str;
        String str2;
        x H = FFmpegKitConfig.H(num.longValue());
        if (H == null) {
            eVar = this.f25103w;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (H.p()) {
            this.f25103w.m(result, G0(((s) H).A()));
            return;
        } else {
            eVar = this.f25103w;
            str = "NOT_MEDIA_INFORMATION_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        eVar.e(result, str, str2);
    }

    protected void W(MethodChannel.Result result) {
        this.f25103w.m(result, K0(com.arthenica.ffmpegkit.j.b()));
    }

    protected void X(MethodChannel.Result result) {
        this.f25103w.m(result, v.b());
    }

    protected void Y(MethodChannel.Result result) {
        this.f25103w.m(result, "android");
    }

    protected void Z(String str, String str2, MethodChannel.Result result) {
        e eVar;
        String str3;
        String str4;
        if (this.f25098r != null) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String G = FFmpegKitConfig.G(this.f25098r, parse, str2);
                Log.d("ffmpeg-kit-flutter", String.format("getSafParameter using parameters uriString: %s, openMode: %s completed with saf parameter: %s.", str, str2, G));
                this.f25103w.m(result, G);
                return;
            } else {
                Log.w("ffmpeg-kit-flutter", String.format("Cannot getSafParameter using parameters uriString: %s, openMode: %s. Uri string cannot be parsed.", str, str2));
                eVar = this.f25103w;
                str3 = "GET_SAF_PARAMETER_FAILED";
                str4 = "Uri string cannot be parsed.";
            }
        } else {
            Log.w("ffmpeg-kit-flutter", String.format("Cannot getSafParameter using parameters uriString: %s, openMode: %s. Context is null.", str, str2));
            eVar = this.f25103w;
            str3 = "INVALID_CONTEXT";
            str4 = "Context is null.";
        }
        eVar.e(result, str3, str4);
    }

    protected void a0(Integer num, MethodChannel.Result result) {
        x H = FFmpegKitConfig.H(num.longValue());
        if (H == null) {
            this.f25103w.e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f25103w.m(result, H0(H));
        }
    }

    protected void b0(MethodChannel.Result result) {
        this.f25103w.m(result, Integer.valueOf(FFmpegKitConfig.I()));
    }

    protected void c(Integer num, Integer num2, MethodChannel.Result result) {
        x H = FFmpegKitConfig.H(num.longValue());
        if (H == null) {
            this.f25103w.e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f25103w.m(result, C0(H.c(h0(num2) ? num2.intValue() : 5000)));
        }
    }

    protected void c0(MethodChannel.Result result) {
        this.f25103w.m(result, K0(FFmpegKitConfig.J()));
    }

    protected void d(Integer num, Integer num2, MethodChannel.Result result) {
        x H = FFmpegKitConfig.H(num.longValue());
        if (H == null) {
            this.f25103w.e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f25103w.m(result, H.a(h0(num2) ? num2.intValue() : 5000));
        }
    }

    protected void d0(Integer num, MethodChannel.Result result) {
        this.f25103w.m(result, K0(FFmpegKitConfig.K(L0(num.intValue()))));
    }

    protected void e(Integer num, MethodChannel.Result result) {
        x H = FFmpegKitConfig.H(num.longValue());
        if (H == null) {
            this.f25103w.e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f25103w.m(result, Long.valueOf(H.getDuration()));
        }
    }

    protected void e0(Integer num, MethodChannel.Result result) {
        int intValue = num.intValue();
        z zVar = z.SIGINT;
        if (intValue != zVar.ordinal()) {
            int intValue2 = num.intValue();
            zVar = z.SIGQUIT;
            if (intValue2 != zVar.ordinal()) {
                int intValue3 = num.intValue();
                zVar = z.SIGPIPE;
                if (intValue3 != zVar.ordinal()) {
                    int intValue4 = num.intValue();
                    zVar = z.SIGTERM;
                    if (intValue4 != zVar.ordinal()) {
                        int intValue5 = num.intValue();
                        zVar = z.SIGXCPU;
                        if (intValue5 != zVar.ordinal()) {
                            zVar = null;
                        }
                    }
                }
            }
        }
        if (zVar == null) {
            this.f25103w.e(result, "INVALID_SIGNAL", "Signal value not supported.");
        } else {
            FFmpegKitConfig.M(zVar);
            this.f25103w.m(result, null);
        }
    }

    protected void f(Integer num, MethodChannel.Result result) {
        x H = FFmpegKitConfig.H(num.longValue());
        if (H == null) {
            this.f25103w.e(result, "SESSION_NOT_FOUND", "Session not found.");
            return;
        }
        Date l10 = H.l();
        if (l10 == null) {
            this.f25103w.m(result, null);
        } else {
            this.f25103w.m(result, Long.valueOf(l10.getTime()));
        }
    }

    protected void f0(BinaryMessenger binaryMessenger, Context context, Activity activity, PluginRegistry.Registrar registrar, ActivityPluginBinding activityPluginBinding) {
        p0();
        if (this.f25095d == null) {
            MethodChannel methodChannel = new MethodChannel(binaryMessenger, "flutter.arthenica.com/ffmpeg_kit");
            this.f25095d = methodChannel;
            methodChannel.setMethodCallHandler(this);
        } else {
            Log.i("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin method channel was already initialised.");
        }
        if (this.f25096e == null) {
            EventChannel eventChannel = new EventChannel(binaryMessenger, "flutter.arthenica.com/ffmpeg_kit_event");
            this.f25096e = eventChannel;
            eventChannel.setStreamHandler(this);
        } else {
            Log.i("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin event channel was already initialised.");
        }
        this.f25098r = context;
        this.f25099s = activity;
        if (registrar != null) {
            registrar.addActivityResultListener(this);
        } else {
            activityPluginBinding.addActivityResultListener(this);
        }
        Log.d("ffmpeg-kit-flutter", String.format("FFmpegKitFlutterPlugin %s initialised with context %s and activity %s.", this, context, activity));
    }

    protected void g(Integer num, MethodChannel.Result result) {
        x H = FFmpegKitConfig.H(num.longValue());
        if (H == null) {
            this.f25103w.e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f25103w.m(result, H.k());
        }
    }

    protected void g0(MethodChannel.Result result) {
        this.f25103w.m(result, Boolean.valueOf(FFmpegKitConfig.N()));
    }

    protected void h(Integer num, MethodChannel.Result result) {
        x H = FFmpegKitConfig.H(num.longValue());
        if (H == null) {
            this.f25103w.e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f25103w.m(result, C0(H.m()));
        }
    }

    protected void i(Integer num, MethodChannel.Result result) {
        x H = FFmpegKitConfig.H(num.longValue());
        if (H == null) {
            this.f25103w.e(result, "SESSION_NOT_FOUND", "Session not found.");
            return;
        }
        w q10 = H.q();
        if (q10 == null) {
            this.f25103w.m(result, null);
        } else {
            this.f25103w.m(result, Integer.valueOf(q10.a()));
        }
    }

    protected void j(Integer num, MethodChannel.Result result) {
        x H = FFmpegKitConfig.H(num.longValue());
        if (H == null) {
            this.f25103w.e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f25103w.m(result, Integer.valueOf(H.getState().ordinal()));
        }
    }

    protected void k(Integer num, MethodChannel.Result result) {
        x H = FFmpegKitConfig.H(num.longValue());
        if (H == null) {
            this.f25103w.e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f25103w.m(result, Boolean.valueOf(H.b()));
        }
    }

    protected void k0(String str, MethodChannel.Result result) {
        try {
            this.f25103w.m(result, G0(r.a(str)));
        } catch (JSONException e10) {
            Log.i("ffmpeg-kit-flutter", "Parsing MediaInformation failed.", e10);
            this.f25103w.m(result, null);
        }
    }

    protected void l(Integer num, MethodChannel.Result result) {
        e eVar;
        String str;
        String str2;
        x H = FFmpegKitConfig.H(num.longValue());
        if (H == null) {
            eVar = this.f25103w;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (H.g()) {
            FFmpegKitConfig.d((com.arthenica.ffmpegkit.h) H);
            this.f25103w.m(result, null);
            return;
        } else {
            eVar = this.f25103w;
            str = "NOT_FFMPEG_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        eVar.e(result, str, str2);
    }

    protected void l0(String str, MethodChannel.Result result) {
        try {
            this.f25103w.m(result, G0(r.a(str)));
        } catch (JSONException e10) {
            Log.i("ffmpeg-kit-flutter", "Parsing MediaInformation failed.", e10);
            this.f25103w.e(result, "PARSE_FAILED", "Parsing MediaInformation failed with JSON error.");
        }
    }

    protected void m(Integer num, MethodChannel.Result result) {
        e eVar;
        String str;
        String str2;
        x H = FFmpegKitConfig.H(num.longValue());
        if (H == null) {
            eVar = this.f25103w;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (H.n()) {
            FFmpegKitConfig.e((com.arthenica.ffmpegkit.k) H);
            this.f25103w.m(result, null);
            return;
        } else {
            eVar = this.f25103w;
            str = "NOT_FFPROBE_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        eVar.e(result, str, str2);
    }

    protected void m0(List<String> list, MethodChannel.Result result) {
        this.f25103w.m(result, H0(s.y((String[]) list.toArray(new String[0]), null, null)));
    }

    protected void n(Integer num, Integer num2, MethodChannel.Result result) {
        e eVar;
        String str;
        String str2;
        x H = FFmpegKitConfig.H(num.longValue());
        if (H == null) {
            eVar = this.f25103w;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (H.p()) {
            FFmpegKitConfig.f((s) H, h0(num2) ? num2.intValue() : 5000);
            this.f25103w.m(result, null);
            return;
        } else {
            eVar = this.f25103w;
            str = "NOT_MEDIA_INFORMATION_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        eVar.e(result, str, str2);
    }

    protected void n0(Integer num, Integer num2, MethodChannel.Result result) {
        e eVar;
        String str;
        String str2;
        x H = FFmpegKitConfig.H(num.longValue());
        if (H == null) {
            eVar = this.f25103w;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (H.p()) {
            this.f25094c.submit(new n((s) H, h0(num2) ? num2.intValue() : 5000, this.f25103w, result));
            return;
        } else {
            eVar = this.f25103w;
            str = "NOT_MEDIA_INFORMATION_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        eVar.e(result, str, str2);
    }

    protected void o(MethodChannel.Result result) {
        com.arthenica.ffmpegkit.g.a();
        this.f25103w.m(result, null);
    }

    protected void o0(Integer num, MethodChannel.Result result) {
        this.f25103w.m(result, Integer.valueOf(FFmpegKitConfig.messagesInTransmit(num.longValue())));
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i10);
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = intent == null ? null : intent.toString();
        Log.d("ffmpeg-kit-flutter", String.format("selectDocument completed with requestCode: %d, resultCode: %d, data: %s.", objArr));
        if (i10 != 10000 && i10 != 20000) {
            Log.i("ffmpeg-kit-flutter", String.format("FFmpegKitFlutterPlugin ignored unsupported activity result for requestCode: %d.", Integer.valueOf(i10)));
            return false;
        }
        if (i11 != -1) {
            this.f25103w.e(this.f25097f, "SELECT_CANCELLED", String.valueOf(i11));
        } else if (intent == null) {
            this.f25103w.m(this.f25097f, null);
        } else {
            Uri data = intent.getData();
            this.f25103w.m(this.f25097f, data != null ? data.toString() : null);
        }
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        Log.d("ffmpeg-kit-flutter", String.format("FFmpegKitFlutterPlugin %s attached to activity %s.", this, activityPluginBinding.getActivity()));
        f0(this.f25100t.getBinaryMessenger(), this.f25100t.getApplicationContext(), activityPluginBinding.getActivity(), null, activityPluginBinding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f25100t = flutterPluginBinding;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.f25102v = null;
        Log.d("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin stopped listening to events.");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        N0();
        Log.d("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin detached from activity.");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f25100t = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f25102v = eventSink;
        Log.d("ffmpeg-kit-flutter", String.format("FFmpegKitFlutterPlugin %s started listening to events on %s.", this, eventSink));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:196:0x03b2. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        e eVar;
        String str;
        String str2;
        Integer num = (Integer) methodCall.argument("sessionId");
        Integer num2 = (Integer) methodCall.argument("waitTimeout");
        List<String> list = (List) methodCall.argument("arguments");
        String str3 = (String) methodCall.argument("ffprobeJsonOutput");
        Boolean bool = (Boolean) methodCall.argument("writable");
        String str4 = methodCall.method;
        str4.hashCode();
        char c10 = 65535;
        switch (str4.hashCode()) {
            case -2120516313:
                if (str4.equals("getSafParameter")) {
                    c10 = 0;
                    break;
                }
                break;
            case -2103441263:
                if (str4.equals("ffmpegSession")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1912785202:
                if (str4.equals("mediaInformationSession")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1866655603:
                if (str4.equals("isLTSBuild")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1743798884:
                if (str4.equals("setFontDirectory")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1722024362:
                if (str4.equals("abstractSessionGetDuration")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1653941728:
                if (str4.equals("asyncFFmpegSessionExecute")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1411074938:
                if (str4.equals("getBuildDate")) {
                    c10 = 7;
                    break;
                }
                break;
            case -1389627233:
                if (str4.equals("ffmpegSessionGetAllStatistics")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -1367724422:
                if (str4.equals("cancel")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -1273119136:
                if (str4.equals("getSession")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -1236521429:
                if (str4.equals("disableStatistics")) {
                    c10 = 11;
                    break;
                }
                break;
            case -1232550904:
                if (str4.equals("ffmpegSessionGetStatistics")) {
                    c10 = '\f';
                    break;
                }
                break;
            case -1219192049:
                if (str4.equals("abstractSessionGetState")) {
                    c10 = '\r';
                    break;
                }
                break;
            case -1197813889:
                if (str4.equals("abstractSessionGetReturnCode")) {
                    c10 = 14;
                    break;
                }
                break;
            case -1149109195:
                if (str4.equals("getSessionHistorySize")) {
                    c10 = 15;
                    break;
                }
                break;
            case -1066083862:
                if (str4.equals("getLastSession")) {
                    c10 = 16;
                    break;
                }
                break;
            case -1007401687:
                if (str4.equals("enableRedirection")) {
                    c10 = 17;
                    break;
                }
                break;
            case -1004092829:
                if (str4.equals("asyncMediaInformationSessionExecute")) {
                    c10 = 18;
                    break;
                }
                break;
            case -986804548:
                if (str4.equals("cancelSession")) {
                    c10 = 19;
                    break;
                }
                break;
            case -873593625:
                if (str4.equals("getSessionsByState")) {
                    c10 = 20;
                    break;
                }
                break;
            case -811987437:
                if (str4.equals("getSessions")) {
                    c10 = 21;
                    break;
                }
                break;
            case -395332803:
                if (str4.equals("getFFmpegVersion")) {
                    c10 = 22;
                    break;
                }
                break;
            case -393893135:
                if (str4.equals("abstractSessionGetAllLogsAsString")) {
                    c10 = 23;
                    break;
                }
                break;
            case -342383127:
                if (str4.equals("getPlatform")) {
                    c10 = 24;
                    break;
                }
                break;
            case -329192698:
                if (str4.equals("enableStatistics")) {
                    c10 = 25;
                    break;
                }
                break;
            case -309915358:
                if (str4.equals("setLogLevel")) {
                    c10 = 26;
                    break;
                }
                break;
            case -275249448:
                if (str4.equals("getFFmpegSessions")) {
                    c10 = 27;
                    break;
                }
                break;
            case -221335530:
                if (str4.equals("getLogLevel")) {
                    c10 = 28;
                    break;
                }
                break;
            case -134939106:
                if (str4.equals("getMediaInformation")) {
                    c10 = 29;
                    break;
                }
                break;
            case -75679540:
                if (str4.equals("getArch")) {
                    c10 = 30;
                    break;
                }
                break;
            case 39238969:
                if (str4.equals("thereAreAsynchronousMessagesInTransmit")) {
                    c10 = 31;
                    break;
                }
                break;
            case 97596186:
                if (str4.equals("ignoreSignal")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 134287517:
                if (str4.equals("abstractSessionGetFailStackTrace")) {
                    c10 = '!';
                    break;
                }
                break;
            case 179624467:
                if (str4.equals("asyncFFprobeSessionExecute")) {
                    c10 = '\"';
                    break;
                }
                break;
            case 265484683:
                if (str4.equals("closeFFmpegPipe")) {
                    c10 = '#';
                    break;
                }
                break;
            case 268490427:
                if (str4.equals("getPackageName")) {
                    c10 = '$';
                    break;
                }
                break;
            case 616732055:
                if (str4.equals("getFFprobeSessions")) {
                    c10 = '%';
                    break;
                }
                break;
            case 666848778:
                if (str4.equals("clearSessions")) {
                    c10 = '&';
                    break;
                }
                break;
            case 754414928:
                if (str4.equals("registerNewFFmpegPipe")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 898447750:
                if (str4.equals("ffprobeSession")) {
                    c10 = '(';
                    break;
                }
                break;
            case 930178724:
                if (str4.equals("disableRedirection")) {
                    c10 = ')';
                    break;
                }
                break;
            case 1038283172:
                if (str4.equals("ffmpegSessionExecute")) {
                    c10 = '*';
                    break;
                }
                break;
            case 1068836721:
                if (str4.equals("abstractSessionGetLogs")) {
                    c10 = '+';
                    break;
                }
                break;
            case 1120963409:
                if (str4.equals("getLogRedirectionStrategy")) {
                    c10 = ',';
                    break;
                }
                break;
            case 1172412742:
                if (str4.equals("abstractSessionGetEndTime")) {
                    c10 = '-';
                    break;
                }
                break;
            case 1215775213:
                if (str4.equals("setEnvironmentVariable")) {
                    c10 = '.';
                    break;
                }
                break;
            case 1294348535:
                if (str4.equals("getLastCompletedSession")) {
                    c10 = '/';
                    break;
                }
                break;
            case 1353099447:
                if (str4.equals("disableLogs")) {
                    c10 = '0';
                    break;
                }
                break;
            case 1387101761:
                if (str4.equals("setSessionHistorySize")) {
                    c10 = '1';
                    break;
                }
                break;
            case 1435234184:
                if (str4.equals("writeToPipe")) {
                    c10 = '2';
                    break;
                }
                break;
            case 1453176007:
                if (str4.equals("mediaInformationSessionExecute")) {
                    c10 = '3';
                    break;
                }
                break;
            case 1466586152:
                if (str4.equals("setFontconfigConfigurationPath")) {
                    c10 = '4';
                    break;
                }
                break;
            case 1555761752:
                if (str4.equals("getExternalLibraries")) {
                    c10 = '5';
                    break;
                }
                break;
            case 1566113121:
                if (str4.equals("messagesInTransmit")) {
                    c10 = '6';
                    break;
                }
                break;
            case 1639331035:
                if (str4.equals("getMediaInformationSessions")) {
                    c10 = '7';
                    break;
                }
                break;
            case 1714653353:
                if (str4.equals("mediaInformationJsonParserFromWithError")) {
                    c10 = '8';
                    break;
                }
                break;
            case 1755559002:
                if (str4.equals("setFontDirectoryList")) {
                    c10 = '9';
                    break;
                }
                break;
            case 1814015543:
                if (str4.equals("selectDocument")) {
                    c10 = ':';
                    break;
                }
                break;
            case 1867262446:
                if (str4.equals("abstractSessionGetAllLogs")) {
                    c10 = ';';
                    break;
                }
                break;
            case 1893000658:
                if (str4.equals("enableLogs")) {
                    c10 = '<';
                    break;
                }
                break;
            case 1945437241:
                if (str4.equals("mediaInformationJsonParserFrom")) {
                    c10 = '=';
                    break;
                }
                break;
            case 1964255069:
                if (str4.equals("setLogRedirectionStrategy")) {
                    c10 = '>';
                    break;
                }
                break;
            case 2034217743:
                if (str4.equals("ffprobeSessionExecute")) {
                    c10 = '?';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                String str5 = (String) methodCall.argument("uri");
                String str6 = (String) methodCall.argument("openMode");
                if (str5 != null && str6 != null) {
                    Z(str5, str6, result);
                    return;
                }
                eVar = this.f25103w;
                if (str5 != null) {
                    str = "INVALID_OPEN_MODE";
                    str2 = "Invalid openMode value.";
                } else {
                    str = "INVALID_URI";
                    str2 = "Invalid uri value.";
                }
                eVar.e(result, str, str2);
                return;
            case 1:
                if (list != null) {
                    F(list, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_ARGUMENTS", "Invalid arguments array.");
                return;
            case 2:
                if (list != null) {
                    m0(list, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_ARGUMENTS", "Invalid arguments array.");
                return;
            case 3:
                g0(result);
                return;
            case 4:
                String str7 = (String) methodCall.argument("fontDirectory");
                Map<String, String> map = (Map) methodCall.argument("fontNameMap");
                if (str7 != null) {
                    t0(str7, map, result);
                    return;
                }
                eVar = this.f25103w;
                str = "INVALID_FONT_DIRECTORY";
                str2 = "Invalid font directory.";
                eVar.e(result, str, str2);
                return;
            case 5:
                if (num != null) {
                    e(num, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 6:
                if (num != null) {
                    l(num, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 7:
                M(result);
                return;
            case '\b':
                if (num != null) {
                    H(num, num2, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case '\t':
                o(result);
                return;
            case '\n':
                if (num != null) {
                    a0(num, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 11:
                w(result);
                return;
            case '\f':
                if (num != null) {
                    I(num, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case '\r':
                if (num != null) {
                    j(num, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 14:
                if (num != null) {
                    i(num, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 15:
                b0(result);
                return;
            case 16:
                S(result);
                return;
            case 17:
                C(result);
                return;
            case 18:
                if (num != null) {
                    n(num, num2, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 19:
                if (num != null) {
                    p(num, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 20:
                Integer num3 = (Integer) methodCall.argument("state");
                if (num3 != null) {
                    d0(num3, result);
                    return;
                }
                eVar = this.f25103w;
                str = "INVALID_SESSION_STATE";
                str2 = "Invalid session state value.";
                eVar.e(result, str, str2);
                return;
            case 21:
                c0(result);
                return;
            case 22:
                P(result);
                return;
            case 23:
                if (num != null) {
                    d(num, num2, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 24:
                Y(result);
                return;
            case 25:
                E(result);
                return;
            case 26:
                Integer num4 = (Integer) methodCall.argument("level");
                if (num4 != null) {
                    w0(num4, result);
                    return;
                }
                eVar = this.f25103w;
                str = "INVALID_LEVEL";
                str2 = "Invalid level value.";
                eVar.e(result, str, str2);
                return;
            case 27:
                O(result);
                return;
            case 28:
                T(result);
                return;
            case 29:
                if (num != null) {
                    V(num, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 30:
                L(result);
                return;
            case 31:
                if (num != null) {
                    k(num, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case ' ':
                Integer num5 = (Integer) methodCall.argument("signal");
                if (num5 != null) {
                    e0(num5, result);
                    return;
                }
                eVar = this.f25103w;
                str = "INVALID_SIGNAL";
                str2 = "Invalid signal value.";
                eVar.e(result, str, str2);
                return;
            case '!':
                if (num != null) {
                    g(num, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case '\"':
                if (num != null) {
                    m(num, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case '#':
                String str8 = (String) methodCall.argument("ffmpegPipePath");
                if (str8 != null) {
                    r(str8, result);
                    return;
                }
                eVar = this.f25103w;
                str = "INVALID_PIPE_PATH";
                str2 = "Invalid ffmpeg pipe path.";
                eVar.e(result, str, str2);
                return;
            case '$':
                X(result);
                return;
            case '%':
                Q(result);
                return;
            case '&':
                q(result);
                return;
            case '\'':
                q0(result);
                return;
            case '(':
                if (list != null) {
                    J(list, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_ARGUMENTS", "Invalid arguments array.");
                return;
            case ')':
                u(result);
                return;
            case '*':
                if (num != null) {
                    G(num, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case '+':
                if (num != null) {
                    h(num, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case ',':
                U(result);
                return;
            case '-':
                if (num != null) {
                    f(num, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case '.':
                String str9 = (String) methodCall.argument("variableName");
                String str10 = (String) methodCall.argument("variableValue");
                if (str9 != null && str10 != null) {
                    s0(str9, str10, result);
                    return;
                }
                if (str10 != null) {
                    eVar = this.f25103w;
                    str = "INVALID_NAME";
                    str2 = "Invalid environment variable name.";
                } else {
                    eVar = this.f25103w;
                    str = "INVALID_VALUE";
                    str2 = "Invalid environment variable value.";
                }
                eVar.e(result, str, str2);
                return;
            case '/':
                R(result);
                return;
            case '0':
                t(result);
                return;
            case '1':
                Integer num6 = (Integer) methodCall.argument("sessionHistorySize");
                if (num6 != null) {
                    y0(num6, result);
                    return;
                }
                eVar = this.f25103w;
                str = "INVALID_SIZE";
                str2 = "Invalid session history size value.";
                eVar.e(result, str, str2);
                return;
            case '2':
                String str11 = (String) methodCall.argument("input");
                String str12 = (String) methodCall.argument("pipe");
                if (str11 != null && str12 != null) {
                    Q0(str11, str12, result);
                    return;
                }
                if (str12 != null) {
                    eVar = this.f25103w;
                    str = "INVALID_INPUT";
                    str2 = "Invalid input value.";
                } else {
                    eVar = this.f25103w;
                    str = "INVALID_PIPE";
                    str2 = "Invalid pipe value.";
                }
                eVar.e(result, str, str2);
                return;
            case '3':
                if (num != null) {
                    n0(num, num2, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case '4':
                String str13 = (String) methodCall.argument("path");
                if (str13 != null) {
                    v0(str13, result);
                    return;
                }
                eVar = this.f25103w;
                str = "INVALID_PATH";
                str2 = "Invalid path.";
                eVar.e(result, str, str2);
                return;
            case '5':
                N(result);
                return;
            case '6':
                if (num != null) {
                    o0(num, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case '7':
                W(result);
                return;
            case '8':
                if (str3 != null) {
                    l0(str3, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_FFPROBE_JSON_OUTPUT", "Invalid ffprobe json output.");
                return;
            case '9':
                List<String> list2 = (List) methodCall.argument("fontDirectoryList");
                Map<String, String> map2 = (Map) methodCall.argument("fontNameMap");
                if (list2 != null) {
                    u0(list2, map2, result);
                    return;
                }
                eVar = this.f25103w;
                str = "INVALID_FONT_DIRECTORY_LIST";
                str2 = "Invalid font directory list.";
                eVar.e(result, str, str2);
                return;
            case ':':
                String str14 = (String) methodCall.argument("title");
                String str15 = (String) methodCall.argument("type");
                List list3 = (List) methodCall.argument("extraTypes");
                String[] strArr = list3 != null ? (String[]) list3.toArray(new String[0]) : null;
                if (bool != null) {
                    r0(bool, str14, str15, strArr, result);
                    return;
                }
                eVar = this.f25103w;
                str = "INVALID_WRITABLE";
                str2 = "Invalid writable value.";
                eVar.e(result, str, str2);
                return;
            case ';':
                if (num != null) {
                    c(num, num2, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case '<':
                B(result);
                return;
            case '=':
                if (str3 != null) {
                    k0(str3, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_FFPROBE_JSON_OUTPUT", "Invalid ffprobe json output.");
                return;
            case '>':
                Integer num7 = (Integer) methodCall.argument("strategy");
                if (num7 != null) {
                    x0(num7, result);
                    return;
                }
                eVar = this.f25103w;
                str = "INVALID_LOG_REDIRECTION_STRATEGY";
                str2 = "Invalid log redirection strategy value.";
                eVar.e(result, str, str2);
                return;
            case '?':
                if (num != null) {
                    K(num, result);
                    return;
                }
                this.f25103w.e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            default:
                this.f25103w.k(result);
                return;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }

    protected void p(Integer num, MethodChannel.Result result) {
        com.arthenica.ffmpegkit.g.b(num.longValue());
        this.f25103w.m(result, null);
    }

    protected void p0() {
        FFmpegKitConfig.k(new com.arthenica.ffmpegkit.i() { // from class: s2.f
            public /* synthetic */ f() {
            }

            @Override // com.arthenica.ffmpegkit.i
            public final void a(com.arthenica.ffmpegkit.h hVar) {
                k.this.y(hVar);
            }
        });
        FFmpegKitConfig.l(new com.arthenica.ffmpegkit.l() { // from class: s2.g
            public /* synthetic */ g() {
            }

            @Override // com.arthenica.ffmpegkit.l
            public final void a(com.arthenica.ffmpegkit.k kVar) {
                k.this.y(kVar);
            }
        });
        FFmpegKitConfig.n(new t() { // from class: s2.h
            public /* synthetic */ h() {
            }

            @Override // com.arthenica.ffmpegkit.t
            public final void a(s sVar) {
                k.this.y(sVar);
            }
        });
        FFmpegKitConfig.m(new com.arthenica.ffmpegkit.o() { // from class: s2.i
            public /* synthetic */ i() {
            }

            @Override // com.arthenica.ffmpegkit.o
            public final void a(com.arthenica.ffmpegkit.n nVar) {
                k.this.i0(nVar);
            }
        });
        FFmpegKitConfig.p(new b0() { // from class: s2.j
            public /* synthetic */ j() {
            }

            @Override // com.arthenica.ffmpegkit.b0
            public final void a(a0 a0Var) {
                k.this.j0(a0Var);
            }
        });
    }

    protected void q(MethodChannel.Result result) {
        FFmpegKitConfig.g();
        this.f25103w.m(result, null);
    }

    protected void q0(MethodChannel.Result result) {
        Context context = this.f25098r;
        if (context != null) {
            this.f25103w.m(result, FFmpegKitConfig.O(context));
        } else {
            Log.w("ffmpeg-kit-flutter", "Cannot registerNewFFmpegPipe. Context is null.");
            this.f25103w.e(result, "INVALID_CONTEXT", "Context is null.");
        }
    }

    protected void r(String str, MethodChannel.Result result) {
        FFmpegKitConfig.h(str);
        this.f25103w.m(result, null);
    }

    protected void r0(Boolean bool, String str, String str2, String[] strArr, MethodChannel.Result result) {
        Intent intent;
        e eVar;
        String str3;
        String str4;
        if (bool.booleanValue()) {
            intent = new Intent("android.intent.action.CREATE_DOCUMENT");
            intent.addFlags(3);
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.addFlags(1);
        }
        if (str2 != null) {
            intent.setType(str2);
        } else {
            intent.setType("*/*");
        }
        if (str != null) {
            intent.putExtra("android.intent.extra.TITLE", str);
        }
        if (strArr != null) {
            intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        }
        if (this.f25098r != null) {
            Activity activity = this.f25099s;
            if (activity != null) {
                try {
                    this.f25097f = result;
                    activity.startActivityForResult(intent, bool.booleanValue() ? 20000 : ModuleDescriptor.MODULE_VERSION);
                    return;
                } catch (Exception e10) {
                    Object[] objArr = new Object[4];
                    objArr[0] = bool;
                    objArr[1] = str2;
                    objArr[2] = str;
                    objArr[3] = strArr != null ? Arrays.toString(strArr) : null;
                    Log.i("ffmpeg-kit-flutter", String.format("Failed to selectDocument using parameters writable: %s, type: %s, title: %s and extra types: %s!", objArr), e10);
                    eVar = this.f25103w;
                    str3 = "SELECT_FAILED";
                    str4 = e10.getMessage();
                }
            } else {
                Object[] objArr2 = new Object[4];
                objArr2[0] = bool;
                objArr2[1] = str2;
                objArr2[2] = str;
                objArr2[3] = strArr != null ? Arrays.toString(strArr) : null;
                Log.w("ffmpeg-kit-flutter", String.format("Cannot selectDocument using parameters writable: %s, type: %s, title: %s and extra types: %s. Activity is null.", objArr2));
                eVar = this.f25103w;
                str3 = "INVALID_ACTIVITY";
                str4 = "Activity is null.";
            }
        } else {
            Object[] objArr3 = new Object[4];
            objArr3[0] = bool;
            objArr3[1] = str2;
            objArr3[2] = str;
            objArr3[3] = strArr != null ? Arrays.toString(strArr) : null;
            Log.w("ffmpeg-kit-flutter", String.format("Cannot selectDocument using parameters writable: %s, type: %s, title: %s and extra types: %s. Context is null.", objArr3));
            eVar = this.f25103w;
            str3 = "INVALID_CONTEXT";
            str4 = "Context is null.";
        }
        eVar.e(result, str3, str4);
    }

    protected void s() {
        this.f25092a.compareAndSet(true, false);
    }

    protected void s0(String str, String str2, MethodChannel.Result result) {
        FFmpegKitConfig.P(str, str2);
        this.f25103w.m(result, null);
    }

    protected void t(MethodChannel.Result result) {
        s();
        this.f25103w.m(result, null);
    }

    protected void t0(String str, Map<String, String> map, MethodChannel.Result result) {
        Context context = this.f25098r;
        if (context != null) {
            FFmpegKitConfig.Q(context, str, map);
            this.f25103w.m(result, null);
        } else {
            Log.w("ffmpeg-kit-flutter", "Cannot setFontDirectory. Context is null.");
            this.f25103w.e(result, "INVALID_CONTEXT", "Context is null.");
        }
    }

    protected void u(MethodChannel.Result result) {
        FFmpegKitConfig.j();
        this.f25103w.m(result, null);
    }

    protected void u0(List<String> list, Map<String, String> map, MethodChannel.Result result) {
        Context context = this.f25098r;
        if (context != null) {
            FFmpegKitConfig.R(context, list, map);
            this.f25103w.m(result, null);
        } else {
            Log.w("ffmpeg-kit-flutter", "Cannot setFontDirectoryList. Context is null.");
            this.f25103w.e(result, "INVALID_CONTEXT", "Context is null.");
        }
    }

    protected void v() {
        this.f25093b.compareAndSet(true, false);
    }

    protected void v0(String str, MethodChannel.Result result) {
        FFmpegKitConfig.S(str);
        this.f25103w.m(result, null);
    }

    protected void w(MethodChannel.Result result) {
        v();
        this.f25103w.m(result, null);
    }

    protected void w0(Integer num, MethodChannel.Result result) {
        FFmpegKitConfig.T(com.arthenica.ffmpegkit.m.h(num.intValue()));
        this.f25103w.m(result, null);
    }

    protected void x(com.arthenica.ffmpegkit.n nVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("FFmpegKitLogCallbackEvent", F0(nVar));
        this.f25103w.l(this.f25102v, hashMap);
    }

    protected void x0(Integer num, MethodChannel.Result result) {
        FFmpegKitConfig.U(D0(num.intValue()));
        this.f25103w.m(result, null);
    }

    public void y(x xVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("FFmpegKitCompleteCallbackEvent", H0(xVar));
        this.f25103w.l(this.f25102v, hashMap);
    }

    protected void y0(Integer num, MethodChannel.Result result) {
        FFmpegKitConfig.V(num.intValue());
        this.f25103w.m(result, null);
    }

    protected void z(a0 a0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("FFmpegKitStatisticsCallbackEvent", I0(a0Var));
        this.f25103w.l(this.f25102v, hashMap);
    }
}
