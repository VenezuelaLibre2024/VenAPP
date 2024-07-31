package om;

import android.media.SoundPool;
import ck.C2020e;
import ck.C2037v;
import dk.C7027p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C9322n;
import p258nm.C9731a;
import pm.C10213c;
import pm.InterfaceC10212b;

/* renamed from: om.m */
/* loaded from: classes3.dex */
public final class C10024m implements InterfaceC10021j {

    /* renamed from: a */
    private final C10026o f24648a;

    /* renamed from: b */
    private final C10023l f24649b;

    /* renamed from: c */
    private Integer f24650c;

    /* renamed from: d */
    private Integer f24651d;

    /* renamed from: e */
    private C9731a f24652e;

    /* renamed from: f */
    private C10025n f24653f;

    /* renamed from: g */
    private C10213c f24654g;

    public C10024m(C10026o wrappedPlayer, C10023l soundPoolManager) {
        C9322n.m27781e(wrappedPlayer, "wrappedPlayer");
        C9322n.m27781e(soundPoolManager, "soundPoolManager");
        this.f24648a = wrappedPlayer;
        this.f24649b = soundPoolManager;
        C9731a m29920h = wrappedPlayer.m29920h();
        this.f24652e = m29920h;
        soundPoolManager.m29878b(32, m29920h);
        C10025n m29880e = soundPoolManager.m29880e(this.f24652e);
        if (m29880e != null) {
            this.f24653f = m29880e;
            return;
        }
        throw new IllegalStateException(("Could not create SoundPool " + this.f24652e).toString());
    }

    /* renamed from: m */
    private final SoundPool m29881m() {
        return this.f24653f.m29893c();
    }

    /* renamed from: p */
    private final int m29882p(boolean z10) {
        return z10 ? -1 : 0;
    }

    /* renamed from: q */
    private final void m29883q(C9731a c9731a) {
        if (!C9322n.m27777a(this.f24652e.m29166a(), c9731a.m29166a())) {
            release();
            this.f24649b.m29878b(32, c9731a);
            C10025n m29880e = this.f24649b.m29880e(c9731a);
            if (m29880e == null) {
                throw new IllegalStateException(("Could not create SoundPool " + c9731a).toString());
            }
            this.f24653f = m29880e;
        }
        this.f24652e = c9731a;
    }

    /* renamed from: s */
    private final Void m29884s(String str) {
        throw new UnsupportedOperationException("LOW_LATENCY mode does not support: " + str);
    }

    @Override // om.InterfaceC10021j
    /* renamed from: a */
    public void mo29867a() {
    }

    /* renamed from: b */
    public Void m29885b() {
        return null;
    }

    /* renamed from: c */
    public Void m29886c() {
        return null;
    }

    /* renamed from: d */
    public final Integer m29887d() {
        return this.f24650c;
    }

    @Override // om.InterfaceC10021j
    /* renamed from: e */
    public /* bridge */ /* synthetic */ Integer mo29868e() {
        return (Integer) m29885b();
    }

    @Override // om.InterfaceC10021j
    /* renamed from: f */
    public void mo29869f(C9731a context) {
        C9322n.m27781e(context, "context");
        m29883q(context);
    }

    @Override // om.InterfaceC10021j
    /* renamed from: g */
    public void mo29870g(InterfaceC10212b source) {
        C9322n.m27781e(source, "source");
        source.mo30555b(this);
    }

    @Override // om.InterfaceC10021j
    public /* bridge */ /* synthetic */ Integer getDuration() {
        return (Integer) m29886c();
    }

    @Override // om.InterfaceC10021j
    /* renamed from: h */
    public void mo29871h(boolean z10) {
        Integer num = this.f24651d;
        if (num != null) {
            m29881m().setLoop(num.intValue(), m29882p(z10));
        }
    }

    @Override // om.InterfaceC10021j
    /* renamed from: i */
    public boolean mo29872i() {
        return false;
    }

    @Override // om.InterfaceC10021j
    /* renamed from: j */
    public void mo29873j(float f10, float f11) {
        Integer num = this.f24651d;
        if (num != null) {
            m29881m().setVolume(num.intValue(), f10, f11);
        }
    }

    @Override // om.InterfaceC10021j
    /* renamed from: k */
    public boolean mo29874k() {
        return false;
    }

    @Override // om.InterfaceC10021j
    /* renamed from: l */
    public void mo29875l(float f10) {
        Integer num = this.f24651d;
        if (num != null) {
            m29881m().setRate(num.intValue(), f10);
        }
    }

    /* renamed from: n */
    public final C10213c m29888n() {
        return this.f24654g;
    }

    /* renamed from: o */
    public final C10026o m29889o() {
        return this.f24648a;
    }

    @Override // om.InterfaceC10021j
    public void pause() {
        Integer num = this.f24651d;
        if (num != null) {
            m29881m().pause(num.intValue());
        }
    }

    /* renamed from: r */
    public final void m29890r(C10213c c10213c) {
        C10026o c10026o;
        String str;
        if (c10213c != null) {
            synchronized (this.f24653f.m29894d()) {
                Map<C10213c, List<C10024m>> m29894d = this.f24653f.m29894d();
                List<C10024m> list = m29894d.get(c10213c);
                if (list == null) {
                    list = new ArrayList<>();
                    m29894d.put(c10213c, list);
                }
                List<C10024m> list2 = list;
                C10024m c10024m = (C10024m) C7027p.m20519H(list2);
                if (c10024m != null) {
                    boolean m29925n = c10024m.f24648a.m29925n();
                    this.f24648a.m29910H(m29925n);
                    this.f24650c = c10024m.f24650c;
                    c10026o = this.f24648a;
                    str = "Reusing soundId " + this.f24650c + " for " + c10213c + " is prepared=" + m29925n + ' ' + this;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    this.f24648a.m29910H(false);
                    this.f24648a.m29929r("Fetching actual URL for " + c10213c);
                    String m30558d = c10213c.m30558d();
                    this.f24648a.m29929r("Now loading " + m30558d);
                    int load = m29881m().load(m30558d, 1);
                    this.f24653f.m29892b().put(Integer.valueOf(load), this);
                    this.f24650c = Integer.valueOf(load);
                    c10026o = this.f24648a;
                    str = "time to call load() for " + c10213c + ": " + (System.currentTimeMillis() - currentTimeMillis) + " player=" + this;
                }
                c10026o.m29929r(str);
                list2.add(this);
            }
        }
        this.f24654g = c10213c;
    }

    @Override // om.InterfaceC10021j
    public void release() {
        stop();
        Integer num = this.f24650c;
        if (num != null) {
            int intValue = num.intValue();
            C10213c c10213c = this.f24654g;
            if (c10213c == null) {
                return;
            }
            synchronized (this.f24653f.m29894d()) {
                List<C10024m> list = this.f24653f.m29894d().get(c10213c);
                if (list == null) {
                    return;
                }
                if (C7027p.m20530X(list) == this) {
                    this.f24653f.m29894d().remove(c10213c);
                    m29881m().unload(intValue);
                    this.f24653f.m29892b().remove(Integer.valueOf(intValue));
                    this.f24648a.m29929r("unloaded soundId " + intValue);
                } else {
                    list.remove(this);
                }
                this.f24650c = null;
                m29890r(null);
                C2037v c2037v = C2037v.f8089a;
            }
        }
    }

    @Override // om.InterfaceC10021j
    public void reset() {
    }

    @Override // om.InterfaceC10021j
    public void seekTo(int i10) {
        if (i10 != 0) {
            m29884s("seek");
            throw new C2020e();
        }
        Integer num = this.f24651d;
        if (num != null) {
            int intValue = num.intValue();
            stop();
            if (this.f24648a.m29924m()) {
                m29881m().resume(intValue);
            }
        }
    }

    @Override // om.InterfaceC10021j
    public void start() {
        Integer num = this.f24651d;
        Integer num2 = this.f24650c;
        if (num != null) {
            m29881m().resume(num.intValue());
        } else if (num2 != null) {
            this.f24651d = Integer.valueOf(m29881m().play(num2.intValue(), this.f24648a.m29927p(), this.f24648a.m29927p(), 0, m29882p(this.f24648a.m29931u()), this.f24648a.m29926o()));
        }
    }

    @Override // om.InterfaceC10021j
    public void stop() {
        Integer num = this.f24651d;
        if (num != null) {
            m29881m().stop(num.intValue());
            this.f24651d = null;
        }
    }
}
