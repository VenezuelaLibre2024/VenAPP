package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.C5442b7;
import com.google.android.gms.measurement.internal.C5712w5;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.a */
/* loaded from: classes2.dex */
public final class C5416a extends AppMeasurement.AbstractC5415a {

    /* renamed from: a */
    private final C5712w5 f11042a;

    /* renamed from: b */
    private final C5442b7 f11043b;

    public C5416a(C5712w5 c5712w5) {
        super();
        C5276s.m13324j(c5712w5);
        this.f11042a = c5712w5;
        this.f11043b = c5712w5.m14496C();
    }

    @Override // p418wa.InterfaceC12096b0
    /* renamed from: a */
    public final void mo13582a(String str, String str2, Bundle bundle) {
        this.f11042a.m14496C().m13662Q(str, str2, bundle);
    }

    @Override // p418wa.InterfaceC12096b0
    /* renamed from: b */
    public final List<Bundle> mo13583b(String str, String str2) {
        return this.f11043b.m13705x(str, str2);
    }

    @Override // p418wa.InterfaceC12096b0
    /* renamed from: c */
    public final void mo13584c(String str, String str2, Bundle bundle) {
        this.f11043b.m13701s0(str, str2, bundle);
    }

    @Override // p418wa.InterfaceC12096b0
    /* renamed from: d */
    public final Map<String, Object> mo13585d(String str, String str2, boolean z10) {
        return this.f11043b.m13706y(str, str2, z10);
    }

    @Override // p418wa.InterfaceC12096b0
    public final int zza(String str) {
        C5276s.m13320f(str);
        return 25;
    }

    @Override // p418wa.InterfaceC12096b0
    public final long zza() {
        return this.f11042a.m14500G().m14018K0();
    }

    @Override // p418wa.InterfaceC12096b0
    public final void zza(Bundle bundle) {
        this.f11043b.m13700p0(bundle);
    }

    @Override // p418wa.InterfaceC12096b0
    public final void zzb(String str) {
        this.f11042a.m14520t().m14536u(str, this.f11042a.zzb().mo28131b());
    }

    @Override // p418wa.InterfaceC12096b0
    public final void zzc(String str) {
        this.f11042a.m14520t().m14537y(str, this.f11042a.zzb().mo28131b());
    }

    @Override // p418wa.InterfaceC12096b0
    public final String zzf() {
        return this.f11043b.m13678d0();
    }

    @Override // p418wa.InterfaceC12096b0
    public final String zzg() {
        return this.f11043b.m13680e0();
    }

    @Override // p418wa.InterfaceC12096b0
    public final String zzh() {
        return this.f11043b.m13682f0();
    }

    @Override // p418wa.InterfaceC12096b0
    public final String zzi() {
        return this.f11043b.m13678d0();
    }
}
