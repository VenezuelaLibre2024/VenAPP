package p291p8;

import java.util.ArrayList;
import java.util.Collections;
import p120g8.AbstractC7490h;
import p120g8.C7484b;
import p120g8.C7493k;
import p120g8.InterfaceC7491i;
import p363t8.C11146e0;
import p363t8.C11172r0;

/* renamed from: p8.a */
/* loaded from: classes.dex */
public final class C10111a extends AbstractC7490h {

    /* renamed from: o */
    private final C11146e0 f24803o;

    public C10111a() {
        super("Mp4WebvttDecoder");
        this.f24803o = new C11146e0();
    }

    /* renamed from: B */
    private static C7484b m30153B(C11146e0 c11146e0, int i10) {
        CharSequence charSequence = null;
        C7484b.b bVar = null;
        while (i10 > 0) {
            if (i10 < 8) {
                throw new C7493k("Incomplete vtt cue box header found.");
            }
            int m34692q = c11146e0.m34692q();
            int m34692q2 = c11146e0.m34692q();
            int i11 = m34692q - 8;
            String m34864E = C11172r0.m34864E(c11146e0.m34682e(), c11146e0.m34683f(), i11);
            c11146e0.m34678V(i11);
            i10 = (i10 - 8) - i11;
            if (m34692q2 == 1937011815) {
                bVar = C10116f.m30210o(m34864E);
            } else if (m34692q2 == 1885436268) {
                charSequence = C10116f.m30212q(null, m34864E.trim(), Collections.emptyList());
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return bVar != null ? bVar.m22778o(charSequence).m22764a() : C10116f.m30207l(charSequence);
    }

    @Override // p120g8.AbstractC7490h
    /* renamed from: z */
    protected InterfaceC7491i mo22811z(byte[] bArr, int i10, boolean z10) {
        this.f24803o.m34675S(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f24803o.m34679a() > 0) {
            if (this.f24803o.m34679a() < 8) {
                throw new C7493k("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int m34692q = this.f24803o.m34692q();
            if (this.f24803o.m34692q() == 1987343459) {
                arrayList.add(m30153B(this.f24803o, m34692q - 8));
            } else {
                this.f24803o.m34678V(m34692q - 8);
            }
        }
        return new C10112b(arrayList);
    }
}
