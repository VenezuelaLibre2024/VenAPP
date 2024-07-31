package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import jd.b;
import jd.c;
import jd.d;
import jd.e;
import jd.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfi implements e {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final c zzb;
    private static final c zzc;
    private static final d zzd;
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final d zzh;
    private final zzfm zzi = new zzfm(this);

    static {
        c.b a10 = c.a(Constants.KEY);
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        zzb = a10.b(zzfcVar.zzb()).a();
        c.b a11 = c.a("value");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        zzc = a11.b(zzfcVar2.zzb()).a();
        zzd = zzfh.zza;
    }

    public zzfi(OutputStream outputStream, Map map, Map map2, d dVar) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = dVar;
    }

    public static /* synthetic */ void zzg(Map.Entry entry, e eVar) {
        eVar.add(zzb, entry.getKey());
        eVar.add(zzc, entry.getValue());
    }

    private static int zzh(c cVar) {
        zzfg zzfgVar = (zzfg) cVar.c(zzfg.class);
        if (zzfgVar != null) {
            return zzfgVar.zza();
        }
        throw new b("Field has no @Protobuf config");
    }

    private final long zzi(d dVar, Object obj) {
        zzfd zzfdVar = new zzfd();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzfdVar;
            try {
                dVar.encode(obj, this);
                this.zze = outputStream;
                long zza2 = zzfdVar.zza();
                zzfdVar.close();
                return zza2;
            } catch (Throwable th2) {
                this.zze = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                zzfdVar.close();
            } catch (Throwable th4) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                } catch (Exception unused) {
                }
            }
            throw th3;
        }
    }

    private static zzfg zzj(c cVar) {
        zzfg zzfgVar = (zzfg) cVar.c(zzfg.class);
        if (zzfgVar != null) {
            return zzfgVar;
        }
        throw new b("Field has no @Protobuf config");
    }

    private final zzfi zzk(d dVar, c cVar, Object obj, boolean z10) {
        long zzi = zzi(dVar, obj);
        if (z10 && zzi == 0) {
            return this;
        }
        zzn((zzh(cVar) << 3) | 2);
        zzo(zzi);
        dVar.encode(obj, this);
        return this;
    }

    private final zzfi zzl(f fVar, c cVar, Object obj, boolean z10) {
        this.zzi.zza(cVar, z10);
        fVar.encode(obj, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i10) {
        while ((i10 & (-128)) != 0) {
            this.zze.write((i10 & 127) | RecognitionOptions.ITF);
            i10 >>>= 7;
        }
        this.zze.write(i10 & 127);
    }

    private final void zzo(long j10) {
        while (((-128) & j10) != 0) {
            this.zze.write((((int) j10) & 127) | RecognitionOptions.ITF);
            j10 >>>= 7;
        }
        this.zze.write(((int) j10) & 127);
    }

    public final e add(String str, double d10) {
        zza(c.d(str), d10, true);
        return this;
    }

    public final e add(String str, int i10) {
        zzd(c.d(str), i10, true);
        return this;
    }

    public final e add(String str, long j10) {
        zze(c.d(str), j10, true);
        return this;
    }

    public final e add(String str, Object obj) {
        zzc(c.d(str), obj, true);
        return this;
    }

    public final e add(String str, boolean z10) {
        zzd(c.d(str), z10 ? 1 : 0, true);
        return this;
    }

    @Override // jd.e
    public final e add(c cVar, double d10) {
        zza(cVar, d10, true);
        return this;
    }

    public final e add(c cVar, float f10) {
        zzb(cVar, f10, true);
        return this;
    }

    @Override // jd.e
    public final /* synthetic */ e add(c cVar, int i10) {
        zzd(cVar, i10, true);
        return this;
    }

    @Override // jd.e
    public final /* synthetic */ e add(c cVar, long j10) {
        zze(cVar, j10, true);
        return this;
    }

    @Override // jd.e
    public final e add(c cVar, Object obj) {
        zzc(cVar, obj, true);
        return this;
    }

    @Override // jd.e
    public final /* synthetic */ e add(c cVar, boolean z10) {
        zzd(cVar, z10 ? 1 : 0, true);
        return this;
    }

    public final e inline(Object obj) {
        zzf(obj);
        return this;
    }

    public final e nested(String str) {
        return nested(c.d(str));
    }

    public final e nested(c cVar) {
        throw new b("nested() is not implemented for protobuf encoding.");
    }

    public final e zza(c cVar, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        zzn((zzh(cVar) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d10).array());
        return this;
    }

    public final e zzb(c cVar, float f10, boolean z10) {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        zzn((zzh(cVar) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f10).array());
        return this;
    }

    public final e zzc(c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            zzn((zzh(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(zza);
            zzn(bytes.length);
            this.zze.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                zzc(cVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzk(zzd, cVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            zza(cVar, ((Double) obj).doubleValue(), z10);
            return this;
        }
        if (obj instanceof Float) {
            zzb(cVar, ((Float) obj).floatValue(), z10);
            return this;
        }
        if (obj instanceof Number) {
            zze(cVar, ((Number) obj).longValue(), z10);
            return this;
        }
        if (obj instanceof Boolean) {
            zzd(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            zzn((zzh(cVar) << 3) | 2);
            zzn(bArr.length);
            this.zze.write(bArr);
            return this;
        }
        d dVar = (d) this.zzf.get(obj.getClass());
        if (dVar != null) {
            zzk(dVar, cVar, obj, z10);
            return this;
        }
        f fVar = (f) this.zzg.get(obj.getClass());
        if (fVar != null) {
            zzl(fVar, cVar, obj, z10);
            return this;
        }
        if (obj instanceof zzfe) {
            zzd(cVar, ((zzfe) obj).zza(), true);
            return this;
        }
        if (obj instanceof Enum) {
            zzd(cVar, ((Enum) obj).ordinal(), true);
            return this;
        }
        zzk(this.zzh, cVar, obj, z10);
        return this;
    }

    public final zzfi zzd(c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return this;
        }
        zzfg zzj = zzj(cVar);
        zzff zzffVar = zzff.DEFAULT;
        int ordinal = zzj.zzb().ordinal();
        if (ordinal == 0) {
            zzn(zzj.zza() << 3);
            zzn(i10);
        } else if (ordinal == 1) {
            zzn(zzj.zza() << 3);
            zzn((i10 + i10) ^ (i10 >> 31));
        } else if (ordinal == 2) {
            zzn((zzj.zza() << 3) | 5);
            this.zze.write(zzm(4).putInt(i10).array());
        }
        return this;
    }

    public final zzfi zze(c cVar, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return this;
        }
        zzfg zzj = zzj(cVar);
        zzff zzffVar = zzff.DEFAULT;
        int ordinal = zzj.zzb().ordinal();
        if (ordinal == 0) {
            zzn(zzj.zza() << 3);
            zzo(j10);
        } else if (ordinal == 1) {
            zzn(zzj.zza() << 3);
            zzo((j10 >> 63) ^ (j10 + j10));
        } else if (ordinal == 2) {
            zzn((zzj.zza() << 3) | 1);
            this.zze.write(zzm(8).putLong(j10).array());
        }
        return this;
    }

    public final zzfi zzf(Object obj) {
        if (obj == null) {
            return this;
        }
        d dVar = (d) this.zzf.get(obj.getClass());
        if (dVar == null) {
            throw new b("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        dVar.encode(obj, this);
        return this;
    }
}
