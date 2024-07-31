package p158ia;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C5191x;
import com.google.android.gms.common.api.internal.InterfaceC5139h;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: ia.u */
/* loaded from: classes.dex */
final class BinderC7952u extends InterfaceC5139h.a {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f19320a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC7952u(C7953v c7953v, TaskCompletionSource taskCompletionSource) {
        this.f19320a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC5139h
    public final void onResult(Status status) {
        C5191x.m13204c(status, Boolean.TRUE, this.f19320a);
    }
}
