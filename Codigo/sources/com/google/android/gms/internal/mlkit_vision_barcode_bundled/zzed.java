package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdx;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class zzed<MessageType extends zzed<MessageType, BuilderType>, BuilderType extends zzdx<MessageType, BuilderType>> extends zzck<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzgz zzc = zzgz.zzc();

    public static zzeb zzH(zzfo zzfoVar, Object obj, zzfo zzfoVar2, zzeg zzegVar, int i10, zzho zzhoVar, Class cls) {
        return new zzeb(zzfoVar, obj, zzfoVar2, new zzea(null, i10, zzhoVar, false, false), cls);
    }

    public static zzed zzI(Class cls) {
        Map map = zza;
        zzed zzedVar = (zzed) map.get(cls);
        if (zzedVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzedVar = (zzed) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzedVar == null) {
            zzedVar = (zzed) ((zzed) zzhi.zze(cls)).zzg(6, null, null);
            if (zzedVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzedVar);
        }
        return zzedVar;
    }

    public static zzed zzK(zzed zzedVar, byte[] bArr, zzdo zzdoVar) {
        zzed zze = zze(zzedVar, bArr, 0, bArr.length, zzdoVar);
        if (zze == null || zze.zzac()) {
            return zze;
        }
        zzeo zza2 = new zzgx(zze).zza();
        zza2.zzf(zze);
        throw zza2;
    }

    public static zzei zzL() {
        return zzdv.zze();
    }

    public static zzei zzM(zzei zzeiVar) {
        int size = zzeiVar.size();
        return zzeiVar.zzd(size == 0 ? 10 : size + size);
    }

    public static zzej zzN() {
        return zzee.zzf();
    }

    public static zzel zzO() {
        return zzfy.zze();
    }

    public static zzel zzP(zzel zzelVar) {
        int size = zzelVar.size();
        return zzelVar.zzd(size == 0 ? 10 : size + size);
    }

    public static Object zzQ(Method method, Object obj, Object... objArr) {
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

    public static Object zzR(zzfo zzfoVar, String str, Object[] objArr) {
        return new zzfz(zzfoVar, str, objArr);
    }

    public static void zzU(Class cls, zzed zzedVar) {
        zzedVar.zzT();
        zza.put(cls, zzedVar);
    }

    public static final boolean zzW(zzed zzedVar, boolean z10) {
        byte byteValue = ((Byte) zzedVar.zzg(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzfx.zza().zzb(zzedVar.getClass()).zzk(zzedVar);
        if (z10) {
            zzedVar.zzg(2, true != zzk ? null : zzedVar, null);
        }
        return zzk;
    }

    private final int zzc(zzgh zzghVar) {
        if (zzghVar != null) {
            return zzghVar.zza(this);
        }
        return zzfx.zza().zzb(getClass()).zza(this);
    }

    private static zzed zze(zzed zzedVar, byte[] bArr, int i10, int i11, zzdo zzdoVar) {
        zzed zzJ = zzedVar.zzJ();
        try {
            zzgh zzb = zzfx.zza().zzb(zzJ.getClass());
            zzb.zzh(zzJ, bArr, 0, i11, new zzco(zzdoVar));
            zzb.zzf(zzJ);
            return zzJ;
        } catch (zzeo e10) {
            e10.zzf(zzJ);
            throw e10;
        } catch (zzgx e11) {
            zzeo zza2 = e11.zza();
            zza2.zzf(zzJ);
            throw zza2;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzeo) {
                throw ((zzeo) e12.getCause());
            }
            zzeo zzeoVar = new zzeo(e12);
            zzeoVar.zzf(zzJ);
            throw zzeoVar;
        } catch (IndexOutOfBoundsException unused) {
            zzeo zzg = zzeo.zzg();
            zzg.zzf(zzJ);
            throw zzg;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzfx.zza().zzb(getClass()).zzj(this, (zzed) obj);
    }

    public final int hashCode() {
        if (zzX()) {
            return zzD();
        }
        int i10 = this.zzb;
        if (i10 != 0) {
            return i10;
        }
        int zzD = zzD();
        this.zzb = zzD;
        return zzD;
    }

    public final String toString() {
        return zzfq.zza(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzck
    public final int zzB(zzgh zzghVar) {
        if (zzX()) {
            int zzc = zzc(zzghVar);
            if (zzc >= 0) {
                return zzc;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zzc);
        }
        int i10 = this.zzd & a.e.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int zzc2 = zzc(zzghVar);
        if (zzc2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zzc2;
            return zzc2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zzc2);
    }

    final int zzD() {
        return zzfx.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo
    public final int zzE() {
        int i10;
        if (zzX()) {
            i10 = zzc(null);
            if (i10 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i10);
            }
        } else {
            i10 = this.zzd & a.e.API_PRIORITY_OTHER;
            if (i10 == Integer.MAX_VALUE) {
                i10 = zzc(null);
                if (i10 < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i10);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i10;
            }
        }
        return i10;
    }

    public final zzdx zzF() {
        return (zzdx) zzg(5, null, null);
    }

    public final zzdx zzG() {
        zzdx zzdxVar = (zzdx) zzg(5, null, null);
        zzdxVar.zzg(this);
        return zzdxVar;
    }

    public final zzed zzJ() {
        return (zzed) zzg(4, null, null);
    }

    public final void zzS() {
        zzfx.zza().zzb(getClass()).zzf(this);
        zzT();
    }

    public final void zzT() {
        this.zzd &= a.e.API_PRIORITY_OTHER;
    }

    public final void zzV(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | a.e.API_PRIORITY_OTHER;
    }

    public final boolean zzX() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo
    public final /* synthetic */ zzfn zzY() {
        return (zzdx) zzg(5, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo
    public final /* synthetic */ zzfn zzZ() {
        zzdx zzdxVar = (zzdx) zzg(5, null, null);
        zzdxVar.zzg(this);
        return zzdxVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo
    public final void zzaa(zzdj zzdjVar) {
        zzfx.zza().zzb(getClass()).zzi(this, zzdk.zza(zzdjVar));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp
    public final /* synthetic */ zzfo zzab() {
        return (zzed) zzg(6, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp
    public final boolean zzac() {
        return zzW(this, true);
    }

    public abstract Object zzg(int i10, Object obj, Object obj2);
}
