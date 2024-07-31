package p373u3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C2124j;
import com.bumptech.glide.ComponentCallbacks2C2116b;
import com.bumptech.glide.ComponentCallbacks2C2125k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p006a4.InterfaceC0031b;
import p022b4.C1656d;
import p036c4.C1870k;
import p036c4.C1871l;
import p115g3.InterfaceC7442a;
import p129h3.InterfaceC7622f;
import p129h3.InterfaceC7628l;
import p171j3.AbstractC8963j;
import p193k3.InterfaceC9141d;
import p456y3.C12594i;
import p478z3.AbstractC12795a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: u3.g */
/* loaded from: classes.dex */
public class C11312g {

    /* renamed from: a */
    private final InterfaceC7442a f29346a;

    /* renamed from: b */
    private final Handler f29347b;

    /* renamed from: c */
    private final List<b> f29348c;

    /* renamed from: d */
    final ComponentCallbacks2C2125k f29349d;

    /* renamed from: e */
    private final InterfaceC9141d f29350e;

    /* renamed from: f */
    private boolean f29351f;

    /* renamed from: g */
    private boolean f29352g;

    /* renamed from: h */
    private boolean f29353h;

    /* renamed from: i */
    private C2124j<Bitmap> f29354i;

    /* renamed from: j */
    private a f29355j;

    /* renamed from: k */
    private boolean f29356k;

    /* renamed from: l */
    private a f29357l;

    /* renamed from: m */
    private Bitmap f29358m;

    /* renamed from: n */
    private InterfaceC7628l<Bitmap> f29359n;

    /* renamed from: o */
    private a f29360o;

    /* renamed from: p */
    private int f29361p;

    /* renamed from: q */
    private int f29362q;

    /* renamed from: r */
    private int f29363r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u3.g$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC12795a<Bitmap> {

        /* renamed from: d */
        private final Handler f29364d;

        /* renamed from: e */
        final int f29365e;

        /* renamed from: f */
        private final long f29366f;

        /* renamed from: r */
        private Bitmap f29367r;

        a(Handler handler, int i10, long j10) {
            this.f29364d = handler;
            this.f29365e = i10;
            this.f29366f = j10;
        }

        /* renamed from: c */
        Bitmap m35351c() {
            return this.f29367r;
        }

        @Override // p478z3.InterfaceC12798d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo35350b(Bitmap bitmap, InterfaceC0031b<? super Bitmap> interfaceC0031b) {
            this.f29367r = bitmap;
            this.f29364d.sendMessageAtTime(this.f29364d.obtainMessage(1, this), this.f29366f);
        }

        @Override // p478z3.InterfaceC12798d
        /* renamed from: g */
        public void mo35353g(Drawable drawable) {
            this.f29367r = null;
        }
    }

    /* renamed from: u3.g$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo35322a();
    }

    /* renamed from: u3.g$c */
    /* loaded from: classes.dex */
    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                C11312g.this.m35346m((a) message.obj);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            C11312g.this.f29349d.m10724m((a) message.obj);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11312g(ComponentCallbacks2C2116b componentCallbacks2C2116b, InterfaceC7442a interfaceC7442a, int i10, int i11, InterfaceC7628l<Bitmap> interfaceC7628l, Bitmap bitmap) {
        this(componentCallbacks2C2116b.m10651g(), ComponentCallbacks2C2116b.m10647u(componentCallbacks2C2116b.m10653i()), interfaceC7442a, null, m35332i(ComponentCallbacks2C2116b.m10647u(componentCallbacks2C2116b.m10653i()), i10, i11), interfaceC7628l, bitmap);
    }

    C11312g(InterfaceC9141d interfaceC9141d, ComponentCallbacks2C2125k componentCallbacks2C2125k, InterfaceC7442a interfaceC7442a, Handler handler, C2124j<Bitmap> c2124j, InterfaceC7628l<Bitmap> interfaceC7628l, Bitmap bitmap) {
        this.f29348c = new ArrayList();
        this.f29349d = componentCallbacks2C2125k;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f29350e = interfaceC9141d;
        this.f29347b = handler;
        this.f29354i = c2124j;
        this.f29346a = interfaceC7442a;
        m35347o(interfaceC7628l, bitmap);
    }

    /* renamed from: g */
    private static InterfaceC7622f m35331g() {
        return new C1656d(Double.valueOf(Math.random()));
    }

    /* renamed from: i */
    private static C2124j<Bitmap> m35332i(ComponentCallbacks2C2125k componentCallbacks2C2125k, int i10, int i11) {
        return componentCallbacks2C2125k.m10722k().mo10708a(C12594i.m41403g0(AbstractC8963j.f21389b).m41359e0(true).m41351X(true).m41343N(i10, i11));
    }

    /* renamed from: l */
    private void m35333l() {
        if (!this.f29351f || this.f29352g) {
            return;
        }
        if (this.f29353h) {
            C1870k.m9947a(this.f29360o == null, "Pending target must be null when starting from the first frame");
            this.f29346a.mo22451f();
            this.f29353h = false;
        }
        a aVar = this.f29360o;
        if (aVar != null) {
            this.f29360o = null;
            m35346m(aVar);
            return;
        }
        this.f29352g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.f29346a.mo22450e();
        this.f29346a.mo22447b();
        this.f29357l = new a(this.f29347b, this.f29346a.mo22452g(), uptimeMillis);
        this.f29354i.mo10708a(C12594i.m41404h0(m35331g())).m10716t0(this.f29346a).m10713o0(this.f29357l);
    }

    /* renamed from: n */
    private void m35334n() {
        Bitmap bitmap = this.f29358m;
        if (bitmap != null) {
            this.f29350e.mo26950c(bitmap);
            this.f29358m = null;
        }
    }

    /* renamed from: p */
    private void m35335p() {
        if (this.f29351f) {
            return;
        }
        this.f29351f = true;
        this.f29356k = false;
        m35333l();
    }

    /* renamed from: q */
    private void m35336q() {
        this.f29351f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m35337a() {
        this.f29348c.clear();
        m35334n();
        m35336q();
        a aVar = this.f29355j;
        if (aVar != null) {
            this.f29349d.m10724m(aVar);
            this.f29355j = null;
        }
        a aVar2 = this.f29357l;
        if (aVar2 != null) {
            this.f29349d.m10724m(aVar2);
            this.f29357l = null;
        }
        a aVar3 = this.f29360o;
        if (aVar3 != null) {
            this.f29349d.m10724m(aVar3);
            this.f29360o = null;
        }
        this.f29346a.clear();
        this.f29356k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ByteBuffer m35338b() {
        return this.f29346a.getData().asReadOnlyBuffer();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Bitmap m35339c() {
        a aVar = this.f29355j;
        return aVar != null ? aVar.m35351c() : this.f29358m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m35340d() {
        a aVar = this.f29355j;
        if (aVar != null) {
            return aVar.f29365e;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Bitmap m35341e() {
        return this.f29358m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m35342f() {
        return this.f29346a.mo22448c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m35343h() {
        return this.f29363r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m35344j() {
        return this.f29346a.mo22453h() + this.f29361p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m35345k() {
        return this.f29362q;
    }

    /* renamed from: m */
    void m35346m(a aVar) {
        this.f29352g = false;
        if (this.f29356k) {
            this.f29347b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f29351f) {
            if (this.f29353h) {
                this.f29347b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f29360o = aVar;
                return;
            }
        }
        if (aVar.m35351c() != null) {
            m35334n();
            a aVar2 = this.f29355j;
            this.f29355j = aVar;
            for (int size = this.f29348c.size() - 1; size >= 0; size--) {
                this.f29348c.get(size).mo35322a();
            }
            if (aVar2 != null) {
                this.f29347b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        m35333l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m35347o(InterfaceC7628l<Bitmap> interfaceC7628l, Bitmap bitmap) {
        this.f29359n = (InterfaceC7628l) C1870k.m9950d(interfaceC7628l);
        this.f29358m = (Bitmap) C1870k.m9950d(bitmap);
        this.f29354i = this.f29354i.mo10708a(new C12594i().m41353Z(interfaceC7628l));
        this.f29361p = C1871l.m9959h(bitmap);
        this.f29362q = bitmap.getWidth();
        this.f29363r = bitmap.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m35348r(b bVar) {
        if (this.f29356k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f29348c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = this.f29348c.isEmpty();
        this.f29348c.add(bVar);
        if (isEmpty) {
            m35335p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m35349s(b bVar) {
        this.f29348c.remove(bVar);
        if (this.f29348c.isEmpty()) {
            m35336q();
        }
    }
}
