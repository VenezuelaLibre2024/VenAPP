package z9;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: d */
    private static r f32486d;

    /* renamed from: a */
    final c f32487a;

    /* renamed from: b */
    GoogleSignInAccount f32488b;

    /* renamed from: c */
    GoogleSignInOptions f32489c;

    private r(Context context) {
        c b10 = c.b(context);
        this.f32487a = b10;
        this.f32488b = b10.c();
        this.f32489c = b10.d();
    }

    public static synchronized r c(Context context) {
        r f10;
        synchronized (r.class) {
            f10 = f(context.getApplicationContext());
        }
        return f10;
    }

    private static synchronized r f(Context context) {
        synchronized (r.class) {
            r rVar = f32486d;
            if (rVar != null) {
                return rVar;
            }
            r rVar2 = new r(context);
            f32486d = rVar2;
            return rVar2;
        }
    }

    public final synchronized GoogleSignInAccount a() {
        return this.f32488b;
    }

    public final synchronized GoogleSignInOptions b() {
        return this.f32489c;
    }

    public final synchronized void d() {
        this.f32487a.a();
        this.f32488b = null;
        this.f32489c = null;
    }

    public final synchronized void e(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f32487a.f(googleSignInAccount, googleSignInOptions);
        this.f32488b = googleSignInAccount;
        this.f32489c = googleSignInOptions;
    }
}
