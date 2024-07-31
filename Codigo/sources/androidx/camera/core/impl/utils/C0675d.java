package androidx.camera.core.impl.utils;

import android.util.Size;
import java.util.Comparator;

/* renamed from: androidx.camera.core.impl.utils.d */
/* loaded from: classes.dex */
public final class C0675d implements Comparator<Size> {

    /* renamed from: a */
    private boolean f2947a;

    public C0675d() {
        this(false);
    }

    public C0675d(boolean z10) {
        this.f2947a = z10;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Size size, Size size2) {
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.f2947a ? signum * (-1) : signum;
    }
}
