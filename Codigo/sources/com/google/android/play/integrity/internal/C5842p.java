package com.google.android.play.integrity.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.play.integrity.internal.p */
/* loaded from: classes2.dex */
public final class C5842p {
    /* renamed from: a */
    public static final List m14695a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC5844r abstractC5844r = (AbstractC5844r) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", abstractC5844r.mo14697a());
            bundle.putLong("event_timestamp", abstractC5844r.mo14698b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final void m14696b(int i10, List list) {
        list.add(AbstractC5844r.m14699c(i10, System.currentTimeMillis()));
    }
}
