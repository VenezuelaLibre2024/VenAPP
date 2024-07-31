package vc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import vc.c0;

/* loaded from: classes.dex */
public class b0 implements c0 {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f28786g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    private static final String f28787h = Pattern.quote("/");

    /* renamed from: a, reason: collision with root package name */
    private final d0 f28788a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f28789b;

    /* renamed from: c, reason: collision with root package name */
    private final String f28790c;

    /* renamed from: d, reason: collision with root package name */
    private final fe.f f28791d;

    /* renamed from: e, reason: collision with root package name */
    private final x f28792e;

    /* renamed from: f, reason: collision with root package name */
    private c0.a f28793f;

    public b0(Context context, String str, fe.f fVar, x xVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f28789b = context;
        this.f28790c = str;
        this.f28791d = fVar;
        this.f28792e = xVar;
        this.f28788a = new d0();
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e10;
        e10 = e(UUID.randomUUID().toString());
        sc.g.f().i("Created new Crashlytics installation ID: " + e10 + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e10).putString("firebase.installation.id", str).apply();
        return e10;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private static String e(String str) {
        if (str == null) {
            return null;
        }
        return f28786g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(f28787h, "");
    }

    private boolean n() {
        c0.a aVar = this.f28793f;
        return aVar == null || (aVar.d() == null && this.f28792e.d());
    }

    @Override // vc.c0
    public synchronized c0.a a() {
        c0.a b10;
        if (!n()) {
            return this.f28793f;
        }
        sc.g.f().i("Determining Crashlytics installation ID...");
        SharedPreferences q10 = i.q(this.f28789b);
        String string = q10.getString("firebase.installation.id", null);
        sc.g.f().i("Cached Firebase Installation ID: " + string);
        if (this.f28792e.d()) {
            String d10 = d();
            sc.g.f().i("Fetched Firebase Installation ID: " + d10);
            if (d10 == null) {
                d10 = string == null ? c() : string;
            }
            b10 = d10.equals(string) ? c0.a.a(l(q10), d10) : c0.a.a(b(d10, q10), d10);
        } else {
            b10 = k(string) ? c0.a.b(l(q10)) : c0.a.b(b(c(), q10));
        }
        this.f28793f = b10;
        sc.g.f().i("Install IDs: " + this.f28793f);
        return this.f28793f;
    }

    public String d() {
        try {
            return (String) x0.f(this.f28791d.getId());
        } catch (Exception e10) {
            sc.g.f().l("Failed to retrieve Firebase Installation ID.", e10);
            return null;
        }
    }

    public String f() {
        return this.f28790c;
    }

    public String g() {
        return this.f28788a.a(this.f28789b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
