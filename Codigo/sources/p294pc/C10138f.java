package p294pc;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.components.ComponentRegistrar;
import ee.InterfaceC7183b;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: pc.f */
/* loaded from: classes.dex */
public final class C10138f<T> {

    /* renamed from: a */
    private final T f24914a;

    /* renamed from: b */
    private final c<T> f24915b;

    /* renamed from: pc.f$b */
    /* loaded from: classes.dex */
    private static class b implements c<Context> {

        /* renamed from: a */
        private final Class<? extends Service> f24916a;

        private b(Class<? extends Service> cls) {
            this.f24916a = cls;
        }

        /* renamed from: b */
        private Bundle m30313b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f24916a), RecognitionOptions.ITF);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f24916a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // p294pc.C10138f.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> mo30314a(Context context) {
            Bundle m30313b = m30313b(context);
            if (m30313b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : m30313b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(m30313b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: pc.f$c */
    /* loaded from: classes.dex */
    interface c<T> {
        /* renamed from: a */
        List<String> mo30314a(T t10);
    }

    C10138f(T t10, c<T> cVar) {
        this.f24914a = t10;
        this.f24915b = cVar;
    }

    /* renamed from: c */
    public static C10138f<Context> m30309c(Context context, Class<? extends Service> cls) {
        return new C10138f<>(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static ComponentRegistrar m30310d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new C10155v(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e10) {
            throw new C10155v(String.format("Could not instantiate %s.", str), e10);
        } catch (InstantiationException e11) {
            throw new C10155v(String.format("Could not instantiate %s.", str), e11);
        } catch (NoSuchMethodException e12) {
            throw new C10155v(String.format("Could not instantiate %s", str), e12);
        } catch (InvocationTargetException e13) {
            throw new C10155v(String.format("Could not instantiate %s", str), e13);
        }
    }

    /* renamed from: b */
    public List<InterfaceC7183b<ComponentRegistrar>> m30312b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f24915b.mo30314a(this.f24914a)) {
            arrayList.add(new InterfaceC7183b() { // from class: pc.e
                @Override // ee.InterfaceC7183b
                public final Object get() {
                    ComponentRegistrar m30310d;
                    m30310d = C10138f.m30310d(str);
                    return m30310d;
                }
            });
        }
        return arrayList;
    }
}
