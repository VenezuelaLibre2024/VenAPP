.class public final Lsj/c;
.super Ldj/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/s<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/s;-><init>()V

    iput-object p1, p0, Lsj/c;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method protected k(Ldj/t;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/t<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-static {}, Lgj/c;->a()Lgj/b;

    move-result-object v0

    invoke-interface {p1, v0}, Ldj/t;->b(Lgj/b;)V

    iget-object v0, p0, Lsj/c;->a:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ldj/t;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method
