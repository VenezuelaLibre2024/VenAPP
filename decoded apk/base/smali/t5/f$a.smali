.class final Lt5/f$a;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt5/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:I

.field private b:Landroid/net/Uri;

.field final synthetic c:Lt5/f;


# direct methods
.method public constructor <init>(Lt5/f;ILandroid/os/Handler;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/os/Handler;",
            ")V"
        }
    .end annotation

    const-string v0, "handler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lt5/f$a;->c:Lt5/f;

    invoke-direct {p0, p3}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    iput p2, p0, Lt5/f$a;->a:I

    const-string p1, "content://media"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string p2, "parse(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lt5/f$a;->b:Landroid/net/Uri;

    return-void
.end method

.method private final c(JI)Lck/m;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI)",
            "Lck/m<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object v1, p0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-string v5, "bucket_display_name"

    const-string v6, "bucket_id"

    const/4 v7, 0x0

    if-lt v0, v2, :cond_1

    invoke-virtual {p0}, Lt5/f$a;->b()Landroid/content/ContentResolver;

    move-result-object v8

    iget-object v0, v1, Lt5/f$a;->c:Lt5/f;

    invoke-static {v0}, Lt5/f;->a(Lt5/f;)Landroid/net/Uri;

    move-result-object v9

    filled-new-array {v6, v5}, [Ljava/lang/String;

    move-result-object v10

    const-string v11, "_id = ?"

    new-array v12, v4, [Ljava/lang/String;

    invoke-static/range {p1 .. p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v12, v3

    const/4 v13, 0x0

    invoke-virtual/range {v8 .. v13}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    if-eqz v2, :cond_5

    :try_start_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v5, Lck/m;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-direct {v5, v3, v0}, Lck/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v2, v7}, Lmk/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v5

    :cond_0
    :try_start_1
    sget-object v0, Lck/v;->a:Lck/v;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-static {v2, v7}, Lmk/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    move-object v3, v0

    :try_start_2
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    move-object v4, v0

    invoke-static {v2, v3}, Lmk/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v4

    :cond_1
    const/4 v0, 0x2

    move/from16 v2, p3

    invoke-virtual {p0}, Lt5/f$a;->b()Landroid/content/ContentResolver;

    move-result-object v8

    if-ne v2, v0, :cond_3

    iget-object v0, v1, Lt5/f$a;->c:Lt5/f;

    invoke-static {v0}, Lt5/f;->a(Lt5/f;)Landroid/net/Uri;

    move-result-object v9

    const-string v0, "album_id"

    const-string v2, "album"

    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v10

    const-string v11, "_id = ?"

    new-array v12, v4, [Ljava/lang/String;

    invoke-static/range {p1 .. p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v12, v3

    const/4 v13, 0x0

    invoke-virtual/range {v8 .. v13}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    if-eqz v3, :cond_5

    :try_start_3
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    invoke-interface {v3, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lck/m;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-direct {v2, v4, v0}, Lck/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-static {v3, v7}, Lmk/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v2

    :cond_2
    :try_start_4
    sget-object v0, Lck/v;->a:Lck/v;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    invoke-static {v3, v7}, Lmk/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v2, v0

    :try_start_5
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception v0

    move-object v4, v0

    invoke-static {v3, v2}, Lmk/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v4

    :cond_3
    iget-object v0, v1, Lt5/f$a;->c:Lt5/f;

    invoke-static {v0}, Lt5/f;->a(Lt5/f;)Landroid/net/Uri;

    move-result-object v9

    filled-new-array {v6, v5}, [Ljava/lang/String;

    move-result-object v10

    const-string v11, "_id = ?"

    new-array v12, v4, [Ljava/lang/String;

    invoke-static/range {p1 .. p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v12, v3

    const/4 v13, 0x0

    invoke-virtual/range {v8 .. v13}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    if-eqz v2, :cond_5

    :try_start_6
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v5, Lck/m;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-direct {v5, v3, v0}, Lck/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    invoke-static {v2, v7}, Lmk/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v5

    :cond_4
    :try_start_7
    sget-object v0, Lck/v;->a:Lck/v;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto/16 :goto_0

    :catchall_4
    move-exception v0

    move-object v3, v0

    :try_start_8
    throw v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    :catchall_5
    move-exception v0

    move-object v4, v0

    invoke-static {v2, v3}, Lmk/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v4

    :cond_5
    :goto_1
    new-instance v0, Lck/m;

    invoke-direct {v0, v7, v7}, Lck/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final a()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lt5/f$a;->c:Lt5/f;

    invoke-virtual {v0}, Lt5/f;->b()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final b()Landroid/content/ContentResolver;
    .locals 2

    invoke-virtual {p0}, Lt5/f$a;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "getContentResolver(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final d(Landroid/net/Uri;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lt5/f$a;->b:Landroid/net/Uri;

    return-void
.end method

.method public onChange(ZLandroid/net/Uri;)V
    .locals 12

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-static {p1}, Lxk/g;->k(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    move-object v4, p1

    goto :goto_0

    :cond_1
    move-object v4, v0

    :goto_0
    if-eqz v4, :cond_6

    invoke-virtual {p0}, Lt5/f$a;->b()Landroid/content/ContentResolver;

    move-result-object v5

    iget-object p1, p0, Lt5/f$a;->c:Lt5/f;

    invoke-static {p1}, Lt5/f;->a(Lt5/f;)Landroid/net/Uri;

    move-result-object v6

    const-string p1, "date_modified"

    const-string v1, "date_added"

    const-string v2, "media_type"

    filled-new-array {v1, p1, v2}, [Ljava/lang/String;

    move-result-object v7

    const-string v8, "_id = ?"

    const/4 p1, 0x1

    new-array v9, p1, [Ljava/lang/String;

    const/4 p1, 0x0

    invoke-virtual {v4}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v9, p1

    const/4 v10, 0x0

    invoke-virtual/range {v5 .. v10}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_8

    iget-object v3, p0, Lt5/f$a;->c:Lt5/f;

    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    if-nez v5, :cond_2

    const-string v5, "delete"

    const/4 v6, 0x0

    iget v7, p0, Lt5/f$a;->a:I

    move-object v1, v3

    move-object v2, p2

    move-object v3, v5

    move-object v5, v6

    move v6, v7

    invoke-virtual/range {v1 .. v6}, Lt5/f;->d(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p1, v0}, Lmk/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-void

    :cond_2
    :try_start_1
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    const/16 v1, 0x3e8

    int-to-long v9, v1

    div-long/2addr v7, v9

    sub-long/2addr v7, v5

    const-wide/16 v5, 0x1e

    cmp-long v1, v7, v5

    if-gez v1, :cond_3

    const-string v1, "insert"

    goto :goto_1

    :cond_3
    const-string v1, "update"

    :goto_1
    move-object v5, v1

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-direct {p0, v1, v2, v6}, Lt5/f$a;->c(JI)Lck/m;

    move-result-object v1

    invoke-virtual {v1}, Lck/m;->a()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v1}, Lck/m;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v7, :cond_5

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v1, v3

    move-object v2, p2

    move-object v3, v5

    move-object v5, v7

    invoke-virtual/range {v1 .. v6}, Lt5/f;->d(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;I)V

    sget-object p2, Lck/v;->a:Lck/v;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {p1, v0}, Lmk/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_5
    :goto_2
    invoke-static {p1, v0}, Lmk/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p2

    :try_start_2
    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p1, p2}, Lmk/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_6
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    if-ge p1, v0, :cond_7

    iget-object p1, p0, Lt5/f$a;->b:Landroid/net/Uri;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object v0, p0, Lt5/f$a;->c:Lt5/f;

    const-string v2, "insert"

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget v5, p0, Lt5/f$a;->a:I

    move-object v1, p2

    invoke-virtual/range {v0 .. v5}, Lt5/f;->d(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;I)V

    return-void

    :cond_7
    iget-object v6, p0, Lt5/f$a;->c:Lt5/f;

    const-string v8, "delete"

    const/4 v9, 0x0

    const/4 v10, 0x0

    iget v11, p0, Lt5/f$a;->a:I

    move-object v7, p2

    invoke-virtual/range {v6 .. v11}, Lt5/f;->d(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;I)V

    :cond_8
    :goto_3
    return-void
.end method
