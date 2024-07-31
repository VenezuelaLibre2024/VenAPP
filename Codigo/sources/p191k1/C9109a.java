package p191k1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

@Deprecated
/* renamed from: k1.a */
/* loaded from: classes.dex */
public final class C9109a {

    /* renamed from: f */
    private static final Object f21942f = new Object();

    /* renamed from: g */
    private static C9109a f21943g;

    /* renamed from: a */
    private final Context f21944a;

    /* renamed from: b */
    private final HashMap<BroadcastReceiver, ArrayList<c>> f21945b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, ArrayList<c>> f21946c = new HashMap<>();

    /* renamed from: d */
    private final ArrayList<b> f21947d = new ArrayList<>();

    /* renamed from: e */
    private final Handler f21948e;

    /* renamed from: k1.a$a */
    /* loaded from: classes.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C9109a.this.m26826a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k1.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final Intent f21950a;

        /* renamed from: b */
        final ArrayList<c> f21951b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.f21950a = intent;
            this.f21951b = arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k1.a$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        final IntentFilter f21952a;

        /* renamed from: b */
        final BroadcastReceiver f21953b;

        /* renamed from: c */
        boolean f21954c;

        /* renamed from: d */
        boolean f21955d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f21952a = intentFilter;
            this.f21953b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(RecognitionOptions.ITF);
            sb2.append("Receiver{");
            sb2.append(this.f21953b);
            sb2.append(" filter=");
            sb2.append(this.f21952a);
            if (this.f21955d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    private C9109a(Context context) {
        this.f21944a = context;
        this.f21948e = new a(context.getMainLooper());
    }

    /* renamed from: b */
    public static C9109a m26825b(Context context) {
        C9109a c9109a;
        synchronized (f21942f) {
            if (f21943g == null) {
                f21943g = new C9109a(context.getApplicationContext());
            }
            c9109a = f21943g;
        }
        return c9109a;
    }

    /* renamed from: a */
    void m26826a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f21945b) {
                size = this.f21947d.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b[size];
                this.f21947d.toArray(bVarArr);
                this.f21947d.clear();
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                int size2 = bVar.f21951b.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c cVar = bVar.f21951b.get(i11);
                    if (!cVar.f21955d) {
                        cVar.f21953b.onReceive(this.f21944a, bVar.f21950a);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void m26827c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f21945b) {
            c cVar = new c(intentFilter, broadcastReceiver);
            ArrayList<c> arrayList = this.f21945b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f21945b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList<c> arrayList2 = this.f21946c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f21946c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    /* renamed from: d */
    public boolean m26828d(Intent intent) {
        int i10;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        synchronized (this.f21945b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f21944a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z10 = (intent.getFlags() & 8) != 0;
            if (z10) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<c> arrayList3 = this.f21946c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z10) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i11 = 0;
                while (i11 < arrayList3.size()) {
                    c cVar = arrayList3.get(i11);
                    if (z10) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f21952a);
                    }
                    if (cVar.f21954c) {
                        if (z10) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i10 = i11;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i10 = i11;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        int match = cVar.f21952a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z10) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(cVar);
                            cVar.f21954c = true;
                            i11 = i10 + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        } else if (z10) {
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                        }
                    }
                    arrayList4 = arrayList;
                    i11 = i10 + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                        ((c) arrayList5.get(i12)).f21954c = false;
                    }
                    this.f21947d.add(new b(intent, arrayList5));
                    if (!this.f21948e.hasMessages(1)) {
                        this.f21948e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: e */
    public void m26829e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f21945b) {
            ArrayList<c> remove = this.f21945b.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                c cVar = remove.get(size);
                cVar.f21955d = true;
                for (int i10 = 0; i10 < cVar.f21952a.countActions(); i10++) {
                    String action = cVar.f21952a.getAction(i10);
                    ArrayList<c> arrayList = this.f21946c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            c cVar2 = arrayList.get(size2);
                            if (cVar2.f21953b == broadcastReceiver) {
                                cVar2.f21955d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f21946c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
