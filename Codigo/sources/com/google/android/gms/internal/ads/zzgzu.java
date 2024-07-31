package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.ads.zzgzp;
import com.google.android.gms.internal.ads.zzgzu;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class zzgzu<MessageType extends zzgzu<MessageType, BuilderType>, BuilderType extends zzgzp<MessageType, BuilderType>> extends zzgxt<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzhcq zzc = zzhcq.zzc();

    private final int zza(zzhby zzhbyVar) {
        return zzhbn.zza().zzb(getClass()).zza(this);
    }

    public static zzgzu zzaC(Class cls) {
        Map map = zzb;
        zzgzu zzgzuVar = (zzgzu) map.get(cls);
        if (zzgzuVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgzuVar = (zzgzu) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzgzuVar == null) {
            zzgzuVar = (zzgzu) ((zzgzu) zzhcz.zzg(cls)).zzb(6, null, null);
            if (zzgzuVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzgzuVar);
        }
        return zzgzuVar;
    }

    public static zzgzu zzaE(zzgzu zzgzuVar, zzgyl zzgylVar) {
        zzgzf zzgzfVar = zzgzf.zza;
        zzgyt zzl = zzgylVar.zzl();
        zzgzu zzaD = zzgzuVar.zzaD();
        try {
            zzhby zzb2 = zzhbn.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgyu.zzq(zzl), zzgzfVar);
            zzb2.zzf(zzaD);
            try {
                zzl.zzz(0);
                zzc(zzaD);
                zzc(zzaD);
                return zzaD;
            } catch (zzhag e10) {
                e10.zzh(zzaD);
                throw e10;
            }
        } catch (zzhag e11) {
            e = e11;
            if (e.zzl()) {
                e = new zzhag(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzhco e12) {
            zzhag zza = e12.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e13) {
            if (e13.getCause() instanceof zzhag) {
                throw ((zzhag) e13.getCause());
            }
            zzhag zzhagVar = new zzhag(e13);
            zzhagVar.zzh(zzaD);
            throw zzhagVar;
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof zzhag) {
                throw ((zzhag) e14.getCause());
            }
            throw e14;
        }
    }

    public static zzgzu zzaF(zzgzu zzgzuVar, byte[] bArr) {
        zzgzu zzd = zzd(zzgzuVar, bArr, 0, bArr.length, zzgzf.zza);
        zzc(zzd);
        return zzd;
    }

    public static zzgzu zzaG(zzgzu zzgzuVar, zzgyl zzgylVar, zzgzf zzgzfVar) {
        zzgyt zzl = zzgylVar.zzl();
        zzgzu zzaD = zzgzuVar.zzaD();
        try {
            zzhby zzb2 = zzhbn.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgyu.zzq(zzl), zzgzfVar);
            zzb2.zzf(zzaD);
            try {
                zzl.zzz(0);
                zzc(zzaD);
                return zzaD;
            } catch (zzhag e10) {
                e10.zzh(zzaD);
                throw e10;
            }
        } catch (zzhag e11) {
            e = e11;
            if (e.zzl()) {
                e = new zzhag(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzhco e12) {
            zzhag zza = e12.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e13) {
            if (e13.getCause() instanceof zzhag) {
                throw ((zzhag) e13.getCause());
            }
            zzhag zzhagVar = new zzhag(e13);
            zzhagVar.zzh(zzaD);
            throw zzhagVar;
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof zzhag) {
                throw ((zzhag) e14.getCause());
            }
            throw e14;
        }
    }

    public static zzgzu zzaH(zzgzu zzgzuVar, InputStream inputStream, zzgzf zzgzfVar) {
        zzgyt zzH = zzgyt.zzH(inputStream, RecognitionOptions.AZTEC);
        zzgzu zzaD = zzgzuVar.zzaD();
        try {
            zzhby zzb2 = zzhbn.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgyu.zzq(zzH), zzgzfVar);
            zzb2.zzf(zzaD);
            zzc(zzaD);
            return zzaD;
        } catch (zzhag e10) {
            e = e10;
            if (e.zzl()) {
                e = new zzhag(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzhco e11) {
            zzhag zza = e11.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzhag) {
                throw ((zzhag) e12.getCause());
            }
            zzhag zzhagVar = new zzhag(e12);
            zzhagVar.zzh(zzaD);
            throw zzhagVar;
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzhag) {
                throw ((zzhag) e13.getCause());
            }
            throw e13;
        }
    }

    public static zzgzu zzaI(zzgzu zzgzuVar, byte[] bArr, zzgzf zzgzfVar) {
        zzgzu zzd = zzd(zzgzuVar, bArr, 0, bArr.length, zzgzfVar);
        zzc(zzd);
        return zzd;
    }

    public static zzgzz zzaJ() {
        return zzgzv.zzf();
    }

    public static zzgzz zzaK(zzgzz zzgzzVar) {
        int size = zzgzzVar.size();
        return zzgzzVar.zzd(size == 0 ? 10 : size + size);
    }

    public static zzhac zzaL() {
        return zzhat.zzf();
    }

    public static zzhac zzaM(zzhac zzhacVar) {
        int size = zzhacVar.size();
        return zzhacVar.zzd(size == 0 ? 10 : size + size);
    }

    public static zzhad zzaN() {
        return zzhbo.zze();
    }

    public static zzhad zzaO(zzhad zzhadVar) {
        int size = zzhadVar.size();
        return zzhadVar.zzd(size == 0 ? 10 : size + size);
    }

    public static Object zzaQ(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzaR(zzhbe zzhbeVar, String str, Object[] objArr) {
        return new zzhbp(zzhbeVar, str, objArr);
    }

    public static void zzaU(Class cls, zzgzu zzgzuVar) {
        zzgzuVar.zzaT();
        zzb.put(cls, zzgzuVar);
    }

    private static zzgzu zzc(zzgzu zzgzuVar) {
        if (zzgzuVar == null || zzgzuVar.zzaX()) {
            return zzgzuVar;
        }
        zzhag zza = new zzhco(zzgzuVar).zza();
        zza.zzh(zzgzuVar);
        throw zza;
    }

    private static zzgzu zzd(zzgzu zzgzuVar, byte[] bArr, int i10, int i11, zzgzf zzgzfVar) {
        zzgzu zzaD = zzgzuVar.zzaD();
        try {
            zzhby zzb2 = zzhbn.zza().zzb(zzaD.getClass());
            zzb2.zzi(zzaD, bArr, 0, i11, new zzgxx(zzgzfVar));
            zzb2.zzf(zzaD);
            return zzaD;
        } catch (zzhag e10) {
            e = e10;
            if (e.zzl()) {
                e = new zzhag(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzhco e11) {
            zzhag zza = e11.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzhag) {
                throw ((zzhag) e12.getCause());
            }
            zzhag zzhagVar = new zzhag(e12);
            zzhagVar.zzh(zzaD);
            throw zzhagVar;
        } catch (IndexOutOfBoundsException unused) {
            zzhag zzj = zzhag.zzj();
            zzj.zzh(zzaD);
            throw zzj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzhbn.zza().zzb(getClass()).zzj(this, (zzgzu) obj);
    }

    public final int hashCode() {
        if (zzaY()) {
            return zzay();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int zzay = zzay();
        this.zza = zzay;
        return zzay;
    }

    public final String toString() {
        return zzhbg.zza(this, super.toString());
    }

    public final zzgzp zzaA() {
        return (zzgzp) zzb(5, null, null);
    }

    public final zzgzp zzaB() {
        zzgzp zzgzpVar = (zzgzp) zzb(5, null, null);
        zzgzpVar.zzaj(this);
        return zzgzpVar;
    }

    public final zzgzu zzaD() {
        return (zzgzu) zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final /* synthetic */ zzhbd zzaP() {
        return (zzgzp) zzb(5, null, null);
    }

    public final void zzaS() {
        zzhbn.zza().zzb(getClass()).zzf(this);
        zzaT();
    }

    public final void zzaT() {
        this.zzd &= a.e.API_PRIORITY_OTHER;
    }

    public final void zzaV(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final void zzaW(zzgza zzgzaVar) {
        zzhbn.zza().zzb(getClass()).zzm(this, zzgzb.zza(zzgzaVar));
    }

    public final boolean zzaX() {
        byte byteValue = ((Byte) zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzhbn.zza().zzb(getClass()).zzk(this);
        zzb(2, true != zzk ? null : this, null);
        return zzk;
    }

    public final boolean zzaY() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzat(zzhby zzhbyVar) {
        if (zzaY()) {
            int zza = zzhbyVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i10 = this.zzd & a.e.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int zza2 = zzhbyVar.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    final int zzay() {
        return zzhbn.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final int zzaz() {
        int i10;
        if (zzaY()) {
            i10 = zza(null);
            if (i10 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i10);
            }
        } else {
            i10 = this.zzd & a.e.API_PRIORITY_OTHER;
            if (i10 == Integer.MAX_VALUE) {
                i10 = zza(null);
                if (i10 < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i10);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i10;
            }
        }
        return i10;
    }

    public abstract Object zzb(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* synthetic */ zzhbe zzbk() {
        return (zzgzu) zzb(6, null, null);
    }
}
