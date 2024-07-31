package x4;

import android.os.Build;
import com.facebook.ads.AdError;
import com.facebook.internal.n0;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.util.Arrays;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xk.p;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static final b f30386h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private String f30387a;

    /* renamed from: b, reason: collision with root package name */
    private EnumC0496c f30388b;

    /* renamed from: c, reason: collision with root package name */
    private JSONArray f30389c;

    /* renamed from: d, reason: collision with root package name */
    private String f30390d;

    /* renamed from: e, reason: collision with root package name */
    private String f30391e;

    /* renamed from: f, reason: collision with root package name */
    private String f30392f;

    /* renamed from: g, reason: collision with root package name */
    private Long f30393g;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30394a = new a();

        private a() {
        }

        public static final c a(String str, String str2) {
            return new c(str, str2, (kotlin.jvm.internal.g) null);
        }

        public static final c b(Throwable th2, EnumC0496c t10) {
            n.e(t10, "t");
            return new c(th2, t10, (kotlin.jvm.internal.g) null);
        }

        public static final c c(JSONArray features) {
            n.e(features, "features");
            return new c(features, (kotlin.jvm.internal.g) null);
        }

        public static final c d(File file) {
            n.e(file, "file");
            return new c(file, (kotlin.jvm.internal.g) null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EnumC0496c b(String str) {
            boolean E;
            boolean E2;
            boolean E3;
            boolean E4;
            boolean E5;
            E = p.E(str, "crash_log_", false, 2, null);
            if (E) {
                return EnumC0496c.CrashReport;
            }
            E2 = p.E(str, "shield_log_", false, 2, null);
            if (E2) {
                return EnumC0496c.CrashShield;
            }
            E3 = p.E(str, "thread_check_log_", false, 2, null);
            if (E3) {
                return EnumC0496c.ThreadCheck;
            }
            E4 = p.E(str, "analysis_log_", false, 2, null);
            if (E4) {
                return EnumC0496c.Analysis;
            }
            E5 = p.E(str, "anr_log_", false, 2, null);
            return E5 ? EnumC0496c.AnrReport : EnumC0496c.Unknown;
        }
    }

    /* renamed from: x4.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0496c {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* renamed from: x4.c$c$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f30395a;

            static {
                int[] iArr = new int[EnumC0496c.valuesCustom().length];
                iArr[EnumC0496c.Analysis.ordinal()] = 1;
                iArr[EnumC0496c.AnrReport.ordinal()] = 2;
                iArr[EnumC0496c.CrashReport.ordinal()] = 3;
                iArr[EnumC0496c.CrashShield.ordinal()] = 4;
                iArr[EnumC0496c.ThreadCheck.ordinal()] = 5;
                f30395a = iArr;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0496c[] valuesCustom() {
            EnumC0496c[] valuesCustom = values();
            return (EnumC0496c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final String h() {
            int i10 = a.f30395a[ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f30395a[ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30396a;

        static {
            int[] iArr = new int[EnumC0496c.valuesCustom().length];
            iArr[EnumC0496c.Analysis.ordinal()] = 1;
            iArr[EnumC0496c.AnrReport.ordinal()] = 2;
            iArr[EnumC0496c.CrashReport.ordinal()] = 3;
            iArr[EnumC0496c.CrashShield.ordinal()] = 4;
            iArr[EnumC0496c.ThreadCheck.ordinal()] = 5;
            f30396a = iArr;
        }
    }

    private c(File file) {
        String name = file.getName();
        n.d(name, "file.name");
        this.f30387a = name;
        this.f30388b = f30386h.b(name);
        k kVar = k.f30398a;
        JSONObject r10 = k.r(this.f30387a, true);
        if (r10 != null) {
            this.f30393g = Long.valueOf(r10.optLong(Constants.TIMESTAMP, 0L));
            this.f30390d = r10.optString("app_version", null);
            this.f30391e = r10.optString(Constants.REASON, null);
            this.f30392f = r10.optString("callstack", null);
            this.f30389c = r10.optJSONArray("feature_names");
        }
    }

    public /* synthetic */ c(File file, kotlin.jvm.internal.g gVar) {
        this(file);
    }

    private c(String str, String str2) {
        this.f30388b = EnumC0496c.AnrReport;
        this.f30390d = n0.w();
        this.f30391e = str;
        this.f30392f = str2;
        this.f30393g = Long.valueOf(System.currentTimeMillis() / AdError.NETWORK_ERROR_CODE);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anr_log_");
        stringBuffer.append(String.valueOf(this.f30393g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        n.d(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f30387a = stringBuffer2;
    }

    public /* synthetic */ c(String str, String str2, kotlin.jvm.internal.g gVar) {
        this(str, str2);
    }

    private c(Throwable th2, EnumC0496c enumC0496c) {
        this.f30388b = enumC0496c;
        this.f30390d = n0.w();
        this.f30391e = k.e(th2);
        this.f30392f = k.h(th2);
        this.f30393g = Long.valueOf(System.currentTimeMillis() / AdError.NETWORK_ERROR_CODE);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(enumC0496c.h());
        stringBuffer.append(String.valueOf(this.f30393g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        n.d(stringBuffer2, "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()");
        this.f30387a = stringBuffer2;
    }

    public /* synthetic */ c(Throwable th2, EnumC0496c enumC0496c, kotlin.jvm.internal.g gVar) {
        this(th2, enumC0496c);
    }

    private c(JSONArray jSONArray) {
        this.f30388b = EnumC0496c.Analysis;
        this.f30393g = Long.valueOf(System.currentTimeMillis() / AdError.NETWORK_ERROR_CODE);
        this.f30389c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(String.valueOf(this.f30393g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        n.d(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f30387a = stringBuffer2;
    }

    public /* synthetic */ c(JSONArray jSONArray, kotlin.jvm.internal.g gVar) {
        this(jSONArray);
    }

    private final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.f30389c;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l10 = this.f30393g;
            if (l10 != null) {
                jSONObject.put(Constants.TIMESTAMP, l10);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.f30390d;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l10 = this.f30393g;
            if (l10 != null) {
                jSONObject.put(Constants.TIMESTAMP, l10);
            }
            String str2 = this.f30391e;
            if (str2 != null) {
                jSONObject.put(Constants.REASON, str2);
            }
            String str3 = this.f30392f;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            EnumC0496c enumC0496c = this.f30388b;
            if (enumC0496c != null) {
                jSONObject.put("type", enumC0496c);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject e() {
        EnumC0496c enumC0496c = this.f30388b;
        int i10 = enumC0496c == null ? -1 : d.f30396a[enumC0496c.ordinal()];
        if (i10 == 1) {
            return c();
        }
        if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
            return d();
        }
        return null;
    }

    public final void a() {
        k kVar = k.f30398a;
        k.d(this.f30387a);
    }

    public final int b(c data) {
        n.e(data, "data");
        Long l10 = this.f30393g;
        if (l10 == null) {
            return -1;
        }
        long longValue = l10.longValue();
        Long l11 = data.f30393g;
        if (l11 == null) {
            return 1;
        }
        return n.g(l11.longValue(), longValue);
    }

    public final boolean f() {
        EnumC0496c enumC0496c = this.f30388b;
        int i10 = enumC0496c == null ? -1 : d.f30396a[enumC0496c.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 != 3 && i10 != 4 && i10 != 5) || this.f30392f == null || this.f30393g == null) {
                    return false;
                }
            } else if (this.f30392f == null || this.f30391e == null || this.f30393g == null) {
                return false;
            }
        } else if (this.f30389c == null || this.f30393g == null) {
            return false;
        }
        return true;
    }

    public final void g() {
        if (f()) {
            k kVar = k.f30398a;
            k.t(this.f30387a, toString());
        }
    }

    public String toString() {
        String jSONObject;
        String str;
        JSONObject e10 = e();
        if (e10 == null) {
            jSONObject = new JSONObject().toString();
            str = "JSONObject().toString()";
        } else {
            jSONObject = e10.toString();
            str = "params.toString()";
        }
        n.d(jSONObject, str);
        return jSONObject;
    }
}
