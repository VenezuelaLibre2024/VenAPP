package com.google.android.gms.internal.p497authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.AbstractC5105e;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.internal.AbstractC5188w;
import com.google.android.gms.common.api.internal.InterfaceC5173r;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class zzr extends AbstractC5105e<C5101a.d.c> {
    private static final C5101a.g<zzw> zza;
    private static final C5101a.a<zzw, C5101a.d.c> zzb;
    private static final C5101a<C5101a.d.c> zzc;

    static {
        C5101a.g<zzw> gVar = new C5101a.g<>();
        zza = gVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new C5101a<>("SmsCodeAutofill.API", zznVar, gVar);
    }

    public zzr(Activity activity) {
        super(activity, zzc, C5101a.d.f10415l, AbstractC5105e.a.f10417c);
    }

    public zzr(Context context) {
        super(context, zzc, C5101a.d.f10415l, AbstractC5105e.a.f10417c);
    }

    public final Task<Integer> checkPermissionState() {
        return doRead(AbstractC5188w.m13190a().m13198d(zzac.zza).m13196b(new InterfaceC5173r() { // from class: com.google.android.gms.internal.auth-api-phone.zzk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC5173r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzc(new zzp(zzr.this, (TaskCompletionSource) obj2));
            }
        }).m13199e(1564).m13195a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        C5276s.m13324j(str);
        C5276s.m13316b(!str.isEmpty(), "The package name cannot be empty.");
        return doRead(AbstractC5188w.m13190a().m13198d(zzac.zza).m13196b(new InterfaceC5173r() { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC5173r
            public final void accept(Object obj, Object obj2) {
                zzr zzrVar = zzr.this;
                ((zzh) ((zzw) obj).getService()).zzd(str, new zzq(zzrVar, (TaskCompletionSource) obj2));
            }
        }).m13199e(1565).m13195a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(AbstractC5188w.m13190a().m13198d(zzac.zza).m13196b(new InterfaceC5173r() { // from class: com.google.android.gms.internal.auth-api-phone.zzl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC5173r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zze(new zzo(zzr.this, (TaskCompletionSource) obj2));
            }
        }).m13199e(1563).m13195a());
    }
}
