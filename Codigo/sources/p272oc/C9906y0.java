package p272oc;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzafn;
import com.google.android.gms.internal.p498firebaseauthapi.zzxw;
import com.google.firebase.auth.AbstractC6045a0;
import com.google.firebase.auth.AbstractC6084j0;
import ga.C7533a;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: oc.y0 */
/* loaded from: classes.dex */
public final class C9906y0 {

    /* renamed from: a */
    private Context f24416a;

    /* renamed from: b */
    private String f24417b;

    /* renamed from: c */
    private SharedPreferences f24418c;

    /* renamed from: d */
    private C7533a f24419d;

    public C9906y0(Context context, String str) {
        C5276s.m13324j(context);
        this.f24417b = C5276s.m13320f(str);
        this.f24416a = context.getApplicationContext();
        this.f24418c = this.f24416a.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", this.f24417b), 0);
        this.f24419d = new C7533a("StorageHelpers", new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd A[Catch: zzxw -> 0x00cd, IllegalArgumentException -> 0x00cf, zzxw | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException -> 0x00d1, JSONException -> 0x00d3, TryCatch #2 {zzxw | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException -> 0x00d1, blocks: (B:3:0x0005, B:6:0x0022, B:10:0x002f, B:12:0x0038, B:14:0x0046, B:16:0x0055, B:18:0x005e, B:19:0x0061, B:21:0x006a, B:23:0x0074, B:24:0x0077, B:26:0x007d, B:28:0x0083, B:29:0x0089, B:31:0x008f, B:33:0x00a6, B:35:0x00c3, B:39:0x00b1, B:44:0x00bd, B:50:0x00c9), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p272oc.C9842d m29616c(org.json.JSONObject r14) {
        /*
            r13 = this;
            java.lang.String r0 = "userMultiFactorInfo"
            java.lang.String r1 = "userMetadata"
            r2 = 0
            java.lang.String r3 = "cachedTokenState"
            java.lang.String r3 = r14.getString(r3)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            java.lang.String r4 = "applicationName"
            java.lang.String r4 = r14.getString(r4)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            java.lang.String r5 = "anonymous"
            boolean r5 = r14.getBoolean(r5)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            java.lang.String r6 = "2"
            java.lang.String r7 = "version"
            java.lang.String r7 = r14.getString(r7)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            if (r7 == 0) goto L22
            r6 = r7
        L22:
            java.lang.String r7 = "userInfos"
            org.json.JSONArray r7 = r14.getJSONArray(r7)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            int r8 = r7.length()     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            if (r8 != 0) goto L2f
            return r2
        L2f:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            r9.<init>(r8)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            r10 = 0
            r11 = r10
        L36:
            if (r11 >= r8) goto L46
            java.lang.String r12 = r7.getString(r11)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            oc.y1 r12 = p272oc.C9907y1.m29623u1(r12)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            r9.add(r12)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            int r11 = r11 + 1
            goto L36
        L46:
            zb.g r4 = p485zb.C12867g.m42618p(r4)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            oc.d r7 = new oc.d     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            r7.<init>(r4, r9)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            if (r4 != 0) goto L5c
            com.google.android.gms.internal.firebase-auth-api.zzafn r3 = com.google.android.gms.internal.p498firebaseauthapi.zzafn.zzb(r3)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            r7.mo16449R1(r3)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
        L5c:
            if (r5 != 0) goto L61
            r7.mo16450S1()     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
        L61:
            r7.m29508W1(r6)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            boolean r3 = r14.has(r1)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            if (r3 == 0) goto L77
            org.json.JSONObject r1 = r14.getJSONObject(r1)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            oc.f r1 = p272oc.C9848f.m29534a(r1)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            if (r1 == 0) goto L77
            r7.m29510Y1(r1)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
        L77:
            boolean r1 = r14.has(r0)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            if (r1 == 0) goto Lcc
            org.json.JSONArray r14 = r14.getJSONArray(r0)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            if (r14 == 0) goto Lcc
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            r0.<init>()     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            r1 = r10
        L89:
            int r3 = r14.length()     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            if (r1 >= r3) goto Lc9
            java.lang.String r3 = r14.getString(r1)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            r4.<init>(r3)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            java.lang.String r3 = "factorIdKey"
            java.lang.String r3 = r4.optString(r3)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            java.lang.String r5 = "phone"
            boolean r5 = r5.equals(r3)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            if (r5 == 0) goto Lab
            com.google.firebase.auth.t0 r3 = com.google.firebase.auth.C6124t0.m16609x1(r4)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            goto Lc3
        Lab:
            java.lang.String r5 = "totp"
            if (r3 == r5) goto Lba
            if (r3 == 0) goto Lb8
            boolean r3 = r3.equals(r5)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            if (r3 == 0) goto Lb8
            goto Lba
        Lb8:
            r3 = r10
            goto Lbb
        Lba:
            r3 = 1
        Lbb:
            if (r3 == 0) goto Lc2
            com.google.firebase.auth.y0 r3 = com.google.firebase.auth.C6143y0.m16629x1(r4)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            goto Lc3
        Lc2:
            r3 = r2
        Lc3:
            r0.add(r3)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            int r1 = r1 + 1
            goto L89
        Lc9:
            r7.mo16451T1(r0)     // Catch: com.google.android.gms.internal.p498firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
        Lcc:
            return r7
        Lcd:
            r14 = move-exception
            goto Ld4
        Lcf:
            r14 = move-exception
            goto Ld4
        Ld1:
            r14 = move-exception
            goto Ld4
        Ld3:
            r14 = move-exception
        Ld4:
            ga.a r0 = r13.f24419d
            r0.m22878j(r14)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p272oc.C9906y0.m29616c(org.json.JSONObject):oc.d");
    }

    /* renamed from: g */
    private final String m29617g(AbstractC6045a0 abstractC6045a0) {
        JSONObject jSONObject = new JSONObject();
        if (!C9842d.class.isAssignableFrom(abstractC6045a0.getClass())) {
            return null;
        }
        C9842d c9842d = (C9842d) abstractC6045a0;
        try {
            jSONObject.put("cachedTokenState", c9842d.zze());
            jSONObject.put("applicationName", c9842d.mo16447Q1().m42631q());
            jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
            if (c9842d.m29514c2() != null) {
                JSONArray jSONArray = new JSONArray();
                List<C9907y1> m29514c2 = c9842d.m29514c2();
                int size = m29514c2.size();
                if (m29514c2.size() > 30) {
                    this.f24419d.m22876h("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(m29514c2.size()));
                    size = 30;
                }
                boolean z10 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    C9907y1 c9907y1 = m29514c2.get(i10);
                    if (c9907y1.mo16479q().equals("firebase")) {
                        z10 = true;
                    }
                    if (i10 == size - 1 && !z10) {
                        break;
                    }
                    jSONArray.put(c9907y1.zzb());
                }
                if (!z10) {
                    int i11 = size - 1;
                    while (true) {
                        if (i11 >= m29514c2.size() || i11 < 0) {
                            break;
                        }
                        C9907y1 c9907y12 = m29514c2.get(i11);
                        if (c9907y12.mo16479q().equals("firebase")) {
                            jSONArray.put(c9907y12.zzb());
                            z10 = true;
                            break;
                        }
                        if (i11 == m29514c2.size() - 1) {
                            jSONArray.put(c9907y12.zzb());
                        }
                        i11++;
                    }
                    if (!z10) {
                        this.f24419d.m22876h("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(m29514c2.size()), Integer.valueOf(size));
                        if (m29514c2.size() < 5) {
                            StringBuilder sb2 = new StringBuilder("Provider user info list:\n");
                            Iterator<C9907y1> it = m29514c2.iterator();
                            while (it.hasNext()) {
                                sb2.append(String.format("Provider - %s\n", it.next().mo16479q()));
                            }
                            this.f24419d.m22876h(sb2.toString(), new Object[0]);
                        }
                    }
                }
                jSONObject.put("userInfos", jSONArray);
            }
            jSONObject.put("anonymous", c9842d.mo16430A1());
            jSONObject.put("version", "2");
            if (c9842d.mo16459w1() != null) {
                jSONObject.put("userMetadata", ((C9848f) c9842d.mo16459w1()).m29535b());
            }
            List<AbstractC6084j0> mo16532b = ((C9854h) c9842d.mo16460x1()).mo16532b();
            if (mo16532b != null && !mo16532b.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i12 = 0; i12 < mo16532b.size(); i12++) {
                    jSONArray2.put(mo16532b.get(i12).mo16556w1());
                }
                jSONObject.put("userMultiFactorInfo", jSONArray2);
            }
            return jSONObject.toString();
        } catch (Exception e10) {
            this.f24419d.m22877i("Failed to turn object into JSON", e10, new Object[0]);
            throw new zzxw(e10);
        }
    }

    /* renamed from: a */
    public final zzafn m29618a(AbstractC6045a0 abstractC6045a0) {
        C5276s.m13324j(abstractC6045a0);
        String string = this.f24418c.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC6045a0.mo16454l()), null);
        if (string != null) {
            return zzafn.zzb(string);
        }
        return null;
    }

    /* renamed from: b */
    public final AbstractC6045a0 m29619b() {
        String string = this.f24418c.getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return m29616c(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: d */
    public final void m29620d(AbstractC6045a0 abstractC6045a0, zzafn zzafnVar) {
        C5276s.m13324j(abstractC6045a0);
        C5276s.m13324j(zzafnVar);
        this.f24418c.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC6045a0.mo16454l()), zzafnVar.zzf()).apply();
    }

    /* renamed from: e */
    public final void m29621e(String str) {
        this.f24418c.edit().remove(str).apply();
    }

    /* renamed from: f */
    public final void m29622f(AbstractC6045a0 abstractC6045a0) {
        C5276s.m13324j(abstractC6045a0);
        String m29617g = m29617g(abstractC6045a0);
        if (TextUtils.isEmpty(m29617g)) {
            return;
        }
        this.f24418c.edit().putString("com.google.firebase.auth.FIREBASE_USER", m29617g).apply();
    }
}
