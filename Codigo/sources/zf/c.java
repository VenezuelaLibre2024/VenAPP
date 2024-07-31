package zf;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.mlkit_vision_barcode.zzux;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuy;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzva;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzve;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvg;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xf.a;

/* loaded from: classes2.dex */
public final class c implements yf.a {

    /* renamed from: a, reason: collision with root package name */
    private final zzvj f32805a;

    public c(zzvj zzvjVar) {
        this.f32805a = zzvjVar;
    }

    private static a.b n(zzuy zzuyVar) {
        if (zzuyVar == null) {
            return null;
        }
        return new a.b(zzuyVar.zzf(), zzuyVar.zzd(), zzuyVar.zza(), zzuyVar.zzb(), zzuyVar.zzc(), zzuyVar.zze(), zzuyVar.zzh(), zzuyVar.zzg());
    }

    @Override // yf.a
    public final a.c a() {
        zzuz zzc = this.f32805a.zzc();
        if (zzc != null) {
            return new a.c(zzc.zzg(), zzc.zzc(), zzc.zzd(), zzc.zze(), zzc.zzf(), n(zzc.zzb()), n(zzc.zza()));
        }
        return null;
    }

    @Override // yf.a
    public final String b() {
        return this.f32805a.zzl();
    }

    @Override // yf.a
    public final a.i c() {
        zzvf zzh = this.f32805a.zzh();
        if (zzh != null) {
            return new a.i(zzh.zzb(), zzh.zza());
        }
        return null;
    }

    @Override // yf.a
    public final a.e d() {
        zzvb zze = this.f32805a.zze();
        if (zze != null) {
            return new a.e(zze.zzf(), zze.zzh(), zze.zzn(), zze.zzl(), zze.zzi(), zze.zzc(), zze.zza(), zze.zzb(), zze.zzd(), zze.zzm(), zze.zzj(), zze.zzg(), zze.zze(), zze.zzk());
        }
        return null;
    }

    @Override // yf.a
    public final Rect e() {
        Point[] zzo = this.f32805a.zzo();
        if (zzo == null) {
            return null;
        }
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        for (Point point : zzo) {
            i11 = Math.min(i11, point.x);
            i10 = Math.max(i10, point.x);
            i12 = Math.min(i12, point.y);
            i13 = Math.max(i13, point.y);
        }
        return new Rect(i11, i12, i10, i13);
    }

    @Override // yf.a
    public final String f() {
        return this.f32805a.zzm();
    }

    @Override // yf.a
    public final int g() {
        return this.f32805a.zzb();
    }

    @Override // yf.a
    public final int getFormat() {
        return this.f32805a.zza();
    }

    @Override // yf.a
    public final a.k getUrl() {
        zzvh zzj = this.f32805a.zzj();
        if (zzj != null) {
            return new a.k(zzj.zza(), zzj.zzb());
        }
        return null;
    }

    @Override // yf.a
    public final a.j h() {
        zzvg zzi = this.f32805a.zzi();
        if (zzi != null) {
            return new a.j(zzi.zza(), zzi.zzb());
        }
        return null;
    }

    @Override // yf.a
    public final a.d i() {
        zzva zzd = this.f32805a.zzd();
        if (zzd == null) {
            return null;
        }
        zzve zza = zzd.zza();
        a.h hVar = zza != null ? new a.h(zza.zzb(), zza.zzf(), zza.zze(), zza.zza(), zza.zzd(), zza.zzc(), zza.zzg()) : null;
        String zzb = zzd.zzb();
        String zzc = zzd.zzc();
        zzvf[] zzf = zzd.zzf();
        ArrayList arrayList = new ArrayList();
        if (zzf != null) {
            for (zzvf zzvfVar : zzf) {
                if (zzvfVar != null) {
                    arrayList.add(new a.i(zzvfVar.zzb(), zzvfVar.zza()));
                }
            }
        }
        zzvc[] zze = zzd.zze();
        ArrayList arrayList2 = new ArrayList();
        if (zze != null) {
            for (zzvc zzvcVar : zze) {
                if (zzvcVar != null) {
                    arrayList2.add(new a.f(zzvcVar.zza(), zzvcVar.zzb(), zzvcVar.zzd(), zzvcVar.zzc()));
                }
            }
        }
        List asList = zzd.zzg() != null ? Arrays.asList((String[]) s.j(zzd.zzg())) : new ArrayList();
        zzux[] zzd2 = zzd.zzd();
        ArrayList arrayList3 = new ArrayList();
        if (zzd2 != null) {
            for (zzux zzuxVar : zzd2) {
                if (zzuxVar != null) {
                    arrayList3.add(new a.C0524a(zzuxVar.zza(), zzuxVar.zzb()));
                }
            }
        }
        return new a.d(hVar, zzb, zzc, arrayList, arrayList2, asList, arrayList3);
    }

    @Override // yf.a
    public final byte[] j() {
        return this.f32805a.zzn();
    }

    @Override // yf.a
    public final Point[] k() {
        return this.f32805a.zzo();
    }

    @Override // yf.a
    public final a.g l() {
        zzvd zzg = this.f32805a.zzg();
        if (zzg != null) {
            return new a.g(zzg.zza(), zzg.zzb());
        }
        return null;
    }

    @Override // yf.a
    public final a.l m() {
        zzvi zzk = this.f32805a.zzk();
        if (zzk != null) {
            return new a.l(zzk.zzc(), zzk.zzb(), zzk.zza());
        }
        return null;
    }

    @Override // yf.a
    public final a.f r() {
        zzvc zzf = this.f32805a.zzf();
        if (zzf == null) {
            return null;
        }
        return new a.f(zzf.zza(), zzf.zzb(), zzf.zzd(), zzf.zzc());
    }
}
