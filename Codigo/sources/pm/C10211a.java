package pm;

import android.media.MediaPlayer;
import kotlin.jvm.internal.C9322n;
import om.C10024m;
import p258nm.C9745o;

/* renamed from: pm.a */
/* loaded from: classes3.dex */
public final class C10211a implements InterfaceC10212b {

    /* renamed from: a */
    private final C9745o f25242a;

    public C10211a(C9745o dataSource) {
        C9322n.m27781e(dataSource, "dataSource");
        this.f25242a = dataSource;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10211a(byte[] bytes) {
        this(new C9745o(bytes));
        C9322n.m27781e(bytes, "bytes");
    }

    @Override // pm.InterfaceC10212b
    /* renamed from: a */
    public void mo30554a(MediaPlayer mediaPlayer) {
        C9322n.m27781e(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f25242a);
    }

    @Override // pm.InterfaceC10212b
    /* renamed from: b */
    public void mo30555b(C10024m soundPoolPlayer) {
        C9322n.m27781e(soundPoolPlayer, "soundPoolPlayer");
        throw new IllegalStateException("Bytes sources are not supported on LOW_LATENCY mode yet.".toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10211a) && C9322n.m27777a(this.f25242a, ((C10211a) obj).f25242a);
    }

    public int hashCode() {
        return this.f25242a.hashCode();
    }

    public String toString() {
        return "BytesSource(dataSource=" + this.f25242a + ')';
    }
}
