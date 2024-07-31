package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zzps;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.n8 */
/* loaded from: classes2.dex */
public final class C5599n8 extends AbstractC5692ua {
    public C5599n8(C5705va c5705va) {
        super(c5705va);
    }

    /* renamed from: b */
    private static String m14194b(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5692ua
    /* renamed from: s */
    protected final boolean mo13770s() {
        return false;
    }

    /* renamed from: t */
    public final byte[] m14195t(C5461d0 c5461d0, String str) {
        C5550jb c5550jb;
        zzfi.zzj.zza zzaVar;
        Bundle bundle;
        C5648r5 c5648r5;
        zzfi.zzi.zza zzaVar2;
        byte[] bArr;
        long j10;
        C5422a0 m13589a;
        mo13687i();
        this.f11899a.m14505L();
        C5276s.m13324j(c5461d0);
        C5276s.m13320f(str);
        if (!mo13672a().m13909w(str, C5474e0.f11272f0)) {
            zzj().m14181A().m14219b("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(c5461d0.f11174a) && !"_iapx".equals(c5461d0.f11174a)) {
            zzj().m14181A().m14220c("Generating a payload for this event is not available. package_name, event_name", str, c5461d0.f11174a);
            return null;
        }
        zzfi.zzi.zza zzb = zzfi.zzi.zzb();
        mo13766l().m14126L0();
        try {
            C5648r5 m14160y0 = mo13766l().m14160y0(str);
            if (m14160y0 == null) {
                zzj().m14181A().m14219b("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!m14160y0.m14320r()) {
                zzj().m14181A().m14219b("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            zzfi.zzj.zza zzp = zzfi.zzj.zzu().zzg(1).zzp("android");
            if (!TextUtils.isEmpty(m14160y0.m14325t0())) {
                zzp.zzb(m14160y0.m14325t0());
            }
            if (!TextUtils.isEmpty(m14160y0.m14329v0())) {
                zzp.zzd((String) C5276s.m13324j(m14160y0.m14329v0()));
            }
            if (!TextUtils.isEmpty(m14160y0.m14300h())) {
                zzp.zze((String) C5276s.m13324j(m14160y0.m14300h()));
            }
            if (m14160y0.m14333z() != -2147483648L) {
                zzp.zze((int) m14160y0.m14333z());
            }
            zzp.zzf(m14160y0.m14299g0()).zzd(m14160y0.m14291c0());
            String m14304j = m14160y0.m14304j();
            String m14321r0 = m14160y0.m14321r0();
            if (!TextUtils.isEmpty(m14304j)) {
                zzp.zzm(m14304j);
            } else if (!TextUtils.isEmpty(m14321r0)) {
                zzp.zza(m14321r0);
            }
            zzp.zzj(m14160y0.m14317p0());
            C5737y6 m14444L = this.f11804b.m14444L(str);
            zzp.zzc(m14160y0.m14287a0());
            if (this.f11899a.m14512k() && mo13672a().m13887F(zzp.zzr()) && m14444L.m14595x() && !TextUtils.isEmpty(null)) {
                zzp.zzj((String) null);
            }
            zzp.zzg(m14444L.m14593v());
            if (m14444L.m14595x() && m14160y0.m14318q()) {
                Pair<String, Boolean> m14599u = mo13768n().m14599u(m14160y0.m14325t0(), m14444L);
                if (m14160y0.m14318q() && m14599u != null && !TextUtils.isEmpty((CharSequence) m14599u.first)) {
                    zzp.zzq(m14194b((String) m14599u.first, Long.toString(c5461d0.f11177d)));
                    Object obj = m14599u.second;
                    if (obj != null) {
                        zzp.zzc(((Boolean) obj).booleanValue());
                    }
                }
            }
            mo13675c().m14356j();
            zzfi.zzj.zza zzi = zzp.zzi(Build.MODEL);
            mo13675c().m14356j();
            zzi.zzo(Build.VERSION.RELEASE).zzi((int) mo13675c().m14541q()).zzs(mo13675c().m14542r());
            if (m14444L.m14596y() && m14160y0.m14327u0() != null) {
                zzp.zzc(m14194b((String) C5276s.m13324j(m14160y0.m14327u0()), Long.toString(c5461d0.f11177d)));
            }
            if (!TextUtils.isEmpty(m14160y0.m14302i())) {
                zzp.zzl((String) C5276s.m13324j(m14160y0.m14302i()));
            }
            String m14325t0 = m14160y0.m14325t0();
            List<C5550jb> m14120H0 = mo13766l().m14120H0(m14325t0);
            Iterator<C5550jb> it = m14120H0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c5550jb = null;
                    break;
                }
                c5550jb = it.next();
                if ("_lte".equals(c5550jb.f11492c)) {
                    break;
                }
            }
            if (c5550jb == null || c5550jb.f11494e == null) {
                C5550jb c5550jb2 = new C5550jb(m14325t0, "auto", "_lte", zzb().mo28130a(), 0L);
                m14120H0.add(c5550jb2);
                mo13766l().m14144Z(c5550jb2);
            }
            zzfi.zzn[] zznVarArr = new zzfi.zzn[m14120H0.size()];
            for (int i10 = 0; i10 < m14120H0.size(); i10++) {
                zzfi.zzn.zza zzb2 = zzfi.zzn.zze().zza(m14120H0.get(i10).f11492c).zzb(m14120H0.get(i10).f11493d);
                mo13764j().m13758P(zzb2, m14120H0.get(i10).f11494e);
                zznVarArr[i10] = (zzfi.zzn) ((zzix) zzb2.zzab());
            }
            zzp.zze(Arrays.asList(zznVarArr));
            mo13764j().m13757O(zzp);
            if (zznp.zza() && mo13672a().m13900n(C5474e0.f11246T0)) {
                this.f11804b.m14474q(m14160y0, zzp);
            }
            C5647r4 m14258b = C5647r4.m14258b(c5461d0);
            mo13681f().m14014H(m14258b.f11759d, mo13766l().m14154v0(str));
            mo13681f().m14027Q(m14258b, mo13672a().m13906t(str));
            Bundle bundle2 = m14258b.f11759d;
            bundle2.putLong("_c", 1L);
            zzj().m14181A().m14218a("Marking in-app purchase as real-time");
            bundle2.putLong("_r", 1L);
            bundle2.putString("_o", c5461d0.f11176c);
            if (mo13681f().m14007A0(zzp.zzr())) {
                mo13681f().m14015I(bundle2, "_dbg", 1L);
                mo13681f().m14015I(bundle2, "_r", 1L);
            }
            C5422a0 m14158x0 = mo13766l().m14158x0(str, c5461d0.f11174a);
            if (m14158x0 == null) {
                zzaVar = zzp;
                bundle = bundle2;
                c5648r5 = m14160y0;
                zzaVar2 = zzb;
                bArr = null;
                m13589a = new C5422a0(str, c5461d0.f11174a, 0L, 0L, c5461d0.f11177d, 0L, null, null, null, null);
                j10 = 0;
            } else {
                zzaVar = zzp;
                bundle = bundle2;
                c5648r5 = m14160y0;
                zzaVar2 = zzb;
                bArr = null;
                j10 = m14158x0.f11059f;
                m13589a = m14158x0.m13589a(c5461d0.f11177d);
            }
            mo13766l().m14132P(m13589a);
            C5706w c5706w = new C5706w(this.f11899a, c5461d0.f11176c, str, c5461d0.f11174a, c5461d0.f11177d, j10, bundle);
            zzfi.zze.zza zza = zzfi.zze.zze().zzb(c5706w.f11958d).zza(c5706w.f11956b).zza(c5706w.f11959e);
            Iterator<String> it2 = c5706w.f11960f.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                zzfi.zzg.zza zza2 = zzfi.zzg.zze().zza(next);
                Object m14605y1 = c5706w.f11960f.m14605y1(next);
                if (m14605y1 != null) {
                    mo13764j().m13756N(zza2, m14605y1);
                    zza.zza(zza2);
                }
            }
            zzfi.zzj.zza zzaVar3 = zzaVar;
            zzaVar3.zza(zza).zza(zzfi.zzk.zza().zza(zzfi.zzf.zza().zza(m13589a.f11056c).zza(c5461d0.f11174a)));
            zzaVar3.zza(mo13765k().m14230u(c5648r5.m14325t0(), Collections.emptyList(), zzaVar3.zzx(), Long.valueOf(zza.zzc()), Long.valueOf(zza.zzc())));
            if (zza.zzg()) {
                zzaVar3.zzi(zza.zzc()).zze(zza.zzc());
            }
            long m14303i0 = c5648r5.m14303i0();
            if (m14303i0 != 0) {
                zzaVar3.zzg(m14303i0);
            }
            long m14311m0 = c5648r5.m14311m0();
            if (m14311m0 != 0) {
                zzaVar3.zzh(m14311m0);
            } else if (m14303i0 != 0) {
                zzaVar3.zzh(m14303i0);
            }
            String m14310m = c5648r5.m14310m();
            if (zzps.zza() && mo13672a().m13909w(str, C5474e0.f11310y0) && m14310m != null) {
                zzaVar3.zzr(m14310m);
            }
            c5648r5.m14316p();
            zzaVar3.zzf((int) c5648r5.m14307k0()).zzl(82001L).zzk(zzb().mo28130a()).zzd(true);
            if (mo13672a().m13900n(C5474e0.f11212C0)) {
                this.f11804b.m14478v(zzaVar3.zzr(), zzaVar3);
            }
            zzfi.zzi.zza zzaVar4 = zzaVar2;
            zzaVar4.zza(zzaVar3);
            C5648r5 c5648r52 = c5648r5;
            c5648r52.m14305j0(zzaVar3.zzd());
            c5648r52.m14297f0(zzaVar3.zzc());
            mo13766l().m14134Q(c5648r52);
            mo13766l().m14131O0();
            try {
                return mo13764j().m13760b0(((zzfi.zzi) ((zzix) zzaVar4.zzab())).zzbv());
            } catch (IOException e10) {
                zzj().m14182B().m14220c("Data loss. Failed to bundle and serialize. appId", C5595n4.m14174q(str), e10);
                return bArr;
            }
        } catch (SecurityException e11) {
            zzj().m14181A().m14219b("Resettable device id encryption failed", e11.getMessage());
            return new byte[0];
        } catch (SecurityException e12) {
            zzj().m14181A().m14219b("app instance id encryption failed", e12.getMessage());
            return new byte[0];
        } finally {
            mo13766l().m14128M0();
        }
    }
}
