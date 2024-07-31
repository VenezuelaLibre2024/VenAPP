package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import com.google.android.exoplayer2.source.rtsp.InterfaceC4727b;
import p351s8.C10818e0;
import p351s8.C10833m;
import p351s8.InterfaceC10823h;
import p363t8.C11137a;
import p363t8.C11172r0;
import p459y6.C12614e;
import p459y6.C12635y;
import p459y6.InterfaceC12623m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.source.rtsp.d */
/* loaded from: classes.dex */
public final class C4731d implements C10818e0.e {

    /* renamed from: a */
    public final int f9353a;

    /* renamed from: b */
    public final C4750r f9354b;

    /* renamed from: c */
    private final a f9355c;

    /* renamed from: d */
    private final InterfaceC12623m f9356d;

    /* renamed from: f */
    private final InterfaceC4727b.a f9358f;

    /* renamed from: g */
    private C4733e f9359g;

    /* renamed from: h */
    private volatile boolean f9360h;

    /* renamed from: j */
    private volatile long f9362j;

    /* renamed from: e */
    private final Handler f9357e = C11172r0.m34954w();

    /* renamed from: i */
    private volatile long f9361i = -9223372036854775807L;

    /* renamed from: com.google.android.exoplayer2.source.rtsp.d$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo12035a(String str, InterfaceC4727b interfaceC4727b);
    }

    public C4731d(int i10, C4750r c4750r, a aVar, InterfaceC12623m interfaceC12623m, InterfaceC4727b.a aVar2) {
        this.f9353a = i10;
        this.f9354b = c4750r;
        this.f9355c = aVar;
        this.f9356d = interfaceC12623m;
        this.f9358f = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m12030d(String str, InterfaceC4727b interfaceC4727b) {
        this.f9355c.mo12035a(str, interfaceC4727b);
    }

    @Override // p351s8.C10818e0.e
    /* renamed from: b */
    public void mo223b() {
        final InterfaceC4727b interfaceC4727b = null;
        try {
            interfaceC4727b = this.f9358f.mo12000a(this.f9353a);
            final String mo11997b = interfaceC4727b.mo11997b();
            this.f9357e.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.c
                @Override // java.lang.Runnable
                public final void run() {
                    C4731d.this.m12030d(mo11997b, interfaceC4727b);
                }
            });
            C12614e c12614e = new C12614e((InterfaceC10823h) C11137a.m34603e(interfaceC4727b), 0L, -1L);
            C4733e c4733e = new C4733e(this.f9354b.f9474a, this.f9353a);
            this.f9359g = c4733e;
            c4733e.mo122b(this.f9356d);
            while (!this.f9360h) {
                if (this.f9361i != -9223372036854775807L) {
                    this.f9359g.mo121a(this.f9362j, this.f9361i);
                    this.f9361i = -9223372036854775807L;
                }
                if (this.f9359g.mo124f(c12614e, new C12635y()) == -1) {
                    break;
                }
            }
        } finally {
            C10833m.m33019a(interfaceC4727b);
        }
    }

    @Override // p351s8.C10818e0.e
    /* renamed from: c */
    public void mo224c() {
        this.f9360h = true;
    }

    /* renamed from: e */
    public void m12031e() {
        ((C4733e) C11137a.m34603e(this.f9359g)).m12041g();
    }

    /* renamed from: f */
    public void m12032f(long j10, long j11) {
        this.f9361i = j10;
        this.f9362j = j11;
    }

    /* renamed from: g */
    public void m12033g(int i10) {
        if (((C4733e) C11137a.m34603e(this.f9359g)).m12040d()) {
            return;
        }
        this.f9359g.m12042h(i10);
    }

    /* renamed from: h */
    public void m12034h(long j10) {
        if (j10 == -9223372036854775807L || ((C4733e) C11137a.m34603e(this.f9359g)).m12040d()) {
            return;
        }
        this.f9359g.m12043i(j10);
    }
}
