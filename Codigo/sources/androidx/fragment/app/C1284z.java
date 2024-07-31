package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1300f;
import androidx.lifecycle.C1309j0;
import androidx.lifecycle.C1312l;
import androidx.lifecycle.InterfaceC1298e;
import androidx.lifecycle.InterfaceC1311k0;
import androidx.savedstate.C1418a;
import p371u1.C11299c;
import p371u1.InterfaceC11300d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.z */
/* loaded from: classes.dex */
public class C1284z implements InterfaceC1298e, InterfaceC11300d, InterfaceC1311k0 {

    /* renamed from: a */
    private final Fragment f5623a;

    /* renamed from: b */
    private final C1309j0 f5624b;

    /* renamed from: c */
    private C1312l f5625c = null;

    /* renamed from: d */
    private C11299c f5626d = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1284z(Fragment fragment, C1309j0 c1309j0) {
        this.f5623a = fragment;
        this.f5624b = c1309j0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m7267a(AbstractC1300f.a aVar) {
        this.f5625c.m7360h(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m7268b() {
        if (this.f5625c == null) {
            this.f5625c = new C1312l(this);
            this.f5626d = C11299c.m35297a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m7269c() {
        return this.f5625c != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m7270d(Bundle bundle) {
        this.f5626d.m35300d(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m7271e(Bundle bundle) {
        this.f5626d.m35301e(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m7272f(AbstractC1300f.b bVar) {
        this.f5625c.m7362n(bVar);
    }

    @Override // androidx.lifecycle.InterfaceC1310k
    public AbstractC1300f getLifecycle() {
        m7268b();
        return this.f5625c;
    }

    @Override // p371u1.InterfaceC11300d
    public C1418a getSavedStateRegistry() {
        m7268b();
        return this.f5626d.m35298b();
    }

    @Override // androidx.lifecycle.InterfaceC1311k0
    public C1309j0 getViewModelStore() {
        m7268b();
        return this.f5624b;
    }
}
