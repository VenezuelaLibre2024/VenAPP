package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.common.api.a;
import java.nio.charset.Charset;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzgg extends zzdb {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, a.e.API_PRIORITY_OTHER};
    private final int zzc;
    private final zzdb zzd;
    private final zzdb zze;
    private final int zzf;
    private final int zzg;

    /* JADX INFO: Access modifiers changed from: private */
    public zzgg(zzdb zzdbVar, zzdb zzdbVar2) {
        this.zzd = zzdbVar;
        this.zze = zzdbVar2;
        int zzd = zzdbVar.zzd();
        this.zzf = zzd;
        this.zzc = zzd + zzdbVar2.zzd();
        this.zzg = Math.max(zzdbVar.zzf(), zzdbVar2.zzf()) + 1;
    }

    public /* synthetic */ zzgg(zzdb zzdbVar, zzdb zzdbVar2, zzgf zzgfVar) {
        this(zzdbVar, zzdbVar2);
    }

    private static zzdb zzA(zzdb zzdbVar, zzdb zzdbVar2) {
        int zzd = zzdbVar.zzd();
        int zzd2 = zzdbVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzdbVar.zzw(bArr, 0, 0, zzd);
        zzdbVar2.zzw(bArr, 0, zzd, zzd2);
        return new zzcy(bArr);
    }

    public static int zzc(int i10) {
        int[] iArr = zza;
        int length = iArr.length;
        return i10 >= 47 ? a.e.API_PRIORITY_OTHER : iArr[i10];
    }

    public static zzdb zzz(zzdb zzdbVar, zzdb zzdbVar2) {
        if (zzdbVar2.zzd() == 0) {
            return zzdbVar;
        }
        if (zzdbVar.zzd() == 0) {
            return zzdbVar2;
        }
        int zzd = zzdbVar.zzd() + zzdbVar2.zzd();
        if (zzd < 128) {
            return zzA(zzdbVar, zzdbVar2);
        }
        if (zzdbVar instanceof zzgg) {
            zzgg zzggVar = (zzgg) zzdbVar;
            if (zzggVar.zze.zzd() + zzdbVar2.zzd() < 128) {
                return new zzgg(zzggVar.zzd, zzA(zzggVar.zze, zzdbVar2));
            }
            if (zzggVar.zzd.zzf() > zzggVar.zze.zzf() && zzggVar.zzg > zzdbVar2.zzf()) {
                return new zzgg(zzggVar.zzd, new zzgg(zzggVar.zze, zzdbVar2));
            }
        }
        return zzd >= zzc(Math.max(zzdbVar.zzf(), zzdbVar2.zzf()) + 1) ? new zzgg(zzdbVar, zzdbVar2) : zzgc.zza(new zzgc(null), zzdbVar, zzdbVar2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdb)) {
            return false;
        }
        zzdb zzdbVar = (zzdb) obj;
        if (this.zzc != zzdbVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzp = zzp();
        int zzp2 = zzdbVar.zzp();
        if (zzp != 0 && zzp2 != 0 && zzp != zzp2) {
            return false;
        }
        zzge zzgeVar = new zzge(this, null);
        zzcx next = zzgeVar.next();
        zzge zzgeVar2 = new zzge(zzdbVar, null);
        zzcx next2 = zzgeVar2.next();
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
                next = zzgeVar.next();
                i10 = 0;
            } else {
                i10 += min;
                next = next;
            }
            if (min == zzd2) {
                next2 = zzgeVar2.next();
                i11 = 0;
            } else {
                i11 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzga(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final byte zza(int i10) {
        zzdb.zzv(i10, this.zzc);
        return zzb(i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final byte zzb(int i10) {
        int i11 = this.zzf;
        return i10 < i11 ? this.zzd.zzb(i10) : this.zze.zzb(i10 - i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
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

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
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

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
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

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final zzdb zzk(int i10, int i11) {
        int zzo = zzdb.zzo(i10, i11, this.zzc);
        if (zzo == 0) {
            return zzdb.zzb;
        }
        if (zzo == this.zzc) {
            return this;
        }
        int i12 = this.zzf;
        if (i11 <= i12) {
            return this.zzd.zzk(i10, i11);
        }
        if (i10 >= i12) {
            return this.zze.zzk(i10 - i12, i11 - i12);
        }
        zzdb zzdbVar = this.zzd;
        return new zzgg(zzdbVar.zzk(i10, zzdbVar.zzd()), this.zze.zzk(0, i11 - this.zzf));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    protected final String zzl(Charset charset) {
        return new String(zzx(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final void zzm(zzcr zzcrVar) {
        this.zzd.zzm(zzcrVar);
        this.zze.zzm(zzcrVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final boolean zzn() {
        int zzj = this.zzd.zzj(0, 0, this.zzf);
        zzdb zzdbVar = this.zze;
        return zzdbVar.zzj(zzj, 0, zzdbVar.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    /* renamed from: zzq */
    public final zzcw iterator() {
        return new zzga(this);
    }
}
