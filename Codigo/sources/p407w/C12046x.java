package p407w;

import androidx.camera.core.impl.InterfaceC0638k0;
import androidx.camera.core.impl.InterfaceC0646m0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: w.x */
/* loaded from: classes.dex */
public final class C12046x {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w.x$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC0638k0 {

        /* renamed from: a */
        final List<InterfaceC0646m0> f32038a;

        a(List<InterfaceC0646m0> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f32038a = Collections.unmodifiableList(new ArrayList(list));
        }

        @Override // androidx.camera.core.impl.InterfaceC0638k0
        /* renamed from: a */
        public List<InterfaceC0646m0> mo3134a() {
            return this.f32038a;
        }
    }

    /* renamed from: a */
    static InterfaceC0638k0 m38696a(InterfaceC0646m0... interfaceC0646m0Arr) {
        return new a(Arrays.asList(interfaceC0646m0Arr));
    }

    /* renamed from: b */
    public static InterfaceC0638k0 m38697b() {
        return m38696a(new InterfaceC0646m0.a());
    }
}
