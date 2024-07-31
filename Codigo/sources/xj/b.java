package xj;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public enum b implements Callable<List<Object>>, jj.e<Object, List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> h() {
        return INSTANCE;
    }

    @Override // jj.e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<Object> apply(Object obj) {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public List<Object> call() {
        return new ArrayList();
    }
}
