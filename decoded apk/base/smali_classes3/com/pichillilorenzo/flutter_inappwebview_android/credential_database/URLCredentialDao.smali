.class public Lcom/pichillilorenzo/flutter_inappwebview_android/credential_database/URLCredentialDao;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field credentialDatabaseHelper:Lcom/pichillilorenzo/flutter_inappwebview_android/credential_database/CredentialDatabaseHelper;

.field projection:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview_android/credential_database/CredentialDatabaseHelper;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "password"

    const-string v1, "protection_space_id"

    const-string v2, "_id"

    const-string v3, "username"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/credential_database/URLCredentialDao;->projection:[Ljava/lang/String;

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/credential_database/URLCredentialDao;->credentialDatabaseHelper:Lcom/pichillilorenzo/flutter_inappwebview_android/credential_database/CredentialDatabaseHelper;

    return-void
.end method


# virtual methods
.method public delete(Lcom/pichillilorenzo/flutter_inappwebview_android/types/URLCredential;)J
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/URLCredential;->getId()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/credential_database/URLCredentialDao;->credentialDatabaseHelper:Lcom/pichillilorenzo/flutter_inappwebview_android/credential_database/CredentialDatabaseHelper;

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    const-string v1, "credential"

    const-string v2, "_id = ?"

    invoke-virtual {p1, v1, v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1

    int-to-long v0, p1

    return-wide v0
.end method

.method public find(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/pichillilorenzo/flutter_inappwebview_android/types/URLCredential;
    .locals 8

    const-string v3, "username = ? AND password = ? AND protection_space_id = ?"

    const/4 v0, 0x3

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v4, v0

    const/4 p1, 0x1

    aput-object p2, v4, p1

    invoke-virtual {p3}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v4, p2

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/credential_database/URLCredentialDao;->credentialDatabaseHelper:Lcom/pichillilorenzo/flutter_inappwebview_android/credential_database/CredentialDatabaseHelper;

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "credential"

    iget-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/credential_database/URLCredentialDao;->projection:[Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "_id"

    invoke-interface {p1, p2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result p2

    invoke-interface {p1, p2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const-string v0, "username"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "password"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/pichillilorenzo/flutter_inappwebview_android/types/URLCredential;

    invoke-direct {v2, p2, v0, v1, p3}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/URLCredential;-><init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-object v2
.end method

.method public getAllByProtectionSpaceId(Ljava/lang/Long;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            ")",
            "Ljava/util/List<",
            "Lcom/pichillilorenzo/flutter_inappwebview_android/types/URLCredential;",
            ">;"
        }
    .end annotation

    const-string v3, "protection_space_id = ?"

    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/credential_database/URLCredentialDao;->credentialDatabaseHelper:Lcom/pichillilorenzo/flutter_inappwebview_android/credential_database/CredentialDatabaseHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "credential"

    iget-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/credential_database/URLCredentialDao;->projection:[Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "_id"

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "username"

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "password"

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/pichillilorenzo/flutter_inappwebview_android/types/URLCredential;

    invoke-direct {v5, v2, v3, v4, p1}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/URLCredential;-><init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return-object v1
.end method

.method public insert(Lcom/pichillilorenzo/flutter_inappwebview_android/types/URLCredential;)J
    .locals 3

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    invoke-virtual {p1}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/URLCredential;->getUsername()Ljava/lang/String;

    move-result-object v1

    const-string v2, "username"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "password"

    invoke-virtual {p1}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/URLCredential;->getPassword()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "protection_space_id"

    invoke-virtual {p1}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/URLCredential;->getProtectionSpaceId()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/credential_database/URLCredentialDao;->credentialDatabaseHelper:Lcom/pichillilorenzo/flutter_inappwebview_android/credential_database/CredentialDatabaseHelper;

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    const-string v1, "credential"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public update(Lcom/pichillilorenzo/flutter_inappwebview_android/types/URLCredential;)J
    .locals 4

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    invoke-virtual {p1}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/URLCredential;->getUsername()Ljava/lang/String;

    move-result-object v1

    const-string v2, "username"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "password"

    invoke-virtual {p1}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/URLCredential;->getPassword()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/URLCredential;->getProtectionSpaceId()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/credential_database/URLCredentialDao;->credentialDatabaseHelper:Lcom/pichillilorenzo/flutter_inappwebview_android/credential_database/CredentialDatabaseHelper;

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    const-string v2, "credential"

    const-string v3, "protection_space_id = ?"

    invoke-virtual {p1, v2, v0, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1

    int-to-long v0, p1

    return-wide v0
.end method
