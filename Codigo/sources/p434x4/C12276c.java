package p434x4;

import android.os.Build;
import com.facebook.ads.AdError;
import com.facebook.internal.C4634n0;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.util.Arrays;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p450xk.C12524p;

/* renamed from: x4.c */
/* loaded from: classes.dex */
public final class C12276c {

    /* renamed from: h */
    public static final b f32898h = new b(null);

    /* renamed from: a */
    private String f32899a;

    /* renamed from: b */
    private c f32900b;

    /* renamed from: c */
    private JSONArray f32901c;

    /* renamed from: d */
    private String f32902d;

    /* renamed from: e */
    private String f32903e;

    /* renamed from: f */
    private String f32904f;

    /* renamed from: g */
    private Long f32905g;

    /* renamed from: x4.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f32906a = new a();

        private a() {
        }

        /* renamed from: a */
        public static final C12276c m39532a(String str, String str2) {
            return new C12276c(str, str2, (C9315g) null);
        }

        /* renamed from: b */
        public static final C12276c m39533b(Throwable th2, c t10) {
            C9322n.m27781e(t10, "t");
            return new C12276c(th2, t10, (C9315g) null);
        }

        /* renamed from: c */
        public static final C12276c m39534c(JSONArray features) {
            C9322n.m27781e(features, "features");
            return new C12276c(features, (C9315g) null);
        }

        /* renamed from: d */
        public static final C12276c m39535d(File file) {
            C9322n.m27781e(file, "file");
            return new C12276c(file, (C9315g) null);
        }
    }

    /* renamed from: x4.c$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final c m39537b(String str) {
            boolean m41031E;
            boolean m41031E2;
            boolean m41031E3;
            boolean m41031E4;
            boolean m41031E5;
            m41031E = C12524p.m41031E(str, "crash_log_", false, 2, null);
            if (m41031E) {
                return c.CrashReport;
            }
            m41031E2 = C12524p.m41031E(str, "shield_log_", false, 2, null);
            if (m41031E2) {
                return c.CrashShield;
            }
            m41031E3 = C12524p.m41031E(str, "thread_check_log_", false, 2, null);
            if (m41031E3) {
                return c.ThreadCheck;
            }
            m41031E4 = C12524p.m41031E(str, "analysis_log_", false, 2, null);
            if (m41031E4) {
                return c.Analysis;
            }
            m41031E5 = C12524p.m41031E(str, "anr_log_", false, 2, null);
            return m41031E5 ? c.AnrReport : c.Unknown;
        }
    }

    /* renamed from: x4.c$c */
    /* loaded from: classes.dex */
    public enum c {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* renamed from: x4.c$c$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f32907a;

            static {
                int[] iArr = new int[c.valuesCustom().length];
                iArr[c.Analysis.ordinal()] = 1;
                iArr[c.AnrReport.ordinal()] = 2;
                iArr[c.CrashReport.ordinal()] = 3;
                iArr[c.CrashShield.ordinal()] = 4;
                iArr[c.ThreadCheck.ordinal()] = 5;
                f32907a = iArr;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        /* renamed from: h */
        public final String m39539h() {
            int i10 = a.f32907a[ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f32907a[ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
        }
    }

    /* renamed from: x4.c$d */
    /* loaded from: classes.dex */
    public /* synthetic */ class d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32908a;

        static {
            int[] iArr = new int[c.valuesCustom().length];
            iArr[c.Analysis.ordinal()] = 1;
            iArr[c.AnrReport.ordinal()] = 2;
            iArr[c.CrashReport.ordinal()] = 3;
            iArr[c.CrashShield.ordinal()] = 4;
            iArr[c.ThreadCheck.ordinal()] = 5;
            f32908a = iArr;
        }
    }

    private C12276c(File file) {
        String name = file.getName();
        C9322n.m27780d(name, "file.name");
        this.f32899a = name;
        this.f32900b = f32898h.m39537b(name);
        C12284k c12284k = C12284k.f32910a;
        JSONObject m39564r = C12284k.m39564r(this.f32899a, true);
        if (m39564r != null) {
            this.f32905g = Long.valueOf(m39564r.optLong(Constants.TIMESTAMP, 0L));
            this.f32902d = m39564r.optString("app_version", null);
            this.f32903e = m39564r.optString(Constants.REASON, null);
            this.f32904f = m39564r.optString("callstack", null);
            this.f32901c = m39564r.optJSONArray("feature_names");
        }
    }

    public /* synthetic */ C12276c(File file, C9315g c9315g) {
        this(file);
    }

    private C12276c(String str, String str2) {
        this.f32900b = c.AnrReport;
        this.f32902d = C4634n0.m11337w();
        this.f32903e = str;
        this.f32904f = str2;
        this.f32905g = Long.valueOf(System.currentTimeMillis() / AdError.NETWORK_ERROR_CODE);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anr_log_");
        stringBuffer.append(String.valueOf(this.f32905g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        C9322n.m27780d(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f32899a = stringBuffer2;
    }

    public /* synthetic */ C12276c(String str, String str2, C9315g c9315g) {
        this(str, str2);
    }

    private C12276c(Throwable th2, c cVar) {
        this.f32900b = cVar;
        this.f32902d = C4634n0.m11337w();
        this.f32903e = C12284k.m39551e(th2);
        this.f32904f = C12284k.m39554h(th2);
        this.f32905g = Long.valueOf(System.currentTimeMillis() / AdError.NETWORK_ERROR_CODE);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(cVar.m39539h());
        stringBuffer.append(String.valueOf(this.f32905g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        C9322n.m27780d(stringBuffer2, "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()");
        this.f32899a = stringBuffer2;
    }

    public /* synthetic */ C12276c(Throwable th2, c cVar, C9315g c9315g) {
        this(th2, cVar);
    }

    private C12276c(JSONArray jSONArray) {
        this.f32900b = c.Analysis;
        this.f32905g = Long.valueOf(System.currentTimeMillis() / AdError.NETWORK_ERROR_CODE);
        this.f32901c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(String.valueOf(this.f32905g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        C9322n.m27780d(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f32899a = stringBuffer2;
    }

    public /* synthetic */ C12276c(JSONArray jSONArray, C9315g c9315g) {
        this(jSONArray);
    }

    /* renamed from: c */
    private final JSONObject m39525c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.f32901c;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l10 = this.f32905g;
            if (l10 != null) {
                jSONObject.put(Constants.TIMESTAMP, l10);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private final JSONObject m39526d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.f32902d;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l10 = this.f32905g;
            if (l10 != null) {
                jSONObject.put(Constants.TIMESTAMP, l10);
            }
            String str2 = this.f32903e;
            if (str2 != null) {
                jSONObject.put(Constants.REASON, str2);
            }
            String str3 = this.f32904f;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            c cVar = this.f32900b;
            if (cVar != null) {
                jSONObject.put("type", cVar);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private final JSONObject m39527e() {
        c cVar = this.f32900b;
        int i10 = cVar == null ? -1 : d.f32908a[cVar.ordinal()];
        if (i10 == 1) {
            return m39525c();
        }
        if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
            return m39526d();
        }
        return null;
    }

    /* renamed from: a */
    public final void m39528a() {
        C12284k c12284k = C12284k.f32910a;
        C12284k.m39550d(this.f32899a);
    }

    /* renamed from: b */
    public final int m39529b(C12276c data) {
        C9322n.m27781e(data, "data");
        Long l10 = this.f32905g;
        if (l10 == null) {
            return -1;
        }
        long longValue = l10.longValue();
        Long l11 = data.f32905g;
        if (l11 == null) {
            return 1;
        }
        return C9322n.m27783g(l11.longValue(), longValue);
    }

    /* renamed from: f */
    public final boolean m39530f() {
        c cVar = this.f32900b;
        int i10 = cVar == null ? -1 : d.f32908a[cVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 != 3 && i10 != 4 && i10 != 5) || this.f32904f == null || this.f32905g == null) {
                    return false;
                }
            } else if (this.f32904f == null || this.f32903e == null || this.f32905g == null) {
                return false;
            }
        } else if (this.f32901c == null || this.f32905g == null) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void m39531g() {
        if (m39530f()) {
            C12284k c12284k = C12284k.f32910a;
            C12284k.m39566t(this.f32899a, toString());
        }
    }

    public String toString() {
        String jSONObject;
        String str;
        JSONObject m39527e = m39527e();
        if (m39527e == null) {
            jSONObject = new JSONObject().toString();
            str = "JSONObject().toString()";
        } else {
            jSONObject = m39527e.toString();
            str = "params.toString()";
        }
        C9322n.m27780d(jSONObject, str);
        return jSONObject;
    }
}
