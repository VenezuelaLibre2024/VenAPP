package com.facebook.internal;

import android.net.Uri;
import dk.C7042z;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONObject;
import p450xk.C12525q;

/* renamed from: com.facebook.internal.r */
/* loaded from: classes.dex */
public final class C4641r {

    /* renamed from: z */
    public static final a f8784z = new a(null);

    /* renamed from: a */
    private final boolean f8785a;

    /* renamed from: b */
    private final String f8786b;

    /* renamed from: c */
    private final boolean f8787c;

    /* renamed from: d */
    private final int f8788d;

    /* renamed from: e */
    private final EnumSet<EnumC4624i0> f8789e;

    /* renamed from: f */
    private final Map<String, Map<String, b>> f8790f;

    /* renamed from: g */
    private final boolean f8791g;

    /* renamed from: h */
    private final C4625j f8792h;

    /* renamed from: i */
    private final String f8793i;

    /* renamed from: j */
    private final String f8794j;

    /* renamed from: k */
    private final boolean f8795k;

    /* renamed from: l */
    private final boolean f8796l;

    /* renamed from: m */
    private final JSONArray f8797m;

    /* renamed from: n */
    private final String f8798n;

    /* renamed from: o */
    private final boolean f8799o;

    /* renamed from: p */
    private final boolean f8800p;

    /* renamed from: q */
    private final String f8801q;

    /* renamed from: r */
    private final String f8802r;

    /* renamed from: s */
    private final String f8803s;

    /* renamed from: t */
    private final JSONArray f8804t;

    /* renamed from: u */
    private final JSONArray f8805u;

    /* renamed from: v */
    private final Map<String, Boolean> f8806v;

    /* renamed from: w */
    private final JSONArray f8807w;

    /* renamed from: x */
    private final JSONArray f8808x;

    /* renamed from: y */
    private final JSONArray f8809y;

    /* renamed from: com.facebook.internal.r$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: com.facebook.internal.r$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: e */
        public static final a f8810e = new a(null);

        /* renamed from: a */
        private final String f8811a;

        /* renamed from: b */
        private final String f8812b;

        /* renamed from: c */
        private final Uri f8813c;

        /* renamed from: d */
        private final int[] f8814d;

        /* renamed from: com.facebook.internal.r$b$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9315g c9315g) {
                this();
            }

            /* renamed from: b */
            private final int[] m11394b(JSONArray jSONArray) {
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
                        if (!C4634n0.m11300d0(versionString)) {
                            try {
                                C9322n.m27780d(versionString, "versionString");
                                i12 = Integer.parseInt(versionString);
                            } catch (NumberFormatException e10) {
                                C4634n0.m11312j0("FacebookSDK", e10);
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

            /* renamed from: a */
            public final b m11395a(JSONObject dialogConfigJSON) {
                List m41098u0;
                Object m20605G;
                Object m20613O;
                C9322n.m27781e(dialogConfigJSON, "dialogConfigJSON");
                String dialogNameWithFeature = dialogConfigJSON.optString("name");
                if (C4634n0.m11300d0(dialogNameWithFeature)) {
                    return null;
                }
                C9322n.m27780d(dialogNameWithFeature, "dialogNameWithFeature");
                m41098u0 = C12525q.m41098u0(dialogNameWithFeature, new String[]{"|"}, false, 0, 6, null);
                if (m41098u0.size() != 2) {
                    return null;
                }
                m20605G = C7042z.m20605G(m41098u0);
                String str = (String) m20605G;
                m20613O = C7042z.m20613O(m41098u0);
                String str2 = (String) m20613O;
                if (C4634n0.m11300d0(str) || C4634n0.m11300d0(str2)) {
                    return null;
                }
                String optString = dialogConfigJSON.optString("url");
                return new b(str, str2, C4634n0.m11300d0(optString) ? null : Uri.parse(optString), m11394b(dialogConfigJSON.optJSONArray("versions")), null);
            }
        }

        private b(String str, String str2, Uri uri, int[] iArr) {
            this.f8811a = str;
            this.f8812b = str2;
            this.f8813c = uri;
            this.f8814d = iArr;
        }

        public /* synthetic */ b(String str, String str2, Uri uri, int[] iArr, C9315g c9315g) {
            this(str, str2, uri, iArr);
        }

        /* renamed from: a */
        public final String m11392a() {
            return this.f8811a;
        }

        /* renamed from: b */
        public final String m11393b() {
            return this.f8812b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4641r(boolean z10, String nuxContent, boolean z11, int i10, EnumSet<EnumC4624i0> smartLoginOptions, Map<String, ? extends Map<String, b>> dialogConfigurations, boolean z12, C4625j errorClassification, String smartLoginBookmarkIconURL, String smartLoginMenuIconURL, boolean z13, boolean z14, JSONArray jSONArray, String sdkUpdateMessage, boolean z15, boolean z16, String str, String str2, String str3, JSONArray jSONArray2, JSONArray jSONArray3, Map<String, Boolean> map, JSONArray jSONArray4, JSONArray jSONArray5, JSONArray jSONArray6) {
        C9322n.m27781e(nuxContent, "nuxContent");
        C9322n.m27781e(smartLoginOptions, "smartLoginOptions");
        C9322n.m27781e(dialogConfigurations, "dialogConfigurations");
        C9322n.m27781e(errorClassification, "errorClassification");
        C9322n.m27781e(smartLoginBookmarkIconURL, "smartLoginBookmarkIconURL");
        C9322n.m27781e(smartLoginMenuIconURL, "smartLoginMenuIconURL");
        C9322n.m27781e(sdkUpdateMessage, "sdkUpdateMessage");
        this.f8785a = z10;
        this.f8786b = nuxContent;
        this.f8787c = z11;
        this.f8788d = i10;
        this.f8789e = smartLoginOptions;
        this.f8790f = dialogConfigurations;
        this.f8791g = z12;
        this.f8792h = errorClassification;
        this.f8793i = smartLoginBookmarkIconURL;
        this.f8794j = smartLoginMenuIconURL;
        this.f8795k = z13;
        this.f8796l = z14;
        this.f8797m = jSONArray;
        this.f8798n = sdkUpdateMessage;
        this.f8799o = z15;
        this.f8800p = z16;
        this.f8801q = str;
        this.f8802r = str2;
        this.f8803s = str3;
        this.f8804t = jSONArray2;
        this.f8805u = jSONArray3;
        this.f8806v = map;
        this.f8807w = jSONArray4;
        this.f8808x = jSONArray5;
        this.f8809y = jSONArray6;
    }

    /* renamed from: a */
    public final boolean m11375a() {
        return this.f8791g;
    }

    /* renamed from: b */
    public final JSONArray m11376b() {
        return this.f8807w;
    }

    /* renamed from: c */
    public final boolean m11377c() {
        return this.f8796l;
    }

    /* renamed from: d */
    public final C4625j m11378d() {
        return this.f8792h;
    }

    /* renamed from: e */
    public final JSONArray m11379e() {
        return this.f8797m;
    }

    /* renamed from: f */
    public final boolean m11380f() {
        return this.f8795k;
    }

    /* renamed from: g */
    public final JSONArray m11381g() {
        return this.f8805u;
    }

    /* renamed from: h */
    public final JSONArray m11382h() {
        return this.f8804t;
    }

    /* renamed from: i */
    public final String m11383i() {
        return this.f8801q;
    }

    /* renamed from: j */
    public final JSONArray m11384j() {
        return this.f8808x;
    }

    /* renamed from: k */
    public final String m11385k() {
        return this.f8803s;
    }

    /* renamed from: l */
    public final String m11386l() {
        return this.f8798n;
    }

    /* renamed from: m */
    public final JSONArray m11387m() {
        return this.f8809y;
    }

    /* renamed from: n */
    public final int m11388n() {
        return this.f8788d;
    }

    /* renamed from: o */
    public final EnumSet<EnumC4624i0> m11389o() {
        return this.f8789e;
    }

    /* renamed from: p */
    public final String m11390p() {
        return this.f8802r;
    }

    /* renamed from: q */
    public final boolean m11391q() {
        return this.f8785a;
    }
}
