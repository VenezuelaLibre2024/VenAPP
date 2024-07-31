package p440xa;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC5105e;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.internal.AbstractC5188w;
import com.google.android.gms.common.api.internal.C5111a;
import com.google.android.gms.common.api.internal.InterfaceC5173r;
import com.google.android.gms.common.internal.C5273r;
import com.google.android.gms.internal.safetynet.zzae;
import com.google.android.gms.internal.safetynet.zzaf;
import com.google.android.gms.internal.safetynet.zzh;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p440xa.InterfaceC12398e;

/* renamed from: xa.f */
/* loaded from: classes2.dex */
public class C12399f extends AbstractC5105e<C5101a.d.c> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12399f(Context context) {
        super(context, C12397d.f33280a, (C5101a.d) null, new C5111a());
    }

    /* renamed from: d */
    public Task<InterfaceC12398e.a> m40064d(byte[] bArr, String str) {
        return C5273r.m13311a(zzae.zza(asGoogleApiClient(), bArr, str), new InterfaceC12398e.a());
    }

    /* renamed from: e */
    public Task<InterfaceC12398e.c> m40065e() {
        return doRead(AbstractC5188w.m13190a().m13199e(4201).m13196b(new InterfaceC5173r() { // from class: xa.r
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC5173r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzaf) obj).getService()).zzf(new BinderC12412s(C12399f.this, (TaskCompletionSource) obj2));
            }
        }).m13195a());
    }
}
