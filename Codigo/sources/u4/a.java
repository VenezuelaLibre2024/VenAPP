package u4;

import android.util.Patterns;
import ck.r;
import dk.k0;
import io.flutter.plugins.firebase.auth.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xk.q;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f27073a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static Map<String, String> f27074b;

    /* renamed from: c, reason: collision with root package name */
    private static Map<String, String> f27075c;

    /* renamed from: d, reason: collision with root package name */
    private static Map<String, String> f27076d;

    /* renamed from: e, reason: collision with root package name */
    private static JSONObject f27077e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f27078f;

    private a() {
    }

    public static final float[] a(JSONObject viewHierarchy, String appName) {
        String lowerCase;
        JSONObject jSONObject;
        String screenName;
        JSONArray jSONArray;
        a aVar;
        JSONObject b10;
        if (a5.a.d(a.class)) {
            return null;
        }
        try {
            n.e(viewHierarchy, "viewHierarchy");
            n.e(appName, "appName");
            if (!f27078f) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            try {
                lowerCase = appName.toLowerCase();
                n.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                jSONObject = new JSONObject(viewHierarchy.optJSONObject("view").toString());
                screenName = viewHierarchy.optString("screenname");
                jSONArray = new JSONArray();
                aVar = f27073a;
                aVar.j(jSONObject, jSONArray);
                aVar.m(fArr, aVar.i(jSONObject));
                b10 = aVar.b(jSONObject);
            } catch (JSONException unused) {
            }
            if (b10 == null) {
                return null;
            }
            n.d(screenName, "screenName");
            String jSONObject2 = jSONObject.toString();
            n.d(jSONObject2, "viewTree.toString()");
            aVar.m(fArr, aVar.h(b10, jSONArray, screenName, jSONObject2, lowerCase));
            return fArr;
        } catch (Throwable th2) {
            a5.a.b(th2, a.class);
            return null;
        }
    }

    private final JSONObject b(JSONObject jSONObject) {
        int length;
        if (a5.a.d(this)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            a5.a.b(th2, this);
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
                n.d(jSONObject2, "children.getJSONObject(i)");
                JSONObject b10 = b(jSONObject2);
                if (b10 != null) {
                    return b10;
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return null;
    }

    public static final String c(String buttonText, String activityName, String appName) {
        if (a5.a.d(a.class)) {
            return null;
        }
        try {
            n.e(buttonText, "buttonText");
            n.e(activityName, "activityName");
            n.e(appName, "appName");
            String str = appName + " | " + activityName + ", " + buttonText;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = str.toLowerCase();
            n.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            return lowerCase;
        } catch (Throwable th2) {
            a5.a.b(th2, a.class);
            return null;
        }
    }

    public static final void d(File file) {
        Map<String, String> k10;
        Map<String, String> k11;
        Map<String, String> k12;
        if (a5.a.d(a.class)) {
            return;
        }
        try {
            try {
                f27077e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f27077e = new JSONObject(new String(bArr, xk.d.f31393b));
                k10 = k0.k(r.a("ENGLISH", "1"), r.a("GERMAN", "2"), r.a("SPANISH", "3"), r.a("JAPANESE", "4"));
                f27074b = k10;
                k11 = k0.k(r.a("VIEW_CONTENT", "0"), r.a("SEARCH", "1"), r.a("ADD_TO_CART", "2"), r.a("ADD_TO_WISHLIST", "3"), r.a("INITIATE_CHECKOUT", "4"), r.a("ADD_PAYMENT_INFO", "5"), r.a("PURCHASE", "6"), r.a("LEAD", "7"), r.a("COMPLETE_REGISTRATION", "8"));
                f27075c = k11;
                k12 = k0.k(r.a("BUTTON_TEXT", "1"), r.a("PAGE_TITLE", "2"), r.a("RESOLVED_DOCUMENT_LINK", "3"), r.a("BUTTON_ID", "4"));
                f27076d = k12;
                f27078f = true;
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            a5.a.b(th2, a.class);
        }
    }

    private final boolean e(JSONObject jSONObject) {
        if (a5.a.d(this)) {
            return false;
        }
        try {
            return ((jSONObject.optInt("classtypebitmask") & 1) << 5) > 0;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return false;
        }
    }

    public static final boolean f() {
        if (a5.a.d(a.class)) {
            return false;
        }
        try {
            return f27078f;
        } catch (Throwable th2) {
            a5.a.b(th2, a.class);
            return false;
        }
    }

    private final boolean g(String[] strArr, String[] strArr2) {
        boolean J;
        if (a5.a.d(this)) {
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
                    J = q.J(str2, str, false, 2, null);
                    if (J) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return false;
        }
    }

    private final float[] h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        boolean J;
        if (a5.a.d(this)) {
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
                        n.d(jSONObject2, "siblings.getJSONObject(i)");
                        if (e(jSONObject2)) {
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
            n(jSONObject, sb3, sb2);
            String sb4 = sb2.toString();
            n.d(sb4, "hintSB.toString()");
            String sb5 = sb3.toString();
            n.d(sb5, "textSB.toString()");
            fArr[15] = l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", sb5) ? 1.0f : 0.0f;
            fArr[16] = l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[17] = l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", sb4) ? 1.0f : 0.0f;
            J = q.J(str2, "password", false, 2, null);
            fArr[18] = J ? 1.0f : 0.0f;
            fArr[19] = k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? 1.0f : 0.0f;
            fArr[20] = k("(?i)(sign in)|login|signIn", str2) ? 1.0f : 0.0f;
            fArr[21] = k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? 1.0f : 0.0f;
            fArr[22] = l("ENGLISH", "PURCHASE", "BUTTON_TEXT", sb5) ? 1.0f : 0.0f;
            fArr[24] = l("ENGLISH", "PURCHASE", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[25] = k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb5) ? 1.0f : 0.0f;
            fArr[27] = k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? 1.0f : 0.0f;
            fArr[28] = l("ENGLISH", "LEAD", "BUTTON_TEXT", sb5) ? 1.0f : 0.0f;
            fArr[29] = l("ENGLISH", "LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            return fArr;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return null;
        }
    }

    private final float[] i(JSONObject jSONObject) {
        boolean J;
        boolean J2;
        boolean J3;
        if (a5.a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            int i10 = 0;
            for (int i11 = 0; i11 < 30; i11++) {
                fArr[i11] = 0.0f;
            }
            String optString = jSONObject.optString("text");
            n.d(optString, "node.optString(TEXT_KEY)");
            String lowerCase = optString.toLowerCase();
            n.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint");
            n.d(optString2, "node.optString(HINT_KEY)");
            String lowerCase2 = optString2.toLowerCase();
            n.d(lowerCase2, "(this as java.lang.String).toLowerCase()");
            String optString3 = jSONObject.optString("classname");
            n.d(optString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = optString3.toLowerCase();
            n.d(lowerCase3, "(this as java.lang.String).toLowerCase()");
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (g(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (g(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (g(new String[]{"tel", Constants.SIGN_IN_METHOD_PHONE}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (g(new String[]{"search"}, strArr)) {
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
            J = q.J(lowerCase3, "checkbox", false, 2, null);
            if (J) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            J2 = q.J(lowerCase3, "radio", false, 2, null);
            if (J2) {
                J3 = q.J(lowerCase3, "button", false, 2, null);
                if (J3) {
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
                        n.d(jSONObject2, "childViews.getJSONObject(i)");
                        m(fArr, i(jSONObject2));
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
            a5.a.b(th2, this);
            return null;
        }
    }

    private final boolean j(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z10;
        if (a5.a.d(this)) {
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
                        n.d(child, "child");
                        if (j(child, jSONArray)) {
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
            a5.a.b(th2, this);
            return false;
        }
    }

    private final boolean k(String str, String str2) {
        if (a5.a.d(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:6:0x0008, B:8:0x000d, B:18:0x005d, B:20:0x0043, B:23:0x004c, B:25:0x0050, B:26:0x0062, B:27:0x0067, B:28:0x0029, B:31:0x0032, B:33:0x0036, B:34:0x0068, B:35:0x006d, B:36:0x0017, B:38:0x001b, B:39:0x006e, B:40:0x0073, B:41:0x0074, B:42:0x0079), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050 A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:6:0x0008, B:8:0x000d, B:18:0x005d, B:20:0x0043, B:23:0x004c, B:25:0x0050, B:26:0x0062, B:27:0x0067, B:28:0x0029, B:31:0x0032, B:33:0x0036, B:34:0x0068, B:35:0x006d, B:36:0x0017, B:38:0x001b, B:39:0x006e, B:40:0x0073, B:41:0x0074, B:42:0x0079), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:6:0x0008, B:8:0x000d, B:18:0x005d, B:20:0x0043, B:23:0x004c, B:25:0x0050, B:26:0x0062, B:27:0x0067, B:28:0x0029, B:31:0x0032, B:33:0x0036, B:34:0x0068, B:35:0x006d, B:36:0x0017, B:38:0x001b, B:39:0x006e, B:40:0x0073, B:41:0x0074, B:42:0x0079), top: B:5:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean l(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            boolean r0 = a5.a.d(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONObject r0 = u4.a.f27077e     // Catch: java.lang.Throwable -> L7a
            r2 = 0
            if (r0 == 0) goto L74
            java.lang.String r3 = "rulesForLanguage"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch: java.lang.Throwable -> L7a
            if (r0 != 0) goto L17
            r5 = r2
            goto L25
        L17:
            java.util.Map<java.lang.String, java.lang.String> r3 = u4.a.f27074b     // Catch: java.lang.Throwable -> L7a
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
            java.util.Map<java.lang.String, java.lang.String> r0 = u4.a.f27075c     // Catch: java.lang.Throwable -> L7a
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
            java.util.Map<java.lang.String, java.lang.String> r6 = u4.a.f27076d     // Catch: java.lang.Throwable -> L7a
            if (r6 == 0) goto L62
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = r5.optString(r6)     // Catch: java.lang.Throwable -> L7a
        L5a:
            if (r2 != 0) goto L5d
            goto L61
        L5d:
            boolean r1 = r4.k(r2, r8)     // Catch: java.lang.Throwable -> L7a
        L61:
            return r1
        L62:
            java.lang.String r5 = "textTypeInfo"
            kotlin.jvm.internal.n.p(r5)     // Catch: java.lang.Throwable -> L7a
            throw r2     // Catch: java.lang.Throwable -> L7a
        L68:
            java.lang.String r5 = "eventInfo"
            kotlin.jvm.internal.n.p(r5)     // Catch: java.lang.Throwable -> L7a
            throw r2     // Catch: java.lang.Throwable -> L7a
        L6e:
            java.lang.String r5 = "languageInfo"
            kotlin.jvm.internal.n.p(r5)     // Catch: java.lang.Throwable -> L7a
            throw r2     // Catch: java.lang.Throwable -> L7a
        L74:
            java.lang.String r5 = "rules"
            kotlin.jvm.internal.n.p(r5)     // Catch: java.lang.Throwable -> L7a
            throw r2     // Catch: java.lang.Throwable -> L7a
        L7a:
            r5 = move-exception
            a5.a.b(r5, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.a.l(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    private final void m(float[] fArr, float[] fArr2) {
        if (a5.a.d(this)) {
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
            a5.a.b(th2, this);
        }
    }

    private final void n(JSONObject jSONObject, StringBuilder sb2, StringBuilder sb3) {
        int length;
        if (a5.a.d(this)) {
            return;
        }
        try {
            String optString = jSONObject.optString("text", "");
            n.d(optString, "view.optString(TEXT_KEY, \"\")");
            String lowerCase = optString.toLowerCase();
            n.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint", "");
            n.d(optString2, "view.optString(HINT_KEY, \"\")");
            String lowerCase2 = optString2.toLowerCase();
            n.d(lowerCase2, "(this as java.lang.String).toLowerCase()");
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
                    n.d(currentChildView, "currentChildView");
                    n(currentChildView, sb2, sb3);
                } catch (JSONException unused) {
                }
                if (i11 >= length) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }
}
