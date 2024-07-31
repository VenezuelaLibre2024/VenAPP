package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import u1.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: g */
    private static final b f5450g = new b(null);

    /* renamed from: b */
    private boolean f5452b;

    /* renamed from: c */
    private Bundle f5453c;

    /* renamed from: d */
    private boolean f5454d;

    /* renamed from: e */
    private Recreator.b f5455e;

    /* renamed from: a */
    private final l.b<String, c> f5451a = new l.b<>();

    /* renamed from: f */
    private boolean f5456f = true;

    /* renamed from: androidx.savedstate.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0083a {
        void a(d dVar);
    }

    /* loaded from: classes.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        Bundle a();
    }

    public static final void d(a this$0, k kVar, f.a event) {
        boolean z10;
        n.e(this$0, "this$0");
        n.e(kVar, "<anonymous parameter 0>");
        n.e(event, "event");
        if (event == f.a.ON_START) {
            z10 = true;
        } else if (event != f.a.ON_STOP) {
            return;
        } else {
            z10 = false;
        }
        this$0.f5456f = z10;
    }

    public final Bundle b(String key) {
        n.e(key, "key");
        if (!this.f5454d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f5453c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f5453c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f5453c;
        boolean z10 = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z10 = true;
        }
        if (!z10) {
            this.f5453c = null;
        }
        return bundle2;
    }

    public final c c(String key) {
        n.e(key, "key");
        Iterator<Map.Entry<String, c>> it = this.f5451a.iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> components = it.next();
            n.d(components, "components");
            String key2 = components.getKey();
            c value = components.getValue();
            if (n.a(key2, key)) {
                return value;
            }
        }
        return null;
    }

    public final void e(f lifecycle) {
        n.e(lifecycle, "lifecycle");
        if (!(!this.f5452b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.a(new i() { // from class: u1.b
            public /* synthetic */ b() {
            }

            @Override // androidx.lifecycle.i
            public final void onStateChanged(k kVar, f.a aVar) {
                androidx.savedstate.a.d(androidx.savedstate.a.this, kVar, aVar);
            }
        });
        this.f5452b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.f5452b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.f5454d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f5453c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f5454d = true;
    }

    public final void g(Bundle outBundle) {
        n.e(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5453c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        l.b<String, c>.d f10 = this.f5451a.f();
        n.d(f10, "this.components.iteratorWithAdditions()");
        while (f10.hasNext()) {
            Map.Entry next = f10.next();
            bundle.putBundle((String) next.getKey(), ((c) next.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    public final void h(String key, c provider) {
        n.e(key, "key");
        n.e(provider, "provider");
        if (!(this.f5451a.l(key, provider) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void i(Class<? extends InterfaceC0083a> clazz) {
        n.e(clazz, "clazz");
        if (!this.f5456f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.b bVar = this.f5455e;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.f5455e = bVar;
        try {
            clazz.getDeclaredConstructor(new Class[0]);
            Recreator.b bVar2 = this.f5455e;
            if (bVar2 != null) {
                String name = clazz.getName();
                n.d(name, "clazz.name");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}
