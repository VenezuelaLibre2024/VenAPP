package com.bumptech.glide.manager;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private final Set<y3.e> f7506a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Set<y3.e> f7507b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f7508c;

    public boolean a(y3.e eVar) {
        boolean z10 = true;
        if (eVar == null) {
            return true;
        }
        boolean remove = this.f7506a.remove(eVar);
        if (!this.f7507b.remove(eVar) && !remove) {
            z10 = false;
        }
        if (z10) {
            eVar.clear();
        }
        return z10;
    }

    public void b() {
        Iterator it = c4.l.j(this.f7506a).iterator();
        while (it.hasNext()) {
            a((y3.e) it.next());
        }
        this.f7507b.clear();
    }

    public void c() {
        this.f7508c = true;
        for (y3.e eVar : c4.l.j(this.f7506a)) {
            if (eVar.isRunning() || eVar.g()) {
                eVar.clear();
                this.f7507b.add(eVar);
            }
        }
    }

    public void d() {
        this.f7508c = true;
        for (y3.e eVar : c4.l.j(this.f7506a)) {
            if (eVar.isRunning()) {
                eVar.pause();
                this.f7507b.add(eVar);
            }
        }
    }

    public void e() {
        for (y3.e eVar : c4.l.j(this.f7506a)) {
            if (!eVar.g() && !eVar.e()) {
                eVar.clear();
                if (this.f7508c) {
                    this.f7507b.add(eVar);
                } else {
                    eVar.j();
                }
            }
        }
    }

    public void f() {
        this.f7508c = false;
        for (y3.e eVar : c4.l.j(this.f7506a)) {
            if (!eVar.g() && !eVar.isRunning()) {
                eVar.j();
            }
        }
        this.f7507b.clear();
    }

    public void g(y3.e eVar) {
        this.f7506a.add(eVar);
        if (!this.f7508c) {
            eVar.j();
            return;
        }
        eVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f7507b.add(eVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f7506a.size() + ", isPaused=" + this.f7508c + "}";
    }
}
