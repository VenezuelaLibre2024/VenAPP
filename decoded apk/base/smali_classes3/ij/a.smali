.class public abstract Lij/a;
.super Ldj/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/f<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ldj/f;-><init>()V

    return-void
.end method


# virtual methods
.method public final K()Lgj/b;
    .locals 1

    new-instance v0, Lxj/e;

    invoke-direct {v0}, Lxj/e;-><init>()V

    invoke-virtual {p0, v0}, Lij/a;->L(Ljj/d;)V

    iget-object v0, v0, Lxj/e;->a:Lgj/b;

    return-object v0
.end method

.method public abstract L(Ljj/d;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/d<",
            "-",
            "Lgj/b;",
            ">;)V"
        }
    .end annotation
.end method
