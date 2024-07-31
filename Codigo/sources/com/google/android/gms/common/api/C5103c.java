package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.collection.C0731a;
import ca.C1894b;
import com.google.android.gms.common.api.internal.C5115b;
import com.google.android.gms.common.internal.C5276s;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.api.c */
/* loaded from: classes.dex */
public class C5103c extends Exception {

    /* renamed from: a */
    private final C0731a f10416a;

    public C5103c(C0731a c0731a) {
        this.f10416a = c0731a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (C5115b c5115b : this.f10416a.keySet()) {
            C1894b c1894b = (C1894b) C5276s.m13324j((C1894b) this.f10416a.get(c5115b));
            z10 &= !c1894b.m10054y1();
            arrayList.add(c5115b.m13000b() + ": " + String.valueOf(c1894b));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
