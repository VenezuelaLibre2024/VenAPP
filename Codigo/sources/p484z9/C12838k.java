package p484z9;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.InterfaceC5204n;
import com.google.android.gms.common.api.Status;
import p462y9.C12654b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z9.k */
/* loaded from: classes.dex */
public final class C12838k extends AbstractC12843p {

    /* renamed from: a */
    final /* synthetic */ Context f35032a;

    /* renamed from: b */
    final /* synthetic */ GoogleSignInOptions f35033b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12838k(AbstractC5106f abstractC5106f, Context context, GoogleSignInOptions googleSignInOptions) {
        super(abstractC5106f);
        this.f35032a = context;
        this.f35033b = googleSignInOptions;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ InterfaceC5204n createFailedResult(Status status) {
        return new C12654b(null, status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.AbstractC5123d
    protected final /* bridge */ /* synthetic */ void doExecute(C5101a.b bVar) {
        ((C12850w) ((C12836i) bVar).getService()).m42598h2(new BinderC12837j(this), this.f35033b);
    }
}
