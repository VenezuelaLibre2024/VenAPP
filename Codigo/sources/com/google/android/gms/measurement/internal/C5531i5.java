package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.C0731a;
import androidx.collection.C0736f;
import com.google.android.gms.common.internal.C5276s;
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
import com.google.android.gms.measurement.internal.C5531i5;
import com.google.android.gms.measurement.internal.C5737y6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import la.InterfaceC9461f;
import p418wa.C12120r;

/* renamed from: com.google.android.gms.measurement.internal.i5 */
/* loaded from: classes2.dex */
public final class C5531i5 extends AbstractC5692ua implements InterfaceC5512h {

    /* renamed from: d */
    private final Map<String, Map<String, String>> f11436d;

    /* renamed from: e */
    private final Map<String, Set<String>> f11437e;

    /* renamed from: f */
    private final Map<String, Map<String, Boolean>> f11438f;

    /* renamed from: g */
    private final Map<String, Map<String, Boolean>> f11439g;

    /* renamed from: h */
    private final Map<String, zzfc.zzd> f11440h;

    /* renamed from: i */
    private final Map<String, Map<String, Integer>> f11441i;

    /* renamed from: j */
    final C0736f<String, zzb> f11442j;

    /* renamed from: k */
    final zzv f11443k;

    /* renamed from: l */
    private final Map<String, String> f11444l;

    /* renamed from: m */
    private final Map<String, String> f11445m;

    /* renamed from: n */
    private final Map<String, String> f11446n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5531i5(C5705va c5705va) {
        super(c5705va);
        this.f11436d = new C0731a();
        this.f11437e = new C0731a();
        this.f11438f = new C0731a();
        this.f11439g = new C0731a();
        this.f11440h = new C0731a();
        this.f11444l = new C0731a();
        this.f11445m = new C0731a();
        this.f11446n = new C0731a();
        this.f11441i = new C0731a();
        this.f11442j = new C5596n5(this, 20);
        this.f11443k = new C5583m5(this);
    }

    /* renamed from: A */
    private final void m13933A(String str, zzfc.zzd.zza zzaVar) {
        HashSet hashSet = new HashSet();
        C0731a c0731a = new C0731a();
        C0731a c0731a2 = new C0731a();
        C0731a c0731a3 = new C0731a();
        if (zzaVar != null) {
            Iterator<zzfc.zzb> it = zzaVar.zze().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().zzb());
            }
            for (int i10 = 0; i10 < zzaVar.zza(); i10++) {
                zzfc.zzc.zza zzby = zzaVar.zza(i10).zzby();
                if (zzby.zzb().isEmpty()) {
                    zzj().m14187G().m14218a("EventConfig contained null event name");
                } else {
                    String zzb = zzby.zzb();
                    String m38857b = C12120r.m38857b(zzby.zzb());
                    if (!TextUtils.isEmpty(m38857b)) {
                        zzby = zzby.zza(m38857b);
                        zzaVar.zza(i10, zzby);
                    }
                    if (zzby.zze() && zzby.zzc()) {
                        c0731a.put(zzb, Boolean.TRUE);
                    }
                    if (zzby.zzf() && zzby.zzd()) {
                        c0731a2.put(zzby.zzb(), Boolean.TRUE);
                    }
                    if (zzby.zzg()) {
                        if (zzby.zza() < 2 || zzby.zza() > 65535) {
                            zzj().m14187G().m14220c("Invalid sampling rate. Event name, sample rate", zzby.zzb(), Integer.valueOf(zzby.zza()));
                        } else {
                            c0731a3.put(zzby.zzb(), Integer.valueOf(zzby.zza()));
                        }
                    }
                }
            }
        }
        this.f11437e.put(str, hashSet);
        this.f11438f.put(str, c0731a);
        this.f11439g.put(str, c0731a2);
        this.f11441i.put(str, c0731a3);
    }

    /* renamed from: B */
    private final void m13934B(final String str, zzfc.zzd zzdVar) {
        if (zzdVar.zza() == 0) {
            this.f11442j.remove(str);
            return;
        }
        zzj().m14186F().m14219b("EES programs found", Integer.valueOf(zzdVar.zza()));
        zzfp.zzc zzcVar = zzdVar.zzn().get(0);
        try {
            zzb zzbVar = new zzb();
            zzbVar.zza("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.j5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzm("internal.remoteConfig", new C5622p5(C5531i5.this, str));
                }
            });
            zzbVar.zza("internal.appMetadata", new Callable() { // from class: wa.o
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final C5531i5 c5531i5 = C5531i5.this;
                    final String str2 = str;
                    return new zzx("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.k5
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C5531i5 c5531i52 = C5531i5.this;
                            String str3 = str2;
                            C5648r5 m14160y0 = c5531i52.mo13766l().m14160y0(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            hashMap.put("gmp_version", 82001L);
                            if (m14160y0 != null) {
                                String m14300h = m14160y0.m14300h();
                                if (m14300h != null) {
                                    hashMap.put("app_version", m14300h);
                                }
                                hashMap.put("app_version_int", Long.valueOf(m14160y0.m14333z()));
                                hashMap.put("dynamite_version", Long.valueOf(m14160y0.m14291c0()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            zzbVar.zza("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.l5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzr(C5531i5.this.f11443k);
                }
            });
            zzbVar.zza(zzcVar);
            this.f11442j.put(str, zzbVar);
            zzj().m14186F().m14220c("EES program loaded for appId, activities", str, Integer.valueOf(zzcVar.zza().zza()));
            Iterator<zzfp.zzb> it = zzcVar.zza().zzd().iterator();
            while (it.hasNext()) {
                zzj().m14186F().m14219b("EES program activity", it.next().zzb());
            }
        } catch (zzc unused) {
            zzj().m14182B().m14219b("Failed to load EES program. appId", str);
        }
    }

    /* renamed from: b0 */
    private final void m13935b0(String str) {
        m14360p();
        mo13687i();
        C5276s.m13320f(str);
        if (this.f11440h.get(str) == null) {
            C5603o m14162z0 = mo13766l().m14162z0(str);
            if (m14162z0 != null) {
                zzfc.zzd.zza zzby = m13937v(str, m14162z0.f11638a).zzby();
                m13933A(str, zzby);
                this.f11436d.put(str, m13939y((zzfc.zzd) ((zzix) zzby.zzab())));
                this.f11440h.put(str, (zzfc.zzd) ((zzix) zzby.zzab()));
                m13934B(str, (zzfc.zzd) ((zzix) zzby.zzab()));
                this.f11444l.put(str, zzby.zzc());
                this.f11445m.put(str, m14162z0.f11639b);
                this.f11446n.put(str, m14162z0.f11640c);
                return;
            }
            this.f11436d.put(str, null);
            this.f11438f.put(str, null);
            this.f11437e.put(str, null);
            this.f11439g.put(str, null);
            this.f11440h.put(str, null);
            this.f11444l.put(str, null);
            this.f11445m.put(str, null);
            this.f11446n.put(str, null);
            this.f11441i.put(str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static /* synthetic */ zzb m13936u(C5531i5 c5531i5, String str) {
        c5531i5.m14360p();
        C5276s.m13320f(str);
        if (!c5531i5.m13956R(str)) {
            return null;
        }
        if (!c5531i5.f11440h.containsKey(str) || c5531i5.f11440h.get(str) == null) {
            c5531i5.m13935b0(str);
        } else {
            c5531i5.m13934B(str, c5531i5.f11440h.get(str));
        }
        return c5531i5.f11442j.snapshot().get(str);
    }

    /* renamed from: v */
    private final zzfc.zzd m13937v(String str, byte[] bArr) {
        if (bArr == null) {
            return zzfc.zzd.zzg();
        }
        try {
            zzfc.zzd zzdVar = (zzfc.zzd) ((zzix) ((zzfc.zzd.zza) C5472db.m13730A(zzfc.zzd.zze(), bArr)).zzab());
            zzj().m14186F().m14220c("Parsed config. version, gmp_app_id", zzdVar.zzs() ? Long.valueOf(zzdVar.zzc()) : null, zzdVar.zzr() ? zzdVar.zzh() : null);
            return zzdVar;
        } catch (zzji | RuntimeException e10) {
            zzj().m14187G().m14220c("Unable to merge remote config. appId", C5595n4.m14174q(str), e10);
            return zzfc.zzd.zzg();
        }
    }

    /* renamed from: w */
    private static C5737y6.a m13938w(zzfc.zza.zze zzeVar) {
        int i10 = C5609o5.f11646b[zzeVar.ordinal()];
        if (i10 == 1) {
            return C5737y6.a.AD_STORAGE;
        }
        if (i10 == 2) {
            return C5737y6.a.ANALYTICS_STORAGE;
        }
        if (i10 == 3) {
            return C5737y6.a.AD_USER_DATA;
        }
        if (i10 != 4) {
            return null;
        }
        return C5737y6.a.AD_PERSONALIZATION;
    }

    /* renamed from: y */
    private static Map<String, String> m13939y(zzfc.zzd zzdVar) {
        C0731a c0731a = new C0731a();
        if (zzdVar != null) {
            for (zzfc.zzg zzgVar : zzdVar.zzo()) {
                c0731a.put(zzgVar.zzb(), zzgVar.zzc());
            }
        }
        return c0731a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public final boolean m13941C(String str, byte[] bArr, String str2, String str3) {
        m14360p();
        mo13687i();
        C5276s.m13320f(str);
        zzfc.zzd.zza zzby = m13937v(str, bArr).zzby();
        if (zzby == null) {
            return false;
        }
        m13933A(str, zzby);
        m13934B(str, (zzfc.zzd) ((zzix) zzby.zzab()));
        this.f11440h.put(str, (zzfc.zzd) ((zzix) zzby.zzab()));
        this.f11444l.put(str, zzby.zzc());
        this.f11445m.put(str, str2);
        this.f11446n.put(str, str3);
        this.f11436d.put(str, m13939y((zzfc.zzd) ((zzix) zzby.zzab())));
        mo13766l().m14139U(str, new ArrayList(zzby.zzd()));
        try {
            zzby.zzb();
            bArr = ((zzfc.zzd) ((zzix) zzby.zzab())).zzbv();
        } catch (RuntimeException e10) {
            zzj().m14187G().m14220c("Unable to serialize reduced-size config. Storing full config instead. appId", C5595n4.m14174q(str), e10);
        }
        C5577m mo13766l = mo13766l();
        C5276s.m13320f(str);
        mo13766l.mo13687i();
        mo13766l.m14360p();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (mo13766l.m14155w().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                mo13766l.zzj().m14182B().m14219b("Failed to update remote config (got 0). appId", C5595n4.m14174q(str));
            }
        } catch (SQLiteException e11) {
            mo13766l.zzj().m14182B().m14220c("Error storing remote config. appId", C5595n4.m14174q(str), e11);
        }
        this.f11440h.put(str, (zzfc.zzd) ((zzix) zzby.zzab()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public final int m13942D(String str, String str2) {
        Integer num;
        mo13687i();
        m13935b0(str);
        Map<String, Integer> map = this.f11441i.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public final zzfc.zza m13943E(String str) {
        mo13687i();
        m13935b0(str);
        zzfc.zzd m13945G = m13945G(str);
        if (m13945G == null || !m13945G.zzq()) {
            return null;
        }
        return m13945G.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public final boolean m13944F(String str, C5737y6.a aVar) {
        mo13687i();
        m13935b0(str);
        zzfc.zza m13943E = m13943E(str);
        if (m13943E == null) {
            return false;
        }
        Iterator<zzfc.zza.zzb> it = m13943E.zzd().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfc.zza.zzb next = it.next();
            if (aVar == m13938w(next.zzc())) {
                if (next.zzb() == zzfc.zza.zzd.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G */
    public final zzfc.zzd m13945G(String str) {
        m14360p();
        mo13687i();
        C5276s.m13320f(str);
        m13935b0(str);
        return this.f11440h.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public final boolean m13946H(String str, String str2) {
        Boolean bool;
        mo13687i();
        m13935b0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f11439g.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public final String m13947I(String str) {
        mo13687i();
        return this.f11446n.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public final boolean m13948J(String str, String str2) {
        Boolean bool;
        mo13687i();
        m13935b0(str);
        if (m13957S(str) && C5537ib.m13972C0(str2)) {
            return true;
        }
        if (m13959U(str) && C5537ib.m13974E0(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f11438f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public final String m13949K(String str) {
        mo13687i();
        return this.f11445m.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public final String m13950L(String str) {
        mo13687i();
        m13935b0(str);
        return this.f11444l.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public final Set<String> m13951M(String str) {
        mo13687i();
        m13935b0(str);
        return this.f11437e.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public final SortedSet<String> m13952N(String str) {
        mo13687i();
        m13935b0(str);
        TreeSet treeSet = new TreeSet();
        zzfc.zza m13943E = m13943E(str);
        if (m13943E == null) {
            return treeSet;
        }
        Iterator<zzfc.zza.zzf> it = m13943E.zzc().iterator();
        while (it.hasNext()) {
            treeSet.add(it.next().zzb());
        }
        return treeSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: O */
    public final void m13953O(String str) {
        mo13687i();
        this.f11445m.put(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public final void m13954P(String str) {
        mo13687i();
        this.f11440h.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public final boolean m13955Q(String str) {
        mo13687i();
        zzfc.zzd m13945G = m13945G(str);
        if (m13945G == null) {
            return false;
        }
        return m13945G.zzp();
    }

    /* renamed from: R */
    public final boolean m13956R(String str) {
        zzfc.zzd zzdVar;
        return (TextUtils.isEmpty(str) || (zzdVar = this.f11440h.get(str)) == null || zzdVar.zza() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public final boolean m13957S(String str) {
        return "1".equals(mo13917b(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public final boolean m13958T(String str) {
        mo13687i();
        m13935b0(str);
        zzfc.zza m13943E = m13943E(str);
        return m13943E == null || !m13943E.zzg() || m13943E.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public final boolean m13959U(String str) {
        return "1".equals(mo13917b(str, "measurement.upload.blacklist_public"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public final boolean m13960V(String str) {
        mo13687i();
        m13935b0(str);
        return this.f11437e.get(str) != null && this.f11437e.get(str).contains("app_instance_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public final boolean m13961W(String str) {
        mo13687i();
        m13935b0(str);
        if (this.f11437e.get(str) != null) {
            return this.f11437e.get(str).contains("device_model") || this.f11437e.get(str).contains("device_info");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public final boolean m13962X(String str) {
        mo13687i();
        m13935b0(str);
        return this.f11437e.get(str) != null && this.f11437e.get(str).contains("enhanced_user_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public final boolean m13963Y(String str) {
        mo13687i();
        m13935b0(str);
        return this.f11437e.get(str) != null && this.f11437e.get(str).contains("google_signals");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public final boolean m13964Z(String str) {
        mo13687i();
        m13935b0(str);
        if (this.f11437e.get(str) != null) {
            return this.f11437e.get(str).contains("os_version") || this.f11437e.get(str).contains("device_info");
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5486f mo13672a() {
        return super.mo13672a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public final boolean m13965a0(String str) {
        mo13687i();
        m13935b0(str);
        return this.f11437e.get(str) != null && this.f11437e.get(str).contains("user_id");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC5512h
    /* renamed from: b */
    public final String mo13917b(String str, String str2) {
        mo13687i();
        m13935b0(str);
        Map<String, String> map = this.f11436d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5730y mo13675c() {
        return super.mo13675c();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5582m4 mo13677d() {
        return super.mo13677d();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C5735y4 mo13679e() {
        return super.mo13679e();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C5537ib mo13681f() {
        return super.mo13681f();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo13683g() {
        super.mo13683g();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo13685h() {
        super.mo13685h();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo13687i() {
        super.mo13687i();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C5472db mo13764j() {
        return super.mo13764j();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C5628pb mo13765k() {
        return super.mo13765k();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C5577m mo13766l() {
        return super.mo13766l();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C5531i5 mo13767m() {
        return super.mo13767m();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C5740y9 mo13768n() {
        return super.mo13768n();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C5679ta mo13769o() {
        return super.mo13769o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5692ua
    /* renamed from: s */
    protected final boolean mo13770s() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final long m13966t(String str) {
        String mo13917b = mo13917b(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(mo13917b)) {
            return 0L;
        }
        try {
            return Long.parseLong(mo13917b);
        } catch (NumberFormatException e10) {
            zzj().m14187G().m14220c("Unable to parse timezone offset. appId", C5595n4.m14174q(str), e10);
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final C5737y6.a m13967x(String str, C5737y6.a aVar) {
        mo13687i();
        m13935b0(str);
        zzfc.zza m13943E = m13943E(str);
        if (m13943E == null) {
            return null;
        }
        for (zzfc.zza.zzc zzcVar : m13943E.zze()) {
            if (aVar == m13938w(zzcVar.zzc())) {
                return m13938w(zzcVar.zzb());
            }
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ InterfaceC9461f zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5473e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5595n4 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5635q5 zzl() {
        return super.zzl();
    }
}
