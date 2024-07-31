package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class zzr extends e<a.d.c> {
    private static final a.g<zzw> zza;
    private static final a.AbstractC0146a<zzw, a.d.c> zzb;
    private static final a<a.d.c> zzc;

    static {
        a.g<zzw> gVar = new a.g<>();
        zza = gVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new a<>("SmsCodeAutofill.API", zznVar, gVar);
    }

    public zzr(Activity activity) {
        super(activity, zzc, a.d.f9307l, e.a.f9309c);
    }

    public zzr(Context context) {
        super(context, zzc, a.d.f9307l, e.a.f9309c);
    }

    public final Task<Integer> checkPermissionState() {
        return doRead(w.a().d(zzac.zza).b(new r() { // from class: com.google.android.gms.internal.auth-api-phone.zzk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzc(new zzp(zzr.this, (TaskCompletionSource) obj2));
            }
        }).e(1564).a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        s.j(str);
        s.b(!str.isEmpty(), "The package name cannot be empty.");
        return doRead(w.a().d(zzac.zza).b(new r() { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                zzr zzrVar = zzr.this;
                ((zzh) ((zzw) obj).getService()).zzd(str, new zzq(zzrVar, (TaskCompletionSource) obj2));
            }
        }).e(1565).a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(w.a().d(zzac.zza).b(new r() { // from class: com.google.android.gms.internal.auth-api-phone.zzl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zze(new zzo(zzr.this, (TaskCompletionSource) obj2));
            }
        }).e(1563).a());
    }
}
