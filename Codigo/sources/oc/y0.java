package oc;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.p002firebaseauthapi.zzafn;
import com.google.android.gms.internal.p002firebaseauthapi.zzxw;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    private Context f22483a;

    /* renamed from: b, reason: collision with root package name */
    private String f22484b;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f22485c;

    /* renamed from: d, reason: collision with root package name */
    private ga.a f22486d;

    public y0(Context context, String str) {
        com.google.android.gms.common.internal.s.j(context);
        this.f22484b = com.google.android.gms.common.internal.s.f(str);
        this.f22483a = context.getApplicationContext();
        this.f22485c = this.f22483a.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", this.f22484b), 0);
        this.f22486d = new ga.a("StorageHelpers", new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd A[Catch: zzxw -> 0x00cd, IllegalArgumentException -> 0x00cf, zzxw | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException -> 0x00d1, JSONException -> 0x00d3, TryCatch #2 {zzxw | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException -> 0x00d1, blocks: (B:3:0x0005, B:6:0x0022, B:10:0x002f, B:12:0x0038, B:14:0x0046, B:16:0x0055, B:18:0x005e, B:19:0x0061, B:21:0x006a, B:23:0x0074, B:24:0x0077, B:26:0x007d, B:28:0x0083, B:29:0x0089, B:31:0x008f, B:33:0x00a6, B:35:0x00c3, B:39:0x00b1, B:44:0x00bd, B:50:0x00c9), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final oc.d c(org.json.JSONObject r14) {
        /*
            r13 = this;
            java.lang.String r0 = "userMultiFactorInfo"
            java.lang.String r1 = "userMetadata"
            r2 = 0
            java.lang.String r3 = "cachedTokenState"
            java.lang.String r3 = r14.getString(r3)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            java.lang.String r4 = "applicationName"
            java.lang.String r4 = r14.getString(r4)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            java.lang.String r5 = "anonymous"
            boolean r5 = r14.getBoolean(r5)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            java.lang.String r6 = "2"
            java.lang.String r7 = "version"
            java.lang.String r7 = r14.getString(r7)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            if (r7 == 0) goto L22
            r6 = r7
        L22:
            java.lang.String r7 = "userInfos"
            org.json.JSONArray r7 = r14.getJSONArray(r7)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            int r8 = r7.length()     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            if (r8 != 0) goto L2f
            return r2
        L2f:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            r9.<init>(r8)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            r10 = 0
            r11 = r10
        L36:
            if (r11 >= r8) goto L46
            java.lang.String r12 = r7.getString(r11)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            oc.y1 r12 = oc.y1.u1(r12)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            r9.add(r12)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            int r11 = r11 + 1
            goto L36
        L46:
            zb.g r4 = zb.g.p(r4)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            oc.d r7 = new oc.d     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            r7.<init>(r4, r9)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            if (r4 != 0) goto L5c
            com.google.android.gms.internal.firebase-auth-api.zzafn r3 = com.google.android.gms.internal.p002firebaseauthapi.zzafn.zzb(r3)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            r7.R1(r3)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
        L5c:
            if (r5 != 0) goto L61
            r7.S1()     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
        L61:
            r7.W1(r6)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            boolean r3 = r14.has(r1)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            if (r3 == 0) goto L77
            org.json.JSONObject r1 = r14.getJSONObject(r1)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            oc.f r1 = oc.f.a(r1)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            if (r1 == 0) goto L77
            r7.Y1(r1)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
        L77:
            boolean r1 = r14.has(r0)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            if (r1 == 0) goto Lcc
            org.json.JSONArray r14 = r14.getJSONArray(r0)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            if (r14 == 0) goto Lcc
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            r0.<init>()     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            r1 = r10
        L89:
            int r3 = r14.length()     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            if (r1 >= r3) goto Lc9
            java.lang.String r3 = r14.getString(r1)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            r4.<init>(r3)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            java.lang.String r3 = "factorIdKey"
            java.lang.String r3 = r4.optString(r3)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            java.lang.String r5 = "phone"
            boolean r5 = r5.equals(r3)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            if (r5 == 0) goto Lab
            com.google.firebase.auth.t0 r3 = com.google.firebase.auth.t0.x1(r4)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            goto Lc3
        Lab:
            java.lang.String r5 = "totp"
            if (r3 == r5) goto Lba
            if (r3 == 0) goto Lb8
            boolean r3 = r3.equals(r5)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            if (r3 == 0) goto Lb8
            goto Lba
        Lb8:
            r3 = r10
            goto Lbb
        Lba:
            r3 = 1
        Lbb:
            if (r3 == 0) goto Lc2
            com.google.firebase.auth.y0 r3 = com.google.firebase.auth.y0.x1(r4)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            goto Lc3
        Lc2:
            r3 = r2
        Lc3:
            r0.add(r3)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
            int r1 = r1 + 1
            goto L89
        Lc9:
            r7.T1(r0)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzxw -> Lcd java.lang.IllegalArgumentException -> Lcf java.lang.ArrayIndexOutOfBoundsException -> Ld1 org.json.JSONException -> Ld3
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
            ga.a r0 = r13.f22486d
            r0.j(r14)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: oc.y0.c(org.json.JSONObject):oc.d");
    }

    private final String g(com.google.firebase.auth.a0 a0Var) {
        JSONObject jSONObject = new JSONObject();
        if (!d.class.isAssignableFrom(a0Var.getClass())) {
            return null;
        }
        d dVar = (d) a0Var;
        try {
            jSONObject.put("cachedTokenState", dVar.zze());
            jSONObject.put("applicationName", dVar.Q1().q());
            jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
            if (dVar.c2() != null) {
                JSONArray jSONArray = new JSONArray();
                List<y1> c22 = dVar.c2();
                int size = c22.size();
                if (c22.size() > 30) {
                    this.f22486d.h("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(c22.size()));
                    size = 30;
                }
                boolean z10 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    y1 y1Var = c22.get(i10);
                    if (y1Var.q().equals("firebase")) {
                        z10 = true;
                    }
                    if (i10 == size - 1 && !z10) {
                        break;
                    }
                    jSONArray.put(y1Var.zzb());
                }
                if (!z10) {
                    int i11 = size - 1;
                    while (true) {
                        if (i11 >= c22.size() || i11 < 0) {
                            break;
                        }
                        y1 y1Var2 = c22.get(i11);
                        if (y1Var2.q().equals("firebase")) {
                            jSONArray.put(y1Var2.zzb());
                            z10 = true;
                            break;
                        }
                        if (i11 == c22.size() - 1) {
                            jSONArray.put(y1Var2.zzb());
                        }
                        i11++;
                    }
                    if (!z10) {
                        this.f22486d.h("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(c22.size()), Integer.valueOf(size));
                        if (c22.size() < 5) {
                            StringBuilder sb2 = new StringBuilder("Provider user info list:\n");
                            Iterator<y1> it = c22.iterator();
                            while (it.hasNext()) {
                                sb2.append(String.format("Provider - %s\n", it.next().q()));
                            }
                            this.f22486d.h(sb2.toString(), new Object[0]);
                        }
                    }
                }
                jSONObject.put("userInfos", jSONArray);
            }
            jSONObject.put("anonymous", dVar.A1());
            jSONObject.put("version", "2");
            if (dVar.w1() != null) {
                jSONObject.put("userMetadata", ((f) dVar.w1()).b());
            }
            List<com.google.firebase.auth.j0> b10 = ((h) dVar.x1()).b();
            if (b10 != null && !b10.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i12 = 0; i12 < b10.size(); i12++) {
                    jSONArray2.put(b10.get(i12).w1());
                }
                jSONObject.put("userMultiFactorInfo", jSONArray2);
            }
            return jSONObject.toString();
        } catch (Exception e10) {
            this.f22486d.i("Failed to turn object into JSON", e10, new Object[0]);
            throw new zzxw(e10);
        }
    }

    public final zzafn a(com.google.firebase.auth.a0 a0Var) {
        com.google.android.gms.common.internal.s.j(a0Var);
        String string = this.f22485c.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", a0Var.l()), null);
        if (string != null) {
            return zzafn.zzb(string);
        }
        return null;
    }

    public final com.google.firebase.auth.a0 b() {
        String string = this.f22485c.getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return c(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final void d(com.google.firebase.auth.a0 a0Var, zzafn zzafnVar) {
        com.google.android.gms.common.internal.s.j(a0Var);
        com.google.android.gms.common.internal.s.j(zzafnVar);
        this.f22485c.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", a0Var.l()), zzafnVar.zzf()).apply();
    }

    public final void e(String str) {
        this.f22485c.edit().remove(str).apply();
    }

    public final void f(com.google.firebase.auth.a0 a0Var) {
        com.google.android.gms.common.internal.s.j(a0Var);
        String g10 = g(a0Var);
        if (TextUtils.isEmpty(g10)) {
            return;
        }
        this.f22485c.edit().putString("com.google.firebase.auth.FIREBASE_USER", g10).apply();
    }
}
