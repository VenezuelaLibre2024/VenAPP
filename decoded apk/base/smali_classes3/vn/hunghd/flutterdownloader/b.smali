.class public final Lvn/hunghd/flutterdownloader/b;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvn/hunghd/flutterdownloader/b$a;
    }
.end annotation


# static fields
.field public static final a:Lvn/hunghd/flutterdownloader/b$a;

.field private static b:Lvn/hunghd/flutterdownloader/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvn/hunghd/flutterdownloader/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvn/hunghd/flutterdownloader/b$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lvn/hunghd/flutterdownloader/b;->a:Lvn/hunghd/flutterdownloader/b$a;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x4

    const-string v2, "download_tasks.db"

    invoke-direct {p0, p1, v2, v0, v1}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lvn/hunghd/flutterdownloader/b;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static final synthetic a()Lvn/hunghd/flutterdownloader/b;
    .locals 1

    sget-object v0, Lvn/hunghd/flutterdownloader/b;->b:Lvn/hunghd/flutterdownloader/b;

    return-object v0
.end method

.method public static final synthetic b(Lvn/hunghd/flutterdownloader/b;)V
    .locals 0

    sput-object p0, Lvn/hunghd/flutterdownloader/b;->b:Lvn/hunghd/flutterdownloader/b;

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CREATE TABLE task (_id INTEGER PRIMARY KEY,task_id VARCHAR(256), url TEXT, status INTEGER DEFAULT 0, progress INTEGER DEFAULT 0, file_name TEXT, saved_dir TEXT, headers TEXT, mime_type VARCHAR(128), resumable TINYINT DEFAULT 0, show_notification TINYINT DEFAULT 0, open_file_from_notification TINYINT DEFAULT 0, time_created INTEGER DEFAULT 0, save_in_public_storage TINYINT DEFAULT 0, allow_cellular TINYINT DEFAULT 1)"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method public onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3}, Lvn/hunghd/flutterdownloader/b;->onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V

    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    if-ne p3, v0, :cond_0

    const-string p2, "ALTER TABLE task ADD COLUMN allow_cellular TINYINT DEFAULT 1"

    :goto_0
    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    const/4 p2, 0x3

    if-ne p3, p2, :cond_1

    const-string p2, "ALTER TABLE task ADD COLUMN save_in_public_storage TINYINT DEFAULT 0"

    goto :goto_0

    :cond_1
    const-string p2, "DROP TABLE IF EXISTS task"

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lvn/hunghd/flutterdownloader/b;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V

    :goto_1
    return-void
.end method
