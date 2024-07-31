package j1;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class b<D> {

    /* renamed from: a, reason: collision with root package name */
    int f19498a;

    /* renamed from: b, reason: collision with root package name */
    a<D> f19499b;

    /* renamed from: c, reason: collision with root package name */
    Context f19500c;

    /* renamed from: d, reason: collision with root package name */
    boolean f19501d = false;

    /* renamed from: e, reason: collision with root package name */
    boolean f19502e = false;

    /* renamed from: f, reason: collision with root package name */
    boolean f19503f = true;

    /* renamed from: g, reason: collision with root package name */
    boolean f19504g = false;

    /* renamed from: h, reason: collision with root package name */
    boolean f19505h = false;

    /* loaded from: classes.dex */
    public interface a<D> {
        void a(b<D> bVar, D d10);
    }

    public b(Context context) {
        this.f19500c = context.getApplicationContext();
    }

    public void a() {
        this.f19502e = true;
        j();
    }

    public boolean b() {
        return k();
    }

    public void c() {
        this.f19505h = false;
    }

    public String d(D d10) {
        StringBuilder sb2 = new StringBuilder(64);
        androidx.core.util.b.a(d10, sb2);
        sb2.append("}");
        return sb2.toString();
    }

    public void e() {
    }

    public void f(D d10) {
        a<D> aVar = this.f19499b;
        if (aVar != null) {
            aVar.a(this, d10);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f19498a);
        printWriter.print(" mListener=");
        printWriter.println(this.f19499b);
        if (this.f19501d || this.f19504g || this.f19505h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f19501d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f19504g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f19505h);
        }
        if (this.f19502e || this.f19503f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f19502e);
            printWriter.print(" mReset=");
            printWriter.println(this.f19503f);
        }
    }

    public void h() {
        m();
    }

    public boolean i() {
        return this.f19502e;
    }

    protected void j() {
    }

    protected boolean k() {
        throw null;
    }

    public void l() {
        if (this.f19501d) {
            h();
        } else {
            this.f19504g = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m() {
    }

    protected void n() {
    }

    protected void o() {
        throw null;
    }

    protected void p() {
    }

    public void q(int i10, a<D> aVar) {
        if (this.f19499b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f19499b = aVar;
        this.f19498a = i10;
    }

    public void r() {
        n();
        this.f19503f = true;
        this.f19501d = false;
        this.f19502e = false;
        this.f19504g = false;
        this.f19505h = false;
    }

    public void s() {
        if (this.f19505h) {
            l();
        }
    }

    public final void t() {
        this.f19501d = true;
        this.f19503f = false;
        this.f19502e = false;
        o();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        androidx.core.util.b.a(this, sb2);
        sb2.append(" id=");
        sb2.append(this.f19498a);
        sb2.append("}");
        return sb2.toString();
    }

    public void u() {
        this.f19501d = false;
        p();
    }

    public void v(a<D> aVar) {
        a<D> aVar2 = this.f19499b;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (aVar2 != aVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f19499b = null;
    }
}
