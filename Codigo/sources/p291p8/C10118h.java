package p291p8;

import android.text.TextUtils;
import java.util.ArrayList;
import p120g8.AbstractC7490h;
import p120g8.C7493k;
import p120g8.InterfaceC7491i;
import p361t6.C11005b3;
import p363t8.C11146e0;

/* renamed from: p8.h */
/* loaded from: classes.dex */
public final class C10118h extends AbstractC7490h {

    /* renamed from: o */
    private final C11146e0 f24853o;

    /* renamed from: p */
    private final C10113c f24854p;

    public C10118h() {
        super("WebvttDecoder");
        this.f24853o = new C11146e0();
        this.f24854p = new C10113c();
    }

    /* renamed from: B */
    private static int m30234B(C11146e0 c11146e0) {
        int i10 = -1;
        int i11 = 0;
        while (i10 == -1) {
            i11 = c11146e0.m34683f();
            String m34694s = c11146e0.m34694s();
            i10 = m34694s == null ? 0 : "STYLE".equals(m34694s) ? 2 : m34694s.startsWith("NOTE") ? 1 : 3;
        }
        c11146e0.m34677U(i11);
        return i10;
    }

    /* renamed from: C */
    private static void m30235C(C11146e0 c11146e0) {
        do {
        } while (!TextUtils.isEmpty(c11146e0.m34694s()));
    }

    @Override // p120g8.AbstractC7490h
    /* renamed from: z */
    protected InterfaceC7491i mo22811z(byte[] bArr, int i10, boolean z10) {
        C10115e m30209n;
        this.f24853o.m34675S(bArr, i10);
        ArrayList arrayList = new ArrayList();
        try {
            C10119i.m30240e(this.f24853o);
            do {
            } while (!TextUtils.isEmpty(this.f24853o.m34694s()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int m30234B = m30234B(this.f24853o);
                if (m30234B == 0) {
                    return new C10121k(arrayList2);
                }
                if (m30234B == 1) {
                    m30235C(this.f24853o);
                } else if (m30234B == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new C7493k("A style block was found after the first cue.");
                    }
                    this.f24853o.m34694s();
                    arrayList.addAll(this.f24854p.m30167d(this.f24853o));
                } else if (m30234B == 3 && (m30209n = C10116f.m30209n(this.f24853o, arrayList)) != null) {
                    arrayList2.add(m30209n);
                }
            }
        } catch (C11005b3 e10) {
            throw new C7493k(e10);
        }
    }
}
