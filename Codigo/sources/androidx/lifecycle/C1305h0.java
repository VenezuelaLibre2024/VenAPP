package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p149i1.AbstractC7768a;
import p149i1.C7771d;

/* renamed from: androidx.lifecycle.h0 */
/* loaded from: classes.dex */
public class C1305h0 {

    /* renamed from: a */
    private final C1309j0 f5689a;

    /* renamed from: b */
    private final b f5690b;

    /* renamed from: c */
    private final AbstractC7768a f5691c;

    /* renamed from: androidx.lifecycle.h0$a */
    /* loaded from: classes.dex */
    public static class a extends c {

        /* renamed from: g */
        private static a f5693g;

        /* renamed from: e */
        private final Application f5695e;

        /* renamed from: f */
        public static final C13166a f5692f = new C13166a(null);

        /* renamed from: h */
        public static final AbstractC7768a.b<Application> f5694h = C13166a.C13167a.f5696a;

        /* renamed from: androidx.lifecycle.h0$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C13166a {

            /* renamed from: androidx.lifecycle.h0$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            private static final class C13167a implements AbstractC7768a.b<Application> {

                /* renamed from: a */
                public static final C13167a f5696a = new C13167a();

                private C13167a() {
                }
            }

            private C13166a() {
            }

            public /* synthetic */ C13166a(C9315g c9315g) {
                this();
            }

            /* renamed from: a */
            public final a m7342a(Application application) {
                C9322n.m27781e(application, "application");
                if (a.f5693g == null) {
                    a.f5693g = new a(application);
                }
                a aVar = a.f5693g;
                C9322n.m27778b(aVar);
                return aVar;
            }
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            C9322n.m27781e(application, "application");
        }

        private a(Application application, int i10) {
            this.f5695e = application;
        }

        /* renamed from: g */
        private final <T extends AbstractC1303g0> T m7341g(Class<T> cls, Application application) {
            if (!C1290a.class.isAssignableFrom(cls)) {
                return (T) super.mo7155b(cls);
            }
            try {
                T newInstance = cls.getConstructor(Application.class).newInstance(application);
                C9322n.m27780d(newInstance, "{\n                try {\n…          }\n            }");
                return newInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        @Override // androidx.lifecycle.C1305h0.b
        /* renamed from: a */
        public <T extends AbstractC1303g0> T mo7307a(Class<T> modelClass, AbstractC7768a extras) {
            C9322n.m27781e(modelClass, "modelClass");
            C9322n.m27781e(extras, "extras");
            if (this.f5695e != null) {
                return (T) mo7155b(modelClass);
            }
            Application application = (Application) extras.mo23719a(f5694h);
            if (application != null) {
                return (T) m7341g(modelClass, application);
            }
            if (C1290a.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.mo7155b(modelClass);
        }

        @Override // androidx.lifecycle.C1305h0.c, androidx.lifecycle.C1305h0.b
        /* renamed from: b */
        public <T extends AbstractC1303g0> T mo7155b(Class<T> modelClass) {
            C9322n.m27781e(modelClass, "modelClass");
            Application application = this.f5695e;
            if (application != null) {
                return (T) m7341g(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    /* renamed from: androidx.lifecycle.h0$b */
    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a */
        public static final a f5697a = a.f5698a;

        /* renamed from: androidx.lifecycle.h0$b$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            static final /* synthetic */ a f5698a = new a();

            private a() {
            }
        }

        /* renamed from: a */
        default <T extends AbstractC1303g0> T mo7307a(Class<T> modelClass, AbstractC7768a extras) {
            C9322n.m27781e(modelClass, "modelClass");
            C9322n.m27781e(extras, "extras");
            return (T) mo7155b(modelClass);
        }

        /* renamed from: b */
        default <T extends AbstractC1303g0> T mo7155b(Class<T> modelClass) {
            C9322n.m27781e(modelClass, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }
    }

    /* renamed from: androidx.lifecycle.h0$c */
    /* loaded from: classes.dex */
    public static class c implements b {

        /* renamed from: c */
        private static c f5700c;

        /* renamed from: b */
        public static final a f5699b = new a(null);

        /* renamed from: d */
        public static final AbstractC7768a.b<String> f5701d = a.C13168a.f5702a;

        /* renamed from: androidx.lifecycle.h0$c$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: androidx.lifecycle.h0$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            private static final class C13168a implements AbstractC7768a.b<String> {

                /* renamed from: a */
                public static final C13168a f5702a = new C13168a();

                private C13168a() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(C9315g c9315g) {
                this();
            }

            /* renamed from: a */
            public final c m7345a() {
                if (c.f5700c == null) {
                    c.f5700c = new c();
                }
                c cVar = c.f5700c;
                C9322n.m27778b(cVar);
                return cVar;
            }
        }

        @Override // androidx.lifecycle.C1305h0.b
        /* renamed from: b */
        public <T extends AbstractC1303g0> T mo7155b(Class<T> modelClass) {
            C9322n.m27781e(modelClass, "modelClass");
            try {
                T newInstance = modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                C9322n.m27780d(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e12);
            }
        }
    }

    /* renamed from: androidx.lifecycle.h0$d */
    /* loaded from: classes.dex */
    public static class d {
        /* renamed from: c */
        public void mo7308c(AbstractC1303g0 viewModel) {
            C9322n.m27781e(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1305h0(C1309j0 store, b factory) {
        this(store, factory, null, 4, null);
        C9322n.m27781e(store, "store");
        C9322n.m27781e(factory, "factory");
    }

    public C1305h0(C1309j0 store, b factory, AbstractC7768a defaultCreationExtras) {
        C9322n.m27781e(store, "store");
        C9322n.m27781e(factory, "factory");
        C9322n.m27781e(defaultCreationExtras, "defaultCreationExtras");
        this.f5689a = store;
        this.f5690b = factory;
        this.f5691c = defaultCreationExtras;
    }

    public /* synthetic */ C1305h0(C1309j0 c1309j0, b bVar, AbstractC7768a abstractC7768a, int i10, C9315g c9315g) {
        this(c1309j0, bVar, (i10 & 4) != 0 ? AbstractC7768a.a.f18523b : abstractC7768a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1305h0(InterfaceC1311k0 owner, b factory) {
        this(owner.getViewModelStore(), factory, C1307i0.m7346a(owner));
        C9322n.m27781e(owner, "owner");
        C9322n.m27781e(factory, "factory");
    }

    /* renamed from: a */
    public <T extends AbstractC1303g0> T m7337a(Class<T> modelClass) {
        C9322n.m27781e(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) m7338b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
    }

    /* renamed from: b */
    public <T extends AbstractC1303g0> T m7338b(String key, Class<T> modelClass) {
        T t10;
        C9322n.m27781e(key, "key");
        C9322n.m27781e(modelClass, "modelClass");
        T t11 = (T) this.f5689a.m7348b(key);
        if (!modelClass.isInstance(t11)) {
            C7771d c7771d = new C7771d(this.f5691c);
            c7771d.m23723c(c.f5701d, key);
            try {
                t10 = (T) this.f5690b.mo7307a(modelClass, c7771d);
            } catch (AbstractMethodError unused) {
                t10 = (T) this.f5690b.mo7155b(modelClass);
            }
            this.f5689a.m7350d(key, t10);
            return t10;
        }
        Object obj = this.f5690b;
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar != null) {
            C9322n.m27778b(t11);
            dVar.mo7308c(t11);
        }
        C9322n.m27779c(t11, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return t11;
    }
}
