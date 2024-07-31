package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1300f;
import androidx.lifecycle.InterfaceC1306i;
import androidx.lifecycle.InterfaceC1310k;
import androidx.savedstate.C1418a;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p208l.C9336b;
import p371u1.InterfaceC11300d;

/* renamed from: androidx.savedstate.a */
/* loaded from: classes.dex */
public final class C1418a {

    /* renamed from: g */
    private static final b f6275g = new b(null);

    /* renamed from: b */
    private boolean f6277b;

    /* renamed from: c */
    private Bundle f6278c;

    /* renamed from: d */
    private boolean f6279d;

    /* renamed from: e */
    private Recreator.C1417b f6280e;

    /* renamed from: a */
    private final C9336b<String, c> f6276a = new C9336b<>();

    /* renamed from: f */
    private boolean f6281f = true;

    /* renamed from: androidx.savedstate.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo7276a(InterfaceC11300d interfaceC11300d);
    }

    /* renamed from: androidx.savedstate.a$b */
    /* loaded from: classes.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: androidx.savedstate.a$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        Bundle mo804a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m8115d(C1418a this$0, InterfaceC1310k interfaceC1310k, AbstractC1300f.a event) {
        boolean z10;
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(interfaceC1310k, "<anonymous parameter 0>");
        C9322n.m27781e(event, "event");
        if (event == AbstractC1300f.a.ON_START) {
            z10 = true;
        } else if (event != AbstractC1300f.a.ON_STOP) {
            return;
        } else {
            z10 = false;
        }
        this$0.f6281f = z10;
    }

    /* renamed from: b */
    public final Bundle m8116b(String key) {
        C9322n.m27781e(key, "key");
        if (!this.f6279d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f6278c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f6278c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f6278c;
        boolean z10 = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z10 = true;
        }
        if (!z10) {
            this.f6278c = null;
        }
        return bundle2;
    }

    /* renamed from: c */
    public final c m8117c(String key) {
        C9322n.m27781e(key, "key");
        Iterator<Map.Entry<String, c>> it = this.f6276a.iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> components = it.next();
            C9322n.m27780d(components, "components");
            String key2 = components.getKey();
            c value = components.getValue();
            if (C9322n.m27777a(key2, key)) {
                return value;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m8118e(AbstractC1300f lifecycle) {
        C9322n.m27781e(lifecycle, "lifecycle");
        if (!(!this.f6277b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.mo7314a(new InterfaceC1306i() { // from class: u1.b
            @Override // androidx.lifecycle.InterfaceC1306i
            public final void onStateChanged(InterfaceC1310k interfaceC1310k, AbstractC1300f.a aVar) {
                C1418a.m8115d(C1418a.this, interfaceC1310k, aVar);
            }
        });
        this.f6277b = true;
    }

    /* renamed from: f */
    public final void m8119f(Bundle bundle) {
        if (!this.f6277b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.f6279d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f6278c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f6279d = true;
    }

    /* renamed from: g */
    public final void m8120g(Bundle outBundle) {
        C9322n.m27781e(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f6278c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C9336b<String, c>.d m27815f = this.f6276a.m27815f();
        C9322n.m27780d(m27815f, "this.components.iteratorWithAdditions()");
        while (m27815f.hasNext()) {
            Map.Entry next = m27815f.next();
            bundle.putBundle((String) next.getKey(), ((c) next.getValue()).mo804a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    /* renamed from: h */
    public final void m8121h(String key, c provider) {
        C9322n.m27781e(key, "key");
        C9322n.m27781e(provider, "provider");
        if (!(this.f6276a.mo27811l(key, provider) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    /* renamed from: i */
    public final void m8122i(Class<? extends a> clazz) {
        C9322n.m27781e(clazz, "clazz");
        if (!this.f6281f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.C1417b c1417b = this.f6280e;
        if (c1417b == null) {
            c1417b = new Recreator.C1417b(this);
        }
        this.f6280e = c1417b;
        try {
            clazz.getDeclaredConstructor(new Class[0]);
            Recreator.C1417b c1417b2 = this.f6280e;
            if (c1417b2 != null) {
                String name = clazz.getName();
                C9322n.m27780d(name, "clazz.name");
                c1417b2.m8113b(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}
