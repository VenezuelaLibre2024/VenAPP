.class final Lqj/v$c;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Ldj/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqj/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lgj/b;",
        ">;",
        "Ldj/l<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x2e204f2d0e121106L


# instance fields
.field final a:Lqj/v$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqj/v$b<",
            "TT;*>;"
        }
    .end annotation
.end field

.field final b:I


# direct methods
.method constructor <init>(Lqj/v$b;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqj/v$b<",
            "TT;*>;I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lqj/v$c;->a:Lqj/v$b;

    iput p2, p0, Lqj/v$c;->b:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lqj/v$c;->a:Lqj/v$b;

    iget v1, p0, Lqj/v$c;->b:I

    invoke-virtual {v0, v1}, Lqj/v$b;->b(I)V

    return-void
.end method

.method public b(Lgj/b;)V
    .locals 0

    invoke-static {p0, p1}, Lkj/b;->o(Ljava/util/concurrent/atomic/AtomicReference;Lgj/b;)Z

    return-void
.end method

.method public c()V
    .locals 0

    invoke-static {p0}, Lkj/b;->b(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lqj/v$c;->a:Lqj/v$b;

    iget v1, p0, Lqj/v$c;->b:I

    invoke-virtual {v0, p1, v1}, Lqj/v$b;->c(Ljava/lang/Throwable;I)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lqj/v$c;->a:Lqj/v$b;

    iget v1, p0, Lqj/v$c;->b:I

    invoke-virtual {v0, p1, v1}, Lqj/v$b;->d(Ljava/lang/Object;I)V

    return-void
.end method
