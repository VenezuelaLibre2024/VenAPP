package zf;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xf.a;

/* loaded from: classes2.dex */
public final class d implements yf.a {

    /* renamed from: a, reason: collision with root package name */
    private final zzu f32806a;

    public d(zzu zzuVar) {
        this.f32806a = zzuVar;
    }

    private static a.b n(zzj zzjVar) {
        if (zzjVar == null) {
            return null;
        }
        return new a.b(zzjVar.zza, zzjVar.zzb, zzjVar.zzc, zzjVar.zzd, zzjVar.zze, zzjVar.zzf, zzjVar.zzg, zzjVar.zzh);
    }

    @Override // yf.a
    public final a.c a() {
        zzk zzkVar = this.f32806a.zzl;
        if (zzkVar == null) {
            return null;
        }
        return new a.c(zzkVar.zza, zzkVar.zzb, zzkVar.zzc, zzkVar.zzd, zzkVar.zze, n(zzkVar.zzf), n(zzkVar.zzg));
    }

    @Override // yf.a
    public final String b() {
        return this.f32806a.zzc;
    }

    @Override // yf.a
    public final a.i c() {
        zzq zzqVar = this.f32806a.zzg;
        if (zzqVar != null) {
            return new a.i(zzqVar.zzb, zzqVar.zza);
        }
        return null;
    }

    @Override // yf.a
    public final a.e d() {
        zzm zzmVar = this.f32806a.zzn;
        if (zzmVar == null) {
            return null;
        }
        return new a.e(zzmVar.zza, zzmVar.zzb, zzmVar.zzc, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, zzmVar.zzm, zzmVar.zzn);
    }

    @Override // yf.a
    public final Rect e() {
        zzu zzuVar = this.f32806a;
        if (zzuVar.zze == null) {
            return null;
        }
        int i10 = 0;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = zzuVar.zze;
            if (i10 >= pointArr.length) {
                return new Rect(i12, i13, i11, i14);
            }
            Point point = pointArr[i10];
            i12 = Math.min(i12, point.x);
            i11 = Math.max(i11, point.x);
            i13 = Math.min(i13, point.y);
            i14 = Math.max(i14, point.y);
            i10++;
        }
    }

    @Override // yf.a
    public final String f() {
        return this.f32806a.zzb;
    }

    @Override // yf.a
    public final int g() {
        return this.f32806a.zzd;
    }

    @Override // yf.a
    public final int getFormat() {
        return this.f32806a.zza;
    }

    @Override // yf.a
    public final a.k getUrl() {
        zzs zzsVar = this.f32806a.zzj;
        if (zzsVar != null) {
            return new a.k(zzsVar.zza, zzsVar.zzb);
        }
        return null;
    }

    @Override // yf.a
    public final a.j h() {
        zzr zzrVar = this.f32806a.zzh;
        if (zzrVar != null) {
            return new a.j(zzrVar.zza, zzrVar.zzb);
        }
        return null;
    }

    @Override // yf.a
    public final a.d i() {
        zzl zzlVar = this.f32806a.zzm;
        if (zzlVar == null) {
            return null;
        }
        zzp zzpVar = zzlVar.zza;
        a.h hVar = zzpVar != null ? new a.h(zzpVar.zza, zzpVar.zzb, zzpVar.zzc, zzpVar.zzd, zzpVar.zze, zzpVar.zzf, zzpVar.zzg) : null;
        String str = zzlVar.zzb;
        String str2 = zzlVar.zzc;
        zzq[] zzqVarArr = zzlVar.zzd;
        ArrayList arrayList = new ArrayList();
        if (zzqVarArr != null) {
            for (zzq zzqVar : zzqVarArr) {
                if (zzqVar != null) {
                    arrayList.add(new a.i(zzqVar.zzb, zzqVar.zza));
                }
            }
        }
        zzn[] zznVarArr = zzlVar.zze;
        ArrayList arrayList2 = new ArrayList();
        if (zznVarArr != null) {
            for (zzn zznVar : zznVarArr) {
                if (zznVar != null) {
                    arrayList2.add(new a.f(zznVar.zza, zznVar.zzb, zznVar.zzc, zznVar.zzd));
                }
            }
        }
        String[] strArr = zzlVar.zzf;
        List asList = strArr != null ? Arrays.asList(strArr) : new ArrayList();
        zzi[] zziVarArr = zzlVar.zzg;
        ArrayList arrayList3 = new ArrayList();
        if (zziVarArr != null) {
            for (zzi zziVar : zziVarArr) {
                if (zziVar != null) {
                    arrayList3.add(new a.C0524a(zziVar.zza, zziVar.zzb));
                }
            }
        }
        return new a.d(hVar, str, str2, arrayList, arrayList2, asList, arrayList3);
    }

    @Override // yf.a
    public final byte[] j() {
        return this.f32806a.zzo;
    }

    @Override // yf.a
    public final Point[] k() {
        return this.f32806a.zze;
    }

    @Override // yf.a
    public final a.g l() {
        zzo zzoVar = this.f32806a.zzk;
        if (zzoVar != null) {
            return new a.g(zzoVar.zza, zzoVar.zzb);
        }
        return null;
    }

    @Override // yf.a
    public final a.l m() {
        zzt zztVar = this.f32806a.zzi;
        if (zztVar != null) {
            return new a.l(zztVar.zza, zztVar.zzb, zztVar.zzc);
        }
        return null;
    }

    @Override // yf.a
    public final a.f r() {
        zzn zznVar = this.f32806a.zzf;
        if (zznVar != null) {
            return new a.f(zznVar.zza, zznVar.zzb, zznVar.zzc, zznVar.zzd);
        }
        return null;
    }
}
