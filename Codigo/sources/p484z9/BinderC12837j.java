package p484z9;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p462y9.C12654b;

/* renamed from: z9.j */
/* loaded from: classes.dex */
final class BinderC12837j extends BinderC12832e {

    /* renamed from: a */
    final /* synthetic */ C12838k f35031a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC12837j(C12838k c12838k) {
        this.f35031a = c12838k;
    }

    @Override // p484z9.BinderC12832e, p484z9.InterfaceC12849v
    /* renamed from: N */
    public final void mo42576N(GoogleSignInAccount googleSignInAccount, Status status) {
        if (googleSignInAccount != null) {
            C12845r.m42588c(this.f35031a.f35032a).m42593e(this.f35031a.f35033b, googleSignInAccount);
        }
        this.f35031a.setResult((C12838k) new C12654b(googleSignInAccount, status));
    }
}
