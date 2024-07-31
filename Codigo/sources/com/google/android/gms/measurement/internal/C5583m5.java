package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzs;
import com.google.android.gms.internal.measurement.zzv;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.m5 */
/* loaded from: classes2.dex */
public final class C5583m5 implements zzv {

    /* renamed from: a */
    private final /* synthetic */ C5531i5 f11588a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5583m5(C5531i5 c5531i5) {
        this.f11588a = c5531i5;
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public final void zza(zzs zzsVar, String str, List<String> list, boolean z10, boolean z11) {
        C5621p4 m14181A;
        int i10 = C5609o5.f11645a[zzsVar.ordinal()];
        if (i10 == 1) {
            m14181A = this.f11588a.zzj().m14181A();
        } else if (i10 == 2) {
            C5595n4 zzj = this.f11588a.zzj();
            m14181A = z10 ? zzj.m14184D() : !z11 ? zzj.m14183C() : zzj.m14182B();
        } else if (i10 != 3) {
            m14181A = i10 != 4 ? this.f11588a.zzj().m14185E() : this.f11588a.zzj().m14186F();
        } else {
            C5595n4 zzj2 = this.f11588a.zzj();
            m14181A = z10 ? zzj2.m14189I() : !z11 ? zzj2.m14188H() : zzj2.m14187G();
        }
        int size = list.size();
        if (size == 1) {
            m14181A.m14219b(str, list.get(0));
            return;
        }
        if (size == 2) {
            m14181A.m14220c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            m14181A.m14218a(str);
        } else {
            m14181A.m14221d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
