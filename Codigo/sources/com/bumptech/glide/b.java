package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import com.bumptech.glide.manager.q;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class b implements ComponentCallbacks2 {

    /* renamed from: v */
    private static volatile b f7357v;

    /* renamed from: w */
    private static volatile boolean f7358w;

    /* renamed from: a */
    private final j3.k f7359a;

    /* renamed from: b */
    private final k3.d f7360b;

    /* renamed from: c */
    private final l3.h f7361c;

    /* renamed from: d */
    private final d f7362d;

    /* renamed from: e */
    private final k3.b f7363e;

    /* renamed from: f */
    private final q f7364f;

    /* renamed from: r */
    private final com.bumptech.glide.manager.d f7365r;

    /* renamed from: t */
    private final a f7367t;

    /* renamed from: s */
    private final List<k> f7366s = new ArrayList();

    /* renamed from: u */
    private f f7368u = f.NORMAL;

    /* loaded from: classes.dex */
    public interface a {
        y3.i build();
    }

    public b(Context context, j3.k kVar, l3.h hVar, k3.d dVar, k3.b bVar, q qVar, com.bumptech.glide.manager.d dVar2, int i10, a aVar, Map<Class<?>, l<?, ?>> map, List<y3.h<Object>> list, List<w3.b> list2, w3.a aVar2, e eVar) {
        this.f7359a = kVar;
        this.f7360b = dVar;
        this.f7363e = bVar;
        this.f7361c = hVar;
        this.f7364f = qVar;
        this.f7365r = dVar2;
        this.f7367t = aVar;
        this.f7362d = new d(context, bVar, i.d(this, list2, aVar2), new z3.b(), aVar, map, list, kVar, eVar, i10);
    }

    static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f7358w) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f7358w = true;
        try {
            n(context, generatedAppGlideModule);
        } finally {
            f7358w = false;
        }
    }

    public static b d(Context context) {
        if (f7357v == null) {
            GeneratedAppGlideModule e10 = e(context.getApplicationContext());
            synchronized (b.class) {
                if (f7357v == null) {
                    a(context, e10);
                }
            }
        }
        return f7357v;
    }

    private static GeneratedAppGlideModule e(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e10) {
            e = e10;
            r(e);
            return null;
        } catch (InstantiationException e11) {
            e = e11;
            r(e);
            return null;
        } catch (NoSuchMethodException e12) {
            e = e12;
            r(e);
            return null;
        } catch (InvocationTargetException e13) {
            e = e13;
            r(e);
            return null;
        }
    }

    private static q m(Context context) {
        c4.k.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return d(context).l();
    }

    private static void n(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        o(context, new c(), generatedAppGlideModule);
    }

    private static void o(Context context, c cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<w3.b> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            emptyList = new w3.d(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> d10 = generatedAppGlideModule.d();
            Iterator<w3.b> it = emptyList.iterator();
            while (it.hasNext()) {
                w3.b next = it.next();
                if (d10.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<w3.b> it2 = emptyList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        cVar.b(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator<w3.b> it3 = emptyList.iterator();
        while (it3.hasNext()) {
            it3.next().a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, cVar);
        }
        b a10 = cVar.a(applicationContext, emptyList, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(a10);
        f7357v = a10;
    }

    private static void r(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static k u(Context context) {
        return m(context).f(context);
    }

    public void b() {
        c4.l.a();
        this.f7359a.e();
    }

    public void c() {
        c4.l.b();
        this.f7361c.b();
        this.f7360b.b();
        this.f7363e.b();
    }

    public k3.b f() {
        return this.f7363e;
    }

    public k3.d g() {
        return this.f7360b;
    }

    public com.bumptech.glide.manager.d h() {
        return this.f7365r;
    }

    public Context i() {
        return this.f7362d.getBaseContext();
    }

    public d j() {
        return this.f7362d;
    }

    public h k() {
        return this.f7362d.h();
    }

    public q l() {
        return this.f7364f;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        c();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        s(i10);
    }

    public void p(k kVar) {
        synchronized (this.f7366s) {
            if (this.f7366s.contains(kVar)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.f7366s.add(kVar);
        }
    }

    public boolean q(z3.d<?> dVar) {
        synchronized (this.f7366s) {
            Iterator<k> it = this.f7366s.iterator();
            while (it.hasNext()) {
                if (it.next().x(dVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void s(int i10) {
        c4.l.b();
        synchronized (this.f7366s) {
            Iterator<k> it = this.f7366s.iterator();
            while (it.hasNext()) {
                it.next().onTrimMemory(i10);
            }
        }
        this.f7361c.a(i10);
        this.f7360b.a(i10);
        this.f7363e.a(i10);
    }

    public void t(k kVar) {
        synchronized (this.f7366s) {
            if (!this.f7366s.contains(kVar)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.f7366s.remove(kVar);
        }
    }
}
