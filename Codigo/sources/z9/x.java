package z9;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes.dex */
public final class x extends s {

    /* renamed from: a, reason: collision with root package name */
    private final Context f32490a;

    public x(Context context) {
        this.f32490a = context;
    }

    private final void f2() {
        if (la.u.a(this.f32490a, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // z9.t
    public final void i() {
        f2();
        r.c(this.f32490a).d();
    }

    @Override // z9.t
    public final void s() {
        f2();
        c b10 = c.b(this.f32490a);
        GoogleSignInAccount c10 = b10.c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f9249w;
        if (c10 != null) {
            googleSignInOptions = b10.d();
        }
        com.google.android.gms.auth.api.signin.b a10 = com.google.android.gms.auth.api.signin.a.a(this.f32490a, googleSignInOptions);
        if (c10 != null) {
            a10.e();
        } else {
            a10.signOut();
        }
    }
}
