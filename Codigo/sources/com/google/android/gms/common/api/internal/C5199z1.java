package com.google.android.gms.common.api.internal;

import androidx.collection.C0731a;
import ca.C1894b;
import com.google.android.gms.common.api.C5103c;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.z1 */
/* loaded from: classes.dex */
public final class C5199z1 {

    /* renamed from: a */
    private final C0731a f10620a;

    /* renamed from: b */
    private final C0731a f10621b;

    /* renamed from: c */
    private final TaskCompletionSource f10622c;

    /* renamed from: d */
    private int f10623d;

    /* renamed from: e */
    private boolean f10624e;

    /* renamed from: a */
    public final Set m13207a() {
        return this.f10620a.keySet();
    }

    /* renamed from: b */
    public final void m13208b(C5115b c5115b, C1894b c1894b, String str) {
        this.f10620a.put(c5115b, c1894b);
        this.f10621b.put(c5115b, str);
        this.f10623d--;
        if (!c1894b.m10054y1()) {
            this.f10624e = true;
        }
        if (this.f10623d == 0) {
            if (!this.f10624e) {
                this.f10622c.setResult(this.f10621b);
            } else {
                this.f10622c.setException(new C5103c(this.f10620a));
            }
        }
    }
}
