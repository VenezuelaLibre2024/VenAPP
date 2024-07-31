.class Lpj/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/q;
.implements Lim/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpj/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ldj/q<",
        "TT;>;",
        "Lim/c;"
    }
.end annotation


# instance fields
.field private final a:Lim/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lim/b<",
            "-TT;>;"
        }
    .end annotation
.end field

.field private b:Lgj/b;


# direct methods
.method constructor <init>(Lim/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpj/n$a;->a:Lim/b;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lpj/n$a;->a:Lim/b;

    invoke-interface {v0}, Lim/b;->a()V

    return-void
.end method

.method public b(Lgj/b;)V
    .locals 0

    iput-object p1, p0, Lpj/n$a;->b:Lgj/b;

    iget-object p1, p0, Lpj/n$a;->a:Lim/b;

    invoke-interface {p1, p0}, Lim/b;->d(Lim/c;)V

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lpj/n$a;->a:Lim/b;

    invoke-interface {v0, p1}, Lim/b;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lpj/n$a;->b:Lgj/b;

    invoke-interface {v0}, Lgj/b;->dispose()V

    return-void
.end method

.method public i(J)V
    .locals 0

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lpj/n$a;->a:Lim/b;

    invoke-interface {v0, p1}, Lim/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
