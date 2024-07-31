package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f12495e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    static final Pattern f12496f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: g, reason: collision with root package name */
    static final Pattern f12497g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a, reason: collision with root package name */
    private final Set<la.d<String, g>> f12498a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Executor f12499b;

    /* renamed from: c, reason: collision with root package name */
    private final f f12500c;

    /* renamed from: d, reason: collision with root package name */
    private final f f12501d;

    public o(Executor executor, f fVar, f fVar2) {
        this.f12499b = executor;
        this.f12500c = fVar;
        this.f12501d = fVar2;
    }

    private void c(final String str, final g gVar) {
        if (gVar == null) {
            return;
        }
        synchronized (this.f12498a) {
            for (final la.d<String, g> dVar : this.f12498a) {
                this.f12499b.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        la.d.this.accept(str, gVar);
                    }
                });
            }
        }
    }

    private static g e(f fVar) {
        return fVar.f();
    }

    private static Set<String> f(f fVar) {
        HashSet hashSet = new HashSet();
        g e10 = e(fVar);
        if (e10 == null) {
            return hashSet;
        }
        Iterator<String> keys = e10.g().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    private static String h(f fVar, String str) {
        g e10 = e(fVar);
        if (e10 == null) {
            return null;
        }
        try {
            return e10.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void k(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void b(la.d<String, g> dVar) {
        synchronized (this.f12498a) {
            this.f12498a.add(dVar);
        }
    }

    public Map<String, ze.n> d() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(f(this.f12500c));
        hashSet.addAll(f(this.f12501d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, i(str));
        }
        return hashMap;
    }

    public String g(String str) {
        String h10 = h(this.f12500c, str);
        if (h10 != null) {
            c(str, e(this.f12500c));
            return h10;
        }
        String h11 = h(this.f12501d, str);
        if (h11 != null) {
            return h11;
        }
        k(str, "String");
        return "";
    }

    public ze.n i(String str) {
        String h10 = h(this.f12500c, str);
        if (h10 != null) {
            c(str, e(this.f12500c));
            return new w(h10, 2);
        }
        String h11 = h(this.f12501d, str);
        if (h11 != null) {
            return new w(h11, 1);
        }
        k(str, "FirebaseRemoteConfigValue");
        return new w("", 0);
    }
}
