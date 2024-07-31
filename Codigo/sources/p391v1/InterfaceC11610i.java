package p391v1;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* renamed from: v1.i */
/* loaded from: classes.dex */
public interface InterfaceC11610i extends Closeable {
    /* renamed from: C0 */
    InterfaceC11614m mo32129C0(String str);

    /* renamed from: D */
    Cursor mo32130D(InterfaceC11613l interfaceC11613l, CancellationSignal cancellationSignal);

    /* renamed from: M */
    void mo32131M();

    /* renamed from: N */
    void mo32132N(String str, Object[] objArr);

    /* renamed from: N0 */
    int mo32133N0(String str, int i10, ContentValues contentValues, String str2, Object[] objArr);

    /* renamed from: P */
    void mo32134P();

    /* renamed from: S0 */
    Cursor mo32135S0(String str);

    /* renamed from: X */
    void mo32136X();

    /* renamed from: e0 */
    Cursor mo32138e0(InterfaceC11613l interfaceC11613l);

    /* renamed from: f0 */
    String mo32139f0();

    /* renamed from: i1 */
    boolean mo32140i1();

    boolean isOpen();

    /* renamed from: m1 */
    boolean mo32141m1();

    /* renamed from: t */
    void mo32142t();

    /* renamed from: w */
    List<Pair<String, String>> mo32143w();

    /* renamed from: x */
    void mo32144x(String str);
}
