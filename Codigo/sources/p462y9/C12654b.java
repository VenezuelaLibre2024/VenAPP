package p462y9;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.InterfaceC5204n;
import com.google.android.gms.common.api.Status;

/* renamed from: y9.b */
/* loaded from: classes.dex */
public class C12654b implements InterfaceC5204n {

    /* renamed from: a */
    private final Status f34350a;

    /* renamed from: b */
    private final GoogleSignInAccount f34351b;

    public C12654b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f34351b = googleSignInAccount;
        this.f34350a = status;
    }

    /* renamed from: a */
    public GoogleSignInAccount m41637a() {
        return this.f34351b;
    }

    @Override // com.google.android.gms.common.api.InterfaceC5204n
    public Status getStatus() {
        return this.f34350a;
    }
}
