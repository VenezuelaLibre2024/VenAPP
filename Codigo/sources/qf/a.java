package qf;

import com.google.android.gms.common.internal.s;

/* loaded from: classes2.dex */
public class a extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final int f23979a;

    public a(String str, int i10) {
        super(s.g(str, "Provided message must not be empty."));
        this.f23979a = i10;
    }

    public a(String str, int i10, Throwable th2) {
        super(s.g(str, "Provided message must not be empty."), th2);
        this.f23979a = i10;
    }

    public int a() {
        return this.f23979a;
    }
}
