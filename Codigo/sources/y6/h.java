package y6;

import android.net.Uri;
import i7.h0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import t6.u1;
import t8.n0;

/* loaded from: classes.dex */
public final class h implements p {

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f31746o = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: p, reason: collision with root package name */
    private static final a f31747p = new a(new a.InterfaceC0531a() { // from class: y6.f
        @Override // y6.h.a.InterfaceC0531a
        public final Constructor a() {
            Constructor h10;
            h10 = h.h();
            return h10;
        }
    });

    /* renamed from: q, reason: collision with root package name */
    private static final a f31748q = new a(new a.InterfaceC0531a() { // from class: y6.g
        @Override // y6.h.a.InterfaceC0531a
        public final Constructor a() {
            Constructor i10;
            i10 = h.i();
            return i10;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    private boolean f31749b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31750c;

    /* renamed from: d, reason: collision with root package name */
    private int f31751d;

    /* renamed from: e, reason: collision with root package name */
    private int f31752e;

    /* renamed from: f, reason: collision with root package name */
    private int f31753f;

    /* renamed from: g, reason: collision with root package name */
    private int f31754g;

    /* renamed from: h, reason: collision with root package name */
    private int f31755h;

    /* renamed from: i, reason: collision with root package name */
    private int f31756i;

    /* renamed from: j, reason: collision with root package name */
    private int f31757j;

    /* renamed from: l, reason: collision with root package name */
    private int f31759l;

    /* renamed from: k, reason: collision with root package name */
    private int f31758k = 1;

    /* renamed from: n, reason: collision with root package name */
    private int f31761n = 112800;

    /* renamed from: m, reason: collision with root package name */
    private com.google.common.collect.w<u1> f31760m = com.google.common.collect.w.v();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC0531a f31762a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f31763b = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        private Constructor<? extends k> f31764c;

        /* renamed from: y6.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0531a {
            Constructor<? extends k> a();
        }

        public a(InterfaceC0531a interfaceC0531a) {
            this.f31762a = interfaceC0531a;
        }

        private Constructor<? extends k> b() {
            synchronized (this.f31763b) {
                if (this.f31763b.get()) {
                    return this.f31764c;
                }
                try {
                    return this.f31762a.a();
                } catch (ClassNotFoundException unused) {
                    this.f31763b.set(true);
                    return this.f31764c;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }

        public k a(Object... objArr) {
            Constructor<? extends k> b10 = b();
            if (b10 == null) {
                return null;
            }
            try {
                return b10.newInstance(objArr);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating extractor", e10);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    private void g(int i10, List<k> list) {
        k bVar;
        switch (i10) {
            case 0:
                bVar = new i7.b();
                list.add(bVar);
                return;
            case 1:
                bVar = new i7.e();
                list.add(bVar);
                return;
            case 2:
                bVar = new i7.h((this.f31750c ? 2 : 0) | this.f31751d | (this.f31749b ? 1 : 0));
                list.add(bVar);
                return;
            case 3:
                bVar = new z6.b((this.f31750c ? 2 : 0) | this.f31752e | (this.f31749b ? 1 : 0));
                list.add(bVar);
                return;
            case 4:
                bVar = f31747p.a(Integer.valueOf(this.f31753f));
                if (bVar == null) {
                    bVar = new b7.d(this.f31753f);
                }
                list.add(bVar);
                return;
            case 5:
                bVar = new c7.c();
                list.add(bVar);
                return;
            case 6:
                bVar = new e7.e(this.f31754g);
                list.add(bVar);
                return;
            case 7:
                bVar = new f7.f((this.f31750c ? 2 : 0) | this.f31757j | (this.f31749b ? 1 : 0));
                list.add(bVar);
                return;
            case 8:
                list.add(new g7.g(this.f31756i));
                bVar = new g7.k(this.f31755h);
                list.add(bVar);
                return;
            case 9:
                bVar = new h7.d();
                list.add(bVar);
                return;
            case 10:
                bVar = new i7.a0();
                list.add(bVar);
                return;
            case 11:
                bVar = new h0(this.f31758k, new n0(0L), new i7.j(this.f31759l, this.f31760m), this.f31761n);
                list.add(bVar);
                return;
            case 12:
                bVar = new j7.b();
                list.add(bVar);
                return;
            case 13:
            default:
                return;
            case 14:
                bVar = new d7.a();
                list.add(bVar);
                return;
            case 15:
                bVar = f31748q.a(new Object[0]);
                if (bVar == null) {
                    return;
                }
                list.add(bVar);
                return;
            case 16:
                bVar = new a7.b();
                list.add(bVar);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends k> h() {
        if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(k.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends k> i() {
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(k.class).getConstructor(new Class[0]);
    }

    @Override // y6.p
    public synchronized k[] b(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr = f31746o;
        arrayList = new ArrayList(iArr.length);
        int b10 = t8.k.b(map);
        if (b10 != -1) {
            g(b10, arrayList);
        }
        int c10 = t8.k.c(uri);
        if (c10 != -1 && c10 != b10) {
            g(c10, arrayList);
        }
        for (int i10 : iArr) {
            if (i10 != b10 && i10 != c10) {
                g(i10, arrayList);
            }
        }
        return (k[]) arrayList.toArray(new k[arrayList.size()]);
    }

    @Override // y6.p
    public synchronized k[] c() {
        return b(Uri.EMPTY, new HashMap());
    }
}
