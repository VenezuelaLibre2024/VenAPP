package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzhbx extends zzgyl {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, a.e.API_PRIORITY_OTHER};
    private final int zzc;
    private final zzgyl zzd;
    private final zzgyl zze;
    private final int zzf;
    private final int zzg;

    /* JADX INFO: Access modifiers changed from: private */
    public zzhbx(zzgyl zzgylVar, zzgyl zzgylVar2) {
        this.zzd = zzgylVar;
        this.zze = zzgylVar2;
        int zzd = zzgylVar.zzd();
        this.zzf = zzd;
        this.zzc = zzd + zzgylVar2.zzd();
        this.zzg = Math.max(zzgylVar.zzf(), zzgylVar2.zzf()) + 1;
    }

    public /* synthetic */ zzhbx(zzgyl zzgylVar, zzgyl zzgylVar2, zzhbw zzhbwVar) {
        this(zzgylVar, zzgylVar2);
    }

    public static zzgyl zzC(zzgyl zzgylVar, zzgyl zzgylVar2) {
        if (zzgylVar2.zzd() == 0) {
            return zzgylVar;
        }
        if (zzgylVar.zzd() == 0) {
            return zzgylVar2;
        }
        int zzd = zzgylVar.zzd() + zzgylVar2.zzd();
        if (zzd < 128) {
            return zzD(zzgylVar, zzgylVar2);
        }
        if (zzgylVar instanceof zzhbx) {
            zzhbx zzhbxVar = (zzhbx) zzgylVar;
            if (zzhbxVar.zze.zzd() + zzgylVar2.zzd() < 128) {
                return new zzhbx(zzhbxVar.zzd, zzD(zzhbxVar.zze, zzgylVar2));
            }
            if (zzhbxVar.zzd.zzf() > zzhbxVar.zze.zzf() && zzhbxVar.zzg > zzgylVar2.zzf()) {
                return new zzhbx(zzhbxVar.zzd, new zzhbx(zzhbxVar.zze, zzgylVar2));
            }
        }
        return zzd >= zzc(Math.max(zzgylVar.zzf(), zzgylVar2.zzf()) + 1) ? new zzhbx(zzgylVar, zzgylVar2) : zzhbt.zza(new zzhbt(null), zzgylVar, zzgylVar2);
    }

    private static zzgyl zzD(zzgyl zzgylVar, zzgyl zzgylVar2) {
        int zzd = zzgylVar.zzd();
        int zzd2 = zzgylVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzgylVar.zzz(bArr, 0, 0, zzd);
        zzgylVar2.zzz(bArr, 0, zzd, zzd2);
        return new zzgyh(bArr);
    }

    public static int zzc(int i10) {
        int[] iArr = zza;
        int length = iArr.length;
        return i10 >= 47 ? a.e.API_PRIORITY_OTHER : iArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgyl)) {
            return false;
        }
        zzgyl zzgylVar = (zzgyl) obj;
        if (this.zzc != zzgylVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = zzgylVar.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzhbv zzhbvVar = new zzhbv(this, null);
        zzgyg next = zzhbvVar.next();
        zzhbv zzhbvVar2 = new zzhbv(zzgylVar, null);
        zzgyg next2 = zzhbvVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int zzd = next.zzd() - i10;
            int zzd2 = next2.zzd() - i11;
            int min = Math.min(zzd, zzd2);
            if (!(i10 == 0 ? next.zzg(next2, i11, min) : next2.zzg(next, i10, min))) {
                return false;
            }
            i12 += min;
            int i13 = this.zzc;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzd) {
                next = zzhbvVar.next();
                i10 = 0;
            } else {
                i10 += min;
                next = next;
            }
            if (min == zzd2) {
                next2 = zzhbvVar2.next();
                i11 = 0;
            } else {
                i11 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyl, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzhbr(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final byte zza(int i10) {
        zzgyl.zzy(i10, this.zzc);
        return zzb(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final byte zzb(int i10) {
        int i11 = this.zzf;
        return i10 < i11 ? this.zzd.zzb(i10) : this.zze.zzb(i10 - i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            this.zzd.zze(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.zze.zze(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.zzd.zze(bArr, i10, i11, i15);
            this.zze.zze(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final int zzi(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzi(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzi(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzi(this.zzd.zzi(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final int zzj(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzj(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzj(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzj(this.zzd.zzj(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final zzgyl zzk(int i10, int i11) {
        int zzq = zzgyl.zzq(i10, i11, this.zzc);
        if (zzq == 0) {
            return zzgyl.zzb;
        }
        if (zzq == this.zzc) {
            return this;
        }
        int i12 = this.zzf;
        if (i11 <= i12) {
            return this.zzd.zzk(i10, i11);
        }
        if (i10 >= i12) {
            return this.zze.zzk(i10 - i12, i11 - i12);
        }
        zzgyl zzgylVar = this.zzd;
        return new zzhbx(zzgylVar.zzk(i10, zzgylVar.zzd()), this.zze.zzk(0, i11 - this.zzf));
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final zzgyt zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        zzhbv zzhbvVar = new zzhbv(this, null);
        while (zzhbvVar.hasNext()) {
            arrayList.add(zzhbvVar.next().zzn());
        }
        int i10 = zzgyt.zzd;
        int i11 = 0;
        int i12 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i12 += byteBuffer.remaining();
            i11 = byteBuffer.hasArray() ? i11 | 1 : byteBuffer.isDirect() ? i11 | 2 : i11 | 4;
        }
        return i11 == 2 ? new zzgyp(arrayList, i12, true, null) : zzgyt.zzH(new zzhah(arrayList), RecognitionOptions.AZTEC);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    protected final String zzm(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final void zzo(zzgya zzgyaVar) {
        this.zzd.zzo(zzgyaVar);
        this.zze.zzo(zzgyaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final boolean zzp() {
        zzgyl zzgylVar = this.zzd;
        zzgyl zzgylVar2 = this.zze;
        return zzgylVar2.zzj(zzgylVar.zzj(0, 0, this.zzf), 0, zzgylVar2.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    /* renamed from: zzs */
    public final zzgyf iterator() {
        return new zzhbr(this);
    }
}
