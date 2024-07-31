package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.n4;

/* loaded from: classes2.dex */
public final class zzbjb extends ea.a {
    public static final Parcelable.Creator<zzbjb> CREATOR = new zzbjc();
    public final int zza;
    public final boolean zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final n4 zzf;
    public final boolean zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final int zzk;

    public zzbjb(int i10, boolean z10, int i11, boolean z11, int i12, n4 n4Var, boolean z12, int i13, int i14, boolean z13, int i15) {
        this.zza = i10;
        this.zzb = z10;
        this.zzc = i11;
        this.zzd = z11;
        this.zze = i12;
        this.zzf = n4Var;
        this.zzg = z12;
        this.zzh = i13;
        this.zzj = z13;
        this.zzi = i14;
        this.zzk = i15;
    }

    @Deprecated
    public zzbjb(a9.e eVar) {
        this(4, eVar.f(), eVar.b(), eVar.e(), eVar.a(), eVar.d() != null ? new n4(eVar.d()) : null, eVar.g(), eVar.c(), 0, false, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r1 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.ads.nativead.c zza(com.google.android.gms.internal.ads.zzbjb r5) {
        /*
            com.google.android.gms.ads.nativead.c$a r0 = new com.google.android.gms.ads.nativead.c$a
            r0.<init>()
            if (r5 != 0) goto Lc
            com.google.android.gms.ads.nativead.c r5 = r0.a()
            return r5
        Lc:
            int r1 = r5.zza
            r2 = 2
            if (r1 == r2) goto L45
            r3 = 3
            if (r1 == r3) goto L39
            r4 = 4
            if (r1 == r4) goto L18
            goto L4a
        L18:
            boolean r1 = r5.zzg
            r0.e(r1)
            int r1 = r5.zzh
            r0.d(r1)
            int r1 = r5.zzi
            boolean r4 = r5.zzj
            r0.b(r1, r4)
            int r1 = r5.zzk
            r4 = 1
            if (r1 != 0) goto L30
        L2e:
            r2 = r4
            goto L36
        L30:
            if (r1 != r2) goto L34
            r2 = r3
            goto L36
        L34:
            if (r1 != r4) goto L2e
        L36:
            r0.q(r2)
        L39:
            com.google.android.gms.ads.internal.client.n4 r1 = r5.zzf
            if (r1 == 0) goto L45
            x8.c0 r2 = new x8.c0
            r2.<init>(r1)
            r0.h(r2)
        L45:
            int r1 = r5.zze
            r0.c(r1)
        L4a:
            boolean r1 = r5.zzb
            r0.g(r1)
            boolean r5 = r5.zzd
            r0.f(r5)
            com.google.android.gms.ads.nativead.c r5 = r0.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbjb.zza(com.google.android.gms.internal.ads.zzbjb):com.google.android.gms.ads.nativead.c");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, i11);
        ea.c.g(parcel, 2, this.zzb);
        ea.c.u(parcel, 3, this.zzc);
        ea.c.g(parcel, 4, this.zzd);
        ea.c.u(parcel, 5, this.zze);
        ea.c.E(parcel, 6, this.zzf, i10, false);
        ea.c.g(parcel, 7, this.zzg);
        ea.c.u(parcel, 8, this.zzh);
        ea.c.u(parcel, 9, this.zzi);
        ea.c.g(parcel, 10, this.zzj);
        ea.c.u(parcel, 11, this.zzk);
        ea.c.b(parcel, a10);
    }
}
