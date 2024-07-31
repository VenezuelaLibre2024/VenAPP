package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import com.bumptech.glide.manager.C2160q;
import com.bumptech.glide.manager.InterfaceC2147d;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p036c4.C1870k;
import p036c4.C1871l;
import p171j3.C8964k;
import p193k3.InterfaceC9139b;
import p193k3.InterfaceC9141d;
import p212l3.InterfaceC9382h;
import p411w3.AbstractC12064a;
import p411w3.C12067d;
import p411w3.InterfaceC12065b;
import p456y3.C12594i;
import p456y3.InterfaceC12593h;
import p478z3.C12796b;
import p478z3.InterfaceC12798d;

/* renamed from: com.bumptech.glide.b */
/* loaded from: classes.dex */
public class ComponentCallbacks2C2116b implements ComponentCallbacks2 {

    /* renamed from: v */
    private static volatile ComponentCallbacks2C2116b f8309v;

    /* renamed from: w */
    private static volatile boolean f8310w;

    /* renamed from: a */
    private final C8964k f8311a;

    /* renamed from: b */
    private final InterfaceC9141d f8312b;

    /* renamed from: c */
    private final InterfaceC9382h f8313c;

    /* renamed from: d */
    private final C2118d f8314d;

    /* renamed from: e */
    private final InterfaceC9139b f8315e;

    /* renamed from: f */
    private final C2160q f8316f;

    /* renamed from: r */
    private final InterfaceC2147d f8317r;

    /* renamed from: t */
    private final a f8319t;

    /* renamed from: s */
    private final List<ComponentCallbacks2C2125k> f8318s = new ArrayList();

    /* renamed from: u */
    private EnumC2120f f8320u = EnumC2120f.NORMAL;

    /* renamed from: com.bumptech.glide.b$a */
    /* loaded from: classes.dex */
    public interface a {
        C12594i build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComponentCallbacks2C2116b(Context context, C8964k c8964k, InterfaceC9382h interfaceC9382h, InterfaceC9141d interfaceC9141d, InterfaceC9139b interfaceC9139b, C2160q c2160q, InterfaceC2147d interfaceC2147d, int i10, a aVar, Map<Class<?>, AbstractC2126l<?, ?>> map, List<InterfaceC12593h<Object>> list, List<InterfaceC12065b> list2, AbstractC12064a abstractC12064a, C2119e c2119e) {
        this.f8311a = c8964k;
        this.f8312b = interfaceC9141d;
        this.f8315e = interfaceC9139b;
        this.f8313c = interfaceC9382h;
        this.f8316f = c2160q;
        this.f8317r = interfaceC2147d;
        this.f8319t = aVar;
        this.f8314d = new C2118d(context, interfaceC9139b, C2123i.m10695d(this, list2, abstractC12064a), new C12796b(), aVar, map, list, c8964k, c2119e, i10);
    }

    /* renamed from: a */
    static void m10640a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f8310w) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f8310w = true;
        try {
            m10644n(context, generatedAppGlideModule);
        } finally {
            f8310w = false;
        }
    }

    /* renamed from: d */
    public static ComponentCallbacks2C2116b m10641d(Context context) {
        if (f8309v == null) {
            GeneratedAppGlideModule m10642e = m10642e(context.getApplicationContext());
            synchronized (ComponentCallbacks2C2116b.class) {
                if (f8309v == null) {
                    m10640a(context, m10642e);
                }
            }
        }
        return f8309v;
    }

    /* renamed from: e */
    private static GeneratedAppGlideModule m10642e(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e10) {
            e = e10;
            m10646r(e);
            return null;
        } catch (InstantiationException e11) {
            e = e11;
            m10646r(e);
            return null;
        } catch (NoSuchMethodException e12) {
            e = e12;
            m10646r(e);
            return null;
        } catch (InvocationTargetException e13) {
            e = e13;
            m10646r(e);
            return null;
        }
    }

    /* renamed from: m */
    private static C2160q m10643m(Context context) {
        C1870k.m9951e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m10641d(context).m10656l();
    }

    /* renamed from: n */
    private static void m10644n(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        m10645o(context, new C2117c(), generatedAppGlideModule);
    }

    /* renamed from: o */
    private static void m10645o(Context context, C2117c c2117c, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<InterfaceC12065b> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.m38737c()) {
            emptyList = new C12067d(applicationContext).m38744b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.m10638d().isEmpty()) {
            Set<Class<?>> m10638d = generatedAppGlideModule.m10638d();
            Iterator<InterfaceC12065b> it = emptyList.iterator();
            while (it.hasNext()) {
                InterfaceC12065b next = it.next();
                if (m10638d.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<InterfaceC12065b> it2 = emptyList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        c2117c.m10662b(generatedAppGlideModule != null ? generatedAppGlideModule.m10639e() : null);
        Iterator<InterfaceC12065b> it3 = emptyList.iterator();
        while (it3.hasNext()) {
            it3.next().m38738a(applicationContext, c2117c);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.m38736b(applicationContext, c2117c);
        }
        ComponentCallbacks2C2116b m10661a = c2117c.m10661a(applicationContext, emptyList, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(m10661a);
        f8309v = m10661a;
    }

    /* renamed from: r */
    private static void m10646r(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: u */
    public static ComponentCallbacks2C2125k m10647u(Context context) {
        return m10643m(context).m10833f(context);
    }

    /* renamed from: b */
    public void m10648b() {
        C1871l.m9952a();
        this.f8311a.m26275e();
    }

    /* renamed from: c */
    public void m10649c() {
        C1871l.m9953b();
        this.f8313c.m27908b();
        this.f8312b.mo26949b();
        this.f8315e.mo26942b();
    }

    /* renamed from: f */
    public InterfaceC9139b m10650f() {
        return this.f8315e;
    }

    /* renamed from: g */
    public InterfaceC9141d m10651g() {
        return this.f8312b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public InterfaceC2147d m10652h() {
        return this.f8317r;
    }

    /* renamed from: i */
    public Context m10653i() {
        return this.f8314d.getBaseContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C2118d m10654j() {
        return this.f8314d;
    }

    /* renamed from: k */
    public C2122h m10655k() {
        return this.f8314d.m10670h();
    }

    /* renamed from: l */
    public C2160q m10656l() {
        return this.f8316f;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        m10649c();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        m10659s(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m10657p(ComponentCallbacks2C2125k componentCallbacks2C2125k) {
        synchronized (this.f8318s) {
            if (this.f8318s.contains(componentCallbacks2C2125k)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.f8318s.add(componentCallbacks2C2125k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean m10658q(InterfaceC12798d<?> interfaceC12798d) {
        synchronized (this.f8318s) {
            Iterator<ComponentCallbacks2C2125k> it = this.f8318s.iterator();
            while (it.hasNext()) {
                if (it.next().m10735x(interfaceC12798d)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: s */
    public void m10659s(int i10) {
        C1871l.m9953b();
        synchronized (this.f8318s) {
            Iterator<ComponentCallbacks2C2125k> it = this.f8318s.iterator();
            while (it.hasNext()) {
                it.next().onTrimMemory(i10);
            }
        }
        this.f8313c.mo27902a(i10);
        this.f8312b.mo26948a(i10);
        this.f8315e.mo26941a(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m10660t(ComponentCallbacks2C2125k componentCallbacks2C2125k) {
        synchronized (this.f8318s) {
            if (!this.f8318s.contains(componentCallbacks2C2125k)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.f8318s.remove(componentCallbacks2C2125k);
        }
    }
}
