package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1300f;
import androidx.lifecycle.C1305h0;
import androidx.savedstate.C1418a;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import kotlin.jvm.internal.C9333y;
import p149i1.AbstractC7768a;
import p149i1.C7770c;
import p280ok.InterfaceC9998l;
import p371u1.InterfaceC11300d;

/* renamed from: androidx.lifecycle.a0 */
/* loaded from: classes.dex */
public final class C1291a0 {

    /* renamed from: a */
    public static final AbstractC7768a.b<InterfaceC11300d> f5651a = new b();

    /* renamed from: b */
    public static final AbstractC7768a.b<InterfaceC1311k0> f5652b = new c();

    /* renamed from: c */
    public static final AbstractC7768a.b<Bundle> f5653c = new a();

    /* renamed from: androidx.lifecycle.a0$a */
    /* loaded from: classes.dex */
    public static final class a implements AbstractC7768a.b<Bundle> {
        a() {
        }
    }

    /* renamed from: androidx.lifecycle.a0$b */
    /* loaded from: classes.dex */
    public static final class b implements AbstractC7768a.b<InterfaceC11300d> {
        b() {
        }
    }

    /* renamed from: androidx.lifecycle.a0$c */
    /* loaded from: classes.dex */
    public static final class c implements AbstractC7768a.b<InterfaceC1311k0> {
        c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.a0$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC9323o implements InterfaceC9998l<AbstractC7768a, C1295c0> {

        /* renamed from: a */
        public static final d f5654a = new d();

        d() {
            super(1);
        }

        @Override // p280ok.InterfaceC9998l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1295c0 invoke(AbstractC7768a initializer) {
            C9322n.m27781e(initializer, "$this$initializer");
            return new C1295c0();
        }
    }

    /* renamed from: a */
    public static final C1328z m7287a(AbstractC7768a abstractC7768a) {
        C9322n.m27781e(abstractC7768a, "<this>");
        InterfaceC11300d interfaceC11300d = (InterfaceC11300d) abstractC7768a.mo23719a(f5651a);
        if (interfaceC11300d == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC1311k0 interfaceC1311k0 = (InterfaceC1311k0) abstractC7768a.mo23719a(f5652b);
        if (interfaceC1311k0 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC7768a.mo23719a(f5653c);
        String str = (String) abstractC7768a.mo23719a(C1305h0.c.f5701d);
        if (str != null) {
            return m7288b(interfaceC11300d, interfaceC1311k0, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    /* renamed from: b */
    private static final C1328z m7288b(InterfaceC11300d interfaceC11300d, InterfaceC1311k0 interfaceC1311k0, String str, Bundle bundle) {
        C1293b0 m7290d = m7290d(interfaceC11300d);
        C1295c0 m7291e = m7291e(interfaceC1311k0);
        C1328z c1328z = m7291e.m7305f().get(str);
        if (c1328z != null) {
            return c1328z;
        }
        C1328z m7409a = C1328z.f5740f.m7409a(m7290d.m7302b(str), bundle);
        m7291e.m7305f().put(str, m7409a);
        return m7409a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final <T extends InterfaceC11300d & InterfaceC1311k0> void m7289c(T t10) {
        C9322n.m27781e(t10, "<this>");
        AbstractC1300f.b mo7315b = t10.getLifecycle().mo7315b();
        if (!(mo7315b == AbstractC1300f.b.INITIALIZED || mo7315b == AbstractC1300f.b.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t10.getSavedStateRegistry().m8117c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            C1293b0 c1293b0 = new C1293b0(t10.getSavedStateRegistry(), t10);
            t10.getSavedStateRegistry().m8121h("androidx.lifecycle.internal.SavedStateHandlesProvider", c1293b0);
            t10.getLifecycle().mo7314a(new SavedStateHandleAttacher(c1293b0));
        }
    }

    /* renamed from: d */
    public static final C1293b0 m7290d(InterfaceC11300d interfaceC11300d) {
        C9322n.m27781e(interfaceC11300d, "<this>");
        C1418a.c m8117c = interfaceC11300d.getSavedStateRegistry().m8117c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        C1293b0 c1293b0 = m8117c instanceof C1293b0 ? (C1293b0) m8117c : null;
        if (c1293b0 != null) {
            return c1293b0;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    /* renamed from: e */
    public static final C1295c0 m7291e(InterfaceC1311k0 interfaceC1311k0) {
        C9322n.m27781e(interfaceC1311k0, "<this>");
        C7770c c7770c = new C7770c();
        c7770c.m23721a(C9333y.m27797b(C1295c0.class), d.f5654a);
        return (C1295c0) new C1305h0(interfaceC1311k0, c7770c.m23722b()).m7338b("androidx.lifecycle.internal.SavedStateHandlesVM", C1295c0.class);
    }
}
