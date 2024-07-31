package y9;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.n;

/* loaded from: classes.dex */
public class b implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Status f31814a;

    /* renamed from: b, reason: collision with root package name */
    private final GoogleSignInAccount f31815b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f31815b = googleSignInAccount;
        this.f31814a = status;
    }

    public GoogleSignInAccount a() {
        return this.f31815b;
    }

    @Override // com.google.android.gms.common.api.n
    public Status getStatus() {
        return this.f31814a;
    }
}
