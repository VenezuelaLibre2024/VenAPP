package com.google.mlkit.common.sdkinternal;

import com.google.mlkit.common.sdkinternal.C6508a;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* renamed from: com.google.mlkit.common.sdkinternal.s */
/* loaded from: classes2.dex */
final class C6537s extends PhantomReference implements C6508a.a {

    /* renamed from: a */
    private final Set f14347a;

    /* renamed from: b */
    private final Runnable f14348b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C6537s(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, C6536r c6536r) {
        super(obj, referenceQueue);
        this.f14347a = set;
        this.f14348b = runnable;
    }

    @Override // com.google.mlkit.common.sdkinternal.C6508a.a
    /* renamed from: a */
    public final void mo18302a() {
        if (this.f14347a.remove(this)) {
            clear();
            this.f14348b.run();
        }
    }
}
