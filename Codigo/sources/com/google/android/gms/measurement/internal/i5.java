package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzji;
import com.google.android.gms.internal.measurement.zzm;
import com.google.android.gms.internal.measurement.zzr;
import com.google.android.gms.internal.measurement.zzv;
import com.google.android.gms.internal.measurement.zzx;
import com.google.android.gms.measurement.internal.i5;
import com.google.android.gms.measurement.internal.y6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class i5 extends ua implements h {

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Map<String, String>> f10264d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Set<String>> f10265e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f10266f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f10267g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, zzfc.zzd> f10268h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, Map<String, Integer>> f10269i;

    /* renamed from: j, reason: collision with root package name */
    final androidx.collection.f<String, zzb> f10270j;

    /* renamed from: k, reason: collision with root package name */
    final zzv f10271k;

    /* renamed from: l, reason: collision with root package name */
    private final Map<String, String> f10272l;

    /* renamed from: m, reason: collision with root package name */
    private final Map<String, String> f10273m;

    /* renamed from: n, reason: collision with root package name */
    private final Map<String, String> f10274n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i5(va vaVar) {
        super(vaVar);
        this.f10264d = new androidx.collection.a();
        this.f10265e = new androidx.collection.a();
        this.f10266f = new androidx.collection.a();
        this.f10267g = new androidx.collection.a();
        this.f10268h = new androidx.collection.a();
        this.f10272l = new androidx.collection.a();
        this.f10273m = new androidx.collection.a();
        this.f10274n = new androidx.collection.a();
        this.f10269i = new androidx.collection.a();
        this.f10270j = new n5(this, 20);
        this.f10271k = new m5(this);
    }

    private final void A(String str, zzfc.zzd.zza zzaVar) {
        HashSet hashSet = new HashSet();
        androidx.collection.a aVar = new androidx.collection.a();
        androidx.collection.a aVar2 = new androidx.collection.a();
        androidx.collection.a aVar3 = new androidx.collection.a();
        if (zzaVar != null) {
            Iterator<zzfc.zzb> it = zzaVar.zze().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().zzb());
            }
            for (int i10 = 0; i10 < zzaVar.zza(); i10++) {
                zzfc.zzc.zza zzby = zzaVar.zza(i10).zzby();
                if (zzby.zzb().isEmpty()) {
                    zzj().G().a("EventConfig contained null event name");
                } else {
                    String zzb = zzby.zzb();
                    String b10 = wa.r.b(zzby.zzb());
                    if (!TextUtils.isEmpty(b10)) {
                        zzby = zzby.zza(b10);
                        zzaVar.zza(i10, zzby);
                    }
                    if (zzby.zze() && zzby.zzc()) {
                        aVar.put(zzb, Boolean.TRUE);
                    }
                    if (zzby.zzf() && zzby.zzd()) {
                        aVar2.put(zzby.zzb(), Boolean.TRUE);
                    }
                    if (zzby.zzg()) {
                        if (zzby.zza() < 2 || zzby.zza() > 65535) {
                            zzj().G().c("Invalid sampling rate. Event name, sample rate", zzby.zzb(), Integer.valueOf(zzby.zza()));
                        } else {
                            aVar3.put(zzby.zzb(), Integer.valueOf(zzby.zza()));
                        }
                    }
                }
            }
        }
        this.f10265e.put(str, hashSet);
        this.f10266f.put(str, aVar);
        this.f10267g.put(str, aVar2);
        this.f10269i.put(str, aVar3);
    }

    private final void B(final String str, zzfc.zzd zzdVar) {
        if (zzdVar.zza() == 0) {
            this.f10270j.remove(str);
            return;
        }
        zzj().F().b("EES programs found", Integer.valueOf(zzdVar.zza()));
        zzfp.zzc zzcVar = zzdVar.zzn().get(0);
        try {
            zzb zzbVar = new zzb();
            zzbVar.zza("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.j5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzm("internal.remoteConfig", new p5(i5.this, str));
                }
            });
            zzbVar.zza("internal.appMetadata", new Callable() { // from class: wa.o
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final i5 i5Var = i5.this;
                    final String str2 = str;
                    return new zzx("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.k5
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            i5 i5Var2 = i5.this;
                            String str3 = str2;
                            r5 y02 = i5Var2.l().y0(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            hashMap.put("gmp_version", 82001L);
                            if (y02 != null) {
                                String h10 = y02.h();
                                if (h10 != null) {
                                    hashMap.put("app_version", h10);
                                }
                                hashMap.put("app_version_int", Long.valueOf(y02.z()));
                                hashMap.put("dynamite_version", Long.valueOf(y02.c0()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            zzbVar.zza("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.l5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzr(i5.this.f10271k);
                }
            });
            zzbVar.zza(zzcVar);
            this.f10270j.put(str, zzbVar);
            zzj().F().c("EES program loaded for appId, activities", str, Integer.valueOf(zzcVar.zza().zza()));
            Iterator<zzfp.zzb> it = zzcVar.zza().zzd().iterator();
            while (it.hasNext()) {
                zzj().F().b("EES program activity", it.next().zzb());
            }
        } catch (zzc unused) {
            zzj().B().b("Failed to load EES program. appId", str);
        }
    }

    private final void b0(String str) {
        p();
        i();
        com.google.android.gms.common.internal.s.f(str);
        if (this.f10268h.get(str) == null) {
            o z02 = l().z0(str);
            if (z02 != null) {
                zzfc.zzd.zza zzby = v(str, z02.f10451a).zzby();
                A(str, zzby);
                this.f10264d.put(str, y((zzfc.zzd) ((zzix) zzby.zzab())));
                this.f10268h.put(str, (zzfc.zzd) ((zzix) zzby.zzab()));
                B(str, (zzfc.zzd) ((zzix) zzby.zzab()));
                this.f10272l.put(str, zzby.zzc());
                this.f10273m.put(str, z02.f10452b);
                this.f10274n.put(str, z02.f10453c);
                return;
            }
            this.f10264d.put(str, null);
            this.f10266f.put(str, null);
            this.f10265e.put(str, null);
            this.f10267g.put(str, null);
            this.f10268h.put(str, null);
            this.f10272l.put(str, null);
            this.f10273m.put(str, null);
            this.f10274n.put(str, null);
            this.f10269i.put(str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzb u(i5 i5Var, String str) {
        i5Var.p();
        com.google.android.gms.common.internal.s.f(str);
        if (!i5Var.R(str)) {
            return null;
        }
        if (!i5Var.f10268h.containsKey(str) || i5Var.f10268h.get(str) == null) {
            i5Var.b0(str);
        } else {
            i5Var.B(str, i5Var.f10268h.get(str));
        }
        return i5Var.f10270j.snapshot().get(str);
    }

    private final zzfc.zzd v(String str, byte[] bArr) {
        if (bArr == null) {
            return zzfc.zzd.zzg();
        }
        try {
            zzfc.zzd zzdVar = (zzfc.zzd) ((zzix) ((zzfc.zzd.zza) db.A(zzfc.zzd.zze(), bArr)).zzab());
            zzj().F().c("Parsed config. version, gmp_app_id", zzdVar.zzs() ? Long.valueOf(zzdVar.zzc()) : null, zzdVar.zzr() ? zzdVar.zzh() : null);
            return zzdVar;
        } catch (zzji | RuntimeException e10) {
            zzj().G().c("Unable to merge remote config. appId", n4.q(str), e10);
            return zzfc.zzd.zzg();
        }
    }

    private static y6.a w(zzfc.zza.zze zzeVar) {
        int i10 = o5.f10459b[zzeVar.ordinal()];
        if (i10 == 1) {
            return y6.a.AD_STORAGE;
        }
        if (i10 == 2) {
            return y6.a.ANALYTICS_STORAGE;
        }
        if (i10 == 3) {
            return y6.a.AD_USER_DATA;
        }
        if (i10 != 4) {
            return null;
        }
        return y6.a.AD_PERSONALIZATION;
    }

    private static Map<String, String> y(zzfc.zzd zzdVar) {
        androidx.collection.a aVar = new androidx.collection.a();
        if (zzdVar != null) {
            for (zzfc.zzg zzgVar : zzdVar.zzo()) {
                aVar.put(zzgVar.zzb(), zzgVar.zzc());
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean C(String str, byte[] bArr, String str2, String str3) {
        p();
        i();
        com.google.android.gms.common.internal.s.f(str);
        zzfc.zzd.zza zzby = v(str, bArr).zzby();
        if (zzby == null) {
            return false;
        }
        A(str, zzby);
        B(str, (zzfc.zzd) ((zzix) zzby.zzab()));
        this.f10268h.put(str, (zzfc.zzd) ((zzix) zzby.zzab()));
        this.f10272l.put(str, zzby.zzc());
        this.f10273m.put(str, str2);
        this.f10274n.put(str, str3);
        this.f10264d.put(str, y((zzfc.zzd) ((zzix) zzby.zzab())));
        l().U(str, new ArrayList(zzby.zzd()));
        try {
            zzby.zzb();
            bArr = ((zzfc.zzd) ((zzix) zzby.zzab())).zzbv();
        } catch (RuntimeException e10) {
            zzj().G().c("Unable to serialize reduced-size config. Storing full config instead. appId", n4.q(str), e10);
        }
        m l10 = l();
        com.google.android.gms.common.internal.s.f(str);
        l10.i();
        l10.p();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (l10.w().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                l10.zzj().B().b("Failed to update remote config (got 0). appId", n4.q(str));
            }
        } catch (SQLiteException e11) {
            l10.zzj().B().c("Error storing remote config. appId", n4.q(str), e11);
        }
        this.f10268h.put(str, (zzfc.zzd) ((zzix) zzby.zzab()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int D(String str, String str2) {
        Integer num;
        i();
        b0(str);
        Map<String, Integer> map = this.f10269i.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfc.zza E(String str) {
        i();
        b0(str);
        zzfc.zzd G = G(str);
        if (G == null || !G.zzq()) {
            return null;
        }
        return G.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean F(String str, y6.a aVar) {
        i();
        b0(str);
        zzfc.zza E = E(str);
        if (E == null) {
            return false;
        }
        Iterator<zzfc.zza.zzb> it = E.zzd().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfc.zza.zzb next = it.next();
            if (aVar == w(next.zzc())) {
                if (next.zzb() == zzfc.zza.zzd.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzfc.zzd G(String str) {
        p();
        i();
        com.google.android.gms.common.internal.s.f(str);
        b0(str);
        return this.f10268h.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean H(String str, String str2) {
        Boolean bool;
        i();
        b0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f10267g.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String I(String str) {
        i();
        return this.f10274n.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean J(String str, String str2) {
        Boolean bool;
        i();
        b0(str);
        if (S(str) && ib.C0(str2)) {
            return true;
        }
        if (U(str) && ib.E0(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f10266f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String K(String str) {
        i();
        return this.f10273m.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String L(String str) {
        i();
        b0(str);
        return this.f10272l.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<String> M(String str) {
        i();
        b0(str);
        return this.f10265e.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SortedSet<String> N(String str) {
        i();
        b0(str);
        TreeSet treeSet = new TreeSet();
        zzfc.zza E = E(str);
        if (E == null) {
            return treeSet;
        }
        Iterator<zzfc.zza.zzf> it = E.zzc().iterator();
        while (it.hasNext()) {
            treeSet.add(it.next().zzb());
        }
        return treeSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void O(String str) {
        i();
        this.f10273m.put(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void P(String str) {
        i();
        this.f10268h.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Q(String str) {
        i();
        zzfc.zzd G = G(str);
        if (G == null) {
            return false;
        }
        return G.zzp();
    }

    public final boolean R(String str) {
        zzfc.zzd zzdVar;
        return (TextUtils.isEmpty(str) || (zzdVar = this.f10268h.get(str)) == null || zzdVar.zza() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean S(String str) {
        return "1".equals(b(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean T(String str) {
        i();
        b0(str);
        zzfc.zza E = E(str);
        return E == null || !E.zzg() || E.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean U(String str) {
        return "1".equals(b(str, "measurement.upload.blacklist_public"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean V(String str) {
        i();
        b0(str);
        return this.f10265e.get(str) != null && this.f10265e.get(str).contains("app_instance_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean W(String str) {
        i();
        b0(str);
        if (this.f10265e.get(str) != null) {
            return this.f10265e.get(str).contains("device_model") || this.f10265e.get(str).contains("device_info");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean X(String str) {
        i();
        b0(str);
        return this.f10265e.get(str) != null && this.f10265e.get(str).contains("enhanced_user_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Y(String str) {
        i();
        b0(str);
        return this.f10265e.get(str) != null && this.f10265e.get(str).contains("google_signals");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Z(String str) {
        i();
        b0(str);
        if (this.f10265e.get(str) != null) {
            return this.f10265e.get(str).contains("os_version") || this.f10265e.get(str).contains("device_info");
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a0(String str) {
        i();
        b0(str);
        return this.f10265e.get(str) != null && this.f10265e.get(str).contains("user_id");
    }

    @Override // com.google.android.gms.measurement.internal.h
    public final String b(String str, String str2) {
        i();
        b0(str);
        Map<String, String> map = this.f10264d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ db j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ pb k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ m l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ i5 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ y9 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ ta o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    protected final boolean s() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long t(String str) {
        String b10 = b(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(b10)) {
            return 0L;
        }
        try {
            return Long.parseLong(b10);
        } catch (NumberFormatException e10) {
            zzj().G().c("Unable to parse timezone offset. appId", n4.q(str), e10);
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final y6.a x(String str, y6.a aVar) {
        i();
        b0(str);
        zzfc.zza E = E(str);
        if (E == null) {
            return null;
        }
        for (zzfc.zza.zzc zzcVar : E.zze()) {
            if (aVar == w(zzcVar.zzc())) {
                return w(zzcVar.zzb());
            }
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ la.f zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 zzl() {
        return super.zzl();
    }
}
