package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzs;
import com.google.android.gms.internal.measurement.zzv;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class m5 implements zzv {

    /* renamed from: a */
    private final /* synthetic */ i5 f10401a;

    public m5(i5 i5Var) {
        this.f10401a = i5Var;
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public final void zza(zzs zzsVar, String str, List<String> list, boolean z10, boolean z11) {
        p4 A;
        int i10 = o5.f10458a[zzsVar.ordinal()];
        if (i10 == 1) {
            A = this.f10401a.zzj().A();
        } else if (i10 == 2) {
            n4 zzj = this.f10401a.zzj();
            A = z10 ? zzj.D() : !z11 ? zzj.C() : zzj.B();
        } else if (i10 != 3) {
            A = i10 != 4 ? this.f10401a.zzj().E() : this.f10401a.zzj().F();
        } else {
            n4 zzj2 = this.f10401a.zzj();
            A = z10 ? zzj2.I() : !z11 ? zzj2.H() : zzj2.G();
        }
        int size = list.size();
        if (size == 1) {
            A.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            A.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            A.a(str);
        } else {
            A.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
