package om;

import android.media.SoundPool;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final SoundPool f22722a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, m> f22723b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<pm.c, List<m>> f22724c;

    public n(SoundPool soundPool) {
        kotlin.jvm.internal.n.e(soundPool, "soundPool");
        this.f22722a = soundPool;
        Map<Integer, m> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.n.d(synchronizedMap, "synchronizedMap(...)");
        this.f22723b = synchronizedMap;
        Map<pm.c, List<m>> synchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.n.d(synchronizedMap2, "synchronizedMap(...)");
        this.f22724c = synchronizedMap2;
    }

    public final void a() {
        this.f22722a.release();
        this.f22723b.clear();
        this.f22724c.clear();
    }

    public final Map<Integer, m> b() {
        return this.f22723b;
    }

    public final SoundPool c() {
        return this.f22722a;
    }

    public final Map<pm.c, List<m>> d() {
        return this.f22724c;
    }
}
