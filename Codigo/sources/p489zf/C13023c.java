package p489zf;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.common.internal.C5276s;
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
import p445xf.C12482a;
import p467yf.InterfaceC12684a;

/* renamed from: zf.c */
/* loaded from: classes2.dex */
public final class C13023c implements InterfaceC12684a {

    /* renamed from: a */
    private final zzvj f35356a;

    public C13023c(zzvj zzvjVar) {
        this.f35356a = zzvjVar;
    }

    /* renamed from: n */
    private static C12482a.b m42990n(zzuy zzuyVar) {
        if (zzuyVar == null) {
            return null;
        }
        return new C12482a.b(zzuyVar.zzf(), zzuyVar.zzd(), zzuyVar.zza(), zzuyVar.zzb(), zzuyVar.zzc(), zzuyVar.zze(), zzuyVar.zzh(), zzuyVar.zzg());
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: a */
    public final C12482a.c mo41729a() {
        zzuz zzc = this.f35356a.zzc();
        if (zzc != null) {
            return new C12482a.c(zzc.zzg(), zzc.zzc(), zzc.zzd(), zzc.zze(), zzc.zzf(), m42990n(zzc.zzb()), m42990n(zzc.zza()));
        }
        return null;
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: b */
    public final String mo41730b() {
        return this.f35356a.zzl();
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: c */
    public final C12482a.i mo41731c() {
        zzvf zzh = this.f35356a.zzh();
        if (zzh != null) {
            return new C12482a.i(zzh.zzb(), zzh.zza());
        }
        return null;
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: d */
    public final C12482a.e mo41732d() {
        zzvb zze = this.f35356a.zze();
        if (zze != null) {
            return new C12482a.e(zze.zzf(), zze.zzh(), zze.zzn(), zze.zzl(), zze.zzi(), zze.zzc(), zze.zza(), zze.zzb(), zze.zzd(), zze.zzm(), zze.zzj(), zze.zzg(), zze.zze(), zze.zzk());
        }
        return null;
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: e */
    public final Rect mo41733e() {
        Point[] zzo = this.f35356a.zzo();
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

    @Override // p467yf.InterfaceC12684a
    /* renamed from: f */
    public final String mo41734f() {
        return this.f35356a.zzm();
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: g */
    public final int mo41735g() {
        return this.f35356a.zzb();
    }

    @Override // p467yf.InterfaceC12684a
    public final int getFormat() {
        return this.f35356a.zza();
    }

    @Override // p467yf.InterfaceC12684a
    public final C12482a.k getUrl() {
        zzvh zzj = this.f35356a.zzj();
        if (zzj != null) {
            return new C12482a.k(zzj.zza(), zzj.zzb());
        }
        return null;
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: h */
    public final C12482a.j mo41736h() {
        zzvg zzi = this.f35356a.zzi();
        if (zzi != null) {
            return new C12482a.j(zzi.zza(), zzi.zzb());
        }
        return null;
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: i */
    public final C12482a.d mo41737i() {
        zzva zzd = this.f35356a.zzd();
        if (zzd == null) {
            return null;
        }
        zzve zza = zzd.zza();
        C12482a.h hVar = zza != null ? new C12482a.h(zza.zzb(), zza.zzf(), zza.zze(), zza.zza(), zza.zzd(), zza.zzc(), zza.zzg()) : null;
        String zzb = zzd.zzb();
        String zzc = zzd.zzc();
        zzvf[] zzf = zzd.zzf();
        ArrayList arrayList = new ArrayList();
        if (zzf != null) {
            for (zzvf zzvfVar : zzf) {
                if (zzvfVar != null) {
                    arrayList.add(new C12482a.i(zzvfVar.zzb(), zzvfVar.zza()));
                }
            }
        }
        zzvc[] zze = zzd.zze();
        ArrayList arrayList2 = new ArrayList();
        if (zze != null) {
            for (zzvc zzvcVar : zze) {
                if (zzvcVar != null) {
                    arrayList2.add(new C12482a.f(zzvcVar.zza(), zzvcVar.zzb(), zzvcVar.zzd(), zzvcVar.zzc()));
                }
            }
        }
        List asList = zzd.zzg() != null ? Arrays.asList((String[]) C5276s.m13324j(zzd.zzg())) : new ArrayList();
        zzux[] zzd2 = zzd.zzd();
        ArrayList arrayList3 = new ArrayList();
        if (zzd2 != null) {
            for (zzux zzuxVar : zzd2) {
                if (zzuxVar != null) {
                    arrayList3.add(new C12482a.a(zzuxVar.zza(), zzuxVar.zzb()));
                }
            }
        }
        return new C12482a.d(hVar, zzb, zzc, arrayList, arrayList2, asList, arrayList3);
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: j */
    public final byte[] mo41738j() {
        return this.f35356a.zzn();
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: k */
    public final Point[] mo41739k() {
        return this.f35356a.zzo();
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: l */
    public final C12482a.g mo41740l() {
        zzvd zzg = this.f35356a.zzg();
        if (zzg != null) {
            return new C12482a.g(zzg.zza(), zzg.zzb());
        }
        return null;
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: m */
    public final C12482a.l mo41741m() {
        zzvi zzk = this.f35356a.zzk();
        if (zzk != null) {
            return new C12482a.l(zzk.zzc(), zzk.zzb(), zzk.zza());
        }
        return null;
    }

    @Override // p467yf.InterfaceC12684a
    /* renamed from: r */
    public final C12482a.f mo41742r() {
        zzvc zzf = this.f35356a.zzf();
        if (zzf == null) {
            return null;
        }
        return new C12482a.f(zzf.zza(), zzf.zzb(), zzf.zzd(), zzf.zzc());
    }
}
