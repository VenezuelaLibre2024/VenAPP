package z9;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class j extends e {

    /* renamed from: a */
    final /* synthetic */ k f32480a;

    public j(k kVar) {
        this.f32480a = kVar;
    }

    @Override // z9.e, z9.v
    public final void N(GoogleSignInAccount googleSignInAccount, Status status) {
        if (googleSignInAccount != null) {
            r.c(this.f32480a.f32481a).e(this.f32480a.f32482b, googleSignInAccount);
        }
        this.f32480a.setResult((k) new y9.b(googleSignInAccount, status));
    }
}
