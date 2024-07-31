package p148i0;

import androidx.camera.core.impl.C0642l0;
import androidx.camera.core.impl.C0703z0;
import androidx.camera.core.impl.InterfaceC0699y;
import androidx.core.util.C0984h;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p002a0.C0009f;
import p148i0.C7762d;

/* renamed from: i0.i */
/* loaded from: classes.dex */
public class C7767i extends C0703z0 {

    /* renamed from: c */
    private final C7762d.a f18521c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7767i(InterfaceC0699y interfaceC0699y, C7762d.a aVar) {
        super(interfaceC0699y);
        this.f18521c = aVar;
    }

    /* renamed from: k */
    private int m23717k(C0642l0 c0642l0) {
        Integer num = (Integer) c0642l0.m3153e().mo3197g(C0642l0.f2876j, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* renamed from: l */
    private int m23718l(C0642l0 c0642l0) {
        Integer num = (Integer) c0642l0.m3153e().mo3197g(C0642l0.f2875i, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    @Override // androidx.camera.core.impl.C0703z0, androidx.camera.core.impl.InterfaceC0699y
    /* renamed from: c */
    public InterfaceFutureC5920f<List<Void>> mo2724c(List<C0642l0> list, int i10, int i11) {
        C0984h.m4824b(list.size() == 1, "Only support one capture config.");
        return C0009f.m17c(Collections.singletonList(this.f18521c.mo23681a(m23717k(list.get(0)), m23718l(list.get(0)))));
    }
}
