package xa;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.internal.safetynet.zzad;
import com.google.android.gms.internal.safetynet.zzd;
import com.google.android.gms.tasks.TaskCompletionSource;
import xa.e;

/* loaded from: classes2.dex */
final class s extends zzd {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f30774a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(f fVar, TaskCompletionSource taskCompletionSource) {
        this.f30774a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzb(Status status, boolean z10) {
        zzad zzadVar = new zzad(status, z10);
        e.c cVar = new e.c();
        cVar.b(zzadVar);
        x.b(status, cVar, this.f30774a);
    }
}
