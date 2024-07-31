package p194k4;

import android.content.SharedPreferences;
import ck.C2017b;
import com.facebook.internal.C4612c0;
import com.facebook.internal.C4634n0;
import dk.C7042z;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p152i4.C7799e0;
import p152i4.C7807i0;
import p152i4.C7817n0;
import p152i4.EnumC7819o0;
import p152i4.EnumC7823q0;

/* renamed from: k4.d */
/* loaded from: classes.dex */
public final class C9156d {

    /* renamed from: a */
    public static final C9156d f22104a = new C9156d();

    /* renamed from: b */
    private static final String f22105b = C9156d.class.getCanonicalName();

    /* renamed from: c */
    private static boolean f22106c;

    private C9156d() {
    }

    /* renamed from: b */
    public static final void m27017b() {
        String m10329b;
        try {
            C7807i0 c7807i0 = new C7807i0(null, C9322n.m27787k(C7799e0.m23861m(), "/cloudbridge_settings"), null, EnumC7819o0.GET, new C7807i0.b() { // from class: k4.c
                @Override // p152i4.C7807i0.b
                /* renamed from: b */
                public final void mo9121b(C7817n0 c7817n0) {
                    C9156d.m27018c(c7817n0);
                }
            }, null, 32, null);
            C4612c0.a aVar = C4612c0.f8694e;
            EnumC7823q0 enumC7823q0 = EnumC7823q0.APP_EVENTS;
            String str = f22105b;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            aVar.m11139c(enumC7823q0, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", c7807i0);
            c7807i0.m23950l();
        } catch (JSONException e10) {
            C4612c0.a aVar2 = C4612c0.f8694e;
            EnumC7823q0 enumC7823q02 = EnumC7823q0.APP_EVENTS;
            String str2 = f22105b;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            m10329b = C2017b.m10329b(e10);
            aVar2.m11139c(enumC7823q02, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", m10329b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m27018c(C7817n0 response) {
        C9322n.m27781e(response, "response");
        f22104a.m27020d(response);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[Catch: all -> 0x0097, TRY_LEAVE, TryCatch #0 {all -> 0x0097, blocks: (B:6:0x000a, B:9:0x0018, B:11:0x0039, B:17:0x0047, B:23:0x0055, B:29:0x0062), top: B:5:0x000a }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.Map<java.lang.String, java.lang.Object> m27019e() {
        /*
            java.lang.Class<k4.d> r0 = p194k4.C9156d.class
            boolean r1 = p007a5.C0033a.m107d(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            android.content.Context r1 = p152i4.C7799e0.m23860l()     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = "com.facebook.sdk.CloudBridgeSavedCredentials"
            r4 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r4)     // Catch: java.lang.Throwable -> L97
            if (r1 != 0) goto L18
            return r2
        L18:
            k4.o r3 = p194k4.EnumC9167o.DATASETID     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = r3.m27077h()     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = r1.getString(r5, r2)     // Catch: java.lang.Throwable -> L97
            k4.o r6 = p194k4.EnumC9167o.URL     // Catch: java.lang.Throwable -> L97
            java.lang.String r7 = r6.m27077h()     // Catch: java.lang.Throwable -> L97
            java.lang.String r7 = r1.getString(r7, r2)     // Catch: java.lang.Throwable -> L97
            k4.o r8 = p194k4.EnumC9167o.ACCESSKEY     // Catch: java.lang.Throwable -> L97
            java.lang.String r9 = r8.m27077h()     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = r1.getString(r9, r2)     // Catch: java.lang.Throwable -> L97
            r9 = 1
            if (r5 == 0) goto L42
            boolean r10 = p450xk.C12515g.m41007t(r5)     // Catch: java.lang.Throwable -> L97
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
            boolean r10 = p450xk.C12515g.m41007t(r7)     // Catch: java.lang.Throwable -> L97
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
            boolean r10 = p450xk.C12515g.m41007t(r1)     // Catch: java.lang.Throwable -> L97
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
            java.lang.String r6 = r6.m27077h()     // Catch: java.lang.Throwable -> L97
            r10.put(r6, r7)     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = r3.m27077h()     // Catch: java.lang.Throwable -> L97
            r10.put(r3, r5)     // Catch: java.lang.Throwable -> L97
            java.lang.String r3 = r8.m27077h()     // Catch: java.lang.Throwable -> L97
            r10.put(r3, r1)     // Catch: java.lang.Throwable -> L97
            com.facebook.internal.c0$a r3 = com.facebook.internal.C4612c0.f8694e     // Catch: java.lang.Throwable -> L97
            i4.q0 r6 = p152i4.EnumC7823q0.APP_EVENTS     // Catch: java.lang.Throwable -> L97
            java.lang.String r8 = p194k4.C9156d.f22105b     // Catch: java.lang.Throwable -> L97
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L97
            java.lang.String r11 = " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n "
            r12 = 3
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L97
            r12[r4] = r5     // Catch: java.lang.Throwable -> L97
            r12[r9] = r7     // Catch: java.lang.Throwable -> L97
            r4 = 2
            r12[r4] = r1     // Catch: java.lang.Throwable -> L97
            r3.m11139c(r6, r8, r11, r12)     // Catch: java.lang.Throwable -> L97
            return r10
        L96:
            return r2
        L97:
            r1 = move-exception
            p007a5.C0033a.m105b(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p194k4.C9156d.m27019e():java.util.Map");
    }

    /* renamed from: d */
    public final void m27020d(C7817n0 response) {
        String m10329b;
        String m10329b2;
        Object m20606H;
        String m10329b3;
        C9322n.m27781e(response, "response");
        boolean z10 = false;
        if (response.m24061b() != null) {
            C4612c0.a aVar = C4612c0.f8694e;
            EnumC7823q0 enumC7823q0 = EnumC7823q0.APP_EVENTS;
            String str = f22105b;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            aVar.m11139c(enumC7823q0, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", response.m24061b().toString(), String.valueOf(response.m24061b().m24102e()));
            Map<String, Object> m27019e = m27019e();
            if (m27019e != null) {
                URL url = new URL(String.valueOf(m27019e.get(EnumC9167o.URL.m27077h())));
                C9159g c9159g = C9159g.f22119a;
                C9159g.m27046d(String.valueOf(m27019e.get(EnumC9167o.DATASETID.m27077h())), url.getProtocol() + "://" + ((Object) url.getHost()), String.valueOf(m27019e.get(EnumC9167o.ACCESSKEY.m27077h())));
                f22106c = true;
                return;
            }
            return;
        }
        C4612c0.a aVar2 = C4612c0.f8694e;
        EnumC7823q0 enumC7823q02 = EnumC7823q0.APP_EVENTS;
        String TAG = f22105b;
        if (TAG == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        aVar2.m11139c(enumC7823q02, TAG, " \n\nGraph Response Received: \n================\n%s\n\n ", response);
        JSONObject m24062c = response.m24062c();
        try {
            C4634n0 c4634n0 = C4634n0.f8760a;
            Object obj = m24062c == null ? null : m24062c.get("data");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            m20606H = C7042z.m20606H(C4634n0.m11319n((JSONArray) obj));
            Map<String, ? extends Object> m11321o = C4634n0.m11321o(new JSONObject((String) m20606H));
            String str2 = (String) m11321o.get(EnumC9167o.URL.m27077h());
            String str3 = (String) m11321o.get(EnumC9167o.DATASETID.m27077h());
            String str4 = (String) m11321o.get(EnumC9167o.ACCESSKEY.m27077h());
            if (str2 == null || str3 == null || str4 == null) {
                C9322n.m27780d(TAG, "TAG");
                aVar2.m11138b(enumC7823q02, TAG, "CloudBridge Settings API response doesn't have valid data");
                return;
            }
            try {
                C9159g.m27046d(str3, str2, str4);
                m27022g(m11321o);
                EnumC9167o enumC9167o = EnumC9167o.ENABLED;
                if (m11321o.get(enumC9167o.m27077h()) != null) {
                    Object obj2 = m11321o.get(enumC9167o.m27077h());
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    z10 = ((Boolean) obj2).booleanValue();
                }
                f22106c = z10;
            } catch (MalformedURLException e10) {
                C4612c0.a aVar3 = C4612c0.f8694e;
                EnumC7823q0 enumC7823q03 = EnumC7823q0.APP_EVENTS;
                String TAG2 = f22105b;
                C9322n.m27780d(TAG2, "TAG");
                m10329b3 = C2017b.m10329b(e10);
                aVar3.m11139c(enumC7823q03, TAG2, "CloudBridge Settings API response doesn't have valid url\n %s ", m10329b3);
            }
        } catch (NullPointerException e11) {
            C4612c0.a aVar4 = C4612c0.f8694e;
            EnumC7823q0 enumC7823q04 = EnumC7823q0.APP_EVENTS;
            String TAG3 = f22105b;
            C9322n.m27780d(TAG3, "TAG");
            m10329b2 = C2017b.m10329b(e11);
            aVar4.m11139c(enumC7823q04, TAG3, "CloudBridge Settings API response is not a valid json: \n%s ", m10329b2);
        } catch (JSONException e12) {
            C4612c0.a aVar5 = C4612c0.f8694e;
            EnumC7823q0 enumC7823q05 = EnumC7823q0.APP_EVENTS;
            String TAG4 = f22105b;
            C9322n.m27780d(TAG4, "TAG");
            m10329b = C2017b.m10329b(e12);
            aVar5.m11139c(enumC7823q05, TAG4, "CloudBridge Settings API response is not a valid json: \n%s ", m10329b);
        }
    }

    /* renamed from: f */
    public final boolean m27021f() {
        return f22106c;
    }

    /* renamed from: g */
    public final void m27022g(Map<String, ? extends Object> map) {
        SharedPreferences sharedPreferences = C7799e0.m23860l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        if (map == null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            edit.apply();
            return;
        }
        EnumC9167o enumC9167o = EnumC9167o.DATASETID;
        Object obj = map.get(enumC9167o.m27077h());
        EnumC9167o enumC9167o2 = EnumC9167o.URL;
        Object obj2 = map.get(enumC9167o2.m27077h());
        EnumC9167o enumC9167o3 = EnumC9167o.ACCESSKEY;
        Object obj3 = map.get(enumC9167o3.m27077h());
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.putString(enumC9167o.m27077h(), obj.toString());
        edit2.putString(enumC9167o2.m27077h(), obj2.toString());
        edit2.putString(enumC9167o3.m27077h(), obj3.toString());
        edit2.apply();
        C4612c0.f8694e.m11139c(EnumC7823q0.APP_EVENTS, f22105b.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
    }
}
