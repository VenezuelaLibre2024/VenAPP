package r9;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

/* loaded from: classes.dex */
public class f extends UserRecoverableAuthException {

    /* renamed from: b, reason: collision with root package name */
    private final int f24811b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(int i10, String str, Intent intent) {
        super(str, intent);
        this.f24811b = i10;
    }
}
