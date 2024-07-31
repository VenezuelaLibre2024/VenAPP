package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.f;
import androidx.lifecycle.h0;
import androidx.savedstate.a;
import i1.a;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a */
    public static final a.b<u1.d> f4897a = new b();

    /* renamed from: b */
    public static final a.b<k0> f4898b = new c();

    /* renamed from: c */
    public static final a.b<Bundle> f4899c = new a();

    /* loaded from: classes.dex */
    public static final class a implements a.b<Bundle> {
        a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements a.b<u1.d> {
        b() {
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements a.b<k0> {
        c() {
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.o implements ok.l<i1.a, c0> {

        /* renamed from: a */
        public static final d f4900a = new d();

        d() {
            super(1);
        }

        @Override // ok.l
        /* renamed from: a */
        public final c0 invoke(i1.a initializer) {
            kotlin.jvm.internal.n.e(initializer, "$this$initializer");
            return new c0();
        }
    }

    public static final z a(i1.a aVar) {
        kotlin.jvm.internal.n.e(aVar, "<this>");
        u1.d dVar = (u1.d) aVar.a(f4897a);
        if (dVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        k0 k0Var = (k0) aVar.a(f4898b);
        if (k0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f4899c);
        String str = (String) aVar.a(h0.c.f4947d);
        if (str != null) {
            return b(dVar, k0Var, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    private static final z b(u1.d dVar, k0 k0Var, String str, Bundle bundle) {
        b0 d10 = d(dVar);
        c0 e10 = e(k0Var);
        z zVar = e10.f().get(str);
        if (zVar != null) {
            return zVar;
        }
        z a10 = z.f4986f.a(d10.b(str), bundle);
        e10.f().put(str, a10);
        return a10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends u1.d & k0> void c(T t10) {
        kotlin.jvm.internal.n.e(t10, "<this>");
        f.b b10 = t10.getLifecycle().b();
        if (!(b10 == f.b.INITIALIZED || b10 == f.b.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t10.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            b0 b0Var = new b0(t10.getSavedStateRegistry(), t10);
            t10.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", b0Var);
            t10.getLifecycle().a(new SavedStateHandleAttacher(b0Var));
        }
    }

    public static final b0 d(u1.d dVar) {
        kotlin.jvm.internal.n.e(dVar, "<this>");
        a.c c10 = dVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        b0 b0Var = c10 instanceof b0 ? (b0) c10 : null;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final c0 e(k0 k0Var) {
        kotlin.jvm.internal.n.e(k0Var, "<this>");
        i1.c cVar = new i1.c();
        cVar.a(kotlin.jvm.internal.y.b(c0.class), d.f4900a);
        return (c0) new h0(k0Var, cVar.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", c0.class);
    }
}
