package om;

import android.media.SoundPool;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C9322n;
import pm.C10213c;

/* renamed from: om.n */
/* loaded from: classes3.dex */
public final class C10025n {

    /* renamed from: a */
    private final SoundPool f24655a;

    /* renamed from: b */
    private final Map<Integer, C10024m> f24656b;

    /* renamed from: c */
    private final Map<C10213c, List<C10024m>> f24657c;

    public C10025n(SoundPool soundPool) {
        C9322n.m27781e(soundPool, "soundPool");
        this.f24655a = soundPool;
        Map<Integer, C10024m> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        C9322n.m27780d(synchronizedMap, "synchronizedMap(...)");
        this.f24656b = synchronizedMap;
        Map<C10213c, List<C10024m>> synchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap());
        C9322n.m27780d(synchronizedMap2, "synchronizedMap(...)");
        this.f24657c = synchronizedMap2;
    }

    /* renamed from: a */
    public final void m29891a() {
        this.f24655a.release();
        this.f24656b.clear();
        this.f24657c.clear();
    }

    /* renamed from: b */
    public final Map<Integer, C10024m> m29892b() {
        return this.f24656b;
    }

    /* renamed from: c */
    public final SoundPool m29893c() {
        return this.f24655a;
    }

    /* renamed from: d */
    public final Map<C10213c, List<C10024m>> m29894d() {
        return this.f24657c;
    }
}
