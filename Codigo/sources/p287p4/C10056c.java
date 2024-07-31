package p287p4;

import android.os.Bundle;
import com.facebook.internal.C4641r;
import com.facebook.internal.C4648v;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONObject;
import p007a5.C0033a;
import p152i4.C7799e0;

/* renamed from: p4.c */
/* loaded from: classes.dex */
public final class C10056c {

    /* renamed from: b */
    private static boolean f24697b;

    /* renamed from: c */
    private static JSONArray f24698c;

    /* renamed from: a */
    public static final C10056c f24696a = new C10056c();

    /* renamed from: d */
    private static String[] f24699d = {"event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    private C10056c() {
    }

    /* renamed from: a */
    public static final void m29980a() {
        if (C0033a.m107d(C10056c.class)) {
            return;
        }
        try {
            f24696a.m29986g();
            if (f24698c != null) {
                f24697b = true;
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10056c.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:6:0x000d, B:10:0x0032, B:13:0x0049, B:16:0x005c, B:19:0x0072, B:22:0x0088, B:26:0x0042, B:29:0x002b), top: B:5:0x000d }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m29981b(android.os.Bundle r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "ANDROID"
            java.lang.String r1 = "event"
            java.lang.Class<p4.c> r2 = p287p4.C10056c.class
            boolean r3 = p007a5.C0033a.m107d(r2)
            if (r3 == 0) goto Ld
            return
        Ld:
            java.lang.String r3 = "params"
            kotlin.jvm.internal.C9322n.m27781e(r6, r3)     // Catch: java.lang.Throwable -> Lb3
            kotlin.jvm.internal.C9322n.m27781e(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            r6.putString(r1, r7)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_locale"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb3
            r1.<init>()     // Catch: java.lang.Throwable -> Lb3
            com.facebook.internal.n0 r3 = com.facebook.internal.C4634n0.f8760a     // Catch: java.lang.Throwable -> Lb3
            java.util.Locale r4 = r3.m11344J()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r5 = ""
            if (r4 != 0) goto L2b
        L29:
            r4 = r5
            goto L32
        L2b:
            java.lang.String r4 = r4.getLanguage()     // Catch: java.lang.Throwable -> Lb3
            if (r4 != 0) goto L32
            goto L29
        L32:
            r1.append(r4)     // Catch: java.lang.Throwable -> Lb3
            r4 = 95
            r1.append(r4)     // Catch: java.lang.Throwable -> Lb3
            java.util.Locale r4 = r3.m11344J()     // Catch: java.lang.Throwable -> Lb3
            if (r4 != 0) goto L42
        L40:
            r4 = r5
            goto L49
        L42:
            java.lang.String r4 = r4.getCountry()     // Catch: java.lang.Throwable -> Lb3
            if (r4 != 0) goto L49
            goto L40
        L49:
            r1.append(r4)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lb3
            r6.putString(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_appVersion"
            java.lang.String r1 = r3.m11345Q()     // Catch: java.lang.Throwable -> Lb3
            if (r1 != 0) goto L5c
            r1 = r5
        L5c:
            r6.putString(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_deviceOS"
            r6.putString(r7, r0)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_platform"
            java.lang.String r1 = "mobile"
            r6.putString(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_deviceModel"
            java.lang.String r1 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> Lb3
            if (r1 != 0) goto L72
            r1 = r5
        L72:
            r6.putString(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_nativeAppID"
            java.lang.String r1 = p152i4.C7799e0.m23861m()     // Catch: java.lang.Throwable -> Lb3
            r6.putString(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_nativeAppShortVersion"
            java.lang.String r1 = r3.m11345Q()     // Catch: java.lang.Throwable -> Lb3
            if (r1 != 0) goto L87
            goto L88
        L87:
            r5 = r1
        L88:
            r6.putString(r7, r5)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_timezone"
            java.lang.String r1 = r3.m11343E()     // Catch: java.lang.Throwable -> Lb3
            r6.putString(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_carrier"
            java.lang.String r1 = r3.m11347z()     // Catch: java.lang.Throwable -> Lb3
            r6.putString(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_deviceOSTypeName"
            r6.putString(r7, r0)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_deviceOSVersion"
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> Lb3
            r6.putString(r7, r0)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_remainingDiskGB"
            long r0 = r3.m11346x()     // Catch: java.lang.Throwable -> Lb3
            r6.putLong(r7, r0)     // Catch: java.lang.Throwable -> Lb3
            return
        Lb3:
            r6 = move-exception
            p007a5.C0033a.m105b(r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p287p4.C10056c.m29981b(android.os.Bundle, java.lang.String):void");
    }

    /* renamed from: c */
    public static final String m29982c(JSONObject logic) {
        if (C0033a.m107d(C10056c.class)) {
            return null;
        }
        try {
            C9322n.m27781e(logic, "logic");
            Iterator<String> keys = logic.keys();
            if (keys.hasNext()) {
                return keys.next();
            }
            return null;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10056c.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final String m29983d(Bundle bundle) {
        String optString;
        if (C0033a.m107d(C10056c.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = f24698c;
            if (jSONArray == null) {
                return "[]";
            }
            Integer valueOf = jSONArray == null ? null : Integer.valueOf(jSONArray.length());
            if (valueOf != null && valueOf.intValue() == 0) {
                return "[]";
            }
            JSONArray jSONArray2 = f24698c;
            if (jSONArray2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray2.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    String optString2 = jSONArray2.optString(i10);
                    if (optString2 != null) {
                        JSONObject jSONObject = new JSONObject(optString2);
                        long optLong = jSONObject.optLong(FacebookMediationAdapter.KEY_ID);
                        if (optLong != 0 && (optString = jSONObject.optString("rule")) != null && m29985f(optString, bundle)) {
                            arrayList.add(Long.valueOf(optLong));
                        }
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            String jSONArray3 = new JSONArray((Collection) arrayList).toString();
            C9322n.m27780d(jSONArray3, "JSONArray(res).toString()");
            return jSONArray3;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10056c.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final ArrayList<String> m29984e(JSONArray jSONArray) {
        if (C0033a.m107d(C10056c.class) || jSONArray == null) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    arrayList.add(jSONArray.get(i10).toString());
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10056c.class);
            return null;
        }
    }

    /* renamed from: f */
    public static final boolean m29985f(String str, Bundle bundle) {
        int length;
        if (!C0033a.m107d(C10056c.class) && str != null && bundle != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String m29982c = m29982c(jSONObject);
                if (m29982c == null) {
                    return false;
                }
                Object obj = jSONObject.get(m29982c);
                int hashCode = m29982c.hashCode();
                if (hashCode != 3555) {
                    if (hashCode != 96727) {
                        if (hashCode == 109267 && m29982c.equals("not")) {
                            return !m29985f(obj.toString(), bundle);
                        }
                    } else if (m29982c.equals("and")) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length2 = jSONArray.length();
                        if (length2 > 0) {
                            int i10 = 0;
                            while (true) {
                                int i11 = i10 + 1;
                                if (!m29985f(jSONArray.get(i10).toString(), bundle)) {
                                    return false;
                                }
                                if (i11 >= length2) {
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                        return true;
                    }
                } else if (m29982c.equals("or")) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2 != null && (length = jSONArray2.length()) > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            if (m29985f(jSONArray2.get(i12).toString(), bundle)) {
                                return true;
                            }
                            if (i13 >= length) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    return false;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return m29989j(m29982c, jSONObject2, bundle);
            } catch (Throwable th2) {
                C0033a.m105b(th2, C10056c.class);
            }
        }
        return false;
    }

    /* renamed from: g */
    private final void m29986g() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C4648v c4648v = C4648v.f8854a;
            C4641r m11457q = C4648v.m11457q(C7799e0.m23861m(), false);
            if (m11457q == null) {
                return;
            }
            f24698c = m11457q.m11381g();
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: h */
    public static final void m29987h(Bundle bundle, String event) {
        if (C0033a.m107d(C10056c.class)) {
            return;
        }
        try {
            C9322n.m27781e(event, "event");
            if (f24697b && bundle != null) {
                try {
                    m29981b(bundle, event);
                    bundle.putString("_audiencePropertyIds", m29983d(bundle));
                    bundle.putString("cs_maca", "1");
                    m29988i(bundle);
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10056c.class);
        }
    }

    /* renamed from: i */
    public static final void m29988i(Bundle params) {
        if (C0033a.m107d(C10056c.class)) {
            return;
        }
        try {
            C9322n.m27781e(params, "params");
            String[] strArr = f24699d;
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str = strArr[i10];
                i10++;
                params.remove(str);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10056c.class);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0075. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b5 A[Catch: all -> 0x03c2, TryCatch #0 {all -> 0x03c2, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:24:0x0065, B:25:0x006d, B:28:0x007a, B:32:0x0084, B:34:0x008a, B:36:0x0095, B:38:0x00a2, B:39:0x00a7, B:40:0x00a8, B:41:0x00ad, B:42:0x00ae, B:46:0x00b8, B:52:0x00c4, B:58:0x0252, B:61:0x0259, B:62:0x025d, B:64:0x0263, B:66:0x026b, B:68:0x027a, B:75:0x028a, B:76:0x028f, B:78:0x0290, B:79:0x0295, B:81:0x00ce, B:85:0x00d8, B:87:0x00de, B:89:0x00e9, B:91:0x00f6, B:92:0x00fb, B:93:0x00fc, B:94:0x0101, B:95:0x0102, B:101:0x02a3, B:105:0x02ab, B:106:0x02af, B:108:0x02b5, B:110:0x02bd, B:112:0x02cc, B:118:0x02db, B:119:0x02e0, B:121:0x02e1, B:122:0x02e6, B:125:0x010c, B:129:0x0116, B:131:0x011c, B:133:0x0127, B:135:0x0134, B:136:0x0139, B:137:0x013a, B:138:0x013f, B:139:0x0140, B:143:0x01ee, B:146:0x014a, B:150:0x01d3, B:154:0x0154, B:158:0x01ae, B:162:0x015e, B:166:0x0168, B:170:0x0234, B:174:0x0172, B:178:0x017c, B:184:0x0387, B:185:0x0376, B:187:0x0186, B:191:0x0205, B:195:0x0190, B:199:0x019a, B:203:0x0220, B:205:0x01a4, B:209:0x01bf, B:213:0x01c9, B:217:0x01e4, B:221:0x01fb, B:225:0x0216, B:229:0x022a, B:233:0x0245, B:237:0x0296, B:241:0x02e7, B:245:0x02f1, B:247:0x02f7, B:249:0x0302, B:253:0x0311, B:254:0x0316, B:255:0x0317, B:256:0x031c, B:257:0x031d, B:261:0x0327, B:263:0x0331, B:269:0x0372, B:270:0x033b, B:274:0x0345, B:276:0x0354, B:280:0x035d, B:282:0x0366, B:286:0x037b, B:290:0x038c, B:294:0x0395, B:296:0x039b, B:298:0x03a6, B:302:0x03b5, B:303:0x03ba, B:304:0x03bb, B:305:0x03c0, B:307:0x0052), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0386 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0387 A[Catch: all -> 0x03c2, TryCatch #0 {all -> 0x03c2, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:24:0x0065, B:25:0x006d, B:28:0x007a, B:32:0x0084, B:34:0x008a, B:36:0x0095, B:38:0x00a2, B:39:0x00a7, B:40:0x00a8, B:41:0x00ad, B:42:0x00ae, B:46:0x00b8, B:52:0x00c4, B:58:0x0252, B:61:0x0259, B:62:0x025d, B:64:0x0263, B:66:0x026b, B:68:0x027a, B:75:0x028a, B:76:0x028f, B:78:0x0290, B:79:0x0295, B:81:0x00ce, B:85:0x00d8, B:87:0x00de, B:89:0x00e9, B:91:0x00f6, B:92:0x00fb, B:93:0x00fc, B:94:0x0101, B:95:0x0102, B:101:0x02a3, B:105:0x02ab, B:106:0x02af, B:108:0x02b5, B:110:0x02bd, B:112:0x02cc, B:118:0x02db, B:119:0x02e0, B:121:0x02e1, B:122:0x02e6, B:125:0x010c, B:129:0x0116, B:131:0x011c, B:133:0x0127, B:135:0x0134, B:136:0x0139, B:137:0x013a, B:138:0x013f, B:139:0x0140, B:143:0x01ee, B:146:0x014a, B:150:0x01d3, B:154:0x0154, B:158:0x01ae, B:162:0x015e, B:166:0x0168, B:170:0x0234, B:174:0x0172, B:178:0x017c, B:184:0x0387, B:185:0x0376, B:187:0x0186, B:191:0x0205, B:195:0x0190, B:199:0x019a, B:203:0x0220, B:205:0x01a4, B:209:0x01bf, B:213:0x01c9, B:217:0x01e4, B:221:0x01fb, B:225:0x0216, B:229:0x022a, B:233:0x0245, B:237:0x0296, B:241:0x02e7, B:245:0x02f1, B:247:0x02f7, B:249:0x0302, B:253:0x0311, B:254:0x0316, B:255:0x0317, B:256:0x031c, B:257:0x031d, B:261:0x0327, B:263:0x0331, B:269:0x0372, B:270:0x033b, B:274:0x0345, B:276:0x0354, B:280:0x035d, B:282:0x0366, B:286:0x037b, B:290:0x038c, B:294:0x0395, B:296:0x039b, B:298:0x03a6, B:302:0x03b5, B:303:0x03ba, B:304:0x03bb, B:305:0x03c0, B:307:0x0052), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0371 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0372 A[Catch: all -> 0x03c2, TryCatch #0 {all -> 0x03c2, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:24:0x0065, B:25:0x006d, B:28:0x007a, B:32:0x0084, B:34:0x008a, B:36:0x0095, B:38:0x00a2, B:39:0x00a7, B:40:0x00a8, B:41:0x00ad, B:42:0x00ae, B:46:0x00b8, B:52:0x00c4, B:58:0x0252, B:61:0x0259, B:62:0x025d, B:64:0x0263, B:66:0x026b, B:68:0x027a, B:75:0x028a, B:76:0x028f, B:78:0x0290, B:79:0x0295, B:81:0x00ce, B:85:0x00d8, B:87:0x00de, B:89:0x00e9, B:91:0x00f6, B:92:0x00fb, B:93:0x00fc, B:94:0x0101, B:95:0x0102, B:101:0x02a3, B:105:0x02ab, B:106:0x02af, B:108:0x02b5, B:110:0x02bd, B:112:0x02cc, B:118:0x02db, B:119:0x02e0, B:121:0x02e1, B:122:0x02e6, B:125:0x010c, B:129:0x0116, B:131:0x011c, B:133:0x0127, B:135:0x0134, B:136:0x0139, B:137:0x013a, B:138:0x013f, B:139:0x0140, B:143:0x01ee, B:146:0x014a, B:150:0x01d3, B:154:0x0154, B:158:0x01ae, B:162:0x015e, B:166:0x0168, B:170:0x0234, B:174:0x0172, B:178:0x017c, B:184:0x0387, B:185:0x0376, B:187:0x0186, B:191:0x0205, B:195:0x0190, B:199:0x019a, B:203:0x0220, B:205:0x01a4, B:209:0x01bf, B:213:0x01c9, B:217:0x01e4, B:221:0x01fb, B:225:0x0216, B:229:0x022a, B:233:0x0245, B:237:0x0296, B:241:0x02e7, B:245:0x02f1, B:247:0x02f7, B:249:0x0302, B:253:0x0311, B:254:0x0316, B:255:0x0317, B:256:0x031c, B:257:0x031d, B:261:0x0327, B:263:0x0331, B:269:0x0372, B:270:0x033b, B:274:0x0345, B:276:0x0354, B:280:0x035d, B:282:0x0366, B:286:0x037b, B:290:0x038c, B:294:0x0395, B:296:0x039b, B:298:0x03a6, B:302:0x03b5, B:303:0x03ba, B:304:0x03bb, B:305:0x03c0, B:307:0x0052), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0251 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0252 A[Catch: all -> 0x03c2, TryCatch #0 {all -> 0x03c2, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:24:0x0065, B:25:0x006d, B:28:0x007a, B:32:0x0084, B:34:0x008a, B:36:0x0095, B:38:0x00a2, B:39:0x00a7, B:40:0x00a8, B:41:0x00ad, B:42:0x00ae, B:46:0x00b8, B:52:0x00c4, B:58:0x0252, B:61:0x0259, B:62:0x025d, B:64:0x0263, B:66:0x026b, B:68:0x027a, B:75:0x028a, B:76:0x028f, B:78:0x0290, B:79:0x0295, B:81:0x00ce, B:85:0x00d8, B:87:0x00de, B:89:0x00e9, B:91:0x00f6, B:92:0x00fb, B:93:0x00fc, B:94:0x0101, B:95:0x0102, B:101:0x02a3, B:105:0x02ab, B:106:0x02af, B:108:0x02b5, B:110:0x02bd, B:112:0x02cc, B:118:0x02db, B:119:0x02e0, B:121:0x02e1, B:122:0x02e6, B:125:0x010c, B:129:0x0116, B:131:0x011c, B:133:0x0127, B:135:0x0134, B:136:0x0139, B:137:0x013a, B:138:0x013f, B:139:0x0140, B:143:0x01ee, B:146:0x014a, B:150:0x01d3, B:154:0x0154, B:158:0x01ae, B:162:0x015e, B:166:0x0168, B:170:0x0234, B:174:0x0172, B:178:0x017c, B:184:0x0387, B:185:0x0376, B:187:0x0186, B:191:0x0205, B:195:0x0190, B:199:0x019a, B:203:0x0220, B:205:0x01a4, B:209:0x01bf, B:213:0x01c9, B:217:0x01e4, B:221:0x01fb, B:225:0x0216, B:229:0x022a, B:233:0x0245, B:237:0x0296, B:241:0x02e7, B:245:0x02f1, B:247:0x02f7, B:249:0x0302, B:253:0x0311, B:254:0x0316, B:255:0x0317, B:256:0x031c, B:257:0x031d, B:261:0x0327, B:263:0x0331, B:269:0x0372, B:270:0x033b, B:274:0x0345, B:276:0x0354, B:280:0x035d, B:282:0x0366, B:286:0x037b, B:290:0x038c, B:294:0x0395, B:296:0x039b, B:298:0x03a6, B:302:0x03b5, B:303:0x03ba, B:304:0x03bb, B:305:0x03c0, B:307:0x0052), top: B:5:0x000a }] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m29989j(java.lang.String r9, org.json.JSONObject r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p287p4.C10056c.m29989j(java.lang.String, org.json.JSONObject, android.os.Bundle):boolean");
    }
}
