package p440xa;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C5191x;
import com.google.android.gms.internal.safetynet.zzad;
import com.google.android.gms.internal.safetynet.zzd;
import com.google.android.gms.tasks.TaskCompletionSource;
import p440xa.InterfaceC12398e;

/* renamed from: xa.s */
/* loaded from: classes2.dex */
final class BinderC12412s extends zzd {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f33294a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC12412s(C12399f c12399f, TaskCompletionSource taskCompletionSource) {
        this.f33294a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzb(Status status, boolean z10) {
        zzad zzadVar = new zzad(status, z10);
        InterfaceC12398e.c cVar = new InterfaceC12398e.c();
        cVar.m13214b(zzadVar);
        C5191x.m13203b(status, cVar, this.f33294a);
    }
}
