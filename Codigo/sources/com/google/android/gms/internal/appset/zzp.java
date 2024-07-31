package com.google.android.gms.internal.appset;

import android.content.Context;
import ca.g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import q9.b;
import q9.c;
import q9.d;
import q9.h;

/* loaded from: classes2.dex */
public final class zzp extends e<a.d.c> implements b {
    private static final a.g<zzd> zza;
    private static final a.AbstractC0146a<zzd, a.d.c> zzb;
    private static final a<a.d.c> zzc;
    private final Context zzd;
    private final g zze;

    static {
        a.g<zzd> gVar = new a.g<>();
        zza = gVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new a<>("AppSet.API", zznVar, gVar);
    }

    public zzp(Context context, g gVar) {
        super(context, zzc, a.d.f9307l, e.a.f9309c);
        this.zzd = context;
        this.zze = gVar;
    }

    @Override // q9.b
    public final Task<c> getAppSetIdInfo() {
        return this.zze.h(this.zzd, 212800000) == 0 ? doRead(w.a().d(h.f23796a).b(new r() { // from class: com.google.android.gms.internal.appset.zzm
            public /* synthetic */ zzm() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzd) obj).getService()).zzc(new d(null, null), new zzo(zzp.this, (TaskCompletionSource) obj2));
            }
        }).c(false).e(27601).a()) : Tasks.forException(new com.google.android.gms.common.api.b(new Status(17)));
    }
}
