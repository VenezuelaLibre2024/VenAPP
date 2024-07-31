.class public final Lpj/p;
.super Ldj/f;
.source "SourceFile"

# interfaces
.implements Lmj/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/f<",
        "TT;>;",
        "Lmj/h<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final b:Ljava/lang/Object;
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

    invoke-direct {p0}, Ldj/f;-><init>()V

    iput-object p1, p0, Lpj/p;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method protected I(Lim/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v0, Lwj/e;

    iget-object v1, p0, Lpj/p;->b:Ljava/lang/Object;

    invoke-direct {v0, p1, v1}, Lwj/e;-><init>(Lim/b;Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Lim/b;->d(Lim/c;)V

    return-void
.end method

.method public call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lpj/p;->b:Ljava/lang/Object;

    return-object v0
.end method
