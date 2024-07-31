package z7;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f32349a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32350b;

    /* renamed from: c, reason: collision with root package name */
    public final List<j> f32351c;

    /* renamed from: d, reason: collision with root package name */
    public final List<e> f32352d;

    /* renamed from: e, reason: collision with root package name */
    public final List<e> f32353e;

    /* renamed from: f, reason: collision with root package name */
    public final List<e> f32354f;

    public a(int i10, int i11, List<j> list, List<e> list2, List<e> list3, List<e> list4) {
        this.f32349a = i10;
        this.f32350b = i11;
        this.f32351c = Collections.unmodifiableList(list);
        this.f32352d = Collections.unmodifiableList(list2);
        this.f32353e = Collections.unmodifiableList(list3);
        this.f32354f = Collections.unmodifiableList(list4);
    }
}
