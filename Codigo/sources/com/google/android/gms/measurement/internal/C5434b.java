package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzob;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b */
/* loaded from: classes2.dex */
public final class C5434b extends AbstractC5447c {

    /* renamed from: g */
    private zzew.zze f11092g;

    /* renamed from: h */
    private final /* synthetic */ C5628pb f11093h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5434b(C5628pb c5628pb, String str, int i10, zzew.zze zzeVar) {
        super(str, i10);
        this.f11093h = c5628pb;
        this.f11092g = zzeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC5447c
    /* renamed from: a */
    public final int mo13635a() {
        return this.f11092g.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC5447c
    /* renamed from: i */
    public final boolean mo13636i() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC5447c
    /* renamed from: j */
    public final boolean mo13637j() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final boolean m13638k(Long l10, Long l11, zzfi.zzn zznVar, boolean z10) {
        C5621p4 m14187G;
        String m14169g;
        String str;
        Boolean m13713g;
        byte b10 = zzob.zza() && this.f11093h.mo13672a().m13911y(this.f11132a, C5474e0.f11276h0);
        boolean zzf = this.f11092g.zzf();
        boolean zzg = this.f11092g.zzg();
        boolean zzh = this.f11092g.zzh();
        byte b11 = zzf || zzg || zzh;
        Boolean bool = null;
        bool = null;
        if (z10 && b11 != true) {
            this.f11093h.zzj().m14186F().m14220c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f11133b), this.f11092g.zzi() ? Integer.valueOf(this.f11092g.zza()) : null);
            return true;
        }
        zzew.zzc zzb = this.f11092g.zzb();
        boolean zzf2 = zzb.zzf();
        if (zznVar.zzk()) {
            if (zzb.zzh()) {
                m13713g = AbstractC5447c.m13709c(zznVar.zzc(), zzb.zzc());
                bool = AbstractC5447c.m13710d(m13713g, zzf2);
            } else {
                m14187G = this.f11093h.zzj().m14187G();
                m14169g = this.f11093h.mo13677d().m14169g(zznVar.zzg());
                str = "No number filter for long property. property";
                m14187G.m14219b(str, m14169g);
            }
        } else if (!zznVar.zzi()) {
            if (zznVar.zzm()) {
                if (zzb.zzj()) {
                    m13713g = AbstractC5447c.m13713g(zznVar.zzh(), zzb.zzd(), this.f11093h.zzj());
                } else if (!zzb.zzh()) {
                    m14187G = this.f11093h.zzj().m14187G();
                    m14169g = this.f11093h.mo13677d().m14169g(zznVar.zzg());
                    str = "No string or number filter defined. property";
                } else if (C5472db.m13745a0(zznVar.zzh())) {
                    m13713g = AbstractC5447c.m13711e(zznVar.zzh(), zzb.zzc());
                } else {
                    this.f11093h.zzj().m14187G().m14220c("Invalid user property value for Numeric number filter. property, value", this.f11093h.mo13677d().m14169g(zznVar.zzg()), zznVar.zzh());
                }
                bool = AbstractC5447c.m13710d(m13713g, zzf2);
            } else {
                m14187G = this.f11093h.zzj().m14187G();
                m14169g = this.f11093h.mo13677d().m14169g(zznVar.zzg());
                str = "User property has no value, property";
            }
            m14187G.m14219b(str, m14169g);
        } else if (zzb.zzh()) {
            m13713g = AbstractC5447c.m13708b(zznVar.zza(), zzb.zzc());
            bool = AbstractC5447c.m13710d(m13713g, zzf2);
        } else {
            m14187G = this.f11093h.zzj().m14187G();
            m14169g = this.f11093h.mo13677d().m14169g(zznVar.zzg());
            str = "No number filter for double property. property";
            m14187G.m14219b(str, m14169g);
        }
        this.f11093h.zzj().m14186F().m14219b("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.f11134c = Boolean.TRUE;
        if (zzh && !bool.booleanValue()) {
            return true;
        }
        if (!z10 || this.f11092g.zzf()) {
            this.f11135d = bool;
        }
        if (bool.booleanValue() && b11 != false && zznVar.zzl()) {
            long zzd = zznVar.zzd();
            if (l10 != null) {
                zzd = l10.longValue();
            }
            if (b10 != false && this.f11092g.zzf() && !this.f11092g.zzg() && l11 != null) {
                zzd = l11.longValue();
            }
            if (this.f11092g.zzg()) {
                this.f11137f = Long.valueOf(zzd);
            } else {
                this.f11136e = Long.valueOf(zzd);
            }
        }
        return true;
    }
}
