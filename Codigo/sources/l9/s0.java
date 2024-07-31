package l9;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzdwa;
import com.google.android.gms.internal.ads.zzdwk;
import com.google.android.gms.internal.ads.zzgej;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s0 implements zzgej {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f21129a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(c cVar) {
        this.f21129a = cVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        zzdwk zzdwkVar;
        zzdwa zzdwaVar;
        AtomicInteger atomicInteger;
        AtomicBoolean atomicBoolean;
        AtomicInteger atomicInteger2;
        com.google.android.gms.ads.internal.t.q().zzw(th2, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        c cVar = this.f21129a;
        zzdwkVar = cVar.f21054y;
        zzdwaVar = cVar.f21046f;
        atomicInteger = this.f21129a.Q;
        y.c(zzdwkVar, zzdwaVar, "sgf", new Pair("sgf_reason", th2.getMessage()), new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
        zzcec.zzh("Failed to initialize webview for loading SDKCore. ", th2);
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzjw)).booleanValue()) {
            atomicBoolean = this.f21129a.P;
            if (atomicBoolean.get()) {
                return;
            }
            atomicInteger2 = this.f21129a.Q;
            if (atomicInteger2.getAndIncrement() < ((Integer) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzjx)).intValue()) {
                this.f21129a.B2();
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
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzjw)).booleanValue()) {
            c cVar = this.f21129a;
            zzdwkVar = cVar.f21054y;
            zzdwaVar = cVar.f21046f;
            atomicInteger = cVar.Q;
            y.c(zzdwkVar, zzdwaVar, "sgs", new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
            atomicBoolean = this.f21129a.P;
            atomicBoolean.set(true);
        }
    }
}
