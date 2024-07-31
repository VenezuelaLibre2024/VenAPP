package p484z9;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.C5093a;
import com.google.android.gms.auth.api.signin.C5094b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import la.C9476u;

/* renamed from: z9.x */
/* loaded from: classes.dex */
public final class BinderC12851x extends AbstractBinderC12846s {

    /* renamed from: a */
    private final Context f35041a;

    public BinderC12851x(Context context) {
        this.f35041a = context;
    }

    /* renamed from: f2 */
    private final void m42599f2() {
        if (C9476u.m28181a(this.f35041a, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // p484z9.InterfaceC12847t
    /* renamed from: i */
    public final void mo42594i() {
        m42599f2();
        C12845r.m42588c(this.f35041a).m42592d();
    }

    @Override // p484z9.InterfaceC12847t
    /* renamed from: s */
    public final void mo42595s() {
        m42599f2();
        C12830c m42567b = C12830c.m42567b(this.f35041a);
        GoogleSignInAccount m42570c = m42567b.m42570c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f10357w;
        if (m42570c != null) {
            googleSignInOptions = m42567b.m42571d();
        }
        C5094b m12947a = C5093a.m12947a(this.f35041a, googleSignInOptions);
        if (m42570c != null) {
            m12947a.m12955e();
        } else {
            m12947a.signOut();
        }
    }
}
