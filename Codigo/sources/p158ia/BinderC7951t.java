package p158ia;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C5155l;
import com.google.android.gms.common.api.internal.C5191x;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicReference;
import p136ha.C7679g;
import p136ha.InterfaceC7673a;

/* renamed from: ia.t */
/* loaded from: classes.dex */
final class BinderC7951t extends BinderC7933b {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f19316a;

    /* renamed from: b */
    final /* synthetic */ TaskCompletionSource f19317b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC7673a f19318c;

    /* renamed from: d */
    final /* synthetic */ C7953v f19319d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC7951t(C7953v c7953v, AtomicReference atomicReference, TaskCompletionSource taskCompletionSource, InterfaceC7673a interfaceC7673a) {
        this.f19319d = c7953v;
        this.f19316a = atomicReference;
        this.f19317b = taskCompletionSource;
        this.f19318c = interfaceC7673a;
    }

    @Override // p158ia.BinderC7933b, p158ia.InterfaceC7939h
    /* renamed from: d2 */
    public final void mo24435d2(Status status, C7679g c7679g) {
        if (c7679g != null) {
            this.f19316a.set(c7679g);
        }
        C5191x.m13204c(status, null, this.f19317b);
        if (!status.m12972y1() || (c7679g != null && c7679g.m23400v1())) {
            this.f19319d.doUnregisterEventListener(C5155l.m13092c(this.f19318c, InterfaceC7673a.class.getSimpleName()), 27306);
        }
    }
}
