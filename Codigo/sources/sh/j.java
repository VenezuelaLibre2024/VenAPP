package sh;

import android.media.MediaCodec;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class j {
    public static final boolean a(MediaCodec.BufferInfo bufferInfo) {
        n.e(bufferInfo, "<this>");
        return (bufferInfo.flags & 4) != 0;
    }
}
