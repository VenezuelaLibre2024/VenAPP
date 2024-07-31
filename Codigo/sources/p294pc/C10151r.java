package p294pc;

import java.util.Arrays;
import java.util.List;

/* renamed from: pc.r */
/* loaded from: classes.dex */
public class C10151r extends C10152s {

    /* renamed from: a */
    private final List<C10132c<?>> f24955a;

    public C10151r(List<C10132c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f24955a = list;
    }
}
