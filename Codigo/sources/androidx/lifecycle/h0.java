package androidx.lifecycle;

import android.app.Application;
import i1.a;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a */
    private final j0 f4935a;

    /* renamed from: b */
    private final b f4936b;

    /* renamed from: c */
    private final i1.a f4937c;

    /* loaded from: classes.dex */
    public static class a extends c {

        /* renamed from: g */
        private static a f4939g;

        /* renamed from: e */
        private final Application f4941e;

        /* renamed from: f */
        public static final C0071a f4938f = new C0071a(null);

        /* renamed from: h */
        public static final a.b<Application> f4940h = C0071a.C0072a.f4942a;

        /* renamed from: androidx.lifecycle.h0$a$a */
        /* loaded from: classes.dex */
        public static final class C0071a {

            /* renamed from: androidx.lifecycle.h0$a$a$a */
            /* loaded from: classes.dex */
            private static final class C0072a implements a.b<Application> {

                /* renamed from: a */
                public static final C0072a f4942a = new C0072a();

                private C0072a() {
                }
            }

            private C0071a() {
            }

            public /* synthetic */ C0071a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final a a(Application application) {
                kotlin.jvm.internal.n.e(application, "application");
                if (a.f4939g == null) {
                    a.f4939g = new a(application);
                }
                a aVar = a.f4939g;
                kotlin.jvm.internal.n.b(aVar);
                return aVar;
            }
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            kotlin.jvm.internal.n.e(application, "application");
        }

        private a(Application application, int i10) {
            this.f4941e = application;
        }

        private final <T extends g0> T g(Class<T> cls, Application application) {
            if (!androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                return (T) super.b(cls);
            }
            try {
                T newInstance = cls.getConstructor(Application.class).newInstance(application);
                kotlin.jvm.internal.n.d(newInstance, "{\n                try {\n…          }\n            }");
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

        @Override // androidx.lifecycle.h0.b
        public <T extends g0> T a(Class<T> modelClass, i1.a extras) {
            kotlin.jvm.internal.n.e(modelClass, "modelClass");
            kotlin.jvm.internal.n.e(extras, "extras");
            if (this.f4941e != null) {
                return (T) b(modelClass);
            }
            Application application = (Application) extras.a(f4940h);
            if (application != null) {
                return (T) g(modelClass, application);
            }
            if (androidx.lifecycle.a.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.b(modelClass);
        }

        @Override // androidx.lifecycle.h0.c, androidx.lifecycle.h0.b
        public <T extends g0> T b(Class<T> modelClass) {
            kotlin.jvm.internal.n.e(modelClass, "modelClass");
            Application application = this.f4941e;
            if (application != null) {
                return (T) g(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a */
        public static final a f4943a = a.f4944a;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            static final /* synthetic */ a f4944a = new a();

            private a() {
            }
        }

        default <T extends g0> T a(Class<T> modelClass, i1.a extras) {
            kotlin.jvm.internal.n.e(modelClass, "modelClass");
            kotlin.jvm.internal.n.e(extras, "extras");
            return (T) b(modelClass);
        }

        default <T extends g0> T b(Class<T> modelClass) {
            kotlin.jvm.internal.n.e(modelClass, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }
    }

    /* loaded from: classes.dex */
    public static class c implements b {

        /* renamed from: c */
        private static c f4946c;

        /* renamed from: b */
        public static final a f4945b = new a(null);

        /* renamed from: d */
        public static final a.b<String> f4947d = a.C0073a.f4948a;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: androidx.lifecycle.h0$c$a$a */
            /* loaded from: classes.dex */
            private static final class C0073a implements a.b<String> {

                /* renamed from: a */
                public static final C0073a f4948a = new C0073a();

                private C0073a() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final c a() {
                if (c.f4946c == null) {
                    c.f4946c = new c();
                }
                c cVar = c.f4946c;
                kotlin.jvm.internal.n.b(cVar);
                return cVar;
            }
        }

        @Override // androidx.lifecycle.h0.b
        public <T extends g0> T b(Class<T> modelClass) {
            kotlin.jvm.internal.n.e(modelClass, "modelClass");
            try {
                T newInstance = modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                kotlin.jvm.internal.n.d(newInstance, "{\n                modelC…wInstance()\n            }");
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

    /* loaded from: classes.dex */
    public static class d {
        public void c(g0 viewModel) {
            kotlin.jvm.internal.n.e(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(j0 store, b factory) {
        this(store, factory, null, 4, null);
        kotlin.jvm.internal.n.e(store, "store");
        kotlin.jvm.internal.n.e(factory, "factory");
    }

    public h0(j0 store, b factory, i1.a defaultCreationExtras) {
        kotlin.jvm.internal.n.e(store, "store");
        kotlin.jvm.internal.n.e(factory, "factory");
        kotlin.jvm.internal.n.e(defaultCreationExtras, "defaultCreationExtras");
        this.f4935a = store;
        this.f4936b = factory;
        this.f4937c = defaultCreationExtras;
    }

    public /* synthetic */ h0(j0 j0Var, b bVar, i1.a aVar, int i10, kotlin.jvm.internal.g gVar) {
        this(j0Var, bVar, (i10 & 4) != 0 ? a.C0281a.f16871b : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(k0 owner, b factory) {
        this(owner.getViewModelStore(), factory, i0.a(owner));
        kotlin.jvm.internal.n.e(owner, "owner");
        kotlin.jvm.internal.n.e(factory, "factory");
    }

    public <T extends g0> T a(Class<T> modelClass) {
        kotlin.jvm.internal.n.e(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
    }

    public <T extends g0> T b(String key, Class<T> modelClass) {
        T t10;
        kotlin.jvm.internal.n.e(key, "key");
        kotlin.jvm.internal.n.e(modelClass, "modelClass");
        T t11 = (T) this.f4935a.b(key);
        if (!modelClass.isInstance(t11)) {
            i1.d dVar = new i1.d(this.f4937c);
            dVar.c(c.f4947d, key);
            try {
                t10 = (T) this.f4936b.a(modelClass, dVar);
            } catch (AbstractMethodError unused) {
                t10 = (T) this.f4936b.b(modelClass);
            }
            this.f4935a.d(key, t10);
            return t10;
        }
        Object obj = this.f4936b;
        d dVar2 = obj instanceof d ? (d) obj : null;
        if (dVar2 != null) {
            kotlin.jvm.internal.n.b(t11);
            dVar2.c(t11);
        }
        kotlin.jvm.internal.n.c(t11, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return t11;
    }
}
