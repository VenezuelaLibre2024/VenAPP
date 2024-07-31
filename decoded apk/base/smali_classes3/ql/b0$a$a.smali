.class public final Lql/b0$a$a;
.super Lql/b0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lql/b0$a;->a(Ljava/io/File;Lql/w;)Lql/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Lql/w;

.field final synthetic c:Ljava/io/File;


# direct methods
.method constructor <init>(Lql/w;Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Lql/b0$a$a;->b:Lql/w;

    iput-object p2, p0, Lql/b0$a$a;->c:Ljava/io/File;

    invoke-direct {p0}, Lql/b0;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Lql/b0$a$a;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    return-wide v0
.end method

.method public b()Lql/w;
    .locals 1

    iget-object v0, p0, Lql/b0$a$a;->b:Lql/w;

    return-object v0
.end method

.method public f(Ldm/c;)V
    .locals 2

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lql/b0$a$a;->c:Ljava/io/File;

    invoke-static {v0}, Ldm/l;->f(Ljava/io/File;)Ldm/x;

    move-result-object v0

    :try_start_0
    invoke-interface {p1, v0}, Ldm/c;->E0(Ldm/x;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    invoke-static {v0, p1}, Lmk/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {v0, p1}, Lmk/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method
