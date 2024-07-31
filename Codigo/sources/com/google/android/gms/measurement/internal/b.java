package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzob;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b extends c {

    /* renamed from: g, reason: collision with root package name */
    private zzew.zze f9972g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ pb f9973h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(pb pbVar, String str, int i10, zzew.zze zzeVar) {
        super(str, i10);
        this.f9973h = pbVar;
        this.f9972g = zzeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.c
    public final int a() {
        return this.f9972g.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.c
    public final boolean i() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.c
    public final boolean j() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k(Long l10, Long l11, zzfi.zzn zznVar, boolean z10) {
        p4 G;
        String g10;
        String str;
        Boolean g11;
        byte b10 = zzob.zza() && this.f9973h.a().y(this.f10012a, e0.f10104h0);
        boolean zzf = this.f9972g.zzf();
        boolean zzg = this.f9972g.zzg();
        boolean zzh = this.f9972g.zzh();
        byte b11 = zzf || zzg || zzh;
        Boolean bool = null;
        bool = null;
        if (z10 && b11 != true) {
            this.f9973h.zzj().F().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f10013b), this.f9972g.zzi() ? Integer.valueOf(this.f9972g.zza()) : null);
            return true;
        }
        zzew.zzc zzb = this.f9972g.zzb();
        boolean zzf2 = zzb.zzf();
        if (zznVar.zzk()) {
            if (zzb.zzh()) {
                g11 = c.c(zznVar.zzc(), zzb.zzc());
                bool = c.d(g11, zzf2);
            } else {
                G = this.f9973h.zzj().G();
                g10 = this.f9973h.d().g(zznVar.zzg());
                str = "No number filter for long property. property";
                G.b(str, g10);
            }
        } else if (!zznVar.zzi()) {
            if (zznVar.zzm()) {
                if (zzb.zzj()) {
                    g11 = c.g(zznVar.zzh(), zzb.zzd(), this.f9973h.zzj());
                } else if (!zzb.zzh()) {
                    G = this.f9973h.zzj().G();
                    g10 = this.f9973h.d().g(zznVar.zzg());
                    str = "No string or number filter defined. property";
                } else if (db.a0(zznVar.zzh())) {
                    g11 = c.e(zznVar.zzh(), zzb.zzc());
                } else {
                    this.f9973h.zzj().G().c("Invalid user property value for Numeric number filter. property, value", this.f9973h.d().g(zznVar.zzg()), zznVar.zzh());
                }
                bool = c.d(g11, zzf2);
            } else {
                G = this.f9973h.zzj().G();
                g10 = this.f9973h.d().g(zznVar.zzg());
                str = "User property has no value, property";
            }
            G.b(str, g10);
        } else if (zzb.zzh()) {
            g11 = c.b(zznVar.zza(), zzb.zzc());
            bool = c.d(g11, zzf2);
        } else {
            G = this.f9973h.zzj().G();
            g10 = this.f9973h.d().g(zznVar.zzg());
            str = "No number filter for double property. property";
            G.b(str, g10);
        }
        this.f9973h.zzj().F().b("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.f10014c = Boolean.TRUE;
        if (zzh && !bool.booleanValue()) {
            return true;
        }
        if (!z10 || this.f9972g.zzf()) {
            this.f10015d = bool;
        }
        if (bool.booleanValue() && b11 != false && zznVar.zzl()) {
            long zzd = zznVar.zzd();
            if (l10 != null) {
                zzd = l10.longValue();
            }
            if (b10 != false && this.f9972g.zzf() && !this.f9972g.zzg() && l11 != null) {
                zzd = l11.longValue();
            }
            if (this.f9972g.zzg()) {
                this.f10017f = Long.valueOf(zzd);
            } else {
                this.f10016e = Long.valueOf(zzd);
            }
        }
        return true;
    }
}
