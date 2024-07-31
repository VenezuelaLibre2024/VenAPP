.class final Lsj/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsj/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldj/t<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Ldj/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/t<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final synthetic b:Lsj/b;


# direct methods
.method constructor <init>(Lsj/b;Ldj/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/t<",
            "-TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lsj/b$a;->b:Lsj/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lsj/b$a;->a:Ldj/t;

    return-void
.end method


# virtual methods
.method public b(Lgj/b;)V
    .locals 1

    iget-object v0, p0, Lsj/b$a;->a:Ldj/t;

    invoke-interface {v0, p1}, Ldj/t;->b(Lgj/b;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lsj/b$a;->a:Ldj/t;

    invoke-interface {v0, p1}, Ldj/t;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lsj/b$a;->b:Lsj/b;

    iget-object v0, v0, Lsj/b;->b:Ljj/d;

    invoke-interface {v0, p1}, Ljj/d;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lsj/b$a;->a:Ldj/t;

    invoke-interface {v0, p1}, Ldj/t;->onSuccess(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lhj/b;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lsj/b$a;->a:Ldj/t;

    invoke-interface {v0, p1}, Ldj/t;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
