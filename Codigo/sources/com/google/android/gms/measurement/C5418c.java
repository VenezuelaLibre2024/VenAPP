package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.List;
import java.util.Map;
import p418wa.InterfaceC12096b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.c */
/* loaded from: classes2.dex */
public final class C5418c extends AppMeasurement.AbstractC5415a {

    /* renamed from: a */
    private final InterfaceC12096b0 f11044a;

    public C5418c(InterfaceC12096b0 interfaceC12096b0) {
        super();
        C5276s.m13324j(interfaceC12096b0);
        this.f11044a = interfaceC12096b0;
    }

    @Override // p418wa.InterfaceC12096b0
    /* renamed from: a */
    public final void mo13582a(String str, String str2, Bundle bundle) {
        this.f11044a.mo13582a(str, str2, bundle);
    }

    @Override // p418wa.InterfaceC12096b0
    /* renamed from: b */
    public final List<Bundle> mo13583b(String str, String str2) {
        return this.f11044a.mo13583b(str, str2);
    }

    @Override // p418wa.InterfaceC12096b0
    /* renamed from: c */
    public final void mo13584c(String str, String str2, Bundle bundle) {
        this.f11044a.mo13584c(str, str2, bundle);
    }

    @Override // p418wa.InterfaceC12096b0
    /* renamed from: d */
    public final Map<String, Object> mo13585d(String str, String str2, boolean z10) {
        return this.f11044a.mo13585d(str, str2, z10);
    }

    @Override // p418wa.InterfaceC12096b0
    public final int zza(String str) {
        return this.f11044a.zza(str);
    }

    @Override // p418wa.InterfaceC12096b0
    public final long zza() {
        return this.f11044a.zza();
    }

    @Override // p418wa.InterfaceC12096b0
    public final void zza(Bundle bundle) {
        this.f11044a.zza(bundle);
    }

    @Override // p418wa.InterfaceC12096b0
    public final void zzb(String str) {
        this.f11044a.zzb(str);
    }

    @Override // p418wa.InterfaceC12096b0
    public final void zzc(String str) {
        this.f11044a.zzc(str);
    }

    @Override // p418wa.InterfaceC12096b0
    public final String zzf() {
        return this.f11044a.zzf();
    }

    @Override // p418wa.InterfaceC12096b0
    public final String zzg() {
        return this.f11044a.zzg();
    }

    @Override // p418wa.InterfaceC12096b0
    public final String zzh() {
        return this.f11044a.zzh();
    }

    @Override // p418wa.InterfaceC12096b0
    public final String zzi() {
        return this.f11044a.zzi();
    }
}
