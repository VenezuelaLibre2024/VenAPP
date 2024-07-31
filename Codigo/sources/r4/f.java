package r4;

import android.os.Bundle;
import android.text.TextUtils;
import ck.l;
import com.facebook.internal.n;
import com.facebook.internal.n0;
import dk.e0;
import dk.r;
import dk.s;
import i4.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q4.k;
import r4.f;
import xk.p;
import xk.q;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public static final f f24717a = new f();

    /* renamed from: b */
    private static final Map<String, b> f24718b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final List<String> f24719c;

    /* renamed from: d */
    private static final List<String> f24720d;

    /* loaded from: classes.dex */
    public enum a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* renamed from: r4.f$a$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0413a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f24721a;

            static {
                int[] iArr = new int[a.valuesCustom().length];
                iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                f24721a = iArr;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final String h() {
            int i10 = C0413a.f24721a[ordinal()];
            if (i10 == 1) {
                return "integrity_detect";
            }
            if (i10 == 2) {
                return "app_event_pred";
            }
            throw new l();
        }

        public final String i() {
            int i10 = C0413a.f24721a[ordinal()];
            if (i10 == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i10 == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new l();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: i */
        public static final a f24722i = new a(null);

        /* renamed from: a */
        private String f24723a;

        /* renamed from: b */
        private String f24724b;

        /* renamed from: c */
        private String f24725c;

        /* renamed from: d */
        private int f24726d;

        /* renamed from: e */
        private float[] f24727e;

        /* renamed from: f */
        private File f24728f;

        /* renamed from: g */
        private r4.b f24729g;

        /* renamed from: h */
        private Runnable f24730h;

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            private final void d(String str, int i10) {
                File[] listFiles;
                boolean E;
                boolean E2;
                File a10 = j.a();
                if (a10 == null || (listFiles = a10.listFiles()) == null) {
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
                    n.d(name, "name");
                    E = p.E(name, str, false, 2, null);
                    if (E) {
                        E2 = p.E(name, str2, false, 2, null);
                        if (!E2) {
                            file.delete();
                        }
                    }
                }
            }

            private final void e(String str, String str2, k.a aVar) {
                File file = new File(j.a(), str2);
                if (str == null || file.exists()) {
                    aVar.a(file);
                } else {
                    new k(str, file, aVar).execute(new String[0]);
                }
            }

            public static final void g(List slaves, File file) {
                n.e(slaves, "$slaves");
                n.e(file, "file");
                r4.b a10 = r4.b.f24703m.a(file);
                if (a10 != null) {
                    Iterator it = slaves.iterator();
                    while (it.hasNext()) {
                        b bVar = (b) it.next();
                        b.f24722i.e(bVar.e(), bVar.g() + '_' + bVar.h() + "_rule", new k.a() { // from class: r4.h

                            /* renamed from: b */
                            public final /* synthetic */ b f24734b;

                            public /* synthetic */ h(b a102) {
                                r2 = a102;
                            }

                            @Override // q4.k.a
                            public final void a(File file2) {
                                f.b.a.h(f.b.this, r2, file2);
                            }
                        });
                    }
                }
            }

            public static final void h(b slave, r4.b bVar, File file) {
                n.e(slave, "$slave");
                n.e(file, "file");
                slave.i(bVar);
                slave.k(file);
                Runnable runnable = slave.f24730h;
                if (runnable == null) {
                    return;
                }
                runnable.run();
            }

            public final b c(JSONObject jSONObject) {
                String useCase;
                String assetUri;
                String optString;
                int i10;
                float[] d10;
                if (jSONObject != null) {
                    try {
                        useCase = jSONObject.getString("use_case");
                        assetUri = jSONObject.getString("asset_uri");
                        optString = jSONObject.optString("rules_uri", null);
                        i10 = jSONObject.getInt("version_id");
                        d10 = f.d(f.f24717a, jSONObject.getJSONArray("thresholds"));
                        n.d(useCase, "useCase");
                        n.d(assetUri, "assetUri");
                    } catch (Exception unused) {
                        return null;
                    }
                }
                return new b(useCase, assetUri, optString, i10, d10);
            }

            public final void f(b master, List<b> slaves) {
                n.e(master, "master");
                n.e(slaves, "slaves");
                d(master.g(), master.h());
                e(master.b(), master.g() + '_' + master.h(), new k.a() { // from class: r4.g

                    /* renamed from: a */
                    public final /* synthetic */ List f24732a;

                    public /* synthetic */ g(List slaves2) {
                        r1 = slaves2;
                    }

                    @Override // q4.k.a
                    public final void a(File file) {
                        f.b.a.g(r1, file);
                    }
                });
            }
        }

        public b(String useCase, String assetUri, String str, int i10, float[] fArr) {
            n.e(useCase, "useCase");
            n.e(assetUri, "assetUri");
            this.f24723a = useCase;
            this.f24724b = assetUri;
            this.f24725c = str;
            this.f24726d = i10;
            this.f24727e = fArr;
        }

        public final String b() {
            return this.f24724b;
        }

        public final r4.b c() {
            return this.f24729g;
        }

        public final File d() {
            return this.f24728f;
        }

        public final String e() {
            return this.f24725c;
        }

        public final float[] f() {
            return this.f24727e;
        }

        public final String g() {
            return this.f24723a;
        }

        public final int h() {
            return this.f24726d;
        }

        public final void i(r4.b bVar) {
            this.f24729g = bVar;
        }

        public final b j(Runnable runnable) {
            this.f24730h = runnable;
            return this;
        }

        public final void k(File file) {
            this.f24728f = file;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24731a;

        static {
            int[] iArr = new int[a.valuesCustom().length];
            iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            f24731a = iArr;
        }
    }

    static {
        List<String> l10;
        List<String> l11;
        l10 = r.l("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");
        f24719c = l10;
        l11 = r.l("none", "address", "health");
        f24720d = l11;
    }

    private f() {
    }

    public static final /* synthetic */ float[] d(f fVar, JSONArray jSONArray) {
        if (a5.a.d(f.class)) {
            return null;
        }
        try {
            return fVar.o(jSONArray);
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
            return null;
        }
    }

    private final void e(JSONObject jSONObject) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    b c10 = b.f24722i.c(jSONObject.getJSONObject(keys.next()));
                    if (c10 != null) {
                        f24718b.put(c10.g(), c10);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public static final void f() {
        if (a5.a.d(f.class)) {
            return;
        }
        try {
            n0 n0Var = n0.f7780a;
            n0.C0(new Runnable() { // from class: r4.c
                @Override // java.lang.Runnable
                public final void run() {
                    f.g();
                }
            });
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b A[Catch: all -> 0x007b, Exception -> 0x007f, TryCatch #2 {Exception -> 0x007f, all -> 0x007b, blocks: (B:6:0x000d, B:8:0x001f, B:13:0x0029, B:14:0x0034, B:16:0x0044, B:18:0x004a, B:20:0x0072, B:23:0x0052, B:26:0x005b, B:27:0x002f), top: B:5:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g() {
        /*
            java.lang.String r0 = "model_request_timestamp"
            java.lang.String r1 = "models"
            java.lang.Class<r4.f> r2 = r4.f.class
            boolean r3 = a5.a.d(r2)
            if (r3 == 0) goto Ld
            return
        Ld:
            android.content.Context r3 = i4.e0.l()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
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
            com.facebook.internal.n r4 = com.facebook.internal.n.f7774a     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            com.facebook.internal.n$b r4 = com.facebook.internal.n.b.ModelRequest     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            boolean r4 = com.facebook.internal.n.g(r4)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            if (r4 == 0) goto L52
            int r4 = r5.length()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            if (r4 == 0) goto L52
            r4.f r4 = r4.f.f24717a     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            boolean r4 = r4.n(r6)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            if (r4 != 0) goto L72
        L52:
            r4.f r4 = r4.f.f24717a     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            org.json.JSONObject r5 = r4.k()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
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
            r4.f r0 = r4.f.f24717a     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            r0.e(r5)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            r0.h()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7f
            goto L7f
        L7b:
            r0 = move-exception
            a5.a.b(r0, r2)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.f.g():void");
    }

    private final void h() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String str = null;
            int i10 = 0;
            for (Map.Entry<String, b> entry : f24718b.entrySet()) {
                String key = entry.getKey();
                b value = entry.getValue();
                if (n.a(key, a.MTML_APP_EVENT_PREDICTION.i())) {
                    String b10 = value.b();
                    int max = Math.max(i10, value.h());
                    com.facebook.internal.n nVar = com.facebook.internal.n.f7774a;
                    if (com.facebook.internal.n.g(n.b.SuggestedEvents) && m()) {
                        arrayList.add(value.j(new Runnable() { // from class: r4.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                f.i();
                            }
                        }));
                    }
                    str = b10;
                    i10 = max;
                }
                if (kotlin.jvm.internal.n.a(key, a.MTML_INTEGRITY_DETECT.i())) {
                    str = value.b();
                    i10 = Math.max(i10, value.h());
                    com.facebook.internal.n nVar2 = com.facebook.internal.n.f7774a;
                    if (com.facebook.internal.n.g(n.b.IntelligentIntegrity)) {
                        arrayList.add(value.j(new Runnable() { // from class: r4.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                f.j();
                            }
                        }));
                    }
                }
            }
            if (str == null || i10 <= 0 || arrayList.isEmpty()) {
                return;
            }
            b.f24722i.f(new b("MTML", str, null, i10, null), arrayList);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public static final void i() {
        if (a5.a.d(f.class)) {
            return;
        }
        try {
            u4.e.b();
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
        }
    }

    public static final void j() {
        if (a5.a.d(f.class)) {
            return;
        }
        try {
            p4.b.a();
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
        }
    }

    private final JSONObject k() {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            i0 x10 = i0.f17005n.x(null, "app/model_asset", null);
            x10.H(bundle);
            JSONObject c10 = x10.k().c();
            if (c10 == null) {
                return null;
            }
            return p(c10);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    public static final File l(a task) {
        if (a5.a.d(f.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.n.e(task, "task");
            b bVar = f24718b.get(task.i());
            if (bVar == null) {
                return null;
            }
            return bVar.d();
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
            return null;
        }
    }

    private final boolean m() {
        boolean J;
        if (a5.a.d(this)) {
            return false;
        }
        try {
            Locale O = n0.O();
            if (O != null) {
                String language = O.getLanguage();
                kotlin.jvm.internal.n.d(language, "locale.language");
                J = q.J(language, "en", false, 2, null);
                if (!J) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return false;
        }
    }

    private final boolean n(long j10) {
        if (a5.a.d(this) || j10 == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - j10 < 259200000;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return false;
        }
    }

    private final float[] o(JSONArray jSONArray) {
        if (a5.a.d(this) || jSONArray == null) {
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
                        kotlin.jvm.internal.n.d(string, "jsonArray.getString(i)");
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
            a5.a.b(th2, this);
            return null;
        }
    }

    private final JSONObject p(JSONObject jSONObject) {
        if (a5.a.d(this)) {
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
            a5.a.b(th2, this);
            return null;
        }
    }

    public static final String[] q(a task, float[][] denses, String[] texts) {
        if (a5.a.d(f.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.n.e(task, "task");
            kotlin.jvm.internal.n.e(denses, "denses");
            kotlin.jvm.internal.n.e(texts, "texts");
            b bVar = f24718b.get(task.i());
            r4.b c10 = bVar == null ? null : bVar.c();
            if (c10 == null) {
                return null;
            }
            float[] f10 = bVar.f();
            int length = texts.length;
            int length2 = denses[0].length;
            r4.a aVar = new r4.a(new int[]{length, length2});
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    System.arraycopy(denses[i10], 0, aVar.a(), i10 * length2, length2);
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            r4.a b10 = c10.b(aVar, texts, task.h());
            if (b10 != null && f10 != null) {
                if (!(b10.a().length == 0)) {
                    if (!(f10.length == 0)) {
                        int i12 = c.f24731a[task.ordinal()];
                        if (i12 == 1) {
                            return f24717a.s(b10, f10);
                        }
                        if (i12 == 2) {
                            return f24717a.r(b10, f10);
                        }
                        throw new l();
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
            return null;
        }
    }

    private final String[] r(r4.a aVar, float[] fArr) {
        uk.f k10;
        int r10;
        if (a5.a.d(this)) {
            return null;
        }
        try {
            int b10 = aVar.b(0);
            int b11 = aVar.b(1);
            float[] a10 = aVar.a();
            if (b11 != fArr.length) {
                return null;
            }
            k10 = uk.l.k(0, b10);
            r10 = s.r(k10, 10);
            ArrayList arrayList = new ArrayList(r10);
            Iterator<Integer> it = k10.iterator();
            while (it.hasNext()) {
                int nextInt = ((e0) it).nextInt();
                String str = "none";
                int length = fArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    if (a10[(nextInt * b11) + i11] >= fArr[i10]) {
                        str = f24720d.get(i11);
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
            a5.a.b(th2, this);
            return null;
        }
    }

    private final String[] s(r4.a aVar, float[] fArr) {
        uk.f k10;
        int r10;
        if (a5.a.d(this)) {
            return null;
        }
        try {
            int b10 = aVar.b(0);
            int b11 = aVar.b(1);
            float[] a10 = aVar.a();
            if (b11 != fArr.length) {
                return null;
            }
            k10 = uk.l.k(0, b10);
            r10 = s.r(k10, 10);
            ArrayList arrayList = new ArrayList(r10);
            Iterator<Integer> it = k10.iterator();
            while (it.hasNext()) {
                int nextInt = ((e0) it).nextInt();
                String str = "other";
                int length = fArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    if (a10[(nextInt * b11) + i11] >= fArr[i10]) {
                        str = f24719c.get(i11);
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
            a5.a.b(th2, this);
            return null;
        }
    }
}
