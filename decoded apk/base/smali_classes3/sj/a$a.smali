.class final Lsj/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsj/a;
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

.field final synthetic b:Lsj/a;


# direct methods
.method constructor <init>(Lsj/a;Ldj/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/t<",
            "-TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lsj/a$a;->b:Lsj/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lsj/a$a;->a:Ldj/t;

    return-void
.end method


# virtual methods
.method public b(Lgj/b;)V
    .locals 1

    iget-object v0, p0, Lsj/a$a;->a:Ldj/t;

    invoke-interface {v0, p1}, Ldj/t;->b(Lgj/b;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lsj/a$a;->b:Lsj/a;

    iget-object v0, v0, Lsj/a;->b:Ljj/d;

    invoke-interface {v0, p1}, Ljj/d;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lhj/b;->b(Ljava/lang/Throwable;)V

    new-instance v1, Lhj/a;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Throwable;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object v0, v2, p1

    invoke-direct {v1, v2}, Lhj/a;-><init>([Ljava/lang/Throwable;)V

    move-object p1, v1

    :goto_0
    iget-object v0, p0, Lsj/a$a;->a:Ldj/t;

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

    iget-object v0, p0, Lsj/a$a;->a:Ldj/t;

    invoke-interface {v0, p1}, Ldj/t;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method
