package p484z9;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C5276s;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* renamed from: z9.c */
/* loaded from: classes.dex */
public class C12830c {

    /* renamed from: c */
    private static final Lock f35021c = new ReentrantLock();

    /* renamed from: d */
    private static C12830c f35022d;

    /* renamed from: a */
    private final Lock f35023a = new ReentrantLock();

    /* renamed from: b */
    private final SharedPreferences f35024b;

    C12830c(Context context) {
        this.f35024b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: b */
    public static C12830c m42567b(Context context) {
        C5276s.m13324j(context);
        Lock lock = f35021c;
        lock.lock();
        try {
            if (f35022d == null) {
                f35022d = new C12830c(context.getApplicationContext());
            }
            C12830c c12830c = f35022d;
            lock.unlock();
            return c12830c;
        } catch (Throwable th2) {
            f35021c.unlock();
            throw th2;
        }
    }

    /* renamed from: i */
    private static final String m42568i(String str, String str2) {
        return str + ":" + str2;
    }

    /* renamed from: a */
    public void m42569a() {
        this.f35023a.lock();
        try {
            this.f35024b.edit().clear().apply();
        } finally {
            this.f35023a.unlock();
        }
    }

    /* renamed from: c */
    public GoogleSignInAccount m42570c() {
        String m42574g;
        String m42574g2 = m42574g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(m42574g2) || (m42574g = m42574g(m42568i("googleSignInAccount", m42574g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m12899D1(m42574g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public GoogleSignInOptions m42571d() {
        String m42574g;
        String m42574g2 = m42574g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(m42574g2) || (m42574g = m42574g(m42568i("googleSignInOptions", m42574g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m12915C1(m42574g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public String m42572e() {
        return m42574g("refreshToken");
    }

    /* renamed from: f */
    public void m42573f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C5276s.m13324j(googleSignInAccount);
        C5276s.m13324j(googleSignInOptions);
        m42575h("defaultGoogleSignInAccount", googleSignInAccount.m12902E1());
        C5276s.m13324j(googleSignInAccount);
        C5276s.m13324j(googleSignInOptions);
        String m12902E1 = googleSignInAccount.m12902E1();
        m42575h(m42568i("googleSignInAccount", m12902E1), googleSignInAccount.m12903F1());
        m42575h(m42568i("googleSignInOptions", m12902E1), googleSignInOptions.m12927G1());
    }

    /* renamed from: g */
    protected final String m42574g(String str) {
        this.f35023a.lock();
        try {
            return this.f35024b.getString(str, null);
        } finally {
            this.f35023a.unlock();
        }
    }

    /* renamed from: h */
    protected final void m42575h(String str, String str2) {
        this.f35023a.lock();
        try {
            this.f35024b.edit().putString(str, str2).apply();
        } finally {
            this.f35023a.unlock();
        }
    }
}
