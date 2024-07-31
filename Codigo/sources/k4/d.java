package k4;

import android.content.SharedPreferences;
import com.facebook.internal.c0;
import dk.z;
import i4.e0;
import i4.i0;
import i4.n0;
import i4.o0;
import i4.q0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f20322a = new d();

    /* renamed from: b, reason: collision with root package name */
    private static final String f20323b = d.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    private static boolean f20324c;

    private d() {
    }

    public static final void b() {
        String b10;
        try {
            i0 i0Var = new i0(null, kotlin.jvm.internal.n.k(e0.m(), "/cloudbridge_settings"), null, o0.GET, new i0.b() { // from class: k4.c
                @Override // i4.i0.b
                public final void b(n0 n0Var) {
                    d.c(n0Var);
                }
            }, null, 32, null);
            c0.a aVar = c0.f7719e;
            q0 q0Var = q0.APP_EVENTS;
            String str = f20323b;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            aVar.c(q0Var, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", i0Var);
            i0Var.l();
        } catch (JSONException e10) {
            c0.a aVar2 = c0.f7719e;
            q0 q0Var2 = q0.APP_EVENTS;
            String str2 = f20323b;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            b10 = ck.b.b(e10);
            aVar2.c(q0Var2, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", b10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(n0 response) {
        kotlin.jvm.internal.n.e(response, "response");
        f20322a.d(response);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[Catch: all -> 0x0097, TRY_LEAVE, TryCatch #0 {all -> 0x0097, blocks: (B:6:0x000a, B:9:0x0018, B:11:0x0039, B:17:0x0047, B:23:0x0055, B:29:0x0062), top: B:5:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.Map<java.lang.String, java.lang.Object> e() {
        /*
            java.lang.Class<k4.d> r0 = k4.d.class
            boolean r1 = a5.a.d(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            android.content.Context r1 = i4.e0.l()     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = "com.facebook.sdk.CloudBridgeSavedCredentials"
            r4 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r4)     // Catch: java.lang.Throwable -> L97
            if (r1 != 0) goto L18
            return r2
        L18:
            k4.o r3 = k4.o.DATASETID     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = r3.h()     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = r1.getString(r5, r2)     // Catch: java.lang.Throwable -> L97
            k4.o r6 = k4.o.URL     // Catch: java.lang.Throwable -> L97
            java.lang.String r7 = r6.h()     // Catch: java.lang.Throwable -> L97
            java.lang.String r7 = r1.getString(r7, r2)     // Catch: java.lang.Throwable -> L97
            k4.o r8 = k4.o.ACCESSKEY     // Catch: java.lang.Throwable -> L97
            java.lang.String r9 = r8.h()     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = r1.getString(r9, r2)     // Catch: java.lang.Throwable -> L97
            r9 = 1
            if (r5 == 0) goto L42
            boolean r10 = xk.g.t(r5)     // Catch: java.lang.Throwable -> L97
            if (r10 == 0) goto L40
            goto L42
        L40:
            r10 = r4
            goto L43
        L42:
            r10 = r9
        L43:
            if (r10 != 0) goto L96
            if (r7 == 0) goto L50
            boolean r10 = xk.g.t(r7)     // Catch: java.lang.Throwable -> L97
            if (r10 == 0) goto L4e
            goto L50
        L4e:
            r10 = r4
            goto L51
        L50:
            r10 = r9
        L51:
            if (r10 != 0) goto L96
            if (r1 == 0) goto L5e
            boolean r10 = xk.g.t(r1)     // Catch: java.lang.Throwable -> L97
            if (r10 == 0) goto L5c
            goto L5e
        L5c:
            r10 = r4
            goto L5f
        L5e:
            r10 = r9
        L5f:
            if (r10 == 0) goto L62
            goto L96
        L62:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L97
            r10.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r6 = r6.h()     // Catch: java.lang.Throwable -> L97
            r10.put(r6, r7)     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = r3.h()     // Catch: java.lang.Throwable -> L97
            r10.put(r3, r5)     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = r8.h()     // Catch: java.lang.Throwable -> L97
            r10.put(r3, r1)     // Catch: java.lang.Throwable -> L97
            com.facebook.internal.c0$a r3 = com.facebook.internal.c0.f7719e     // Catch: java.lang.Throwable -> L97
            i4.q0 r6 = i4.q0.APP_EVENTS     // Catch: java.lang.Throwable -> L97
            java.lang.String r8 = k4.d.f20323b     // Catch: java.lang.Throwable -> L97
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L97
            java.lang.String r11 = " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n "
            r12 = 3
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L97
            r12[r4] = r5     // Catch: java.lang.Throwable -> L97
            r12[r9] = r7     // Catch: java.lang.Throwable -> L97
            r4 = 2
            r12[r4] = r1     // Catch: java.lang.Throwable -> L97
            r3.c(r6, r8, r11, r12)     // Catch: java.lang.Throwable -> L97
            return r10
        L96:
            return r2
        L97:
            r1 = move-exception
            a5.a.b(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.d.e():java.util.Map");
    }

    public final void d(n0 response) {
        String b10;
        String b11;
        Object H;
        String b12;
        kotlin.jvm.internal.n.e(response, "response");
        boolean z10 = false;
        if (response.b() != null) {
            c0.a aVar = c0.f7719e;
            q0 q0Var = q0.APP_EVENTS;
            String str = f20323b;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            aVar.c(q0Var, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", response.b().toString(), String.valueOf(response.b().e()));
            Map<String, Object> e10 = e();
            if (e10 != null) {
                URL url = new URL(String.valueOf(e10.get(o.URL.h())));
                g gVar = g.f20337a;
                g.d(String.valueOf(e10.get(o.DATASETID.h())), url.getProtocol() + "://" + ((Object) url.getHost()), String.valueOf(e10.get(o.ACCESSKEY.h())));
                f20324c = true;
                return;
            }
            return;
        }
        c0.a aVar2 = c0.f7719e;
        q0 q0Var2 = q0.APP_EVENTS;
        String TAG = f20323b;
        if (TAG == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        aVar2.c(q0Var2, TAG, " \n\nGraph Response Received: \n================\n%s\n\n ", response);
        JSONObject c10 = response.c();
        try {
            com.facebook.internal.n0 n0Var = com.facebook.internal.n0.f7780a;
            Object obj = c10 == null ? null : c10.get("data");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            H = z.H(com.facebook.internal.n0.n((JSONArray) obj));
            Map<String, ? extends Object> o10 = com.facebook.internal.n0.o(new JSONObject((String) H));
            String str2 = (String) o10.get(o.URL.h());
            String str3 = (String) o10.get(o.DATASETID.h());
            String str4 = (String) o10.get(o.ACCESSKEY.h());
            if (str2 == null || str3 == null || str4 == null) {
                kotlin.jvm.internal.n.d(TAG, "TAG");
                aVar2.b(q0Var2, TAG, "CloudBridge Settings API response doesn't have valid data");
                return;
            }
            try {
                g.d(str3, str2, str4);
                g(o10);
                o oVar = o.ENABLED;
                if (o10.get(oVar.h()) != null) {
                    Object obj2 = o10.get(oVar.h());
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    z10 = ((Boolean) obj2).booleanValue();
                }
                f20324c = z10;
            } catch (MalformedURLException e11) {
                c0.a aVar3 = c0.f7719e;
                q0 q0Var3 = q0.APP_EVENTS;
                String TAG2 = f20323b;
                kotlin.jvm.internal.n.d(TAG2, "TAG");
                b12 = ck.b.b(e11);
                aVar3.c(q0Var3, TAG2, "CloudBridge Settings API response doesn't have valid url\n %s ", b12);
            }
        } catch (NullPointerException e12) {
            c0.a aVar4 = c0.f7719e;
            q0 q0Var4 = q0.APP_EVENTS;
            String TAG3 = f20323b;
            kotlin.jvm.internal.n.d(TAG3, "TAG");
            b11 = ck.b.b(e12);
            aVar4.c(q0Var4, TAG3, "CloudBridge Settings API response is not a valid json: \n%s ", b11);
        } catch (JSONException e13) {
            c0.a aVar5 = c0.f7719e;
            q0 q0Var5 = q0.APP_EVENTS;
            String TAG4 = f20323b;
            kotlin.jvm.internal.n.d(TAG4, "TAG");
            b10 = ck.b.b(e13);
            aVar5.c(q0Var5, TAG4, "CloudBridge Settings API response is not a valid json: \n%s ", b10);
        }
    }

    public final boolean f() {
        return f20324c;
    }

    public final void g(Map<String, ? extends Object> map) {
        SharedPreferences sharedPreferences = e0.l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        if (map == null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            edit.apply();
            return;
        }
        o oVar = o.DATASETID;
        Object obj = map.get(oVar.h());
        o oVar2 = o.URL;
        Object obj2 = map.get(oVar2.h());
        o oVar3 = o.ACCESSKEY;
        Object obj3 = map.get(oVar3.h());
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.putString(oVar.h(), obj.toString());
        edit2.putString(oVar2.h(), obj2.toString());
        edit2.putString(oVar3.h(), obj3.toString());
        edit2.apply();
        c0.f7719e.c(q0.APP_EVENTS, f20323b.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
    }
}
