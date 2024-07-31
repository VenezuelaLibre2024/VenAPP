package om;

import android.media.SoundPool;
import ck.v;
import dk.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class m implements j {

    /* renamed from: a */
    private final o f22715a;

    /* renamed from: b */
    private final l f22716b;

    /* renamed from: c */
    private Integer f22717c;

    /* renamed from: d */
    private Integer f22718d;

    /* renamed from: e */
    private nm.a f22719e;

    /* renamed from: f */
    private n f22720f;

    /* renamed from: g */
    private pm.c f22721g;

    public m(o wrappedPlayer, l soundPoolManager) {
        kotlin.jvm.internal.n.e(wrappedPlayer, "wrappedPlayer");
        kotlin.jvm.internal.n.e(soundPoolManager, "soundPoolManager");
        this.f22715a = wrappedPlayer;
        this.f22716b = soundPoolManager;
        nm.a h10 = wrappedPlayer.h();
        this.f22719e = h10;
        soundPoolManager.b(32, h10);
        n e10 = soundPoolManager.e(this.f22719e);
        if (e10 != null) {
            this.f22720f = e10;
            return;
        }
        throw new IllegalStateException(("Could not create SoundPool " + this.f22719e).toString());
    }

    private final SoundPool m() {
        return this.f22720f.c();
    }

    private final int p(boolean z10) {
        return z10 ? -1 : 0;
    }

    private final void q(nm.a aVar) {
        if (!kotlin.jvm.internal.n.a(this.f22719e.a(), aVar.a())) {
            release();
            this.f22716b.b(32, aVar);
            n e10 = this.f22716b.e(aVar);
            if (e10 == null) {
                throw new IllegalStateException(("Could not create SoundPool " + aVar).toString());
            }
            this.f22720f = e10;
        }
        this.f22719e = aVar;
    }

    private final Void s(String str) {
        throw new UnsupportedOperationException("LOW_LATENCY mode does not support: " + str);
    }

    @Override // om.j
    public void a() {
    }

    public Void b() {
        return null;
    }

    public Void c() {
        return null;
    }

    public final Integer d() {
        return this.f22717c;
    }

    @Override // om.j
    public /* bridge */ /* synthetic */ Integer e() {
        return (Integer) b();
    }

    @Override // om.j
    public void f(nm.a context) {
        kotlin.jvm.internal.n.e(context, "context");
        q(context);
    }

    @Override // om.j
    public void g(pm.b source) {
        kotlin.jvm.internal.n.e(source, "source");
        source.b(this);
    }

    @Override // om.j
    public /* bridge */ /* synthetic */ Integer getDuration() {
        return (Integer) c();
    }

    @Override // om.j
    public void h(boolean z10) {
        Integer num = this.f22718d;
        if (num != null) {
            m().setLoop(num.intValue(), p(z10));
        }
    }

    @Override // om.j
    public boolean i() {
        return false;
    }

    @Override // om.j
    public void j(float f10, float f11) {
        Integer num = this.f22718d;
        if (num != null) {
            m().setVolume(num.intValue(), f10, f11);
        }
    }

    @Override // om.j
    public boolean k() {
        return false;
    }

    @Override // om.j
    public void l(float f10) {
        Integer num = this.f22718d;
        if (num != null) {
            m().setRate(num.intValue(), f10);
        }
    }

    public final pm.c n() {
        return this.f22721g;
    }

    public final o o() {
        return this.f22715a;
    }

    @Override // om.j
    public void pause() {
        Integer num = this.f22718d;
        if (num != null) {
            m().pause(num.intValue());
        }
    }

    public final void r(pm.c cVar) {
        Object H;
        o oVar;
        String str;
        if (cVar != null) {
            synchronized (this.f22720f.d()) {
                Map<pm.c, List<m>> d10 = this.f22720f.d();
                List<m> list = d10.get(cVar);
                if (list == null) {
                    list = new ArrayList<>();
                    d10.put(cVar, list);
                }
                List<m> list2 = list;
                H = z.H(list2);
                m mVar = (m) H;
                if (mVar != null) {
                    boolean n10 = mVar.f22715a.n();
                    this.f22715a.H(n10);
                    this.f22717c = mVar.f22717c;
                    oVar = this.f22715a;
                    str = "Reusing soundId " + this.f22717c + " for " + cVar + " is prepared=" + n10 + ' ' + this;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    this.f22715a.H(false);
                    this.f22715a.r("Fetching actual URL for " + cVar);
                    String d11 = cVar.d();
                    this.f22715a.r("Now loading " + d11);
                    int load = m().load(d11, 1);
                    this.f22720f.b().put(Integer.valueOf(load), this);
                    this.f22717c = Integer.valueOf(load);
                    oVar = this.f22715a;
                    str = "time to call load() for " + cVar + ": " + (System.currentTimeMillis() - currentTimeMillis) + " player=" + this;
                }
                oVar.r(str);
                list2.add(this);
            }
        }
        this.f22721g = cVar;
    }

    @Override // om.j
    public void release() {
        Object X;
        stop();
        Integer num = this.f22717c;
        if (num != null) {
            int intValue = num.intValue();
            pm.c cVar = this.f22721g;
            if (cVar == null) {
                return;
            }
            synchronized (this.f22720f.d()) {
                List<m> list = this.f22720f.d().get(cVar);
                if (list == null) {
                    return;
                }
                X = z.X(list);
                if (X == this) {
                    this.f22720f.d().remove(cVar);
                    m().unload(intValue);
                    this.f22720f.b().remove(Integer.valueOf(intValue));
                    this.f22715a.r("unloaded soundId " + intValue);
                } else {
                    list.remove(this);
                }
                this.f22717c = null;
                r(null);
                v vVar = v.f7137a;
            }
        }
    }

    @Override // om.j
    public void reset() {
    }

    @Override // om.j
    public void seekTo(int i10) {
        if (i10 != 0) {
            s("seek");
            throw new ck.e();
        }
        Integer num = this.f22718d;
        if (num != null) {
            int intValue = num.intValue();
            stop();
            if (this.f22715a.m()) {
                m().resume(intValue);
            }
        }
    }

    @Override // om.j
    public void start() {
        Integer num = this.f22718d;
        Integer num2 = this.f22717c;
        if (num != null) {
            m().resume(num.intValue());
        } else if (num2 != null) {
            this.f22718d = Integer.valueOf(m().play(num2.intValue(), this.f22715a.p(), this.f22715a.p(), 0, p(this.f22715a.u()), this.f22715a.o()));
        }
    }

    @Override // om.j
    public void stop() {
        Integer num = this.f22718d;
        if (num != null) {
            m().stop(num.intValue());
            this.f22718d = null;
        }
    }
}
