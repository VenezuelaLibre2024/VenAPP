package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.n */
/* loaded from: classes.dex */
public class C2143n extends AbstractC2141l<InputStream> {

    /* renamed from: d */
    private static final UriMatcher f8441d;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f8441d = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C2143n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: i */
    private InputStream m10793i(Uri uri, ContentResolver contentResolver) {
        int match = f8441d.match(uri);
        if (match != 1) {
            if (match == 3) {
                return m10794j(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return m10794j(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: j */
    private InputStream m10794j(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2133d
    /* renamed from: a */
    public Class<InputStream> mo10760a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.AbstractC2141l
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo10761c(InputStream inputStream) {
        inputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.AbstractC2141l
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream mo10762f(Uri uri, ContentResolver contentResolver) {
        InputStream m10793i = m10793i(uri, contentResolver);
        if (m10793i != null) {
            return m10793i;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }
}
