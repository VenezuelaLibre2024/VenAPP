package com.google.android.gms.common.api;

import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.collection.a f9308a;

    public c(androidx.collection.a aVar) {
        this.f9308a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (com.google.android.gms.common.api.internal.b bVar : this.f9308a.keySet()) {
            ca.b bVar2 = (ca.b) com.google.android.gms.common.internal.s.j((ca.b) this.f9308a.get(bVar));
            z10 &= !bVar2.y1();
            arrayList.add(bVar.b() + ": " + String.valueOf(bVar2));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
