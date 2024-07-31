package p489zf;

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
import p445xf.C12482a;
import p467yf.InterfaceC12684a;

/* renamed from: zf.d */
/* loaded from: classes2.dex */
public final class C13024d implements InterfaceC12684a {

    /* renamed from: a */
    private final zzu f35357a;

    public C13024d(zzu zzuVar) {
        this.f35357a = zzuVar;
    }

    /* renamed from: n */
    private static C12482a.b m42991n(zzj zzjVar) {
        if (zzjVar == null) {
            return null;
        }
        return new C12482a.b(zzjVar.zza, zzjVar.zzb, zzjVar.zzc, zzjVar.zzd, zzjVar.zze, zzjVar.zzf, zzjVar.zzg, zzjVar.zzh);
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: a */
    public final C12482a.c mo41729a() {
        zzk zzkVar = this.f35357a.zzl;
        if (zzkVar == null) {
            return null;
        }
        return new C12482a.c(zzkVar.zza, zzkVar.zzb, zzkVar.zzc, zzkVar.zzd, zzkVar.zze, m42991n(zzkVar.zzf), m42991n(zzkVar.zzg));
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: b */
    public final String mo41730b() {
        return this.f35357a.zzc;
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: c */
    public final C12482a.i mo41731c() {
        zzq zzqVar = this.f35357a.zzg;
        if (zzqVar != null) {
            return new C12482a.i(zzqVar.zzb, zzqVar.zza);
        }
        return null;
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: d */
    public final C12482a.e mo41732d() {
        zzm zzmVar = this.f35357a.zzn;
        if (zzmVar == null) {
            return null;
        }
        return new C12482a.e(zzmVar.zza, zzmVar.zzb, zzmVar.zzc, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, zzmVar.zzm, zzmVar.zzn);
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: e */
    public final Rect mo41733e() {
        zzu zzuVar = this.f35357a;
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

    @Override // p467yf.InterfaceC12684a
    /* renamed from: f */
    public final String mo41734f() {
        return this.f35357a.zzb;
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: g */
    public final int mo41735g() {
        return this.f35357a.zzd;
    }

    @Override // p467yf.InterfaceC12684a
    public final int getFormat() {
        return this.f35357a.zza;
    }

    @Override // p467yf.InterfaceC12684a
    public final C12482a.k getUrl() {
        zzs zzsVar = this.f35357a.zzj;
        if (zzsVar != null) {
            return new C12482a.k(zzsVar.zza, zzsVar.zzb);
        }
        return null;
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: h */
    public final C12482a.j mo41736h() {
        zzr zzrVar = this.f35357a.zzh;
        if (zzrVar != null) {
            return new C12482a.j(zzrVar.zza, zzrVar.zzb);
        }
        return null;
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: i */
    public final C12482a.d mo41737i() {
        zzl zzlVar = this.f35357a.zzm;
        if (zzlVar == null) {
            return null;
        }
        zzp zzpVar = zzlVar.zza;
        C12482a.h hVar = zzpVar != null ? new C12482a.h(zzpVar.zza, zzpVar.zzb, zzpVar.zzc, zzpVar.zzd, zzpVar.zze, zzpVar.zzf, zzpVar.zzg) : null;
        String str = zzlVar.zzb;
        String str2 = zzlVar.zzc;
        zzq[] zzqVarArr = zzlVar.zzd;
        ArrayList arrayList = new ArrayList();
        if (zzqVarArr != null) {
            for (zzq zzqVar : zzqVarArr) {
                if (zzqVar != null) {
                    arrayList.add(new C12482a.i(zzqVar.zzb, zzqVar.zza));
                }
            }
        }
        zzn[] zznVarArr = zzlVar.zze;
        ArrayList arrayList2 = new ArrayList();
        if (zznVarArr != null) {
            for (zzn zznVar : zznVarArr) {
                if (zznVar != null) {
                    arrayList2.add(new C12482a.f(zznVar.zza, zznVar.zzb, zznVar.zzc, zznVar.zzd));
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
                    arrayList3.add(new C12482a.a(zziVar.zza, zziVar.zzb));
                }
            }
        }
        return new C12482a.d(hVar, str, str2, arrayList, arrayList2, asList, arrayList3);
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: j */
    public final byte[] mo41738j() {
        return this.f35357a.zzo;
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: k */
    public final Point[] mo41739k() {
        return this.f35357a.zze;
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: l */
    public final C12482a.g mo41740l() {
        zzo zzoVar = this.f35357a.zzk;
        if (zzoVar != null) {
            return new C12482a.g(zzoVar.zza, zzoVar.zzb);
        }
        return null;
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: m */
    public final C12482a.l mo41741m() {
        zzt zztVar = this.f35357a.zzi;
        if (zztVar != null) {
            return new C12482a.l(zztVar.zza, zztVar.zzb, zztVar.zzc);
        }
        return null;
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: r */
    public final C12482a.f mo41742r() {
        zzn zznVar = this.f35357a.zzf;
        if (zznVar != null) {
            return new C12482a.f(zznVar.zza, zznVar.zzb, zznVar.zzc, zznVar.zzd);
        }
        return null;
    }
}
