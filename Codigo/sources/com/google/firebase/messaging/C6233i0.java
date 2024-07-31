package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import cc.InterfaceC1940a;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.installations.C6196c;
import java.util.concurrent.ExecutionException;
import me.C9575a;
import me.C9576b;
import p098f6.AbstractC7299c;
import p098f6.C7298b;
import p098f6.InterfaceC7301e;
import p098f6.InterfaceC7303g;
import p485zb.C12867g;

/* renamed from: com.google.firebase.messaging.i0 */
/* loaded from: classes.dex */
public class C6233i0 {
    /* renamed from: A */
    public static boolean m17040A(Intent intent) {
        if (intent == null || m17060r(intent)) {
            return false;
        }
        return m17043a();
    }

    /* renamed from: B */
    public static boolean m17041B(Intent intent) {
        if (intent == null || m17060r(intent)) {
            return false;
        }
        return m17042C(intent.getExtras());
    }

    /* renamed from: C */
    public static boolean m17042C(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    /* renamed from: a */
    static boolean m17043a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C12867g.m42617o();
            Context m42630m = C12867g.m42617o().m42630m();
            SharedPreferences sharedPreferences = m42630m.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = m42630m.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(m42630m.getPackageName(), RecognitionOptions.ITF)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* renamed from: b */
    static C9575a m17044b(C9575a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        C9575a.a m28508h = C9575a.m28485p().m28513m(m17058p(extras)).m28505e(bVar).m28506f(m17048f(extras)).m28509i(m17055m()).m28511k(C9575a.d.ANDROID).m28508h(m17053k(extras));
        String m17050h = m17050h(extras);
        if (m17050h != null) {
            m28508h.m28507g(m17050h);
        }
        String m17057o = m17057o(extras);
        if (m17057o != null) {
            m28508h.m28512l(m17057o);
        }
        String m17045c = m17045c(extras);
        if (m17045c != null) {
            m28508h.m28503c(m17045c);
        }
        String m17051i = m17051i(extras);
        if (m17051i != null) {
            m28508h.m28502b(m17051i);
        }
        String m17047e = m17047e(extras);
        if (m17047e != null) {
            m28508h.m28504d(m17047e);
        }
        long m17056n = m17056n(extras);
        if (m17056n > 0) {
            m28508h.m28510j(m17056n);
        }
        return m28508h.m28501a();
    }

    /* renamed from: c */
    static String m17045c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    /* renamed from: d */
    static String m17046d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    /* renamed from: e */
    static String m17047e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    /* renamed from: f */
    static String m17048f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) Tasks.await(C6196c.m16847t(C12867g.m42617o()).getId());
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: g */
    static String m17049g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    /* renamed from: h */
    static String m17050h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    /* renamed from: i */
    static String m17051i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    /* renamed from: j */
    static String m17052j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    /* renamed from: k */
    static C9575a.c m17053k(Bundle bundle) {
        return (bundle == null || !C6239k0.m17082t(bundle)) ? C9575a.c.DATA_MESSAGE : C9575a.c.DISPLAY_NOTIFICATION;
    }

    /* renamed from: l */
    static String m17054l(Bundle bundle) {
        return (bundle == null || !C6239k0.m17082t(bundle)) ? "data" : "display";
    }

    /* renamed from: m */
    static String m17055m() {
        return C12867g.m42617o().m42630m().getPackageName();
    }

    /* renamed from: n */
    static long m17056n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e10) {
                Log.w("FirebaseMessaging", "error parsing project number", e10);
            }
        }
        C12867g m42617o = C12867g.m42617o();
        String m42647f = m42617o.m42632r().m42647f();
        if (m42647f != null) {
            try {
                return Long.parseLong(m42647f);
            } catch (NumberFormatException e11) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e11);
            }
        }
        String m42644c = m42617o.m42632r().m42644c();
        try {
            if (!m42644c.startsWith("1:")) {
                return Long.parseLong(m42644c);
            }
            String[] split = m42644c.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            return Long.parseLong(str);
        } catch (NumberFormatException e12) {
            Log.w("FirebaseMessaging", "error parsing app ID", e12);
            return 0L;
        }
    }

    /* renamed from: o */
    static String m17057o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    /* renamed from: p */
    static int m17058p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    /* renamed from: q */
    static String m17059q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    /* renamed from: r */
    private static boolean m17060r(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    /* renamed from: s */
    public static void m17061s(Intent intent) {
        m17066x("_nd", intent.getExtras());
    }

    /* renamed from: t */
    public static void m17062t(Intent intent) {
        m17066x("_nf", intent.getExtras());
    }

    /* renamed from: u */
    public static void m17063u(Bundle bundle) {
        m17068z(bundle);
        m17066x("_no", bundle);
    }

    /* renamed from: v */
    public static void m17064v(Intent intent) {
        if (m17041B(intent)) {
            m17066x("_nr", intent.getExtras());
        }
        if (m17040A(intent)) {
            m17065w(C9575a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.m16903w());
        }
    }

    /* renamed from: w */
    private static void m17065w(C9575a.b bVar, Intent intent, InterfaceC7303g interfaceC7303g) {
        if (interfaceC7303g == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        C9575a m17044b = m17044b(bVar, intent);
        if (m17044b == null) {
            return;
        }
        try {
            interfaceC7303g.mo21886b("FCM_CLIENT_EVENT_LOGGING", C9576b.class, C7298b.m21878b("proto"), new InterfaceC7301e() { // from class: com.google.firebase.messaging.h0
                @Override // p098f6.InterfaceC7301e
                public final Object apply(Object obj) {
                    return ((C9576b) obj).m28516c();
                }
            }).mo21884b(AbstractC7299c.m21880d(C9576b.m28514b().m28518b(m17044b).m28517a()));
        } catch (RuntimeException e10) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e10);
        }
    }

    /* renamed from: x */
    static void m17066x(String str, Bundle bundle) {
        try {
            C12867g.m42617o();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String m17046d = m17046d(bundle);
            if (m17046d != null) {
                bundle2.putString("_nmid", m17046d);
            }
            String m17047e = m17047e(bundle);
            if (m17047e != null) {
                bundle2.putString("_nmn", m17047e);
            }
            String m17051i = m17051i(bundle);
            if (!TextUtils.isEmpty(m17051i)) {
                bundle2.putString("label", m17051i);
            }
            String m17049g = m17049g(bundle);
            if (!TextUtils.isEmpty(m17049g)) {
                bundle2.putString("message_channel", m17049g);
            }
            String m17057o = m17057o(bundle);
            if (m17057o != null) {
                bundle2.putString("_nt", m17057o);
            }
            String m17052j = m17052j(bundle);
            if (m17052j != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(m17052j));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e10);
                }
            }
            String m17059q = m17059q(bundle);
            if (m17059q != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(m17059q));
                } catch (NumberFormatException e11) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e11);
                }
            }
            String m17054l = m17054l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", m17054l);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            InterfaceC1940a interfaceC1940a = (InterfaceC1940a) C12867g.m42617o().m42629k(InterfaceC1940a.class);
            if (interfaceC1940a != null) {
                interfaceC1940a.mo10146a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static void m17067y(boolean z10) {
        C12867g.m42617o().m42630m().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z10).apply();
    }

    /* renamed from: z */
    private static void m17068z(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                return;
            }
            return;
        }
        InterfaceC1940a interfaceC1940a = (InterfaceC1940a) C12867g.m42617o().m42629k(InterfaceC1940a.class);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (interfaceC1940a == null) {
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        String string = bundle.getString("google.c.a.c_id");
        interfaceC1940a.mo10148c("fcm", "_ln", string);
        Bundle bundle2 = new Bundle();
        bundle2.putString("source", "Firebase");
        bundle2.putString("medium", "notification");
        bundle2.putString("campaign", string);
        interfaceC1940a.mo10146a("fcm", "_cmp", bundle2);
    }
}
