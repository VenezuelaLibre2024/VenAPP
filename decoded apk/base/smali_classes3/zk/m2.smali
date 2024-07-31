.class final Lzk/m2;
.super Lzk/c2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lzk/c2;"
    }
.end annotation


# instance fields
.field private final e:Lzk/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzk/n<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzk/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzk/n<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lzk/c2;-><init>()V

    iput-object p1, p0, Lzk/m2;->e:Lzk/n;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lzk/m2;->v(Ljava/lang/Throwable;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 2

    invoke-virtual {p0}, Lzk/c2;->w()Lzk/d2;

    move-result-object p1

    invoke-virtual {p1}, Lzk/d2;->Y()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lzk/a0;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzk/m2;->e:Lzk/n;

    sget-object v1, Lck/n;->b:Lck/n$a;

    check-cast p1, Lzk/a0;

    iget-object p1, p1, Lzk/a0;->a:Ljava/lang/Throwable;

    invoke-static {p1}, Lck/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lzk/m2;->e:Lzk/n;

    sget-object v1, Lck/n;->b:Lck/n$a;

    invoke-static {p1}, Lzk/e2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lck/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lgk/Continuation;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
