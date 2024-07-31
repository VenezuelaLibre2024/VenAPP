.class public final Lpj/m;
.super Ldj/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpj/m$b;,
        Lpj/m$c;,
        Lpj/m$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/f<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final b:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "+TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/f;-><init>()V

    iput-object p1, p0, Lpj/m;->b:Ljava/lang/Iterable;

    return-void
.end method

.method public static K(Lim/b;Ljava/util/Iterator;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lim/b<",
            "-TT;>;",
            "Ljava/util/Iterator<",
            "+TT;>;)V"
        }
    .end annotation

    :try_start_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    invoke-static {p0}, Lwj/d;->b(Lim/b;)V

    return-void

    :cond_0
    instance-of v0, p0, Lmj/a;

    if-eqz v0, :cond_1

    new-instance v0, Lpj/m$b;

    move-object v1, p0

    check-cast v1, Lmj/a;

    invoke-direct {v0, v1, p1}, Lpj/m$b;-><init>(Lmj/a;Ljava/util/Iterator;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lpj/m$c;

    invoke-direct {v0, p0, p1}, Lpj/m$c;-><init>(Lim/b;Ljava/util/Iterator;)V

    :goto_0
    invoke-interface {p0, v0}, Lim/b;->d(Lim/c;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-static {p1, p0}, Lwj/d;->h(Ljava/lang/Throwable;Lim/b;)V

    return-void
.end method


# virtual methods
.method public I(Lim/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TT;>;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lpj/m;->b:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p1, v0}, Lpj/m;->K(Lim/b;Ljava/util/Iterator;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Lwj/d;->h(Ljava/lang/Throwable;Lim/b;)V

    return-void
.end method
