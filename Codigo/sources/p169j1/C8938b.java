package p169j1;

import android.content.Context;
import androidx.core.util.C0978b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: j1.b */
/* loaded from: classes.dex */
public class C8938b<D> {

    /* renamed from: a */
    int f21249a;

    /* renamed from: b */
    a<D> f21250b;

    /* renamed from: c */
    Context f21251c;

    /* renamed from: d */
    boolean f21252d = false;

    /* renamed from: e */
    boolean f21253e = false;

    /* renamed from: f */
    boolean f21254f = true;

    /* renamed from: g */
    boolean f21255g = false;

    /* renamed from: h */
    boolean f21256h = false;

    /* renamed from: j1.b$a */
    /* loaded from: classes.dex */
    public interface a<D> {
        /* renamed from: a */
        void mo7419a(C8938b<D> c8938b, D d10);
    }

    public C8938b(Context context) {
        this.f21251c = context.getApplicationContext();
    }

    /* renamed from: a */
    public void m26121a() {
        this.f21253e = true;
        m26129j();
    }

    /* renamed from: b */
    public boolean m26122b() {
        return mo26111k();
    }

    /* renamed from: c */
    public void m26123c() {
        this.f21256h = false;
    }

    /* renamed from: d */
    public String m26124d(D d10) {
        StringBuilder sb2 = new StringBuilder(64);
        C0978b.m4811a(d10, sb2);
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: e */
    public void m26125e() {
    }

    /* renamed from: f */
    public void m26126f(D d10) {
        a<D> aVar = this.f21250b;
        if (aVar != null) {
            aVar.mo7419a(this, d10);
        }
    }

    @Deprecated
    /* renamed from: g */
    public void mo26110g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f21249a);
        printWriter.print(" mListener=");
        printWriter.println(this.f21250b);
        if (this.f21252d || this.f21255g || this.f21256h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f21252d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f21255g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f21256h);
        }
        if (this.f21253e || this.f21254f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f21253e);
            printWriter.print(" mReset=");
            printWriter.println(this.f21254f);
        }
    }

    /* renamed from: h */
    public void m26127h() {
        mo26112m();
    }

    /* renamed from: i */
    public boolean m26128i() {
        return this.f21253e;
    }

    /* renamed from: j */
    protected void m26129j() {
    }

    /* renamed from: k */
    protected boolean mo26111k() {
        throw null;
    }

    /* renamed from: l */
    public void m26130l() {
        if (this.f21252d) {
            m26127h();
        } else {
            this.f21255g = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public void mo26112m() {
    }

    /* renamed from: n */
    protected void m26131n() {
    }

    /* renamed from: o */
    protected void mo26132o() {
        throw null;
    }

    /* renamed from: p */
    protected void m26133p() {
    }

    /* renamed from: q */
    public void m26134q(int i10, a<D> aVar) {
        if (this.f21250b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f21250b = aVar;
        this.f21249a = i10;
    }

    /* renamed from: r */
    public void m26135r() {
        m26131n();
        this.f21254f = true;
        this.f21252d = false;
        this.f21253e = false;
        this.f21255g = false;
        this.f21256h = false;
    }

    /* renamed from: s */
    public void m26136s() {
        if (this.f21256h) {
            m26130l();
        }
    }

    /* renamed from: t */
    public final void m26137t() {
        this.f21252d = true;
        this.f21254f = false;
        this.f21253e = false;
        mo26132o();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        C0978b.m4811a(this, sb2);
        sb2.append(" id=");
        sb2.append(this.f21249a);
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: u */
    public void m26138u() {
        this.f21252d = false;
        m26133p();
    }

    /* renamed from: v */
    public void m26139v(a<D> aVar) {
        a<D> aVar2 = this.f21250b;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (aVar2 != aVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f21250b = null;
    }
}
