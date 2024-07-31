package p218l9;

import android.util.Pair;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzdwa;
import com.google.android.gms.internal.ads.zzdwk;
import com.google.android.gms.internal.ads.zzgej;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l9.s0 */
/* loaded from: classes.dex */
public final class C9448s0 implements zzgej {

    /* renamed from: a */
    final /* synthetic */ BinderC9415c f22982a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9448s0(BinderC9415c binderC9415c) {
        this.f22982a = binderC9415c;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        zzdwk zzdwkVar;
        zzdwa zzdwaVar;
        AtomicInteger atomicInteger;
        AtomicBoolean atomicBoolean;
        AtomicInteger atomicInteger2;
        C4965t.m12580q().zzw(th2, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        BinderC9415c binderC9415c = this.f22982a;
        zzdwkVar = binderC9415c.f22907y;
        zzdwaVar = binderC9415c.f22899f;
        atomicInteger = this.f22982a.f22892Q;
        C9454y.m28109c(zzdwkVar, zzdwaVar, "sgf", new Pair("sgf_reason", th2.getMessage()), new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
        zzcec.zzh("Failed to initialize webview for loading SDKCore. ", th2);
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzjw)).booleanValue()) {
            atomicBoolean = this.f22982a.f22891P;
            if (atomicBoolean.get()) {
                return;
            }
            atomicInteger2 = this.f22982a.f22892Q;
            if (atomicInteger2.getAndIncrement() < ((Integer) C4784a0.m12365c().zza(zzbgc.zzjx)).intValue()) {
                this.f22982a.m28047B2();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdwk zzdwkVar;
        zzdwa zzdwaVar;
        AtomicInteger atomicInteger;
        AtomicBoolean atomicBoolean;
        zzcec.zze("Initialized webview successfully for SDKCore.");
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzjw)).booleanValue()) {
            BinderC9415c binderC9415c = this.f22982a;
            zzdwkVar = binderC9415c.f22907y;
            zzdwaVar = binderC9415c.f22899f;
            atomicInteger = binderC9415c.f22892Q;
            C9454y.m28109c(zzdwkVar, zzdwaVar, "sgs", new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
            atomicBoolean = this.f22982a.f22891P;
            atomicBoolean.set(true);
        }
    }
}
