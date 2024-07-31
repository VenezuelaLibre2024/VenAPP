package com.google.android.gms.internal.p498firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzald implements zzakl {
    private final zzakn zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzald(zzakn zzaknVar, String str, Object[] objArr) {
        this.zza = zzaknVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                this.zzd = i10 | (charAt2 << i11);
                return;
            } else {
                i10 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzakl
    public final zzakn zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzakl
    public final zzaky zzb() {
        int i10 = this.zzd;
        return (i10 & 1) != 0 ? zzaky.PROTO2 : (i10 & 4) == 4 ? zzaky.EDITIONS : zzaky.PROTO3;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzakl
    public final boolean zzc() {
        return (this.zzd & 2) == 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzd() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] zze() {
        return this.zzc;
    }
}
