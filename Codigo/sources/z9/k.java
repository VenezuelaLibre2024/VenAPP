package z9;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k extends p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f32481a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ GoogleSignInOptions f32482b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.google.android.gms.common.api.f fVar, Context context, GoogleSignInOptions googleSignInOptions) {
        super(fVar);
        this.f32481a = context;
        this.f32482b = googleSignInOptions;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.n createFailedResult(Status status) {
        return new y9.b(null, status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.d
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((w) ((i) bVar).getService()).h2(new j(this), this.f32482b);
    }
}
