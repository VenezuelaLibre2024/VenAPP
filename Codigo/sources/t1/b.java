package t1;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import ck.v;
import dk.q;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import kotlin.jvm.internal.n;
import r1.u;
import v1.i;
import v1.l;
import xk.p;

/* loaded from: classes.dex */
public final class b {
    public static final void a(i db2) {
        List c10;
        List<String> a10;
        boolean E;
        n.e(db2, "db");
        c10 = q.c();
        Cursor S0 = db2.S0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (S0.moveToNext()) {
            try {
                c10.add(S0.getString(0));
            } finally {
            }
        }
        v vVar = v.f7137a;
        mk.b.a(S0, null);
        a10 = q.a(c10);
        for (String triggerName : a10) {
            n.d(triggerName, "triggerName");
            E = p.E(triggerName, "room_fts_content_sync_", false, 2, null);
            if (E) {
                db2.x("DROP TRIGGER IF EXISTS " + triggerName);
            }
        }
    }

    public static final Cursor b(u db2, l sqLiteQuery, boolean z10, CancellationSignal cancellationSignal) {
        n.e(db2, "db");
        n.e(sqLiteQuery, "sqLiteQuery");
        Cursor y10 = db2.y(sqLiteQuery, cancellationSignal);
        if (!z10 || !(y10 instanceof AbstractWindowedCursor)) {
            return y10;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) y10;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? a.a(y10) : y10;
    }

    public static final int c(File databaseFile) {
        n.e(databaseFile, "databaseFile");
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
            mk.b.a(channel, null);
            return i10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                mk.b.a(channel, th2);
                throw th3;
            }
        }
    }
}
