.class public final Lyl/f$d$b;
.super Lul/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyl/f$d;->a(ZIILjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Z

.field final synthetic g:Lyl/f;

.field final synthetic h:Lyl/i;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLyl/f;Lyl/i;)V
    .locals 0

    iput-object p1, p0, Lyl/f$d$b;->e:Ljava/lang/String;

    iput-boolean p2, p0, Lyl/f$d$b;->f:Z

    iput-object p3, p0, Lyl/f$d$b;->g:Lyl/f;

    iput-object p4, p0, Lyl/f$d$b;->h:Lyl/i;

    invoke-direct {p0, p1, p2}, Lul/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 4

    :try_start_0
    iget-object v0, p0, Lyl/f$d$b;->g:Lyl/f;

    invoke-virtual {v0}, Lyl/f;->c0()Lyl/f$c;

    move-result-object v0

    iget-object v1, p0, Lyl/f$d$b;->h:Lyl/i;

    invoke-virtual {v0, v1}, Lyl/f$c;->b(Lyl/i;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lzl/j;->a:Lzl/j$a;

    invoke-virtual {v1}, Lzl/j$a;->g()Lzl/j;

    move-result-object v1

    iget-object v2, p0, Lyl/f$d$b;->g:Lyl/f;

    invoke-virtual {v2}, Lyl/f;->U()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Http2Connection.Listener failure for "

    invoke-static {v3, v2}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {v1, v2, v3, v0}, Lzl/j;->j(Ljava/lang/String;ILjava/lang/Throwable;)V

    :try_start_1
    iget-object v1, p0, Lyl/f$d$b;->h:Lyl/i;

    sget-object v2, Lyl/b;->PROTOCOL_ERROR:Lyl/b;

    invoke-virtual {v1, v2, v0}, Lyl/i;->d(Lyl/b;Ljava/io/IOException;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :goto_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method
