package p158ia;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C5191x;
import com.google.android.gms.tasks.TaskCompletionSource;
import p136ha.C7679g;

/* renamed from: ia.s */
/* loaded from: classes.dex */
final class BinderC7950s extends BinderC7933b {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f19315a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC7950s(C7953v c7953v, TaskCompletionSource taskCompletionSource) {
        this.f19315a = taskCompletionSource;
    }

    @Override // p158ia.BinderC7933b, p158ia.InterfaceC7939h
    /* renamed from: d2 */
    public final void mo24435d2(Status status, C7679g c7679g) {
        C5191x.m13204c(status, c7679g, this.f19315a);
    }
}
