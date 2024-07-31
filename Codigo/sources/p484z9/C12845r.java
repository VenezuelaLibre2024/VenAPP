package p484z9;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: z9.r */
/* loaded from: classes.dex */
public final class C12845r {

    /* renamed from: d */
    private static C12845r f35037d;

    /* renamed from: a */
    final C12830c f35038a;

    /* renamed from: b */
    GoogleSignInAccount f35039b;

    /* renamed from: c */
    GoogleSignInOptions f35040c;

    private C12845r(Context context) {
        C12830c m42567b = C12830c.m42567b(context);
        this.f35038a = m42567b;
        this.f35039b = m42567b.m42570c();
        this.f35040c = m42567b.m42571d();
    }

    /* renamed from: c */
    public static synchronized C12845r m42588c(Context context) {
        C12845r m42589f;
        synchronized (C12845r.class) {
            m42589f = m42589f(context.getApplicationContext());
        }
        return m42589f;
    }

    /* renamed from: f */
    private static synchronized C12845r m42589f(Context context) {
        synchronized (C12845r.class) {
            C12845r c12845r = f35037d;
            if (c12845r != null) {
                return c12845r;
            }
            C12845r c12845r2 = new C12845r(context);
            f35037d = c12845r2;
            return c12845r2;
        }
    }

    /* renamed from: a */
    public final synchronized GoogleSignInAccount m42590a() {
        return this.f35039b;
    }

    /* renamed from: b */
    public final synchronized GoogleSignInOptions m42591b() {
        return this.f35040c;
    }

    /* renamed from: d */
    public final synchronized void m42592d() {
        this.f35038a.m42569a();
        this.f35039b = null;
        this.f35040c = null;
    }

    /* renamed from: e */
    public final synchronized void m42593e(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f35038a.m42573f(googleSignInAccount, googleSignInOptions);
        this.f35039b = googleSignInAccount;
        this.f35040c = googleSignInOptions;
    }
}
