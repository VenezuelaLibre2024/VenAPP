package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.AbstractServiceConnectionC4618f0;
import com.facebook.login.C4689u;
import kotlin.jvm.internal.C9322n;

/* renamed from: com.facebook.login.o */
/* loaded from: classes.dex */
public final class C4681o extends AbstractServiceConnectionC4618f0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4681o(Context context, C4689u.e request) {
        super(context, 65536, 65537, 20121101, request.m11717a(), request.m11729m());
        C9322n.m27781e(context, "context");
        C9322n.m27781e(request, "request");
    }

    @Override // com.facebook.internal.AbstractServiceConnectionC4618f0
    /* renamed from: e */
    protected void mo11203e(Bundle data) {
        C9322n.m27781e(data, "data");
    }
}
