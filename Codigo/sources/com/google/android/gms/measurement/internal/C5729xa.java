package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.xa */
/* loaded from: classes2.dex */
public final class C5729xa implements InterfaceC5673t4 {

    /* renamed from: a */
    private final /* synthetic */ String f12040a;

    /* renamed from: b */
    private final /* synthetic */ C5705va f12041b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5729xa(C5705va c5705va, String str) {
        this.f12041b = c5705va;
        this.f12040a = str;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC5673t4
    /* renamed from: a */
    public final void mo13634a(String str, int i10, Throwable th2, byte[] bArr, Map<String, List<String>> map) {
        this.f12041b.m14443D(true, i10, th2, bArr, this.f12040a);
    }
}
