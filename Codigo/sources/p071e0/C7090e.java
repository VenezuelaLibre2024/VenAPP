package p071e0;

import android.media.MediaCodec;
import androidx.camera.core.C0714s;
import androidx.camera.core.impl.AbstractC0661r0;
import androidx.camera.core.impl.C0701y1;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p051d0.C6807b;
import p051d0.C6814i;

/* renamed from: e0.e */
/* loaded from: classes.dex */
public class C7090e {

    /* renamed from: a */
    private final boolean f15707a;

    public C7090e() {
        this.f15707a = C6807b.m19692a(C6814i.class) != null;
    }

    /* renamed from: b */
    private int m20860b(AbstractC0661r0 abstractC0661r0) {
        if (abstractC0661r0.m3226g() == MediaCodec.class) {
            return 2;
        }
        return abstractC0661r0.m3226g() == C0714s.class ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ int m20861c(C0701y1.e eVar, C0701y1.e eVar2) {
        return m20860b(eVar.mo3076e()) - m20860b(eVar2.mo3076e());
    }

    /* renamed from: d */
    public void m20862d(List<C0701y1.e> list) {
        if (this.f15707a) {
            Collections.sort(list, new Comparator() { // from class: e0.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m20861c;
                    m20861c = C7090e.this.m20861c((C0701y1.e) obj, (C0701y1.e) obj2);
                    return m20861c;
                }
            });
        }
    }
}
