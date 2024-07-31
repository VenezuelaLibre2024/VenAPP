package p313qf;

import com.google.android.gms.common.internal.C5276s;

/* renamed from: qf.a */
/* loaded from: classes2.dex */
public class C10475a extends Exception {

    /* renamed from: a */
    private final int f26021a;

    public C10475a(String str, int i10) {
        super(C5276s.m13321g(str, "Provided message must not be empty."));
        this.f26021a = i10;
    }

    public C10475a(String str, int i10, Throwable th2) {
        super(C5276s.m13321g(str, "Provided message must not be empty."), th2);
        this.f26021a = i10;
    }

    /* renamed from: a */
    public int m31418a() {
        return this.f26021a;
    }
}
