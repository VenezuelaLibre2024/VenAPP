package v1;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes.dex */
public interface i extends Closeable {
    m C0(String str);

    Cursor D(l lVar, CancellationSignal cancellationSignal);

    void M();

    void N(String str, Object[] objArr);

    int N0(String str, int i10, ContentValues contentValues, String str2, Object[] objArr);

    void P();

    Cursor S0(String str);

    void X();

    Cursor e0(l lVar);

    String f0();

    boolean i1();

    boolean isOpen();

    boolean m1();

    void t();

    List<Pair<String, String>> w();

    void x(String str);
}
