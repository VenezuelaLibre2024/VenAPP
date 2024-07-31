package p170j2;

import android.content.Context;
import ck.C2037v;
import dk.C7042z;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import p094f2.AbstractC7277j;
import p128h2.InterfaceC7611a;
import p230m2.InterfaceC9536b;

/* renamed from: j2.h */
/* loaded from: classes.dex */
public abstract class AbstractC8947h<T> {

    /* renamed from: a */
    private final InterfaceC9536b f21281a;

    /* renamed from: b */
    private final Context f21282b;

    /* renamed from: c */
    private final Object f21283c;

    /* renamed from: d */
    private final LinkedHashSet<InterfaceC7611a<T>> f21284d;

    /* renamed from: e */
    private T f21285e;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8947h(Context context, InterfaceC9536b taskExecutor) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(taskExecutor, "taskExecutor");
        this.f21281a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        C9322n.m27780d(applicationContext, "context.applicationContext");
        this.f21282b = applicationContext;
        this.f21283c = new Object();
        this.f21284d = new LinkedHashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m26162b(List listenersList, AbstractC8947h this$0) {
        C9322n.m27781e(listenersList, "$listenersList");
        C9322n.m27781e(this$0, "this$0");
        Iterator<T> it = listenersList.iterator();
        while (it.hasNext()) {
            ((InterfaceC7611a) it.next()).mo23127a(this$0.f21285e);
        }
    }

    /* renamed from: c */
    public final void m26163c(InterfaceC7611a<T> listener) {
        String str;
        C9322n.m27781e(listener, "listener");
        synchronized (this.f21283c) {
            if (this.f21284d.add(listener)) {
                if (this.f21284d.size() == 1) {
                    this.f21285e = mo26151e();
                    AbstractC7277j m21767e = AbstractC7277j.m21767e();
                    str = C8948i.f21286a;
                    m21767e.mo21770a(str, getClass().getSimpleName() + ": initial state = " + this.f21285e);
                    mo26158h();
                }
                listener.mo23127a(this.f21285e);
            }
            C2037v c2037v = C2037v.f8089a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final Context m26164d() {
        return this.f21282b;
    }

    /* renamed from: e */
    public abstract T mo26151e();

    /* renamed from: f */
    public final void m26165f(InterfaceC7611a<T> listener) {
        C9322n.m27781e(listener, "listener");
        synchronized (this.f21283c) {
            if (this.f21284d.remove(listener) && this.f21284d.isEmpty()) {
                mo26159i();
            }
            C2037v c2037v = C2037v.f8089a;
        }
    }

    /* renamed from: g */
    public final void m26166g(T t10) {
        final List m20630f0;
        synchronized (this.f21283c) {
            T t11 = this.f21285e;
            if (t11 == null || !C9322n.m27777a(t11, t10)) {
                this.f21285e = t10;
                m20630f0 = C7042z.m20630f0(this.f21284d);
                this.f21281a.mo28363a().execute(new Runnable() { // from class: j2.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC8947h.m26162b(m20630f0, this);
                    }
                });
                C2037v c2037v = C2037v.f8089a;
            }
        }
    }

    /* renamed from: h */
    public abstract void mo26158h();

    /* renamed from: i */
    public abstract void mo26159i();
}
