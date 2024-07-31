package p325r4;

import android.os.Bundle;
import android.text.TextUtils;
import ck.C2027l;
import com.facebook.internal.C4633n;
import com.facebook.internal.C4634n0;
import dk.AbstractC7006e0;
import dk.C7031r;
import dk.C7033s;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007a5.C0033a;
import p152i4.C7807i0;
import p287p4.C10055b;
import p303q4.AsyncTaskC10271k;
import p325r4.C10618f;
import p374u4.C11320e;
import p450xk.C12524p;
import p450xk.C12525q;
import uk.C11579f;
import uk.C11585l;

/* renamed from: r4.f */
/* loaded from: classes.dex */
public final class C10618f {

    /* renamed from: a */
    public static final C10618f f26831a = new C10618f();

    /* renamed from: b */
    private static final Map<String, b> f26832b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final List<String> f26833c;

    /* renamed from: d */
    private static final List<String> f26834d;

    /* renamed from: r4.f$a */
    /* loaded from: classes.dex */
    public enum a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* renamed from: r4.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C13245a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f26835a;

            static {
                int[] iArr = new int[a.valuesCustom().length];
                iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                f26835a = iArr;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        /* renamed from: h */
        public final String m32341h() {
            int i10 = C13245a.f26835a[ordinal()];
            if (i10 == 1) {
                return "integrity_detect";
            }
            if (i10 == 2) {
                return "app_event_pred";
            }
            throw new C2027l();
        }

        /* renamed from: i */
        public final String m32342i() {
            int i10 = C13245a.f26835a[ordinal()];
            if (i10 == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i10 == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new C2027l();
        }
    }

    /* renamed from: r4.f$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: i */
        public static final a f26836i = new a(null);

        /* renamed from: a */
        private String f26837a;

        /* renamed from: b */
        private String f26838b;

        /* renamed from: c */
        private String f26839c;

        /* renamed from: d */
        private int f26840d;

        /* renamed from: e */
        private float[] f26841e;

        /* renamed from: f */
        private File f26842f;

        /* renamed from: g */
        private C10614b f26843g;

        /* renamed from: h */
        private Runnable f26844h;

        /* renamed from: r4.f$b$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9315g c9315g) {
                this();
            }

            /* renamed from: d */
            private final void m32356d(String str, int i10) {
                File[] listFiles;
                boolean m41031E;
                boolean m41031E2;
                File m32374a = C10622j.m32374a();
                if (m32374a == null || (listFiles = m32374a.listFiles()) == null) {
                    return;
                }
                if (listFiles.length == 0) {
                    return;
                }
                String str2 = str + '_' + i10;
                int length = listFiles.length;
                int i11 = 0;
                while (i11 < length) {
                    File file = listFiles[i11];
                    i11++;
                    String name = file.getName();
                    C9322n.m27780d(name, "name");
                    m41031E = C12524p.m41031E(name, str, false, 2, null);
                    if (m41031E) {
                        m41031E2 = C12524p.m41031E(name, str2, false, 2, null);
                        if (!m41031E2) {
                            file.delete();
                        }
                    }
                }
            }

            /* renamed from: e */
            private final void m32357e(String str, String str2, AsyncTaskC10271k.a aVar) {
                File file = new File(C10622j.m32374a(), str2);
                if (str == null || file.exists()) {
                    aVar.mo30765a(file);
                } else {
                    new AsyncTaskC10271k(str, file, aVar).execute(new String[0]);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: g */
            public static final void m32358g(List slaves, File file) {
                C9322n.m27781e(slaves, "$slaves");
                C9322n.m27781e(file, "file");
                final C10614b m32320a = C10614b.f26817m.m32320a(file);
                if (m32320a != null) {
                    Iterator it = slaves.iterator();
                    while (it.hasNext()) {
                        final b bVar = (b) it.next();
                        b.f26836i.m32357e(bVar.m32347e(), bVar.m32349g() + '_' + bVar.m32350h() + "_rule", new AsyncTaskC10271k.a() { // from class: r4.h
                            @Override // p303q4.AsyncTaskC10271k.a
                            /* renamed from: a */
                            public final void mo30765a(File file2) {
                                C10618f.b.a.m32359h(C10618f.b.this, m32320a, file2);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: h */
            public static final void m32359h(b slave, C10614b c10614b, File file) {
                C9322n.m27781e(slave, "$slave");
                C9322n.m27781e(file, "file");
                slave.m32351i(c10614b);
                slave.m32353k(file);
                Runnable runnable = slave.f26844h;
                if (runnable == null) {
                    return;
                }
                runnable.run();
            }

            /* renamed from: c */
            public final b m32360c(JSONObject jSONObject) {
                String useCase;
                String assetUri;
                String optString;
                int i10;
                float[] m32324d;
                if (jSONObject != null) {
                    try {
                        useCase = jSONObject.getString("use_case");
                        assetUri = jSONObject.getString("asset_uri");
                        optString = jSONObject.optString("rules_uri", null);
                        i10 = jSONObject.getInt("version_id");
                        m32324d = C10618f.m32324d(C10618f.f26831a, jSONObject.getJSONArray("thresholds"));
                        C9322n.m27780d(useCase, "useCase");
                        C9322n.m27780d(assetUri, "assetUri");
                    } catch (Exception unused) {
                        return null;
                    }
                }
                return new b(useCase, assetUri, optString, i10, m32324d);
            }

            /* renamed from: f */
            public final void m32361f(b master, final List<b> slaves) {
                C9322n.m27781e(master, "master");
                C9322n.m27781e(slaves, "slaves");
                m32356d(master.m32349g(), master.m32350h());
                m32357e(master.m32344b(), master.m32349g() + '_' + master.m32350h(), new AsyncTaskC10271k.a() { // from class: r4.g
                    @Override // p303q4.AsyncTaskC10271k.a
                    /* renamed from: a */
                    public final void mo30765a(File file) {
                        C10618f.b.a.m32358g(slaves, file);
                    }
                });
            }
        }

        public b(String useCase, String assetUri, String str, int i10, float[] fArr) {
            C9322n.m27781e(useCase, "useCase");
            C9322n.m27781e(assetUri, "assetUri");
            this.f26837a = useCase;
            this.f26838b = assetUri;
            this.f26839c = str;
            this.f26840d = i10;
            this.f26841e = fArr;
        }

        /* renamed from: b */
        public final String m32344b() {
            return this.f26838b;
        }

        /* renamed from: c */
        public final C10614b m32345c() {
            return this.f26843g;
        }

        /* renamed from: d */
        public final File m32346d() {
            return this.f26842f;
        }

        /* renamed from: e */
        public final String m32347e() {
            return this.f26839c;
        }

        /* renamed from: f */
        public final float[] m32348f() {
            return this.f26841e;
        }

        /* renamed from: g */
        public final String m32349g() {
            return this.f26837a;
        }

        /* renamed from: h */
        public final int m32350h() {
            return this.f26840d;
        }

        /* renamed from: i */
        public final void m32351i(C10614b c10614b) {
            this.f26843g = c10614b;
        }

        /* renamed from: j */
        public final b m32352j(Runnable runnable) {
            this.f26844h = runnable;
            return this;
        }

        /* renamed from: k */
        public final void m32353k(File file) {
            this.f26842f = file;
        }
    }

    /* renamed from: r4.f$c */
    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26845a;

        static {
            int[] iArr = new int[a.valuesCustom().length];
            iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            f26845a = iArr;
        }
    }

    static {
        List<String> m20584l;
        List<String> m20584l2;
        m20584l = C7031r.m20584l("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");
        f26833c = m20584l;
        m20584l2 = C7031r.m20584l("none", "address", "health");
        f26834d = m20584l2;
    }

    private C10618f() {
    }

    /* renamed from: d */
    public static final /* synthetic */ float[] m32324d(C10618f c10618f, JSONArray jSONArray) {
        if (C0033a.m107d(C10618f.class)) {
            return null;
        }
        try {
            return c10618f.m32335o(jSONArray);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10618f.class);
            return null;
        }
    }

    /* renamed from: e */
    private final void m32325e(JSONObject jSONObject) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    b m32360c = b.f26836i.m32360c(jSONObject.getJSONObject(keys.next()));
                    if (m32360c != null) {
                        f26832b.put(m32360c.m32349g(), m32360c);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: f */
    public static final void m32326f() {
        if (C0033a.m107d(C10618f.class)) {
            return;
        }
        try {
            C4634n0 c4634n0 = C4634n0.f8760a;
            C4634n0.m11266C0(new Runnable() { // from class: r4.c
                @Override // java.lang.Runnable
                public final void run() {
                    C10618f.m32327g();
                }
            });
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10618f.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b A[Catch: all -> 0x007b, Exception -> 0x007f, TryCatch #2 {Exception -> 0x007f, all -> 0x007b, blocks: (B:6:0x000d, B:8:0x001f, B:13:0x0029, B:14:0x0034, B:16:0x0044, B:18:0x004a, B:20:0x0072, B:23:0x0052, B:26:0x005b, B:27:0x002f), top: B:5:0x000d }] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m32327g() {
        /*
            java.lang.String r0 = "model_request_timestamp"
            java.lang.String r1 = "models"
            java.lang.Class<r4.f> r2 = p325r4.C10618f.class
            boolean r3 = p007a5.C0033a.m107d(r2)
            if (r3 == 0) goto Ld
            return
        Ld:
            android.content.Context r3 = p152i4.C7799e0.m23860l()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            java.lang.String r4 = "com.facebook.internal.MODEL_STORE"
            r5 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r5)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            r4 = 0
            java.lang.String r4 = r3.getString(r1, r4)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            if (r4 == 0) goto L2f
            int r6 = r4.length()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            if (r6 != 0) goto L26
            r5 = 1
        L26:
            if (r5 == 0) goto L29
            goto L2f
        L29:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            goto L34
        L2f:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            r5.<init>()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
        L34:
            r6 = 0
            long r6 = r3.getLong(r0, r6)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            com.facebook.internal.n r4 = com.facebook.internal.C4633n.f8754a     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            com.facebook.internal.n$b r4 = com.facebook.internal.C4633n.b.ModelRequest     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            boolean r4 = com.facebook.internal.C4633n.m11254g(r4)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            if (r4 == 0) goto L52
            int r4 = r5.length()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            if (r4 == 0) goto L52
            r4.f r4 = p325r4.C10618f.f26831a     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            boolean r4 = r4.m32334n(r6)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            if (r4 != 0) goto L72
        L52:
            r4.f r4 = p325r4.C10618f.f26831a     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            org.json.JSONObject r5 = r4.m32331k()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            if (r5 != 0) goto L5b
            return
        L5b:
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            android.content.SharedPreferences$Editor r1 = r3.putString(r1, r4)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r3)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            r0.apply()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
        L72:
            r4.f r0 = p325r4.C10618f.f26831a     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            r0.m32325e(r5)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            r0.m32328h()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            goto L7f
        L7b:
            r0 = move-exception
            p007a5.C0033a.m105b(r0, r2)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p325r4.C10618f.m32327g():void");
    }

    /* renamed from: h */
    private final void m32328h() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String str = null;
            int i10 = 0;
            for (Map.Entry<String, b> entry : f26832b.entrySet()) {
                String key = entry.getKey();
                b value = entry.getValue();
                if (C9322n.m27777a(key, a.MTML_APP_EVENT_PREDICTION.m32342i())) {
                    String m32344b = value.m32344b();
                    int max = Math.max(i10, value.m32350h());
                    C4633n c4633n = C4633n.f8754a;
                    if (C4633n.m11254g(C4633n.b.SuggestedEvents) && m32333m()) {
                        arrayList.add(value.m32352j(new Runnable() { // from class: r4.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                C10618f.m32329i();
                            }
                        }));
                    }
                    str = m32344b;
                    i10 = max;
                }
                if (C9322n.m27777a(key, a.MTML_INTEGRITY_DETECT.m32342i())) {
                    str = value.m32344b();
                    i10 = Math.max(i10, value.m32350h());
                    C4633n c4633n2 = C4633n.f8754a;
                    if (C4633n.m11254g(C4633n.b.IntelligentIntegrity)) {
                        arrayList.add(value.m32352j(new Runnable() { // from class: r4.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                C10618f.m32330j();
                            }
                        }));
                    }
                }
            }
            if (str == null || i10 <= 0 || arrayList.isEmpty()) {
                return;
            }
            b.f26836i.m32361f(new b("MTML", str, null, i10, null), arrayList);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m32329i() {
        if (C0033a.m107d(C10618f.class)) {
            return;
        }
        try {
            C11320e.m35383b();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10618f.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m32330j() {
        if (C0033a.m107d(C10618f.class)) {
            return;
        }
        try {
            C10055b.m29976a();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10618f.class);
        }
    }

    /* renamed from: k */
    private final JSONObject m32331k() {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            C7807i0 m24001x = C7807i0.f18658n.m24001x(null, "app/model_asset", null);
            m24001x.m23947H(bundle);
            JSONObject m24062c = m24001x.m23949k().m24062c();
            if (m24062c == null) {
                return null;
            }
            return m32336p(m24062c);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: l */
    public static final File m32332l(a task) {
        if (C0033a.m107d(C10618f.class)) {
            return null;
        }
        try {
            C9322n.m27781e(task, "task");
            b bVar = f26832b.get(task.m32342i());
            if (bVar == null) {
                return null;
            }
            return bVar.m32346d();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10618f.class);
            return null;
        }
    }

    /* renamed from: m */
    private final boolean m32333m() {
        boolean m41059J;
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            Locale m11282O = C4634n0.m11282O();
            if (m11282O != null) {
                String language = m11282O.getLanguage();
                C9322n.m27780d(language, "locale.language");
                m41059J = C12525q.m41059J(language, "en", false, 2, null);
                if (!m41059J) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }

    /* renamed from: n */
    private final boolean m32334n(long j10) {
        if (C0033a.m107d(this) || j10 == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - j10 < 259200000;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }

    /* renamed from: o */
    private final float[] m32335o(JSONArray jSONArray) {
        if (C0033a.m107d(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    try {
                        String string = jSONArray.getString(i10);
                        C9322n.m27780d(string, "jsonArray.getString(i)");
                        fArr[i10] = Float.parseFloat(string);
                    } catch (JSONException unused) {
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return fArr;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: p */
    private final JSONObject m32336p(JSONObject jSONObject) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                if (length <= 0) {
                    return jSONObject2;
                }
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                    if (i11 >= length) {
                        return jSONObject2;
                    }
                    i10 = i11;
                }
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: q */
    public static final String[] m32337q(a task, float[][] denses, String[] texts) {
        if (C0033a.m107d(C10618f.class)) {
            return null;
        }
        try {
            C9322n.m27781e(task, "task");
            C9322n.m27781e(denses, "denses");
            C9322n.m27781e(texts, "texts");
            b bVar = f26832b.get(task.m32342i());
            C10614b m32345c = bVar == null ? null : bVar.m32345c();
            if (m32345c == null) {
                return null;
            }
            float[] m32348f = bVar.m32348f();
            int length = texts.length;
            int length2 = denses[0].length;
            C10613a c10613a = new C10613a(new int[]{length, length2});
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    System.arraycopy(denses[i10], 0, c10613a.m32311a(), i10 * length2, length2);
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            C10613a m32318b = m32345c.m32318b(c10613a, texts, task.m32341h());
            if (m32318b != null && m32348f != null) {
                if (!(m32318b.m32311a().length == 0)) {
                    if (!(m32348f.length == 0)) {
                        int i12 = c.f26845a[task.ordinal()];
                        if (i12 == 1) {
                            return f26831a.m32339s(m32318b, m32348f);
                        }
                        if (i12 == 2) {
                            return f26831a.m32338r(m32318b, m32348f);
                        }
                        throw new C2027l();
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10618f.class);
            return null;
        }
    }

    /* renamed from: r */
    private final String[] m32338r(C10613a c10613a, float[] fArr) {
        C11579f m36302k;
        int m20590r;
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            int m32312b = c10613a.m32312b(0);
            int m32312b2 = c10613a.m32312b(1);
            float[] m32311a = c10613a.m32311a();
            if (m32312b2 != fArr.length) {
                return null;
            }
            m36302k = C11585l.m36302k(0, m32312b);
            m20590r = C7033s.m20590r(m36302k, 10);
            ArrayList arrayList = new ArrayList(m20590r);
            Iterator<Integer> it = m36302k.iterator();
            while (it.hasNext()) {
                int nextInt = ((AbstractC7006e0) it).nextInt();
                String str = "none";
                int length = fArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    if (m32311a[(nextInt * m32312b2) + i11] >= fArr[i10]) {
                        str = f26834d.get(i11);
                    }
                    i10++;
                    i11 = i12;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: s */
    private final String[] m32339s(C10613a c10613a, float[] fArr) {
        C11579f m36302k;
        int m20590r;
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            int m32312b = c10613a.m32312b(0);
            int m32312b2 = c10613a.m32312b(1);
            float[] m32311a = c10613a.m32311a();
            if (m32312b2 != fArr.length) {
                return null;
            }
            m36302k = C11585l.m36302k(0, m32312b);
            m20590r = C7033s.m20590r(m36302k, 10);
            ArrayList arrayList = new ArrayList(m20590r);
            Iterator<Integer> it = m36302k.iterator();
            while (it.hasNext()) {
                int nextInt = ((AbstractC7006e0) it).nextInt();
                String str = "other";
                int length = fArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    if (m32311a[(nextInt * m32312b2) + i11] >= fArr[i10]) {
                        str = f26833c.get(i11);
                    }
                    i10++;
                    i11 = i12;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }
}
