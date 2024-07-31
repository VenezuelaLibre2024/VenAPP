package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Set;

/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.collection.a f9506a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.collection.a f9507b;

    /* renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f9508c;

    /* renamed from: d, reason: collision with root package name */
    private int f9509d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9510e;

    public final Set a() {
        return this.f9506a.keySet();
    }

    public final void b(b bVar, ca.b bVar2, String str) {
        this.f9506a.put(bVar, bVar2);
        this.f9507b.put(bVar, str);
        this.f9509d--;
        if (!bVar2.y1()) {
            this.f9510e = true;
        }
        if (this.f9509d == 0) {
            if (!this.f9510e) {
                this.f9508c.setResult(this.f9507b);
            } else {
                this.f9508c.setException(new com.google.android.gms.common.api.c(this.f9506a));
            }
        }
    }
}
