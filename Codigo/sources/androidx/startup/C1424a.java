package androidx.startup;

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
import p004a2.C0021b;
import p454y1.C12581b;
import p454y1.C12582c;
import p454y1.InterfaceC12580a;

/* renamed from: androidx.startup.a */
/* loaded from: classes.dex */
public final class C1424a {

    /* renamed from: d */
    private static volatile C1424a f6304d;

    /* renamed from: e */
    private static final Object f6305e = new Object();

    /* renamed from: c */
    final Context f6308c;

    /* renamed from: b */
    final Set<Class<? extends InterfaceC12580a<?>>> f6307b = new HashSet();

    /* renamed from: a */
    final Map<Class<?>, Object> f6306a = new HashMap();

    C1424a(Context context) {
        this.f6308c = context.getApplicationContext();
    }

    /* renamed from: d */
    private <T> T m8156d(Class<? extends InterfaceC12580a<?>> cls, Set<Class<?>> set) {
        T t10;
        if (C0021b.m83h()) {
            try {
                C0021b.m78c(cls.getSimpleName());
            } finally {
                C0021b.m81f();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f6306a.containsKey(cls)) {
            t10 = (T) this.f6306a.get(cls);
        } else {
            set.add(cls);
            try {
                InterfaceC12580a<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends InterfaceC12580a<?>>> mo6592a = newInstance.mo6592a();
                if (!mo6592a.isEmpty()) {
                    for (Class<? extends InterfaceC12580a<?>> cls2 : mo6592a) {
                        if (!this.f6306a.containsKey(cls2)) {
                            m8156d(cls2, set);
                        }
                    }
                }
                t10 = (T) newInstance.create(this.f6308c);
                set.remove(cls);
                this.f6306a.put(cls, t10);
            } catch (Throwable th2) {
                throw new C12582c(th2);
            }
        }
        return t10;
    }

    /* renamed from: e */
    public static C1424a m8157e(Context context) {
        if (f6304d == null) {
            synchronized (f6305e) {
                if (f6304d == null) {
                    f6304d = new C1424a(context);
                }
            }
        }
        return f6304d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m8158a() {
        try {
            try {
                C0021b.m78c("Startup");
                m8159b(this.f6308c.getPackageManager().getProviderInfo(new ComponentName(this.f6308c.getPackageName(), InitializationProvider.class.getName()), RecognitionOptions.ITF).metaData);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new C12582c(e10);
            }
        } finally {
            C0021b.m81f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    void m8159b(Bundle bundle) {
        String string = this.f6308c.getString(C12581b.f34098a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC12580a.class.isAssignableFrom(cls)) {
                            this.f6307b.add(cls);
                        }
                    }
                }
                Iterator<Class<? extends InterfaceC12580a<?>>> it = this.f6307b.iterator();
                while (it.hasNext()) {
                    m8156d(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new C12582c(e10);
            }
        }
    }

    /* renamed from: c */
    <T> T m8160c(Class<? extends InterfaceC12580a<?>> cls) {
        T t10;
        synchronized (f6305e) {
            t10 = (T) this.f6306a.get(cls);
            if (t10 == null) {
                t10 = (T) m8156d(cls, new HashSet());
            }
        }
        return t10;
    }

    /* renamed from: f */
    public <T> T m8161f(Class<? extends InterfaceC12580a<T>> cls) {
        return (T) m8160c(cls);
    }

    /* renamed from: g */
    public boolean m8162g(Class<? extends InterfaceC12580a<?>> cls) {
        return this.f6307b.contains(cls);
    }
}
