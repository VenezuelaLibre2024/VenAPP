package p356t1;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import ck.C2037v;
import dk.C7029q;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import mk.C9602b;
import p322r1.AbstractC10604u;
import p391v1.InterfaceC11610i;
import p391v1.InterfaceC11613l;
import p450xk.C12524p;

/* renamed from: t1.b */
/* loaded from: classes.dex */
public final class C10973b {
    /* renamed from: a */
    public static final void m33487a(InterfaceC11610i db2) {
        List m20570c;
        List<String> m20568a;
        boolean m41031E;
        C9322n.m27781e(db2, "db");
        m20570c = C7029q.m20570c();
        Cursor mo32135S0 = db2.mo32135S0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (mo32135S0.moveToNext()) {
            try {
                m20570c.add(mo32135S0.getString(0));
            } finally {
            }
        }
        C2037v c2037v = C2037v.f8089a;
        C9602b.m28593a(mo32135S0, null);
        m20568a = C7029q.m20568a(m20570c);
        for (String triggerName : m20568a) {
            C9322n.m27780d(triggerName, "triggerName");
            m41031E = C12524p.m41031E(triggerName, "room_fts_content_sync_", false, 2, null);
            if (m41031E) {
                db2.mo32144x("DROP TRIGGER IF EXISTS " + triggerName);
            }
        }
    }

    /* renamed from: b */
    public static final Cursor m33488b(AbstractC10604u db2, InterfaceC11613l sqLiteQuery, boolean z10, CancellationSignal cancellationSignal) {
        C9322n.m27781e(db2, "db");
        C9322n.m27781e(sqLiteQuery, "sqLiteQuery");
        Cursor m32266y = db2.m32266y(sqLiteQuery, cancellationSignal);
        if (!z10 || !(m32266y instanceof AbstractWindowedCursor)) {
            return m32266y;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) m32266y;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? C10972a.m33482a(m32266y) : m32266y;
    }

    /* renamed from: c */
    public static final int m33489c(File databaseFile) {
        C9322n.m27781e(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            allocate.rewind();
            int i10 = allocate.getInt();
            C9602b.m28593a(channel, null);
            return i10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C9602b.m28593a(channel, th2);
                throw th3;
            }
        }
    }
}
