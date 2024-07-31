.class final Lzk/n2;
.super Lzk/c2;
.source "SourceFile"


# instance fields
.field private final e:Lgk/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgk/Continuation<",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lgk/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lzk/c2;-><init>()V

    iput-object p1, p0, Lzk/n2;->e:Lgk/Continuation;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lzk/n2;->v(Ljava/lang/Throwable;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lzk/n2;->e:Lgk/Continuation;

    sget-object v0, Lck/n;->b:Lck/n$a;

    sget-object v0, Lck/v;->a:Lck/v;

    invoke-static {v0}, Lck/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lgk/Continuation;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
