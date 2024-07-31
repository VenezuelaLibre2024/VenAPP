package p351s8;

import java.util.Arrays;
import p351s8.InterfaceC10811b;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: s8.o */
/* loaded from: classes.dex */
public final class C10837o implements InterfaceC10811b {

    /* renamed from: a */
    private final boolean f27437a;

    /* renamed from: b */
    private final int f27438b;

    /* renamed from: c */
    private final byte[] f27439c;

    /* renamed from: d */
    private int f27440d;

    /* renamed from: e */
    private int f27441e;

    /* renamed from: f */
    private int f27442f;

    /* renamed from: g */
    private C10809a[] f27443g;

    public C10837o(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public C10837o(boolean z10, int i10, int i11) {
        C11137a.m34599a(i10 > 0);
        C11137a.m34599a(i11 >= 0);
        this.f27437a = z10;
        this.f27438b = i10;
        this.f27442f = i11;
        this.f27443g = new C10809a[i11 + 100];
        if (i11 <= 0) {
            this.f27439c = null;
            return;
        }
        this.f27439c = new byte[i11 * i10];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f27443g[i12] = new C10809a(this.f27439c, i12 * i10);
        }
    }

    @Override // p351s8.InterfaceC10811b
    /* renamed from: a */
    public synchronized void mo32941a(C10809a c10809a) {
        C10809a[] c10809aArr = this.f27443g;
        int i10 = this.f27442f;
        this.f27442f = i10 + 1;
        c10809aArr[i10] = c10809a;
        this.f27441e--;
        notifyAll();
    }

    @Override // p351s8.InterfaceC10811b
    /* renamed from: b */
    public synchronized C10809a mo32942b() {
        C10809a c10809a;
        this.f27441e++;
        int i10 = this.f27442f;
        if (i10 > 0) {
            C10809a[] c10809aArr = this.f27443g;
            int i11 = i10 - 1;
            this.f27442f = i11;
            c10809a = (C10809a) C11137a.m34603e(c10809aArr[i11]);
            this.f27443g[this.f27442f] = null;
        } else {
            c10809a = new C10809a(new byte[this.f27438b], 0);
            int i12 = this.f27441e;
            C10809a[] c10809aArr2 = this.f27443g;
            if (i12 > c10809aArr2.length) {
                this.f27443g = (C10809a[]) Arrays.copyOf(c10809aArr2, c10809aArr2.length * 2);
            }
        }
        return c10809a;
    }

    @Override // p351s8.InterfaceC10811b
    /* renamed from: c */
    public synchronized void mo32943c() {
        int i10 = 0;
        int max = Math.max(0, C11172r0.m34932l(this.f27440d, this.f27438b) - this.f27441e);
        int i11 = this.f27442f;
        if (max >= i11) {
            return;
        }
        if (this.f27439c != null) {
            int i12 = i11 - 1;
            while (i10 <= i12) {
                C10809a c10809a = (C10809a) C11137a.m34603e(this.f27443g[i10]);
                if (c10809a.f27304a == this.f27439c) {
                    i10++;
                } else {
                    C10809a c10809a2 = (C10809a) C11137a.m34603e(this.f27443g[i12]);
                    if (c10809a2.f27304a != this.f27439c) {
                        i12--;
                    } else {
                        C10809a[] c10809aArr = this.f27443g;
                        c10809aArr[i10] = c10809a2;
                        c10809aArr[i12] = c10809a;
                        i12--;
                        i10++;
                    }
                }
            }
            max = Math.max(max, i10);
            if (max >= this.f27442f) {
                return;
            }
        }
        Arrays.fill(this.f27443g, max, this.f27442f, (Object) null);
        this.f27442f = max;
    }

    @Override // p351s8.InterfaceC10811b
    /* renamed from: d */
    public synchronized void mo32944d(InterfaceC10811b.a aVar) {
        while (aVar != null) {
            C10809a[] c10809aArr = this.f27443g;
            int i10 = this.f27442f;
            this.f27442f = i10 + 1;
            c10809aArr[i10] = aVar.mo32946a();
            this.f27441e--;
            aVar = aVar.next();
        }
        notifyAll();
    }

    @Override // p351s8.InterfaceC10811b
    /* renamed from: e */
    public int mo32945e() {
        return this.f27438b;
    }

    /* renamed from: f */
    public synchronized int m33041f() {
        return this.f27441e * this.f27438b;
    }

    /* renamed from: g */
    public synchronized void m33042g() {
        if (this.f27437a) {
            m33043h(0);
        }
    }

    /* renamed from: h */
    public synchronized void m33043h(int i10) {
        boolean z10 = i10 < this.f27440d;
        this.f27440d = i10;
        if (z10) {
            mo32943c();
        }
    }
}
