package com.bumptech.glide.manager;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p036c4.C1871l;
import p456y3.InterfaceC12590e;

/* renamed from: com.bumptech.glide.manager.s */
/* loaded from: classes.dex */
public class C2162s {

    /* renamed from: a */
    private final Set<InterfaceC12590e> f8473a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final Set<InterfaceC12590e> f8474b = new HashSet();

    /* renamed from: c */
    private boolean f8475c;

    /* renamed from: a */
    public boolean m10838a(InterfaceC12590e interfaceC12590e) {
        boolean z10 = true;
        if (interfaceC12590e == null) {
            return true;
        }
        boolean remove = this.f8473a.remove(interfaceC12590e);
        if (!this.f8474b.remove(interfaceC12590e) && !remove) {
            z10 = false;
        }
        if (z10) {
            interfaceC12590e.clear();
        }
        return z10;
    }

    /* renamed from: b */
    public void m10839b() {
        Iterator it = C1871l.m9961j(this.f8473a).iterator();
        while (it.hasNext()) {
            m10838a((InterfaceC12590e) it.next());
        }
        this.f8474b.clear();
    }

    /* renamed from: c */
    public void m10840c() {
        this.f8475c = true;
        for (InterfaceC12590e interfaceC12590e : C1871l.m9961j(this.f8473a)) {
            if (interfaceC12590e.isRunning() || interfaceC12590e.mo41387g()) {
                interfaceC12590e.clear();
                this.f8474b.add(interfaceC12590e);
            }
        }
    }

    /* renamed from: d */
    public void m10841d() {
        this.f8475c = true;
        for (InterfaceC12590e interfaceC12590e : C1871l.m9961j(this.f8473a)) {
            if (interfaceC12590e.isRunning()) {
                interfaceC12590e.pause();
                this.f8474b.add(interfaceC12590e);
            }
        }
    }

    /* renamed from: e */
    public void m10842e() {
        for (InterfaceC12590e interfaceC12590e : C1871l.m9961j(this.f8473a)) {
            if (!interfaceC12590e.mo41387g() && !interfaceC12590e.mo41385e()) {
                interfaceC12590e.clear();
                if (this.f8475c) {
                    this.f8474b.add(interfaceC12590e);
                } else {
                    interfaceC12590e.mo41390j();
                }
            }
        }
    }

    /* renamed from: f */
    public void m10843f() {
        this.f8475c = false;
        for (InterfaceC12590e interfaceC12590e : C1871l.m9961j(this.f8473a)) {
            if (!interfaceC12590e.mo41387g() && !interfaceC12590e.isRunning()) {
                interfaceC12590e.mo41390j();
            }
        }
        this.f8474b.clear();
    }

    /* renamed from: g */
    public void m10844g(InterfaceC12590e interfaceC12590e) {
        this.f8473a.add(interfaceC12590e);
        if (!this.f8475c) {
            interfaceC12590e.mo41390j();
            return;
        }
        interfaceC12590e.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f8474b.add(interfaceC12590e);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f8473a.size() + ", isPaused=" + this.f8475c + "}";
    }
}
