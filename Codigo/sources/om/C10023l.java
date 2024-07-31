package om;

import android.media.AudioAttributes;
import android.media.SoundPool;
import ck.C2037v;
import dk.C7031r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C9310b0;
import kotlin.jvm.internal.C9322n;
import p258nm.C9731a;
import p258nm.C9743m;
import pm.C10213c;

/* renamed from: om.l */
/* loaded from: classes3.dex */
public final class C10023l {

    /* renamed from: a */
    private final C9743m f24646a;

    /* renamed from: b */
    private final HashMap<AudioAttributes, C10025n> f24647b;

    public C10023l(C9743m ref) {
        C9322n.m27781e(ref, "ref");
        this.f24646a = ref;
        this.f24647b = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m29877c(C10023l this$0, C10025n soundPoolWrapper, SoundPool soundPool, int i10, int i11) {
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(soundPoolWrapper, "$soundPoolWrapper");
        this$0.f24646a.m29201A("Loaded " + i10);
        C10024m c10024m = soundPoolWrapper.m29892b().get(Integer.valueOf(i10));
        C10213c m29888n = c10024m != null ? c10024m.m29888n() : null;
        if (m29888n != null) {
            C9310b0.m27758b(soundPoolWrapper.m29892b()).remove(c10024m.m29887d());
            synchronized (soundPoolWrapper.m29894d()) {
                List<C10024m> list = soundPoolWrapper.m29894d().get(m29888n);
                if (list == null) {
                    list = C7031r.m20582j();
                }
                for (C10024m c10024m2 : list) {
                    c10024m2.m29889o().m29929r("Marking " + c10024m2 + " as loaded");
                    c10024m2.m29889o().m29910H(true);
                    if (c10024m2.m29889o().m29924m()) {
                        c10024m2.m29889o().m29929r("Delayed start of " + c10024m2);
                        c10024m2.start();
                    }
                }
                C2037v c2037v = C2037v.f8089a;
            }
        }
    }

    /* renamed from: b */
    public final void m29878b(int i10, C9731a audioContext) {
        C9322n.m27781e(audioContext, "audioContext");
        AudioAttributes m29166a = audioContext.m29166a();
        if (this.f24647b.containsKey(m29166a)) {
            return;
        }
        SoundPool build = new SoundPool.Builder().setAudioAttributes(m29166a).setMaxStreams(i10).build();
        this.f24646a.m29201A("Create SoundPool with " + m29166a);
        C9322n.m27778b(build);
        final C10025n c10025n = new C10025n(build);
        c10025n.m29893c().setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: om.k
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i11, int i12) {
                C10023l.m29877c(C10023l.this, c10025n, soundPool, i11, i12);
            }
        });
        this.f24647b.put(m29166a, c10025n);
    }

    /* renamed from: d */
    public final void m29879d() {
        Iterator<Map.Entry<AudioAttributes, C10025n>> it = this.f24647b.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().m29891a();
        }
        this.f24647b.clear();
    }

    /* renamed from: e */
    public final C10025n m29880e(C9731a audioContext) {
        C9322n.m27781e(audioContext, "audioContext");
        return this.f24647b.get(audioContext.m29166a());
    }
}
