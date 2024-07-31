package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.f;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class z implements androidx.lifecycle.e, u1.d, k0 {

    /* renamed from: a, reason: collision with root package name */
    private final Fragment f4869a;

    /* renamed from: b, reason: collision with root package name */
    private final j0 f4870b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.lifecycle.l f4871c = null;

    /* renamed from: d, reason: collision with root package name */
    private u1.c f4872d = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(Fragment fragment, j0 j0Var) {
        this.f4869a = fragment;
        this.f4870b = j0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(f.a aVar) {
        this.f4871c.h(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f4871c == null) {
            this.f4871c = new androidx.lifecycle.l(this);
            this.f4872d = u1.c.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.f4871c != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Bundle bundle) {
        this.f4872d.d(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Bundle bundle) {
        this.f4872d.e(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(f.b bVar) {
        this.f4871c.n(bVar);
    }

    @Override // androidx.lifecycle.k
    public androidx.lifecycle.f getLifecycle() {
        b();
        return this.f4871c;
    }

    @Override // u1.d
    public androidx.savedstate.a getSavedStateRegistry() {
        b();
        return this.f4872d.b();
    }

    @Override // androidx.lifecycle.k0
    public j0 getViewModelStore() {
        b();
        return this.f4870b;
    }
}
