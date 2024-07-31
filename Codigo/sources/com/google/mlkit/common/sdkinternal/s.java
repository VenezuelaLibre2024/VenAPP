package com.google.mlkit.common.sdkinternal;

import com.google.mlkit.common.sdkinternal.a;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* loaded from: classes2.dex */
final class s extends PhantomReference implements a.InterfaceC0186a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f13073a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f13074b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ s(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, r rVar) {
        super(obj, referenceQueue);
        this.f13073a = set;
        this.f13074b = runnable;
    }

    @Override // com.google.mlkit.common.sdkinternal.a.InterfaceC0186a
    public final void a() {
        if (this.f13073a.remove(this)) {
            clear();
            this.f13074b.run();
        }
    }
}
