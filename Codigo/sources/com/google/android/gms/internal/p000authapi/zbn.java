package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.s;
import ea.e;
import s9.a;

/* loaded from: classes2.dex */
public final class zbn {
    public static PendingIntent zba(Context context, a.C0422a c0422a, HintRequest hintRequest, String str) {
        s.k(context, "context must not be null");
        s.k(hintRequest, "request must not be null");
        Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").setPackage("com.google.android.gms").putExtra("claimedCallingPackage", (String) null).putExtra("logSessionId", TextUtils.isEmpty(str) ? zbbj.zba() : (String) s.j(str));
        e.e(hintRequest, putExtra, "com.google.android.gms.credentials.HintRequest");
        return PendingIntent.getActivity(context, AdError.SERVER_ERROR_CODE, putExtra, zbbk.zba | 134217728);
    }
}
