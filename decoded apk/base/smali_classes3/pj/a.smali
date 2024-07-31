.class abstract Lpj/a;
.super Ldj/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/f<",
        "TR;>;"
    }
.end annotation


# instance fields
.field protected final b:Ldj/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ldj/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/f<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/f;-><init>()V

    const-string v0, "source is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldj/f;

    iput-object p1, p0, Lpj/a;->b:Ldj/f;

    return-void
.end method
