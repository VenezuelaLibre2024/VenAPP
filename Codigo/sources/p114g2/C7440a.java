package p114g2;

import java.util.HashMap;
import java.util.Map;
import p094f2.AbstractC7277j;
import p094f2.InterfaceC7284q;
import p192k2.C9132u;

/* renamed from: g2.a */
/* loaded from: classes.dex */
public class C7440a {

    /* renamed from: d */
    static final String f17283d = AbstractC7277j.m21769i("DelayedWorkTracker");

    /* renamed from: a */
    final C7441b f17284a;

    /* renamed from: b */
    private final InterfaceC7284q f17285b;

    /* renamed from: c */
    private final Map<String, Runnable> f17286c = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g2.a$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9132u f17287a;

        a(C9132u c9132u) {
            this.f17287a = c9132u;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC7277j.m21767e().mo21770a(C7440a.f17283d, "Scheduling work " + this.f17287a.f22005a);
            C7440a.this.f17284a.mo8664a(this.f17287a);
        }
    }

    public C7440a(C7441b c7441b, InterfaceC7284q interfaceC7284q) {
        this.f17284a = c7441b;
        this.f17285b = interfaceC7284q;
    }

    /* renamed from: a */
    public void m22441a(C9132u c9132u) {
        Runnable remove = this.f17286c.remove(c9132u.f22005a);
        if (remove != null) {
            this.f17285b.mo8673a(remove);
        }
        a aVar = new a(c9132u);
        this.f17286c.put(c9132u.f22005a, aVar);
        this.f17285b.mo8674b(c9132u.m26893c() - System.currentTimeMillis(), aVar);
    }

    /* renamed from: b */
    public void m22442b(String str) {
        Runnable remove = this.f17286c.remove(str);
        if (remove != null) {
            this.f17285b.mo8673a(remove);
        }
    }
}
