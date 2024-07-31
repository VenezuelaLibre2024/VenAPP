package androidx.startup;

import a2.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import y1.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f5479d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f5480e = new Object();

    /* renamed from: c, reason: collision with root package name */
    final Context f5483c;

    /* renamed from: b, reason: collision with root package name */
    final Set<Class<? extends y1.a<?>>> f5482b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    final Map<Class<?>, Object> f5481a = new HashMap();

    a(Context context) {
        this.f5483c = context.getApplicationContext();
    }

    private <T> T d(Class<? extends y1.a<?>> cls, Set<Class<?>> set) {
        T t10;
        if (b.h()) {
            try {
                b.c(cls.getSimpleName());
            } finally {
                b.f();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f5481a.containsKey(cls)) {
            t10 = (T) this.f5481a.get(cls);
        } else {
            set.add(cls);
            try {
                y1.a<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends y1.a<?>>> a10 = newInstance.a();
                if (!a10.isEmpty()) {
                    for (Class<? extends y1.a<?>> cls2 : a10) {
                        if (!this.f5481a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                t10 = (T) newInstance.create(this.f5483c);
                set.remove(cls);
                this.f5481a.put(cls, t10);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        return t10;
    }

    public static a e(Context context) {
        if (f5479d == null) {
            synchronized (f5480e) {
                if (f5479d == null) {
                    f5479d = new a(context);
                }
            }
        }
        return f5479d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        try {
            try {
                b.c("Startup");
                b(this.f5483c.getPackageManager().getProviderInfo(new ComponentName(this.f5483c.getPackageName(), InitializationProvider.class.getName()), RecognitionOptions.ITF).metaData);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new c(e10);
            }
        } finally {
            b.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b(Bundle bundle) {
        String string = this.f5483c.getString(y1.b.f31578a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (y1.a.class.isAssignableFrom(cls)) {
                            this.f5482b.add(cls);
                        }
                    }
                }
                Iterator<Class<? extends y1.a<?>>> it = this.f5482b.iterator();
                while (it.hasNext()) {
                    d(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new c(e10);
            }
        }
    }

    <T> T c(Class<? extends y1.a<?>> cls) {
        T t10;
        synchronized (f5480e) {
            t10 = (T) this.f5481a.get(cls);
            if (t10 == null) {
                t10 = (T) d(cls, new HashSet());
            }
        }
        return t10;
    }

    public <T> T f(Class<? extends y1.a<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(Class<? extends y1.a<?>> cls) {
        return this.f5482b.contains(cls);
    }
}
