.class public final Ls8/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls8/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls8/r$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls8/m0;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ls8/j;

.field private d:Ls8/j;

.field private e:Ls8/j;

.field private f:Ls8/j;

.field private g:Ls8/j;

.field private h:Ls8/j;

.field private i:Ls8/j;

.field private j:Ls8/j;

.field private k:Ls8/j;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ls8/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ls8/r;->a:Landroid/content/Context;

    invoke-static {p2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls8/j;

    iput-object p1, p0, Ls8/r;->c:Ls8/j;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ls8/r;->b:Ljava/util/List;

    return-void
.end method

.method private h(Ls8/j;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ls8/r;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Ls8/r;->b:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls8/m0;

    invoke-interface {p1, v1}, Ls8/j;->l(Ls8/m0;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private r()Ls8/j;
    .locals 2

    iget-object v0, p0, Ls8/r;->e:Ls8/j;

    if-nez v0, :cond_0

    new-instance v0, Ls8/c;

    iget-object v1, p0, Ls8/r;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Ls8/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ls8/r;->e:Ls8/j;

    invoke-direct {p0, v0}, Ls8/r;->h(Ls8/j;)V

    :cond_0
    iget-object v0, p0, Ls8/r;->e:Ls8/j;

    return-object v0
.end method

.method private s()Ls8/j;
    .locals 2

    iget-object v0, p0, Ls8/r;->f:Ls8/j;

    if-nez v0, :cond_0

    new-instance v0, Ls8/g;

    iget-object v1, p0, Ls8/r;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Ls8/g;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ls8/r;->f:Ls8/j;

    invoke-direct {p0, v0}, Ls8/r;->h(Ls8/j;)V

    :cond_0
    iget-object v0, p0, Ls8/r;->f:Ls8/j;

    return-object v0
.end method

.method private t()Ls8/j;
    .locals 1

    iget-object v0, p0, Ls8/r;->i:Ls8/j;

    if-nez v0, :cond_0

    new-instance v0, Ls8/i;

    invoke-direct {v0}, Ls8/i;-><init>()V

    iput-object v0, p0, Ls8/r;->i:Ls8/j;

    invoke-direct {p0, v0}, Ls8/r;->h(Ls8/j;)V

    :cond_0
    iget-object v0, p0, Ls8/r;->i:Ls8/j;

    return-object v0
.end method

.method private u()Ls8/j;
    .locals 1

    iget-object v0, p0, Ls8/r;->d:Ls8/j;

    if-nez v0, :cond_0

    new-instance v0, Ls8/w;

    invoke-direct {v0}, Ls8/w;-><init>()V

    iput-object v0, p0, Ls8/r;->d:Ls8/j;

    invoke-direct {p0, v0}, Ls8/r;->h(Ls8/j;)V

    :cond_0
    iget-object v0, p0, Ls8/r;->d:Ls8/j;

    return-object v0
.end method

.method private v()Ls8/j;
    .locals 2

    iget-object v0, p0, Ls8/r;->j:Ls8/j;

    if-nez v0, :cond_0

    new-instance v0, Ls8/h0;

    iget-object v1, p0, Ls8/r;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Ls8/h0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ls8/r;->j:Ls8/j;

    invoke-direct {p0, v0}, Ls8/r;->h(Ls8/j;)V

    :cond_0
    iget-object v0, p0, Ls8/r;->j:Ls8/j;

    return-object v0
.end method

.method private w()Ls8/j;
    .locals 3

    iget-object v0, p0, Ls8/r;->g:Ls8/j;

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "com.google.android.exoplayer2.ext.rtmp.RtmpDataSource"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls8/j;

    iput-object v0, p0, Ls8/r;->g:Ls8/j;

    invoke-direct {p0, v0}, Ls8/r;->h(Ls8/j;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Error instantiating RTMP extension"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    const-string v0, "DefaultDataSource"

    const-string v1, "Attempting to play RTMP stream without depending on the RTMP extension"

    invoke-static {v0, v1}, Lt8/s;->i(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Ls8/r;->g:Ls8/j;

    if-nez v0, :cond_0

    iget-object v0, p0, Ls8/r;->c:Ls8/j;

    iput-object v0, p0, Ls8/r;->g:Ls8/j;

    :cond_0
    iget-object v0, p0, Ls8/r;->g:Ls8/j;

    return-object v0
.end method

.method private x()Ls8/j;
    .locals 1

    iget-object v0, p0, Ls8/r;->h:Ls8/j;

    if-nez v0, :cond_0

    new-instance v0, Ls8/n0;

    invoke-direct {v0}, Ls8/n0;-><init>()V

    iput-object v0, p0, Ls8/r;->h:Ls8/j;

    invoke-direct {p0, v0}, Ls8/r;->h(Ls8/j;)V

    :cond_0
    iget-object v0, p0, Ls8/r;->h:Ls8/j;

    return-object v0
.end method

.method private y(Ls8/j;Ls8/m0;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Ls8/j;->l(Ls8/m0;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    iget-object v0, p0, Ls8/r;->k:Ls8/j;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {v0}, Ls8/j;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v1, p0, Ls8/r;->k:Ls8/j;

    goto :goto_0

    :catchall_0
    move-exception v0

    iput-object v1, p0, Ls8/r;->k:Ls8/j;

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method public e()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Ls8/r;->k:Ls8/j;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ls8/j;->e()Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public getUri()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Ls8/r;->k:Ls8/j;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ls8/j;->getUri()Landroid/net/Uri;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public l(Ls8/m0;)V
    .locals 1

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ls8/r;->c:Ls8/j;

    invoke-interface {v0, p1}, Ls8/j;->l(Ls8/m0;)V

    iget-object v0, p0, Ls8/r;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls8/r;->d:Ls8/j;

    invoke-direct {p0, v0, p1}, Ls8/r;->y(Ls8/j;Ls8/m0;)V

    iget-object v0, p0, Ls8/r;->e:Ls8/j;

    invoke-direct {p0, v0, p1}, Ls8/r;->y(Ls8/j;Ls8/m0;)V

    iget-object v0, p0, Ls8/r;->f:Ls8/j;

    invoke-direct {p0, v0, p1}, Ls8/r;->y(Ls8/j;Ls8/m0;)V

    iget-object v0, p0, Ls8/r;->g:Ls8/j;

    invoke-direct {p0, v0, p1}, Ls8/r;->y(Ls8/j;Ls8/m0;)V

    iget-object v0, p0, Ls8/r;->h:Ls8/j;

    invoke-direct {p0, v0, p1}, Ls8/r;->y(Ls8/j;Ls8/m0;)V

    iget-object v0, p0, Ls8/r;->i:Ls8/j;

    invoke-direct {p0, v0, p1}, Ls8/r;->y(Ls8/j;Ls8/m0;)V

    iget-object v0, p0, Ls8/r;->j:Ls8/j;

    invoke-direct {p0, v0, p1}, Ls8/r;->y(Ls8/j;Ls8/m0;)V

    return-void
.end method

.method public o(Ls8/n;)J
    .locals 2

    iget-object v0, p0, Ls8/r;->k:Ls8/j;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lt8/a;->g(Z)V

    iget-object v0, p1, Ls8/n;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Ls8/n;->a:Landroid/net/Uri;

    invoke-static {v1}, Lt8/r0;->w0(Landroid/net/Uri;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, p1, Ls8/n;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "/android_asset/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Ls8/r;->u()Ls8/j;

    move-result-object v0

    goto :goto_2

    :cond_2
    const-string v1, "asset"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_1
    invoke-direct {p0}, Ls8/r;->r()Ls8/j;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Ls8/r;->k:Ls8/j;

    goto :goto_4

    :cond_3
    const-string v1, "content"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-direct {p0}, Ls8/r;->s()Ls8/j;

    move-result-object v0

    goto :goto_2

    :cond_4
    const-string v1, "rtmp"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-direct {p0}, Ls8/r;->w()Ls8/j;

    move-result-object v0

    goto :goto_2

    :cond_5
    const-string v1, "udp"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-direct {p0}, Ls8/r;->x()Ls8/j;

    move-result-object v0

    goto :goto_2

    :cond_6
    const-string v1, "data"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-direct {p0}, Ls8/r;->t()Ls8/j;

    move-result-object v0

    goto :goto_2

    :cond_7
    const-string v1, "rawresource"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    const-string v1, "android.resource"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_3

    :cond_8
    iget-object v0, p0, Ls8/r;->c:Ls8/j;

    goto :goto_2

    :cond_9
    :goto_3
    invoke-direct {p0}, Ls8/r;->v()Ls8/j;

    move-result-object v0

    goto :goto_2

    :goto_4
    iget-object v0, p0, Ls8/r;->k:Ls8/j;

    invoke-interface {v0, p1}, Ls8/j;->o(Ls8/n;)J

    move-result-wide v0

    return-wide v0
.end method

.method public read([BII)I
    .locals 1

    iget-object v0, p0, Ls8/r;->k:Ls8/j;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls8/j;

    invoke-interface {v0, p1, p2, p3}, Ls8/h;->read([BII)I

    move-result p1

    return p1
.end method
