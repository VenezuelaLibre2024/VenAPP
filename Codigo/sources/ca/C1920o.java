package ca;

import android.content.Intent;

/* renamed from: ca.o */
/* loaded from: classes.dex */
public class C1920o extends Exception {

    /* renamed from: a */
    private final Intent f7950a;

    public C1920o(String str, Intent intent) {
        super(str);
        this.f7950a = intent;
    }

    /* renamed from: a */
    public Intent m10122a() {
        return new Intent(this.f7950a);
    }
}
