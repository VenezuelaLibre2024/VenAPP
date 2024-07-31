package androidx.lifecycle;

import androidx.lifecycle.b;
import androidx.lifecycle.f;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements i {

    /* renamed from: a, reason: collision with root package name */
    private final Object f4890a;

    /* renamed from: b, reason: collision with root package name */
    private final b.a f4891b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f4890a = obj;
        this.f4891b = b.f4901c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.i
    public void onStateChanged(k kVar, f.a aVar) {
        this.f4891b.a(kVar, aVar, this.f4890a);
    }
}
