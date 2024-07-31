.class public final Ls8/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls8/f0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls8/e0$g;,
        Ls8/e0$d;,
        Ls8/e0$c;,
        Ls8/e0$f;,
        Ls8/e0$b;,
        Ls8/e0$e;,
        Ls8/e0$h;
    }
.end annotation


# static fields
.field public static final d:Ls8/e0$c;

.field public static final e:Ls8/e0$c;

.field public static final f:Ls8/e0$c;

.field public static final g:Ls8/e0$c;


# instance fields
.field private final a:Ljava/util/concurrent/ExecutorService;

.field private b:Ls8/e0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls8/e0$d<",
            "+",
            "Ls8/e0$e;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/io/IOException;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-static {v0, v1, v2}, Ls8/e0;->h(ZJ)Ls8/e0$c;

    move-result-object v0

    sput-object v0, Ls8/e0;->d:Ls8/e0$c;

    const/4 v0, 0x1

    invoke-static {v0, v1, v2}, Ls8/e0;->h(ZJ)Ls8/e0$c;

    move-result-object v0

    sput-object v0, Ls8/e0;->e:Ls8/e0$c;

    new-instance v0, Ls8/e0$c;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v0, v3, v1, v2, v4}, Ls8/e0$c;-><init>(IJLs8/e0$a;)V

    sput-object v0, Ls8/e0;->f:Ls8/e0$c;

    new-instance v0, Ls8/e0$c;

    const/4 v3, 0x3

    invoke-direct {v0, v3, v1, v2, v4}, Ls8/e0$c;-><init>(IJLs8/e0$a;)V

    sput-object v0, Ls8/e0;->g:Ls8/e0$c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ExoPlayer:Loader:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lt8/r0;->D0(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Ls8/e0;->a:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method static synthetic b(Ls8/e0;)Ls8/e0$d;
    .locals 0

    iget-object p0, p0, Ls8/e0;->b:Ls8/e0$d;

    return-object p0
.end method

.method static synthetic c(Ls8/e0;Ls8/e0$d;)Ls8/e0$d;
    .locals 0

    iput-object p1, p0, Ls8/e0;->b:Ls8/e0$d;

    return-object p1
.end method

.method static synthetic d(Ls8/e0;Ljava/io/IOException;)Ljava/io/IOException;
    .locals 0

    iput-object p1, p0, Ls8/e0;->c:Ljava/io/IOException;

    return-object p1
.end method

.method static synthetic e(Ls8/e0;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    iget-object p0, p0, Ls8/e0;->a:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method

.method public static h(ZJ)Ls8/e0$c;
    .locals 2

    new-instance v0, Ls8/e0$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Ls8/e0$c;-><init>(IJLs8/e0$a;)V

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    const/high16 v0, -0x80000000

    invoke-virtual {p0, v0}, Ls8/e0;->k(I)V

    return-void
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, Ls8/e0;->b:Ls8/e0$d;

    invoke-static {v0}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls8/e0$d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ls8/e0$d;->a(Z)V

    return-void
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ls8/e0;->c:Ljava/io/IOException;

    return-void
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Ls8/e0;->c:Ljava/io/IOException;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j()Z
    .locals 1

    iget-object v0, p0, Ls8/e0;->b:Ls8/e0$d;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k(I)V
    .locals 2

    iget-object v0, p0, Ls8/e0;->c:Ljava/io/IOException;

    if-nez v0, :cond_2

    iget-object v0, p0, Ls8/e0;->b:Ls8/e0$d;

    if-eqz v0, :cond_1

    const/high16 v1, -0x80000000

    if-ne p1, v1, :cond_0

    iget p1, v0, Ls8/e0$d;->a:I

    :cond_0
    invoke-virtual {v0, p1}, Ls8/e0$d;->e(I)V

    :cond_1
    return-void

    :cond_2
    throw v0
.end method

.method public l()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ls8/e0;->m(Ls8/e0$f;)V

    return-void
.end method

.method public m(Ls8/e0$f;)V
    .locals 2

    iget-object v0, p0, Ls8/e0;->b:Ls8/e0$d;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ls8/e0$d;->a(Z)V

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Ls8/e0;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ls8/e0$g;

    invoke-direct {v1, p1}, Ls8/e0$g;-><init>(Ls8/e0$f;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    iget-object p1, p0, Ls8/e0;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    return-void
.end method

.method public n(Ls8/e0$e;Ls8/e0$b;I)J
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ls8/e0$e;",
            ">(TT;",
            "Ls8/e0$b<",
            "TT;>;I)J"
        }
    .end annotation

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/os/Looper;

    const/4 v0, 0x0

    iput-object v0, p0, Ls8/e0;->c:Ljava/io/IOException;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v9

    new-instance v0, Ls8/e0$d;

    move-object v1, v0

    move-object v2, p0

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    move-wide v7, v9

    invoke-direct/range {v1 .. v8}, Ls8/e0$d;-><init>(Ls8/e0;Landroid/os/Looper;Ls8/e0$e;Ls8/e0$b;IJ)V

    const-wide/16 p1, 0x0

    invoke-virtual {v0, p1, p2}, Ls8/e0$d;->f(J)V

    return-wide v9
.end method
