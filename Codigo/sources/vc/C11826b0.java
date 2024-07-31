package vc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import p106fe.InterfaceC7337f;
import sc.C10889g;
import vc.InterfaceC11828c0;

/* renamed from: vc.b0 */
/* loaded from: classes.dex */
public class C11826b0 implements InterfaceC11828c0 {

    /* renamed from: g */
    private static final Pattern f31220g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h */
    private static final String f31221h = Pattern.quote("/");

    /* renamed from: a */
    private final C11830d0 f31222a;

    /* renamed from: b */
    private final Context f31223b;

    /* renamed from: c */
    private final String f31224c;

    /* renamed from: d */
    private final InterfaceC7337f f31225d;

    /* renamed from: e */
    private final C11869x f31226e;

    /* renamed from: f */
    private InterfaceC11828c0.a f31227f;

    public C11826b0(Context context, String str, InterfaceC7337f interfaceC7337f, C11869x c11869x) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f31223b = context;
        this.f31224c = str;
        this.f31225d = interfaceC7337f;
        this.f31226e = c11869x;
        this.f31222a = new C11830d0();
    }

    /* renamed from: b */
    private synchronized String m37675b(String str, SharedPreferences sharedPreferences) {
        String m37677e;
        m37677e = m37677e(UUID.randomUUID().toString());
        C10889g.m33216f().m33223i("Created new Crashlytics installation ID: " + m37677e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", m37677e).putString("firebase.installation.id", str).apply();
        return m37677e;
    }

    /* renamed from: c */
    static String m37676c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    /* renamed from: e */
    private static String m37677e(String str) {
        if (str == null) {
            return null;
        }
        return f31220g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: k */
    static boolean m37678k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    /* renamed from: l */
    private String m37679l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    /* renamed from: m */
    private String m37680m(String str) {
        return str.replaceAll(f31221h, "");
    }

    /* renamed from: n */
    private boolean m37681n() {
        InterfaceC11828c0.a aVar = this.f31227f;
        return aVar == null || (aVar.mo37690d() == null && this.f31226e.m37936d());
    }

    @Override // vc.InterfaceC11828c0
    /* renamed from: a */
    public synchronized InterfaceC11828c0.a mo37682a() {
        InterfaceC11828c0.a m37692b;
        if (!m37681n()) {
            return this.f31227f;
        }
        C10889g.m33216f().m33223i("Determining Crashlytics installation ID...");
        SharedPreferences m37736q = C11839i.m37736q(this.f31223b);
        String string = m37736q.getString("firebase.installation.id", null);
        C10889g.m33216f().m33223i("Cached Firebase Installation ID: " + string);
        if (this.f31226e.m37936d()) {
            String m37683d = m37683d();
            C10889g.m33216f().m33223i("Fetched Firebase Installation ID: " + m37683d);
            if (m37683d == null) {
                m37683d = string == null ? m37676c() : string;
            }
            m37692b = m37683d.equals(string) ? InterfaceC11828c0.a.m37691a(m37679l(m37736q), m37683d) : InterfaceC11828c0.a.m37691a(m37675b(m37683d, m37736q), m37683d);
        } else {
            m37692b = m37678k(string) ? InterfaceC11828c0.a.m37692b(m37679l(m37736q)) : InterfaceC11828c0.a.m37692b(m37675b(m37676c(), m37736q));
        }
        this.f31227f = m37692b;
        C10889g.m33216f().m33223i("Install IDs: " + this.f31227f);
        return this.f31227f;
    }

    /* renamed from: d */
    public String m37683d() {
        try {
            return (String) C11870x0.m37945f(this.f31225d.getId());
        } catch (Exception e10) {
            C10889g.m33216f().m33226l("Failed to retrieve Firebase Installation ID.", e10);
            return null;
        }
    }

    /* renamed from: f */
    public String m37684f() {
        return this.f31224c;
    }

    /* renamed from: g */
    public String m37685g() {
        return this.f31222a.m37695a(this.f31223b);
    }

    /* renamed from: h */
    public String m37686h() {
        return String.format(Locale.US, "%s/%s", m37680m(Build.MANUFACTURER), m37680m(Build.MODEL));
    }

    /* renamed from: i */
    public String m37687i() {
        return m37680m(Build.VERSION.INCREMENTAL);
    }

    /* renamed from: j */
    public String m37688j() {
        return m37680m(Build.VERSION.RELEASE);
    }
}
