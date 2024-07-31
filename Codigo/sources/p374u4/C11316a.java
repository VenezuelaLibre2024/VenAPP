package p374u4;

import android.util.Patterns;
import ck.C2033r;
import dk.C7018k0;
import io.flutter.plugins.firebase.auth.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007a5.C0033a;
import p450xk.C12512d;
import p450xk.C12525q;

/* renamed from: u4.a */
/* loaded from: classes.dex */
public final class C11316a {

    /* renamed from: a */
    public static final C11316a f29375a = new C11316a();

    /* renamed from: b */
    private static Map<String, String> f29376b;

    /* renamed from: c */
    private static Map<String, String> f29377c;

    /* renamed from: d */
    private static Map<String, String> f29378d;

    /* renamed from: e */
    private static JSONObject f29379e;

    /* renamed from: f */
    private static boolean f29380f;

    private C11316a() {
    }

    /* renamed from: a */
    public static final float[] m35359a(JSONObject viewHierarchy, String appName) {
        String lowerCase;
        JSONObject jSONObject;
        String screenName;
        JSONArray jSONArray;
        C11316a c11316a;
        JSONObject m35360b;
        if (C0033a.m107d(C11316a.class)) {
            return null;
        }
        try {
            C9322n.m27781e(viewHierarchy, "viewHierarchy");
            C9322n.m27781e(appName, "appName");
            if (!f29380f) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            try {
                lowerCase = appName.toLowerCase();
                C9322n.m27780d(lowerCase, "(this as java.lang.String).toLowerCase()");
                jSONObject = new JSONObject(viewHierarchy.optJSONObject("view").toString());
                screenName = viewHierarchy.optString("screenname");
                jSONArray = new JSONArray();
                c11316a = f29375a;
                c11316a.m35368j(jSONObject, jSONArray);
                c11316a.m35371m(fArr, c11316a.m35367i(jSONObject));
                m35360b = c11316a.m35360b(jSONObject);
            } catch (JSONException unused) {
            }
            if (m35360b == null) {
                return null;
            }
            C9322n.m27780d(screenName, "screenName");
            String jSONObject2 = jSONObject.toString();
            C9322n.m27780d(jSONObject2, "viewTree.toString()");
            c11316a.m35371m(fArr, c11316a.m35366h(m35360b, jSONArray, screenName, jSONObject2, lowerCase));
            return fArr;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C11316a.class);
            return null;
        }
    }

    /* renamed from: b */
    private final JSONObject m35360b(JSONObject jSONObject) {
        int length;
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
        if (jSONObject.optBoolean("is_interacted")) {
            return jSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                C9322n.m27780d(jSONObject2, "children.getJSONObject(i)");
                JSONObject m35360b = m35360b(jSONObject2);
                if (m35360b != null) {
                    return m35360b;
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static final String m35361c(String buttonText, String activityName, String appName) {
        if (C0033a.m107d(C11316a.class)) {
            return null;
        }
        try {
            C9322n.m27781e(buttonText, "buttonText");
            C9322n.m27781e(activityName, "activityName");
            C9322n.m27781e(appName, "appName");
            String str = appName + " | " + activityName + ", " + buttonText;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = str.toLowerCase();
            C9322n.m27780d(lowerCase, "(this as java.lang.String).toLowerCase()");
            return lowerCase;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C11316a.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final void m35362d(File file) {
        Map<String, String> m20424k;
        Map<String, String> m20424k2;
        Map<String, String> m20424k3;
        if (C0033a.m107d(C11316a.class)) {
            return;
        }
        try {
            try {
                f29379e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f29379e = new JSONObject(new String(bArr, C12512d.f33913b));
                m20424k = C7018k0.m20424k(C2033r.m10353a("ENGLISH", "1"), C2033r.m10353a("GERMAN", "2"), C2033r.m10353a("SPANISH", "3"), C2033r.m10353a("JAPANESE", "4"));
                f29376b = m20424k;
                m20424k2 = C7018k0.m20424k(C2033r.m10353a("VIEW_CONTENT", "0"), C2033r.m10353a("SEARCH", "1"), C2033r.m10353a("ADD_TO_CART", "2"), C2033r.m10353a("ADD_TO_WISHLIST", "3"), C2033r.m10353a("INITIATE_CHECKOUT", "4"), C2033r.m10353a("ADD_PAYMENT_INFO", "5"), C2033r.m10353a("PURCHASE", "6"), C2033r.m10353a("LEAD", "7"), C2033r.m10353a("COMPLETE_REGISTRATION", "8"));
                f29377c = m20424k2;
                m20424k3 = C7018k0.m20424k(C2033r.m10353a("BUTTON_TEXT", "1"), C2033r.m10353a("PAGE_TITLE", "2"), C2033r.m10353a("RESOLVED_DOCUMENT_LINK", "3"), C2033r.m10353a("BUTTON_ID", "4"));
                f29378d = m20424k3;
                f29380f = true;
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C11316a.class);
        }
    }

    /* renamed from: e */
    private final boolean m35363e(JSONObject jSONObject) {
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            return ((jSONObject.optInt("classtypebitmask") & 1) << 5) > 0;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }

    /* renamed from: f */
    public static final boolean m35364f() {
        if (C0033a.m107d(C11316a.class)) {
            return false;
        }
        try {
            return f29380f;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C11316a.class);
            return false;
        }
    }

    /* renamed from: g */
    private final boolean m35365g(String[] strArr, String[] strArr2) {
        boolean m41059J;
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str = strArr[i10];
                i10++;
                int length2 = strArr2.length;
                int i11 = 0;
                while (i11 < length2) {
                    String str2 = strArr2[i11];
                    i11++;
                    m41059J = C12525q.m41059J(str2, str, false, 2, null);
                    if (m41059J) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }

    /* renamed from: h */
    private final float[] m35366h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        boolean m41059J;
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            int length = jSONArray.length();
            fArr[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = jSONArray.length();
                if (length2 > 0) {
                    int i11 = 0;
                    while (true) {
                        int i12 = i11 + 1;
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                        C9322n.m27780d(jSONObject2, "siblings.getJSONObject(i)");
                        if (m35363e(jSONObject2)) {
                            fArr[9] = fArr[9] + 1.0f;
                        }
                        if (i12 >= length2) {
                            break;
                        }
                        i11 = i12;
                    }
                }
            } catch (JSONException unused) {
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            m35372n(jSONObject, sb3, sb2);
            String sb4 = sb2.toString();
            C9322n.m27780d(sb4, "hintSB.toString()");
            String sb5 = sb3.toString();
            C9322n.m27780d(sb5, "textSB.toString()");
            fArr[15] = m35370l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", sb5) ? 1.0f : 0.0f;
            fArr[16] = m35370l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[17] = m35370l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", sb4) ? 1.0f : 0.0f;
            m41059J = C12525q.m41059J(str2, "password", false, 2, null);
            fArr[18] = m41059J ? 1.0f : 0.0f;
            fArr[19] = m35369k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? 1.0f : 0.0f;
            fArr[20] = m35369k("(?i)(sign in)|login|signIn", str2) ? 1.0f : 0.0f;
            fArr[21] = m35369k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? 1.0f : 0.0f;
            fArr[22] = m35370l("ENGLISH", "PURCHASE", "BUTTON_TEXT", sb5) ? 1.0f : 0.0f;
            fArr[24] = m35370l("ENGLISH", "PURCHASE", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[25] = m35369k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb5) ? 1.0f : 0.0f;
            fArr[27] = m35369k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? 1.0f : 0.0f;
            fArr[28] = m35370l("ENGLISH", "LEAD", "BUTTON_TEXT", sb5) ? 1.0f : 0.0f;
            fArr[29] = m35370l("ENGLISH", "LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            return fArr;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: i */
    private final float[] m35367i(JSONObject jSONObject) {
        boolean m41059J;
        boolean m41059J2;
        boolean m41059J3;
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            int i10 = 0;
            for (int i11 = 0; i11 < 30; i11++) {
                fArr[i11] = 0.0f;
            }
            String optString = jSONObject.optString("text");
            C9322n.m27780d(optString, "node.optString(TEXT_KEY)");
            String lowerCase = optString.toLowerCase();
            C9322n.m27780d(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint");
            C9322n.m27780d(optString2, "node.optString(HINT_KEY)");
            String lowerCase2 = optString2.toLowerCase();
            C9322n.m27780d(lowerCase2, "(this as java.lang.String).toLowerCase()");
            String optString3 = jSONObject.optString("classname");
            C9322n.m27780d(optString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = optString3.toLowerCase();
            C9322n.m27780d(lowerCase3, "(this as java.lang.String).toLowerCase()");
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (m35365g(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (m35365g(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (m35365g(new String[]{"tel", Constants.SIGN_IN_METHOD_PHONE}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (m35365g(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 3 || optInt == 2) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            m41059J = C12525q.m41059J(lowerCase3, "checkbox", false, 2, null);
            if (m41059J) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (m35365g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            m41059J2 = C12525q.m41059J(lowerCase3, "radio", false, 2, null);
            if (m41059J2) {
                m41059J3 = C12525q.m41059J(lowerCase3, "button", false, 2, null);
                if (m41059J3) {
                    fArr[12] = fArr[12] + 1.0f;
                }
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i12 = i10 + 1;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                        C9322n.m27780d(jSONObject2, "childViews.getJSONObject(i)");
                        m35371m(fArr, m35367i(jSONObject2));
                        if (i12 >= length) {
                            break;
                        }
                        i10 = i12;
                    }
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return null;
        }
    }

    /* renamed from: j */
    private final boolean m35368j(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z10;
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int length = optJSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (optJSONArray.getJSONObject(i10).optBoolean("is_interacted")) {
                        z10 = true;
                        break;
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            z10 = false;
            boolean z11 = z10;
            JSONArray jSONArray2 = new JSONArray();
            if (z10) {
                int length2 = optJSONArray.length();
                if (length2 > 0) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 + 1;
                        jSONArray.put(optJSONArray.getJSONObject(i12));
                        if (i13 >= length2) {
                            break;
                        }
                        i12 = i13;
                    }
                }
            } else {
                int length3 = optJSONArray.length();
                if (length3 > 0) {
                    int i14 = 0;
                    while (true) {
                        int i15 = i14 + 1;
                        JSONObject child = optJSONArray.getJSONObject(i14);
                        C9322n.m27780d(child, "child");
                        if (m35368j(child, jSONArray)) {
                            jSONArray2.put(child);
                            z11 = true;
                        }
                        if (i15 >= length3) {
                            break;
                        }
                        i14 = i15;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z11;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }

    /* renamed from: k */
    private final boolean m35369k(String str, String str2) {
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:6:0x0008, B:8:0x000d, B:18:0x005d, B:20:0x0043, B:23:0x004c, B:25:0x0050, B:26:0x0062, B:27:0x0067, B:28:0x0029, B:31:0x0032, B:33:0x0036, B:34:0x0068, B:35:0x006d, B:36:0x0017, B:38:0x001b, B:39:0x006e, B:40:0x0073, B:41:0x0074, B:42:0x0079), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050 A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:6:0x0008, B:8:0x000d, B:18:0x005d, B:20:0x0043, B:23:0x004c, B:25:0x0050, B:26:0x0062, B:27:0x0067, B:28:0x0029, B:31:0x0032, B:33:0x0036, B:34:0x0068, B:35:0x006d, B:36:0x0017, B:38:0x001b, B:39:0x006e, B:40:0x0073, B:41:0x0074, B:42:0x0079), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:6:0x0008, B:8:0x000d, B:18:0x005d, B:20:0x0043, B:23:0x004c, B:25:0x0050, B:26:0x0062, B:27:0x0067, B:28:0x0029, B:31:0x0032, B:33:0x0036, B:34:0x0068, B:35:0x006d, B:36:0x0017, B:38:0x001b, B:39:0x006e, B:40:0x0073, B:41:0x0074, B:42:0x0079), top: B:5:0x0008 }] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m35370l(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            boolean r0 = p007a5.C0033a.m107d(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONObject r0 = p374u4.C11316a.f29379e     // Catch: java.lang.Throwable -> L7a
            r2 = 0
            if (r0 == 0) goto L74
            java.lang.String r3 = "rulesForLanguage"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch: java.lang.Throwable -> L7a
            if (r0 != 0) goto L17
            r5 = r2
            goto L25
        L17:
            java.util.Map<java.lang.String, java.lang.String> r3 = p374u4.C11316a.f29376b     // Catch: java.lang.Throwable -> L7a
            if (r3 == 0) goto L6e
            java.lang.Object r5 = r3.get(r5)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L7a
            org.json.JSONObject r5 = r0.optJSONObject(r5)     // Catch: java.lang.Throwable -> L7a
        L25:
            if (r5 != 0) goto L29
        L27:
            r5 = r2
            goto L40
        L29:
            java.lang.String r0 = "rulesForEvent"
            org.json.JSONObject r5 = r5.optJSONObject(r0)     // Catch: java.lang.Throwable -> L7a
            if (r5 != 0) goto L32
            goto L27
        L32:
            java.util.Map<java.lang.String, java.lang.String> r0 = p374u4.C11316a.f29377c     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L68
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L7a
            org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch: java.lang.Throwable -> L7a
        L40:
            if (r5 != 0) goto L43
            goto L5a
        L43:
            java.lang.String r6 = "positiveRules"
            org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch: java.lang.Throwable -> L7a
            if (r5 != 0) goto L4c
            goto L5a
        L4c:
            java.util.Map<java.lang.String, java.lang.String> r6 = p374u4.C11316a.f29378d     // Catch: java.lang.Throwable -> L7a
            if (r6 == 0) goto L62
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = r5.optString(r6)     // Catch: java.lang.Throwable -> L7a
        L5a:
            if (r2 != 0) goto L5d
            goto L61
        L5d:
            boolean r1 = r4.m35369k(r2, r8)     // Catch: java.lang.Throwable -> L7a
        L61:
            return r1
        L62:
            java.lang.String r5 = "textTypeInfo"
            kotlin.jvm.internal.C9322n.m27792p(r5)     // Catch: java.lang.Throwable -> L7a
            throw r2     // Catch: java.lang.Throwable -> L7a
        L68:
            java.lang.String r5 = "eventInfo"
            kotlin.jvm.internal.C9322n.m27792p(r5)     // Catch: java.lang.Throwable -> L7a
            throw r2     // Catch: java.lang.Throwable -> L7a
        L6e:
            java.lang.String r5 = "languageInfo"
            kotlin.jvm.internal.C9322n.m27792p(r5)     // Catch: java.lang.Throwable -> L7a
            throw r2     // Catch: java.lang.Throwable -> L7a
        L74:
            java.lang.String r5 = "rules"
            kotlin.jvm.internal.C9322n.m27792p(r5)     // Catch: java.lang.Throwable -> L7a
            throw r2     // Catch: java.lang.Throwable -> L7a
        L7a:
            r5 = move-exception
            p007a5.C0033a.m105b(r5, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p374u4.C11316a.m35370l(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: m */
    private final void m35371m(float[] fArr, float[] fArr2) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            int length = fArr.length - 1;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                fArr[i10] = fArr[i10] + fArr2[i10];
                if (i11 > length) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: n */
    private final void m35372n(JSONObject jSONObject, StringBuilder sb2, StringBuilder sb3) {
        int length;
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            String optString = jSONObject.optString("text", "");
            C9322n.m27780d(optString, "view.optString(TEXT_KEY, \"\")");
            String lowerCase = optString.toLowerCase();
            C9322n.m27780d(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint", "");
            C9322n.m27780d(optString2, "view.optString(HINT_KEY, \"\")");
            String lowerCase2 = optString2.toLowerCase();
            C9322n.m27780d(lowerCase2, "(this as java.lang.String).toLowerCase()");
            boolean z10 = true;
            int i10 = 0;
            if (lowerCase.length() > 0) {
                sb2.append(lowerCase);
                sb2.append(" ");
            }
            if (lowerCase2.length() <= 0) {
                z10 = false;
            }
            if (z10) {
                sb3.append(lowerCase2);
                sb3.append(" ");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null || (length = optJSONArray.length()) <= 0) {
                return;
            }
            while (true) {
                int i11 = i10 + 1;
                try {
                    JSONObject currentChildView = optJSONArray.getJSONObject(i10);
                    C9322n.m27780d(currentChildView, "currentChildView");
                    m35372n(currentChildView, sb2, sb3);
                } catch (JSONException unused) {
                }
                if (i11 >= length) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }
}
