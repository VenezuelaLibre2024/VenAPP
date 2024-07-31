package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.common.api.a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class zzdb implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzdb zzb = new zzcy(zzem.zzd);
    private static final zzda zzd;
    private int zzc = 0;

    static {
        int i10 = zzcn.zza;
        zzd = new zzda(null);
        zza = new zzct();
    }

    private static zzdb zzc(Iterator it, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
        }
        if (i10 == 1) {
            return (zzdb) it.next();
        }
        int i11 = i10 >>> 1;
        zzdb zzc = zzc(it, i11);
        zzdb zzc2 = zzc(it, i10 - i11);
        if (a.e.API_PRIORITY_OTHER - zzc.zzd() >= zzc2.zzd()) {
            return zzgg.zzz(zzc, zzc2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + zzc.zzd() + "+" + zzc2.zzd());
    }

    public static int zzo(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static zzdb zzr(byte[] bArr, int i10, int i11) {
        zzo(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzcy(bArr2);
    }

    public static zzdb zzs(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        int i10 = RecognitionOptions.QR_CODE;
        while (true) {
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = inputStream.read(bArr, i11, i10 - i11);
                if (read == -1) {
                    break;
                }
                i11 += read;
            }
            zzdb zzr = i11 == 0 ? null : zzr(bArr, 0, i11);
            if (zzr == null) {
                break;
            }
            arrayList.add(zzr);
            i10 = Math.min(i10 + i10, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? zzb : zzc(arrayList.iterator(), size);
    }

    public static void zzv(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zzc;
        if (i10 == 0) {
            int zzd2 = zzd();
            i10 = zzi(zzd2, 0, zzd2);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zzc = i10;
        }
        return i10;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzgw.zza(this) : zzgw.zza(zzk(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i10);

    public abstract byte zzb(int i10);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i10, int i11, int i12);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i10, int i11, int i12);

    public abstract int zzj(int i10, int i11, int i12);

    public abstract zzdb zzk(int i10, int i11);

    protected abstract String zzl(Charset charset);

    public abstract void zzm(zzcr zzcrVar);

    public abstract boolean zzn();

    public final int zzp() {
        return this.zzc;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzq */
    public zzcw iterator() {
        return new zzcs(this);
    }

    public final String zzt(Charset charset) {
        return zzd() == 0 ? "" : zzl(charset);
    }

    public final String zzu() {
        return zzt(zzem.zzb);
    }

    @Deprecated
    public final void zzw(byte[] bArr, int i10, int i11, int i12) {
        zzo(0, i12, zzd());
        zzo(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            zze(bArr, 0, i11, i12);
        }
    }

    public final byte[] zzx() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzem.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }
}
