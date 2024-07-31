package w;

import androidx.camera.core.impl.m0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class x {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements androidx.camera.core.impl.k0 {

        /* renamed from: a, reason: collision with root package name */
        final List<androidx.camera.core.impl.m0> f29575a;

        a(List<androidx.camera.core.impl.m0> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f29575a = Collections.unmodifiableList(new ArrayList(list));
        }

        @Override // androidx.camera.core.impl.k0
        public List<androidx.camera.core.impl.m0> a() {
            return this.f29575a;
        }
    }

    static androidx.camera.core.impl.k0 a(androidx.camera.core.impl.m0... m0VarArr) {
        return new a(Arrays.asList(m0VarArr));
    }

    public static androidx.camera.core.impl.k0 b() {
        return a(new m0.a());
    }
}
