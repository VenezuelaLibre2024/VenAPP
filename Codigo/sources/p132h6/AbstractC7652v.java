package p132h6;

import android.content.Context;
import java.io.Closeable;
import p289p6.InterfaceC10067d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h6.v */
/* loaded from: classes.dex */
public abstract class AbstractC7652v implements Closeable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h6.v$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        a mo23202a(Context context);

        AbstractC7652v build();
    }

    /* renamed from: a */
    abstract InterfaceC10067d mo23200a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract C7651u mo23201b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mo23200a().close();
    }
}
