package com.google.android.gms.auth;

import android.content.Intent;
import com.google.android.gms.common.annotation.KeepName;
import r9.d;

@KeepName
/* loaded from: classes.dex */
public class UserRecoverableAuthException extends d {

    /* renamed from: a, reason: collision with root package name */
    private final Intent f9168a;

    public UserRecoverableAuthException(String str, Intent intent) {
        super(str);
        this.f9168a = intent;
    }

    public Intent a() {
        Intent intent = this.f9168a;
        if (intent == null) {
            return null;
        }
        return new Intent(intent);
    }
}
