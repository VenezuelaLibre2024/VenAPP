package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class xa implements t4 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f10825a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ va f10826b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xa(va vaVar, String str) {
        this.f10826b = vaVar;
        this.f10825a = str;
    }

    @Override // com.google.android.gms.measurement.internal.t4
    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map<String, List<String>> map) {
        this.f10826b.D(true, i10, th2, bArr, this.f10825a);
    }
}
