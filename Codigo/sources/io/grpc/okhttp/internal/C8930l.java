package io.grpc.okhttp.internal;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: io.grpc.okhttp.internal.l */
/* loaded from: classes3.dex */
public final class C8930l {

    /* renamed from: a */
    public static final String[] f21219a = new String[0];

    /* renamed from: b */
    public static final Charset f21220b = Charset.forName("UTF-8");

    /* renamed from: a */
    public static <T> List<T> m26103a(T[] tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: b */
    private static <T> List<T> m26104b(T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            int length = tArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    T t11 = tArr2[i10];
                    if (t10.equals(t11)) {
                        arrayList.add(t11);
                        break;
                    }
                    i10++;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static <T> T[] m26105c(Class<T> cls, T[] tArr, T[] tArr2) {
        List m26104b = m26104b(tArr, tArr2);
        return (T[]) m26104b.toArray((Object[]) Array.newInstance((Class<?>) cls, m26104b.size()));
    }
}
