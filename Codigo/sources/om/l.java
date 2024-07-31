package om;

import android.media.AudioAttributes;
import android.media.SoundPool;
import ck.v;
import dk.r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.b0;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a */
    private final nm.m f22713a;

    /* renamed from: b */
    private final HashMap<AudioAttributes, n> f22714b;

    public l(nm.m ref) {
        kotlin.jvm.internal.n.e(ref, "ref");
        this.f22713a = ref;
        this.f22714b = new HashMap<>();
    }

    public static final void c(l this$0, n soundPoolWrapper, SoundPool soundPool, int i10, int i11) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(soundPoolWrapper, "$soundPoolWrapper");
        this$0.f22713a.A("Loaded " + i10);
        m mVar = soundPoolWrapper.b().get(Integer.valueOf(i10));
        pm.c n10 = mVar != null ? mVar.n() : null;
        if (n10 != null) {
            b0.b(soundPoolWrapper.b()).remove(mVar.d());
            synchronized (soundPoolWrapper.d()) {
                List<m> list = soundPoolWrapper.d().get(n10);
                if (list == null) {
                    list = r.j();
                }
                for (m mVar2 : list) {
                    mVar2.o().r("Marking " + mVar2 + " as loaded");
                    mVar2.o().H(true);
                    if (mVar2.o().m()) {
                        mVar2.o().r("Delayed start of " + mVar2);
                        mVar2.start();
                    }
                }
                v vVar = v.f7137a;
            }
        }
    }

    public final void b(int i10, nm.a audioContext) {
        kotlin.jvm.internal.n.e(audioContext, "audioContext");
        AudioAttributes a10 = audioContext.a();
        if (this.f22714b.containsKey(a10)) {
            return;
        }
        SoundPool build = new SoundPool.Builder().setAudioAttributes(a10).setMaxStreams(i10).build();
        this.f22713a.A("Create SoundPool with " + a10);
        kotlin.jvm.internal.n.b(build);
        n nVar = new n(build);
        nVar.c().setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: om.k

            /* renamed from: b */
            public final /* synthetic */ n f22712b;

            public /* synthetic */ k(n nVar2) {
                r2 = nVar2;
            }

            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i11, int i12) {
                l.c(l.this, r2, soundPool, i11, i12);
            }
        });
        this.f22714b.put(a10, nVar2);
    }

    public final void d() {
        Iterator<Map.Entry<AudioAttributes, n>> it = this.f22714b.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().a();
        }
        this.f22714b.clear();
    }

    public final n e(nm.a audioContext) {
        kotlin.jvm.internal.n.e(audioContext, "audioContext");
        return this.f22714b.get(audioContext.a());
    }
}
