package sh;

import android.media.MediaCodec;
import kotlin.jvm.internal.C9322n;

/* renamed from: sh.j */
/* loaded from: classes3.dex */
public final class C10923j {
    /* renamed from: a */
    public static final boolean m33395a(MediaCodec.BufferInfo bufferInfo) {
        C9322n.m27781e(bufferInfo, "<this>");
        return (bufferInfo.flags & 4) != 0;
    }
}
