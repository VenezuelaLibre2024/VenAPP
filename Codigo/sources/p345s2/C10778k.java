package p345s2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.arthenica.ffmpegkit.AbiDetect;
import com.arthenica.ffmpegkit.C2067a0;
import com.arthenica.ffmpegkit.C2075g;
import com.arthenica.ffmpegkit.C2076h;
import com.arthenica.ffmpegkit.C2078j;
import com.arthenica.ffmpegkit.C2079k;
import com.arthenica.ffmpegkit.C2082n;
import com.arthenica.ffmpegkit.C2085q;
import com.arthenica.ffmpegkit.C2086r;
import com.arthenica.ffmpegkit.C2087s;
import com.arthenica.ffmpegkit.C2090v;
import com.arthenica.ffmpegkit.C2091w;
import com.arthenica.ffmpegkit.EnumC2081m;
import com.arthenica.ffmpegkit.EnumC2084p;
import com.arthenica.ffmpegkit.EnumC2093y;
import com.arthenica.ffmpegkit.EnumC2094z;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import com.arthenica.ffmpegkit.InterfaceC2069b0;
import com.arthenica.ffmpegkit.InterfaceC2077i;
import com.arthenica.ffmpegkit.InterfaceC2080l;
import com.arthenica.ffmpegkit.InterfaceC2083o;
import com.arthenica.ffmpegkit.InterfaceC2088t;
import com.arthenica.ffmpegkit.InterfaceC2092x;
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

/* renamed from: s2.k */
/* loaded from: classes.dex */
public class C10778k implements FlutterPlugin, ActivityAware, MethodChannel.MethodCallHandler, EventChannel.StreamHandler, PluginRegistry.ActivityResultListener {

    /* renamed from: d */
    private MethodChannel f27214d;

    /* renamed from: e */
    private EventChannel f27215e;

    /* renamed from: f */
    private MethodChannel.Result f27216f;

    /* renamed from: r */
    private Context f27217r;

    /* renamed from: s */
    private Activity f27218s;

    /* renamed from: t */
    private FlutterPlugin.FlutterPluginBinding f27219t;

    /* renamed from: u */
    private ActivityPluginBinding f27220u;

    /* renamed from: v */
    private EventChannel.EventSink f27221v;

    /* renamed from: a */
    private final AtomicBoolean f27211a = new AtomicBoolean(false);

    /* renamed from: b */
    private final AtomicBoolean f27212b = new AtomicBoolean(false);

    /* renamed from: c */
    private final ExecutorService f27213c = Executors.newFixedThreadPool(10);

    /* renamed from: w */
    private final C10772e f27222w = new C10772e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s2.k$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f27223a;

        static {
            int[] iArr = new int[EnumC2084p.values().length];
            f27223a = iArr;
            try {
                iArr[EnumC2084p.ALWAYS_PRINT_LOGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27223a[EnumC2084p.PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27223a[EnumC2084p.PRINT_LOGS_WHEN_GLOBAL_CALLBACK_NOT_DEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27223a[EnumC2084p.PRINT_LOGS_WHEN_SESSION_CALLBACK_NOT_DEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27223a[EnumC2084p.NEVER_PRINT_LOGS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C10778k() {
        Log.d("ffmpeg-kit-flutter", String.format("FFmpegKitFlutterPlugin created %s.", this));
    }

    /* renamed from: A0 */
    protected static int m32764A0(EnumC2084p enumC2084p) {
        int i10 = a.f27223a[enumC2084p.ordinal()];
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

    /* renamed from: B0 */
    protected static List<Object> m32765B0(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object opt = jSONArray.opt(i10);
            if (opt != null) {
                if (opt instanceof JSONArray) {
                    opt = m32765B0((JSONArray) opt);
                } else if (opt instanceof JSONObject) {
                    opt = m32773J0((JSONObject) opt);
                }
                arrayList.add(opt);
            }
        }
        return arrayList;
    }

    /* renamed from: C0 */
    protected static List<Map<String, Object>> m32766C0(List<C2082n> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(m32769F0(list.get(i10)));
        }
        return arrayList;
    }

    /* renamed from: D0 */
    protected static EnumC2084p m32767D0(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? EnumC2084p.NEVER_PRINT_LOGS : EnumC2084p.PRINT_LOGS_WHEN_SESSION_CALLBACK_NOT_DEFINED : EnumC2084p.PRINT_LOGS_WHEN_GLOBAL_CALLBACK_NOT_DEFINED : EnumC2084p.PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED : EnumC2084p.ALWAYS_PRINT_LOGS;
    }

    /* renamed from: E0 */
    protected static long m32768E0(Date date) {
        if (date != null) {
            return date.getTime();
        }
        return 0L;
    }

    /* renamed from: F0 */
    protected static Map<String, Object> m32769F0(C2082n c2082n) {
        HashMap hashMap = new HashMap();
        hashMap.put("sessionId", Long.valueOf(c2082n.m10524c()));
        hashMap.put("level", Integer.valueOf(m32782z0(c2082n.m10522a())));
        hashMap.put(Constants.MESSAGE, c2082n.m10523b());
        return hashMap;
    }

    /* renamed from: G0 */
    protected static Map<String, Object> m32770G0(C2085q c2085q) {
        JSONObject m10527a;
        if (c2085q == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        return (c2085q.m10527a() == null || (m10527a = c2085q.m10527a()) == null) ? hashMap : m32773J0(m10527a);
    }

    /* renamed from: H0 */
    protected static Map<String, Object> m32771H0(InterfaceC2092x interfaceC2092x) {
        int i10;
        if (interfaceC2092x == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sessionId", Long.valueOf(interfaceC2092x.mo10484f()));
        hashMap.put("createTime", Long.valueOf(m32768E0(interfaceC2092x.mo10487j())));
        hashMap.put("startTime", Long.valueOf(m32768E0(interfaceC2092x.mo10485h())));
        hashMap.put("command", interfaceC2092x.mo10486i());
        if (interfaceC2092x.mo10509g()) {
            i10 = 1;
        } else {
            if (!interfaceC2092x.mo10510n()) {
                if (interfaceC2092x.mo10511p()) {
                    C2085q m10530A = ((C2087s) interfaceC2092x).m10530A();
                    if (m10530A != null) {
                        hashMap.put("mediaInformation", m32770G0(m10530A));
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

    /* renamed from: I0 */
    protected static Map<String, Object> m32772I0(C2067a0 c2067a0) {
        HashMap hashMap = new HashMap();
        if (c2067a0 != null) {
            hashMap.put("sessionId", Long.valueOf(c2067a0.m10472b()));
            hashMap.put("videoFrameNumber", Integer.valueOf(c2067a0.m10477g()));
            hashMap.put("videoFps", Float.valueOf(c2067a0.m10476f()));
            hashMap.put("videoQuality", Float.valueOf(c2067a0.m10478h()));
            hashMap.put("size", Integer.valueOf((int) (c2067a0.m10473c() < 2147483647L ? c2067a0.m10473c() : c2067a0.m10473c() % 2147483647L)));
            hashMap.put("time", Double.valueOf(c2067a0.m10475e()));
            hashMap.put("bitrate", Double.valueOf(c2067a0.m10471a()));
            hashMap.put("speed", Double.valueOf(c2067a0.m10474d()));
        }
        return hashMap;
    }

    /* renamed from: J0 */
    protected static Map<String, Object> m32773J0(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt != null) {
                    if (opt instanceof JSONArray) {
                        opt = m32765B0((JSONArray) opt);
                    } else if (opt instanceof JSONObject) {
                        opt = m32773J0((JSONObject) opt);
                    }
                    hashMap.put(next, opt);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: K0 */
    protected static List<Map<String, Object>> m32774K0(List<? extends InterfaceC2092x> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(m32771H0(list.get(i10)));
        }
        return arrayList;
    }

    /* renamed from: L0 */
    protected static EnumC2093y m32775L0(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? EnumC2093y.COMPLETED : EnumC2093y.FAILED : EnumC2093y.RUNNING : EnumC2093y.CREATED;
    }

    /* renamed from: M0 */
    protected static List<Map<String, Object>> m32776M0(List<C2067a0> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(m32772I0(list.get(i10)));
        }
        return arrayList;
    }

    /* renamed from: h0 */
    protected static boolean m32779h0(Integer num) {
        return num != null && num.intValue() >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public /* synthetic */ void m32780i0(C2082n c2082n) {
        if (this.f27211a.get()) {
            m32854x(c2082n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public /* synthetic */ void m32781j0(C2067a0 c2067a0) {
        if (this.f27212b.get()) {
            m32858z(c2067a0);
        }
    }

    /* renamed from: z0 */
    protected static int m32782z0(EnumC2081m enumC2081m) {
        if (enumC2081m == null) {
            enumC2081m = EnumC2081m.AV_LOG_TRACE;
        }
        return enumC2081m.m10521i();
    }

    /* renamed from: A */
    protected void m32783A() {
        this.f27211a.compareAndSet(false, true);
    }

    /* renamed from: B */
    protected void m32784B(MethodChannel.Result result) {
        m32783A();
        this.f27222w.m32763m(result, null);
    }

    /* renamed from: C */
    protected void m32785C(MethodChannel.Result result) {
        m32783A();
        m32786D();
        FFmpegKitConfig.m10451o();
        this.f27222w.m32763m(result, null);
    }

    /* renamed from: D */
    protected void m32786D() {
        this.f27212b.compareAndSet(false, true);
    }

    /* renamed from: E */
    protected void m32787E(MethodChannel.Result result) {
        m32786D();
        this.f27222w.m32763m(result, null);
    }

    /* renamed from: F */
    protected void m32788F(List<String> list, MethodChannel.Result result) {
        this.f27222w.m32763m(result, m32771H0(C2076h.m10504z((String[]) list.toArray(new String[0]), null, null, null, EnumC2084p.NEVER_PRINT_LOGS)));
    }

    /* renamed from: G */
    protected void m32789G(Integer num, MethodChannel.Result result) {
        C10772e c10772e;
        String str;
        String str2;
        InterfaceC2092x m10422H = FFmpegKitConfig.m10422H(num.longValue());
        if (m10422H == null) {
            c10772e = this.f27222w;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (m10422H.mo10509g()) {
            this.f27213c.submit(new RunnableC10779l((C2076h) m10422H, this.f27222w, result));
            return;
        } else {
            c10772e = this.f27222w;
            str = "NOT_FFMPEG_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        c10772e.m32759e(result, str, str2);
    }

    /* renamed from: H */
    protected void m32790H(Integer num, Integer num2, MethodChannel.Result result) {
        C10772e c10772e;
        String str;
        String str2;
        InterfaceC2092x m10422H = FFmpegKitConfig.m10422H(num.longValue());
        if (m10422H == null) {
            c10772e = this.f27222w;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (m10422H.mo10509g()) {
            this.f27222w.m32763m(result, m32776M0(((C2076h) m10422H).m10505A(m32779h0(num2) ? num2.intValue() : 5000)));
            return;
        } else {
            c10772e = this.f27222w;
            str = "NOT_FFMPEG_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        c10772e.m32759e(result, str, str2);
    }

    /* renamed from: I */
    protected void m32791I(Integer num, MethodChannel.Result result) {
        C10772e c10772e;
        String str;
        String str2;
        InterfaceC2092x m10422H = FFmpegKitConfig.m10422H(num.longValue());
        if (m10422H == null) {
            c10772e = this.f27222w;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (m10422H.mo10509g()) {
            this.f27222w.m32763m(result, m32776M0(((C2076h) m10422H).m10507C()));
            return;
        } else {
            c10772e = this.f27222w;
            str = "NOT_FFMPEG_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        c10772e.m32759e(result, str, str2);
    }

    /* renamed from: J */
    protected void m32792J(List<String> list, MethodChannel.Result result) {
        this.f27222w.m32763m(result, m32771H0(C2079k.m10516y((String[]) list.toArray(new String[0]), null, null, EnumC2084p.NEVER_PRINT_LOGS)));
    }

    /* renamed from: K */
    protected void m32793K(Integer num, MethodChannel.Result result) {
        C10772e c10772e;
        String str;
        String str2;
        InterfaceC2092x m10422H = FFmpegKitConfig.m10422H(num.longValue());
        if (m10422H == null) {
            c10772e = this.f27222w;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (m10422H.mo10510n()) {
            this.f27213c.submit(new RunnableC10780m((C2079k) m10422H, this.f27222w, result));
            return;
        } else {
            c10772e = this.f27222w;
            str = "NOT_FFPROBE_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        c10772e.m32759e(result, str, str2);
    }

    /* renamed from: L */
    protected void m32794L(MethodChannel.Result result) {
        this.f27222w.m32763m(result, AbiDetect.m10413a());
    }

    /* renamed from: M */
    protected void m32795M(MethodChannel.Result result) {
        this.f27222w.m32763m(result, FFmpegKitConfig.m10456t());
    }

    /* renamed from: N */
    protected void m32796N(MethodChannel.Result result) {
        this.f27222w.m32763m(result, C2090v.m10547a());
    }

    /* renamed from: N0 */
    protected void m32797N0() {
        m32801P0();
        m32799O0();
        ActivityPluginBinding activityPluginBinding = this.f27220u;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this);
        }
        this.f27217r = null;
        this.f27218s = null;
        this.f27220u = null;
        Log.d("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin uninitialized.");
    }

    /* renamed from: O */
    protected void m32798O(MethodChannel.Result result) {
        this.f27222w.m32763m(result, m32774K0(C2075g.m10503c()));
    }

    /* renamed from: O0 */
    protected void m32799O0() {
        EventChannel eventChannel = this.f27215e;
        if (eventChannel == null) {
            Log.i("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin event channel was already uninitialised.");
        } else {
            eventChannel.setStreamHandler(null);
            this.f27215e = null;
        }
    }

    /* renamed from: P */
    protected void m32800P(MethodChannel.Result result) {
        this.f27222w.m32763m(result, FFmpegKitConfig.m10459w());
    }

    /* renamed from: P0 */
    protected void m32801P0() {
        MethodChannel methodChannel = this.f27214d;
        if (methodChannel == null) {
            Log.i("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin method channel was already uninitialised.");
        } else {
            methodChannel.setMethodCallHandler(null);
            this.f27214d = null;
        }
    }

    /* renamed from: Q */
    protected void m32802Q(MethodChannel.Result result) {
        this.f27222w.m32763m(result, m32774K0(C2078j.m10514a()));
    }

    /* renamed from: Q0 */
    protected void m32803Q0(String str, String str2, MethodChannel.Result result) {
        this.f27213c.submit(new RunnableC10782o(str, str2, this.f27222w, result));
    }

    /* renamed from: R */
    protected void m32804R(MethodChannel.Result result) {
        this.f27222w.m32763m(result, m32771H0(FFmpegKitConfig.m10462z()));
    }

    /* renamed from: S */
    protected void m32805S(MethodChannel.Result result) {
        this.f27222w.m32763m(result, m32771H0(FFmpegKitConfig.m10415A()));
    }

    /* renamed from: T */
    protected void m32806T(MethodChannel.Result result) {
        this.f27222w.m32763m(result, Integer.valueOf(m32782z0(FFmpegKitConfig.m10416B())));
    }

    /* renamed from: U */
    protected void m32807U(MethodChannel.Result result) {
        this.f27222w.m32763m(result, Integer.valueOf(m32764A0(FFmpegKitConfig.m10417C())));
    }

    /* renamed from: V */
    protected void m32808V(Integer num, MethodChannel.Result result) {
        C10772e c10772e;
        String str;
        String str2;
        InterfaceC2092x m10422H = FFmpegKitConfig.m10422H(num.longValue());
        if (m10422H == null) {
            c10772e = this.f27222w;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (m10422H.mo10511p()) {
            this.f27222w.m32763m(result, m32770G0(((C2087s) m10422H).m10530A()));
            return;
        } else {
            c10772e = this.f27222w;
            str = "NOT_MEDIA_INFORMATION_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        c10772e.m32759e(result, str, str2);
    }

    /* renamed from: W */
    protected void m32809W(MethodChannel.Result result) {
        this.f27222w.m32763m(result, m32774K0(C2078j.m10515b()));
    }

    /* renamed from: X */
    protected void m32810X(MethodChannel.Result result) {
        this.f27222w.m32763m(result, C2090v.m10548b());
    }

    /* renamed from: Y */
    protected void m32811Y(MethodChannel.Result result) {
        this.f27222w.m32763m(result, "android");
    }

    /* renamed from: Z */
    protected void m32812Z(String str, String str2, MethodChannel.Result result) {
        C10772e c10772e;
        String str3;
        String str4;
        if (this.f27217r != null) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String m10421G = FFmpegKitConfig.m10421G(this.f27217r, parse, str2);
                Log.d("ffmpeg-kit-flutter", String.format("getSafParameter using parameters uriString: %s, openMode: %s completed with saf parameter: %s.", str, str2, m10421G));
                this.f27222w.m32763m(result, m10421G);
                return;
            } else {
                Log.w("ffmpeg-kit-flutter", String.format("Cannot getSafParameter using parameters uriString: %s, openMode: %s. Uri string cannot be parsed.", str, str2));
                c10772e = this.f27222w;
                str3 = "GET_SAF_PARAMETER_FAILED";
                str4 = "Uri string cannot be parsed.";
            }
        } else {
            Log.w("ffmpeg-kit-flutter", String.format("Cannot getSafParameter using parameters uriString: %s, openMode: %s. Context is null.", str, str2));
            c10772e = this.f27222w;
            str3 = "INVALID_CONTEXT";
            str4 = "Context is null.";
        }
        c10772e.m32759e(result, str3, str4);
    }

    /* renamed from: a0 */
    protected void m32813a0(Integer num, MethodChannel.Result result) {
        InterfaceC2092x m10422H = FFmpegKitConfig.m10422H(num.longValue());
        if (m10422H == null) {
            this.f27222w.m32759e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f27222w.m32763m(result, m32771H0(m10422H));
        }
    }

    /* renamed from: b0 */
    protected void m32814b0(MethodChannel.Result result) {
        this.f27222w.m32763m(result, Integer.valueOf(FFmpegKitConfig.m10423I()));
    }

    /* renamed from: c */
    protected void m32815c(Integer num, Integer num2, MethodChannel.Result result) {
        InterfaceC2092x m10422H = FFmpegKitConfig.m10422H(num.longValue());
        if (m10422H == null) {
            this.f27222w.m32759e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f27222w.m32763m(result, m32766C0(m10422H.mo10481c(m32779h0(num2) ? num2.intValue() : 5000)));
        }
    }

    /* renamed from: c0 */
    protected void m32816c0(MethodChannel.Result result) {
        this.f27222w.m32763m(result, m32774K0(FFmpegKitConfig.m10424J()));
    }

    /* renamed from: d */
    protected void m32817d(Integer num, Integer num2, MethodChannel.Result result) {
        InterfaceC2092x m10422H = FFmpegKitConfig.m10422H(num.longValue());
        if (m10422H == null) {
            this.f27222w.m32759e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f27222w.m32763m(result, m10422H.mo10479a(m32779h0(num2) ? num2.intValue() : 5000));
        }
    }

    /* renamed from: d0 */
    protected void m32818d0(Integer num, MethodChannel.Result result) {
        this.f27222w.m32763m(result, m32774K0(FFmpegKitConfig.m10425K(m32775L0(num.intValue()))));
    }

    /* renamed from: e */
    protected void m32819e(Integer num, MethodChannel.Result result) {
        InterfaceC2092x m10422H = FFmpegKitConfig.m10422H(num.longValue());
        if (m10422H == null) {
            this.f27222w.m32759e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f27222w.m32763m(result, Long.valueOf(m10422H.getDuration()));
        }
    }

    /* renamed from: e0 */
    protected void m32820e0(Integer num, MethodChannel.Result result) {
        int intValue = num.intValue();
        EnumC2094z enumC2094z = EnumC2094z.SIGINT;
        if (intValue != enumC2094z.ordinal()) {
            int intValue2 = num.intValue();
            enumC2094z = EnumC2094z.SIGQUIT;
            if (intValue2 != enumC2094z.ordinal()) {
                int intValue3 = num.intValue();
                enumC2094z = EnumC2094z.SIGPIPE;
                if (intValue3 != enumC2094z.ordinal()) {
                    int intValue4 = num.intValue();
                    enumC2094z = EnumC2094z.SIGTERM;
                    if (intValue4 != enumC2094z.ordinal()) {
                        int intValue5 = num.intValue();
                        enumC2094z = EnumC2094z.SIGXCPU;
                        if (intValue5 != enumC2094z.ordinal()) {
                            enumC2094z = null;
                        }
                    }
                }
            }
        }
        if (enumC2094z == null) {
            this.f27222w.m32759e(result, "INVALID_SIGNAL", "Signal value not supported.");
        } else {
            FFmpegKitConfig.m10427M(enumC2094z);
            this.f27222w.m32763m(result, null);
        }
    }

    /* renamed from: f */
    protected void m32821f(Integer num, MethodChannel.Result result) {
        InterfaceC2092x m10422H = FFmpegKitConfig.m10422H(num.longValue());
        if (m10422H == null) {
            this.f27222w.m32759e(result, "SESSION_NOT_FOUND", "Session not found.");
            return;
        }
        Date mo10489l = m10422H.mo10489l();
        if (mo10489l == null) {
            this.f27222w.m32763m(result, null);
        } else {
            this.f27222w.m32763m(result, Long.valueOf(mo10489l.getTime()));
        }
    }

    /* renamed from: f0 */
    protected void m32822f0(BinaryMessenger binaryMessenger, Context context, Activity activity, PluginRegistry.Registrar registrar, ActivityPluginBinding activityPluginBinding) {
        m32839p0();
        if (this.f27214d == null) {
            MethodChannel methodChannel = new MethodChannel(binaryMessenger, "flutter.arthenica.com/ffmpeg_kit");
            this.f27214d = methodChannel;
            methodChannel.setMethodCallHandler(this);
        } else {
            Log.i("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin method channel was already initialised.");
        }
        if (this.f27215e == null) {
            EventChannel eventChannel = new EventChannel(binaryMessenger, "flutter.arthenica.com/ffmpeg_kit_event");
            this.f27215e = eventChannel;
            eventChannel.setStreamHandler(this);
        } else {
            Log.i("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin event channel was already initialised.");
        }
        this.f27217r = context;
        this.f27218s = activity;
        if (registrar != null) {
            registrar.addActivityResultListener(this);
        } else {
            activityPluginBinding.addActivityResultListener(this);
        }
        Log.d("ffmpeg-kit-flutter", String.format("FFmpegKitFlutterPlugin %s initialised with context %s and activity %s.", this, context, activity));
    }

    /* renamed from: g */
    protected void m32823g(Integer num, MethodChannel.Result result) {
        InterfaceC2092x m10422H = FFmpegKitConfig.m10422H(num.longValue());
        if (m10422H == null) {
            this.f27222w.m32759e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f27222w.m32763m(result, m10422H.mo10488k());
        }
    }

    /* renamed from: g0 */
    protected void m32824g0(MethodChannel.Result result) {
        this.f27222w.m32763m(result, Boolean.valueOf(FFmpegKitConfig.m10428N()));
    }

    /* renamed from: h */
    protected void m32825h(Integer num, MethodChannel.Result result) {
        InterfaceC2092x m10422H = FFmpegKitConfig.m10422H(num.longValue());
        if (m10422H == null) {
            this.f27222w.m32759e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f27222w.m32763m(result, m32766C0(m10422H.mo10490m()));
        }
    }

    /* renamed from: i */
    protected void m32826i(Integer num, MethodChannel.Result result) {
        InterfaceC2092x m10422H = FFmpegKitConfig.m10422H(num.longValue());
        if (m10422H == null) {
            this.f27222w.m32759e(result, "SESSION_NOT_FOUND", "Session not found.");
            return;
        }
        C2091w mo10492q = m10422H.mo10492q();
        if (mo10492q == null) {
            this.f27222w.m32763m(result, null);
        } else {
            this.f27222w.m32763m(result, Integer.valueOf(mo10492q.m10549a()));
        }
    }

    /* renamed from: j */
    protected void m32827j(Integer num, MethodChannel.Result result) {
        InterfaceC2092x m10422H = FFmpegKitConfig.m10422H(num.longValue());
        if (m10422H == null) {
            this.f27222w.m32759e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f27222w.m32763m(result, Integer.valueOf(m10422H.getState().ordinal()));
        }
    }

    /* renamed from: k */
    protected void m32828k(Integer num, MethodChannel.Result result) {
        InterfaceC2092x m10422H = FFmpegKitConfig.m10422H(num.longValue());
        if (m10422H == null) {
            this.f27222w.m32759e(result, "SESSION_NOT_FOUND", "Session not found.");
        } else {
            this.f27222w.m32763m(result, Boolean.valueOf(m10422H.mo10480b()));
        }
    }

    /* renamed from: k0 */
    protected void m32829k0(String str, MethodChannel.Result result) {
        try {
            this.f27222w.m32763m(result, m32770G0(C2086r.m10528a(str)));
        } catch (JSONException e10) {
            Log.i("ffmpeg-kit-flutter", "Parsing MediaInformation failed.", e10);
            this.f27222w.m32763m(result, null);
        }
    }

    /* renamed from: l */
    protected void m32830l(Integer num, MethodChannel.Result result) {
        C10772e c10772e;
        String str;
        String str2;
        InterfaceC2092x m10422H = FFmpegKitConfig.m10422H(num.longValue());
        if (m10422H == null) {
            c10772e = this.f27222w;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (m10422H.mo10509g()) {
            FFmpegKitConfig.m10440d((C2076h) m10422H);
            this.f27222w.m32763m(result, null);
            return;
        } else {
            c10772e = this.f27222w;
            str = "NOT_FFMPEG_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        c10772e.m32759e(result, str, str2);
    }

    /* renamed from: l0 */
    protected void m32831l0(String str, MethodChannel.Result result) {
        try {
            this.f27222w.m32763m(result, m32770G0(C2086r.m10528a(str)));
        } catch (JSONException e10) {
            Log.i("ffmpeg-kit-flutter", "Parsing MediaInformation failed.", e10);
            this.f27222w.m32759e(result, "PARSE_FAILED", "Parsing MediaInformation failed with JSON error.");
        }
    }

    /* renamed from: m */
    protected void m32832m(Integer num, MethodChannel.Result result) {
        C10772e c10772e;
        String str;
        String str2;
        InterfaceC2092x m10422H = FFmpegKitConfig.m10422H(num.longValue());
        if (m10422H == null) {
            c10772e = this.f27222w;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (m10422H.mo10510n()) {
            FFmpegKitConfig.m10441e((C2079k) m10422H);
            this.f27222w.m32763m(result, null);
            return;
        } else {
            c10772e = this.f27222w;
            str = "NOT_FFPROBE_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        c10772e.m32759e(result, str, str2);
    }

    /* renamed from: m0 */
    protected void m32833m0(List<String> list, MethodChannel.Result result) {
        this.f27222w.m32763m(result, m32771H0(C2087s.m10529y((String[]) list.toArray(new String[0]), null, null)));
    }

    /* renamed from: n */
    protected void m32834n(Integer num, Integer num2, MethodChannel.Result result) {
        C10772e c10772e;
        String str;
        String str2;
        InterfaceC2092x m10422H = FFmpegKitConfig.m10422H(num.longValue());
        if (m10422H == null) {
            c10772e = this.f27222w;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (m10422H.mo10511p()) {
            FFmpegKitConfig.m10442f((C2087s) m10422H, m32779h0(num2) ? num2.intValue() : 5000);
            this.f27222w.m32763m(result, null);
            return;
        } else {
            c10772e = this.f27222w;
            str = "NOT_MEDIA_INFORMATION_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        c10772e.m32759e(result, str, str2);
    }

    /* renamed from: n0 */
    protected void m32835n0(Integer num, Integer num2, MethodChannel.Result result) {
        C10772e c10772e;
        String str;
        String str2;
        InterfaceC2092x m10422H = FFmpegKitConfig.m10422H(num.longValue());
        if (m10422H == null) {
            c10772e = this.f27222w;
            str = "SESSION_NOT_FOUND";
            str2 = "Session not found.";
        } else if (m10422H.mo10511p()) {
            this.f27213c.submit(new RunnableC10781n((C2087s) m10422H, m32779h0(num2) ? num2.intValue() : 5000, this.f27222w, result));
            return;
        } else {
            c10772e = this.f27222w;
            str = "NOT_MEDIA_INFORMATION_SESSION";
            str2 = "A session is found but it does not have the correct type.";
        }
        c10772e.m32759e(result, str, str2);
    }

    /* renamed from: o */
    protected void m32836o(MethodChannel.Result result) {
        C2075g.m10501a();
        this.f27222w.m32763m(result, null);
    }

    /* renamed from: o0 */
    protected void m32837o0(Integer num, MethodChannel.Result result) {
        this.f27222w.m32763m(result, Integer.valueOf(FFmpegKitConfig.messagesInTransmit(num.longValue())));
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
            this.f27222w.m32759e(this.f27216f, "SELECT_CANCELLED", String.valueOf(i11));
        } else if (intent == null) {
            this.f27222w.m32763m(this.f27216f, null);
        } else {
            Uri data = intent.getData();
            this.f27222w.m32763m(this.f27216f, data != null ? data.toString() : null);
        }
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        Log.d("ffmpeg-kit-flutter", String.format("FFmpegKitFlutterPlugin %s attached to activity %s.", this, activityPluginBinding.getActivity()));
        m32822f0(this.f27219t.getBinaryMessenger(), this.f27219t.getApplicationContext(), activityPluginBinding.getActivity(), null, activityPluginBinding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f27219t = flutterPluginBinding;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.f27221v = null;
        Log.d("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin stopped listening to events.");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        m32797N0();
        Log.d("ffmpeg-kit-flutter", "FFmpegKitFlutterPlugin detached from activity.");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f27219t = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f27221v = eventSink;
        Log.d("ffmpeg-kit-flutter", String.format("FFmpegKitFlutterPlugin %s started listening to events on %s.", this, eventSink));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:196:0x03b2. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        C10772e c10772e;
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
                    m32812Z(str5, str6, result);
                    return;
                }
                c10772e = this.f27222w;
                if (str5 != null) {
                    str = "INVALID_OPEN_MODE";
                    str2 = "Invalid openMode value.";
                } else {
                    str = "INVALID_URI";
                    str2 = "Invalid uri value.";
                }
                c10772e.m32759e(result, str, str2);
                return;
            case 1:
                if (list != null) {
                    m32788F(list, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_ARGUMENTS", "Invalid arguments array.");
                return;
            case 2:
                if (list != null) {
                    m32833m0(list, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_ARGUMENTS", "Invalid arguments array.");
                return;
            case 3:
                m32824g0(result);
                return;
            case 4:
                String str7 = (String) methodCall.argument("fontDirectory");
                Map<String, String> map = (Map) methodCall.argument("fontNameMap");
                if (str7 != null) {
                    m32847t0(str7, map, result);
                    return;
                }
                c10772e = this.f27222w;
                str = "INVALID_FONT_DIRECTORY";
                str2 = "Invalid font directory.";
                c10772e.m32759e(result, str, str2);
                return;
            case 5:
                if (num != null) {
                    m32819e(num, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 6:
                if (num != null) {
                    m32830l(num, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 7:
                m32795M(result);
                return;
            case '\b':
                if (num != null) {
                    m32790H(num, num2, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case '\t':
                m32836o(result);
                return;
            case '\n':
                if (num != null) {
                    m32813a0(num, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 11:
                m32852w(result);
                return;
            case '\f':
                if (num != null) {
                    m32791I(num, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case '\r':
                if (num != null) {
                    m32827j(num, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 14:
                if (num != null) {
                    m32826i(num, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 15:
                m32814b0(result);
                return;
            case 16:
                m32805S(result);
                return;
            case 17:
                m32785C(result);
                return;
            case 18:
                if (num != null) {
                    m32834n(num, num2, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 19:
                if (num != null) {
                    m32838p(num, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 20:
                Integer num3 = (Integer) methodCall.argument("state");
                if (num3 != null) {
                    m32818d0(num3, result);
                    return;
                }
                c10772e = this.f27222w;
                str = "INVALID_SESSION_STATE";
                str2 = "Invalid session state value.";
                c10772e.m32759e(result, str, str2);
                return;
            case 21:
                m32816c0(result);
                return;
            case 22:
                m32800P(result);
                return;
            case 23:
                if (num != null) {
                    m32817d(num, num2, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 24:
                m32811Y(result);
                return;
            case 25:
                m32787E(result);
                return;
            case 26:
                Integer num4 = (Integer) methodCall.argument("level");
                if (num4 != null) {
                    m32853w0(num4, result);
                    return;
                }
                c10772e = this.f27222w;
                str = "INVALID_LEVEL";
                str2 = "Invalid level value.";
                c10772e.m32759e(result, str, str2);
                return;
            case 27:
                m32798O(result);
                return;
            case 28:
                m32806T(result);
                return;
            case 29:
                if (num != null) {
                    m32808V(num, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case 30:
                m32794L(result);
                return;
            case 31:
                if (num != null) {
                    m32828k(num, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case ' ':
                Integer num5 = (Integer) methodCall.argument("signal");
                if (num5 != null) {
                    m32820e0(num5, result);
                    return;
                }
                c10772e = this.f27222w;
                str = "INVALID_SIGNAL";
                str2 = "Invalid signal value.";
                c10772e.m32759e(result, str, str2);
                return;
            case '!':
                if (num != null) {
                    m32823g(num, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case '\"':
                if (num != null) {
                    m32832m(num, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case '#':
                String str8 = (String) methodCall.argument("ffmpegPipePath");
                if (str8 != null) {
                    m32842r(str8, result);
                    return;
                }
                c10772e = this.f27222w;
                str = "INVALID_PIPE_PATH";
                str2 = "Invalid ffmpeg pipe path.";
                c10772e.m32759e(result, str, str2);
                return;
            case '$':
                m32810X(result);
                return;
            case '%':
                m32802Q(result);
                return;
            case '&':
                m32840q(result);
                return;
            case '\'':
                m32841q0(result);
                return;
            case '(':
                if (list != null) {
                    m32792J(list, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_ARGUMENTS", "Invalid arguments array.");
                return;
            case ')':
                m32848u(result);
                return;
            case '*':
                if (num != null) {
                    m32789G(num, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case '+':
                if (num != null) {
                    m32825h(num, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case ',':
                m32807U(result);
                return;
            case '-':
                if (num != null) {
                    m32821f(num, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case '.':
                String str9 = (String) methodCall.argument("variableName");
                String str10 = (String) methodCall.argument("variableValue");
                if (str9 != null && str10 != null) {
                    m32845s0(str9, str10, result);
                    return;
                }
                if (str10 != null) {
                    c10772e = this.f27222w;
                    str = "INVALID_NAME";
                    str2 = "Invalid environment variable name.";
                } else {
                    c10772e = this.f27222w;
                    str = "INVALID_VALUE";
                    str2 = "Invalid environment variable value.";
                }
                c10772e.m32759e(result, str, str2);
                return;
            case '/':
                m32804R(result);
                return;
            case '0':
                m32846t(result);
                return;
            case '1':
                Integer num6 = (Integer) methodCall.argument("sessionHistorySize");
                if (num6 != null) {
                    m32857y0(num6, result);
                    return;
                }
                c10772e = this.f27222w;
                str = "INVALID_SIZE";
                str2 = "Invalid session history size value.";
                c10772e.m32759e(result, str, str2);
                return;
            case '2':
                String str11 = (String) methodCall.argument("input");
                String str12 = (String) methodCall.argument("pipe");
                if (str11 != null && str12 != null) {
                    m32803Q0(str11, str12, result);
                    return;
                }
                if (str12 != null) {
                    c10772e = this.f27222w;
                    str = "INVALID_INPUT";
                    str2 = "Invalid input value.";
                } else {
                    c10772e = this.f27222w;
                    str = "INVALID_PIPE";
                    str2 = "Invalid pipe value.";
                }
                c10772e.m32759e(result, str, str2);
                return;
            case '3':
                if (num != null) {
                    m32835n0(num, num2, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case '4':
                String str13 = (String) methodCall.argument("path");
                if (str13 != null) {
                    m32851v0(str13, result);
                    return;
                }
                c10772e = this.f27222w;
                str = "INVALID_PATH";
                str2 = "Invalid path.";
                c10772e.m32759e(result, str, str2);
                return;
            case '5':
                m32796N(result);
                return;
            case '6':
                if (num != null) {
                    m32837o0(num, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case '7':
                m32809W(result);
                return;
            case '8':
                if (str3 != null) {
                    m32831l0(str3, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_FFPROBE_JSON_OUTPUT", "Invalid ffprobe json output.");
                return;
            case '9':
                List<String> list2 = (List) methodCall.argument("fontDirectoryList");
                Map<String, String> map2 = (Map) methodCall.argument("fontNameMap");
                if (list2 != null) {
                    m32849u0(list2, map2, result);
                    return;
                }
                c10772e = this.f27222w;
                str = "INVALID_FONT_DIRECTORY_LIST";
                str2 = "Invalid font directory list.";
                c10772e.m32759e(result, str, str2);
                return;
            case ':':
                String str14 = (String) methodCall.argument("title");
                String str15 = (String) methodCall.argument("type");
                List list3 = (List) methodCall.argument("extraTypes");
                String[] strArr = list3 != null ? (String[]) list3.toArray(new String[0]) : null;
                if (bool != null) {
                    m32843r0(bool, str14, str15, strArr, result);
                    return;
                }
                c10772e = this.f27222w;
                str = "INVALID_WRITABLE";
                str2 = "Invalid writable value.";
                c10772e.m32759e(result, str, str2);
                return;
            case ';':
                if (num != null) {
                    m32815c(num, num2, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            case '<':
                m32784B(result);
                return;
            case '=':
                if (str3 != null) {
                    m32829k0(str3, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_FFPROBE_JSON_OUTPUT", "Invalid ffprobe json output.");
                return;
            case '>':
                Integer num7 = (Integer) methodCall.argument("strategy");
                if (num7 != null) {
                    m32855x0(num7, result);
                    return;
                }
                c10772e = this.f27222w;
                str = "INVALID_LOG_REDIRECTION_STRATEGY";
                str2 = "Invalid log redirection strategy value.";
                c10772e.m32759e(result, str, str2);
                return;
            case '?':
                if (num != null) {
                    m32793K(num, result);
                    return;
                }
                this.f27222w.m32759e(result, "INVALID_SESSION", "Invalid session id.");
                return;
            default:
                this.f27222w.m32761k(result);
                return;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }

    /* renamed from: p */
    protected void m32838p(Integer num, MethodChannel.Result result) {
        C2075g.m10502b(num.longValue());
        this.f27222w.m32763m(result, null);
    }

    /* renamed from: p0 */
    protected void m32839p0() {
        FFmpegKitConfig.m10447k(new InterfaceC2077i() { // from class: s2.f
            @Override // com.arthenica.ffmpegkit.InterfaceC2077i
            /* renamed from: a */
            public final void mo10513a(C2076h c2076h) {
                C10778k.this.m32856y(c2076h);
            }
        });
        FFmpegKitConfig.m10448l(new InterfaceC2080l() { // from class: s2.g
            @Override // com.arthenica.ffmpegkit.InterfaceC2080l
            /* renamed from: a */
            public final void mo10518a(C2079k c2079k) {
                C10778k.this.m32856y(c2079k);
            }
        });
        FFmpegKitConfig.m10450n(new InterfaceC2088t() { // from class: s2.h
            @Override // com.arthenica.ffmpegkit.InterfaceC2088t
            /* renamed from: a */
            public final void mo10533a(C2087s c2087s) {
                C10778k.this.m32856y(c2087s);
            }
        });
        FFmpegKitConfig.m10449m(new InterfaceC2083o() { // from class: s2.i
            @Override // com.arthenica.ffmpegkit.InterfaceC2083o
            /* renamed from: a */
            public final void mo10525a(C2082n c2082n) {
                C10778k.this.m32780i0(c2082n);
            }
        });
        FFmpegKitConfig.m10452p(new InterfaceC2069b0() { // from class: s2.j
            @Override // com.arthenica.ffmpegkit.InterfaceC2069b0
            /* renamed from: a */
            public final void mo10500a(C2067a0 c2067a0) {
                C10778k.this.m32781j0(c2067a0);
            }
        });
    }

    /* renamed from: q */
    protected void m32840q(MethodChannel.Result result) {
        FFmpegKitConfig.m10443g();
        this.f27222w.m32763m(result, null);
    }

    /* renamed from: q0 */
    protected void m32841q0(MethodChannel.Result result) {
        Context context = this.f27217r;
        if (context != null) {
            this.f27222w.m32763m(result, FFmpegKitConfig.m10429O(context));
        } else {
            Log.w("ffmpeg-kit-flutter", "Cannot registerNewFFmpegPipe. Context is null.");
            this.f27222w.m32759e(result, "INVALID_CONTEXT", "Context is null.");
        }
    }

    /* renamed from: r */
    protected void m32842r(String str, MethodChannel.Result result) {
        FFmpegKitConfig.m10444h(str);
        this.f27222w.m32763m(result, null);
    }

    /* renamed from: r0 */
    protected void m32843r0(Boolean bool, String str, String str2, String[] strArr, MethodChannel.Result result) {
        Intent intent;
        C10772e c10772e;
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
        if (this.f27217r != null) {
            Activity activity = this.f27218s;
            if (activity != null) {
                try {
                    this.f27216f = result;
                    activity.startActivityForResult(intent, bool.booleanValue() ? 20000 : ModuleDescriptor.MODULE_VERSION);
                    return;
                } catch (Exception e10) {
                    Object[] objArr = new Object[4];
                    objArr[0] = bool;
                    objArr[1] = str2;
                    objArr[2] = str;
                    objArr[3] = strArr != null ? Arrays.toString(strArr) : null;
                    Log.i("ffmpeg-kit-flutter", String.format("Failed to selectDocument using parameters writable: %s, type: %s, title: %s and extra types: %s!", objArr), e10);
                    c10772e = this.f27222w;
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
                c10772e = this.f27222w;
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
            c10772e = this.f27222w;
            str3 = "INVALID_CONTEXT";
            str4 = "Context is null.";
        }
        c10772e.m32759e(result, str3, str4);
    }

    /* renamed from: s */
    protected void m32844s() {
        this.f27211a.compareAndSet(true, false);
    }

    /* renamed from: s0 */
    protected void m32845s0(String str, String str2, MethodChannel.Result result) {
        FFmpegKitConfig.m10430P(str, str2);
        this.f27222w.m32763m(result, null);
    }

    /* renamed from: t */
    protected void m32846t(MethodChannel.Result result) {
        m32844s();
        this.f27222w.m32763m(result, null);
    }

    /* renamed from: t0 */
    protected void m32847t0(String str, Map<String, String> map, MethodChannel.Result result) {
        Context context = this.f27217r;
        if (context != null) {
            FFmpegKitConfig.m10431Q(context, str, map);
            this.f27222w.m32763m(result, null);
        } else {
            Log.w("ffmpeg-kit-flutter", "Cannot setFontDirectory. Context is null.");
            this.f27222w.m32759e(result, "INVALID_CONTEXT", "Context is null.");
        }
    }

    /* renamed from: u */
    protected void m32848u(MethodChannel.Result result) {
        FFmpegKitConfig.m10446j();
        this.f27222w.m32763m(result, null);
    }

    /* renamed from: u0 */
    protected void m32849u0(List<String> list, Map<String, String> map, MethodChannel.Result result) {
        Context context = this.f27217r;
        if (context != null) {
            FFmpegKitConfig.m10432R(context, list, map);
            this.f27222w.m32763m(result, null);
        } else {
            Log.w("ffmpeg-kit-flutter", "Cannot setFontDirectoryList. Context is null.");
            this.f27222w.m32759e(result, "INVALID_CONTEXT", "Context is null.");
        }
    }

    /* renamed from: v */
    protected void m32850v() {
        this.f27212b.compareAndSet(true, false);
    }

    /* renamed from: v0 */
    protected void m32851v0(String str, MethodChannel.Result result) {
        FFmpegKitConfig.m10433S(str);
        this.f27222w.m32763m(result, null);
    }

    /* renamed from: w */
    protected void m32852w(MethodChannel.Result result) {
        m32850v();
        this.f27222w.m32763m(result, null);
    }

    /* renamed from: w0 */
    protected void m32853w0(Integer num, MethodChannel.Result result) {
        FFmpegKitConfig.m10434T(EnumC2081m.m10520h(num.intValue()));
        this.f27222w.m32763m(result, null);
    }

    /* renamed from: x */
    protected void m32854x(C2082n c2082n) {
        HashMap hashMap = new HashMap();
        hashMap.put("FFmpegKitLogCallbackEvent", m32769F0(c2082n));
        this.f27222w.m32762l(this.f27221v, hashMap);
    }

    /* renamed from: x0 */
    protected void m32855x0(Integer num, MethodChannel.Result result) {
        FFmpegKitConfig.m10435U(m32767D0(num.intValue()));
        this.f27222w.m32763m(result, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public void m32856y(InterfaceC2092x interfaceC2092x) {
        HashMap hashMap = new HashMap();
        hashMap.put("FFmpegKitCompleteCallbackEvent", m32771H0(interfaceC2092x));
        this.f27222w.m32762l(this.f27221v, hashMap);
    }

    /* renamed from: y0 */
    protected void m32857y0(Integer num, MethodChannel.Result result) {
        FFmpegKitConfig.m10436V(num.intValue());
        this.f27222w.m32763m(result, null);
    }

    /* renamed from: z */
    protected void m32858z(C2067a0 c2067a0) {
        HashMap hashMap = new HashMap();
        hashMap.put("FFmpegKitStatisticsCallbackEvent", m32772I0(c2067a0));
        this.f27222w.m32762l(this.f27221v, hashMap);
    }
}
