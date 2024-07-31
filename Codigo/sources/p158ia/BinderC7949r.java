package p158ia;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C5191x;
import com.google.android.gms.tasks.TaskCompletionSource;
import p136ha.C7674b;

/* renamed from: ia.r */
/* loaded from: classes.dex */
final class BinderC7949r extends BinderC7933b {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f19314a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC7949r(C7953v c7953v, TaskCompletionSource taskCompletionSource) {
        this.f19314a = taskCompletionSource;
    }

    @Override // p158ia.BinderC7933b, p158ia.InterfaceC7939h
    /* renamed from: J1 */
    public final void mo24432J1(Status status, C7674b c7674b) {
        C5191x.m13204c(status, c7674b, this.f19314a);
    }
}
