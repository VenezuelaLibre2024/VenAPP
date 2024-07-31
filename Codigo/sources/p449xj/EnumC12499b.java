package p449xj;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p186jj.InterfaceC9077e;

/* renamed from: xj.b */
/* loaded from: classes3.dex */
public enum EnumC12499b implements Callable<List<Object>>, InterfaceC9077e<Object, List<Object>> {
    INSTANCE;

    /* renamed from: h */
    public static <T> Callable<List<T>> m40923h() {
        return INSTANCE;
    }

    @Override // p186jj.InterfaceC9077e
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
