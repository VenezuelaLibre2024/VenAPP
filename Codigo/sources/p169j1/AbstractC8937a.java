package p169j1;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.os.C0952k;
import androidx.core.util.C0986j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: j1.a */
/* loaded from: classes.dex */
public abstract class AbstractC8937a<D> extends C8938b<D> {

    /* renamed from: i */
    private final Executor f21240i;

    /* renamed from: j */
    volatile AbstractC8937a<D>.a f21241j;

    /* renamed from: k */
    volatile AbstractC8937a<D>.a f21242k;

    /* renamed from: l */
    long f21243l;

    /* renamed from: m */
    long f21244m;

    /* renamed from: n */
    Handler f21245n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j1.a$a */
    /* loaded from: classes.dex */
    public final class a extends AbstractC8939c<Void, Void, D> implements Runnable {

        /* renamed from: v */
        private final CountDownLatch f21246v = new CountDownLatch(1);

        /* renamed from: w */
        boolean f21247w;

        a() {
        }

        @Override // p169j1.AbstractC8939c
        /* renamed from: h */
        protected void mo26118h(D d10) {
            try {
                AbstractC8937a.this.m26114x(this, d10);
            } finally {
                this.f21246v.countDown();
            }
        }

        @Override // p169j1.AbstractC8939c
        /* renamed from: i */
        protected void mo26119i(D d10) {
            try {
                AbstractC8937a.this.m26115y(this, d10);
            } finally {
                this.f21246v.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p169j1.AbstractC8939c
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public D mo26117b(Void... voidArr) {
            try {
                return (D) AbstractC8937a.this.m26109C();
            } catch (C0952k e10) {
                if (m26144f()) {
                    return null;
                }
                throw e10;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21247w = false;
            AbstractC8937a.this.m26116z();
        }
    }

    public AbstractC8937a(Context context) {
        this(context, AbstractC8939c.f21259s);
    }

    private AbstractC8937a(Context context, Executor executor) {
        super(context);
        this.f21244m = -10000L;
        this.f21240i = executor;
    }

    /* renamed from: A */
    public abstract D mo26107A();

    /* renamed from: B */
    public void m26108B(D d10) {
    }

    /* renamed from: C */
    protected D m26109C() {
        return mo26107A();
    }

    @Override // p169j1.C8938b
    @Deprecated
    /* renamed from: g */
    public void mo26110g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo26110g(str, fileDescriptor, printWriter, strArr);
        if (this.f21241j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f21241j);
            printWriter.print(" waiting=");
            printWriter.println(this.f21241j.f21247w);
        }
        if (this.f21242k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f21242k);
            printWriter.print(" waiting=");
            printWriter.println(this.f21242k.f21247w);
        }
        if (this.f21243l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C0986j.m4841c(this.f21243l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C0986j.m4840b(this.f21244m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // p169j1.C8938b
    /* renamed from: k */
    protected boolean mo26111k() {
        if (this.f21241j == null) {
            return false;
        }
        if (!this.f21252d) {
            this.f21255g = true;
        }
        if (this.f21242k != null) {
            if (this.f21241j.f21247w) {
                this.f21241j.f21247w = false;
                this.f21245n.removeCallbacks(this.f21241j);
            }
            this.f21241j = null;
            return false;
        }
        if (this.f21241j.f21247w) {
            this.f21241j.f21247w = false;
            this.f21245n.removeCallbacks(this.f21241j);
            this.f21241j = null;
            return false;
        }
        boolean m26141a = this.f21241j.m26141a(false);
        if (m26141a) {
            this.f21242k = this.f21241j;
            m26113w();
        }
        this.f21241j = null;
        return m26141a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p169j1.C8938b
    /* renamed from: m */
    public void mo26112m() {
        super.mo26112m();
        m26122b();
        this.f21241j = new a();
        m26116z();
    }

    /* renamed from: w */
    public void m26113w() {
    }

    /* renamed from: x */
    void m26114x(AbstractC8937a<D>.a aVar, D d10) {
        m26108B(d10);
        if (this.f21242k == aVar) {
            m26136s();
            this.f21244m = SystemClock.uptimeMillis();
            this.f21242k = null;
            m26125e();
            m26116z();
        }
    }

    /* renamed from: y */
    void m26115y(AbstractC8937a<D>.a aVar, D d10) {
        if (this.f21241j != aVar) {
            m26114x(aVar, d10);
            return;
        }
        if (m26128i()) {
            m26108B(d10);
            return;
        }
        m26123c();
        this.f21244m = SystemClock.uptimeMillis();
        this.f21241j = null;
        m26126f(d10);
    }

    /* renamed from: z */
    void m26116z() {
        if (this.f21242k != null || this.f21241j == null) {
            return;
        }
        if (this.f21241j.f21247w) {
            this.f21241j.f21247w = false;
            this.f21245n.removeCallbacks(this.f21241j);
        }
        if (this.f21243l <= 0 || SystemClock.uptimeMillis() >= this.f21244m + this.f21243l) {
            this.f21241j.m26142c(this.f21240i, null);
        } else {
            this.f21241j.f21247w = true;
            this.f21245n.postAtTime(this.f21241j, this.f21244m + this.f21243l);
        }
    }
}
