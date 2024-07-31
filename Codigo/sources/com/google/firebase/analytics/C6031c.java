package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.List;
import java.util.Map;
import p418wa.InterfaceC12096b0;

/* renamed from: com.google.firebase.analytics.c */
/* loaded from: classes.dex */
final class C6031c implements InterfaceC12096b0 {

    /* renamed from: a */
    private final /* synthetic */ zzdf f12802a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6031c(zzdf zzdfVar) {
        this.f12802a = zzdfVar;
    }

    @Override // p418wa.InterfaceC12096b0
    /* renamed from: a */
    public final void mo13582a(String str, String str2, Bundle bundle) {
        this.f12802a.zza(str, str2, bundle);
    }

    @Override // p418wa.InterfaceC12096b0
    /* renamed from: b */
    public final List<Bundle> mo13583b(String str, String str2) {
        return this.f12802a.zza(str, str2);
    }

    @Override // p418wa.InterfaceC12096b0
    /* renamed from: c */
    public final void mo13584c(String str, String str2, Bundle bundle) {
        this.f12802a.zzb(str, str2, bundle);
    }

    @Override // p418wa.InterfaceC12096b0
    /* renamed from: d */
    public final Map<String, Object> mo13585d(String str, String str2, boolean z10) {
        return this.f12802a.zza(str, str2, z10);
    }

    @Override // p418wa.InterfaceC12096b0
    public final int zza(String str) {
        return this.f12802a.zza(str);
    }

    @Override // p418wa.InterfaceC12096b0
    public final long zza() {
        return this.f12802a.zza();
    }

    @Override // p418wa.InterfaceC12096b0
    public final void zza(Bundle bundle) {
        this.f12802a.zza(bundle);
    }

    @Override // p418wa.InterfaceC12096b0
    public final void zzb(String str) {
        this.f12802a.zzb(str);
    }

    @Override // p418wa.InterfaceC12096b0
    public final void zzc(String str) {
        this.f12802a.zzc(str);
    }

    @Override // p418wa.InterfaceC12096b0
    public final String zzf() {
        return this.f12802a.zzf();
    }

    @Override // p418wa.InterfaceC12096b0
    public final String zzg() {
        return this.f12802a.zzg();
    }

    @Override // p418wa.InterfaceC12096b0
    public final String zzh() {
        return this.f12802a.zzh();
    }

    @Override // p418wa.InterfaceC12096b0
    public final String zzi() {
        return this.f12802a.zzi();
    }
}
