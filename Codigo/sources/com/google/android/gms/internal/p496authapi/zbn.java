package com.google.android.gms.internal.p496authapi;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.C5276s;
import p081ea.C7142e;
import p352s9.C10849a;

/* loaded from: classes2.dex */
public final class zbn {
    public static PendingIntent zba(Context context, C10849a.a aVar, HintRequest hintRequest, String str) {
        C5276s.m13325k(context, "context must not be null");
        C5276s.m13325k(hintRequest, "request must not be null");
        Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").setPackage("com.google.android.gms").putExtra("claimedCallingPackage", (String) null).putExtra("logSessionId", TextUtils.isEmpty(str) ? zbbj.zba() : (String) C5276s.m13324j(str));
        C7142e.m21239e(hintRequest, putExtra, "com.google.android.gms.credentials.HintRequest");
        return PendingIntent.getActivity(context, AdError.SERVER_ERROR_CODE, putExtra, zbbk.zba | 134217728);
    }
}
