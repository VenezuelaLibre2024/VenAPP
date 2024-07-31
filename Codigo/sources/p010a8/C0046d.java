package p010a8;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p099f7.C7310f;
import p119g7.C7471g;
import p137hb.C7690e;
import p155i7.C7864b;
import p155i7.C7870e;
import p155i7.C7876h;
import p155i7.C7877h0;
import p155i7.C7880j;
import p216l7.C9400a;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11157k;
import p363t8.C11164n0;
import p363t8.C11178w;
import p376u6.C11391m3;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;

/* renamed from: a8.d */
/* loaded from: classes.dex */
public final class C0046d implements InterfaceC0050h {

    /* renamed from: d */
    private static final int[] f123d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b */
    private final int f124b;

    /* renamed from: c */
    private final boolean f125c;

    public C0046d() {
        this(0, true);
    }

    public C0046d(int i10, boolean z10) {
        this.f124b = i10;
        this.f125c = z10;
    }

    /* renamed from: b */
    private static void m170b(int i10, List<Integer> list) {
        if (C7690e.m23417h(f123d, i10) == -1 || list.contains(Integer.valueOf(i10))) {
            return;
        }
        list.add(Integer.valueOf(i10));
    }

    /* renamed from: d */
    private InterfaceC12621k m171d(int i10, C11108u1 c11108u1, List<C11108u1> list, C11164n0 c11164n0) {
        if (i10 == 0) {
            return new C7864b();
        }
        if (i10 == 1) {
            return new C7870e();
        }
        if (i10 == 2) {
            return new C7876h();
        }
        if (i10 == 7) {
            return new C7310f(0, 0L);
        }
        if (i10 == 8) {
            return m172e(c11164n0, c11108u1, list);
        }
        if (i10 == 11) {
            return m173f(this.f124b, this.f125c, c11108u1, list, c11164n0);
        }
        if (i10 != 13) {
            return null;
        }
        return new C0062t(c11108u1.f28788c, c11164n0);
    }

    /* renamed from: e */
    private static C7471g m172e(C11164n0 c11164n0, C11108u1 c11108u1, List<C11108u1> list) {
        int i10 = m174g(c11108u1) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new C7471g(i10, c11164n0, null, list);
    }

    /* renamed from: f */
    private static C7877h0 m173f(int i10, boolean z10, C11108u1 c11108u1, List<C11108u1> list, C11164n0 c11164n0) {
        int i11 = i10 | 16;
        if (list != null) {
            i11 |= 32;
        } else {
            list = z10 ? Collections.singletonList(new C11108u1.b().m34552g0("application/cea-608").m34526G()) : Collections.emptyList();
        }
        String str = c11108u1.f28794t;
        if (!TextUtils.isEmpty(str)) {
            if (!C11178w.m34994b(str, "audio/mp4a-latm")) {
                i11 |= 2;
            }
            if (!C11178w.m34994b(str, "video/avc")) {
                i11 |= 4;
            }
        }
        return new C7877h0(2, c11164n0, new C7880j(i11, list));
    }

    /* renamed from: g */
    private static boolean m174g(C11108u1 c11108u1) {
        C9400a c9400a = c11108u1.f28795u;
        if (c9400a == null) {
            return false;
        }
        for (int i10 = 0; i10 < c9400a.m27999e(); i10++) {
            if (c9400a.m27998d(i10) instanceof C0059q) {
                return !((C0059q) r2).f284c.isEmpty();
            }
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m175h(InterfaceC12621k interfaceC12621k, InterfaceC12622l interfaceC12622l) {
        try {
            boolean mo123e = interfaceC12621k.mo123e(interfaceC12622l);
            interfaceC12622l.mo41534f();
            return mo123e;
        } catch (EOFException unused) {
            interfaceC12622l.mo41534f();
            return false;
        } catch (Throwable th2) {
            interfaceC12622l.mo41534f();
            throw th2;
        }
    }

    @Override // p010a8.InterfaceC0050h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0044b mo176a(Uri uri, C11108u1 c11108u1, List<C11108u1> list, C11164n0 c11164n0, Map<String, List<String>> map, InterfaceC12622l interfaceC12622l, C11391m3 c11391m3) {
        int m34757a = C11157k.m34757a(c11108u1.f28797w);
        int m34758b = C11157k.m34758b(map);
        int m34759c = C11157k.m34759c(uri);
        int[] iArr = f123d;
        ArrayList arrayList = new ArrayList(iArr.length);
        m170b(m34757a, arrayList);
        m170b(m34758b, arrayList);
        m170b(m34759c, arrayList);
        for (int i10 : iArr) {
            m170b(i10, arrayList);
        }
        interfaceC12622l.mo41534f();
        InterfaceC12621k interfaceC12621k = null;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int intValue = ((Integer) arrayList.get(i11)).intValue();
            InterfaceC12621k interfaceC12621k2 = (InterfaceC12621k) C11137a.m34603e(m171d(intValue, c11108u1, list, c11164n0));
            if (m175h(interfaceC12621k2, interfaceC12622l)) {
                return new C0044b(interfaceC12621k2, c11108u1, c11164n0);
            }
            if (interfaceC12621k == null && (intValue == m34757a || intValue == m34758b || intValue == m34759c || intValue == 11)) {
                interfaceC12621k = interfaceC12621k2;
            }
        }
        return new C0044b((InterfaceC12621k) C11137a.m34603e(interfaceC12621k), c11108u1, c11164n0);
    }
}
