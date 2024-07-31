package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.savedstate.a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import u1.d;

/* loaded from: classes.dex */
public final class Recreator implements i {

    /* renamed from: b, reason: collision with root package name */
    public static final a f5447b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final d f5448a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements a.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set<String> f5449a;

        public b(androidx.savedstate.a registry) {
            n.e(registry, "registry");
            this.f5449a = new LinkedHashSet();
            registry.h("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.a.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f5449a));
            return bundle;
        }

        public final void b(String className) {
            n.e(className, "className");
            this.f5449a.add(className);
        }
    }

    public Recreator(d owner) {
        n.e(owner, "owner");
        this.f5448a = owner;
    }

    private final void a(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0083a.class);
            n.d(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    n.d(newInstance, "{\n                constr…wInstance()\n            }");
                    ((a.InterfaceC0083a) newInstance).a(this.f5448a);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    @Override // androidx.lifecycle.i
    public void onStateChanged(k source, f.a event) {
        n.e(source, "source");
        n.e(event, "event");
        if (event != f.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().c(this);
        Bundle b10 = this.f5448a.getSavedStateRegistry().b("androidx.savedstate.Restarter");
        if (b10 == null) {
            return;
        }
        ArrayList<String> stringArrayList = b10.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }
}
