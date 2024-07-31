.class final Lil/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzk/m;
.implements Lzk/b3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lil/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lzk/m<",
        "Lck/v;",
        ">;",
        "Lzk/b3;"
    }
.end annotation


# instance fields
.field public final a:Lzk/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzk/n<",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/Object;

.field final synthetic c:Lil/b;


# direct methods
.method public constructor <init>(Lil/b;Lzk/n;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzk/n<",
            "-",
            "Lck/v;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lil/b$a;->c:Lil/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lil/b$a;->a:Lzk/n;

    iput-object p3, p0, Lil/b$a;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lck/v;Lok/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lck/v;",
            "Lok/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lil/b;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p2

    iget-object v0, p0, Lil/b$a;->c:Lil/b;

    iget-object v1, p0, Lil/b$a;->b:Ljava/lang/Object;

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p2, p0, Lil/b$a;->a:Lzk/n;

    new-instance v0, Lil/b$a$a;

    iget-object v1, p0, Lil/b$a;->c:Lil/b;

    invoke-direct {v0, v1, p0}, Lil/b$a$a;-><init>(Lil/b;Lil/b$a;)V

    invoke-virtual {p2, p1, v0}, Lzk/n;->c(Ljava/lang/Object;Lok/l;)V

    return-void
.end method

.method public b(Lck/v;Ljava/lang/Object;Lok/l;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lck/v;",
            "Ljava/lang/Object;",
            "Lok/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p3, p0, Lil/b$a;->c:Lil/b;

    iget-object v0, p0, Lil/b$a;->a:Lzk/n;

    new-instance v1, Lil/b$a$b;

    invoke-direct {v1, p3, p0}, Lil/b$a$b;-><init>(Lil/b;Lil/b$a;)V

    invoke-virtual {v0, p1, p2, v1}, Lzk/n;->l(Ljava/lang/Object;Ljava/lang/Object;Lok/l;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {}, Lil/b;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p2

    iget-object p3, p0, Lil/b$a;->c:Lil/b;

    iget-object v0, p0, Lil/b$a;->b:Ljava/lang/Object;

    invoke-virtual {p2, p3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;Lok/l;)V
    .locals 0

    check-cast p1, Lck/v;

    invoke-virtual {p0, p1, p2}, Lil/b$a;->a(Lck/v;Lok/l;)V

    return-void
.end method

.method public d(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, Lil/b$a;->a:Lzk/n;

    invoke-virtual {v0, p1}, Lzk/n;->d(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public f(Lel/e0;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lel/e0<",
            "*>;I)V"
        }
    .end annotation

    iget-object v0, p0, Lil/b$a;->a:Lzk/n;

    invoke-virtual {v0, p1, p2}, Lzk/n;->f(Lel/e0;I)V

    return-void
.end method

.method public getContext()Lgk/f;
    .locals 1

    iget-object v0, p0, Lil/b$a;->a:Lzk/n;

    invoke-virtual {v0}, Lzk/n;->getContext()Lgk/f;

    move-result-object v0

    return-object v0
.end method

.method public k(Lok/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lok/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lil/b$a;->a:Lzk/n;

    invoke-virtual {v0, p1}, Lzk/n;->k(Lok/l;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;Ljava/lang/Object;Lok/l;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lck/v;

    invoke-virtual {p0, p1, p2, p3}, Lil/b$a;->b(Lck/v;Ljava/lang/Object;Lok/l;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public o(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lil/b$a;->a:Lzk/n;

    invoke-virtual {v0, p1}, Lzk/n;->o(Ljava/lang/Object;)V

    return-void
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lil/b$a;->a:Lzk/n;

    invoke-virtual {v0, p1}, Lzk/n;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
