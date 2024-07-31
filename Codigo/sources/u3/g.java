package u3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.k;
import h3.l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final g3.a f27044a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f27045b;

    /* renamed from: c, reason: collision with root package name */
    private final List<b> f27046c;

    /* renamed from: d, reason: collision with root package name */
    final k f27047d;

    /* renamed from: e, reason: collision with root package name */
    private final k3.d f27048e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f27049f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f27050g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f27051h;

    /* renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.j<Bitmap> f27052i;

    /* renamed from: j, reason: collision with root package name */
    private a f27053j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f27054k;

    /* renamed from: l, reason: collision with root package name */
    private a f27055l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f27056m;

    /* renamed from: n, reason: collision with root package name */
    private l<Bitmap> f27057n;

    /* renamed from: o, reason: collision with root package name */
    private a f27058o;

    /* renamed from: p, reason: collision with root package name */
    private int f27059p;

    /* renamed from: q, reason: collision with root package name */
    private int f27060q;

    /* renamed from: r, reason: collision with root package name */
    private int f27061r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends z3.a<Bitmap> {

        /* renamed from: d, reason: collision with root package name */
        private final Handler f27062d;

        /* renamed from: e, reason: collision with root package name */
        final int f27063e;

        /* renamed from: f, reason: collision with root package name */
        private final long f27064f;

        /* renamed from: r, reason: collision with root package name */
        private Bitmap f27065r;

        a(Handler handler, int i10, long j10) {
            this.f27062d = handler;
            this.f27063e = i10;
            this.f27064f = j10;
        }

        Bitmap c() {
            return this.f27065r;
        }

        @Override // z3.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(Bitmap bitmap, a4.b<? super Bitmap> bVar) {
            this.f27065r = bitmap;
            this.f27062d.sendMessageAtTime(this.f27062d.obtainMessage(1, this), this.f27064f);
        }

        @Override // z3.d
        public void g(Drawable drawable) {
            this.f27065r = null;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes.dex */
    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                g.this.m((a) message.obj);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            g.this.f27047d.m((a) message.obj);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(com.bumptech.glide.b bVar, g3.a aVar, int i10, int i11, l<Bitmap> lVar, Bitmap bitmap) {
        this(bVar.g(), com.bumptech.glide.b.u(bVar.i()), aVar, null, i(com.bumptech.glide.b.u(bVar.i()), i10, i11), lVar, bitmap);
    }

    g(k3.d dVar, k kVar, g3.a aVar, Handler handler, com.bumptech.glide.j<Bitmap> jVar, l<Bitmap> lVar, Bitmap bitmap) {
        this.f27046c = new ArrayList();
        this.f27047d = kVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f27048e = dVar;
        this.f27045b = handler;
        this.f27052i = jVar;
        this.f27044a = aVar;
        o(lVar, bitmap);
    }

    private static h3.f g() {
        return new b4.d(Double.valueOf(Math.random()));
    }

    private static com.bumptech.glide.j<Bitmap> i(k kVar, int i10, int i11) {
        return kVar.k().a(y3.i.g0(j3.j.f19621b).e0(true).X(true).N(i10, i11));
    }

    private void l() {
        if (!this.f27049f || this.f27050g) {
            return;
        }
        if (this.f27051h) {
            c4.k.a(this.f27058o == null, "Pending target must be null when starting from the first frame");
            this.f27044a.f();
            this.f27051h = false;
        }
        a aVar = this.f27058o;
        if (aVar != null) {
            this.f27058o = null;
            m(aVar);
            return;
        }
        this.f27050g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.f27044a.e();
        this.f27044a.b();
        this.f27055l = new a(this.f27045b, this.f27044a.g(), uptimeMillis);
        this.f27052i.a(y3.i.h0(g())).t0(this.f27044a).o0(this.f27055l);
    }

    private void n() {
        Bitmap bitmap = this.f27056m;
        if (bitmap != null) {
            this.f27048e.c(bitmap);
            this.f27056m = null;
        }
    }

    private void p() {
        if (this.f27049f) {
            return;
        }
        this.f27049f = true;
        this.f27054k = false;
        l();
    }

    private void q() {
        this.f27049f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f27046c.clear();
        n();
        q();
        a aVar = this.f27053j;
        if (aVar != null) {
            this.f27047d.m(aVar);
            this.f27053j = null;
        }
        a aVar2 = this.f27055l;
        if (aVar2 != null) {
            this.f27047d.m(aVar2);
            this.f27055l = null;
        }
        a aVar3 = this.f27058o;
        if (aVar3 != null) {
            this.f27047d.m(aVar3);
            this.f27058o = null;
        }
        this.f27044a.clear();
        this.f27054k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteBuffer b() {
        return this.f27044a.getData().asReadOnlyBuffer();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap c() {
        a aVar = this.f27053j;
        return aVar != null ? aVar.c() : this.f27056m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        a aVar = this.f27053j;
        if (aVar != null) {
            return aVar.f27063e;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap e() {
        return this.f27056m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f27044a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return this.f27061r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f27044a.h() + this.f27059p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f27060q;
    }

    void m(a aVar) {
        this.f27050g = false;
        if (this.f27054k) {
            this.f27045b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f27049f) {
            if (this.f27051h) {
                this.f27045b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f27058o = aVar;
                return;
            }
        }
        if (aVar.c() != null) {
            n();
            a aVar2 = this.f27053j;
            this.f27053j = aVar;
            for (int size = this.f27046c.size() - 1; size >= 0; size--) {
                this.f27046c.get(size).a();
            }
            if (aVar2 != null) {
                this.f27045b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(l<Bitmap> lVar, Bitmap bitmap) {
        this.f27057n = (l) c4.k.d(lVar);
        this.f27056m = (Bitmap) c4.k.d(bitmap);
        this.f27052i = this.f27052i.a(new y3.i().Z(lVar));
        this.f27059p = c4.l.h(bitmap);
        this.f27060q = bitmap.getWidth();
        this.f27061r = bitmap.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(b bVar) {
        if (this.f27054k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f27046c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = this.f27046c.isEmpty();
        this.f27046c.add(bVar);
        if (isEmpty) {
            p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(b bVar) {
        this.f27046c.remove(bVar);
        if (this.f27046c.isEmpty()) {
            q();
        }
    }
}
