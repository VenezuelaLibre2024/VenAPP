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
import la.InterfaceC9459d;
import org.json.JSONException;
import p488ze.InterfaceC13017n;

/* renamed from: com.google.firebase.remoteconfig.internal.o */
/* loaded from: classes2.dex */
public class C6359o {

    /* renamed from: e */
    public static final Charset f13727e = Charset.forName("UTF-8");

    /* renamed from: f */
    static final Pattern f13728f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: g */
    static final Pattern f13729g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a */
    private final Set<InterfaceC9459d<String, C6351g>> f13730a = new HashSet();

    /* renamed from: b */
    private final Executor f13731b;

    /* renamed from: c */
    private final C6350f f13732c;

    /* renamed from: d */
    private final C6350f f13733d;

    public C6359o(Executor executor, C6350f c6350f, C6350f c6350f2) {
        this.f13731b = executor;
        this.f13732c = c6350f;
        this.f13733d = c6350f2;
    }

    /* renamed from: c */
    private void m17681c(final String str, final C6351g c6351g) {
        if (c6351g == null) {
            return;
        }
        synchronized (this.f13730a) {
            for (final InterfaceC9459d<String, C6351g> interfaceC9459d : this.f13730a) {
                this.f13731b.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9459d.this.accept(str, c6351g);
                    }
                });
            }
        }
    }

    /* renamed from: e */
    private static C6351g m17682e(C6350f c6350f) {
        return c6350f.m17620f();
    }

    /* renamed from: f */
    private static Set<String> m17683f(C6350f c6350f) {
        HashSet hashSet = new HashSet();
        C6351g m17682e = m17682e(c6350f);
        if (m17682e == null) {
            return hashSet;
        }
        Iterator<String> keys = m17682e.m17632g().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    /* renamed from: h */
    private static String m17684h(C6350f c6350f, String str) {
        C6351g m17682e = m17682e(c6350f);
        if (m17682e == null) {
            return null;
        }
        try {
            return m17682e.m17632g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: k */
    private static void m17686k(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    /* renamed from: b */
    public void m17687b(InterfaceC9459d<String, C6351g> interfaceC9459d) {
        synchronized (this.f13730a) {
            this.f13730a.add(interfaceC9459d);
        }
    }

    /* renamed from: d */
    public Map<String, InterfaceC13017n> m17688d() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(m17683f(this.f13732c));
        hashSet.addAll(m17683f(this.f13733d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, m17690i(str));
        }
        return hashMap;
    }

    /* renamed from: g */
    public String m17689g(String str) {
        String m17684h = m17684h(this.f13732c, str);
        if (m17684h != null) {
            m17681c(str, m17682e(this.f13732c));
            return m17684h;
        }
        String m17684h2 = m17684h(this.f13733d, str);
        if (m17684h2 != null) {
            return m17684h2;
        }
        m17686k(str, "String");
        return "";
    }

    /* renamed from: i */
    public InterfaceC13017n m17690i(String str) {
        String m17684h = m17684h(this.f13732c, str);
        if (m17684h != null) {
            m17681c(str, m17682e(this.f13732c));
            return new C6367w(m17684h, 2);
        }
        String m17684h2 = m17684h(this.f13733d, str);
        if (m17684h2 != null) {
            return new C6367w(m17684h2, 1);
        }
        m17686k(str, "FirebaseRemoteConfigValue");
        return new C6367w("", 0);
    }
}
