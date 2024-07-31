.class public Lr1/w;
.super Lv1/j$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr1/w$b;,
        Lr1/w$c;,
        Lr1/w$a;
    }
.end annotation


# static fields
.field public static final g:Lr1/w$a;


# instance fields
.field private c:Lr1/f;

.field private final d:Lr1/w$b;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr1/w$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr1/w$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lr1/w;->g:Lr1/w$a;

    return-void
.end method

.method public constructor <init>(Lr1/f;Lr1/w$b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "delegate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "identityHash"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "legacyHash"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p2, Lr1/w$b;->a:I

    invoke-direct {p0, v0}, Lv1/j$a;-><init>(I)V

    iput-object p1, p0, Lr1/w;->c:Lr1/f;

    iput-object p2, p0, Lr1/w;->d:Lr1/w$b;

    iput-object p3, p0, Lr1/w;->e:Ljava/lang/String;

    iput-object p4, p0, Lr1/w;->f:Ljava/lang/String;

    return-void
.end method

.method private final h(Lv1/i;)V
    .locals 3

    sget-object v0, Lr1/w;->g:Lr1/w$a;

    invoke-virtual {v0, p1}, Lr1/w$a;->b(Lv1/i;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lv1/a;

    const-string v1, "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"

    invoke-direct {v0, v1}, Lv1/a;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lv1/i;->e0(Lv1/l;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-static {p1, v1}, Lmk/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lr1/w;->e:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lr1/w;->f:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Room cannot verify the data integrity. Looks like you\'ve changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lr1/w;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception v0

    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {p1, v0}, Lmk/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1

    :cond_2
    iget-object v0, p0, Lr1/w;->d:Lr1/w$b;

    invoke-virtual {v0, p1}, Lr1/w$b;->g(Lv1/i;)Lr1/w$c;

    move-result-object v0

    iget-boolean v1, v0, Lr1/w$c;->a:Z

    if-eqz v1, :cond_4

    iget-object v0, p0, Lr1/w;->d:Lr1/w$b;

    invoke-virtual {v0, p1}, Lr1/w$b;->e(Lv1/i;)V

    invoke-direct {p0, p1}, Lr1/w;->j(Lv1/i;)V

    :cond_3
    :goto_1
    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Pre-packaged database has an invalid schema: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lr1/w$c;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final i(Lv1/i;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-interface {p1, v0}, Lv1/i;->x(Ljava/lang/String;)V

    return-void
.end method

.method private final j(Lv1/i;)V
    .locals 1

    invoke-direct {p0, p1}, Lr1/w;->i(Lv1/i;)V

    iget-object v0, p0, Lr1/w;->e:Ljava/lang/String;

    invoke-static {v0}, Lr1/v;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lv1/i;->x(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b(Lv1/i;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lv1/j$a;->b(Lv1/i;)V

    return-void
.end method

.method public d(Lv1/i;)V
    .locals 3

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lr1/w;->g:Lr1/w$a;

    invoke-virtual {v0, p1}, Lr1/w$a;->a(Lv1/i;)Z

    move-result v0

    iget-object v1, p0, Lr1/w;->d:Lr1/w$b;

    invoke-virtual {v1, p1}, Lr1/w$b;->a(Lv1/i;)V

    if-nez v0, :cond_1

    iget-object v0, p0, Lr1/w;->d:Lr1/w$b;

    invoke-virtual {v0, p1}, Lr1/w$b;->g(Lv1/i;)Lr1/w$c;

    move-result-object v0

    iget-boolean v1, v0, Lr1/w$c;->a:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Pre-packaged database has an invalid schema: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lr1/w$c;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-direct {p0, p1}, Lr1/w;->j(Lv1/i;)V

    iget-object v0, p0, Lr1/w;->d:Lr1/w$b;

    invoke-virtual {v0, p1}, Lr1/w$b;->c(Lv1/i;)V

    return-void
.end method

.method public e(Lv1/i;II)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3}, Lr1/w;->g(Lv1/i;II)V

    return-void
.end method

.method public f(Lv1/i;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lv1/j$a;->f(Lv1/i;)V

    invoke-direct {p0, p1}, Lr1/w;->h(Lv1/i;)V

    iget-object v0, p0, Lr1/w;->d:Lr1/w$b;

    invoke-virtual {v0, p1}, Lr1/w$b;->d(Lv1/i;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lr1/w;->c:Lr1/f;

    return-void
.end method

.method public g(Lv1/i;II)V
    .locals 2

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lr1/w;->c:Lr1/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, v0, Lr1/f;->d:Lr1/u$e;

    invoke-virtual {v0, p2, p3}, Lr1/u$e;->d(II)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lr1/w;->d:Lr1/w$b;

    invoke-virtual {v1, p1}, Lr1/w$b;->f(Lv1/i;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls1/b;

    invoke-virtual {v1, p1}, Ls1/b;->a(Lv1/i;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lr1/w;->d:Lr1/w$b;

    invoke-virtual {v0, p1}, Lr1/w$b;->g(Lv1/i;)Lr1/w$c;

    move-result-object v0

    iget-boolean v1, v0, Lr1/w$c;->a:Z

    if-eqz v1, :cond_1

    iget-object v0, p0, Lr1/w;->d:Lr1/w$b;

    invoke-virtual {v0, p1}, Lr1/w$b;->e(Lv1/i;)V

    invoke-direct {p0, p1}, Lr1/w;->j(Lv1/i;)V

    const/4 v0, 0x1

    move v1, v0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Migration didn\'t properly handle: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, v0, Lr1/w$c;->b:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    if-nez v1, :cond_4

    iget-object v0, p0, Lr1/w;->c:Lr1/f;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p2, p3}, Lr1/f;->a(II)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object p2, p0, Lr1/w;->d:Lr1/w$b;

    invoke-virtual {p2, p1}, Lr1/w$b;->b(Lv1/i;)V

    iget-object p2, p0, Lr1/w;->d:Lr1/w$b;

    invoke-virtual {p2, p1}, Lr1/w$b;->a(Lv1/i;)V

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "A migration from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " to "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_2
    return-void
.end method
