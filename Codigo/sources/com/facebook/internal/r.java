package com.facebook.internal;

import android.net.Uri;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: z */
    public static final a f7804z = new a(null);

    /* renamed from: a */
    private final boolean f7805a;

    /* renamed from: b */
    private final String f7806b;

    /* renamed from: c */
    private final boolean f7807c;

    /* renamed from: d */
    private final int f7808d;

    /* renamed from: e */
    private final EnumSet<i0> f7809e;

    /* renamed from: f */
    private final Map<String, Map<String, b>> f7810f;

    /* renamed from: g */
    private final boolean f7811g;

    /* renamed from: h */
    private final j f7812h;

    /* renamed from: i */
    private final String f7813i;

    /* renamed from: j */
    private final String f7814j;

    /* renamed from: k */
    private final boolean f7815k;

    /* renamed from: l */
    private final boolean f7816l;

    /* renamed from: m */
    private final JSONArray f7817m;

    /* renamed from: n */
    private final String f7818n;

    /* renamed from: o */
    private final boolean f7819o;

    /* renamed from: p */
    private final boolean f7820p;

    /* renamed from: q */
    private final String f7821q;

    /* renamed from: r */
    private final String f7822r;

    /* renamed from: s */
    private final String f7823s;

    /* renamed from: t */
    private final JSONArray f7824t;

    /* renamed from: u */
    private final JSONArray f7825u;

    /* renamed from: v */
    private final Map<String, Boolean> f7826v;

    /* renamed from: w */
    private final JSONArray f7827w;

    /* renamed from: x */
    private final JSONArray f7828x;

    /* renamed from: y */
    private final JSONArray f7829y;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: e */
        public static final a f7830e = new a(null);

        /* renamed from: a */
        private final String f7831a;

        /* renamed from: b */
        private final String f7832b;

        /* renamed from: c */
        private final Uri f7833c;

        /* renamed from: d */
        private final int[] f7834d;

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            private final int[] b(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                int length = jSONArray.length();
                int[] iArr = new int[length];
                if (length <= 0) {
                    return iArr;
                }
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    int i12 = -1;
                    int optInt = jSONArray.optInt(i10, -1);
                    if (optInt == -1) {
                        String versionString = jSONArray.optString(i10);
                        if (!n0.d0(versionString)) {
                            try {
                                kotlin.jvm.internal.n.d(versionString, "versionString");
                                i12 = Integer.parseInt(versionString);
                            } catch (NumberFormatException e10) {
                                n0.j0("FacebookSDK", e10);
                            }
                            optInt = i12;
                        }
                    }
                    iArr[i10] = optInt;
                    if (i11 >= length) {
                        return iArr;
                    }
                    i10 = i11;
                }
            }

            public final b a(JSONObject dialogConfigJSON) {
                List u02;
                Object G;
                Object O;
                kotlin.jvm.internal.n.e(dialogConfigJSON, "dialogConfigJSON");
                String dialogNameWithFeature = dialogConfigJSON.optString("name");
                if (n0.d0(dialogNameWithFeature)) {
                    return null;
                }
                kotlin.jvm.internal.n.d(dialogNameWithFeature, "dialogNameWithFeature");
                u02 = xk.q.u0(dialogNameWithFeature, new String[]{"|"}, false, 0, 6, null);
                if (u02.size() != 2) {
                    return null;
                }
                G = dk.z.G(u02);
                String str = (String) G;
                O = dk.z.O(u02);
                String str2 = (String) O;
                if (n0.d0(str) || n0.d0(str2)) {
                    return null;
                }
                String optString = dialogConfigJSON.optString("url");
                return new b(str, str2, n0.d0(optString) ? null : Uri.parse(optString), b(dialogConfigJSON.optJSONArray("versions")), null);
            }
        }

        private b(String str, String str2, Uri uri, int[] iArr) {
            this.f7831a = str;
            this.f7832b = str2;
            this.f7833c = uri;
            this.f7834d = iArr;
        }

        public /* synthetic */ b(String str, String str2, Uri uri, int[] iArr, kotlin.jvm.internal.g gVar) {
            this(str, str2, uri, iArr);
        }

        public final String a() {
            return this.f7831a;
        }

        public final String b() {
            return this.f7832b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(boolean z10, String nuxContent, boolean z11, int i10, EnumSet<i0> smartLoginOptions, Map<String, ? extends Map<String, b>> dialogConfigurations, boolean z12, j errorClassification, String smartLoginBookmarkIconURL, String smartLoginMenuIconURL, boolean z13, boolean z14, JSONArray jSONArray, String sdkUpdateMessage, boolean z15, boolean z16, String str, String str2, String str3, JSONArray jSONArray2, JSONArray jSONArray3, Map<String, Boolean> map, JSONArray jSONArray4, JSONArray jSONArray5, JSONArray jSONArray6) {
        kotlin.jvm.internal.n.e(nuxContent, "nuxContent");
        kotlin.jvm.internal.n.e(smartLoginOptions, "smartLoginOptions");
        kotlin.jvm.internal.n.e(dialogConfigurations, "dialogConfigurations");
        kotlin.jvm.internal.n.e(errorClassification, "errorClassification");
        kotlin.jvm.internal.n.e(smartLoginBookmarkIconURL, "smartLoginBookmarkIconURL");
        kotlin.jvm.internal.n.e(smartLoginMenuIconURL, "smartLoginMenuIconURL");
        kotlin.jvm.internal.n.e(sdkUpdateMessage, "sdkUpdateMessage");
        this.f7805a = z10;
        this.f7806b = nuxContent;
        this.f7807c = z11;
        this.f7808d = i10;
        this.f7809e = smartLoginOptions;
        this.f7810f = dialogConfigurations;
        this.f7811g = z12;
        this.f7812h = errorClassification;
        this.f7813i = smartLoginBookmarkIconURL;
        this.f7814j = smartLoginMenuIconURL;
        this.f7815k = z13;
        this.f7816l = z14;
        this.f7817m = jSONArray;
        this.f7818n = sdkUpdateMessage;
        this.f7819o = z15;
        this.f7820p = z16;
        this.f7821q = str;
        this.f7822r = str2;
        this.f7823s = str3;
        this.f7824t = jSONArray2;
        this.f7825u = jSONArray3;
        this.f7826v = map;
        this.f7827w = jSONArray4;
        this.f7828x = jSONArray5;
        this.f7829y = jSONArray6;
    }

    public final boolean a() {
        return this.f7811g;
    }

    public final JSONArray b() {
        return this.f7827w;
    }

    public final boolean c() {
        return this.f7816l;
    }

    public final j d() {
        return this.f7812h;
    }

    public final JSONArray e() {
        return this.f7817m;
    }

    public final boolean f() {
        return this.f7815k;
    }

    public final JSONArray g() {
        return this.f7825u;
    }

    public final JSONArray h() {
        return this.f7824t;
    }

    public final String i() {
        return this.f7821q;
    }

    public final JSONArray j() {
        return this.f7828x;
    }

    public final String k() {
        return this.f7823s;
    }

    public final String l() {
        return this.f7818n;
    }

    public final JSONArray m() {
        return this.f7829y;
    }

    public final int n() {
        return this.f7808d;
    }

    public final EnumSet<i0> o() {
        return this.f7809e;
    }

    public final String p() {
        return this.f7822r;
    }

    public final boolean q() {
        return this.f7805a;
    }
}
