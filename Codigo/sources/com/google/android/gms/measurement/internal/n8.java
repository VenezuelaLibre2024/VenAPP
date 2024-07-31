package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
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
/* loaded from: classes2.dex */
public final class n8 extends ua {
    public n8(va vaVar) {
        super(vaVar);
    }

    private static String b(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.ua
    protected final boolean s() {
        return false;
    }

    public final byte[] t(d0 d0Var, String str) {
        jb jbVar;
        zzfi.zzj.zza zzaVar;
        Bundle bundle;
        r5 r5Var;
        zzfi.zzi.zza zzaVar2;
        byte[] bArr;
        long j10;
        a0 a10;
        i();
        this.f10701a.L();
        com.google.android.gms.common.internal.s.j(d0Var);
        com.google.android.gms.common.internal.s.f(str);
        if (!a().w(str, e0.f10100f0)) {
            zzj().A().b("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(d0Var.f10054a) && !"_iapx".equals(d0Var.f10054a)) {
            zzj().A().c("Generating a payload for this event is not available. package_name, event_name", str, d0Var.f10054a);
            return null;
        }
        zzfi.zzi.zza zzb = zzfi.zzi.zzb();
        l().L0();
        try {
            r5 y02 = l().y0(str);
            if (y02 == null) {
                zzj().A().b("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!y02.r()) {
                zzj().A().b("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            zzfi.zzj.zza zzp = zzfi.zzj.zzu().zzg(1).zzp("android");
            if (!TextUtils.isEmpty(y02.t0())) {
                zzp.zzb(y02.t0());
            }
            if (!TextUtils.isEmpty(y02.v0())) {
                zzp.zzd((String) com.google.android.gms.common.internal.s.j(y02.v0()));
            }
            if (!TextUtils.isEmpty(y02.h())) {
                zzp.zze((String) com.google.android.gms.common.internal.s.j(y02.h()));
            }
            if (y02.z() != -2147483648L) {
                zzp.zze((int) y02.z());
            }
            zzp.zzf(y02.g0()).zzd(y02.c0());
            String j11 = y02.j();
            String r02 = y02.r0();
            if (!TextUtils.isEmpty(j11)) {
                zzp.zzm(j11);
            } else if (!TextUtils.isEmpty(r02)) {
                zzp.zza(r02);
            }
            zzp.zzj(y02.p0());
            y6 L = this.f10606b.L(str);
            zzp.zzc(y02.a0());
            if (this.f10701a.k() && a().F(zzp.zzr()) && L.x() && !TextUtils.isEmpty(null)) {
                zzp.zzj((String) null);
            }
            zzp.zzg(L.v());
            if (L.x() && y02.q()) {
                Pair<String, Boolean> u10 = n().u(y02.t0(), L);
                if (y02.q() && u10 != null && !TextUtils.isEmpty((CharSequence) u10.first)) {
                    zzp.zzq(b((String) u10.first, Long.toString(d0Var.f10057d)));
                    Object obj = u10.second;
                    if (obj != null) {
                        zzp.zzc(((Boolean) obj).booleanValue());
                    }
                }
            }
            c().j();
            zzfi.zzj.zza zzi = zzp.zzi(Build.MODEL);
            c().j();
            zzi.zzo(Build.VERSION.RELEASE).zzi((int) c().q()).zzs(c().r());
            if (L.y() && y02.u0() != null) {
                zzp.zzc(b((String) com.google.android.gms.common.internal.s.j(y02.u0()), Long.toString(d0Var.f10057d)));
            }
            if (!TextUtils.isEmpty(y02.i())) {
                zzp.zzl((String) com.google.android.gms.common.internal.s.j(y02.i()));
            }
            String t02 = y02.t0();
            List<jb> H0 = l().H0(t02);
            Iterator<jb> it = H0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    jbVar = null;
                    break;
                }
                jbVar = it.next();
                if ("_lte".equals(jbVar.f10320c)) {
                    break;
                }
            }
            if (jbVar == null || jbVar.f10322e == null) {
                jb jbVar2 = new jb(t02, "auto", "_lte", zzb().a(), 0L);
                H0.add(jbVar2);
                l().Z(jbVar2);
            }
            zzfi.zzn[] zznVarArr = new zzfi.zzn[H0.size()];
            for (int i10 = 0; i10 < H0.size(); i10++) {
                zzfi.zzn.zza zzb2 = zzfi.zzn.zze().zza(H0.get(i10).f10320c).zzb(H0.get(i10).f10321d);
                j().P(zzb2, H0.get(i10).f10322e);
                zznVarArr[i10] = (zzfi.zzn) ((zzix) zzb2.zzab());
            }
            zzp.zze(Arrays.asList(zznVarArr));
            j().O(zzp);
            if (zznp.zza() && a().n(e0.T0)) {
                this.f10606b.q(y02, zzp);
            }
            r4 b10 = r4.b(d0Var);
            f().H(b10.f10572d, l().v0(str));
            f().Q(b10, a().t(str));
            Bundle bundle2 = b10.f10572d;
            bundle2.putLong("_c", 1L);
            zzj().A().a("Marking in-app purchase as real-time");
            bundle2.putLong("_r", 1L);
            bundle2.putString("_o", d0Var.f10056c);
            if (f().A0(zzp.zzr())) {
                f().I(bundle2, "_dbg", 1L);
                f().I(bundle2, "_r", 1L);
            }
            a0 x02 = l().x0(str, d0Var.f10054a);
            if (x02 == null) {
                zzaVar = zzp;
                bundle = bundle2;
                r5Var = y02;
                zzaVar2 = zzb;
                bArr = null;
                a10 = new a0(str, d0Var.f10054a, 0L, 0L, d0Var.f10057d, 0L, null, null, null, null);
                j10 = 0;
            } else {
                zzaVar = zzp;
                bundle = bundle2;
                r5Var = y02;
                zzaVar2 = zzb;
                bArr = null;
                j10 = x02.f9939f;
                a10 = x02.a(d0Var.f10057d);
            }
            l().P(a10);
            w wVar = new w(this.f10701a, d0Var.f10056c, str, d0Var.f10054a, d0Var.f10057d, j10, bundle);
            zzfi.zze.zza zza = zzfi.zze.zze().zzb(wVar.f10752d).zza(wVar.f10750b).zza(wVar.f10753e);
            Iterator<String> it2 = wVar.f10754f.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                zzfi.zzg.zza zza2 = zzfi.zzg.zze().zza(next);
                Object y12 = wVar.f10754f.y1(next);
                if (y12 != null) {
                    j().N(zza2, y12);
                    zza.zza(zza2);
                }
            }
            zzfi.zzj.zza zzaVar3 = zzaVar;
            zzaVar3.zza(zza).zza(zzfi.zzk.zza().zza(zzfi.zzf.zza().zza(a10.f9936c).zza(d0Var.f10054a)));
            zzaVar3.zza(k().u(r5Var.t0(), Collections.emptyList(), zzaVar3.zzx(), Long.valueOf(zza.zzc()), Long.valueOf(zza.zzc())));
            if (zza.zzg()) {
                zzaVar3.zzi(zza.zzc()).zze(zza.zzc());
            }
            long i02 = r5Var.i0();
            if (i02 != 0) {
                zzaVar3.zzg(i02);
            }
            long m02 = r5Var.m0();
            if (m02 != 0) {
                zzaVar3.zzh(m02);
            } else if (i02 != 0) {
                zzaVar3.zzh(i02);
            }
            String m10 = r5Var.m();
            if (zzps.zza() && a().w(str, e0.f10138y0) && m10 != null) {
                zzaVar3.zzr(m10);
            }
            r5Var.p();
            zzaVar3.zzf((int) r5Var.k0()).zzl(82001L).zzk(zzb().a()).zzd(true);
            if (a().n(e0.C0)) {
                this.f10606b.v(zzaVar3.zzr(), zzaVar3);
            }
            zzfi.zzi.zza zzaVar4 = zzaVar2;
            zzaVar4.zza(zzaVar3);
            r5 r5Var2 = r5Var;
            r5Var2.j0(zzaVar3.zzd());
            r5Var2.f0(zzaVar3.zzc());
            l().Q(r5Var2);
            l().O0();
            try {
                return j().b0(((zzfi.zzi) ((zzix) zzaVar4.zzab())).zzbv());
            } catch (IOException e10) {
                zzj().B().c("Data loss. Failed to bundle and serialize. appId", n4.q(str), e10);
                return bArr;
            }
        } catch (SecurityException e11) {
            zzj().A().b("Resettable device id encryption failed", e11.getMessage());
            return new byte[0];
        } catch (SecurityException e12) {
            zzj().A().b("app instance id encryption failed", e12.getMessage());
            return new byte[0];
        } finally {
            l().M0();
        }
    }
}
