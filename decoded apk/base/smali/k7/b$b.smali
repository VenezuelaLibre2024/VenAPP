.class public final Lk7/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk7/l$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Leb/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/v<",
            "Landroid/os/HandlerThread;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Leb/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/v<",
            "Landroid/os/HandlerThread;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Z


# direct methods
.method public constructor <init>(IZ)V
    .locals 2

    new-instance v0, Lk7/c;

    invoke-direct {v0, p1}, Lk7/c;-><init>(I)V

    new-instance v1, Lk7/d;

    invoke-direct {v1, p1}, Lk7/d;-><init>(I)V

    invoke-direct {p0, v0, v1, p2}, Lk7/b$b;-><init>(Leb/v;Leb/v;Z)V

    return-void
.end method

.method constructor <init>(Leb/v;Leb/v;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leb/v<",
            "Landroid/os/HandlerThread;",
            ">;",
            "Leb/v<",
            "Landroid/os/HandlerThread;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk7/b$b;->a:Leb/v;

    iput-object p2, p0, Lk7/b$b;->b:Leb/v;

    iput-boolean p3, p0, Lk7/b$b;->c:Z

    return-void
.end method

.method public static synthetic b(I)Landroid/os/HandlerThread;
    .locals 0

    invoke-static {p0}, Lk7/b$b;->e(I)Landroid/os/HandlerThread;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(I)Landroid/os/HandlerThread;
    .locals 0

    invoke-static {p0}, Lk7/b$b;->f(I)Landroid/os/HandlerThread;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic e(I)Landroid/os/HandlerThread;
    .locals 1

    new-instance v0, Landroid/os/HandlerThread;

    invoke-static {p0}, Lk7/b;->r(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private static synthetic f(I)Landroid/os/HandlerThread;
    .locals 1

    new-instance v0, Landroid/os/HandlerThread;

    invoke-static {p0}, Lk7/b;->q(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Lk7/l$a;)Lk7/l;
    .locals 0

    invoke-virtual {p0, p1}, Lk7/b$b;->d(Lk7/l$a;)Lk7/b;

    move-result-object p1

    return-object p1
.end method

.method public d(Lk7/l$a;)Lk7/b;
    .locals 9

    iget-object v0, p1, Lk7/l$a;->a:Lk7/p;

    iget-object v0, v0, Lk7/p;->a:Ljava/lang/String;

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createCodec:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lt8/o0;->a(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    new-instance v2, Lk7/b;

    iget-object v3, p0, Lk7/b$b;->a:Leb/v;

    invoke-interface {v3}, Leb/v;->get()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Landroid/os/HandlerThread;

    iget-object v3, p0, Lk7/b$b;->b:Leb/v;

    invoke-interface {v3}, Leb/v;->get()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Landroid/os/HandlerThread;

    iget-boolean v7, p0, Lk7/b$b;->c:Z

    const/4 v8, 0x0

    move-object v3, v2

    move-object v4, v0

    invoke-direct/range {v3 .. v8}, Lk7/b;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Landroid/os/HandlerThread;ZLk7/b$a;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    invoke-static {}, Lt8/o0;->c()V

    iget-object v1, p1, Lk7/l$a;->b:Landroid/media/MediaFormat;

    iget-object v3, p1, Lk7/l$a;->d:Landroid/view/Surface;

    iget-object v4, p1, Lk7/l$a;->e:Landroid/media/MediaCrypto;

    iget p1, p1, Lk7/l$a;->f:I

    invoke-static {v2, v1, v3, v4, p1}, Lk7/b;->p(Lk7/b;Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v2

    :catch_0
    move-exception p1

    move-object v1, v2

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    move-object v0, v1

    :goto_0
    if-nez v1, :cond_0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lk7/b;->release()V

    :cond_1
    :goto_1
    throw p1
.end method
