.class public final Lrj/i;
.super Ldj/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrj/i$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/o<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Ljava/lang/Iterable;
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

    invoke-direct {p0}, Ldj/o;-><init>()V

    iput-object p1, p0, Lrj/i;->a:Ljava/lang/Iterable;

    return-void
.end method


# virtual methods
.method public s(Ldj/q;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/q<",
            "-TT;>;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lrj/i;->a:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    invoke-static {p1}, Lkj/c;->m(Ldj/q;)V

    return-void

    :cond_0
    new-instance v1, Lrj/i$a;

    invoke-direct {v1, p1, v0}, Lrj/i$a;-><init>(Ldj/q;Ljava/util/Iterator;)V

    invoke-interface {p1, v1}, Ldj/q;->b(Lgj/b;)V

    iget-boolean p1, v1, Lrj/i$a;->d:Z

    if-nez p1, :cond_1

    invoke-virtual {v1}, Lrj/i$a;->a()V

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Lkj/c;->p(Ljava/lang/Throwable;Ldj/q;)V

    return-void
.end method
