package p484z9;

import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.InterfaceC5204n;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z9.m */
/* loaded from: classes.dex */
public final class C12840m extends AbstractC12843p {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12840m(AbstractC5106f abstractC5106f) {
        super(abstractC5106f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ InterfaceC5204n createFailedResult(Status status) {
        return status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.AbstractC5123d
    protected final /* bridge */ /* synthetic */ void doExecute(C5101a.b bVar) {
        C12836i c12836i = (C12836i) bVar;
        ((C12850w) c12836i.getService()).m42597g2(new BinderC12839l(this), c12836i.m42579c());
    }
}
