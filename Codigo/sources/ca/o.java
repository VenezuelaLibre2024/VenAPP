package ca;

import android.content.Intent;

/* loaded from: classes.dex */
public class o extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final Intent f6998a;

    public o(String str, Intent intent) {
        super(str);
        this.f6998a = intent;
    }

    public Intent a() {
        return new Intent(this.f6998a);
    }
}
