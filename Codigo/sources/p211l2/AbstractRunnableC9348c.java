package p211l2;

import androidx.work.impl.C1553e0;
import androidx.work.impl.C1574o;
import androidx.work.impl.C1580u;
import androidx.work.impl.InterfaceC1579t;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import p094f2.C7286s;
import p094f2.InterfaceC7280m;
import p192k2.InterfaceC9112b;
import p192k2.InterfaceC9133v;

/* renamed from: l2.c */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC9348c implements Runnable {

    /* renamed from: a */
    private final C1574o f22638a = new C1574o();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l2.c$a */
    /* loaded from: classes.dex */
    public class a extends AbstractRunnableC9348c {

        /* renamed from: b */
        final /* synthetic */ C1553e0 f22639b;

        /* renamed from: c */
        final /* synthetic */ UUID f22640c;

        a(C1553e0 c1553e0, UUID uuid) {
            this.f22639b = c1553e0;
            this.f22640c = uuid;
        }

        @Override // p211l2.AbstractRunnableC9348c
        /* renamed from: h */
        void mo27847h() {
            WorkDatabase m8692r = this.f22639b.m8692r();
            m8692r.m32253e();
            try {
                m27844a(this.f22639b, this.f22640c.toString());
                m8692r.m32250B();
                m8692r.m32255i();
                m27846g(this.f22639b);
            } catch (Throwable th2) {
                m8692r.m32255i();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l2.c$b */
    /* loaded from: classes.dex */
    public class b extends AbstractRunnableC9348c {

        /* renamed from: b */
        final /* synthetic */ C1553e0 f22641b;

        /* renamed from: c */
        final /* synthetic */ String f22642c;

        b(C1553e0 c1553e0, String str) {
            this.f22641b = c1553e0;
            this.f22642c = str;
        }

        @Override // p211l2.AbstractRunnableC9348c
        /* renamed from: h */
        void mo27847h() {
            WorkDatabase m8692r = this.f22641b.m8692r();
            m8692r.m32253e();
            try {
                Iterator<String> it = m8692r.mo8560J().mo26911j(this.f22642c).iterator();
                while (it.hasNext()) {
                    m27844a(this.f22641b, it.next());
                }
                m8692r.m32250B();
                m8692r.m32255i();
                m27846g(this.f22641b);
            } catch (Throwable th2) {
                m8692r.m32255i();
                throw th2;
            }
        }
    }

    /* renamed from: l2.c$c */
    /* loaded from: classes.dex */
    class c extends AbstractRunnableC9348c {

        /* renamed from: b */
        final /* synthetic */ C1553e0 f22643b;

        /* renamed from: c */
        final /* synthetic */ String f22644c;

        /* renamed from: d */
        final /* synthetic */ boolean f22645d;

        c(C1553e0 c1553e0, String str, boolean z10) {
            this.f22643b = c1553e0;
            this.f22644c = str;
            this.f22645d = z10;
        }

        @Override // p211l2.AbstractRunnableC9348c
        /* renamed from: h */
        void mo27847h() {
            WorkDatabase m8692r = this.f22643b.m8692r();
            m8692r.m32253e();
            try {
                Iterator<String> it = m8692r.mo8560J().mo26907f(this.f22644c).iterator();
                while (it.hasNext()) {
                    m27844a(this.f22643b, it.next());
                }
                m8692r.m32250B();
                m8692r.m32255i();
                if (this.f22645d) {
                    m27846g(this.f22643b);
                }
            } catch (Throwable th2) {
                m8692r.m32255i();
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public static AbstractRunnableC9348c m27840b(UUID uuid, C1553e0 c1553e0) {
        return new a(c1553e0, uuid);
    }

    /* renamed from: c */
    public static AbstractRunnableC9348c m27841c(String str, C1553e0 c1553e0, boolean z10) {
        return new c(c1553e0, str, z10);
    }

    /* renamed from: d */
    public static AbstractRunnableC9348c m27842d(String str, C1553e0 c1553e0) {
        return new b(c1553e0, str);
    }

    /* renamed from: f */
    private void m27843f(WorkDatabase workDatabase, String str) {
        InterfaceC9133v mo8560J = workDatabase.mo8560J();
        InterfaceC9112b mo8555E = workDatabase.mo8555E();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            C7286s.a mo26908g = mo8560J.mo26908g(str2);
            if (mo26908g != C7286s.a.SUCCEEDED && mo26908g != C7286s.a.FAILED) {
                mo8560J.mo26924w(C7286s.a.CANCELLED, str2);
            }
            linkedList.addAll(mo8555E.mo26839a(str2));
        }
    }

    /* renamed from: a */
    void m27844a(C1553e0 c1553e0, String str) {
        m27843f(c1553e0.m8692r(), str);
        c1553e0.m8689o().m8761r(str);
        Iterator<InterfaceC1579t> it = c1553e0.m8690p().iterator();
        while (it.hasNext()) {
            it.next().mo8665c(str);
        }
    }

    /* renamed from: e */
    public InterfaceC7280m m27845e() {
        return this.f22638a;
    }

    /* renamed from: g */
    void m27846g(C1553e0 c1553e0) {
        C1580u.m8765b(c1553e0.m8687k(), c1553e0.m8692r(), c1553e0.m8690p());
    }

    /* renamed from: h */
    abstract void mo27847h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            mo27847h();
            this.f22638a.m8746a(InterfaceC7280m.f16314a);
        } catch (Throwable th2) {
            this.f22638a.m8746a(new InterfaceC7280m.b.a(th2));
        }
    }
}
