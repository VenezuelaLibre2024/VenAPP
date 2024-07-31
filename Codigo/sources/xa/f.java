package xa;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.internal.safetynet.zzae;
import com.google.android.gms.internal.safetynet.zzaf;
import com.google.android.gms.internal.safetynet.zzh;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import xa.e;

/* loaded from: classes2.dex */
public class f extends com.google.android.gms.common.api.e<a.d.c> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Context context) {
        super(context, d.f30760a, (a.d) null, new com.google.android.gms.common.api.internal.a());
    }

    public Task<e.a> d(byte[] bArr, String str) {
        return com.google.android.gms.common.internal.r.a(zzae.zza(asGoogleApiClient(), bArr, str), new e.a());
    }

    public Task<e.c> e() {
        return doRead(w.a().e(4201).b(new com.google.android.gms.common.api.internal.r() { // from class: xa.r
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzaf) obj).getService()).zzf(new s(f.this, (TaskCompletionSource) obj2));
            }
        }).a());
    }
}
