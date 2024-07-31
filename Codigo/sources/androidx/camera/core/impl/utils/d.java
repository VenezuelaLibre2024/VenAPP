package androidx.camera.core.impl.utils;

import android.util.Size;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class d implements Comparator<Size> {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2603a;

    public d() {
        this(false);
    }

    public d(boolean z10) {
        this.f2603a = z10;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Size size, Size size2) {
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.f2603a ? signum * (-1) : signum;
    }
}
