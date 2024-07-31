package p373u3;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p036c4.C1860a;
import p129h3.C7624h;
import p129h3.EnumC7619c;
import p129h3.InterfaceC7627k;
import p171j3.InterfaceC8975v;

/* renamed from: u3.d */
/* loaded from: classes.dex */
public class C11309d implements InterfaceC7627k<C11308c> {
    @Override // p129h3.InterfaceC7627k
    /* renamed from: a */
    public EnumC7619c mo23153a(C7624h c7624h) {
        return EnumC7619c.SOURCE;
    }

    @Override // p129h3.InterfaceC7620d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo23137b(InterfaceC8975v<C11308c> interfaceC8975v, File file, C7624h c7624h) {
        try {
            C1860a.m9922f(interfaceC8975v.get().m35323c(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }
}
