package p120g8;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import p137hb.C7690e;
import p361t6.C11005b3;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p459y6.C12634x;
import p459y6.C12635y;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;

/* renamed from: g8.m */
/* loaded from: classes.dex */
public class C7495m implements InterfaceC12621k {

    /* renamed from: a */
    private final InterfaceC7492j f17705a;

    /* renamed from: d */
    private final C11108u1 f17708d;

    /* renamed from: g */
    private InterfaceC12623m f17711g;

    /* renamed from: h */
    private InterfaceC12609b0 f17712h;

    /* renamed from: i */
    private int f17713i;

    /* renamed from: b */
    private final C7486d f17706b = new C7486d();

    /* renamed from: c */
    private final C11146e0 f17707c = new C11146e0();

    /* renamed from: e */
    private final List<Long> f17709e = new ArrayList();

    /* renamed from: f */
    private final List<C11146e0> f17710f = new ArrayList();

    /* renamed from: j */
    private int f17714j = 0;

    /* renamed from: k */
    private long f17715k = -9223372036854775807L;

    public C7495m(InterfaceC7492j interfaceC7492j, C11108u1 c11108u1) {
        this.f17705a = interfaceC7492j;
        this.f17708d = c11108u1.m34488c().m34552g0("text/x-exoplayer-cues").m34530K(c11108u1.f28797w).m34526G();
    }

    /* renamed from: c */
    private void m22814c() {
        C7496n c7496n;
        AbstractC7497o abstractC7497o;
        try {
            C7496n mo22793d = this.f17705a.mo22793d();
            while (true) {
                c7496n = mo22793d;
                if (c7496n != null) {
                    break;
                }
                Thread.sleep(5L);
                mo22793d = this.f17705a.mo22793d();
            }
            c7496n.m38811y(this.f17713i);
            c7496n.f32142c.put(this.f17707c.m34682e(), 0, this.f17713i);
            c7496n.f32142c.limit(this.f17713i);
            this.f17705a.mo22792c(c7496n);
            AbstractC7497o mo22791b = this.f17705a.mo22791b();
            while (true) {
                abstractC7497o = mo22791b;
                if (abstractC7497o != null) {
                    break;
                }
                Thread.sleep(5L);
                mo22791b = this.f17705a.mo22791b();
            }
            for (int i10 = 0; i10 < abstractC7497o.mo22801l(); i10++) {
                byte[] m22784a = this.f17706b.m22784a(abstractC7497o.mo22799h(abstractC7497o.mo22800i(i10)));
                this.f17709e.add(Long.valueOf(abstractC7497o.mo22800i(i10)));
                this.f17710f.add(new C11146e0(m22784a));
            }
            abstractC7497o.mo22797x();
        } catch (C7493k e10) {
            throw C11005b3.m33715a("SubtitleDecoder failed.", e10);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: d */
    private boolean m22815d(InterfaceC12622l interfaceC12622l) {
        int m34680b = this.f17707c.m34680b();
        int i10 = this.f17713i;
        if (m34680b == i10) {
            this.f17707c.m34681c(i10 + RecognitionOptions.UPC_E);
        }
        int read = interfaceC12622l.read(this.f17707c.m34682e(), this.f17713i, this.f17707c.m34680b() - this.f17713i);
        if (read != -1) {
            this.f17713i += read;
        }
        long length = interfaceC12622l.getLength();
        return (length != -1 && ((long) this.f17713i) == length) || read == -1;
    }

    /* renamed from: g */
    private boolean m22816g(InterfaceC12622l interfaceC12622l) {
        return interfaceC12622l.mo41532a((interfaceC12622l.getLength() > (-1L) ? 1 : (interfaceC12622l.getLength() == (-1L) ? 0 : -1)) != 0 ? C7690e.m23413d(interfaceC12622l.getLength()) : RecognitionOptions.UPC_E) == -1;
    }

    /* renamed from: h */
    private void m22817h() {
        C11137a.m34607i(this.f17712h);
        C11137a.m34605g(this.f17709e.size() == this.f17710f.size());
        long j10 = this.f17715k;
        for (int m34920f = j10 == -9223372036854775807L ? 0 : C11172r0.m34920f(this.f17709e, Long.valueOf(j10), true, true); m34920f < this.f17710f.size(); m34920f++) {
            C11146e0 c11146e0 = this.f17710f.get(m34920f);
            c11146e0.m34677U(0);
            int length = c11146e0.m34682e().length;
            this.f17712h.m41511a(c11146e0, length);
            this.f17712h.mo331b(this.f17709e.get(m34920f).longValue(), 1, length, 0, null);
        }
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: a */
    public void mo121a(long j10, long j11) {
        int i10 = this.f17714j;
        C11137a.m34605g((i10 == 0 || i10 == 5) ? false : true);
        this.f17715k = j11;
        if (this.f17714j == 2) {
            this.f17714j = 1;
        }
        if (this.f17714j == 4) {
            this.f17714j = 3;
        }
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: b */
    public void mo122b(InterfaceC12623m interfaceC12623m) {
        C11137a.m34605g(this.f17714j == 0);
        this.f17711g = interfaceC12623m;
        this.f17712h = interfaceC12623m.mo308d(0, 3);
        this.f17711g.mo324q();
        this.f17711g.mo323p(new C12634x(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.f17712h.mo332c(this.f17708d);
        this.f17714j = 1;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: e */
    public boolean mo123e(InterfaceC12622l interfaceC12622l) {
        return true;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: f */
    public int mo124f(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        int i10 = this.f17714j;
        C11137a.m34605g((i10 == 0 || i10 == 5) ? false : true);
        if (this.f17714j == 1) {
            this.f17707c.m34673Q(interfaceC12622l.getLength() != -1 ? C7690e.m23413d(interfaceC12622l.getLength()) : RecognitionOptions.UPC_E);
            this.f17713i = 0;
            this.f17714j = 2;
        }
        if (this.f17714j == 2 && m22815d(interfaceC12622l)) {
            m22814c();
            m22817h();
            this.f17714j = 4;
        }
        if (this.f17714j == 3 && m22816g(interfaceC12622l)) {
            m22817h();
            this.f17714j = 4;
        }
        return this.f17714j == 4 ? -1 : 0;
    }

    @Override // p459y6.InterfaceC12621k
    public void release() {
        if (this.f17714j == 5) {
            return;
        }
        this.f17705a.release();
        this.f17714j = 5;
    }
}
