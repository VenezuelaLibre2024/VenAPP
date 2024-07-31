.class public final Ls8/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls8/e0$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls8/g0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ls8/e0$e;"
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:Ls8/n;

.field public final c:I

.field private final d:Ls8/l0;

.field private final e:Ls8/g0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls8/g0$a<",
            "+TT;>;"
        }
    .end annotation
.end field

.field private volatile f:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ls8/j;Landroid/net/Uri;ILs8/g0$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls8/j;",
            "Landroid/net/Uri;",
            "I",
            "Ls8/g0$a<",
            "+TT;>;)V"
        }
    .end annotation

    new-instance v0, Ls8/n$b;

    invoke-direct {v0}, Ls8/n$b;-><init>()V

    invoke-virtual {v0, p2}, Ls8/n$b;->i(Landroid/net/Uri;)Ls8/n$b;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ls8/n$b;->b(I)Ls8/n$b;

    move-result-object p2

    invoke-virtual {p2}, Ls8/n$b;->a()Ls8/n;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3, p4}, Ls8/g0;-><init>(Ls8/j;Ls8/n;ILs8/g0$a;)V

    return-void
.end method

.method public constructor <init>(Ls8/j;Ls8/n;ILs8/g0$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls8/j;",
            "Ls8/n;",
            "I",
            "Ls8/g0$a<",
            "+TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ls8/l0;

    invoke-direct {v0, p1}, Ls8/l0;-><init>(Ls8/j;)V

    iput-object v0, p0, Ls8/g0;->d:Ls8/l0;

    iput-object p2, p0, Ls8/g0;->b:Ls8/n;

    iput p3, p0, Ls8/g0;->c:I

    iput-object p4, p0, Ls8/g0;->e:Ls8/g0$a;

    invoke-static {}, Lv7/u;->a()J

    move-result-wide p1

    iput-wide p1, p0, Ls8/g0;->a:J

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Ls8/g0;->d:Ls8/l0;

    invoke-virtual {v0}, Ls8/l0;->h()J

    move-result-wide v0

    return-wide v0
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Ls8/g0;->d:Ls8/l0;

    invoke-virtual {v0}, Ls8/l0;->t()V

    new-instance v0, Ls8/l;

    iget-object v1, p0, Ls8/g0;->d:Ls8/l0;

    iget-object v2, p0, Ls8/g0;->b:Ls8/n;

    invoke-direct {v0, v1, v2}, Ls8/l;-><init>(Ls8/j;Ls8/n;)V

    :try_start_0
    invoke-virtual {v0}, Ls8/l;->b()V

    iget-object v1, p0, Ls8/g0;->d:Ls8/l0;

    invoke-virtual {v1}, Ls8/l0;->getUri()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/Uri;

    iget-object v2, p0, Ls8/g0;->e:Ls8/g0$a;

    invoke-interface {v2, v1, v0}, Ls8/g0$a;->a(Landroid/net/Uri;Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Ls8/g0;->f:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Lt8/r0;->n(Ljava/io/Closeable;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-static {v0}, Lt8/r0;->n(Ljava/io/Closeable;)V

    throw v1
.end method

.method public final c()V
    .locals 0

    return-void
.end method

.method public d()Ljava/util/Map;
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

    iget-object v0, p0, Ls8/g0;->d:Ls8/l0;

    invoke-virtual {v0}, Ls8/l0;->s()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Ls8/g0;->f:Ljava/lang/Object;

    return-object v0
.end method

.method public f()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Ls8/g0;->d:Ls8/l0;

    invoke-virtual {v0}, Ls8/l0;->r()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
