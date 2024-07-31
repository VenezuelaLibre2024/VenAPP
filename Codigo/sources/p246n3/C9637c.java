package p246n3;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p036c4.C1860a;
import p129h3.C7624h;
import p129h3.InterfaceC7620d;

/* renamed from: n3.c */
/* loaded from: classes.dex */
public class C9637c implements InterfaceC7620d<ByteBuffer> {
    @Override // p129h3.InterfaceC7620d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo23137b(ByteBuffer byteBuffer, File file, C7624h c7624h) {
        try {
            C1860a.m9922f(byteBuffer, file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e10);
            }
            return false;
        }
    }
}
