package androidx.camera.core.impl;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p407w.C12027n0;
import p407w.C12029o0;
import p407w.C12034r;

/* renamed from: androidx.camera.core.impl.e0 */
/* loaded from: classes.dex */
public final class C0614e0 {

    /* renamed from: a */
    private final Object f2791a = new Object();

    /* renamed from: b */
    private final Map<String, InterfaceC0606c0> f2792b = new LinkedHashMap();

    /* renamed from: c */
    private final Set<InterfaceC0606c0> f2793c = new HashSet();

    /* renamed from: a */
    public LinkedHashSet<InterfaceC0606c0> m3037a() {
        LinkedHashSet<InterfaceC0606c0> linkedHashSet;
        synchronized (this.f2791a) {
            linkedHashSet = new LinkedHashSet<>(this.f2792b.values());
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public void m3038b(InterfaceC0598a0 interfaceC0598a0) {
        synchronized (this.f2791a) {
            try {
                try {
                    for (String str : interfaceC0598a0.mo2800b()) {
                        C12029o0.m38638a("CameraRepository", "Added camera: " + str);
                        this.f2792b.put(str, interfaceC0598a0.mo2799a(str));
                    }
                } catch (C12034r e10) {
                    throw new C12027n0(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
