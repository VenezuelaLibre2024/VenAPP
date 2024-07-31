package p459y6;

import android.net.Uri;
import com.google.common.collect.AbstractC5907w;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p009a7.C0036b;
import p025b7.C1670d;
import p039c7.C1881c;
import p058d7.C6849a;
import p078e7.C7131e;
import p099f7.C7310f;
import p119g7.C7471g;
import p119g7.C7475k;
import p133h7.C7657d;
import p155i7.C7863a0;
import p155i7.C7864b;
import p155i7.C7870e;
import p155i7.C7876h;
import p155i7.C7877h0;
import p155i7.C7880j;
import p175j7.C8993b;
import p361t6.C11108u1;
import p363t8.C11157k;
import p363t8.C11164n0;
import p481z6.C12808b;

/* renamed from: y6.h */
/* loaded from: classes.dex */
public final class C12618h implements InterfaceC12626p {

    /* renamed from: o */
    private static final int[] f34282o = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: p */
    private static final a f34283p = new a(new a.InterfaceC13289a() { // from class: y6.f
        @Override // p459y6.C12618h.a.InterfaceC13289a
        /* renamed from: a */
        public final Constructor mo41555a() {
            Constructor m41559h;
            m41559h = C12618h.m41559h();
            return m41559h;
        }
    });

    /* renamed from: q */
    private static final a f34284q = new a(new a.InterfaceC13289a() { // from class: y6.g
        @Override // p459y6.C12618h.a.InterfaceC13289a
        /* renamed from: a */
        public final Constructor mo41555a() {
            Constructor m41560i;
            m41560i = C12618h.m41560i();
            return m41560i;
        }
    });

    /* renamed from: b */
    private boolean f34285b;

    /* renamed from: c */
    private boolean f34286c;

    /* renamed from: d */
    private int f34287d;

    /* renamed from: e */
    private int f34288e;

    /* renamed from: f */
    private int f34289f;

    /* renamed from: g */
    private int f34290g;

    /* renamed from: h */
    private int f34291h;

    /* renamed from: i */
    private int f34292i;

    /* renamed from: j */
    private int f34293j;

    /* renamed from: l */
    private int f34295l;

    /* renamed from: k */
    private int f34294k = 1;

    /* renamed from: n */
    private int f34297n = 112800;

    /* renamed from: m */
    private AbstractC5907w<C11108u1> f34296m = AbstractC5907w.m15081v();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y6.h$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final InterfaceC13289a f34298a;

        /* renamed from: b */
        private final AtomicBoolean f34299b = new AtomicBoolean(false);

        /* renamed from: c */
        private Constructor<? extends InterfaceC12621k> f34300c;

        /* renamed from: y6.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC13289a {
            /* renamed from: a */
            Constructor<? extends InterfaceC12621k> mo41555a();
        }

        public a(InterfaceC13289a interfaceC13289a) {
            this.f34298a = interfaceC13289a;
        }

        /* renamed from: b */
        private Constructor<? extends InterfaceC12621k> m41562b() {
            synchronized (this.f34299b) {
                if (this.f34299b.get()) {
                    return this.f34300c;
                }
                try {
                    return this.f34298a.mo41555a();
                } catch (ClassNotFoundException unused) {
                    this.f34299b.set(true);
                    return this.f34300c;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }

        /* renamed from: a */
        public InterfaceC12621k m41563a(Object... objArr) {
            Constructor<? extends InterfaceC12621k> m41562b = m41562b();
            if (m41562b == null) {
                return null;
            }
            try {
                return m41562b.newInstance(objArr);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating extractor", e10);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* renamed from: g */
    private void m41558g(int i10, List<InterfaceC12621k> list) {
        InterfaceC12621k c7864b;
        switch (i10) {
            case 0:
                c7864b = new C7864b();
                list.add(c7864b);
                return;
            case 1:
                c7864b = new C7870e();
                list.add(c7864b);
                return;
            case 2:
                c7864b = new C7876h((this.f34286c ? 2 : 0) | this.f34287d | (this.f34285b ? 1 : 0));
                list.add(c7864b);
                return;
            case 3:
                c7864b = new C12808b((this.f34286c ? 2 : 0) | this.f34288e | (this.f34285b ? 1 : 0));
                list.add(c7864b);
                return;
            case 4:
                c7864b = f34283p.m41563a(Integer.valueOf(this.f34289f));
                if (c7864b == null) {
                    c7864b = new C1670d(this.f34289f);
                }
                list.add(c7864b);
                return;
            case 5:
                c7864b = new C1881c();
                list.add(c7864b);
                return;
            case 6:
                c7864b = new C7131e(this.f34290g);
                list.add(c7864b);
                return;
            case 7:
                c7864b = new C7310f((this.f34286c ? 2 : 0) | this.f34293j | (this.f34285b ? 1 : 0));
                list.add(c7864b);
                return;
            case 8:
                list.add(new C7471g(this.f34292i));
                c7864b = new C7475k(this.f34291h);
                list.add(c7864b);
                return;
            case 9:
                c7864b = new C7657d();
                list.add(c7864b);
                return;
            case 10:
                c7864b = new C7863a0();
                list.add(c7864b);
                return;
            case 11:
                c7864b = new C7877h0(this.f34294k, new C11164n0(0L), new C7880j(this.f34295l, this.f34296m), this.f34297n);
                list.add(c7864b);
                return;
            case 12:
                c7864b = new C8993b();
                list.add(c7864b);
                return;
            case 13:
            default:
                return;
            case 14:
                c7864b = new C6849a();
                list.add(c7864b);
                return;
            case 15:
                c7864b = f34284q.m41563a(new Object[0]);
                if (c7864b == null) {
                    return;
                }
                list.add(c7864b);
                return;
            case 16:
                c7864b = new C0036b();
                list.add(c7864b);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static Constructor<? extends InterfaceC12621k> m41559h() {
        if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(InterfaceC12621k.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static Constructor<? extends InterfaceC12621k> m41560i() {
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(InterfaceC12621k.class).getConstructor(new Class[0]);
    }

    @Override // p459y6.InterfaceC12626p
    /* renamed from: b */
    public synchronized InterfaceC12621k[] mo41561b(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr = f34282o;
        arrayList = new ArrayList(iArr.length);
        int m34758b = C11157k.m34758b(map);
        if (m34758b != -1) {
            m41558g(m34758b, arrayList);
        }
        int m34759c = C11157k.m34759c(uri);
        if (m34759c != -1 && m34759c != m34758b) {
            m41558g(m34759c, arrayList);
        }
        for (int i10 : iArr) {
            if (i10 != m34758b && i10 != m34759c) {
                m41558g(i10, arrayList);
            }
        }
        return (InterfaceC12621k[]) arrayList.toArray(new InterfaceC12621k[arrayList.size()]);
    }

    @Override // p459y6.InterfaceC12626p
    /* renamed from: c */
    public synchronized InterfaceC12621k[] mo9153c() {
        return mo41561b(Uri.EMPTY, new HashMap());
    }
}
